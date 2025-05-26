package c71;

import de1.d0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zd1.e0;

/* loaded from: classes5.dex */
public final class s implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f26825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h61.k f26826b;

    public s(t tVar, h61.k kVar) {
        this.f26825a = tVar;
        this.f26826b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x00b0  */
    @Override // de1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G0(java.util.ArrayList r39, int r40, de1.a r41, boolean r42, t32.f r43, zd1.c0 r44) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.s.G0(java.util.ArrayList, int, de1.a, boolean, t32.f, zd1.c0):void");
    }

    @Override // de1.d0
    public final void L(String productFilterType) {
        ArrayList d2;
        de1.f j03;
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        t tVar = this.f26825a;
        e0 J2 = tVar.J2();
        if (J2 == null || (d2 = J2.d(productFilterType)) == null || (j03 = tVar.j0()) == null) {
            return;
        }
        j03.w2(d2);
    }

    @Override // de1.d0
    public final void b5(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        t tVar = this.f26825a;
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
