package a;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.ClipData;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.api.model.cb0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.q11;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.feature.settings.shared.view.RestrictedLockView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.grid.PinGridFeedbackView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class z0 implements m1, t6, g.a, r4.j, c0.o1, t5.c, d7.r, d7.c, d7.i, h7.k, androidx.viewpager2.widget.n, qa2.d0, ak2.f, nx.h1, com.pinterest.feature.ideaPinCreation.closeup.view.o0, o82.o2, uj2.e, q5.v, androidx.fragment.app.b1, zp.y, ex.f, vr1.c, uj2.s, androidx.appcompat.widget.b2, androidx.core.widget.i, g0.a, androidx.camera.core.impl.k1, ak2.g {

    /* renamed from: a */
    public final /* synthetic */ int f195a;

    /* renamed from: b */
    public final /* synthetic */ Object f196b;

    public /* synthetic */ z0(Object obj, int i13) {
        this.f195a = i13;
        this.f196b = obj;
    }

    @Override // r4.j
    public Object C(r4.i iVar) {
        int i13 = this.f195a;
        Object obj = this.f196b;
        switch (i13) {
            case 3:
                v.n nVar = (v.n) obj;
                nVar.getClass();
                nVar.f123547c.execute(new jg(3, nVar, iVar));
                return "updateSessionConfigAsync";
            case 4:
                v.m0 m0Var = (v.m0) obj;
                m0Var.f123535a.f123552h.c(iVar);
                m0Var.f123536b.f89034b = true;
                return "AePreCapture";
            case 5:
                ((v.o0) obj).f123588b.f123658i.c();
                iVar.b(null);
                return "invokePostCaptureFuture";
            case 6:
                ((v.v0) obj).f123691a = iVar;
                return "waitFor3AResult";
            case 7:
                v.z0 z0Var = (v.z0) obj;
                if (!z0Var.f123755e.O()) {
                    iVar.b(null);
                    return "EnableTorchInternal";
                }
                kh2.m0.p("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
                z0Var.f123751a.p(true);
                iVar.b(null);
                return "EnableTorchInternal";
            case 8:
                ((v.b1) obj).f123364a.f123554j.a(iVar, true);
                return "TorchOn";
            case 9:
                v.g2 g2Var = (v.g2) obj;
                g2Var.getClass();
                g2Var.f123468b.execute(new jg(10, g2Var, iVar));
                return "triggerAePrecapture";
            case 10:
            default:
                u0.e eVar = (u0.e) obj;
                eVar.f119732a.execute(new l0.e(13, eVar, iVar));
                return "AudioSource-release";
            case 11:
                w.e eVar2 = (w.e) obj;
                eVar2.f126920c = iVar;
                return "RequestCompleteListener[" + eVar2 + "]";
            case 12:
                com.google.android.gms.internal.measurement.q4 q4Var = (com.google.android.gms.internal.measurement.q4) obj;
                q4Var.getClass();
                l3.c.H0().execute(new jg(28, q4Var, iVar));
                return q4Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
            case 13:
                l0.r rVar = (l0.r) obj;
                rVar.f81264p = iVar;
                return "SettableFuture hashCode: " + rVar.hashCode();
            case 14:
                ((l0.t) obj).f81292k = iVar;
                return "SurfaceOutputImpl close future complete";
        }
    }

    @Override // androidx.fragment.app.b1
    public void a(String str, Bundle result) {
        l11.j this$0 = (l11.j) this.f196b;
        int i13 = l11.j.W1;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(result, "result");
        ((Handler) this$0.S1.getValue()).post(new a11.p(3, result, this$0));
    }

    @Override // d7.i
    public void accept(Object obj) {
        ((s7.m) obj).e((Exception) ((Throwable) this.f196b));
    }

    @Override // ak2.f
    public com.google.common.util.concurrent.c0 apply(Object obj) {
        int i13 = this.f195a;
        Object obj2 = this.f196b;
        switch (i13) {
            case 0:
                v.s0 s0Var = (v.s0) obj2;
                s0Var.getClass();
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return g0.m.e(null);
                }
                long j13 = s0Var.f123656g;
                sc scVar = new sc(17);
                long millis = TimeUnit.NANOSECONDS.toMillis(j13);
                v.v0 v0Var = new v.v0(scVar);
                v.n nVar = s0Var.f123653d;
                nVar.n(v0Var);
                jg jgVar = new jg(9, nVar, v0Var);
                r4.l lVar = v0Var.f123692b;
                lVar.f106128b.d(jgVar, nVar.f123547c);
                return com.bumptech.glide.d.L(new g0.i(millis, lVar, s0Var.f123652c));
            default:
                Function1 tmp0 = (Function1) obj2;
                q0.f fVar = q0.f.f101757h;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (com.google.common.util.concurrent.c0) tmp0.invoke(obj);
        }
    }

    @Override // androidx.camera.core.impl.k1
    public void b(androidx.camera.core.impl.l1 l1Var) {
        switch (this.f195a) {
            case 0:
                v.g3 g3Var = (v.g3) this.f196b;
                g3Var.getClass();
                try {
                    c0.n0 l13 = l1Var.l();
                    if (l13 != null) {
                        g3Var.f123479b.i(l13);
                        return;
                    }
                    return;
                } catch (IllegalStateException e13) {
                    kh2.m0.s("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e13.getMessage());
                    return;
                }
            default:
                c0.r0 r0Var = (c0.r0) this.f196b;
                synchronized (r0Var.f24317a) {
                    r0Var.f24319c++;
                }
                r0Var.d(l1Var);
                return;
        }
    }

    @Override // g.a
    public void c(Object obj) {
        ((Function1) ((i2.v3) this.f196b).getValue()).invoke(obj);
    }

    @Override // zp.y
    public void d(zp.z event) {
        a41.d0 this$0 = (a41.d0) this.f196b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.V3(Boolean.valueOf(event.f142584a));
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.o0
    public void e(Bitmap bitmap) {
        uj2.c0 emitter = (uj2.c0) this.f196b;
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        if (bitmap != null) {
            ((kk2.a) emitter).b(bitmap);
        } else {
            ((kk2.a) emitter).a(new Exception("No Bitmap Loaded"));
        }
    }

    @Override // nx.h1
    public HashMap f() {
        int i13 = this.f195a;
        Object obj = this.f196b;
        switch (i13) {
            case 0:
                lq0.s0 this$0 = (lq0.s0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f84428i.getClass();
                return null;
            case 1:
                uk1.d presenterPinalytics = (uk1.d) obj;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "$presenterPinalytics");
                return presenterPinalytics.f122379a.f();
            case 3:
                ax0.h this$02 = (ax0.h) obj;
                int i14 = ax0.h.f20618v;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                return this$02.f20619d.f();
            case 4:
                ez0.h this$03 = (ez0.h) obj;
                int i15 = ez0.h.f60677j;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                return this$03.f60678a.f();
            case 19:
                we1.h0 this$04 = (we1.h0) obj;
                int i16 = we1.h0.f129376w;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                return this$04.f129377d.f();
            case 20:
                we1.r0 this$05 = (we1.r0) obj;
                int i17 = we1.r0.f129583l;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                HashMap f13 = this$05.f129586c.f();
                if (f13 == null) {
                    return null;
                }
                Map map = this$05.f129587d;
                if (map == null) {
                    map = kotlin.collections.z0.d();
                }
                f13.putAll(map);
                return f13;
            default:
                rh1.k0 this$06 = (rh1.k0) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                return this$06.f108228q.f();
        }
    }

    @Override // h7.k
    public void g(long j13, long j14, long j15) {
        z7.k kVar = ((z7.p) this.f196b).f140960e;
        if (kVar == null) {
            return;
        }
        ((z7.h) kVar).b(j13, j14, (j13 == -1 || j13 == 0) ? -1.0f : (j14 * 100.0f) / j13);
    }

    @Override // androidx.core.widget.i
    public void h(NestedScrollView nestedScrollView, int i13, int i14) {
        int i15 = this.f195a;
        Object obj = this.f196b;
        switch (i15) {
            case 26:
                jq1.n this$0 = (jq1.n) obj;
                int i16 = jq1.n.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i14 <= 0 && i13 > 0) {
                    ViewGroup viewGroup = this$0.f77507n1;
                    if (viewGroup == null) {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                    float floatValue = ((Number) this$0.F1.getValue()).floatValue();
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    q5.m0.l(viewGroup, floatValue);
                    return;
                }
                if (i14 <= 0 || i13 > 0) {
                    return;
                }
                ViewGroup viewGroup2 = this$0.f77507n1;
                if (viewGroup2 == null) {
                    Intrinsics.r("headerView");
                    throw null;
                }
                WeakHashMap weakHashMap2 = q5.v0.f102521a;
                q5.m0.l(viewGroup2, 0.0f);
                return;
            default:
                nq1.e this$02 = (nq1.e) obj;
                int i17 = nq1.e.f91820u0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (i14 <= 0 && i13 > 0) {
                    ViewGroup viewGroup3 = this$02.f91825n0;
                    if (viewGroup3 == null) {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                    float floatValue2 = ((Number) this$02.f91829r0.getValue()).floatValue();
                    WeakHashMap weakHashMap3 = q5.v0.f102521a;
                    q5.m0.l(viewGroup3, floatValue2);
                    return;
                }
                if (i14 <= 0 || i13 > 0) {
                    return;
                }
                ViewGroup viewGroup4 = this$02.f91825n0;
                if (viewGroup4 == null) {
                    Intrinsics.r("headerView");
                    throw null;
                }
                WeakHashMap weakHashMap4 = q5.v0.f102521a;
                q5.m0.l(viewGroup4, 0.0f);
                return;
        }
    }

    @Override // c0.o1
    public void i(c0.k kVar) {
        ((r0.j0) this.f196b).f105578s = kVar;
    }

    @Override // o82.o2
    public Object invoke(Object obj) {
        String str;
        int i13 = this.f195a;
        str = "";
        Object obj2 = this.f196b;
        switch (i13) {
            case 5:
                iz0.n this$0 = (iz0.n) obj2;
                iz0.q item = (iz0.q) obj;
                int i14 = iz0.n.Y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "item");
                HashMap hashMap = this$0.O0;
                cb0 cb0Var = item.f73930a;
                String y13 = cb0Var != null ? cb0Var.y() : null;
                if (y13 == null) {
                    y13 = "";
                }
                hashMap.put("module_title", y13);
                HashMap hashMap2 = this$0.O0;
                cb0 cb0Var2 = item.f73930a;
                String w13 = cb0Var2 != null ? cb0Var2.w() : null;
                hashMap2.put("quiz_output_id", w13 != null ? w13 : "");
                this$0.Q0 = cb0Var2;
                return new iz0.p(cb0Var2);
            case 12:
                w41.n0 this$02 = (w41.n0) obj2;
                w41.v0 it = (w41.v0) obj;
                int i15 = w41.n0.f128044e1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$02.getClass();
                if (it instanceof w41.t0) {
                    Resources resources = this$02.getResources();
                    int i16 = nz1.e.profile_pins_metadata_results_with_filters;
                    w41.t0 t0Var = (w41.t0) it;
                    int i17 = t0Var.f128087a;
                    if (this$02.N0 == null) {
                        Intrinsics.r("numberFormatter");
                        throw null;
                    }
                    String quantityString = resources.getQuantityString(i16, i17, qb0.j.b(i17));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    Resources resources2 = this$02.getResources();
                    int i18 = nz1.e.profile_pins_metadata_filters_applied;
                    if (this$02.N0 == null) {
                        Intrinsics.r("numberFormatter");
                        throw null;
                    }
                    int i19 = t0Var.f128088b;
                    String quantityString2 = resources2.getQuantityString(i18, i19, qb0.j.b(i19));
                    Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                    str = quantityString + " • " + quantityString2;
                } else if (it instanceof w41.s0) {
                    Resources resources3 = this$02.getResources();
                    int i23 = nz1.e.profile_pins_metadata_results_no_filters;
                    int i24 = ((w41.s0) it).f128076a;
                    if (this$02.N0 == null) {
                        Intrinsics.r("numberFormatter");
                        throw null;
                    }
                    str = resources3.getQuantityString(i23, i24, qb0.j.b(i24));
                    Intrinsics.f(str);
                } else if (!(it instanceof w41.u0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new w41.h(str);
            default:
                ba1.y this$03 = (ba1.y) obj2;
                ba1.d vmState = (ba1.d) obj;
                int i25 = ba1.y.M0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                this$03.getClass();
                return vmState instanceof ba1.b ? ((ba1.b) vmState).f22347a : new ba1.a(null, null, false, null, null, false, 63);
        }
    }

    @Override // d7.c
    public void j(Object obj, Object obj2) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f196b);
        throw null;
    }

    @Override // q5.v
    public q5.a2 k(View view, q5.a2 windowInsets) {
        PinCloseupFragment this$0 = (PinCloseupFragment) this.f196b;
        int i13 = PinCloseupFragment.f46972m3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        f5.e f13 = windowInsets.f102400a.f(7);
        Intrinsics.checkNotNullExpressionValue(f13, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = f13.f61084d;
        view.setLayoutParams(layoutParams2);
        this$0.getClass();
        return q5.a2.f102399b;
    }

    public void l(h32.f1 eventType) {
        sf1.e1 this$0 = (sf1.e1) this.f196b;
        int i13 = sf1.e1.T;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        sf1.j1 j1Var = this$0.G;
        if (j1Var != null) {
            sf1.j1.L0(j1Var, eventType, null, null, 14);
        }
    }

    @Override // vr1.c
    public void m(vr1.b it) {
        int i13 = this.f195a;
        Object obj = this.f196b;
        switch (i13) {
            case 14:
                q91.g1 this$0 = (q91.g1) obj;
                int i14 = q91.g1.D0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.d8();
                break;
            case 28:
                com.pinterest.identity.account.h this$02 = (com.pinterest.identity.account.h) obj;
                int i15 = com.pinterest.identity.account.h.H0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$02.b8();
                break;
            default:
                yq1.u this$03 = (yq1.u) obj;
                int i16 = yq1.u.F0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$03.e8(it.f126458b);
                break;
        }
    }

    @Override // uj2.e
    public void n(fk2.f emitter) {
        boolean z13;
        switch (this.f195a) {
            case 6:
                com.pinterest.feature.pin.j this$0 = (com.pinterest.feature.pin.j) this.f196b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.f47230d.d(new dg0.i());
                ((dh0.d) this$0.f47228b).j(i32.y0.ANDROID_PIN_CLOSEUP_TAKEOVER);
                emitter.b();
                return;
            default:
                RestrictedLockView this$02 = (RestrictedLockView) this.f196b;
                Unit unit = RestrictedLockView.f48326e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                synchronized (RestrictedLockView.f48326e) {
                    try {
                        lb0.r rVar = this$02.f48328d;
                        if (rVar == null) {
                            Intrinsics.r("prefsManagerUser");
                            throw null;
                        }
                        z13 = false;
                        if (!rVar.f("PREF_PRIVATE_PROFILE_EDUCATION_VIEWED", false)) {
                            z13 = true;
                            rVar.i("PREF_PRIVATE_PROFILE_EDUCATION_VIEWED", true);
                        }
                        Unit unit2 = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z13) {
                    emitter.b();
                    return;
                } else {
                    emitter.a(new Exception("Private profile education viewed"));
                    return;
                }
        }
    }

    @Override // uj2.s
    public void o(fk2.f emitter) {
        boolean z13;
        va1.w this$0 = (va1.w) this.f196b;
        List list = va1.w.f125256x;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        lb0.o oVar = this$0.f125268v;
        boolean z14 = false;
        if (this$0.f125259m.a()) {
            try {
                long g13 = ((lb0.b) oVar).g("FIRST_SEEN_CLAIMED_ACCOUNTS_BANNER", 0L);
                long millis = TimeUnit.DAYS.toMillis(30L);
                if (g13 != 0 && System.currentTimeMillis() - g13 >= millis) {
                    z13 = false;
                    if (!((lb0.b) oVar).e("DISMISSED_CLAIMED_ACCOUNTS_BANNER", false) && z13) {
                        z14 = true;
                    }
                }
                z13 = true;
                if (!((lb0.b) oVar).e("DISMISSED_CLAIMED_ACCOUNTS_BANNER", false)) {
                    z14 = true;
                }
            } catch (Exception unused) {
            }
        }
        emitter.c(Boolean.valueOf(z14));
        emitter.b();
    }

    @Override // qa2.d0
    public void onOpenPinCloseup(f30 pin) {
        int i13 = this.f195a;
        Object obj = this.f196b;
        switch (i13) {
            case 0:
                h90.r this$0 = (h90.r) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                h90.h hVar = new h90.h(pin);
                int i14 = h90.r.f68289p1;
                kh2.j.x2(this$0.k9(), hVar);
                break;
            case 1:
                m90.w this$02 = (m90.w) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                m90.i iVar = new m90.i(pin);
                int i15 = m90.w.X0;
                this$02.m9(iVar);
                break;
            case 2:
                p90.w this$03 = (p90.w) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                p90.g gVar = new p90.g(pin);
                int i16 = p90.w.Y0;
                kh2.j.x2(this$03.m9(), gVar);
                break;
            case 3:
                ea0.t this$04 = (ea0.t) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                ea0.b bVar = new ea0.b(pin);
                int i17 = ea0.t.W0;
                kh2.j.x2(this$04.k9(), bVar);
                break;
            case 4:
                iq0.a this$05 = (iq0.a) obj;
                int i18 = iq0.a.f73386f1;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(pin, "it");
                eq0.m mVar = this$05.f73388b1;
                if (mVar != null) {
                    mVar.Y0(pin);
                    break;
                }
                break;
            case 5:
                iq0.g this$06 = (iq0.g) obj;
                int i19 = iq0.g.f73404f1;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(pin, "it");
                eq0.m mVar2 = this$06.Y0;
                if (mVar2 != null) {
                    mVar2.Y0(pin);
                    break;
                }
                break;
            case 6:
                w01.r0 this$07 = (w01.r0) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(pin, "it");
                NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.i0.f50929g.getValue(), pin.getUid());
                z03.m0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE", "shop_feed");
                z03.m0("product_tag_parent_pin_id", this$07.f127103a);
                this$07.f127104b.d(z03);
                break;
            case 7:
                c31.r this$08 = (c31.r) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                int i23 = c31.r.W0;
                kh2.j.x2(this$08.l9(), new c31.d(pin));
                break;
            case 8:
                w41.n0 this$09 = (w41.n0) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                w41.t tVar = new w41.t(pin);
                int i24 = w41.n0.f128044e1;
                this$09.n9(tVar);
                break;
            case 9:
                SearchGridMultiSectionFragment this$010 = (SearchGridMultiSectionFragment) obj;
                int i25 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(pin, "it");
                eq0.m mVar3 = this$010.f47722n2;
                if (mVar3 != null) {
                    mVar3.Y0(pin);
                    break;
                }
                break;
            case 10:
                od1.t this$011 = (od1.t) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                int i26 = od1.t.f94174d1;
                kh2.j.x2(this$011.k9(), new od1.f(pin));
                break;
            case 11:
                ef1.b this$012 = (ef1.b) obj;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                this$012.getClass();
                NavigationImpl z04 = Navigation.z0((ScreenLocation) com.pinterest.screens.p4.f51209b.getValue(), pin.getUid());
                z04.m0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE", "shop_feed");
                this$012.f58835b.d(z04);
                break;
            case 12:
                dg1.c this$013 = (dg1.c) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(pin, "pin");
                a42.f ideaPinBlockType = this$013.f54941j;
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(ideaPinBlockType, "ideaPinBlockType");
                HashMap m13 = this$013.f54943l.m(pin);
                if (m13 == null) {
                    m13 = new HashMap();
                }
                HashMap hashMap = m13;
                hashMap.put("tag_type", f32.c.PRODUCT.toString());
                nx.d0.B(this$013.f54932a, null, null, null, hashMap, 23);
                if (ideaPinBlockType == a42.f.VIRTUAL_TRY_ON_MAKEUP_STICKER) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID", pin.getUid());
                    bundle.putString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_TITLE", pin.r4());
                    bundle.putString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_IMAGE_URL", bs1.c.p0(pin));
                    this$013.f54934c.y1(dg1.b.f54931i, dg1.a.f54930a[ideaPinBlockType.ordinal()] == 1 ? "com.pinterest.EXTRA_STORY_PIN_VTO_PRODUCT_EXTRA" : "com.pinterest.EXTRA_STORY_PIN_PRODUCT_EXTRA", bundle);
                    break;
                } else {
                    cg1.a aVar = this$013.f54942k;
                    if (aVar != null) {
                        lv0.g gVar2 = (lv0.g) aVar;
                        Intrinsics.checkNotNullParameter(pin, "pin");
                        if (gVar2.f85011m == null) {
                            int i27 = 19;
                            gVar2.addDisposable(((dl1.l) gVar2.f85015q).P(gVar2.f85013o.d()).F(new ev0.g(18, new com.pinterest.feature.ideaPinCreation.closeup.view.r0(i27, gVar2, pin)), new ev0.g(i27, lv0.b.f84984n), ck2.i.f27923c, ck2.i.f27924d));
                            break;
                        } else {
                            gVar2.f85014p.d(new hv0.i(pin));
                            gVar2.f85012n.z(lv0.b.f84983m);
                            break;
                        }
                    }
                }
                break;
            case 13:
                int i28 = zg1.c.f141957d;
                Intrinsics.checkNotNullParameter(pin, "it");
                m60.u.f85943a.d(Navigation.z0((ScreenLocation) com.pinterest.screens.u4.f51436b.getValue(), ((f30) obj).getUid()));
                break;
            default:
                com.pinterest.feature.todaytab.tab.view.q this$014 = (com.pinterest.feature.todaytab.tab.view.q) obj;
                int i29 = com.pinterest.feature.todaytab.tab.view.q.f48740i;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(pin, "it");
                dh1.e eVar = this$014.f48748h;
                if (eVar != null) {
                    eVar.t3(null);
                    break;
                }
                break;
        }
    }

    @Override // ex.f
    public void p(com.pinterest.api.model.h2 it) {
        l81.l this$0 = (l81.l) this.f196b;
        int i13 = l81.l.Q2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        q11 i14 = lp2.b.i(this$0.F2, it);
        if (i14 == null) {
            i92.k kVar = this$0.f82152c1;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar.h(m60.x0.generic_error);
            h81.c cVar = this$0.B2;
            if (cVar != null) {
                cVar.b();
            }
            this$0.F9();
            dx.a aVar = this$0.K2;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        com.pinterest.feature.search.visual.cropper.m mVar = this$0.K1;
        if (mVar != null) {
            mVar.b();
        }
        dx.a aVar2 = this$0.K2;
        if (aVar2 != null) {
            String o13 = it.o();
            List list = this$0.E2;
            Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
            List list2 = this$0.E2;
            aVar2.d(valueOf, list2 != null ? Integer.valueOf(list2.indexOf(it)) : null, o13);
        }
        h81.c cVar2 = this$0.B2;
        if (cVar2 != null) {
            Double t13 = i14.t();
            Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
            double doubleValue = t13.doubleValue();
            Double u13 = i14.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
            double doubleValue2 = u13.doubleValue();
            Double s13 = i14.s();
            Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
            double doubleValue3 = s13.doubleValue();
            Double o14 = i14.o();
            Intrinsics.checkNotNullExpressionValue(o14, "getH(...)");
            double doubleValue4 = o14.doubleValue();
            List list3 = this$0.F2;
            cVar2.a(doubleValue, doubleValue2, doubleValue3, doubleValue4, list3 != null ? list3.indexOf(i14) : -1, false);
        }
    }

    @Override // t5.c
    public boolean q(t5.e eVar, int i13, Bundle bundle) {
        View view = (View) this.f196b;
        if ((i13 & 1) != 0) {
            try {
                ((t5.d) eVar.f116429b).x();
                Parcelable parcelable = (Parcelable) ((t5.d) eVar.f116429b).q();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e13) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e13);
                return false;
            }
        }
        ClipData clipData = new ClipData(((t5.d) eVar.f116429b).getDescription(), new ClipData.Item(((t5.d) eVar.f116429b).w()));
        q5.d cVar = Build.VERSION.SDK_INT >= 31 ? new q5.c(clipData, 2) : new q5.e(clipData, 2);
        cVar.d(((t5.d) eVar.f116429b).y());
        cVar.a(bundle);
        return q5.v0.k(view, cVar.build()) == null;
    }

    public void r(View view) {
        rh1.q0 this$0 = (rh1.q0) this.f196b;
        int i13 = rh1.q0.B1;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1 = view;
    }

    public boolean s(MenuItem menuItem) {
        int i13 = this.f195a;
        Object obj = this.f196b;
        switch (i13) {
            case 24:
                GestaltToolbarImpl this$0 = (GestaltToolbarImpl) obj;
                int i14 = GestaltToolbarImpl.f49700u;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                androidx.appcompat.widget.b2 b2Var = this$0.f49712l;
                if (b2Var != null) {
                    return ((z0) b2Var).s(menuItem);
                }
                return false;
            default:
                fo1.i toolbarListener = (fo1.i) obj;
                Intrinsics.checkNotNullParameter(toolbarListener, "$toolbarListener");
                return toolbarListener.Z3(menuItem.getItemId());
        }
    }

    @Override // ak2.g
    public boolean test(Object obj) {
        f30 f30Var;
        int i13 = this.f195a;
        Object obj2 = this.f196b;
        switch (i13) {
            case 0:
                return ((i32.y0) obj2) == ((rg0.n) obj).f108067i;
            default:
                PinGridFeedbackView pinGridFeedbackView = (PinGridFeedbackView) obj2;
                gb2.i iVar = (gb2.i) obj;
                int i14 = PinGridFeedbackView.f52492e;
                pinGridFeedbackView.getClass();
                if (iVar.f64755c == wa2.o.EVENT_ONLY || (f30Var = pinGridFeedbackView.f52493a) == null) {
                    return false;
                }
                return iVar.f64753a.equals(f30Var.getUid());
        }
    }

    @Override // androidx.viewpager2.widget.n
    public void x(View page, float f13) {
        int i13 = this.f195a;
        Object obj = this.f196b;
        switch (i13) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                Intrinsics.checkNotNullParameter(page, "page");
                Intrinsics.f(viewPager2);
                float f14 = f13 * (-((bs1.c.W(viewPager2, b62.a.preview_carousel_peek_offset) * 2) + bs1.c.W(viewPager2, b62.a.preview_carousel_horizontal_margin)));
                if (com.bumptech.glide.c.w0(viewPager2)) {
                    f14 = -f14;
                }
                page.setTranslationX(f14);
                return;
            default:
                a02.d this$0 = (a02.d) obj;
                int i14 = a02.d.f218l0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(page, "page");
                ViewPager2 viewPager22 = this$0.f220d0;
                if (viewPager22 != null) {
                    page.post(new a11.p(24, page, viewPager22));
                    return;
                } else {
                    Intrinsics.r("viewPager");
                    throw null;
                }
        }
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        int i13 = this.f195a;
        Object obj2 = this.f196b;
        switch (i13) {
            case 0:
                return (wy0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 1:
                return (uj2.t) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 2:
                return (Unit) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 3:
                return (c60.a) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 4:
                return (uj2.n) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 5:
                return (wy0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 6:
                return (c60.a) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 7:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 8:
                return (Boolean) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 9:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 10:
                return (qr1.c) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 11:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 12:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 13:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 14:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 15:
                return (List) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 16:
                return (List) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 17:
                return (Iterable) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 18:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 19:
                return (uj2.t) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 20:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 21:
                return (uj2.f0) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 22:
                return (xc2.u) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            case 23:
                return (uj2.t) ep.b.j((Function1) obj2, "$tmp0", obj, "p0", obj);
            default:
                ls0.n this$0 = (ls0.n) obj2;
                Throwable error = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof TimeoutException) {
                    iv1.b bVar = this$0.f84679m;
                    bVar.getClass();
                    String repinId = this$0.f84667a;
                    Intrinsics.checkNotNullParameter(repinId, "repinId");
                    h32.f1 f1Var = h32.f1.NRT_AUTO_ORG_TIMEOUT;
                    wy0 f13 = ((b60.d) bVar.f73736f).f();
                    bVar.a(f1Var, null, f13 != null ? f13.getUid() : null, repinId);
                }
                return new com.pinterest.api.model.oc();
        }
    }

    @Override // d7.r
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        int i13 = this.f195a;
        Object obj2 = this.f196b;
        switch (i13) {
            case 21:
                int i14 = m7.l0.f86250p0;
                ((a7.t0) obj).E2((a7.g1) obj2);
                break;
            case 22:
                ((a7.t0) obj).w1((c7.c) obj2);
                break;
            case 23:
                ((a7.t0) obj).Y3(((m7.i0) obj2).f86205a.R);
                break;
            case 24:
                ((a7.t0) obj).J4((a7.n0) obj2);
                break;
            default:
                ((a7.t0) obj).J1((a7.n) obj2);
                break;
        }
    }
}
