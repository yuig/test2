package df;

/* loaded from: classes.dex */
public final class t {
    public static v a(int i13) {
        int i14;
        v[] valuesCustom = v.valuesCustom();
        int length = valuesCustom.length;
        int i15 = 0;
        while (i15 < length) {
            v vVar = valuesCustom[i15];
            i15++;
            i14 = vVar.code;
            if (i14 == i13) {
                return vVar;
            }
        }
        return v.Unknown;
    }
}
