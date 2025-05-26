package x6;

import androidx.lifecycle.l1;
import g1.p0;

/* loaded from: classes.dex */
public final class e extends l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final d f133923d = new d();

    /* renamed from: b, reason: collision with root package name */
    public final p0 f133924b = new p0();

    /* renamed from: c, reason: collision with root package name */
    public boolean f133925c = false;

    @Override // androidx.lifecycle.l1
    public final void g() {
        p0 p0Var = this.f133924b;
        int k13 = p0Var.k();
        for (int i13 = 0; i13 < k13; i13++) {
            b bVar = (b) p0Var.l(i13);
            y6.b bVar2 = bVar.f133917n;
            bVar2.a();
            bVar2.f137900d = true;
            c cVar = bVar.f133919p;
            if (cVar != null) {
                bVar.j(cVar);
                if (cVar.f133922b) {
                    cVar.f133921a.getClass();
                }
            }
            y6.c cVar2 = bVar2.f137898b;
            if (cVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (cVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            bVar2.f137898b = null;
            if (cVar != null) {
                boolean z13 = cVar.f133922b;
            }
            bVar2.f137901e = true;
            bVar2.f137899c = false;
            bVar2.f137900d = false;
            bVar2.f137902f = false;
        }
        int i14 = p0Var.f63302d;
        Object[] objArr = p0Var.f63301c;
        for (int i15 = 0; i15 < i14; i15++) {
            objArr[i15] = null;
        }
        p0Var.f63302d = 0;
        p0Var.f63299a = false;
    }
}
