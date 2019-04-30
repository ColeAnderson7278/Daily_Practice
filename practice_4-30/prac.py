def find_a(repeated, amount, answer):
    if len(repeated) > 0:
        a = amount // len(repeated) * repeated.count("a")
        a += repeated[:amount % len(repeated)].count("a")
    else:
        a = repeated.count("a")
    print(a == answer)


def main():
    find_a("ab", 0, 0)
    find_a("", 1, 0)
    find_a("ab", 1, 1)
    find_a("ab", 5, 3)
    find_a("a", 50, 50)
    find_a("ab", 60, 30)
    find_a("aba", 5, 3)
    find_a("abbbaba", 10, 4)
    find_a("abbbaba", 4, 1)
    find_a("c", 10, 0)
    find_a("A", 50, 0)


if __name__ == "__main__":
    main()
