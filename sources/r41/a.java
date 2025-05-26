package r41;

/* loaded from: classes5.dex */
public final class a {
    public static b a(int i13) {
        b bVar;
        b[] values = b.values();
        int length = values.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                bVar = null;
                break;
            }
            bVar = values[i14];
            if (bVar.ordinal() == i13) {
                break;
            }
            i14++;
        }
        return bVar == null ? b.Unknown : bVar;
    }
}
