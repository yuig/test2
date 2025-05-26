package wp;

/* loaded from: classes3.dex */
public enum a {
    TOPIC,
    KLP;

    public static a getType(int i13) {
        if (i13 == 1) {
            return TOPIC;
        }
        if (i13 != 2) {
            return null;
        }
        return KLP;
    }

    public static int getValue(a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            return ordinal != 1 ? 0 : 2;
        }
        return 1;
    }
}
