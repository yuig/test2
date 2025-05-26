package gi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, String m13, Exception e13) {
        super(m13, e13);
        if (i13 == 6) {
            Intrinsics.checkNotNullParameter(m13, "m");
            Intrinsics.checkNotNullParameter(e13, "e");
            super(m13, e13);
        } else if (i13 == 7) {
            Intrinsics.checkNotNullParameter(m13, "m");
            Intrinsics.checkNotNullParameter(e13, "e");
            super(m13, e13);
        } else if (i13 != 8) {
            Intrinsics.checkNotNullParameter(m13, "m");
            Intrinsics.checkNotNullParameter(e13, "e");
        } else {
            Intrinsics.checkNotNullParameter(m13, "m");
            Intrinsics.checkNotNullParameter(e13, "e");
            super(m13, e13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String errorMessage, int i13) {
        super(errorMessage);
        if (i13 == 3) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            super(errorMessage);
        } else if (i13 != 4) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        } else {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            super(errorMessage);
        }
    }
}
