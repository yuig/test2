package yg2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public static b a(String str) {
        b bVar;
        b[] values = b.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                bVar = null;
                break;
            }
            bVar = values[i13];
            if (Intrinsics.d(bVar.getValue(), str)) {
                break;
            }
            i13++;
        }
        return bVar == null ? b.UNKNOWN : bVar;
    }
}
