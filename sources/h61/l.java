package h61;

import kotlin.text.z;

/* loaded from: classes5.dex */
public final class l {
    public static n a(String str) {
        n nVar;
        n[] values = n.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                nVar = null;
                break;
            }
            nVar = values[i13];
            if (z.i(str, nVar.toString(), true)) {
                break;
            }
            i13++;
        }
        return nVar == null ? n.EXPLORE : nVar;
    }
}
