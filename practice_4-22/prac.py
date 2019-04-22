def compute_list(int_list):
    lrg = int_list[0]
    sml = int_list[0]
    # for i in int_list:
    #     if (i > lrg):
    #         lrg = i
    #     elif (i < sml):
    #         sml = i
    i = 0
    while i < len(int_list):
        if (int_list[i] > lrg):
            lrg = int_list[i]
        elif (int_list[i] < sml):
            sml = int_list[i]
        i += 1
    print(str(lrg - sml))


def main():
    int_list = [0, 2, 3, 4, 7]
    compute_list(int_list)


if __name__ == "__main__":
    main()
