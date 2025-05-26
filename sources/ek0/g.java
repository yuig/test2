package ek0;

import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.n50;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.Collections;
import java.util.List;
import kg.o;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import lr.l;
import m60.t;
import m60.w;
import m7.h0;
import org.greenrobot.eventbus.ThreadMode;
import pk.a0;
import rg0.i0;
import sp2.k;
import x02.c2;
import x02.d2;
import x02.i2;

/* loaded from: classes5.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f59175a;

    public g(h hVar) {
        this.f59175a = hVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEventMainThread(rp.a aVar) {
        final h hVar = this.f59175a;
        hVar.getClass();
        hVar.f59189n = aVar.f109047a;
        if (hVar.f59177b || hVar.f59179d || hVar.r3()) {
            w wVar = hVar.f59192q;
            wVar.i(aVar);
            gp1.b bVar = hVar.f59178c;
            gp1.b bVar2 = gp1.b.CREATE;
            final int i13 = 0;
            if (bVar != bVar2) {
                if (hVar.f59183h == null || !j1.f1(hVar.f59189n)) {
                    hVar.p3();
                    return;
                }
                final f30 f30Var = hVar.f59183h;
                final String str = hVar.f59189n;
                wy0 f13 = ((b60.d) hVar.f59197v).f();
                c2 c2Var = new c2(f30Var.getUid());
                c2Var.f131300e = str;
                c2Var.f131302g = b40.q(f30Var);
                final int i14 = 1;
                c2Var.f131303h = f13 != null && dl2.b.B1(f13);
                c2Var.f131306k = hVar.f59200y.b(f30Var);
                c2Var.f131309n = hVar.f59176J;
                wVar.d(new n50(f30Var, str));
                hVar.f59181f = false;
                hVar.E.a(f30Var, c2Var, new ak2.e() { // from class: ek0.a
                    @Override // ak2.e
                    public final void accept(Object obj) {
                        int i15 = i13;
                        f30 f30Var2 = f30Var;
                        String str2 = str;
                        h hVar2 = hVar;
                        switch (i15) {
                            case 0:
                                f30 f30Var3 = (f30) obj;
                                ((xj0.a) hVar2.f139226a).m(str2, hVar2.f59176J, f30Var2);
                                if (!hVar2.isBound() || hVar2.r3()) {
                                    i0.f108029b.u0(f30Var3.getUid());
                                } else {
                                    v7 D3 = f30Var3.D3();
                                    boolean z13 = (D3 == null || !j1.f1(D3.getUid()) || a0.x0(D3.j1())) ? false : true;
                                    vb0.j.f125466a.S(z13, "Board and relevant fields should not be empty", new Object[0]);
                                    if (z13) {
                                        String m13 = o.m(f30Var3);
                                        com.pinterest.feature.board.create.c cVar = (com.pinterest.feature.board.create.c) hVar2.getView();
                                        l toast = new l(D3.getUid(), D3.j1(), m13, f30Var3.getUid(), hVar2.B);
                                        fk0.k kVar = (fk0.k) cVar;
                                        kVar.getClass();
                                        Intrinsics.checkNotNullParameter(toast, "toast");
                                        i92.k kVar2 = kVar.B0;
                                        if (kVar2 == null) {
                                            Intrinsics.r("toastUtils");
                                            throw null;
                                        }
                                        kVar2.c(toast);
                                    }
                                }
                                hVar2.p3();
                                return;
                            default:
                                ((xj0.a) hVar2.f139226a).m(str2, hVar2.f59176J, f30Var2);
                                hVar2.p3();
                                return;
                        }
                    }
                }, new ak2.e() { // from class: ek0.a
                    @Override // ak2.e
                    public final void accept(Object obj) {
                        int i15 = i14;
                        f30 f30Var2 = f30Var;
                        String str2 = str;
                        h hVar2 = hVar;
                        switch (i15) {
                            case 0:
                                f30 f30Var3 = (f30) obj;
                                ((xj0.a) hVar2.f139226a).m(str2, hVar2.f59176J, f30Var2);
                                if (!hVar2.isBound() || hVar2.r3()) {
                                    i0.f108029b.u0(f30Var3.getUid());
                                } else {
                                    v7 D3 = f30Var3.D3();
                                    boolean z13 = (D3 == null || !j1.f1(D3.getUid()) || a0.x0(D3.j1())) ? false : true;
                                    vb0.j.f125466a.S(z13, "Board and relevant fields should not be empty", new Object[0]);
                                    if (z13) {
                                        String m13 = o.m(f30Var3);
                                        com.pinterest.feature.board.create.c cVar = (com.pinterest.feature.board.create.c) hVar2.getView();
                                        l toast = new l(D3.getUid(), D3.j1(), m13, f30Var3.getUid(), hVar2.B);
                                        fk0.k kVar = (fk0.k) cVar;
                                        kVar.getClass();
                                        Intrinsics.checkNotNullParameter(toast, "toast");
                                        i92.k kVar2 = kVar.B0;
                                        if (kVar2 == null) {
                                            Intrinsics.r("toastUtils");
                                            throw null;
                                        }
                                        kVar2.c(toast);
                                    }
                                }
                                hVar2.p3();
                                return;
                            default:
                                ((xj0.a) hVar2.f139226a).m(str2, hVar2.f59176J, f30Var2);
                                hVar2.p3();
                                return;
                        }
                    }
                });
                return;
            }
            String str2 = hVar.f59189n;
            if (hVar.f59186k == null || bVar != bVar2) {
                return;
            }
            e eVar = new e(hVar, (com.pinterest.feature.board.create.c) hVar.getView(), str2);
            d2 params = new d2();
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            params.f131320a = str2;
            PinnableImage pinnableImage = hVar.f59186k;
            params.f131323d = pinnableImage.f35570g;
            params.f131324e = pinnableImage.f35569f;
            String W = df.j1.W("%d", Long.valueOf(System.currentTimeMillis()));
            Intrinsics.checkNotNullParameter(W, "<set-?>");
            params.f131330k = W;
            i2 i2Var = hVar.f59194s;
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            Intrinsics.checkNotNullParameter(params, "params");
            List paramsList = Collections.singletonList(params);
            Intrinsics.checkNotNullExpressionValue(paramsList, "singletonList(...)");
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            Intrinsics.checkNotNullParameter(paramsList, "paramsList");
            fk2.g gVar = new fk2.g(new h0(paramsList), 0);
            Intrinsics.checkNotNullExpressionValue(gVar, "create(...)");
            gVar.j(eVar);
        }
    }
}
