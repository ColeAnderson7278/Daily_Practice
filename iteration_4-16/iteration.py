def get_input():
    user_input = input("Please enter a number:")
    return int(user_input)


def break_down_input(user_input):
    # new_input = user_input - 1
    # while new_input > 0:
    #     print(
    #         str(user_input - new_input) + " " +
    #         is_factor_of(user_input, (user_input - new_input)))
    #     new_input -= 1
    i = 1
    while (i < user_input):
        print(str(i) + " " + is_factor_of(user_input, i))
        i += 1
    print("Done")


def is_factor_of(user_input, new_input):
    if user_input % new_input == 0:
        return "is a factor of " + str(user_input)
    else:
        return "is not a factor of " + str(user_input)


def main():
    break_down_input(get_input())


if __name__ == "__main__":
    main()
