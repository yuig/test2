package ads_mobile_sdk;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sn0 implements wi.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f11169a;

    /* renamed from: b, reason: collision with root package name */
    public final ym0 f11170b;

    /* renamed from: c, reason: collision with root package name */
    public float f11171c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11172d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11173e;

    /* renamed from: f, reason: collision with root package name */
    public float f11174f;

    /* renamed from: g, reason: collision with root package name */
    public float f11175g;

    /* renamed from: h, reason: collision with root package name */
    public mn0 f11176h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11177i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11178j;

    /* renamed from: k, reason: collision with root package name */
    public wi.c0 f11179k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11180l;

    public sn0(j0 uiScope, ym0 webView, float f13, boolean z13) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f11169a = uiScope;
        this.f11170b = webView;
        this.f11171c = f13;
        this.f11172d = z13;
        this.f11173e = new Object();
        this.f11176h = mn0.f8293b;
        this.f11180l = true;
    }

    public final Object a(nm.u uVar, String str, bl2.c cVar) {
        if (uVar == null) {
            uVar = new nm.u();
        }
        uVar.u("action", str);
        Object a13 = this.f11170b.a(uVar, "pubVideoCmd", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // wi.d0
    public final wi.c0 getVideoLifecycleCallbacks() {
        wi.c0 c0Var;
        synchronized (this.f11173e) {
            c0Var = this.f11179k;
        }
        return c0Var;
    }

    public final boolean isMuted() {
        boolean z13;
        synchronized (this.f11173e) {
            z13 = this.f11180l;
        }
        return z13;
    }

    @Override // wi.d0
    public final void pause() {
        j0 j0Var = this.f11169a;
        pn0 block = new pn0(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // wi.d0
    public final void play() {
        j0 j0Var = this.f11169a;
        qn0 block = new qn0(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // wi.d0
    public final void setVideoLifecycleCallbacks(wi.c0 c0Var) {
        synchronized (this.f11173e) {
            this.f11179k = c0Var;
            Unit unit = Unit.f80348a;
        }
    }

    public final void a(float f13, mn0 playbackState, boolean z13, float f14) {
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        synchronized (this.f11173e) {
            try {
                this.f11171c = f13;
                boolean isMuted = isMuted();
                a(z13);
                mn0 mn0Var = this.f11176h;
                this.f11176h = playbackState;
                float f15 = this.f11175g;
                this.f11175g = f14;
                if (Math.abs(f14 - f15) > 1.0E-4f) {
                    this.f11170b.invalidate();
                }
                kotlin.jvm.internal.j.z(this.f11169a, null, null, new nn0(this, mn0Var, playbackState, isMuted, z13, null), 3);
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Object a(wi.e0 e0Var, dl2.d dVar) {
        Unit unit;
        synchronized (this.f11173e) {
            this.f11177i = e0Var.f129937b;
            unit = Unit.f80348a;
        }
        nm.u uVar = new nm.u();
        uVar.u("muteStart", e0Var.f129936a ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        uVar.u("customControlsRequested", e0Var.f129937b ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        uVar.u("clickToExpandRequested", e0Var.f129938c ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        Object a13 = a(uVar, "initialState", dVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : unit;
    }

    public final void a(float f13) {
        synchronized (this.f11173e) {
            this.f11174f = f13;
            Unit unit = Unit.f80348a;
        }
    }

    public final void a(boolean z13) {
        synchronized (this.f11173e) {
            this.f11180l = z13;
            Unit unit = Unit.f80348a;
        }
    }

    public final void a() {
        synchronized (this.f11173e) {
            boolean isMuted = isMuted();
            mn0 mn0Var = this.f11176h;
            mn0 mn0Var2 = mn0.f8296e;
            this.f11176h = mn0Var2;
            kotlin.jvm.internal.j.z(this.f11169a, null, null, new nn0(this, mn0Var, mn0Var2, isMuted, isMuted, null), 3);
            Unit unit = Unit.f80348a;
        }
    }
}
