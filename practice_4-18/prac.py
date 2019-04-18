def get_input():
    user_input = input("Please enter a number:")
    return int(user_input)


def compare_numbers(numOne, numTwo):
    # i = 1
    # while (i < numTwo + 1):
    #     product = numOne * i
    #     print(str(numOne) + " x " + str(i) + " = " + str(product))
    #     i += 1
    for i in range(1, numTwo + 1):
        product = numOne * i
        print(str(numOne) + " x " + str(i) + " = " + str(product))
    print("Done")


def main():
    compare_numbers(get_input(), get_input())


if __name__ == "__main__":
    main()
