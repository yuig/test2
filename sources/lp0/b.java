package lp0;

import android.content.Context;
import android.webkit.URLUtil;
import android.widget.RatingBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bu0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.wz;
import com.pinterest.gestalt.text.GestaltText;
import hp0.s;
import hs1.m;
import hs1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mp0.d;
import mp0.e;
import mp0.g;
import nx.d0;
import pk.a0;
import r1.j0;
import sk0.x;
import u50.o0;
import zp.u0;

/* loaded from: classes5.dex */
public final class b extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final d0 f84239d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f84240e;

    /* renamed from: f, reason: collision with root package name */
    public final e f84241f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f84242g;

    public b(d0 pinalytics, s logImpressions, e qcmDrawerAdsMetadataViewFactory) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(logImpressions, "logImpressions");
        Intrinsics.checkNotNullParameter(qcmDrawerAdsMetadataViewFactory, "qcmDrawerAdsMetadataViewFactory");
        this.f84239d = pinalytics;
        this.f84240e = logImpressions;
        this.f84241f = qcmDrawerAdsMetadataViewFactory;
        this.f84242g = new ArrayList();
    }

    public final void C(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        ArrayList arrayList = this.f84242g;
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((f30) it.next()).getUid(), pinUid)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            arrayList.remove(i13);
            p(i13);
        }
    }

    public final void D(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = this.f84242g;
        arrayList.clear();
        arrayList.addAll(items);
        h();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f84242g.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        String Z2;
        ln e03;
        o0 e13;
        bu0 bu0Var;
        String k13;
        g holder = (g) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        f30 pin = (f30) this.f84242g.get(i13);
        Intrinsics.checkNotNullParameter(pin, "pin");
        d dVar = holder.f87918u;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        dVar.f87915t = pin;
        wy0 a63 = pin.a6();
        String str = null;
        if (a63 == null || (Z2 = a63.Z2()) == null) {
            wy0 I5 = pin.I5();
            Z2 = I5 != null ? I5.Z2() : null;
        }
        kl0.c cVar = new kl0.c(Z2, 17);
        GestaltText gestaltText = dVar.f87909n;
        gestaltText.i(cVar);
        int i14 = 1;
        a0.n(gestaltText, new mp0.c(dVar, i14));
        u0 u0Var = new u0(6, pin);
        GestaltText gestaltText2 = dVar.f87910o;
        gestaltText2.i(u0Var);
        a0.n(gestaltText2, new x(22, dVar, pin));
        wz j13 = po1.c.j(pin);
        if (j13 != null && (e13 = po1.c.e(j13, eo1.b.sema_color_text_subtle, eo1.b.color_text_default, null)) != null) {
            vu.d dVar2 = new vu.d(e13, i14);
            GestaltText gestaltText3 = dVar.f87911p;
            gestaltText3.i(dVar2);
            a0.n(gestaltText3, new mp0.c(dVar, r3));
            com.pinterest.api.model.g t33 = pin.t3();
            List N = t33 != null ? t33.N() : null;
            List list = N;
            if (list == null || list.isEmpty()) {
                bu0Var = null;
            } else {
                Intrinsics.f(N);
                bu0Var = (bu0) CollectionsKt.firstOrNull(N);
            }
            if (bu0Var != null && (k13 = bu0Var.k()) != null) {
                if (URLUtil.isValidUrl(k13)) {
                    mp0.b bVar = new mp0.b(r3, dVar, bu0Var);
                    q qVar = dVar.f87903h;
                    if (qVar == null) {
                        Intrinsics.r("imageCache");
                        throw null;
                    }
                    ((m) qVar).k(k13, new androidx.appcompat.widget.q(bVar, r3), null, null);
                } else {
                    dVar.T(bu0Var);
                }
            }
        }
        Integer V = b40.V(pin);
        r3 = V != null ? V.intValue() : 0;
        if (r3 > 0) {
            RatingBar ratingBar = dVar.f87912q;
            bs1.c.U1(ratingBar);
            if (ratingBar != null) {
                ratingBar.setRating(b40.W(pin));
            }
            GestaltText gestaltText4 = dVar.f87908m;
            bs1.c.U1(gestaltText4);
            gestaltText4.i(new j0(r3, 23));
        }
        com.pinterest.api.model.g t34 = pin.t3();
        if (t34 != null && (e03 = t34.e0()) != null) {
            str = e03.j();
        }
        dVar.f87914s.d(new kl0.c(str, 16));
        dVar.f87916u = i13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f84241f.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        d0 pinalytics = this.f84239d;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Function0 logImpressions = this.f84240e;
        Intrinsics.checkNotNullParameter(logImpressions, "logImpressions");
        return new g(new d(context, pinalytics, logImpressions));
    }
}
