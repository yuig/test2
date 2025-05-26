package tm2;

/* loaded from: classes2.dex */
public enum d implements zm2.u {
    BYTE(0, 0),
    CHAR(1, 1),
    SHORT(2, 2),
    INT(3, 3),
    LONG(4, 4),
    FLOAT(5, 5),
    DOUBLE(6, 6),
    BOOLEAN(7, 7),
    STRING(8, 8),
    CLASS(9, 9),
    ENUM(10, 10),
    ANNOTATION(11, 11),
    ARRAY(12, 12);

    private static zm2.v internalValueMap = new re2.h(19);
    private final int value;

    d(int i13, int i14) {
        this.value = i14;
    }

    public static d valueOf(int i13) {
        switch (i13) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
