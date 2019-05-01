def find_sub_square(square):
    values = []
    values.append(sum(square[0][:2] + square[1][:2]))
    values.append(sum(square[0][1:] + square[1][1:]))
    values.append(sum(square[1][:2] + square[2][:2]))
    values.append(sum(square[1][1:] + square[2][1:]))
    print(max(values))


def main():
    square = [[2, 2, 2], [1, 1, 1], [1, 2, 3]]
    find_sub_square(square)


if __name__ == "__main__":
    main()
