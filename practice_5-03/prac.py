def find_streak(arr):
    longest_streak = []
    current_streak = []
    for n in arr:
        if len(current_streak) == 0 or n in current_streak:
            current_streak.append(n)
            if len(current_streak) > len(longest_streak):
                longest_streak = current_streak
        elif len(current_streak) > len(longest_streak):
            longest_streak = current_streak
            current_streak = []
            current_streak.append(n)
        else:
            current_streak = []
            current_streak.append(n)
    print(format_streak(longest_streak))


def format_streak(arr):
    formatted = []
    if len(arr) > 0:
        formatted.append(arr[0])
        formatted.append(len(arr))
    return formatted


def main():
    # arr = [1, 2, 1, 1, 1, 2, 2, 2, 2]
    # arr = []
    # arr = [1, 2]
    arr = [2, 2, 2, 1, 2]
    find_streak(arr)


if __name__ == "__main__":
    main()
