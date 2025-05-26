package lu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.ads.feature.owc.view.quiz.QuizAdsBottomSheetBehavior;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import zp.j0;

/* loaded from: classes3.dex */
public final class f extends AdsBrowserBottomSheet implements ft.a, yk1.n, af2.c {
    public static final /* synthetic */ int M = 0;
    public int A;
    public final xk2.v B;
    public final n C;
    public final s D;
    public final v E;
    public final float F;
    public int G;
    public int H;
    public final xj2.b I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f84884J;
    public final QuizAdsBottomSheetBehavior K;
    public final xj2.b L;

    /* renamed from: u, reason: collision with root package name */
    public ye2.o f84885u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f84886v;

    /* renamed from: w, reason: collision with root package name */
    public final nx.f0 f84887w;

    /* renamed from: x, reason: collision with root package name */
    public final uj2.q f84888x;

    /* renamed from: y, reason: collision with root package name */
    public final yk1.j f84889y;

    /* renamed from: z, reason: collision with root package name */
    public q5.j f84890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, vt.e adsQuizManager, boolean z13) {
        super(context, null, 0, z13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        if (!this.f84886v) {
            this.f84886v = true;
            oa oaVar = ((jb) ((g) generatedComponent())).f113483a;
            this.f84887w = (nx.f0) oaVar.f113747j2.get();
            this.f84888x = (uj2.q) oaVar.f113947u9.get();
            this.f84889y = (yk1.j) oaVar.Qc.get();
        }
        this.B = xk2.m.b(new j0(15, this, context));
        this.F = hf0.b.i(bs1.c.k0(context));
        this.H = hf0.b.i(bs1.c.k0(context));
        this.I = new xj2.b();
        this.f84890z = null;
        dl2.b.z(this.f53201c, a.f84843j);
        i().i(a.f84844k);
        LinearLayout linearLayout = this.f53208j;
        linearLayout.setPadding(0, linearLayout.getPaddingTop(), 0, this.f53208j.getPaddingBottom());
        yk1.j jVar = this.f84889y;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        s sVar = new s(context, adsQuizManager, jVar);
        this.D = sVar;
        this.f53202d.addView(sVar);
        yk1.j jVar2 = this.f84889y;
        if (jVar2 == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        v vVar = new v(context, adsQuizManager, jVar2);
        this.E = vVar;
        this.f53202d.addView(vVar);
        yk1.j jVar3 = this.f84889y;
        if (jVar3 == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        n nVar = new n(context, adsQuizManager, jVar3);
        this.C = nVar;
        this.f53202d.addView(nVar);
        yk1.j jVar4 = this.f84889y;
        if (jVar4 == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        nx.f0 pinalyticsFactory = this.f84887w;
        if (pinalyticsFactory == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        uj2.q networkStateStream = this.f84888x;
        if (networkStateStream == null) {
            Intrinsics.r("networkStateStream");
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        vt.b bVar = new vt.b(new uk1.d(pinalyticsFactory), networkStateStream);
        bVar.f126564a = adsQuizManager;
        jVar4.d(this, bVar);
        Intrinsics.checkNotNullParameter(context, "context");
        this.K = new QuizAdsBottomSheetBehavior(context, null, z13);
        this.L = new xj2.b();
    }

    public static final void t0(f fVar, int i13) {
        Context context = fVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!m2.u1(context)) {
            fVar.A = i13;
            fVar.C(i13);
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar, "y", (fVar.F - i13) - 40);
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    @Override // cu.i
    public final void Y() {
        setOnClickListener(new tq.j(this, 10));
        this.K.C((d) this.B.getValue());
    }

    @Override // cu.i
    public final void b() {
        D(4);
        bs1.c.X0(this.f35366r);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84885u == null) {
            this.f84885u = new ye2.o(this);
        }
        return this.f84885u;
    }

    @Override // cu.i
    public final void e() {
        D(3);
        bs1.c.U1(this.f35366r);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    /* renamed from: g */
    public final BaseAdsBottomSheetBehavior getF35368t() {
        return this.K;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84885u == null) {
            this.f84885u = new ye2.o(this);
        }
        return this.f84885u.generatedComponent();
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final int k() {
        return ps.q.ads_closeup_browser_bottom_sheet;
    }

    @Override // cu.i
    public final int m() {
        return this.G;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void o() {
    }

    @Override // cu.i, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.I.dispose();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q5.j jVar = this.f84890z;
        if (jVar != null) {
            jVar.a(event);
        }
        return super.onTouchEvent(event);
    }

    @Override // cu.i
    public final void q() {
        bs1.c.R1(this.f53200b, true);
    }

    @Override // cu.i
    public final void s(String str, String str2, String str3, boolean z13, boolean z14) {
        x();
        n();
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void x() {
        i().i(a.f84848o);
    }

    @Override // cu.i
    public final void z() {
        n();
    }

    public final void z0(b0 b0Var) {
        int i13 = b.f84862a[b0Var.ordinal()];
        v vVar = this.E;
        s sVar = this.D;
        n nVar = this.C;
        if (i13 == 1) {
            bs1.c.X0(nVar);
            bs1.c.X0(sVar);
            bs1.c.X0(vVar);
            bs1.c.U1(nVar);
            return;
        }
        if (i13 == 2) {
            bs1.c.X0(nVar);
            bs1.c.X0(sVar);
            bs1.c.X0(vVar);
            bs1.c.U1(sVar);
            return;
        }
        if (i13 != 3) {
            return;
        }
        bs1.c.X0(nVar);
        bs1.c.X0(sVar);
        bs1.c.X0(vVar);
        bs1.c.U1(vVar);
    }
}
