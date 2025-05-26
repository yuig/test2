package oi;

import android.app.ActivityManager;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import com.google.android.gms.internal.measurement.ua;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.x8;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigationrail.NavigationRailView;
import com.google.android.play.core.splitinstall.internal.zzbx;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Mac;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u6 implements q5.v, r5.p, com.google.android.material.internal.h0, yj.a, n.m, ik.e, kk.h, mk.f, cl.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95224a;

    /* renamed from: b, reason: collision with root package name */
    public Object f95225b;

    public u6(int i13) {
        this.f95224a = i13;
        if (i13 != 22) {
            return;
        }
        this.f95225b = new HashSet();
    }

    public static u6 g(com.google.crypto.tink.shaded.protobuf.r rVar) {
        u6 u6Var = rVar.f33685b;
        return u6Var != null ? u6Var : new u6(rVar);
    }

    public final void A(int i13, int i14) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).u0(i13, i14);
    }

    public final void B(int i13, long j13) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).w0(i13, j13);
    }

    public final void C(int i13, int i14) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).D0(i13, (i14 >> 31) ^ (i14 << 1));
    }

    public final void D(int i13, long j13) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).F0(i13, (j13 >> 63) ^ (j13 << 1));
    }

    public final void E(int i13, int i14) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).D0(i13, i14);
    }

    public final void F(int i13, long j13) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).F0(i13, j13);
    }

    public final void G() {
        ((q6) this.f95225b).p();
        g4 n13 = ((q6) this.f95225b).n();
        ((oh.b) ((q6) this.f95225b).zzb()).getClass();
        if (n13.u(System.currentTimeMillis())) {
            ((q6) this.f95225b).n().f94776k.f(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ((q6) this.f95225b).zzj().f95276n.c("Detected application was in foreground");
                ((oh.b) ((q6) this.f95225b).zzb()).getClass();
                I(System.currentTimeMillis(), false);
            }
        }
    }

    public final void H(long j13, boolean z13) {
        ((q6) this.f95225b).p();
        ((q6) this.f95225b).z();
        if (((q6) this.f95225b).n().u(j13)) {
            ((q6) this.f95225b).n().f94776k.f(true);
            ua.a();
            if (((q6) this.f95225b).l().x(null, s.f95122r0)) {
                ((q6) this.f95225b).q().B();
            }
        }
        ((q6) this.f95225b).n().f94780o.b(j13);
        if (((q6) this.f95225b).n().f94776k.g()) {
            I(j13, z13);
        }
    }

    public final void I(long j13, boolean z13) {
        ((q6) this.f95225b).p();
        if (((u4) ((q6) this.f95225b).f24333a).e()) {
            ((q6) this.f95225b).n().f94780o.b(j13);
            ((oh.b) ((q6) this.f95225b).zzb()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y3 zzj = ((q6) this.f95225b).zzj();
            zzj.f95276n.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j14 = j13 / 1000;
            ((q6) this.f95225b).s().I("auto", "_sid", Long.valueOf(j14), j13);
            ((q6) this.f95225b).n().f94781p.b(j14);
            ((q6) this.f95225b).n().f94776k.f(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j14);
            if (((q6) this.f95225b).l().x(null, s.f95104i0) && z13) {
                bundle.putLong("_aib", 1L);
            }
            ((q6) this.f95225b).s().z(j13, bundle, "auto", "_s");
            ((w8) x8.f31706b.get()).getClass();
            if (((q6) this.f95225b).l().x(null, s.f95110l0)) {
                String l13 = ((q6) this.f95225b).n().f94786u.l();
                if (TextUtils.isEmpty(l13)) {
                    return;
                }
                ((q6) this.f95225b).s().z(j13, n60.o.a("_ffr", l13), "auto", "_ssr");
            }
        }
    }

    public final synchronized void J(jk.d dVar) {
        Iterator it = ((Set) this.f95225b).iterator();
        while (it.hasNext()) {
            ((c91.b) ((jk.c) it.next())).b(dVar);
        }
    }

    @Override // kk.h
    public final void a(MessageDigest[] messageDigestArr, long j13, int i13) {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.f95225b)) {
            int i14 = (int) j13;
            ((ByteBuffer) this.f95225b).position(i14);
            ((ByteBuffer) this.f95225b).limit(i14 + i13);
            slice = ((ByteBuffer) this.f95225b).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // yj.a
    public final void b(Typeface typeface) {
        com.google.android.material.internal.c cVar = (com.google.android.material.internal.c) this.f95225b;
        if (cVar.v(typeface)) {
            cVar.n(false);
        }
    }

    @Override // cl.h
    public final cl.i c(byte[] bArr) {
        byte[] J2 = kh2.r.J();
        byte[] x13 = kh2.r.x(J2, bArr);
        byte[] i13 = kh2.r.i1(J2);
        byte[] u13 = kg.t.u(i13, bArr);
        byte[] u14 = kg.t.u(cl.k.f27968m, cl.k.f27957b);
        z.a aVar = (z.a) this.f95225b;
        int macLength = Mac.getInstance(aVar.f140498b).getMacLength();
        Charset charset = el.c1.f59463a;
        byte[] bytes = "eae_prk".getBytes(charset);
        byte[] bArr2 = cl.k.f27970o;
        return new cl.i(aVar.g(macLength, aVar.h(kg.t.u(bArr2, u14, bytes, x13), null), kg.t.u(cl.k.b(2, macLength), bArr2, u14, "shared_secret".getBytes(charset), u13)), i13);
    }

    @Override // com.google.android.material.internal.h0
    public final q5.a2 d(View view, q5.a2 a2Var, l8.p pVar) {
        boolean fitsSystemWindows;
        boolean fitsSystemWindows2;
        boolean fitsSystemWindows3;
        switch (this.f95224a) {
            case 5:
                pVar.f82078d = a2Var.b() + pVar.f82078d;
                WeakHashMap weakHashMap = q5.v0.f102521a;
                boolean z13 = view.getLayoutDirection() == 1;
                int c13 = a2Var.c();
                int d2 = a2Var.d();
                int i13 = pVar.f82075a + (z13 ? d2 : c13);
                pVar.f82075a = i13;
                int i14 = pVar.f82077c;
                if (!z13) {
                    c13 = d2;
                }
                int i15 = i14 + c13;
                pVar.f82077c = i15;
                view.setPaddingRelative(i13, pVar.f82076b, i15, pVar.f82078d);
                break;
            default:
                f5.e f13 = a2Var.f102400a.f(7);
                NavigationRailView navigationRailView = (NavigationRailView) this.f95225b;
                Boolean bool = navigationRailView.f32915h;
                if (bool != null) {
                    fitsSystemWindows = bool.booleanValue();
                } else {
                    WeakHashMap weakHashMap2 = q5.v0.f102521a;
                    fitsSystemWindows = navigationRailView.getFitsSystemWindows();
                }
                if (fitsSystemWindows) {
                    pVar.f82076b += f13.f61082b;
                }
                NavigationRailView navigationRailView2 = (NavigationRailView) this.f95225b;
                Boolean bool2 = navigationRailView2.f32916i;
                if (bool2 != null) {
                    fitsSystemWindows2 = bool2.booleanValue();
                } else {
                    WeakHashMap weakHashMap3 = q5.v0.f102521a;
                    fitsSystemWindows2 = navigationRailView2.getFitsSystemWindows();
                }
                if (fitsSystemWindows2) {
                    pVar.f82078d += f13.f61084d;
                }
                NavigationRailView navigationRailView3 = (NavigationRailView) this.f95225b;
                Boolean bool3 = navigationRailView3.f32917j;
                if (bool3 != null) {
                    fitsSystemWindows3 = bool3.booleanValue();
                } else {
                    WeakHashMap weakHashMap4 = q5.v0.f102521a;
                    fitsSystemWindows3 = navigationRailView3.getFitsSystemWindows();
                }
                if (fitsSystemWindows3) {
                    pVar.f82075a += lb.l0.H0(view) ? f13.f61083c : f13.f61081a;
                }
                int i16 = pVar.f82075a;
                int i17 = pVar.f82076b;
                int i18 = pVar.f82077c;
                int i19 = pVar.f82078d;
                WeakHashMap weakHashMap5 = q5.v0.f102521a;
                view.setPaddingRelative(i16, i17, i18, i19);
                break;
        }
        return a2Var;
    }

    @Override // cl.h
    public final byte[] e() {
        if (Arrays.equals(((z.a) this.f95225b).j(), cl.k.f27961f)) {
            return cl.k.f27957b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // ik.e
    public final void f(ik.f fVar, File file, boolean z13) {
        ((Set) ((m.h) this.f95225b).f85198c).add(file);
        if (z13) {
            return;
        }
        ((AtomicBoolean) ((m.h) this.f95225b).f85199d).set(false);
    }

    @Override // n.m
    public final boolean h(n.o oVar, MenuItem menuItem) {
        switch (this.f95224a) {
            case 16:
                com.google.android.material.navigation.l lVar = (com.google.android.material.navigation.l) this.f95225b;
                int i13 = com.google.android.material.navigation.l.f32907e;
                lVar.getClass();
                ((com.google.android.material.navigation.l) this.f95225b).getClass();
                break;
            default:
                ((NavigationView) this.f95225b).getClass();
                break;
        }
        return false;
    }

    public final void i() {
        ((MaterialButtonToggleGroup) this.f95225b).invalidate();
    }

    @Override // mk.f
    public final jk.d j(jk.d dVar) {
        f0.e eVar = new f0.e(dVar, (qq2.c) this.f95225b);
        int i13 = zzbx.f33522a;
        try {
            return (jk.d) eVar.call();
        } catch (RuntimeException e13) {
            throw e13;
        } catch (Exception e14) {
            throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e14);
        }
    }

    @Override // q5.v
    public final q5.a2 k(View view, q5.a2 a2Var) {
        q5.y1 y1Var = a2Var.f102400a;
        switch (this.f95224a) {
            case 2:
                AppBarLayout appBarLayout = (AppBarLayout) this.f95225b;
                appBarLayout.getClass();
                WeakHashMap weakHashMap = q5.v0.f102521a;
                q5.a2 a2Var2 = appBarLayout.getFitsSystemWindows() ? a2Var : null;
                if (!Objects.equals(appBarLayout.f32105g, a2Var2)) {
                    appBarLayout.f32105g = a2Var2;
                    if (appBarLayout.f32119u != null && appBarLayout.g() > 0) {
                        r8 = true;
                    }
                    appBarLayout.setWillNotDraw(!r8);
                    appBarLayout.requestLayout();
                }
                return a2Var;
            case 3:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f95225b;
                collapsingToolbarLayout.getClass();
                WeakHashMap weakHashMap2 = q5.v0.f102521a;
                if (!collapsingToolbarLayout.getFitsSystemWindows()) {
                    a2Var = null;
                }
                if (!Objects.equals(collapsingToolbarLayout.f32162z, a2Var)) {
                    collapsingToolbarLayout.f32162z = a2Var;
                    collapsingToolbarLayout.requestLayout();
                }
                return y1Var.c();
            case 4:
            case 5:
            default:
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = (ScrimInsetsFrameLayout) this.f95225b;
                if (scrimInsetsFrameLayout.f32685b == null) {
                    scrimInsetsFrameLayout.f32685b = new Rect();
                }
                ((ScrimInsetsFrameLayout) this.f95225b).f32685b.set(a2Var.c(), a2Var.e(), a2Var.d(), a2Var.b());
                ((ScrimInsetsFrameLayout) this.f95225b).a(a2Var);
                ((ScrimInsetsFrameLayout) this.f95225b).setWillNotDraw(!(y1Var.j().equals(f5.e.f61080e) ^ true) || ((ScrimInsetsFrameLayout) this.f95225b).f32684a == null);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = (ScrimInsetsFrameLayout) this.f95225b;
                WeakHashMap weakHashMap3 = q5.v0.f102521a;
                scrimInsetsFrameLayout2.postInvalidateOnAnimation();
                return y1Var.c();
            case 6:
                kj.h hVar = (kj.h) this.f95225b;
                kj.g gVar = hVar.f79842m;
                if (gVar != null) {
                    hVar.f79835f.X.remove(gVar);
                }
                kj.h hVar2 = (kj.h) this.f95225b;
                hVar2.f79842m = new kj.g(hVar2.f79838i, a2Var);
                kj.h hVar3 = (kj.h) this.f95225b;
                hVar3.f79842m.e(hVar3.getWindow());
                kj.h hVar4 = (kj.h) this.f95225b;
                hVar4.f79835f.C(hVar4.f79842m);
                return a2Var;
        }
    }

    @Override // r5.p
    public final boolean l(View view) {
        if (!((SwipeDismissBehavior) this.f95225b).C(view)) {
            return false;
        }
        WeakHashMap weakHashMap = q5.v0.f102521a;
        boolean z13 = view.getLayoutDirection() == 1;
        int i13 = ((SwipeDismissBehavior) this.f95225b).f32243d;
        view.offsetLeftAndRight((!(i13 == 0 && z13) && (i13 != 1 || z13)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f95225b).getClass();
        return true;
    }

    public final void m(Drawable drawable) {
        switch (this.f95224a) {
            case 14:
                com.google.android.material.internal.f0 f0Var = (com.google.android.material.internal.f0) this.f95225b;
                ArrayList arrayList = f0Var.f32763a;
                if (arrayList != null) {
                    arrayList.remove(drawable);
                    f0Var.invalidate(drawable.getBounds());
                    drawable.setCallback(null);
                    if (f0Var.getChildCount() == 0) {
                        ArrayList arrayList2 = f0Var.f32763a;
                        if (arrayList2 == null || arrayList2.size() == 0) {
                            f0Var.f32764b = true;
                            throw null;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ViewOverlay) this.f95225b).remove(drawable);
                return;
        }
    }

    public final void n(Object obj, Object obj2) {
        try {
            ((Field) this.f95225b).set(obj, obj2);
        } catch (IllegalAccessException e13) {
            throw new AssertionError(e13);
        }
    }

    public final void o(int i13, boolean z13) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).s0(i13, z13);
    }

    public final void p(int i13, com.google.crypto.tink.shaded.protobuf.k kVar) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).t0(i13, kVar);
    }

    public final void q(int i13, double d2) {
        com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) this.f95225b;
        rVar.getClass();
        rVar.w0(i13, Double.doubleToRawLongBits(d2));
    }

    public final void r(int i13, int i14) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).y0(i13, i14);
    }

    public final void s(int i13, int i14) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).u0(i13, i14);
    }

    public final void t(int i13, long j13) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).w0(i13, j13);
    }

    public final void u(int i13, float f13) {
        com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) this.f95225b;
        rVar.getClass();
        rVar.u0(i13, Float.floatToRawIntBits(f13));
    }

    public final void v(int i13, com.google.crypto.tink.shaded.protobuf.q1 q1Var, Object obj) {
        com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) this.f95225b;
        rVar.C0(i13, 3);
        q1Var.j((com.google.crypto.tink.shaded.protobuf.b) obj, rVar.f33685b);
        rVar.C0(i13, 4);
    }

    @Override // n.m
    public final void w(n.o oVar) {
    }

    public final void x(int i13, int i14) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).y0(i13, i14);
    }

    public final void y(int i13, long j13) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).F0(i13, j13);
    }

    public final void z(int i13, com.google.crypto.tink.shaded.protobuf.q1 q1Var, Object obj) {
        ((com.google.crypto.tink.shaded.protobuf.r) this.f95225b).A0(i13, (com.google.crypto.tink.shaded.protobuf.b) obj, q1Var);
    }

    @Override // kk.h
    public final long zza() {
        return ((ByteBuffer) this.f95225b).capacity();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(materialButtonToggleGroup, 7);
        this.f95224a = 7;
    }

    public /* synthetic */ u6(Object obj, int i13) {
        this.f95224a = i13;
        this.f95225b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(Field field, int i13) {
        this(field);
        this.f95224a = 25;
    }

    public u6(ByteBuffer byteBuffer) {
        this.f95224a = 21;
        this.f95225b = byteBuffer.slice();
    }

    public u6(wi.r error) {
        this.f95224a = 1;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f95225b = error;
    }

    public u6(ViewGroup viewGroup) {
        this.f95224a = 15;
        this.f95225b = viewGroup.getOverlay();
    }

    public u6(com.google.crypto.tink.shaded.protobuf.r rVar) {
        this.f95224a = 28;
        com.google.crypto.tink.shaded.protobuf.l0.a(rVar, "output");
        this.f95225b = rVar;
        rVar.f33685b = this;
    }

    public u6(Field field) {
        this.f95224a = 25;
        this.f95225b = field;
        field.setAccessible(true);
    }

    public u6(SwipeDismissBehavior swipeDismissBehavior) {
        this.f95224a = 19;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f32245f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f32246g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f32243d = 0;
    }
}
