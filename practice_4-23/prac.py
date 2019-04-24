def compute_list(int_list):
    ones = 0
    zeros = 0
    for i in int_list:
        if (i == 1):
            ones += 1
        elif (i == 0):
            zeros += 1
    # i = 0
    # while i < len(int_list):
    #     if int_list[i] == 1:
    #         ones += 1
    #     elif int_list[i] == 0:
    #         zeros += 1
    #     i += 1
    print(ones > zeros)
    return ones > zeros


def main():
    int_list = [0, 1, 1, 4, 7]
    compute_list(int_list)


if __name__ == "__main__":
    main()
