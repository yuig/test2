package h61;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class f {
    public static h a(t32.i searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        int i13 = e.f67817a[searchType.ordinal()];
        if (i13 == 1) {
            return h.PINS;
        }
        if (i13 == 2) {
            return h.PRODUCTS;
        }
        if (i13 == 3) {
            return h.VIDEOS;
        }
        if (i13 == 4) {
            return h.BOARDS;
        }
        if (i13 == 5) {
            return h.USERS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static h b(String str) {
        h hVar;
        h[] values = h.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                hVar = null;
                break;
            }
            hVar = values[i13];
            if (z.i(str, hVar.toString(), true)) {
                break;
            }
            i13++;
        }
        return hVar == null ? h.PINS : hVar;
    }
}
