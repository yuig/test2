package ka0;

import a41.d0;
import a41.l0;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends ek.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl1.d f78904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(nl1.d dVar, ViewPager viewPager, int i13) {
        super(viewPager, 0);
        this.f78903c = i13;
        this.f78904d = dVar;
    }

    @Override // ek.i, ek.c
    public final void a(ek.e tab) {
        switch (this.f78903c) {
            case 1:
                Intrinsics.checkNotNullParameter(tab, "tab");
                super.a(tab);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                super.a(tab);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(tab, "tab");
                break;
            default:
                super.a(tab);
                break;
        }
    }

    @Override // ek.i, ek.c
    public final void b(ek.e tab) {
        int i13 = this.f78903c;
        nl1.d dVar = this.f78904d;
        switch (i13) {
            case 2:
                super.b(tab);
                com.pinterest.framework.screens.a Z7 = ((a41.r) dVar).Z7();
                com.pinterest.feature.profile.b bVar = Z7 instanceof com.pinterest.feature.profile.b ? (com.pinterest.feature.profile.b) Z7 : null;
                if (bVar != null) {
                    bVar.w();
                    return;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(tab, "tab");
                nl1.d V7 = ((g41.p) dVar).V7();
                if (V7 != null && aa2.b.class.isAssignableFrom(V7.getClass())) {
                    jq.b.w(V7);
                    throw null;
                }
                return;
            default:
                super.b(tab);
                return;
        }
    }

    @Override // ek.i, ek.c
    public final void c(ek.e tab) {
        u32.i iVar;
        u0 u0Var;
        wy0 wy0Var;
        int i13 = this.f78903c;
        nl1.d dVar = this.f78904d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tab, "tab");
                super.c(tab);
                kh2.j.x2((w) ((j) dVar).f78909d0.getValue(), new c(tab.f59128e));
                return;
            case 1:
                Intrinsics.checkNotNullParameter(tab, "tab");
                super.c(tab);
                int i14 = tab.f59128e;
                int i15 = mv0.t.f88408u0;
                ((mv0.t) dVar).b8().w(i14, true);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(tab, "tab");
                super.c(tab);
                l0 l0Var = ((a41.r) dVar).f668t1;
                if (l0Var != null) {
                    int i16 = tab.f59128e;
                    d0 d0Var = (d0) l0Var;
                    boolean z13 = d0Var.R;
                    g0 g0Var = null;
                    p41.b bVar = d0Var.M;
                    ArrayList arrayList = d0Var.L;
                    if (z13) {
                        p41.b bVar2 = (!arrayList.isEmpty() || bVar == null) ? (p41.b) CollectionsKt.U(i16, arrayList) : bVar;
                        d0Var.N = bVar2;
                        d0Var.O = bVar2 != null ? bVar2.f98848e : null;
                    }
                    if (!arrayList.isEmpty() || bVar == null) {
                        bVar = (p41.b) CollectionsKt.U(i16, arrayList);
                    }
                    if (bVar != null && (iVar = bVar.f98848e) != null) {
                        int i17 = a41.v.f689a[iVar.ordinal()];
                        if (i17 == 1) {
                            g0Var = g0.CREATED_TAB;
                        } else if (i17 == 2) {
                            g0Var = g0.SAVED_TAB;
                        } else if (i17 == 3) {
                            g0Var = g0.PINS_TAB;
                        } else if (i17 == 4) {
                            g0Var = g0.BOARDS_TAB;
                        }
                        d0Var.getPinalytics().N(f1.TAP, u0.TAB_CAROUSEL_TAB, g0Var, d0Var.f556a, false);
                    }
                    d0Var.Z3();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(tab, "tab");
                int i18 = tab.f59128e;
                if (i18 == 0) {
                    u0Var = u0.FOLLOWING_PINNERS_BUTTON;
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException(a.a.d("Index: ", i18));
                    }
                    u0Var = u0.FOLLOWING_BOARDS_BUTTON;
                }
                g41.p pVar = (g41.p) dVar;
                pVar.s7().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : pVar.c8(), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                b20.c cVar = pVar.X;
                if (cVar != null) {
                    cVar.w(i18, true);
                }
                if (!com.bumptech.glide.d.G(pVar, "com.pinterest.EXTRAS_KEY_SHOW_COUNT", true) || (wy0Var = (wy0) pVar.A7().O(pVar.c8())) == null) {
                    return;
                }
                g41.p.b8(pVar, wy0Var);
                return;
        }
    }
}
