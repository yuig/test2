package rl2;

import a.z0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.media3.exoplayer.ExoPlayer;
import b3.w0;
import b4.q0;
import b4.r0;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.um;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.n0;
import i2.f2;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lb.l0;
import lh0.m3;
import lh0.o3;
import q5.x0;
import rh1.q1;
import rh1.v1;
import so.u6;
import t3.s1;
import v.n1;
import we1.d2;
import x02.l2;
import x40.ye;

/* loaded from: classes4.dex */
public abstract class g0 implements u50.a0, pc.a {
    public static void A(v1 v1Var, hf0.c cVar) {
        v1Var.f108312o0 = cVar;
    }

    public static void B(ga1.p pVar, m3 m3Var) {
        pVar.f64649n0 = m3Var;
    }

    public static void C(tb1.j jVar, o3 o3Var) {
        jVar.f117160m0 = o3Var;
    }

    public static void D(v1 v1Var, zp.j jVar) {
        v1Var.f108313p0 = jVar;
    }

    public static void E(w82.i iVar, z82.b bVar) {
        iVar.f128475c0 = bVar;
    }

    public static void F(v1 v1Var, u6 u6Var) {
        v1Var.f108307j0 = u6Var;
    }

    public static void G(w21.x xVar, w21.b0 b0Var) {
        xVar.f127857d0 = b0Var;
    }

    public static void H(v1 v1Var, nx.f0 f0Var) {
        v1Var.f108308k0 = f0Var;
    }

    public static void I(uv1.l lVar) {
        lVar.getClass();
    }

    public static void J(uv1.l lVar, lb0.q qVar) {
        lVar.A0 = qVar;
    }

    public static void K(v1 v1Var, lb0.r rVar) {
        v1Var.f108314q0 = rVar;
    }

    public static void L(tb1.j jVar, g4.u uVar) {
        jVar.f117157j0 = uVar;
    }

    public static void M(v1 v1Var, uk1.e eVar) {
        v1Var.f108309l0 = eVar;
    }

    public static void N(tb1.j jVar, uk1.e eVar) {
        jVar.f117159l0 = eVar;
    }

    public static void O(uv1.l lVar, uk1.e eVar) {
        lVar.f123215z0 = eVar;
    }

    public static void P(tb1.j jVar, i92.k kVar) {
        jVar.f117158k0 = kVar;
    }

    public static void Q(v1 v1Var, l2 l2Var) {
        v1Var.f108310m0 = l2Var;
    }

    public static void R(v1 v1Var, up0.l lVar) {
        v1Var.f108311n0 = lVar;
    }

    public static void S(d2 d2Var, ku1.l lVar) {
        d2Var.f129327c = lVar;
    }

    public static final boolean T(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (W(f30Var)) {
            return true;
        }
        if (f13 != null) {
            v7 D3 = f30Var.D3();
            String T0 = D3 != null ? kh2.d.T0(D3) : null;
            if (T0 == null) {
                T0 = "";
            }
            if (dl2.b.S1(f13, T0)) {
                return true;
            }
        }
        v7 D32 = f30Var.D3();
        return D32 != null && kh2.d.C0(D32, y22.c.EDIT_PINS);
    }

    public static final boolean U(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!W(f30Var) && f30Var.G5() == null) {
            Boolean H5 = f30Var.H5();
            Intrinsics.checkNotNullExpressionValue(H5, "getPinnedToProfile(...)");
            if (!H5.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean V(f30 f30Var, String str) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (!Intrinsics.d(b40.H(f30Var), str) && f30Var.G5() == null) {
            Boolean H5 = f30Var.H5();
            Intrinsics.checkNotNullExpressionValue(H5, "getPinnedToProfile(...)");
            if (!H5.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean W(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        return f13 != null && dl2.b.S1(f13, b40.H(f30Var));
    }

    public static final boolean X(Throwable th3) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        return (th3 instanceof IOException) || ((th3 instanceof is1.n) && !(th3 instanceof is1.o));
    }

    public static final boolean Y(Throwable th3) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        return !X(th3);
    }

    public static final void Z(wk1.e eVar, d51.l anotherDataSource) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(anotherDataSource, "anotherDataSource");
        Intrinsics.checkNotNullExpressionValue(anotherDataSource.K1().A(wj2.c.a()).F(new q1(22, new oh1.u(19, anotherDataSource, eVar)), new q1(23, wk1.f.f130143j), ck2.i.f27923c, ck2.i.f27924d), "subscribe(...)");
    }

    public static final StringBuilder a0() {
        return new StringBuilder();
    }

    public static final void b(yl1.b state, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(244666338);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = null;
        }
        sVar.W(1022000841);
        if (function1 == null) {
            function12 = null;
        } else {
            sVar.W(-1603730944);
            boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(function1)) || (i13 & 384) == 256;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new al1.j(3, function1);
                sVar.g0(J2);
            }
            function12 = (Function1) J2;
            sVar.r(false);
        }
        sVar.r(false);
        c(state, qVar, function12 != null ? new hm1.e(0, function12) : null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 8, qVar, state, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b0(d7.d0 r28) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rl2.g0.b0(d7.d0):java.util.ArrayList");
    }

    public static final void c(yl1.b state, u2.q qVar, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1509104203);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        int i15 = 17;
        androidx.compose.ui.viewinterop.a.a(new rq.a0(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar, i15), qVar, new com.pinterest.framework.screens.q(i15, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 9, qVar, state, aVar);
        }
    }

    public static final void c0(g1.g map, boolean z13, w71.a fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        g1.g gVar = new g1.g(999);
        int i13 = map.f63294c;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            if (z13) {
                gVar.put(map.f(i14), map.j(i14));
            } else {
                gVar.put(map.f(i14), null);
            }
            i14++;
            i15++;
            if (i15 == 999) {
                fetchBlock.invoke(gVar);
                if (!z13) {
                    map.putAll(gVar);
                }
                gVar.clear();
                i15 = 0;
            }
        }
        if (i15 > 0) {
            fetchBlock.invoke(gVar);
            if (z13) {
                return;
            }
            map.putAll(gVar);
        }
    }

    public static final void d0(HashMap map, tb.t fetchBlock) {
        int i13;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap hashMap = new HashMap(999);
        loop0: while (true) {
            i13 = 0;
            for (Object key : map.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, map.get(key));
                i13++;
                if (i13 == 999) {
                    break;
                }
            }
            fetchBlock.invoke(hashMap);
            hashMap.clear();
        }
        if (i13 > 0) {
            fetchBlock.invoke(hashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(u2.q r29, q1.h0 r30, p1.x0 r31, boolean r32, p1.j r33, u2.c r34, m1.c1 r35, boolean r36, kotlin.jvm.functions.Function1 r37, i2.o r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rl2.g0.e(u2.q, q1.h0, p1.x0, boolean, p1.j, u2.c, m1.c1, boolean, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final void e0(l71.s sVar, String query) {
        String str;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        int a13 = sVar.a();
        if (a13 <= 0) {
            return;
        }
        while (true) {
            a13--;
            if (-1 >= a13) {
                return;
            }
            Object item = sVar.getItem(a13);
            String str2 = null;
            br.d dVar = item instanceof br.d ? (br.d) item : null;
            if (dVar != null && (str = dVar.f23704b) != null) {
                str2 = StringsKt.i0(str).toString();
            }
            if (Intrinsics.d(str2, query)) {
                sVar.removeItem(a13);
            }
        }
    }

    public static final q0 f0(q0 q0Var, n4.k kVar) {
        int i13;
        b4.g0 g0Var = q0Var.f21648a;
        m4.o oVar = b4.h0.f21595d;
        m4.o oVar2 = g0Var.f21575a;
        oVar2.getClass();
        if (Intrinsics.d(oVar2, m4.m.f85803a)) {
            oVar2 = b4.h0.f21595d;
        }
        m4.o oVar3 = oVar2;
        long j13 = g0Var.f21576b;
        if (kh2.w.k0(j13)) {
            j13 = b4.h0.f21592a;
        }
        long j14 = j13;
        g4.l lVar = g0Var.f21577c;
        if (lVar == null) {
            lVar = g4.l.f63469d;
        }
        g4.l lVar2 = lVar;
        g4.j jVar = g0Var.f21578d;
        g4.j jVar2 = new g4.j(jVar != null ? jVar.f63465a : 0);
        g4.k kVar2 = g0Var.f21579e;
        g4.k kVar3 = new g4.k(kVar2 != null ? kVar2.f63466a : 1);
        g4.e eVar = g0Var.f21580f;
        if (eVar == null) {
            eVar = g4.e.f63455a;
        }
        g4.e eVar2 = eVar;
        String str = g0Var.f21581g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j15 = g0Var.f21582h;
        if (kh2.w.k0(j15)) {
            j15 = b4.h0.f21593b;
        }
        m4.a aVar = g0Var.f21583i;
        m4.a aVar2 = new m4.a(aVar != null ? aVar.f85783a : 0.0f);
        m4.p pVar = g0Var.f21584j;
        if (pVar == null) {
            pVar = m4.p.f85806c;
        }
        m4.p pVar2 = pVar;
        i4.c cVar = g0Var.f21585k;
        if (cVar == null) {
            i4.c cVar2 = i4.c.f71503c;
            cVar = i4.d.f71506a.a();
        }
        i4.c cVar3 = cVar;
        long j16 = g0Var.f21586l;
        if (j16 == 16) {
            j16 = b4.h0.f21594c;
        }
        long j17 = j16;
        m4.k kVar4 = g0Var.f21587m;
        if (kVar4 == null) {
            kVar4 = m4.k.f85798b;
        }
        m4.k kVar5 = kVar4;
        w0 w0Var = g0Var.f21588n;
        if (w0Var == null) {
            w0Var = w0.f21393d;
        }
        w0 w0Var2 = w0Var;
        d3.i iVar = g0Var.f21590p;
        if (iVar == null) {
            iVar = d3.k.f53660a;
        }
        b4.g0 g0Var2 = new b4.g0(oVar3, j14, lVar2, jVar2, kVar3, eVar2, str2, j15, aVar2, pVar2, cVar3, j17, kVar5, w0Var2, g0Var.f21589o, iVar);
        int i14 = b4.w.f21674b;
        b4.v vVar = q0Var.f21649b;
        int i15 = 5;
        int i16 = m4.j.a(vVar.f21664a, Integer.MIN_VALUE) ? 5 : vVar.f21664a;
        int i17 = vVar.f21665b;
        if (m4.l.a(i17, 3)) {
            int i18 = r0.f21651a[kVar.ordinal()];
            if (i18 == 1) {
                i15 = 4;
            } else if (i18 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 1;
        } else if (m4.l.a(i17, Integer.MIN_VALUE)) {
            int i19 = r0.f21651a[kVar.ordinal()];
            i13 = 1;
            if (i19 == 1) {
                i15 = 1;
            } else {
                if (i19 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = 2;
            }
        } else {
            i13 = 1;
            i15 = i17;
        }
        long j18 = vVar.f21666c;
        if (kh2.w.k0(j18)) {
            j18 = b4.w.f21673a;
        }
        m4.q qVar = vVar.f21667d;
        if (qVar == null) {
            qVar = m4.q.f85809c;
        }
        int i23 = vVar.f21670g;
        if (i23 == 0) {
            i23 = m4.e.f85788b;
        }
        int i24 = vVar.f21671h;
        if (m4.d.a(i24, Integer.MIN_VALUE)) {
            i24 = i13;
        }
        m4.r rVar = vVar.f21672i;
        if (rVar == null) {
            rVar = m4.r.f85812c;
        }
        return new q0(g0Var2, new b4.v(i16, i15, j18, qVar, vVar.f21668e, vVar.f21669f, i23, i24, rVar), q0Var.f21650c);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(u2.q r29, q1.h0 r30, p1.x0 r31, boolean r32, p1.h r33, u2.d r34, m1.c1 r35, boolean r36, kotlin.jvm.functions.Function1 r37, i2.o r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rl2.g0.g(u2.q, q1.h0, p1.x0, boolean, p1.h, u2.d, m1.c1, boolean, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static boolean g0(com.bugsnag.android.repackaged.dslplatform.json.m mVar, long j13, long j14, long j15, long j16, long j17) {
        long j18 = j13 - j17;
        long j19 = j13 + j17;
        long j23 = j15;
        while (j23 < j18 && j14 - j23 >= j16) {
            long j24 = j23 + j16;
            if (j24 >= j18 && j18 - j23 < j24 - j18) {
                break;
            }
            int i13 = mVar.f29564o - 1;
            byte[] bArr = mVar.f29563n;
            bArr[i13] = (byte) (bArr[i13] - 1);
            j23 = j24;
        }
        if (j23 < j19 && j14 - j23 >= j16) {
            long j25 = j23 + j16;
            if (j25 < j19 || j19 - j23 > j25 - j19) {
                return false;
            }
        }
        return 2 * j17 <= j23 && j23 <= j14 - (4 * j17);
    }

    public static final int h(Context context) {
        NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!j(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService(ConnectivityManager.class)).getActiveNetworkInfo()) == null) {
            return -1;
        }
        return activeNetworkInfo.getDetailedState().ordinal();
    }

    public static final void h0(Activity activity, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlertContainer alertContainer = activity != null ? (AlertContainer) activity.findViewById(p22.a.alert_container) : null;
        yb0.n nVar = new yb0.n(context);
        String string = nVar.getResources().getString(p22.b.pin_scheduling_too_many_pins_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        nVar.u(nVar.getResources().getString(p22.b.pin_scheduling_too_many_pins_subtitle));
        String string2 = nVar.getResources().getString(p22.b.pin_scheduling_too_many_pins_button_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.q(string2);
        nVar.o(false);
        nVar.f138513j = new v51.a(nVar, 0);
        if (alertContainer != null) {
            alertContainer.c(nVar);
        }
    }

    public static final int i(Context context, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!j(context, "android.permission.ACCESS_NETWORK_STATE") || networkCapabilities == null) {
            return -1;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 9;
        }
        int i13 = 1;
        if (!networkCapabilities.hasTransport(1)) {
            i13 = 0;
            if (!networkCapabilities.hasTransport(0)) {
                return -1;
            }
        }
        return i13;
    }

    public static final List i0(List contour, float f13) {
        Object obj;
        Intrinsics.checkNotNullParameter(contour, "contour");
        if (f13 == 0.0f || contour.size() <= 2) {
            return contour;
        }
        Point point = (Point) CollectionsKt.S(contour);
        Point point2 = (Point) CollectionsKt.b0(contour);
        Point point3 = new Point(point2.x, point2.y);
        point3.offset(-point.x, -point.y);
        PointF pointF = new PointF(point3);
        float f14 = pointF.x;
        float f15 = pointF.y;
        float length = pointF.length();
        List<Point> list = contour;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (Point point4 : list) {
            arrayList.add(Float.valueOf(Math.abs(((point.y - point4.y) * f14) - ((point.x - point4.x) * f15)) / length));
        }
        x0 x0Var = (x0) CollectionsKt.M0(arrayList).iterator();
        if (x0Var.hasNext()) {
            Object next = x0Var.next();
            if (x0Var.hasNext()) {
                float floatValue = ((Number) ((IndexedValue) next).f80350b).floatValue();
                do {
                    Object next2 = x0Var.next();
                    float floatValue2 = ((Number) ((IndexedValue) next2).f80350b).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (x0Var.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Intrinsics.f(obj);
        IndexedValue indexedValue = (IndexedValue) obj;
        if (((Number) indexedValue.f80350b).floatValue() <= f13) {
            return kotlin.collections.f0.j(point, point2);
        }
        int i13 = indexedValue.f80349a;
        return CollectionsKt.l0(i0(CollectionsKt.v0(contour, ql2.s.q(i13, contour.size())), f13), CollectionsKt.O(i0(CollectionsKt.v0(contour, ql2.s.q(0, i13)), f13)));
    }

    public static final boolean j(Context context, String permissionName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
        return context.checkSelfPermission(permissionName) == 0;
    }

    public static void j0(androidx.camera.core.impl.n nVar, ArrayList arrayList) {
        if (nVar instanceof androidx.camera.core.impl.o) {
            Iterator it = ((androidx.camera.core.impl.o) nVar).f16928a.iterator();
            while (it.hasNext()) {
                j0((androidx.camera.core.impl.n) it.next(), arrayList);
            }
        } else if (nVar instanceof n1) {
            arrayList.add(((n1) nVar).f123573a);
        } else {
            arrayList.add(new v.i0(nVar));
        }
    }

    public static final String k(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence e13 = yn2.x.e(type, f0.f108674a);
            name = ((Class) yn2.c0.o(e13)).getName() + kotlin.text.z.l(yn2.c0.h(e13), "[]");
        } else {
            name = cls.getName();
        }
        Intrinsics.f(name);
        return name;
    }

    public static void k0(tc.g writer, pc.v customScalarAdapters, ye value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("deviceId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133743a);
        writer.M0("eventType");
        eVar.d(writer, customScalarAdapters, value.f133744b);
        pc.r0 r0Var = value.f133745c;
        if (r0Var instanceof pc.q0) {
            writer.M0("pushId");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        pc.r0 r0Var2 = value.f133746d;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("body");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
        pc.r0 r0Var3 = value.f133747e;
        if (r0Var3 instanceof pc.q0) {
            writer.M0("link");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var3);
        }
        pc.r0 r0Var4 = value.f133748f;
        if (r0Var4 instanceof pc.q0) {
            writer.M0("displayMode");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var4);
        }
    }

    public static final void l(int i13, StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i14 = 0; i14 < i13; i14++) {
            builder.append("?");
            if (i14 < i13 - 1) {
                builder.append(",");
            }
        }
    }

    public static final String l0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArr2 = new byte[bArr.length * 2];
        int i13 = 0;
        for (byte b13 : bArr) {
            int i14 = b13 & 255;
            if (i14 < 128) {
                bArr2[i13] = (byte) i14;
                i13++;
            } else {
                int i15 = i13 + 1;
                bArr2[i13] = (byte) ((i14 >> 6) | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                i13 += 2;
                bArr2[i15] = (byte) ((b13 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            }
        }
        byte[] copyOf = Arrays.copyOf(bArr2, i13);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return new String(copyOf, Charsets.UTF_8);
    }

    public static final int m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (j(context, "android.permission.READ_PHONE_STATE") || (Build.VERSION.SDK_INT >= 33 && j(context, "android.permission.READ_BASIC_PHONE_STATE"))) {
            return ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getDataNetworkType();
        }
        return 0;
    }

    public static int m0(int i13) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i14 = 0; i14 < 6; i14++) {
            int i15 = iArr[i14];
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            if (i16 == i13) {
                return i15;
            }
        }
        return 1;
    }

    public static final Type n(v vVar, boolean z13) {
        ul2.q1 q1Var = (ul2.q1) vVar;
        e d2 = q1Var.d();
        if (d2 instanceof w) {
            return new d0((w) d2);
        }
        if (!(d2 instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + q1Var);
        }
        d dVar = (d) d2;
        Class u03 = z13 ? l0.u0(dVar) : l0.t0(dVar);
        List c13 = q1Var.c();
        if (c13.isEmpty()) {
            return u03;
        }
        if (!u03.isArray()) {
            return s(u03, c13);
        }
        if (u03.getComponentType().isPrimitive()) {
            return u03;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.u0(c13);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + q1Var);
        }
        z zVar = kTypeProjection.f80458a;
        int i13 = zVar == null ? -1 : e0.f108673a[zVar.ordinal()];
        if (i13 == -1 || i13 == 1) {
            return u03;
        }
        if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        v vVar2 = kTypeProjection.f80459b;
        Intrinsics.f(vVar2);
        Type o13 = o(vVar2);
        return o13 instanceof Class ? u03 : new a(o13);
    }

    public static gi.f n0(Class cls, Object obj, String str) {
        return new gi.f(obj, q0(obj, str), Array.newInstance((Class<?>) cls, 0).getClass(), 8);
    }

    public static /* synthetic */ Type o(v vVar) {
        return n(vVar, false);
    }

    public static Object o0(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(r0(obj.getClass(), str, cls2).invoke(obj, serializable));
        } catch (Exception e13) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e13);
        }
    }

    public static final boolean p(Throwable th3) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        ArrayList arrayList = new ArrayList();
        while (th3 != null && !arrayList.contains(th3)) {
            arrayList.add(th3);
            th3 = th3.getCause();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (X((Throwable) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static Object p0(Object obj, String str, Class cls, ArrayList arrayList, File file, Class cls2, ArrayList arrayList2) {
        try {
            return Object[].class.cast(r0(obj.getClass(), str, cls, File.class, cls2).invoke(obj, arrayList, file, arrayList2));
        } catch (Exception e13) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e13);
        }
    }

    public static final List q(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        as1.b imageResolutionProvider = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(imageResolutionProvider, "get(...)");
        xk2.v vVar = bs1.b.f23858a;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(imageResolutionProvider, "imageResolutionProvider");
        sr a13 = bs1.b.a(f30Var, imageResolutionProvider);
        sr b13 = bs1.b.b(f30Var, imageResolutionProvider);
        if (a13 == null || b13 == null) {
            return kotlin.collections.q0.f80391a;
        }
        String z43 = f30Var.z4();
        int doubleValue = (int) a13.h().doubleValue();
        int doubleValue2 = (int) a13.k().doubleValue();
        String j13 = a13.j();
        int doubleValue3 = (int) b13.h().doubleValue();
        return kotlin.collections.f0.l(new um(f30Var, z43, j13, doubleValue2, doubleValue, b13.j(), (int) b13.k().doubleValue(), doubleValue3));
    }

    public static Field q0(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(s1.c("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    public static ha2.z r(HashSet supportedOptions, Function1 optionHandler, ha2.x xVar, boolean z13, int i13) {
        ha2.x groupLabel = (i13 & 4) != 0 ? new ha2.x(m60.x0.lego_profile_create_options_title, null, null, null, null, 30) : xVar;
        boolean z14 = (i13 & 8) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(supportedOptions, "supportedOptions");
        Intrinsics.checkNotNullParameter(optionHandler, "optionHandler");
        Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
        ArrayList arrayList = new ArrayList();
        k41.b bVar = k41.b.Pin;
        if (supportedOptions.contains(bVar)) {
            arrayList.add(new ha2.a0(m60.x0.pin, bVar.ordinal(), null, null, null, null, null, null, z14 ? rm1.q.PIN : null, 508));
        }
        k41.b bVar2 = k41.b.Collage;
        if (supportedOptions.contains(bVar2)) {
            arrayList.add(new ha2.a0(m60.x0.collage, bVar2.ordinal(), null, null, null, null, null, null, z14 ? rm1.q.COLLAGE : null, 508));
        }
        k41.b bVar3 = k41.b.Section;
        if (supportedOptions.contains(bVar3)) {
            arrayList.add(new ha2.a0(m60.x0.board_section, bVar3.ordinal(), null, null, null, null, null, null, null, 1020));
        }
        k41.b bVar4 = k41.b.Board;
        if (supportedOptions.contains(bVar4)) {
            arrayList.add(new ha2.a0(m60.x0.board, bVar4.ordinal(), null, null, null, null, null, null, z14 ? rm1.q.BOARD : null, 508));
        }
        k41.b bVar5 = k41.b.Collaborator;
        if (supportedOptions.contains(bVar5)) {
            arrayList.add(new ha2.a0(m60.x0.collaborator, bVar5.ordinal(), null, null, null, null, null, null, null, 1020));
        }
        return new ha2.z(groupLabel, arrayList, optionHandler);
    }

    public static Method r0(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static final c0 s(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(v((KTypeProjection) it.next()));
            }
            return new c0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(v((KTypeProjection) it2.next()));
            }
            return new c0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        c0 s13 = s(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(v((KTypeProjection) it3.next()));
        }
        return new c0(cls, s13, arrayList3);
    }

    public static t5.b t(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        view.getClass();
        z0 z0Var = new z0(view, 20);
        if (editorInfo != null) {
            return new t5.b(inputConnection, z0Var);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }

    public static final void u(b4.o oVar, b3.u uVar, b3.s sVar, float f13, w0 w0Var, m4.k kVar, d3.i iVar, int i13) {
        ArrayList arrayList = oVar.f21632h;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            b4.s sVar2 = (b4.s) arrayList.get(i14);
            ((b4.b) sVar2.f21652a).g(uVar, sVar, f13, w0Var, kVar, iVar, i13);
            uVar.f(0.0f, ((b4.b) sVar2.f21652a).b());
        }
    }

    public static final Type v(KTypeProjection kTypeProjection) {
        z zVar = kTypeProjection.f80458a;
        if (zVar == null) {
            i0.f108675c.getClass();
            return i0.f108676d;
        }
        v vVar = kTypeProjection.f80459b;
        Intrinsics.f(vVar);
        int i13 = e0.f108673a[zVar.ordinal()];
        if (i13 == 1) {
            return new i0(null, n(vVar, true));
        }
        if (i13 == 2) {
            return n(vVar, true);
        }
        if (i13 == 3) {
            return new i0(n(vVar, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static long w(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        m7.l0 l0Var = (m7.l0) player;
        long h10 = l0Var.h();
        m7.w0 w0Var = l0Var.f86275m.f86415f;
        return Math.max(h10, w0Var != null ? n0.o0(((m7.n) w0Var).f86311l) : 0L);
    }

    public static void x(w82.i iVar, m60.e eVar) {
        iVar.f128478f0 = eVar;
    }

    public static void y(w82.i iVar, z70.m mVar) {
        iVar.f128476d0 = mVar;
    }

    public static void z(w82.i iVar, pb0.a aVar) {
        iVar.f128477e0 = aVar;
    }
}
