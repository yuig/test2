package c71;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zd1.e0;

/* loaded from: classes5.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk1.n f26821b;

    public /* synthetic */ q(wk1.n nVar, int i13) {
        this.f26820a = i13;
        this.f26821b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c71.n
    public final void a(h61.k kVar, boolean z13, b0 newSearchParameters, int i13) {
        h61.h hVar = newSearchParameters.f26728a;
        int i14 = this.f26820a;
        wk1.n nVar = this.f26821b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(newSearchParameters, "newSearchParameters");
                z zVar = (z) nVar;
                e0 e0Var = zVar.f26842d;
                int b13 = e0Var != null ? e0Var.b() : 0;
                if (!z13) {
                    if (kVar != 0) {
                        kVar.S4(true);
                    }
                    zVar.Q3(newSearchParameters);
                    zVar.f26844e.c(Integer.valueOf(i13));
                    kh2.j.u2(zVar, b13, zVar.O, true);
                    zVar.x3().clear();
                    zVar.z3().Z();
                    zVar.M3(false, true);
                    break;
                } else if (kVar != 0) {
                    ((nl1.d) kVar).F6(newSearchParameters.b(kh2.j.q2(hVar), Integer.valueOf(b13)));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(newSearchParameters, "newSearchParameters");
                if (!z13) {
                    m mVar = (m) nVar;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(newSearchParameters, "value");
                    boolean z14 = hVar != mVar.f26808v.f26728a;
                    mVar.f26808v = newSearchParameters;
                    if (z14) {
                        mVar.Q3();
                    }
                    mVar.f26791e.c(Integer.valueOf(i13));
                    mVar.H.clear();
                    Iterator<wk1.e> it = mVar.getDataSources().iterator();
                    while (it.hasNext()) {
                        it.next().clear();
                    }
                    mVar.N3(false, true);
                    break;
                } else {
                    e0 e0Var2 = ((m) nVar).f26792f;
                    int b14 = e0Var2 != null ? e0Var2.b() : 0;
                    if (kVar != 0) {
                        ((nl1.d) kVar).F6(newSearchParameters.b(false, Integer.valueOf(b14)));
                        break;
                    }
                }
                break;
        }
    }
}
