package rf1;

import android.util.LruCache;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cp0;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn0;
import com.pinterest.api.model.lq0;
import com.pinterest.api.model.mq0;
import com.pinterest.api.model.oo0;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.qk0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.sq0;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.vq0;
import com.pinterest.api.model.wo0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zk0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.storypin.closeup.view.IdeaPinHideView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.repository.pin.PinService;
import com.pinterest.screens.e2;
import ey.q4;
import ey.r4;
import ey.s4;
import h32.c1;
import h32.d4;
import h32.f1;
import h32.h2;
import h32.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kh2.u2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.u1;
import lh0.z3;
import nx.d1;
import nx.x0;
import nx.z0;
import sf1.e1;
import sf1.j1;
import sf1.k1;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class p0 extends yk1.c implements j1 {
    public final xr.a A;
    public final xk2.k A0;
    public final es.a B;
    public final i0 B0;
    public final nx.b0 C;
    public final g0 C0;
    public final ur.a D;
    public final n0 D0;
    public final es.h E;
    public final e0 E0;
    public as1.b F;
    public final d0 F0;
    public final Map G;
    public final f0 G0;
    public final t0 H;
    public final j0 H0;
    public final u0 I;
    public boolean I0;

    /* renamed from: J, reason: collision with root package name */
    public final Function0 f107826J;
    public final h0 J0;
    public final Function0 K;
    public final xk2.k K0;
    public final a L;
    public final w L0;
    public final boolean M;
    public final xk2.k M0;
    public final mf1.a N;
    public String N0;
    public final sf1.u0 O;
    public final a11.b P;
    public final xj2.b Q;
    public final xk2.k R;
    public nk1.m S;
    public s60.d T;
    public h32.i0 U;
    public nf1.a V;
    public ek2.j W;
    public final xj2.b X;
    public String Y;
    public f30 Z;

    /* renamed from: a, reason: collision with root package name */
    public final yk1.v f107827a;

    /* renamed from: a0, reason: collision with root package name */
    public vh f107828a0;

    /* renamed from: b, reason: collision with root package name */
    public final h22.c f107829b;

    /* renamed from: b0, reason: collision with root package name */
    public rg0.n f107830b0;

    /* renamed from: c, reason: collision with root package name */
    public final g f107831c;

    /* renamed from: c0, reason: collision with root package name */
    public wy0 f107832c0;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f107833d;

    /* renamed from: d0, reason: collision with root package name */
    public final ArrayList f107834d0;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f107835e;

    /* renamed from: e0, reason: collision with root package name */
    public int f107836e0;

    /* renamed from: f, reason: collision with root package name */
    public final PinService f107837f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f107838f0;

    /* renamed from: g, reason: collision with root package name */
    public final bz.i f107839g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f107840g0;

    /* renamed from: h, reason: collision with root package name */
    public final m60.w f107841h;

    /* renamed from: h0, reason: collision with root package name */
    public int f107842h0;

    /* renamed from: i, reason: collision with root package name */
    public final rg0.s f107843i;

    /* renamed from: i0, reason: collision with root package name */
    public int f107844i0;

    /* renamed from: j, reason: collision with root package name */
    public final zf0.f f107845j;

    /* renamed from: j0, reason: collision with root package name */
    public qf1.o f107846j0;

    /* renamed from: k, reason: collision with root package name */
    public final vr0.a f107847k;

    /* renamed from: k0, reason: collision with root package name */
    public int f107848k0;

    /* renamed from: l, reason: collision with root package name */
    public final tb0.h f107849l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f107850l0;

    /* renamed from: m, reason: collision with root package name */
    public final u1 f107851m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f107852m0;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f107853n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f107854n0;

    /* renamed from: o, reason: collision with root package name */
    public final il1.a f107855o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f107856o0;

    /* renamed from: p, reason: collision with root package name */
    public final so.u f107857p;

    /* renamed from: p0, reason: collision with root package name */
    public long f107858p0;

    /* renamed from: q, reason: collision with root package name */
    public final pb0.a f107859q;

    /* renamed from: q0, reason: collision with root package name */
    public long f107860q0;

    /* renamed from: r, reason: collision with root package name */
    public final a11.d f107861r;

    /* renamed from: r0, reason: collision with root package name */
    public long f107862r0;

    /* renamed from: s, reason: collision with root package name */
    public final x10.b f107863s;

    /* renamed from: s0, reason: collision with root package name */
    public long f107864s0;

    /* renamed from: t, reason: collision with root package name */
    public final i92.k f107865t;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashMap f107866t0;

    /* renamed from: u, reason: collision with root package name */
    public final gs0.k f107867u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f107868u0;

    /* renamed from: v, reason: collision with root package name */
    public final e02.a f107869v;

    /* renamed from: v0, reason: collision with root package name */
    public s f107870v0;

    /* renamed from: w, reason: collision with root package name */
    public final b60.b f107871w;

    /* renamed from: w0, reason: collision with root package name */
    public final Function0 f107872w0;

    /* renamed from: x, reason: collision with root package name */
    public final k11.p f107873x;

    /* renamed from: x0, reason: collision with root package name */
    public cc2.p f107874x0;

    /* renamed from: y, reason: collision with root package name */
    public final ag1.f f107875y;

    /* renamed from: y0, reason: collision with root package name */
    public final String f107876y0;

    /* renamed from: z, reason: collision with root package name */
    public final nk1.l f107877z;

    /* renamed from: z0, reason: collision with root package name */
    public final xk2.v f107878z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0(rf1.q0 r18, yk1.v r19, h22.c r20, rf1.g r21, x02.i2 r22, x02.x2 r23, com.pinterest.repository.pin.PinService r24, bz.i r25, m60.w r26, rg0.s r27, zf0.f r28, vr0.a r29, tb0.h r30, lh0.u1 r31, nx.d1 r32, uj2.q r33, il1.a r34, so.u r35, pb0.a r36, a11.d r37, x10.b r38, i92.k r39, gs0.k r40, e02.a r41, b60.b r42, k11.p r43, ag1.f r44, nk1.l r45, xr.a r46, es.a r47, androidx.appcompat.widget.c2 r48, nx.b0 r49, ur.a r50, es.h r51) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.<init>(rf1.q0, yk1.v, h22.c, rf1.g, x02.i2, x02.x2, com.pinterest.repository.pin.PinService, bz.i, m60.w, rg0.s, zf0.f, vr0.a, tb0.h, lh0.u1, nx.d1, uj2.q, il1.a, so.u, pb0.a, a11.d, x10.b, i92.k, gs0.k, e02.a, b60.b, k11.p, ag1.f, nk1.l, xr.a, es.a, androidx.appcompat.widget.c2, nx.b0, ur.a, es.h):void");
    }

    public static String D3(dl1.s sVar) {
        List<ro0> o13;
        Object obj;
        if (!(sVar instanceof wo0) || (o13 = ((wo0) sVar).f43310a.o()) == null) {
            return null;
        }
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        b0 b0Var = new b0(0, j0Var);
        for (ro0 ro0Var : o13) {
            if (ro0Var != null && Intrinsics.d(ro0Var.a(b0Var), Boolean.TRUE) && (obj = j0Var.f80434a) != null) {
                return (String) obj;
            }
        }
        return null;
    }

    public static void F4(p0 p0Var, String str, f30 f30Var, boolean z13) {
        f30 f30Var2;
        p0Var.f107852m0 = z13;
        p0Var.f107854n0 = false;
        if (str == null && f30Var == null) {
            throw new IllegalStateException("Must provide either valid Story Pin ID or Story Pin.");
        }
        String f39332b = str == null ? f30Var != null ? f30Var.getF39332b() : null : str;
        if (!z13 && Intrinsics.d(f39332b, p0Var.u4())) {
            p0Var.z4();
            return;
        }
        if (p0Var.isBound()) {
            p0Var.clearDisposables();
        }
        p0Var.f107870v0 = s.INITIAL;
        p0Var.Y = null;
        p0Var.Z = null;
        p0Var.f107832c0 = null;
        p0Var.f107834d0.clear();
        p0Var.f107828a0 = null;
        p0Var.f107830b0 = null;
        p0Var.f107836e0 = 0;
        p0Var.f107838f0 = false;
        p0Var.f107842h0 = 0;
        p0Var.f107846j0 = null;
        p0Var.f107840g0 = !((s0) p0Var.f107826J.invoke()).f107898c;
        p0Var.B4(f30Var, str);
        p0Var.N0 = null;
        if (S3(p0Var) && (f30Var2 = p0Var.Z) != null && Intrinsics.d(f30Var2.d5(), Boolean.FALSE)) {
            p0Var.V3(p0Var.Z);
        } else {
            p0Var.U3(f30Var, str, p0Var.f107852m0);
        }
    }

    public static boolean S3(p0 p0Var) {
        f30 f30Var = p0Var.Z;
        p0Var.getClass();
        if (f30Var != null) {
            return b40.X0(f30Var);
        }
        return false;
    }

    public static boolean s3(p0 p0Var) {
        f30 f30Var = p0Var.Z;
        if (f30Var != null) {
            return (((es.c) p0Var.B).U(f30Var) || c0.d.g2(f30Var) || !p0Var.H.f107908f || p0Var.R3() || f30Var.q5().booleanValue()) ? false : true;
        }
        p0Var.getClass();
        return false;
    }

    public static boolean s4(p0 p0Var) {
        return p0Var.t4() && !p0Var.x4(p0Var.f107842h0);
    }

    public final h32.g0 B3() {
        return S3(this) ? h32.g0.PIN_CLOSEUP_VIDEO : h32.g0.PIN_STORY_PIN_BODY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, r8) == true) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B4(com.pinterest.api.model.f30 r7, java.lang.String r8) {
        /*
            r6 = this;
            if (r8 == 0) goto Lc
            java.lang.String r0 = r6.Y
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r8, r0)
            if (r0 != 0) goto Lc
            r6.Y = r8
        Lc:
            if (r7 == 0) goto L31
            com.pinterest.api.model.f30 r0 = r6.Z
            com.pinterest.api.model.f30 r0 = r6.r4(r7, r0)
            r6.Z = r0
            xk2.k r0 = r6.K0
            java.lang.Object r0 = r0.getValue()
            oq.b r0 = (oq.b) r0
            java.lang.String r1 = r6.F3(r7)
            r0.f96955a = r1
            com.pinterest.api.model.wy0 r0 = qf1.p.c(r7)
            if (r0 == 0) goto L2e
            r1 = 0
            r6.M3(r0, r1)
        L2e:
            r6.z4()
        L31:
            r0 = 0
            if (r8 != 0) goto L3c
            if (r7 == 0) goto L3b
            java.lang.String r8 = r7.getF39332b()
            goto L3c
        L3b:
            r8 = r0
        L3c:
            if (r8 == 0) goto Lc3
            h32.i0 r1 = r6.U
            if (r1 == 0) goto L49
            h32.x3 r1 = r1.f67083c
            if (r1 == 0) goto L49
            java.lang.String r1 = r1.f67402f
            goto L4a
        L49:
            r1 = r0
        L4a:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r8)
            java.lang.String r2 = "generateLoggingContext(...)"
            kotlin.jvm.functions.Function0 r3 = r6.f107872w0
            if (r1 != 0) goto L65
            java.lang.Object r1 = r3.invoke()
            uk1.d r1 = (uk1.d) r1
            r1.f122380b = r8
            h32.i0 r1 = r1.generateLoggingContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r6.U = r1
        L65:
            nf1.a r1 = r6.V
            r4 = 1
            if (r1 == 0) goto L83
            h32.i0 r5 = r1.f90483b
            if (r5 != 0) goto L74
            nx.d0 r1 = r1.f90482a
            h32.i0 r5 = r1.p()
        L74:
            if (r5 == 0) goto L7c
            h32.x3 r1 = r5.f67083c
            if (r1 == 0) goto L7c
            java.lang.String r0 = r1.f67402f
        L7c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r8)
            if (r0 != r4) goto L83
            goto La5
        L83:
            nx.d0 r0 = r6.getPinalytics()
            java.lang.Object r1 = r3.invoke()
            uk1.d r1 = (uk1.d) r1
            r1.f122380b = r8
            h32.i0 r1 = r1.generateLoggingContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            bz.i r2 = r6.f107839g
            r2.f24187e = r4
            r2.f24188f = r4
            kotlin.Unit r3 = kotlin.Unit.f80348a
            nf1.a r3 = new nf1.a
            r3.<init>(r0, r1, r2)
            r6.V = r3
        La5:
            boolean r7 = c0.d.g2(r7)
            if (r7 == 0) goto Lc3
            int r7 = r6.f107836e0
            java.util.LinkedHashMap r0 = com.pinterest.api.model.d7.f36665a
            java.lang.String r0 = "pinId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.LinkedHashMap r0 = com.pinterest.api.model.d7.f36665a
            boolean r1 = r0.containsKey(r8)
            if (r1 != 0) goto Lc3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r8, r7)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.B4(com.pinterest.api.model.f30, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r9 < r0.f48564g) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C4(int r9) {
        /*
            r8 = this;
            boolean r0 = r8.isBound()
            if (r0 == 0) goto Lb7
            int r0 = r9 + (-1)
            java.lang.String r1 = "indices"
            r2 = 1
            r3 = 0
            if (r0 < 0) goto L8a
            sf1.k1 r4 = r8.x3()
            if (r4 == 0) goto Lb7
            sf1.e1 r4 = (sf1.e1) r4
            sf1.h0 r5 = r4.f112559r
            com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber r6 = r5.f112590o
            if (r0 < 0) goto L24
            int r7 = r6.f48564g
            if (r0 >= r7) goto L22
            r7 = r2
            goto L28
        L22:
            r7 = r3
            goto L28
        L24:
            r6.getClass()
            goto L22
        L28:
            if (r7 == 0) goto L39
            kotlin.ranges.IntRange r7 = new kotlin.ranges.IntRange
            r7.<init>(r3, r0, r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.F0(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r6.f(r0, r2)
        L39:
            if (r9 < 0) goto L4d
            int r0 = r6.f48564g
            if (r9 >= r0) goto L4d
            kotlin.ranges.IntRange r0 = ql2.s.q(r9, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.F0(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r6.f(r0, r3)
        L4d:
            com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber r0 = r5.f112590o
            java.util.ArrayList r1 = r0.f48568k
            int r1 = r1.size()
            java.lang.String r2 = r8.u4()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "-"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            nc2.h r3 = nc2.h.f90405a
            nc2.l r2 = nc2.h.a(r2)
            long r2 = r2.f90410b
            if (r1 <= 0) goto Lb7
            if (r9 >= r1) goto Lb7
            r5 = 0
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb7
            float r1 = (float) r2
            long r2 = r0.b(r9)
            float r0 = (float) r2
            float r1 = r1 / r0
            r4.I0(r9, r1)
            goto Lb7
        L8a:
            if (r9 != 0) goto Lb7
            sf1.k1 r0 = r8.x3()
            if (r0 == 0) goto Lb7
            sf1.e1 r0 = (sf1.e1) r0
            sf1.h0 r0 = r0.f112559r
            com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber r0 = r0.f112590o
            if (r9 < 0) goto La1
            int r4 = r0.f48564g
            if (r9 >= r4) goto L9f
            goto La5
        L9f:
            r2 = r3
            goto La5
        La1:
            r0.getClass()
            goto L9f
        La5:
            if (r2 == 0) goto Lb7
            int r2 = r0.f48564g
            kotlin.ranges.IntRange r9 = ql2.s.q(r9, r2)
            java.util.List r9 = kotlin.collections.CollectionsKt.F0(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            r0.f(r9, r3)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.C4(int):void");
    }

    public final void D4(wy0 wy0Var) {
        String str;
        ek2.j jVar;
        String f39332b = wy0Var.getF39332b();
        nk1.m mVar = this.S;
        if (mVar != null) {
            str = mVar.f91112a.getF39332b();
            Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
        } else {
            str = null;
        }
        if (Intrinsics.d(f39332b, str)) {
            return;
        }
        nk1.m mVar2 = new nk1.m(wy0Var, new nk1.g(getPinalytics(), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), this.f107877z.a(false), null, null, null, this.f107835e, this.f107853n, null, 1656);
        ek2.j jVar2 = this.W;
        if (jVar2 != null && !jVar2.isDisposed() && (jVar = this.W) != null) {
            bk2.c.dispose(jVar);
        }
        this.W = null;
        this.W = (ek2.j) mVar2.h().F(new j(20, new z(this, 6)), new j(21, l.f107775s), ck2.i.f27923c, ck2.i.f27924d);
        this.S = mVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:448:0x027f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2, r3) != false) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029c  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E4(com.pinterest.api.model.f30 r39, java.util.List r40) {
        /*
            Method dump skipped, instructions count: 2615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.E4(com.pinterest.api.model.f30, java.util.List):void");
    }

    public final String F3(f30 f30Var) {
        if (f30Var == null) {
            return null;
        }
        String f39332b = f30Var.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        return this.f107853n.c(f39332b);
    }

    public final String G3(int i13) {
        uo0 uo0Var;
        Object U = CollectionsKt.U(i13, this.f107834d0);
        wo0 wo0Var = U instanceof wo0 ? (wo0) U : null;
        if (wo0Var == null || (uo0Var = wo0Var.f43310a) == null) {
            return null;
        }
        return uo0Var.v();
    }

    public final cc2.c H3() {
        nx.d0 pinalytics = getPinalytics();
        z0 z0Var = new z0();
        if (!((es.c) this.B).M(this.Z)) {
            z0Var.put("story_pin_page_id", String.valueOf(this.f107842h0));
        }
        z0Var.put("idea_pin_session_id", this.f107876y0);
        z0Var.put("video_play_type", "autoadvance_image");
        z0Var.put("is_closeup_video", "true");
        return new cc2.c(pinalytics, z0Var, this.f107853n);
    }

    public final HashMap H4() {
        HashMap hashMap = ((v0) this.K.invoke()).f107920c;
        q3(this.f107842h0, hashMap);
        return hashMap;
    }

    public final void I3(int i13, boolean z13) {
        if (isBound() && this.f107856o0) {
            k1 x33 = x3();
            if (x33 != null) {
                ((e1) x33).d0(i13, z13);
            }
            C4(i13);
        }
    }

    public final void J3(wy0 wy0Var, String str) {
        f30 f30Var = this.Z;
        if (f30Var == null || !Intrinsics.d(f30Var.k5(), Boolean.TRUE)) {
            r41.k kVar = r41.k.f106176a;
            NavigationImpl a13 = r41.k.a(wy0Var);
            if (a13 != null) {
                nx.d0 pinalytics = getPinalytics();
                f1 f1Var = f1.NAVIGATION;
                h32.u0 u0Var = h32.u0.ADS_ONLY_PROFILE_EXTERNAL;
                HashMap o13 = ep.b.o("aop_origin", "StoryPinDisplay");
                Unit unit = Unit.f80348a;
                pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            } else {
                a13 = r41.k.c(kVar, str, r41.b.StoryPinDisplay, null, null, 28);
                a13.m0("com.pinterest.EXTRA_PIN_ID", u4());
            }
            this.f107841h.d(a13);
            this.f107870v0 = s.DO_NOT_RESTART;
        }
    }

    public final void K3(wy0 wy0Var, h32.g0 g0Var, h32.u0 u0Var, String str) {
        h32.v0 v0Var;
        nx.d0 pinalytics = getPinalytics();
        HashMap hashMap = ((s0) this.f107826J.invoke()).f107899d;
        String u43 = u4();
        if (u43 == null) {
            u43 = "";
        }
        hashMap.put("pin_id", u43);
        hashMap.put("creator_id", str);
        Unit unit = Unit.f80348a;
        String F3 = F3(this.Z);
        if (F3 != null) {
            h32.v0 v0Var2 = new h32.v0();
            v0Var2.G = F3;
            v0Var = v0Var2;
        } else {
            v0Var = null;
        }
        pinalytics.J(u0Var, g0Var, null, hashMap, v0Var, false);
        J3(wy0Var, str);
    }

    public final void L3(ScreenLocation screenLocation, String str, qk0 qk0Var, Function1 function1) {
        Boolean bool;
        NavigationImpl L;
        if (isBound()) {
            f30 f30Var = this.Z;
            if (f30Var == null || !Intrinsics.d(f30Var.k5(), Boolean.TRUE)) {
                f30 f30Var2 = this.Z;
                if (f30Var2 == null || (bool = f30Var2.d5()) == null) {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue() || hf0.b.q()) {
                    L = Navigation.L(screenLocation, str, ml1.b.NO_TRANSITION.getValue());
                    if (qk0Var != null) {
                        L.e(qk0Var);
                    }
                    function1.invoke(L);
                    if (hf0.b.q()) {
                        L.z(((e1) ((k1) getView())).f112547f.f112720a, "com.pinterest.EXTRA_STORY_PIN_PAGE_WIDTH");
                    }
                    Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
                } else {
                    L = Navigation.z0((ScreenLocation) e2.f50697c.getValue(), str);
                    function1.invoke(L);
                    L.Y1("com.pinterest.EXTRA_NAVIGATION_IS_COMING_FROM_IDEA_STREAM", true);
                }
                this.f107841h.d(L);
            }
        }
    }

    public final void M3(wy0 wy0Var, boolean z13) {
        wy0 wy0Var2 = this.f107832c0;
        wy0 creator = wy0Var2 != null ? wy0Var2.G4(wy0Var) : wy0Var;
        if (z13) {
            Intrinsics.f(creator);
            f30 f30Var = this.Z;
            if (f30Var != null) {
                Intrinsics.checkNotNullParameter(f30Var, "<this>");
                Intrinsics.checkNotNullParameter(creator, "creator");
                if (b40.n(f30Var) != null || bs1.c.O0(f30Var) != null) {
                    f30Var = c0.d.X2(f30Var, creator);
                }
                this.f107833d.W(f30Var);
            }
        }
        this.f107832c0 = creator;
        D4(wy0Var);
        this.T = new s60.d(new s60.c(getPinalytics(), null, wy0Var.getF39332b(), 58), this.f107835e);
    }

    public final void N3(f30 f30Var) {
        oo0 oo0Var = new oo0(0);
        oo0Var.f40767h = Integer.valueOf(cp0.COVER.getType());
        boolean[] zArr = oo0Var.f40774o;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
        oo0Var.f40769j = f30Var.p6();
        boolean[] zArr2 = oo0Var.f40774o;
        if (zArr2.length > 9) {
            zArr2[9] = true;
        }
        oo0Var.f40768i = f30Var.y5();
        boolean[] zArr3 = oo0Var.f40774o;
        if (zArr3.length > 8) {
            zArr3[8] = true;
        }
        sq0 sq0Var = new sq0(0);
        b01 M6 = f30Var.M6();
        sq0Var.c(M6 != null ? M6.g() : null);
        oo0Var.f40772m = sq0Var.a();
        boolean[] zArr4 = oo0Var.f40774o;
        if (zArr4.length > 12) {
            zArr4[12] = true;
        }
        mq0 mq0Var = new mq0(0);
        Integer valueOf = Integer.valueOf(a42.f.VIDEO.getValue());
        mq0Var.f40191a = valueOf;
        boolean[] zArr5 = mq0Var.f40196f;
        if (zArr5.length > 0) {
            zArr5[0] = true;
        }
        zk0 zk0Var = h22.g.f66584a;
        mq0Var.f40192b = zk0Var;
        if (zArr5.length > 1) {
            zArr5[1] = true;
        }
        vq0 vq0Var = oo0Var.f40772m;
        mq0Var.f40194d = vq0Var;
        if (zArr5.length > 3) {
            zArr5[3] = true;
        }
        pq0 pq0Var = new pq0(valueOf, zk0Var, mq0Var.f40193c, vq0Var, mq0Var.f40195e, zArr5, 0);
        Intrinsics.checkNotNullExpressionValue(pq0Var, "build(...)");
        oo0Var.c(kotlin.collections.e0.b(new ro0(pq0Var)));
        uo0 a13 = oo0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        E4(f30Var, kotlin.collections.e0.b(new wo0(a13, 0, f30Var, null, null, null, null, null, null, true, null, 1528, null)));
    }

    public final boolean Q3() {
        Object obj;
        Iterator it = this.f107834d0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dl1.s) obj) instanceof gn0) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean R3() {
        String u43 = u4();
        Map map = this.G;
        gb2.i iVar = (gb2.i) map.get(u43);
        if ((iVar != null ? iVar.f64754b : null) != wa2.p.STATE_HIDDEN) {
            gb2.i iVar2 = (gb2.i) map.get(u43);
            if ((iVar2 != null ? iVar2.f64754b : null) != wa2.p.STATE_HIDDEN_CREATOR) {
                return false;
            }
        }
        return true;
    }

    public final void T3(f30 f30Var, String source) {
        this.f107862r0 = ((pb0.g) this.f107859q).a();
        nx.d0 pinalytics = getPinalytics();
        String id3 = f30Var.getF39332b();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        int i13 = this.f107836e0;
        es.c cVar = (es.c) this.B;
        Integer g13 = cVar.g(f30Var);
        Intrinsics.checkNotNullParameter(pinalytics, "<this>");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        f1 f1Var = f1.PIN_CLICK;
        HashMap f13 = kotlin.collections.z0.f(new Pair("grid_index", String.valueOf(i13)), new Pair("click_type", "clickthrough"), new Pair("clickthrough_source", source), new Pair("closeup_navigation_type", nq.b.CLICK.getType()));
        if (g13 != null) {
            f13.put("grid_click_type", String.valueOf(g13.intValue()));
        }
        pinalytics.g(f1Var, id3, f13, false);
        if (cVar.l0(f30Var)) {
            this.A.a(f30Var, true);
        }
        a11.n a13 = this.f107861r.a(getPinalytics());
        ps0.y yVar = ro1.c.f108967f;
        String D = com.bumptech.glide.c.D(f30Var);
        if (D == null) {
            D = "";
        }
        ro1.b oneTapType = ps0.y.e(D);
        Intrinsics.checkNotNullParameter(oneTapType, "oneTapType");
        addDisposable(a11.e.d(a13, f30Var, (oneTapType == ro1.b.WEB ? ml1.b.MODAL_TRANSITION : ml1.b.DEFAULT_TRANSITION).getValue(), this.f107836e0, null, cVar.U(f30Var) && this.P == a11.b.Feed, 80));
    }

    public final void U3(f30 f30Var, String str, boolean z13) {
        String u43;
        String pinUid;
        if (isBound()) {
            List list = null;
            if (this.M) {
                if (str == null) {
                    pinUid = f30Var != null ? f30Var.getF39332b() : null;
                    if (pinUid == null) {
                        pinUid = "";
                    }
                } else {
                    pinUid = str;
                }
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                new q4(pinUid).i();
            }
            if (b40.G0(f30Var)) {
                u1 u1Var = this.f107851m;
                u1Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) u1Var.f83486a;
                if ((g1Var.o("closeup_optimize_single_page_idea_pin_data_loading", "enabled", z3Var) || g1Var.l("closeup_optimize_single_page_idea_pin_data_loading")) && f30Var != null) {
                    dl0 v63 = f30Var.v6();
                    if (v63 != null) {
                        String f39332b = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                        list = u2.U(v63, true, f39332b);
                    }
                    if (list == null) {
                        W3(f30Var, str, z13);
                    } else {
                        h22.d dVar = new h22.d(f30Var, u2.e1(f30Var, list));
                        String f39332b2 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                        new ey.v0(f39332b2, s4.PAGES_PREVIEW).i();
                        k4(str, f30Var, dVar);
                    }
                    if (z13 && this.f107854n0 && isBound() && (u43 = u4()) != null) {
                        addDisposable(new jk2.x(this.f107833d.Q(u43), new d51.a(22, new qf1.z(u43, 3)), 2).F(new j(24, new z(this, 11)), new j(25, l.f107778v), ck2.i.f27923c, ck2.i.f27924d));
                        return;
                    }
                    return;
                }
            }
            W3(f30Var, str, z13);
            if (z13) {
            }
        }
    }

    public final void V3(f30 f30Var) {
        wy0 n13;
        String f39332b;
        if (f30Var == null) {
            return;
        }
        B4(f30Var, f30Var.getF39332b());
        if (isBound()) {
            N3(f30Var);
            if (!isBound() || (n13 = b40.n(f30Var)) == null || (f39332b = n13.getF39332b()) == null) {
                return;
            }
            addDisposable(new jk2.x(this.f107835e.e0().Q(f39332b), new d51.a(21, new z(this, 12)), 2).F(new j(10, new z(this, 13)), new j(11, l.f107779w), ck2.i.f27923c, ck2.i.f27924d));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W3(com.pinterest.api.model.f30 r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            h22.c r2 = r8.f107829b
            if (r9 == 0) goto L71
            r2.getClass()
            java.lang.String r1 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            boolean r1 = com.pinterest.api.model.b40.G0(r9)
            if (r1 == 0) goto L2f
            lh0.d3 r1 = r2.f66578d
            r1.getClass()
            lh0.z3 r3 = lh0.a4.f83298b
            lh0.z0 r1 = r1.f83331a
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r4 = "enabled"
            java.lang.String r5 = "closeup_optimize_single_page_idea_pin_data_loading"
            boolean r3 = r1.o(r5, r4, r3)
            if (r3 != 0) goto L2e
            boolean r1 = r1.l(r5)
            if (r1 == 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            com.pinterest.api.model.dl0 r1 = r9.v6()
            if (r1 == 0) goto L44
            java.lang.String r3 = r9.getF39332b()
            java.lang.String r4 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.List r0 = kh2.u2.U(r1, r0, r3)
            if (r0 != 0) goto L46
        L44:
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
        L46:
            jk2.i1 r0 = uj2.q.y(r0)
            java.lang.String r1 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            uj2.a0 r1 = wj2.c.a()
            jk2.x r0 = r0.H(r1)
            u1.c r7 = new u1.c
            r6 = 3
            r4 = 1
            r1 = r7
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            b22.f r11 = new b22.f
            r1 = 7
            r11.<init>(r1, r7)
            uj2.q r11 = r0.t(r11)
            java.lang.String r0 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            goto L7c
        L71:
            if (r10 == 0) goto L7a
            kotlin.collections.q0 r11 = kotlin.collections.q0.f80391a
            jk2.j1 r11 = r2.b(r10, r11, r0)
            goto L7c
        L7a:
            jk2.h0 r11 = jk2.h0.f76488a
        L7c:
            uj2.a0 r0 = wj2.c.a()
            jk2.l1 r11 = r11.A(r0)
            java.lang.String r0 = "observeOn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            ed1.m r0 = new ed1.m
            r1 = 10
            r0.<init>(r8, r10, r9, r1)
            rf1.j r9 = new rf1.j
            r10 = 26
            r9.<init>(r10, r0)
            rf1.z r10 = new rf1.z
            r0 = 3
            r10.<init>(r8, r0)
            rf1.j r0 = new rf1.j
            r1 = 27
            r0.<init>(r1, r10)
            ck2.c r10 = ck2.i.f27923c
            x02.a2 r1 = ck2.i.f27924d
            xj2.c r9 = r11.F(r9, r0, r10, r1)
            java.lang.String r10 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r8.addDisposable(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.W3(com.pinterest.api.model.f30, java.lang.String, boolean):void");
    }

    public final void X3(int i13) {
        nf1.a aVar;
        LinkedHashMap linkedHashMap;
        h32.v0 v0Var;
        Unit unit = null;
        if (i13 > 0 && !this.f107838f0) {
            this.f107838f0 = true;
            nx.d0 pinalytics = getPinalytics();
            f1 f1Var = f1.STORY_PIN_BEGIN;
            String u43 = u4();
            String F3 = F3(this.Z);
            if (F3 != null) {
                h32.v0 v0Var2 = new h32.v0();
                v0Var2.G = F3;
                v0Var = v0Var2;
            } else {
                v0Var = null;
            }
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : u43, (r18 & 32) != 0 ? null : H4(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        if (this.f107840g0 && (aVar = this.V) != null) {
            aVar.a();
            Function0 function0 = this.f107826J;
            if (i13 == 0) {
                HashMap hashMap = ((s0) function0.invoke()).f107899d;
                Set set = x0.f92478a;
                if (hashMap != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (x0.f92478a.contains(entry.getKey()) && ((CharSequence) entry.getValue()).length() > 0) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap = new LinkedHashMap(y0.a(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), (String) entry2.getValue());
                    }
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null || !(!linkedHashMap.isEmpty())) {
                    linkedHashMap = null;
                }
                h32.g0 componentType = S3(this) ? h32.g0.PIN_CLOSEUP_VIDEO : h32.g0.PIN_STORY_PIN_COVER;
                Intrinsics.checkNotNullParameter(componentType, "componentType");
                if (aVar.f90485d) {
                    return;
                }
                if (linkedHashMap != null) {
                    aVar.d(componentType, linkedHashMap, null);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    aVar.c(componentType);
                }
                aVar.f90485d = true;
                return;
            }
            h32.g0 componentType2 = S3(this) ? h32.g0.PIN_CLOSEUP_VIDEO : h32.g0.PIN_STORY_PIN_COVER;
            Intrinsics.checkNotNullParameter(componentType2, "componentType");
            if (aVar.f90485d) {
                aVar.b(componentType2);
                aVar.f90485d = false;
            }
            if (CollectionsKt.U(i13, this.f107834d0) instanceof lq0) {
                aVar.f90488g = null;
                aVar.f90487f = true;
                aVar.c(h32.g0.PIN_STORY_PIN_OOPS_PAGE);
                return;
            }
            String pageIndex = String.valueOf(i13);
            String G3 = G3(i13);
            HashMap hashMap2 = ((s0) function0.invoke()).f107899d;
            Set set2 = x0.f92478a;
            Intrinsics.checkNotNullParameter(hashMap2, "<this>");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                if (((CharSequence) entry3.getValue()).length() > 0) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            LinkedHashMap aux = new LinkedHashMap(y0.a(linkedHashMap3.size()));
            for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                aux.put(entry4.getKey(), (String) entry4.getValue());
            }
            Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
            Intrinsics.checkNotNullParameter(aux, "aux");
            if (aVar.f90487f) {
                return;
            }
            aVar.f90488g = pageIndex;
            LinkedHashMap h10 = kotlin.collections.z0.h(new Pair("story_pin_page_id", pageIndex), new Pair("story_pin_raw_index", pageIndex));
            h10.putAll(aux);
            if (G3 != null) {
                h10.put("story_pin_page_uuid", G3);
            }
            aVar.d(h32.g0.PIN_STORY_PIN_PAGE, h10, null);
            aVar.f90487f = true;
        }
    }

    public final void Y3(qf1.y yVar) {
        h32.v0 v0Var;
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = yVar.f103777a;
        h32.g0 z33 = z3();
        String u43 = u4();
        HashMap hashMap = (HashMap) yVar.f103779c.invoke(Integer.valueOf(this.f107842h0), G3(this.f107842h0));
        String F3 = F3(this.Z);
        if (F3 != null) {
            h32.v0 v0Var2 = new h32.v0();
            v0Var2.G = F3;
            v0Var = v0Var2;
        } else {
            v0Var = null;
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : yVar.f103778b, (r18 & 4) != 0 ? null : z33, (r18 & 8) != 0 ? null : u43, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final void Z3(long j13, String str) {
        h32.v0 v0Var;
        HashMap hashMap = ((s0) this.f107826J.invoke()).f107899d;
        bs1.c.G1("pin_id", u4(), hashMap);
        hashMap.put("story_pin_music_duration", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j13)));
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.STORY_PIN_MUSIC_PLAY;
        h32.g0 z33 = z3();
        String F3 = F3(this.Z);
        if (F3 != null) {
            h32.v0 v0Var2 = new h32.v0();
            v0Var2.G = F3;
            v0Var = v0Var2;
        } else {
            v0Var = null;
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : z33, (r18 & 8) != 0 ? null : str, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe A[EDGE_INSN: B:64:0x00fe->B:62:0x00fe BREAK  A[LOOP:1: B:56:0x00e4->B:63:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a4() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.a4():void");
    }

    @Override // yk1.b
    public final void clearDisposables() {
        super.clearDisposables();
        this.Q.d();
    }

    public final void d4(qf1.x xVar) {
        Object m13;
        Object m14;
        qf1.y yVar = xVar.f103776b;
        h32.u0 u0Var = yVar.f103778b;
        h32.u0 u0Var2 = h32.u0.PIN_STORY_PIN_PRODUCT_TOOLTIP;
        LinkedHashMap linkedHashMap = this.f107866t0;
        if (u0Var == u0Var2) {
            HashMap hashMap = (HashMap) yVar.f103779c.invoke(Integer.valueOf(this.f107842h0), G3(this.f107842h0));
            String parentPinId = (String) hashMap.get("source_pin_id");
            String productPinId = (String) hashMap.get("pin_id");
            if (productPinId != null && parentPinId != null) {
                h2 h2Var = h2.PRODUCT_TAG;
                Long l13 = (Long) linkedHashMap.get(xVar);
                pb0.a aVar = this.f107859q;
                Long valueOf = Long.valueOf(l13 != null ? l13.longValue() : ((pb0.g) aVar).a());
                Long valueOf2 = Long.valueOf(((pb0.g) aVar).a());
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    m13 = Long.valueOf(Long.parseLong(productPinId));
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th3);
                }
                if (m13 instanceof xk2.r) {
                    m13 = null;
                }
                z1 impression = new z1((Long) m13, valueOf, null, null, valueOf2, null, null, null, null, h2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f107853n.c(productPinId), null, null, null, null, null, null, null, null, null, null, null, null, null, parentPinId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                nx.d0 pinalytics = getPinalytics();
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(productPinId, "productPinId");
                Intrinsics.checkNotNullParameter(parentPinId, "parentPinId");
                Intrinsics.checkNotNullParameter(impression, "impression");
                try {
                    m14 = Long.valueOf(Long.parseLong(productPinId));
                } catch (Throwable th4) {
                    xk2.q qVar3 = xk2.s.f135225b;
                    m14 = ue.c.m(th4);
                }
                if (m14 instanceof xk2.r) {
                    m14 = null;
                }
                Long l14 = (Long) m14;
                if (l14 != null) {
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = Boolean.TRUE;
                    c1 c1Var = new c1(null, bool, kotlin.collections.e0.b(impression), bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new h32.x2(l14, parentPinId, null, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    HashMap hashMap2 = new HashMap();
                    if (Intrinsics.d(impression.f67510u, bool2)) {
                        hashMap2.put("debug_code_path", "3");
                    }
                    pinalytics.u(f1.PIN_IMPRESSION_ONE_PIXEL, productPinId, c1Var, hashMap2, false);
                }
            }
        }
        linkedHashMap.remove(xVar);
    }

    public final void e4(f30 f30Var) {
        if (isBound() && f30Var.d5().booleanValue()) {
            addDisposable(uj2.b0.j(f30Var).r(tk2.e.f118016b).k(new ic1.a(14, new c0(this, f30Var, 0))).l(wj2.c.a()).o(new j(16, new c0(this, f30Var, 1)), new j(17, l.f107772p)));
        }
    }

    public final void f4(String clickThroughSource) {
        Intrinsics.checkNotNullParameter(clickThroughSource, "clickThroughSource");
        f30 f30Var = this.Z;
        if (f30Var != null) {
            new px0.g((Object) this, (Object) f30Var, clickThroughSource, 16).invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // yk1.p
    /* renamed from: g4, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(sf1.k1 r17) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.p0.r3(sf1.k1):void");
    }

    public final void h4() {
        k1 x33;
        k1 x34;
        h32.v0 v0Var;
        vh vhVar = this.f107828a0;
        rg0.n nVar = this.f107830b0;
        if (vhVar != null && nVar != null && !vhVar.f42866x) {
            vhVar.f42866x = true;
            nVar.g();
        }
        Function0 function0 = this.f107826J;
        if (((s0) function0.invoke()).f107897b && !this.f107850l0) {
            nx.d0 pinalytics = getPinalytics();
            h32.i0 i0Var = new h32.i0(d4.PIN, h32.a4.PIN_STORY_PIN, null, null, null, null);
            f1 f1Var = f1.VIEW;
            String u43 = u4();
            HashMap hashMap = new HashMap(((s0) function0.invoke()).f107899d);
            nq.b t33 = t3();
            if (t33 != null) {
                hashMap.put("closeup_navigation_type", t33.getType());
            }
            Unit unit = Unit.f80348a;
            String F3 = F3(this.Z);
            if (F3 != null) {
                v0Var = new h32.v0();
                v0Var.G = F3;
            } else {
                v0Var = null;
            }
            pinalytics.t(i0Var, v0Var, null, f1Var, u43, hashMap, false);
            nx.d0 pinalytics2 = getPinalytics();
            String u44 = u4();
            HashMap hashMap2 = ((s0) function0.invoke()).f107899d;
            hashMap2.put("grid_index", String.valueOf(this.f107836e0));
            hashMap2.put("creator_id", qf1.p.a(this.Z));
            f30 f30Var = this.Z;
            String w63 = f30Var != null ? f30Var.w6() : null;
            if (w63 == null) {
                w63 = "";
            }
            hashMap2.put("story_pin_data_id", w63);
            pinalytics2.i0(u44, hashMap2, F3(this.Z), B3());
            this.f107850l0 = true;
        }
        if (!this.f107840g0) {
            HashMap hashMap3 = ((s0) function0.invoke()).f107899d;
            LinkedHashMap aux = new LinkedHashMap();
            for (Map.Entry entry : hashMap3.entrySet()) {
                if (!kotlin.text.z.j((String) entry.getValue())) {
                    aux.put(entry.getKey(), entry.getValue());
                }
            }
            nf1.a aVar = this.V;
            if (aVar != null) {
                int i13 = this.f107836e0;
                String F32 = F3(this.Z);
                h32.g0 componentType = B3();
                Intrinsics.checkNotNullParameter(aux, "aux");
                Intrinsics.checkNotNullParameter(componentType, "componentType");
                if (!aVar.f90486e) {
                    HashMap f13 = kotlin.collections.z0.f(new Pair("grid_index", String.valueOf(i13)));
                    f13.putAll(aux);
                    aVar.d(componentType, f13, F32);
                    aVar.f90486e = true;
                }
            }
            this.f107840g0 = true;
            X3(this.f107842h0);
        }
        if (isBound()) {
            if (!this.f107856o0 && !R3()) {
                s sVar = this.f107870v0;
                if (sVar != s.SHOULD_RESTART) {
                    Objects.toString(sVar);
                } else {
                    f30 f30Var2 = this.Z;
                    if ((f30Var2 == null || !Intrinsics.d(f30Var2.d5(), Boolean.FALSE) || ((Boolean) this.M0.getValue()).booleanValue()) && (x34 = x3()) != null) {
                        ((e1) x34).F0(s4(this), t4());
                    }
                }
            }
            if (x3() != null) {
                String u45 = u4();
                String str = u45 != null ? u45 : "";
                qf1.r state = new qf1.r(str, s3(this) ? new qf1.v(str, qf1.e.f103657b) : qf1.u.f103770a);
                Intrinsics.checkNotNullParameter(state, "state");
            }
            if (this.L0.f107921a > 0 && (x33 = x3()) != null) {
                ((e1) x33).t0(s4(this), j4());
            }
        }
        this.f107856o0 = true;
        this.f107870v0 = this.I0 ? s.DO_NOT_RESTART : s.SHOULD_RESTART;
        this.I0 = false;
        if (isBound() && this.f107856o0) {
            sf1.h0 h0Var = ((e1) ((k1) getView())).f112559r;
            if (h0Var.f112580e || h0Var.f112596u) {
                h0Var.f112595t.setAlpha(0.0f);
                bs1.c.X0(h0Var.f112595t);
            }
            boolean T = h0Var.T();
            GestaltIcon gestaltIcon = h0Var.f112588m;
            if (T) {
                gestaltIcon.g2(sf1.c.f112527t);
                h0Var.g0();
            } else {
                gestaltIcon.g2(sf1.c.f112526s);
            }
            ((e1) ((k1) getView())).H0();
            f30 f30Var3 = this.Z;
            if (f30Var3 != null) {
                LruCache lruCache = e.f107743a;
                String uid = f30Var3.getF39332b();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Intrinsics.checkNotNullParameter(uid, "uid");
                Integer num = (Integer) e.f107743a.get(uid);
                I3(num == null ? 0 : num.intValue(), false);
            }
        }
    }

    public final void i4() {
        k1 x33;
        this.f107856o0 = false;
        w3();
        if (isBound() && (x33 = x3()) != null) {
            ((e1) x33).t0(false, false);
        }
        this.f107850l0 = false;
    }

    public final boolean j4() {
        return this.f107842h0 == this.f107844i0 - 1;
    }

    public final void k4(String pinUid, f30 f30Var, h22.d dVar) {
        if (this.M) {
            if (pinUid == null) {
                pinUid = f30Var != null ? f30Var.getF39332b() : null;
                if (pinUid == null) {
                    pinUid = "";
                }
            }
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new r4(pinUid).i();
        }
        f30 f30Var2 = dVar.f66581a;
        B4(f30Var2, f30Var2.getF39332b());
        f30 f30Var3 = this.Z;
        if (f30Var3 != null && Intrinsics.d(f30Var3.d5(), Boolean.TRUE) && S3(this)) {
            if (f30Var != null) {
                N3(f30Var);
            }
        } else {
            boolean g23 = c0.d.g2(f30Var2);
            List list = dVar.f66582b;
            if (g23 && (!list.isEmpty())) {
                list = kotlin.collections.e0.b(list.get(0));
            }
            E4(f30Var2, list);
        }
    }

    public final void l4(rl2.g0 g0Var, wy0 wy0Var) {
        wy0 u33;
        String pinId;
        f30 f30Var = this.Z;
        if (f30Var == null || (u33 = u3(f30Var)) == null) {
            return;
        }
        if (g0Var instanceof qf1.a) {
            String f39332b = u33.getF39332b();
            Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
            K3(u33, B3(), h32.u0.PIN_ATTRIBUTION, f39332b);
            return;
        }
        if (g0Var instanceof qf1.b) {
            new q4.h((yk1.p) this, (dl1.s) (wy0Var == null ? u33 : wy0Var), (Enum) B3(), (Object) h32.u0.USER_EASY_FOLLOW_BUTTON, (String) null, 9).invoke();
            return;
        }
        if (!(g0Var instanceof qf1.d)) {
            if (g0Var instanceof qf1.c) {
                qf1.c cVar = (qf1.c) g0Var;
                new z(this, 9).invoke(h32.u0.PIN_STORY_PIN_MATERIALS_BUTTON);
                this.f107870v0 = s.DO_NOT_RESTART;
                L3((ScreenLocation) e2.f50696b.getValue(), cVar.f103645a, cVar.f103646b, new z(this, 8));
                return;
            }
            return;
        }
        qf1.d dVar = (qf1.d) g0Var;
        lf1.a aVar = lf1.a.f83134h;
        kg.a aVar2 = dVar.f103653d;
        if (!Intrinsics.d(aVar2, aVar) && !Intrinsics.d(aVar2, lf1.a.f83132f)) {
            if (Intrinsics.d(aVar2, lf1.a.f83133g)) {
                String u43 = u4();
                pinId = u43 != null ? u43 : "";
                L3((ScreenLocation) e2.f50695a.getValue(), pinId, null, l.f107771o);
                return;
            }
            return;
        }
        h32.u0 element = h32.u0.CREATOR_CARD_LINK;
        h32.g0 component = h32.g0.PIN_STORY_PIN_ATTRIBUTION;
        nx.d0 pinalytics = getPinalytics();
        String u44 = u4();
        pinId = u44 != null ? u44 : "";
        Intrinsics.checkNotNullParameter(pinalytics, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        String creatorId = dVar.f103651b;
        Intrinsics.checkNotNullParameter(creatorId, "creatorId");
        String sponsorId = dVar.f103650a;
        Intrinsics.checkNotNullParameter(sponsorId, "sponsorId");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(creatorId, "creatorId");
        Intrinsics.checkNotNullParameter(sponsorId, "sponsorId");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(component, "component");
        u logging = new u(new t(pinId, creatorId, sponsorId), element, component);
        Intrinsics.checkNotNullParameter(pinalytics, "<this>");
        Intrinsics.checkNotNullParameter(logging, "logging");
        HashMap hashMap = new HashMap();
        hashMap.put("pin_id", pinId);
        hashMap.put("creator_id", creatorId);
        hashMap.put("sponsor_id", sponsorId);
        pinalytics.h(component, element, hashMap);
        if (!kotlin.text.z.j(sponsorId)) {
            J3(null, sponsorId);
        }
    }

    public final void n4() {
        String u43 = u4();
        if (u43 == null) {
            return;
        }
        hk2.k e13 = this.f107833d.M(u43).h(tk2.e.f118017c).e(wj2.c.a());
        hk2.b bVar = new hk2.b(new j(12, new z(this, 10)), new j(13, new ic1.c(17, u43, this)), ck2.i.f27923c);
        e13.f(bVar);
        addDisposable(bVar);
    }

    @Override // yk1.b
    public final void onActivate() {
        if (this.H.f107906d) {
            n4();
        }
        ((e1) ((k1) getView())).f112559r.Z();
    }

    @Override // yk1.b
    public final void onDeactivate() {
        f30 f30Var;
        w3();
        a4();
        this.X.d();
        String pinUid = u4();
        if (pinUid == null || (f30Var = this.Z) == null || b40.P0(f30Var)) {
            return;
        }
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new oy.g0(pinUid).i();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ek2.j jVar;
        f30 f30Var = this.Z;
        es.c cVar = (es.c) this.B;
        if (cVar.U(f30Var) && this.f107864s0 > 0) {
            long a13 = ((pb0.g) this.f107859q).a() - this.f107864s0;
            nx.d0 pinalytics = getPinalytics();
            String u43 = u4();
            if (u43 == null) {
                u43 = "";
            }
            oe.f.a1(pinalytics, u43, a13, this.f107836e0, f1.PIN_CLICKTHROUGH_END, cVar.g(this.Z));
        }
        this.f107864s0 = 0L;
        ek2.j jVar2 = this.W;
        if (jVar2 != null && !jVar2.isDisposed() && (jVar = this.W) != null) {
            bk2.c.dispose(jVar);
        }
        this.W = null;
        this.Q.d();
        m60.w wVar = this.f107841h;
        wVar.j(this.B0);
        wVar.j(this.C0);
        wVar.j(this.D0);
        wVar.j(this.E0);
        wVar.j(this.F0);
        wVar.j(this.G0);
        wVar.j(this.H0);
        wVar.j(this.J0);
        this.f107848k0 = 0;
        super.onUnbind();
    }

    public final void q3(int i13, HashMap hashMap) {
        hashMap.put("story_pin_page_id", String.valueOf(i13));
        hashMap.put("story_pin_raw_index", String.valueOf(i13));
        String G3 = G3(this.f107842h0);
        if (G3 != null) {
            hashMap.put("story_pin_page_uuid", G3);
        }
    }

    public final void r3(long j13, String str) {
        w wVar = this.L0;
        wVar.f107921a += j13;
        wVar.f107922b.put(str, Long.valueOf(j13));
    }

    public final f30 r4(f30 f30Var, f30 f30Var2) {
        e30 R6 = f30Var.R6();
        if (this.I.f107914c && f30Var2 != null && Intrinsics.d(f30Var2.getF39332b(), R6.f37063a)) {
            String str = R6.f37082e;
            if (str == null || str.length() == 0) {
                R6.f37082e = f30Var2.u3();
                boolean[] zArr = R6.f37101h3;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            }
            u1 u1Var = this.f107851m;
            u1Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) u1Var.f83486a;
            if (g1Var.o("android_idea_pin_preview_cta", "enabled", z3Var) || g1Var.l("android_idea_pin_preview_cta")) {
                R6.V0(Boolean.TRUE);
            }
        }
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public final nq.b t3() {
        h32.a4 i13 = getPresenterPinalytics().i();
        String str = this.I.f107915d;
        return Intrinsics.d(str, u4()) ? kotlin.collections.c0.y((h32.a4[]) this.A0.getValue(), i13) ? nq.b.DEEPLINK : v3() : str == null ? v3() : nq.b.SWIPE;
    }

    public final boolean t4() {
        k1 x33;
        return (R3() || Q3() || (x33 = x3()) == null || ((e1) x33).Q) ? false : true;
    }

    public final wy0 u3(f30 f30Var) {
        wy0 wy0Var = this.f107832c0;
        if (wy0Var != null) {
            return wy0Var;
        }
        wy0 c13 = f30Var != null ? qf1.p.c(f30Var) : null;
        if (c13 != null) {
            return c13;
        }
        f30 f30Var2 = this.Z;
        if (f30Var2 != null) {
            return qf1.p.c(f30Var2);
        }
        return null;
    }

    public final String u4() {
        String f39332b;
        f30 f30Var = this.Z;
        return (f30Var == null || (f39332b = f30Var.getF39332b()) == null) ? this.Y : f39332b;
    }

    public final nq.b v3() {
        String type;
        HashMap f63135d0 = getPresenterPinalytics().getF63135d0();
        if (f63135d0 == null || (type = (String) f63135d0.get("closeup_navigation_type")) == null) {
            return null;
        }
        nq.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        for (nq.b bVar : nq.b.values()) {
            if (Intrinsics.d(bVar.getType(), type)) {
                return bVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void w3() {
        nf1.a aVar = this.V;
        if (aVar != null) {
            h32.g0 componentType = S3(this) ? h32.g0.PIN_CLOSEUP_VIDEO : h32.g0.PIN_STORY_PIN_COVER;
            h32.g0 componentTypeForBody = B3();
            Intrinsics.checkNotNullParameter(componentType, "componentTypeForCover");
            Intrinsics.checkNotNullParameter(componentTypeForBody, "componentTypeForBody");
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            if (aVar.f90485d) {
                aVar.b(componentType);
                aVar.f90485d = false;
            }
            aVar.a();
            if (aVar.f90486e) {
                aVar.b(componentTypeForBody);
                aVar.f90486e = false;
            }
        }
        this.f107840g0 = !((s0) this.f107826J.invoke()).f107898c;
    }

    public final k1 x3() {
        if (isBound()) {
            return (k1) getView();
        }
        return null;
    }

    public final boolean x4(int i13) {
        uo0 uo0Var;
        dl1.s sVar = (dl1.s) CollectionsKt.U(i13, this.f107834d0);
        if (sVar == null) {
            return false;
        }
        wo0 wo0Var = sVar instanceof wo0 ? (wo0) sVar : null;
        return (wo0Var == null || (uo0Var = wo0Var.f43310a) == null || !com.bumptech.glide.d.c0(uo0Var)) ? false : true;
    }

    public final h32.g0 z3() {
        return S3(this) ? h32.g0.PIN_CLOSEUP_VIDEO : this.f107842h0 == 0 ? h32.g0.PIN_STORY_PIN_COVER : h32.g0.PIN_STORY_PIN_PAGE;
    }

    public final void z4() {
        boolean R3;
        if (isBound() && (R3 = R3()) != this.f107868u0) {
            this.f107868u0 = R3;
            k1 x33 = x3();
            if (x33 != null) {
                int i13 = this.f107842h0;
                f30 f30Var = this.Z;
                boolean z13 = ((es.c) this.B).U(f30Var) || c0.d.g2(f30Var);
                e1 e1Var = (e1) x33;
                xk2.k kVar = e1Var.D;
                xk2.k kVar2 = e1Var.E;
                if (!R3) {
                    if (kVar.isInitialized()) {
                        bs1.c.X0((IdeaPinHideView) kVar.getValue());
                    }
                    if (kVar2.isInitialized()) {
                        bs1.c.X0((IdeaPinHideView) kVar2.getValue());
                    }
                } else if (z13) {
                    bs1.c.U1((IdeaPinHideView) kVar2.getValue());
                    ((IdeaPinHideView) kVar2.getValue()).setClickable(true);
                } else {
                    bs1.c.U1((IdeaPinHideView) kVar.getValue());
                }
                e1Var.B0(!R3);
                e1Var.F.i(i13);
            }
            k1 x34 = x3();
            if (x34 != null) {
                ((e1) x34).t0(s4(this), j4());
            }
            if (x3() != null) {
                boolean z14 = !R3;
                String u43 = u4();
                if (u43 == null) {
                    u43 = "";
                }
                qf1.s state = new qf1.s(u43, (z14 && s3(this)) ? new qf1.v(u43, qf1.e.f103657b) : qf1.u.f103770a);
                Intrinsics.checkNotNullParameter(state, "state");
            }
        }
    }
}
