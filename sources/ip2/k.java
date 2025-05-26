package ip2;

/* loaded from: classes4.dex */
public enum k {
    BOOL_VALUE(3),
    INT_VALUE(4),
    FLOAT_VALUE(5),
    STRING_VALUE(6),
    BYTES_VALUE(7),
    VALUE_NOT_SET(0);

    private final int value;

    k(int i13) {
        this.value = i13;
    }

    public static k forNumber(int i13) {
        if (i13 == 0) {
            return VALUE_NOT_SET;
        }
        if (i13 == 3) {
            return BOOL_VALUE;
        }
        if (i13 == 4) {
            return INT_VALUE;
        }
        if (i13 == 5) {
            return FLOAT_VALUE;
        }
        if (i13 == 6) {
            return STRING_VALUE;
        }
        if (i13 != 7) {
            return null;
        }
        return BYTES_VALUE;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static k valueOf(int i13) {
        return forNumber(i13);
    }
}
