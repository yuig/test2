package rq;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.zb;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import com.pinterest.settings.SettingsRoundHeaderView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0 extends androidx.recyclerview.widget.o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109423c;

    public o0(int i13, Object obj, Object obj2) {
        this.f109421a = i13;
        this.f109422b = obj;
        this.f109423c = obj2;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        int i14 = this.f109421a;
        Object obj = this.f109422b;
        Object obj2 = this.f109423c;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    tq.n nVar = (tq.n) obj;
                    tq.h hVar = nVar.f118912v;
                    if (hVar != null) {
                        hVar.s2(((PdpCloseupCarouselView) obj2).f35051h);
                    }
                    if (nVar.f118909s != null) {
                        nVar.i().a(new z3.m((PdpCloseupCarouselView) obj2, 29));
                        break;
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i13 == 0) {
                    vm0.c cVar = (vm0.c) obj;
                    vm0.c.a(cVar, (View) obj2, true, cVar.f126205a.f126201d, 24);
                    break;
                } else if (i13 == 1) {
                    vm0.c.a((vm0.c) obj, (View) obj2, false, 0L, 28);
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        ss.b bVar;
        int i15;
        int i16;
        String h43;
        Long f13;
        Long r13;
        m21.a aVar;
        int i17 = this.f109421a;
        Object obj = this.f109423c;
        Object obj2 = this.f109422b;
        switch (i17) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (recyclerView.N == 0 || (bVar = ((p0) obj2).C) == null || (i16 = bVar.f115134f) == (i15 = ((CloseupCarouselView) obj).f35424k)) {
                    return;
                }
                f30 f30Var = bVar.f115132d;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                cc J3 = f30Var.J3();
                if (J3 == null) {
                    J3 = new zb(0).a();
                }
                f30 f30Var2 = bVar.f115132d;
                if (f30Var2 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                e30 R6 = f30Var2.R6();
                zb zbVar = new zb(J3, 0);
                zbVar.f44272c = Integer.valueOf(i15);
                boolean[] zArr = zbVar.f44273d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
                R6.s(zbVar.a());
                f30 a13 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                bVar.f115132d = a13;
                bVar.f115134f = i15;
                bVar.r3(i15);
                p0 p0Var = (p0) ((rs.b) bVar.getView());
                CarouselIndexView carouselIndexView = p0Var.f109456x;
                if (carouselIndexView == null) {
                    Intrinsics.r("indexTrackerView");
                    throw null;
                }
                carouselIndexView.e(i15);
                p0Var.e(i15);
                ArrayList arrayList = bVar.f115133e;
                if (arrayList == null || (aVar = (m21.a) arrayList.get(i15)) == null || (h43 = aVar.k()) == null) {
                    f30 f30Var3 = bVar.f115132d;
                    if (f30Var3 == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    h43 = f30Var3.h4();
                    if (h43 == null) {
                        h43 = "";
                    }
                }
                f30 f30Var4 = bVar.f115132d;
                if (f30Var4 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String uid = f30Var4.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                ArrayList arrayList2 = bVar.f115133e;
                bVar.f115129a.d(new ss.a(h43, uid, (arrayList2 == null || i15 < 0 || i15 >= arrayList2.size()) ? null : ((m21.a) arrayList2.get(i15)).d()));
                nx.d0 d0Var = bVar.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                h32.i0 i0Var = (h32.i0) bVar.f115135g.getValue();
                h32.f1 f1Var = h32.f1.SWIPE;
                f30 f30Var5 = bVar.f115132d;
                if (f30Var5 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String uid2 = f30Var5.getUid();
                ArrayList arrayList3 = bVar.f115133e;
                m21.a aVar2 = arrayList3 != null ? (m21.a) arrayList3.get(bVar.f115134f) : null;
                long j13 = -1;
                Long valueOf = Long.valueOf((aVar2 == null || (r13 = aVar2.r()) == null) ? -1L : r13.longValue());
                if (aVar2 != null && (f13 = aVar2.f()) != null) {
                    j13 = f13.longValue();
                }
                h32.w1 w1Var = new h32.w1(valueOf, Long.valueOf(j13), Short.valueOf((short) i16), aVar2 != null ? aVar2.c() : null, Short.valueOf((short) bVar.f115134f), null);
                Boolean bool = Boolean.FALSE;
                h32.c1 c1Var = new h32.c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, w1Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                HashMap hashMap = new HashMap();
                f30 f30Var6 = bVar.f115132d;
                if (f30Var6 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                hashMap.put("pin_id", f30Var6.getUid());
                Unit unit = Unit.f80348a;
                d0Var.U(i0Var, f1Var, uid2, c1Var, hashMap, false);
                f30 f30Var7 = bVar.f115132d;
                if (f30Var7 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String uid3 = f30Var7.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                bVar.f115130b.b(bVar.f115134f, uid3);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (recyclerView.N == 0 || ((tq.n) obj2).f118912v == null) {
                    return;
                }
                int i18 = ((PdpCloseupCarouselView) obj).f35051h;
                return;
            case 2:
            default:
                return;
            case 3:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (recyclerView.canScrollVertically(-1)) {
                    ((SettingsRoundHeaderView) obj2).setElevation(((Number) ((xa1.l) obj).F0.getValue()).floatValue());
                    return;
                } else {
                    ((SettingsRoundHeaderView) obj2).setElevation(0.0f);
                    return;
                }
        }
    }
}
