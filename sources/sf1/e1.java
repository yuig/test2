package sf1;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wo0;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.feature.storypin.closeup.view.AdsIdeaPinHorizontalActionBarView;
import com.pinterest.feature.storypin.closeup.view.AdsIdeaPinVerticalActionBarView;
import com.pinterest.feature.storypin.closeup.view.IdeaPinDeletedView;
import com.pinterest.feature.storypin.closeup.view.IdeaPinHideView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import h32.f3;
import h32.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh2.c3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes5.dex */
public final class e1 extends uq.w implements k1, y92.i, nx.v, i0 {
    public static int T;
    public final ArrayList A;
    public float B;
    public float C;
    public final xk2.k D;
    public final xk2.k E;
    public final of1.b F;
    public j1 G;
    public float H;
    public boolean I;

    /* renamed from: J */
    public boolean f112544J;
    public boolean K;
    public LinkedHashMap L;
    public final tf1.a M;
    public final boolean N;
    public final boolean O;
    public final d1 P;
    public boolean Q;
    public Long R;
    public final boolean S;

    /* renamed from: d */
    public final nx.d0 f112545d;

    /* renamed from: e */
    public final tf1.d f112546e;

    /* renamed from: f */
    public final s0 f112547f;

    /* renamed from: g */
    public lh0.v1 f112548g;

    /* renamed from: h */
    public ac2.m f112549h;

    /* renamed from: i */
    public c91.e f112550i;

    /* renamed from: j */
    public i92.k f112551j;

    /* renamed from: k */
    public m60.w f112552k;

    /* renamed from: l */
    public wk2.a f112553l;

    /* renamed from: m */
    public ac2.k f112554m;

    /* renamed from: n */
    public final View f112555n;

    /* renamed from: o */
    public final ViewGroup f112556o;

    /* renamed from: p */
    public final GestaltIcon f112557p;

    /* renamed from: q */
    public final ViewPager2 f112558q;

    /* renamed from: r */
    public final h0 f112559r;

    /* renamed from: s */
    public final IdeaPinDeletedView f112560s;

    /* renamed from: t */
    public final GestaltText f112561t;

    /* renamed from: u */
    public final AdsIdeaPinHorizontalActionBarView f112562u;

    /* renamed from: v */
    public final AdsIdeaPinVerticalActionBarView f112563v;

    /* renamed from: w */
    public final FrameLayout f112564w;

    /* renamed from: x */
    public final LoadingView f112565x;

    /* renamed from: y */
    public h1 f112566y;

    /* renamed from: z */
    public qf1.o f112567z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ab, code lost:
    
        if (r0.l("closeup_redesign_tablet_android") == false) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e1(android.content.Context r28, nx.d0 r29, mf1.a r30, tf1.d r31, sf1.s0 r32, kv0.p r33, mf1.b r34) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.e1.<init>(android.content.Context, nx.d0, mf1.a, tf1.d, sf1.s0, kv0.p, mf1.b):void");
    }

    public static final void L(e1 e1Var, IdeaPinHideView ideaPinHideView) {
        e1Var.getClass();
        ViewGroup.LayoutParams layoutParams = ideaPinHideView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
        int i13 = rq1.a.story_pin_pages_v2;
        layoutParams2.f17691t = i13;
        layoutParams2.f17693v = i13;
        layoutParams2.f17671i = i13;
        layoutParams2.f17677l = i13;
        ideaPinHideView.setLayoutParams(layoutParams2);
        ideaPinHideView.f48557f.e(new ca1.h(e1Var, 23));
    }

    public static void X(ViewGroup viewGroup, HashSet hashSet) {
        Iterator it = d7.b.O(viewGroup).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((!(view instanceof IdeaPinHideView) || (view instanceof f)) && !(view instanceof IdeaPinDeletedView)) {
                ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup2 != null) {
                    X(viewGroup2, hashSet);
                }
            } else {
                hashSet.add(view);
            }
        }
    }

    public final void B0(boolean z13) {
        boolean z14 = this.M.f117546a && z13;
        h0 h0Var = this.f112559r;
        if (z14) {
            bs1.c.U1(h0Var.f112590o);
        } else {
            bs1.c.X0(h0Var.f112590o);
        }
    }

    public final void F0(boolean z13, boolean z14) {
        nc2.h hVar = nc2.h.f90405a;
        j1 j1Var = this.G;
        com.bumptech.glide.d.E0(a.a.C(j1Var != null ? ((rf1.p0) j1Var).u4() : null, "-0"), c.f112528u);
        this.f112544J = true;
        d0(0, true);
        I0(this.f112558q.f19924d, 0.0f);
        if (z13) {
            this.f112559r.Z();
        }
        H0();
    }

    public final void G0(qf1.o state, int i13) {
        List list;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f112567z = state;
        Map b13 = state.b();
        mu0.i iVar = null;
        qf1.i iVar2 = b13 != null ? (qf1.i) b13.get(Integer.valueOf(i13)) : null;
        boolean z13 = iVar2 != null ? iVar2.f103689b : false;
        List list2 = iVar2 != null ? iVar2.f103688a : null;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String E = c3.E(context, list2, z13);
        int i14 = 4;
        if (!z13 && iVar2 != null && (list = iVar2.f103688a) != null && list.size() > 1) {
            iVar = new mu0.i(this, state, i13, i14);
        }
        boolean c13 = state.c();
        boolean z14 = this.N;
        GestaltText gestaltText = this.f112561t;
        if (!z14) {
            gestaltText.i(c.f112530w);
        } else if (E.length() == 0) {
            gestaltText.i(c.f112529v);
        } else {
            gestaltText.i(new n(i14, E, z13 ? new rm1.d(new rm1.f(rm1.q.MUSIC_OFF, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28) : new rm1.d(new rm1.f(rm1.q.MUSIC_ON, rm1.i.XS), rm1.c.LIGHT, null, 0, null, 28)));
            if (iVar != null) {
                gestaltText.j(new defpackage.a(28, iVar));
            }
        }
        if (c13) {
            AdsIdeaPinHorizontalActionBarView adsIdeaPinHorizontalActionBarView = this.f112562u;
            adsIdeaPinHorizontalActionBarView.getClass();
            adsIdeaPinHorizontalActionBarView.f48553n.i(new fd1.h(z13, 11));
        }
        h0 h0Var = this.f112559r;
        h0Var.f112592q.setClickable(!z13);
        GestaltIconButton gestaltIconButton = h0Var.f112592q;
        if (z13) {
            gestaltIconButton.setAlpha(0.5f);
        } else {
            gestaltIconButton.setAlpha(1.0f);
        }
        h0Var.a0(z13 || nc2.h.f90406b);
    }

    public final void H0() {
        boolean z13 = nc2.h.f90406b;
        of1.b bVar = this.F;
        h0 h0Var = this.f112559r;
        if (z13) {
            h0Var.a0(true);
            bVar.E();
            nc2.h.f90406b = true;
        } else {
            h0Var.a0(z0());
            bVar.F();
            nc2.h.f90406b = false;
        }
    }

    public final void I0(int i13, float f13) {
        h0 h0Var = this.f112559r;
        k0 k0Var = h0Var.f112597v;
        if (k0Var != null) {
            k0Var.f112643g = f13;
            k0Var.f112640d = (int) ((5000 * f13) / 50);
        }
        h0Var.f112590o.g(i13, f13);
    }

    public final void K0(int i13) {
        int i14 = i13 - this.f112547f.f112728i;
        ViewPager2 viewPager2 = this.f112558q;
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i14;
        viewPager2.setLayoutParams(layoutParams2);
        Integer valueOf = Integer.valueOf(i14);
        of1.b bVar = this.F;
        bVar.f94415m = valueOf;
        Iterator it = bVar.f94413k.entrySet().iterator();
        while (it.hasNext()) {
            ((of1.a) ((Map.Entry) it.next()).getValue()).f94405u.l(i14);
        }
    }

    public final void T(boolean z13, ew0.a aVar) {
        long j13 = aVar.f60339a;
        View[] viewArr = (View[]) this.A.toArray(new View[0]);
        for (View view : (View[]) Arrays.copyOf(viewArr, viewArr.length)) {
            view.animate().alpha(z13 ? 1.0f : 0.0f).setDuration(j13).setInterpolator(aVar.f60340b).setListener(new ua.m0(w.f112784k, w.f112785l, 12)).start();
        }
    }

    public final String Z() {
        j1 j1Var = this.G;
        return (j1Var != null ? ((rf1.p0) j1Var).u4() : null) + "-" + this.f112558q.f19924d;
    }

    public final lh0.v1 a0() {
        lh0.v1 v1Var = this.f112548g;
        if (v1Var != null) {
            return v1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final void d0(int i13, boolean z13) {
        String str;
        rf1.p0 p0Var;
        f30 f30Var;
        String uid;
        s C;
        int[] c13;
        int i14;
        ViewPager2 viewPager2 = this.f112558q;
        int i15 = viewPager2.f19924d;
        int i16 = i15 - i13;
        boolean z14 = false;
        if (Math.abs(i16) != 1) {
            try {
                viewPager2.i(i13, false);
            } catch (IllegalStateException e13) {
                j1 j1Var = this.G;
                if (j1Var == null || (str = ((rf1.p0) j1Var).u4()) == null) {
                    str = "";
                }
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                StringBuilder t13 = a.a.t("Destination page position:", i13, ", current page position:", viewPager2.f19924d, ", pinId = ");
                t13.append(str);
                hVar.q(e13, t13.toString(), tb0.p.IDEA_PINS_DISPLAY);
            }
        } else {
            if (viewPager2.f19934n.f19945b.f19968m) {
                return;
            }
            int i17 = bs1.c.l1(this) ? -1 : 1;
            androidx.viewpager2.widget.b bVar = viewPager2.f19934n;
            androidx.viewpager2.widget.e eVar = bVar.f19945b;
            if (eVar.f19961f != 1) {
                bVar.f19950g = 0;
                bVar.f19949f = 0;
                bVar.f19951h = SystemClock.uptimeMillis();
                VelocityTracker velocityTracker = bVar.f19947d;
                if (velocityTracker == null) {
                    bVar.f19947d = VelocityTracker.obtain();
                    bVar.f19948e = ViewConfiguration.get(bVar.f19944a.getContext()).getScaledMaximumFlingVelocity();
                } else {
                    velocityTracker.clear();
                }
                eVar.f19960e = 4;
                eVar.o(true);
                if (eVar.f19961f != 0) {
                    bVar.f19946c.h3();
                }
                long j13 = bVar.f19951h;
                MotionEvent obtain = MotionEvent.obtain(j13, j13, 0, 0.0f, 0.0f, 0);
                bVar.f19947d.addMovement(obtain);
                obtain.recycle();
            }
            float width = viewPager2.getWidth() * i16 * i17;
            androidx.viewpager2.widget.b bVar2 = viewPager2.f19934n;
            if (bVar2.f19945b.f19968m) {
                float f13 = bVar2.f19949f - width;
                bVar2.f19949f = f13;
                int round = Math.round(f13 - bVar2.f19950g);
                bVar2.f19950g += round;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z15 = bVar2.f19944a.c() == 0;
                int i18 = z15 ? round : 0;
                if (z15) {
                    round = 0;
                }
                float f14 = z15 ? bVar2.f19949f : 0.0f;
                float f15 = z15 ? 0.0f : bVar2.f19949f;
                bVar2.f19946c.scrollBy(i18, round);
                MotionEvent obtain2 = MotionEvent.obtain(bVar2.f19951h, uptimeMillis, 2, f14, f15, 0);
                bVar2.f19947d.addMovement(obtain2);
                obtain2.recycle();
            }
            androidx.viewpager2.widget.b bVar3 = viewPager2.f19934n;
            androidx.viewpager2.widget.e eVar2 = bVar3.f19945b;
            boolean z16 = eVar2.f19968m;
            if (z16) {
                if (!(eVar2.f19961f == 1) || z16) {
                    eVar2.f19968m = false;
                    eVar2.p();
                    r9.d dVar = eVar2.f19962g;
                    if (dVar.f106814c == 0) {
                        int i19 = dVar.f106812a;
                        if (i19 != eVar2.f19963h) {
                            eVar2.l(i19);
                        }
                        eVar2.m(0);
                        eVar2.n();
                    } else {
                        eVar2.m(2);
                    }
                }
                VelocityTracker velocityTracker2 = bVar3.f19947d;
                velocityTracker2.computeCurrentVelocity(1000, bVar3.f19948e);
                if (!bVar3.f19946c.b1((int) velocityTracker2.getXVelocity(), (int) velocityTracker2.getYVelocity())) {
                    ViewPager2 viewPager22 = bVar3.f19944a;
                    View h10 = viewPager22.f19931k.h(viewPager22.f19927g);
                    if (h10 != null && ((i14 = (c13 = viewPager22.f19931k.c(viewPager22.f19927g, h10))[0]) != 0 || c13[1] != 0)) {
                        viewPager22.f19930j.Z2(i14, c13[1]);
                    }
                }
            }
        }
        of1.b bVar4 = this.F;
        if (z13) {
            this.f112544J = true;
            s1 D = bVar4.D(viewPager2.f19924d);
            if (D != null) {
                D.k();
            }
        }
        H0();
        if (i15 != i13 && (C = bVar4.C(i15)) != null) {
            C.C();
        }
        addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 23));
        j1 j1Var2 = this.G;
        if (j1Var2 != null && (uid = ((rf1.p0) j1Var2).u4()) != null) {
            LruCache lruCache = rf1.e.f107743a;
            Intrinsics.checkNotNullParameter(uid, "uid");
            rf1.e.f107743a.put(uid, Integer.valueOf(i13));
        }
        j1 j1Var3 = this.G;
        if (j1Var3 == null || !((rf1.p0) j1Var3).x4(i13)) {
            lh0.v1 a03 = a0();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) a03.f83491a;
            if (g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) {
                j1 j1Var4 = this.G;
                if (j1Var4 != null && (f30Var = (p0Var = (rf1.p0) j1Var4).Z) != null && ro1.c.f108967f.i(f30Var, p0Var.E, p0Var.B)) {
                    z14 = true;
                }
                this.K = z14;
            }
        }
    }

    public final void g0(MotionEvent event) {
        j1 j1Var;
        int i13 = x0.f112790a[this.f112546e.f117558f.ordinal()];
        boolean z13 = true;
        if (i13 != 1) {
            if (i13 == 2 && (j1Var = this.G) != null) {
                rf1.p0 p0Var = (rf1.p0) j1Var;
                Intrinsics.checkNotNullParameter(event, "event");
                f30 f30Var = p0Var.isBound() ? p0Var.Z : null;
                if (f30Var != null && c0.d.g2(f30Var)) {
                    p0Var.T3(f30Var, "closeup");
                    return;
                }
                return;
            }
            return;
        }
        h0 h0Var = this.f112559r;
        h0Var.o0(h0Var.f112600y);
        boolean o13 = bs1.c.o1(h0Var.f112595t);
        i0 i0Var = h0Var.f112582g;
        if (o13) {
            h0Var.L(null);
            ((e1) i0Var).r0(h32.f1.IDEA_PIN_VIDEO_CONTROLS_OUT);
            return;
        }
        FrameLayout frameLayout = h0Var.f112587l;
        if (bs1.c.j1(frameLayout)) {
            bs1.c.U1(frameLayout);
        }
        if (h0Var.f112580e || h0Var.f112596u) {
            Context context = h0Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (df.j1.l(context)) {
                ObjectAnimator objectAnimator = h0Var.f112601z;
                objectAnimator.setStartDelay(0L);
                objectAnimator.setDuration(300L);
                objectAnimator.addListener(new androidx.recyclerview.widget.d0(h0Var, z13, 4));
                objectAnimator.start();
            } else {
                h0Var.g0();
            }
        }
        ((e1) i0Var).r0(h32.f1.IDEA_PIN_VIDEO_CONTROLS_IN);
        if (h0Var.T()) {
            return;
        }
        h0Var.L(Long.valueOf(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS));
    }

    public final m60.w getEventManager() {
        m60.w wVar = this.f112552k;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final void k0(h1 h1Var) {
        bs1.c.X0(this.f112556o);
        boolean z13 = h1Var.f112608g;
        AdsIdeaPinHorizontalActionBarView adsIdeaPinHorizontalActionBarView = this.f112562u;
        boolean z14 = h1Var.f112609h;
        if (z13 || z14) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int V = bs1.c.V(context, m60.r0.margin_none);
            ViewGroup.LayoutParams layoutParams = adsIdeaPinHorizontalActionBarView.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = V;
            adsIdeaPinHorizontalActionBarView.setLayoutParams(marginLayoutParams);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int V2 = bs1.c.V(context2, eo1.c.space_400);
            ViewGroup.LayoutParams layoutParams2 = adsIdeaPinHorizontalActionBarView.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = V2;
            adsIdeaPinHorizontalActionBarView.setLayoutParams(marginLayoutParams2);
        }
        if (this.O) {
            return;
        }
        h0 h0Var = this.f112559r;
        if (z13 || z14) {
            bs1.c.U1(h0Var.f112590o);
        } else {
            bs1.c.X0(h0Var.f112590o);
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dl0 v63;
        j1 j1Var = this.G;
        if (j1Var == null) {
            return null;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        boolean z13 = this.K;
        rf1.p0 p0Var = (rf1.p0) j1Var;
        f30 f30Var = p0Var.Z;
        if (f30Var == null || (v63 = f30Var.v6()) == null || !Intrinsics.d(v63.o(), Boolean.TRUE)) {
            return ((oq.b) p0Var.K0.getValue()).b(p0Var.t3(), null, null, z13);
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        f30 f30Var;
        dl0 v63;
        j1 j1Var = this.G;
        if (j1Var == null) {
            return null;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        rf1.p0 p0Var = (rf1.p0) j1Var;
        f30 f30Var2 = p0Var.Z;
        if ((f30Var2 == null || (v63 = f30Var2.v6()) == null || !Intrinsics.d(v63.o(), Boolean.TRUE)) && (f30Var = p0Var.Z) != null) {
            return ((oq.b) p0Var.K0.getValue()).c(f30Var, p0Var.t3(), p0Var.f107836e0);
        }
        return null;
    }

    public final void o0(float f13, float f14) {
        f30 f30Var;
        uo0 uo0Var;
        j1 j1Var = this.G;
        if (j1Var != null) {
            rf1.p0 p0Var = (rf1.p0) j1Var;
            if (p0Var.Q3() || p0Var.x4(p0Var.f107842h0)) {
                return;
            }
            f30 f30Var2 = p0Var.Z;
            es.c cVar = (es.c) p0Var.B;
            if (cVar.M(f30Var2)) {
                lh0.u1 u1Var = p0Var.f107851m;
                u1Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) u1Var.f83486a;
                if (!g1Var.o("ios_android_idea_ads_playtime_metric", "enabled", z3Var) && !g1Var.l("ios_android_idea_ads_playtime_metric")) {
                    return;
                }
            }
            float f15 = 5000L;
            long j13 = (long) (f13 * f15);
            long j14 = (long) (f15 * f14);
            if (!cVar.M(p0Var.Z)) {
                cc2.p pVar = p0Var.f107874x0;
                if (pVar == null) {
                    Intrinsics.r("watchTimeLogger");
                    throw null;
                }
                r3 r3Var = r3.PLAYING;
                long currentTimeMillis = System.currentTimeMillis();
                f3 f3Var = new f3();
                f3Var.f66992j = Double.valueOf(1.0d);
                f3Var.f67005w = 5000L;
                pVar.c(r3Var, j13, currentTimeMillis, f3Var, p0Var.H3(), new h32.i0(null, null, null, null, null, null));
                return;
            }
            if (!cVar.U(p0Var.Z) || (f30Var = p0Var.Z) == null) {
                return;
            }
            qg1.k kVar = ((qg1.l) p0Var.f107878z0.getValue()).f103851d;
            HashMap hashMap = kVar.f103848b;
            dl1.s sVar = (dl1.s) CollectionsKt.U(p0Var.f107842h0, p0Var.f107834d0);
            wo0 wo0Var = sVar instanceof wo0 ? (wo0) sVar : null;
            Double d2 = (Double) hashMap.get((wo0Var == null || (uo0Var = wo0Var.f43310a) == null) ? null : uo0Var.v());
            long doubleValue = d2 != null ? (long) d2.doubleValue() : 0L;
            double d13 = kVar.f103847a;
            String pinId = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
            cc2.c H3 = p0Var.H3();
            long currentTimeMillis2 = System.currentTimeMillis() - (j13 - j14);
            long currentTimeMillis3 = System.currentTimeMillis();
            long j15 = j14 + doubleValue;
            double d14 = doubleValue + j13;
            r3 playbackState = r3.PLAYING;
            h32.i0 i0Var = new h32.i0(null, null, null, null, null, null);
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            Intrinsics.checkNotNullParameter("", "videoSource");
            Intrinsics.checkNotNullParameter(playbackState, "playbackState");
            cc2.f fVar = cc2.g.Companion;
            double d15 = 100;
            double min = Math.min((j15 / d13) * d15, 100.0d);
            fVar.getClass();
            cc2.g a13 = cc2.f.a(min);
            List j16 = kotlin.collections.f0.j(cc2.g.Q0, cc2.g.Q1, cc2.g.Q2, cc2.g.Q3, cc2.g.Q4);
            cc2.g a14 = cc2.f.a(Math.min((d14 / d13) * d15, 100.0d));
            oe.f.X0(pinId, H3, d13, "", currentTimeMillis2, currentTimeMillis3, j15, d14, playbackState, 100.0f, i0Var);
            int i13 = 0;
            for (Object obj : j16) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                cc2.g gVar = (cc2.g) obj;
                if ((gVar == cc2.g.Q0 && j15 == 0) || (i13 > j16.indexOf(a13) && i13 <= j16.indexOf(a14))) {
                    oe.f.Z0(d14, d13, 100.0f, j15, i0Var, playbackState, H3, gVar, pinId, "");
                }
                i13 = i14;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac2.k kVar = this.f112554m;
        if (kVar == null) {
            Intrinsics.r("audioManager");
            throw null;
        }
        ((ac2.b) kVar).b(this.P);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k1 x33;
        j1 j1Var;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(1.0f);
        }
        float f13 = this.I ? 0.0f : this.H;
        this.H = 0.0f;
        if ((f13 >= 0.8f) && (j1Var = this.G) != null) {
            ((rf1.p0) j1Var).i4();
        }
        if (this.I) {
            this.I = false;
        }
        j1 j1Var2 = this.G;
        if (j1Var2 != null) {
            rf1.p0 p0Var = (rf1.p0) j1Var2;
            if (p0Var.isBound()) {
                p0Var.x3();
                if (c0.d.Z1(p0Var.Z, p0Var.B) && (x33 = p0Var.x3()) != null) {
                    e1 e1Var = (e1) x33;
                    h1 h1Var = e1Var.f112566y;
                    if (h1Var != null) {
                        e1Var.k0(h1Var);
                    }
                    e1Var.f112562u.L();
                }
            }
        }
        this.L = new LinkedHashMap();
        this.G = null;
        h0 h0Var = this.f112559r;
        k0 k0Var = h0Var.f112597v;
        if (k0Var != null) {
            k0Var.f112641e = false;
            k0Var.f112638b.removeCallbacksAndMessages(null);
        }
        h0Var.a0(false);
        getEventManager().d(new dg0.c(dg0.b.DISMISS_UI));
        ac2.k kVar = this.f112554m;
        if (kVar == null) {
            Intrinsics.r("audioManager");
            throw null;
        }
        ((ac2.b) kVar).d(this.P);
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        h1 h1Var = this.f112566y;
        if (h1Var != null) {
            k0(h1Var);
        }
        super.onLayout(z13, i13, i14, i15, i16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r5.B < r0) goto L67;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.getActionMasked()
            r1 = 1
            if (r0 == 0) goto Lb8
            if (r0 == r1) goto L13
            r2 = 3
            if (r0 == r2) goto L13
            goto Lb3
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 != r2) goto L22
            android.view.WindowInsets r3 = r5.getRootWindowInsets()
            android.graphics.Insets r3 = rc0.m.c(r3)
            goto L30
        L22:
            r3 = 30
            if (r0 < r3) goto L2f
            android.view.WindowInsets r3 = r5.getRootWindowInsets()
            android.graphics.Insets r3 = q5.k1.d(r3)
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r0 < r2) goto L53
            if (r3 == 0) goto L53
            android.content.Context r0 = r5.getContext()
            int r0 = hf0.b.j(r0)
            int r2 = rc0.m.a(r3)
            int r0 = r0 - r2
            float r2 = r5.B
            int r3 = rc0.m.u(r3)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb3
            float r2 = r5.B
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lb3
        L53:
            float r0 = r6.getRawX()
            float r2 = r5.B
            float r0 = r0 - r2
            float r2 = r6.getRawY()
            float r3 = r5.C
            float r2 = r2 - r3
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L93
            float r3 = java.lang.Math.abs(r0)
            android.content.Context r4 = r5.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L93
            float r0 = java.lang.Math.abs(r0)
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L93
            sf1.j1 r0 = r5.G
            if (r0 == 0) goto Lb3
            java.lang.String r1 = "side_swipe"
            rf1.p0 r0 = (rf1.p0) r0
            r0.f4(r1)
            goto Lb3
        L93:
            sf1.h1 r0 = r5.f112566y
            if (r0 == 0) goto L9f
            boolean r0 = r0.f112609h
            if (r0 != r1) goto L9f
            r5.g0(r6)
            goto Lb3
        L9f:
            sf1.h0 r0 = r5.f112559r
            sf1.k0 r2 = r0.f112597v
            if (r2 == 0) goto Lad
            boolean r2 = r2.f112642f
            if (r2 != r1) goto Lad
            r0.Z()
            goto Lb0
        Lad:
            r0.X()
        Lb0:
            r0 = 0
            r5.Q = r0
        Lb3:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        Lb8:
            float r0 = r6.getRawX()
            r5.B = r0
            float r6 = r6.getRawY()
            r5.C = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.e1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r0(h32.f1 eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        j1 j1Var = this.G;
        if (j1Var != null) {
            j1.L0(j1Var, eventType, null, null, 14);
        }
    }

    public final void showLoadingSpinner(boolean z13) {
        if (!this.S) {
            this.f112565x.g2(se0.f.LOADING);
            this.f112564w.setVisibility(z13 ? 0 : 8);
        } else {
            s C = this.F.C(this.f112558q.f19924d);
            if (C != null) {
                C.setLoadState(z13 ? yk1.i.LOADING : yk1.i.LOADED);
            }
        }
    }

    public final void t0(boolean z13, boolean z14) {
        h0 h0Var = this.f112559r;
        if (!z13) {
            h0Var.X();
            return;
        }
        k0 k0Var = h0Var.f112597v;
        if (k0Var == null || !k0Var.f112642f) {
            if (h0Var.f112590o.d(this.f112558q.f19924d) == 1.0f && z14) {
                return;
            }
        }
        h0Var.Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z0() {
        /*
            r4 = this;
            qf1.o r0 = r4.f112567z
            androidx.viewpager2.widget.ViewPager2 r1 = r4.f112558q
            r2 = 0
            if (r0 == 0) goto L20
            int r3 = r1.f19924d
            java.util.Map r0 = r0.b()
            if (r0 == 0) goto L1a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r3)
            qf1.i r0 = (qf1.i) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L20
            boolean r0 = r0.f103689b
            goto L21
        L20:
            r0 = r2
        L21:
            int r1 = r1.f19924d
            of1.b r3 = r4.F
            sf1.s1 r1 = r3.D(r1)
            r3 = 1
            if (r1 == 0) goto L2f
            boolean r1 = r1.f112739q
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r0 != 0) goto L34
            if (r1 != 0) goto L35
        L34:
            r2 = r3
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.e1.z0():boolean");
    }
}
