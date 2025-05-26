package androidx.viewpager2.widget;

import a.cb;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.l2;
import java.util.Locale;
import jk2.j1;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import r1.j0;
import w1.z0;

/* loaded from: classes3.dex */
public final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19953a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19954b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19955c;

    public d(LinearLayoutManager linearLayoutManager) {
        this.f19954b = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.k
    public final void a(int i13) {
    }

    @Override // androidx.viewpager2.widget.k
    public final void b(int i13, float f13, int i14) {
        switch (this.f19953a) {
            case 0:
                if (((n) this.f19955c) == null) {
                    return;
                }
                float f14 = -f13;
                int i15 = 0;
                while (true) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f19954b;
                    if (i15 >= linearLayoutManager.E()) {
                        return;
                    }
                    View D = linearLayoutManager.D(i15);
                    if (D == null) {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(cb.j("LayoutManager returned a null child at pos ", i15, "/", linearLayoutManager.E(), " while transforming pages"));
                    }
                    ((n) this.f19955c).x(D, (l2.Z(D) - i13) + f14);
                    i15++;
                }
            default:
                return;
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void c(int i13) {
        switch (this.f19953a) {
            case 0:
                break;
            default:
                lu.n nVar = (lu.n) this.f19954b;
                vt.h hVar = nVar.f84917g;
                if (hVar != null) {
                    View view = (View) this.f19955c;
                    vt.e eVar = hVar.f126599a;
                    eVar.getClass();
                    com.pinterest.framework.multisection.datasource.pagedlist.h hVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.h(5, new j0(i13, 8));
                    uk2.d dVar = eVar.f126588o;
                    dVar.getClass();
                    int i14 = 14;
                    x H = new j1(new x(dVar, hVar2, 2), new ep.a(i14, new j0(i13, 9)), 0).I(1L).A(wj2.c.a()).H(wj2.c.a());
                    Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
                    nVar.f84924n.a(H.F(new zt.b(i14, new z0(nVar, view, hVar, i13, 5)), new zt.b(15, lu.a.f84850q), ck2.i.f27923c, ck2.i.f27924d));
                    break;
                }
                break;
        }
    }

    public d(lu.n nVar, View view) {
        this.f19954b = nVar;
        this.f19955c = view;
    }
}
