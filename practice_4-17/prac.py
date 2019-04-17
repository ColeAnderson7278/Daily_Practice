def get_string():
    user_input = input("Enter a string:")
    return user_input


def compare_strings(str_one, str_two):
    list_one = list(str_one)
    list_two = list(str_two)
    if (len(list_one) > len(list_two)):
        list_one = list(str_two)
        list_two = list(str_one)
    i = 0
    while (i < len(list_one)):
        if (list_one[i] == list_two[i]):
            print(list_one[i])
        else:
            print(".")
        i += 1
    compare_strings_size(len(list_one), len(list_two))


def compare_strings_size(len_one, len_two):
    if (len_one > len_two):
        i = 0
        while (i < len_one - len_two):
            print(".")
            i += 1
    elif (len_two > len_one):
        i = 0
        while (i < len_two - len_one):
            print(".")
            i += 1


def main():
    print(compare_strings(get_string(), get_string()))


if __name__ == "__main__":
    main()
