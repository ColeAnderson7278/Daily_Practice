def compute_list(str_list):
    new_list = []
    matches = 0
    # for s in str_list:
    #     if s in new_list:
    #         new_list.remove(s)
    #         matches += 1
    #     else:
    #         new_list.append(s)
    for s in str_list:
        new_list.append(s)
        if len(set(new_list)) != len(new_list):
            matches += 1
    # i = 0
    # while i < len(str_list):
    #     if str_list[i] in new_list:
    #         new_list.remove(str_list[i])
    #         matches += 1
    #     else:
    #         new_list.append(str_list[i])
    print(str(matches))


def main():
    str_list = ["a", "b", "c", "b", "b", "a", "a"]
    compute_list(str_list)


if __name__ == "__main__":
    main()
