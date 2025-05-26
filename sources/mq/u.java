package mq;

import ac2.o1;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import ao2.v0;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import ey.o4;
import h32.a4;
import h32.d4;
import h32.f1;
import i32.y0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import x02.i2;
import zp.n0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0007\bB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lmq/u;", "Lkr/a;", "Lkq/c;", "Lml1/q;", "Lcb2/e;", "<init>", "()V", "g4/u", "mq/c", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class u extends a<kq.c> implements cb2.e {
    public static final /* synthetic */ int P0 = 0;
    public se2.a A0;
    public se2.a B0;
    public se2.a C0;
    public rg0.s D0;
    public nx.b0 E0;
    public is1.h F0;
    public se2.a G0;
    public final xk2.v I0;
    public final h80.h M0;
    public final r O0;

    /* renamed from: g0, reason: collision with root package name */
    public PinFeed f88019g0;

    /* renamed from: j0, reason: collision with root package name */
    public is1.x f88022j0;

    /* renamed from: k0, reason: collision with root package name */
    public is1.z f88023k0;

    /* renamed from: l0, reason: collision with root package name */
    public String f88024l0;

    /* renamed from: m0, reason: collision with root package name */
    public String f88025m0;

    /* renamed from: n0, reason: collision with root package name */
    public String f88026n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f88027o0;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f88028p0;

    /* renamed from: q0, reason: collision with root package name */
    public Boolean f88029q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f88030r0;

    /* renamed from: s0, reason: collision with root package name */
    public TrackingParamKeyBuilder f88031s0;

    /* renamed from: t0, reason: collision with root package name */
    public c f88032t0;

    /* renamed from: w0, reason: collision with root package name */
    public i2 f88035w0;

    /* renamed from: x0, reason: collision with root package name */
    public se2.a f88036x0;

    /* renamed from: y0, reason: collision with root package name */
    public wk2.a f88037y0;

    /* renamed from: z0, reason: collision with root package name */
    public lh0.a0 f88038z0;

    /* renamed from: h0, reason: collision with root package name */
    public String f88020h0 = "";

    /* renamed from: i0, reason: collision with root package name */
    public String f88021i0 = "";

    /* renamed from: u0, reason: collision with root package name */
    public final xj2.b f88033u0 = new xj2.b();

    /* renamed from: v0, reason: collision with root package name */
    public final Handler f88034v0 = new Handler(Looper.getMainLooper());
    public final xk2.v H0 = xk2.m.b(new j(this, 0));
    public final g J0 = new g(this);
    public final e K0 = new e(this);
    public final com.airbnb.lottie.k L0 = new com.airbnb.lottie.k(this, 24);
    public final d4 N0 = d4.PIN_SWIPE_CONTAINER;

    public u() {
        int i13 = 1;
        this.I0 = xk2.m.b(new j(this, i13));
        this.M0 = new h80.h(this, i13);
        this.S = false;
        this.O0 = new r(this);
    }

    public static final void b8(u uVar, f30 f30Var) {
        f30 H4;
        kq.c cVar = (kq.c) uVar.Y;
        if (cVar != null) {
            ComponentCallbacks r13 = cVar.r();
            String str = null;
            j0 j0Var = r13 instanceof j0 ? (j0) r13 : null;
            if (j0Var != null && (H4 = j0Var.H4()) != null) {
                str = H4.getUid();
            }
            if (Intrinsics.d(str, f30Var.getUid())) {
                uVar.P7();
            } else {
                cVar.g();
            }
        }
    }

    public static final void c8(u uVar, f30 f30Var) {
        nx.b0 b0Var = uVar.E0;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        uVar.s7().g(f1.PIN_SCREENSHOT, f30Var.getUid(), b0Var.m(f30Var), true);
        rg0.s sVar = uVar.D0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        y0 y0Var = y0.ANDROID_PIN_CLOSEUP_AFTER_SCREENSHOT;
        if (((dh0.d) sVar).c(y0Var) == null || ur0.g.g(y0Var, uVar, null) == null) {
            se2.a aVar = uVar.C0;
            if (aVar != null) {
                ((a11.q) ((bf2.b) aVar).get()).a(f30Var);
            } else {
                Intrinsics.r("closeupSendShareUtils");
                throw null;
            }
        }
    }

    @Override // kr.a, nl1.d
    public final void K7() {
        super.K7();
        if (i8()) {
            kq.c cVar = (kq.c) this.Y;
            if (cVar != null) {
                int i13 = cVar.f77530g;
                d8(i13);
                d8(i13 - 1);
                d8(i13 + 1);
            }
        } else {
            if (h8()) {
                tb0.h b63 = b6();
                boolean z13 = this.Y != null;
                boolean isResumed = isResumed();
                kq.c cVar2 = (kq.c) this.Y;
                Integer valueOf = cVar2 != null ? Integer.valueOf(cVar2.f77529f.size()) : null;
                PinFeed pinFeed = this.f88019g0;
                Integer valueOf2 = pinFeed != null ? Integer.valueOf(pinFeed.n()) : null;
                PinFeed pinFeed2 = this.f88019g0;
                a11.w.b(b63, z13, isResumed, valueOf, valueOf2, pinFeed2 != null ? Integer.valueOf(pinFeed2.l()) : null);
            } else {
                b6().s("viewAdapterExists", String.valueOf(this.Y != null));
                b6().s("isResumed", String.valueOf(isResumed()));
                kq.c cVar3 = (kq.c) this.Y;
                if (cVar3 != null) {
                    b6().s("viewAdapterCount", String.valueOf(cVar3.f77529f.size()));
                    PinFeed pinFeed3 = this.f88019g0;
                    if (pinFeed3 != null) {
                        b6().s("pinFeedCount", String.valueOf(pinFeed3.n()));
                        b6().s("pinFeedAbsCount", String.valueOf(pinFeed3.l()));
                    }
                }
            }
            P7();
        }
        Context context = getContext();
        int i14 = (context == null || !pk.a0.G0(context, "android.permission.READ_EXTERNAL_STORAGE")) ? 0 : 1;
        ny1.f fVar = ny1.f.f92666f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        boolean a13 = fVar.a(requireContext);
        if (i14 != 0 || a13) {
            f7().h(this.O0);
            StringBuilder sb3 = new StringBuilder();
            if (h8()) {
                androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                ko2.f fVar2 = v0.f20219a;
                kotlin.jvm.internal.j.z(S, ko2.e.f80326c, null, new m(sb3, this, null), 2);
            } else {
                fk2.g gVar = new fk2.g(new dp.a(5, sb3, this), 3);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                uj2.a0 a0Var = tk2.e.f118017c;
                ek2.f i15 = gVar.m(5L, timeUnit, a0Var).l(a0Var).h(wj2.c.a()).i(new fp.a(3, sb3, this), new n0(16, d.f87963k));
                Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
                R6(i15);
            }
        }
        if (g8().P()) {
            int i16 = Build.VERSION.SDK_INT >= 34 ? 1 : 0;
            tb0.h b64 = b6();
            tb0.k kVar = new tb0.k();
            Intrinsics.checkNotNullExpressionValue("screen", "LOGGING_SCREEN_KEY");
            kVar.c("screen", this.N0.toString());
            Intrinsics.checkNotNullExpressionValue("canObserveScreenshots", "LOGGING_CAN_OBSERVE_KEY");
            kVar.c("canObserveScreenshots", String.valueOf(a13 ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue("hasReadStoragePermission", "LOGGING_READ_STORAGE_PERMISSION_KEY");
            kVar.c("hasReadStoragePermission", String.valueOf(i14));
            Intrinsics.checkNotNullExpressionValue("hasFullGalleryPermissions", "LOGGING_FULL_GALLERY_PERMISSION_KEY");
            kVar.c("hasFullGalleryPermissions", String.valueOf(a13 ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue("supportsDetectScreenCapturePermission", "LOGGING_SUPPORTS_DETECT_SCREENCAPTURE_KEY");
            kVar.c("supportsDetectScreenCapturePermission", String.valueOf(i16));
            b64.k("screenshot_eligibility_log", kVar.f117102a);
        }
    }

    @Override // kr.a, nl1.d
    public final void L7() {
        jr.a aVar;
        is1.x xVar = this.f88022j0;
        if (xVar != null) {
            xVar.b();
        }
        is1.z zVar = this.f88023k0;
        if (zVar != null) {
            zVar.b();
        }
        if (i8() && (aVar = this.Y) != null) {
            int i13 = ((kq.c) aVar).f77530g;
            e8(i13);
            e8(i13 - 1);
            e8(i13 + 1);
        }
        f7().j(this.O0);
        super.L7();
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        if (i13 != 24 && i13 != 25) {
            return false;
        }
        kq.c cVar = (kq.c) this.Y;
        Fragment r13 = cVar != null ? cVar.r() : null;
        nl1.d dVar = r13 instanceof nl1.d ? (nl1.d) r13 : null;
        if (dVar == null) {
            return false;
        }
        dVar.N7(i13, keyEvent);
        return false;
    }

    @Override // nl1.d
    public final void Q7(boolean z13) {
        this.f80757a0 = true;
        super.Q7(z13);
        this.f80757a0 = false;
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        PinFeed pinFeed = navigation != null ? (PinFeed) navigation.i0("com.pinterest.EXTRA_FEED") : null;
        if (pinFeed != null) {
            this.f88019g0 = pinFeed;
        }
        if (navigation != null) {
            String f49940b = navigation.getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
            this.f88020h0 = f49940b;
            this.f88024l0 = navigation.v0("com.pinterest.EXTRA_SOURCE_QUERY");
            Parcelable b23 = navigation.b2("com.pinterest.TRACKING_PARAMETER_BUILDER");
            Intrinsics.g(b23, "null cannot be cast to non-null type com.pinterest.analytics.TrackingParamKeyBuilder");
            this.f88031s0 = (TrackingParamKeyBuilder) b23;
            d4 f49944f = navigation.getF49944f();
            if (f49944f != null) {
                f49944f.value();
            }
            this.f88025m0 = navigation.v0("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE");
            this.f88026n0 = navigation.v0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE");
            this.f88027o0 = navigation.J1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE_DEPTH");
            this.f88028p0 = navigation.M("com.pinterest.EXTRA_CONTEXT_PIN_IDS");
            this.f88029q0 = Boolean.valueOf(navigation.S("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", true));
            this.f88030r0 = navigation.v0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE");
        }
    }

    @Override // kr.a
    public final LockableViewPager W7(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(n80.c.content_pager_vw);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (LockableViewPager) findViewById;
    }

    @Override // cb2.e
    public final String X() {
        return "";
    }

    @Override // kr.a
    public final void X7(LockableViewPager viewPager, Context context) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = eo1.b.color_background_default;
        Object obj = d5.a.f53679a;
        viewPager.setBackgroundColor(context.getColor(i13));
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    public final void d8(int i13) {
        kq.c cVar = (kq.c) this.Y;
        Object u13 = cVar != null ? cVar.u(i13) : null;
        if (u13 instanceof b11.e) {
            ((PinCloseupFragment) ((b11.e) u13)).f46988f2 = true;
        }
        if (u13 instanceof ac2.o) {
            ((o1) B7()).j((ac2.o) u13);
        }
    }

    @Override // kr.a, ml1.q
    public final void e3() {
        if (h8()) {
            kq.c cVar = (kq.c) this.Y;
            if (cVar != null) {
                cVar.O(new j(this, 2));
                return;
            }
            return;
        }
        if (i8()) {
            kq.c cVar2 = (kq.c) this.Y;
            Fragment r13 = cVar2 != null ? cVar2.r() : null;
            ml1.q qVar = r13 instanceof ml1.q ? (ml1.q) r13 : null;
            if (qVar != null) {
                qVar.e3();
                Navigation navigation = this.I;
                if (navigation != null) {
                    String f49940b = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
                    new jy.j(f49940b).i();
                    String f49940b2 = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b2, "getId(...)");
                    new jy.u(f49940b2).i();
                    String f49940b3 = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b3, "getId(...)");
                    new jy.u(f49940b3).i();
                    String f49940b4 = navigation.getF49940b();
                    Intrinsics.checkNotNullExpressionValue(f49940b4, "getId(...)");
                    new o4(f49940b4).i();
                }
            }
        }
    }

    public final void e8(int i13) {
        kq.c cVar = (kq.c) this.Y;
        ComponentCallbacks u13 = cVar != null ? cVar.u(i13) : null;
        if (u13 instanceof ac2.o) {
            ((o1) B7()).l((ac2.o) u13);
        }
    }

    public final String f8() {
        kq.c cVar = (kq.c) this.Y;
        if (cVar != null) {
            ScreenDescription screenDescription = (ScreenDescription) CollectionsKt.U(cVar.f77530g, cVar.f77529f);
            if (screenDescription != null) {
                Navigation navigation = (Navigation) screenDescription.getF49207c().getParcelable("NAVIGATION_MODEL_BUNDLE_KEY");
                String f49940b = navigation != null ? navigation.getF49940b() : null;
                if (f49940b != null) {
                    return f49940b;
                }
            }
        }
        return this.f88020h0;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        if (i8()) {
            kq.c cVar = (kq.c) this.Y;
            Fragment r13 = cVar != null ? cVar.r() : null;
            if (r13 instanceof nl1.d) {
                if (h8()) {
                    kq.c cVar2 = (kq.c) this.Y;
                    if (cVar2 != null) {
                        cVar2.K(r13);
                    }
                } else {
                    kq.c cVar3 = (kq.c) this.Y;
                    if (cVar3 != null) {
                        int size = cVar3.f77529f.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ComponentCallbacks v13 = cVar3.v(i13);
                            if ((v13 instanceof b11.h) && v13 != r13) {
                                ((PinCloseupFragment) ((b11.h) v13)).H9();
                            }
                        }
                    }
                }
                if (((nl1.d) r13).getF103154e0()) {
                    return true;
                }
                nl1.d.J7();
                return false;
            }
        }
        nl1.d.J7();
        return false;
    }

    public final lh0.a0 g8() {
        lh0.a0 a0Var = this.f88038z0;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // cb2.e
    public final f30 getPin() {
        return null;
    }

    @Override // kr.a, uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF143270o0() {
        Navigation navigation = this.I;
        if (navigation == null || !navigation.w("com.pinterest.EXTRA_VIEW_PARAMETER_TYPE")) {
            return null;
        }
        String g23 = navigation.g2("com.pinterest.EXTRA_VIEW_PARAMETER_TYPE", "");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        if (g23.length() > 0) {
            return a4.valueOf(g23);
        }
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF121736h0() {
        return this.N0;
    }

    public final boolean h8() {
        return ((Boolean) this.H0.getValue()).booleanValue();
    }

    public final boolean i8() {
        kq.c cVar = (kq.c) this.Y;
        if (cVar != null) {
            return cVar.M();
        }
        return false;
    }

    public final void j8(String message, Exception e13) {
        boolean booleanValue = ((Boolean) this.I0.getValue()).booleanValue();
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!booleanValue || (e13 instanceof CancellationException)) {
            return;
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.q(e13, "PinSwipeFragment: ".concat(message), tb0.p.PDP);
    }

    @Override // kr.a, ml1.q
    public final void k5() {
        if (h8()) {
            kq.c cVar = (kq.c) this.Y;
            if (cVar != null) {
                cVar.N();
                return;
            }
            return;
        }
        if (i8()) {
            kq.c cVar2 = (kq.c) this.Y;
            ComponentCallbacks r13 = cVar2 != null ? cVar2.r() : null;
            if (r13 instanceof ml1.q) {
                ((ml1.q) r13).k5();
            }
        }
    }

    public final void k8() {
        jr.a aVar = this.Y;
        PinFeed pinFeed = this.f88019g0;
        if (aVar == null || pinFeed == null) {
            return;
        }
        kq.c cVar = (kq.c) aVar;
        this.f88034v0.removeCallbacks(this.L0);
        m60.w f73 = f7();
        e eVar = this.K0;
        if (f73.c(eVar)) {
            f7().j(eVar);
        }
        if (cVar.L().size() != 1 || pinFeed.n() <= 1) {
            return;
        }
        m8(cVar, pinFeed, this.f88020h0, true);
    }

    public final void l8(int i13, int i14) {
        d8(i13);
        e8(i14);
        kq.c cVar = (kq.c) this.Y;
        ComponentCallbacks u13 = cVar != null ? cVar.u(i14) : null;
        if (u13 instanceof ac2.o) {
            ((o1) B7()).m((ac2.o) u13);
        }
    }

    public final void m8(kq.c cVar, PinFeed pinFeed, String str, boolean z13) {
        ArrayList e13 = a11.w.e(pinFeed, str, g8().I());
        Iterator it = e13.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((f30) it.next()).getUid(), str)) {
                break;
            } else {
                i13++;
            }
        }
        if (!z13) {
            cVar.f77530g = Math.max(0, i13);
            cVar.W(i13, e13);
            return;
        }
        cVar.H(i13, e13);
        b20.c cVar2 = this.X;
        if (cVar2 != null) {
            ((LockableViewPager) cVar2.f21278a).A(i13);
        }
        c cVar3 = this.f88032t0;
        if (cVar3 != null) {
            cVar3.d(i13);
        }
    }

    public final void n8(String str) {
        Context context = getContext();
        if (context == null || str.length() == 0) {
            return;
        }
        if (h8()) {
            is1.z zVar = new is1.z(str);
            zVar.a(context, tb0.p.CLOSEUP);
            this.f88023k0 = zVar;
        } else {
            is1.x xVar = new is1.x(str);
            xVar.a(context);
            this.f88022j0 = xVar;
        }
    }

    @Override // kr.a, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            is1.h hVar = this.F0;
            if (hVar == null) {
                Intrinsics.r("swipeOptimizationTracker");
                throw null;
            }
            hVar.c();
        }
        this.E = n80.d.fragment_pin_swipe;
        wk2.a aVar = this.f88037y0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        Object obj = aVar.get();
        kq.c cVar = (kq.c) obj;
        cVar.S(this.M0);
        cVar.X(this.f88024l0);
        cVar.U(this.f88025m0);
        cVar.V(this.f88027o0);
        cVar.T(this.f88026n0);
        cVar.P(this.f88028p0);
        cVar.R(this.f88029q0);
        cVar.Z(this.f88030r0);
        cVar.Y(this.f88031s0);
        this.Y = (jr.a) obj;
        if (bundle != null) {
            PinFeed pinFeed = this.f88019g0;
            if (pinFeed == null || pinFeed.n() == 0) {
                Feed F = Feed.F("__SOURCE_PIN_FEED", bundle);
                Intrinsics.g(F, "null cannot be cast to non-null type com.pinterest.api.model.PinFeed");
                this.f88019g0 = (PinFeed) F;
            }
            if (bundle.containsKey("CURRENT_PIN_ID")) {
                String string = bundle.getString("CURRENT_PIN_ID");
                if (j1.U0(string)) {
                    Intrinsics.f(string);
                    this.f88020h0 = string;
                }
            }
        }
        PinFeed pinFeed2 = this.f88019g0;
        if (pinFeed2 == null) {
            vb0.j.f125466a.F("SourceFeed should never be null", tb0.p.CLOSEUP, new Object[0]);
            return;
        }
        jr.a aVar2 = this.Y;
        if (aVar2 != null) {
            kq.c cVar2 = (kq.c) aVar2;
            String str = this.f88020h0;
            cVar2.Q(str);
            if (bundle == null) {
                is1.h hVar2 = this.F0;
                if (hVar2 == null) {
                    Intrinsics.r("swipeOptimizationTracker");
                    throw null;
                }
                hVar2.b();
            }
            m8(cVar2, pinFeed2, str, false);
        }
    }

    @Override // kr.a, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f88034v0.removeCallbacks(this.L0);
        m60.w f73 = f7();
        e eVar = this.K0;
        if (f73.c(eVar)) {
            f7().j(eVar);
        }
    }

    @Override // kr.a, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().j(this.J0);
        this.f88033u0.d();
        is1.x xVar = this.f88022j0;
        if (xVar != null) {
            xVar.b();
        }
        is1.z zVar = this.f88023k0;
        if (zVar != null) {
            zVar.b();
        }
        super.onDestroyView();
        kq.c cVar = (kq.c) this.Y;
        if (cVar != null) {
            cVar.A();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Intent intent = requireActivity().getIntent();
        if (intent.getBooleanExtra("com.pinterest.EXTRA_SHOW_COMMENT_THREAD", false)) {
            intent.putExtra("com.pinterest.EXTRA_SHOW_COMMENT_THREAD", false);
            requireActivity().setIntent(intent);
            NavigationImpl L = Navigation.L(com.pinterest.screens.i0.a(), this.f88021i0, ml1.b.NO_TRANSITION.getValue());
            L.m0("com.pinterest.EXTRA_PIN_ID", this.f88020h0);
            f7().d(L);
        }
    }

    @Override // kr.a, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        String f83 = f8();
        if (f83.length() > 0) {
            outState.putString("CURRENT_PIN_ID", f83);
        }
        PinFeed pinFeed = this.f88019g0;
        if (pinFeed == null || pinFeed.l() <= 0) {
            return;
        }
        pinFeed.G(outState);
        outState.putParcelable("__SOURCE_PIN_FEED", pinFeed);
    }

    @Override // kr.a, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        b20.c cVar = this.X;
        if (cVar != null) {
            String str = this.f88020h0;
            kq.c cVar2 = (kq.c) this.Y;
            int g13 = a11.w.g(str, cVar2 != null ? cVar2.L() : null);
            Object obj = cVar.f21278a;
            ((LockableViewPager) obj).A(g13);
            kq.c cVar3 = (kq.c) this.Y;
            if (cVar3 != null) {
                c cVar4 = new c(this, cVar3);
                this.f88032t0 = cVar4;
                cVar.y(cVar4);
            }
            int dimension = (int) ((getResources().getDimension(r0.pin_closeup_spacing_mini) / 2) * hf0.b.f69001a);
            LockableViewPager lockableViewPager = (LockableViewPager) obj;
            int i13 = lockableViewPager.f19900m;
            lockableViewPager.f19900m = dimension;
            int width = lockableViewPager.getWidth();
            lockableViewPager.v(width, width, dimension, i13);
            lockableViewPager.requestLayout();
        }
        f7().h(this.J0);
        if (h8()) {
            androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new t(this, null), 3);
        } else {
            i2 i2Var = this.f88035w0;
            if (i2Var != null) {
                this.f88033u0.a(i2Var.z().F(new n0(14, new q(this, 1)), new n0(15, d.f87965m), ck2.i.f27923c, ck2.i.f27924d));
            } else {
                Intrinsics.r("pinRepository");
                throw null;
            }
        }
    }
}
