def get_string():
    user_input = input("Enter a string:")
    return user_input


def break_down_string(string):
    for c in list(string):
        print(multiply_character(c))


def multiply_character(letter):
    position = get_position(letter)
    new_string = ""
    # while position > 0:
    #     new_string += letter
    #     position -= 1
    for i in range(0, position):
        new_string += letter
        position -= 1
    return new_string


def get_position(letter):
    return ord(letter.lower()) - 96


def main():
    break_down_string(get_string())


if __name__ == "__main__":
    main()
