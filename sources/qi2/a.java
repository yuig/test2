package qi2;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class a extends ri2.d implements d {

    /* renamed from: c */
    public static final Comparator f104004c = Comparator.comparing(new ek0.b(1));

    /* renamed from: d */
    public static final a f104005d = new b().a();

    @Override // qi2.d
    public final Object b(ri2.e eVar) {
        if (eVar == null) {
            return null;
        }
        int i13 = 0;
        while (true) {
            Object[] objArr = this.f108401a;
            if (i13 >= objArr.length) {
                return null;
            }
            if (eVar.equals(objArr[i13])) {
                return objArr[i13 + 1];
            }
            i13 += 2;
        }
    }
}
