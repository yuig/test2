package tm2;

/* loaded from: classes2.dex */
public enum b0 implements zm2.u {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static zm2.v internalValueMap = new re2.h(20);
    private final int value;

    b0(int i13, int i14) {
        this.value = i14;
    }

    public static b0 valueOf(int i13) {
        if (i13 == 0) {
            return DECLARATION;
        }
        if (i13 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i13 == 2) {
            return DELEGATION;
        }
        if (i13 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
