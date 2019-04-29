def find_owed(items, index, money):
    shared_total = 0
    # for i in range(0, len(items)):
    #     if (i != index):
    #         shared_total += items[i]
    i = 0
    while i < len(items):
        if i != index:
            shared_total += items[i]
        i += 1
    owed = shared_total / 2
    print(str(money - owed))


def main():
    # items = [9.5, 11.75, 18.5, 3, 3]
    # index = 0
    # money = 30
    # items = [3, 4]
    # index = 1
    # money = 4
    # items = [1]
    # index = 0
    # money = 4
    items = [9.5, 11.75, 18.5, 3, 3]
    index = 2
    money = 0
    find_owed(items, index, money)


if __name__ == "__main__":
    main()
