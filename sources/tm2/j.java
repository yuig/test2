package tm2;

/* loaded from: classes2.dex */
public enum j implements zm2.u {
    CLASS(0, 0),
    INTERFACE(1, 1),
    ENUM_CLASS(2, 2),
    ENUM_ENTRY(3, 3),
    ANNOTATION_CLASS(4, 4),
    OBJECT(5, 5),
    COMPANION_OBJECT(6, 6);

    private static zm2.v internalValueMap = new re2.f(20);
    private final int value;

    j(int i13, int i14) {
        this.value = i14;
    }

    public static j valueOf(int i13) {
        switch (i13) {
            case 0:
                return CLASS;
            case 1:
                return INTERFACE;
            case 2:
                return ENUM_CLASS;
            case 3:
                return ENUM_ENTRY;
            case 4:
                return ANNOTATION_CLASS;
            case 5:
                return OBJECT;
            case 6:
                return COMPANION_OBJECT;
            default:
                return null;
        }
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
