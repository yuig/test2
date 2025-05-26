package c71;

import de1.d0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zd1.e0;

/* loaded from: classes5.dex */
public final class r implements d0, n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f26822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f26823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h61.k f26824c;

    public r(h61.k kVar, q qVar, t tVar) {
        this.f26823b = tVar;
        this.f26824c = kVar;
        this.f26822a = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0090, code lost:
    
        if (r8 != 4) goto L27;
     */
    @Override // de1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G0(java.util.ArrayList r33, int r34, de1.a r35, boolean r36, t32.f r37, zd1.c0 r38) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.r.G0(java.util.ArrayList, int, de1.a, boolean, t32.f, zd1.c0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // de1.d0
    public final void L(String productFilterType) {
        ArrayList d2;
        de1.f j03;
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        t tVar = this.f26823b;
        e0 J2 = tVar.J2();
        if (J2 == null || (d2 = J2.d(productFilterType)) == null || !((yk1.b) tVar).isBound() || (j03 = tVar.j0()) == null) {
            return;
        }
        j03.w2(d2);
    }

    @Override // c71.n
    public final void a(h61.k kVar, boolean z13, b0 newSearchParameters, int i13) {
        Intrinsics.checkNotNullParameter(newSearchParameters, "newSearchParameters");
        this.f26822a.a(kVar, z13, newSearchParameters, i13);
    }

    @Override // de1.d0
    public final void b5(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        t tVar = this.f26823b;
        e0 J2 = tVar.J2();
        if (J2 != null) {
            J2.g(productFilterType);
        }
        Integer O = ph.a.O(Integer.valueOf(Integer.parseInt(productFilterType)));
        if (O != null) {
            tVar.O1().remove(Integer.valueOf(O.intValue()));
        }
    }
}
