package kp0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.z;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g;
import lh0.g1;
import lh0.z3;
import nx.c0;
import nx.d0;
import nx.v;
import ps.p;
import ps.q;
import qa2.f0;
import qa2.h0;
import ti1.o;
import ti1.r;
import uq.w;
import xk2.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class c extends w implements n, v, r, f0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f80571d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f80572e;

    /* renamed from: f, reason: collision with root package name */
    public g f80573f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f80574g;

    /* renamed from: h, reason: collision with root package name */
    public l51.a f80575h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f80576i;

    /* renamed from: j, reason: collision with root package name */
    public final o f80577j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, d0 pinalytics, int i13) {
        super(context, null, 0, 7, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f80571d = 0;
        this.f80572e = null;
        xk2.v b13 = m.b(a.f80569i);
        this.f80576i = b13;
        z r13 = b7.c.r(this);
        o oVar = new o(context, pinalytics, r13 != null ? bf.b.S(r13) : dl2.b.e(), (wa2.m) b13.getValue(), this, null, null, 352);
        this.f80577j = oVar;
        oVar.b();
        h0 a13 = oVar.a().a();
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        this.f80574g = a13;
        int W = bs1.c.W(this, ps.n.ads_qcm_drawer_carousel_item_width);
        int W2 = bs1.c.W(this, ps.n.ads_qcm_drawer_carousel_item_width);
        Intrinsics.checkNotNullExpressionValue(LayoutInflater.from(context).inflate(q.ads_qcm_drawer_carousel_item_view, this), "inflate(...)");
        KeyEvent.Callback callback = this.f80574g;
        Intrinsics.g(callback, "null cannot be cast to non-null type android.view.View");
        ((View) callback).setLayoutParams(new FrameLayout.LayoutParams(W2, W));
        View findViewById = findViewById(p.pinContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        KeyEvent.Callback callback2 = this.f80574g;
        Intrinsics.g(callback2, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((View) callback2);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        frameLayout.setPaddingRelative(i13, i13, i13, i13);
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f80574g;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        Object markImpressionEnd = this.f80577j.markImpressionEnd();
        if (markImpressionEnd instanceof c0) {
            l51.a aVar = this.f80575h;
            if (aVar == null) {
                Intrinsics.r("adsQcmAnalytics");
                throw null;
            }
            aVar.b("STLV3_DRAWER_ITEM_IMPRESSION");
        }
        return markImpressionEnd;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f80577j.markImpressionStart();
    }

    @Override // ti1.r
    public final boolean o() {
        Boolean bool = this.f80572e;
        if (bool != null) {
            return bool.booleanValue();
        }
        g gVar = this.f80573f;
        if (gVar == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) gVar.f83348a;
        return g1Var.o("android_pgc_sba_ads_carousel_pin_item_view", "enabled", z3Var) || g1Var.l("android_pgc_sba_ads_carousel_pin_item_view");
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        o oVar = this.f80577j;
        ti1.e a13 = oVar.a();
        if (a13 instanceof ti1.d) {
            oVar.d(pin, this.f80571d, (wa2.m) this.f80576i.getValue(), b.f80570i);
        } else if (a13 instanceof ti1.c) {
            oVar.setPin(pin, i13);
        }
        if (b40.x(pin) == d40.COMPLETE_HIDDEN) {
            bs1.c.X0(this);
        } else {
            bs1.c.U1(this);
        }
        oVar.c(Integer.valueOf(i13));
    }
}
