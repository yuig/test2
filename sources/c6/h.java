package c6;

/* loaded from: classes.dex */
public enum h {
    BOOLEAN(1),
    FLOAT(2),
    INTEGER(3),
    LONG(4),
    STRING(5),
    STRING_SET(6),
    DOUBLE(7),
    VALUE_NOT_SET(0);

    private final int value;

    h(int i13) {
        this.value = i13;
    }

    public static h forNumber(int i13) {
        switch (i13) {
            case 0:
                return VALUE_NOT_SET;
            case 1:
                return BOOLEAN;
            case 2:
                return FLOAT;
            case 3:
                return INTEGER;
            case 4:
                return LONG;
            case 5:
                return STRING;
            case 6:
                return STRING_SET;
            case 7:
                return DOUBLE;
            default:
                return null;
        }
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static h valueOf(int i13) {
        return forNumber(i13);
    }
}
