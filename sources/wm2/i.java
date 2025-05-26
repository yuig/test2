package wm2;

import zm2.u;
import zm2.v;

/* loaded from: classes2.dex */
public enum i implements u {
    NONE(0, 0),
    INTERNAL_TO_CLASS_ID(1, 1),
    DESC_TO_CLASS_ID(2, 2);

    private static v internalValueMap = new re2.f(26);
    private final int value;

    i(int i13, int i14) {
        this.value = i14;
    }

    public static i valueOf(int i13) {
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return INTERNAL_TO_CLASS_ID;
        }
        if (i13 != 2) {
            return null;
        }
        return DESC_TO_CLASS_ID;
    }

    @Override // zm2.u
    public final int getNumber() {
        return this.value;
    }
}
