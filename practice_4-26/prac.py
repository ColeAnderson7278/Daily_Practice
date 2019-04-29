def can_make_note(note, mag):
    note = list(note.replace(" ", ""))
    mag = list(mag.replace(" ", ""))
    for c in note:
        if c in mag:
            mag.remove(c)
        else:
            return False
    return True


def main():
    note = "He old"
    mag = "Hllo World"
    print(str(can_make_note(note, mag)))


if __name__ == "__main__":
    main()
