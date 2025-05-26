package cn;

/* loaded from: classes3.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    b(int[] iArr, int i13) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i13;
    }

    public static b forBits(int i13) {
        if (i13 == 0) {
            return TERMINATOR;
        }
        if (i13 == 1) {
            return NUMERIC;
        }
        if (i13 == 2) {
            return ALPHANUMERIC;
        }
        if (i13 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i13 == 4) {
            return BYTE;
        }
        if (i13 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i13 == 7) {
            return ECI;
        }
        if (i13 == 8) {
            return KANJI;
        }
        if (i13 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i13 == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }

    public int getCharacterCountBits(c cVar) {
        int i13 = cVar.f28036a;
        return this.characterCountBitsForVersions[i13 <= 9 ? (char) 0 : i13 <= 26 ? (char) 1 : (char) 2];
    }
}
