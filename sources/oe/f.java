package oe;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao2.j0;
import ao2.m0;
import b3.s0;
import c2.j1;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.so;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import df.u0;
import h32.f1;
import h32.i0;
import h32.k4;
import h32.r3;
import h32.v0;
import i2.e0;
import i2.f2;
import i2.q1;
import i2.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kh2.a1;
import kh2.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le.f0;
import lh0.a0;
import lh0.a4;
import lh0.g1;
import lh0.g3;
import lh0.k2;
import lh0.l1;
import lh0.n1;
import lh0.w0;
import lh0.z3;
import m60.x0;
import org.json.JSONException;
import p1.c1;
import p1.e1;
import p1.z;
import pc.k0;
import pc.r0;
import q3.p0;
import s80.n6;
import so.c2;
import so.k1;
import so.k3;
import so.l6;
import so.o6;
import so.r8;
import so.y5;
import t80.d0;
import tj0.b0;
import x02.i2;
import x40.i5;

/* loaded from: classes3.dex */
public abstract class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f94191a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f94192b;

    public static void A(PinCloseupFragment pinCloseupFragment, lh0.j jVar) {
        pinCloseupFragment.f46979c1 = jVar;
    }

    public static void A0(g41.m mVar, uk1.e eVar) {
        mVar.f63527z0 = eVar;
    }

    public static void B(PinCloseupFragment pinCloseupFragment, ps.e eVar) {
        pinCloseupFragment.A1 = eVar;
    }

    public static void B0(nz0.d dVar, uk1.e eVar) {
        dVar.T0 = eVar;
    }

    public static void C(PinCloseupFragment pinCloseupFragment, ax.a aVar) {
        pinCloseupFragment.f47034z1 = aVar;
    }

    public static void C0(p51.d dVar, uk1.e eVar) {
        dVar.A0 = eVar;
    }

    public static void D(PinCloseupFragment pinCloseupFragment, o6 o6Var) {
        pinCloseupFragment.V0 = o6Var;
    }

    public static void D0(g41.m mVar, c2 c2Var) {
        mVar.A0 = c2Var;
    }

    public static void E(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f46990g1 = aVar;
    }

    public static void E0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.getClass();
    }

    public static void F(GraphQLSearchGridFragment graphQLSearchGridFragment, vy.m mVar) {
        graphQLSearchGridFragment.Y0 = mVar;
    }

    public static void F0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f47012o1 = aVar;
    }

    public static void G(PinCloseupFragment pinCloseupFragment, yk1.a aVar) {
        pinCloseupFragment.W0 = aVar;
    }

    public static void G0(PinCloseupFragment pinCloseupFragment, l6 l6Var) {
        pinCloseupFragment.U0 = l6Var;
    }

    public static void H(PinCloseupFragment pinCloseupFragment, cz.e eVar) {
        pinCloseupFragment.f47030x1 = eVar;
    }

    public static void H0(nz0.d dVar, e01.a aVar) {
        dVar.V0 = aVar;
    }

    public static void I(PinCloseupFragment pinCloseupFragment, dz.a aVar) {
        pinCloseupFragment.f47032y1 = aVar;
    }

    public static void I0(PinCloseupFragment pinCloseupFragment, androidx.appcompat.widget.c2 c2Var) {
        pinCloseupFragment.I1 = c2Var;
    }

    public static void J(gr1.d dVar, or1.i iVar) {
        dVar.f66000e = iVar;
    }

    public static void J0(PinCloseupFragment pinCloseupFragment, c82.d dVar) {
        pinCloseupFragment.G1 = dVar;
    }

    public static void K(PinCloseupFragment pinCloseupFragment) {
        pinCloseupFragment.getClass();
    }

    public static void K0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.Z0 = aVar;
    }

    public static void L(GraphQLSearchGridFragment graphQLSearchGridFragment, pb0.a aVar) {
        graphQLSearchGridFragment.U0 = aVar;
    }

    public static void L0(g41.m mVar, i92.k kVar) {
        mVar.B0 = kVar;
    }

    public static void M(PinCloseupFragment pinCloseupFragment, is1.f fVar) {
        pinCloseupFragment.f47028w1 = fVar;
    }

    public static void M0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f47004k3 = aVar;
    }

    public static void N(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f47008m1 = aVar;
    }

    public static void N0(PinCloseupFragment pinCloseupFragment, r01.d dVar) {
        pinCloseupFragment.F1 = dVar;
    }

    public static void O(PinCloseupFragment pinCloseupFragment, bf2.d dVar) {
        pinCloseupFragment.f46984e1 = dVar;
    }

    public static void O0(PinCloseupFragment pinCloseupFragment) {
        pinCloseupFragment.f47016q1 = ac2.f.f1945a;
    }

    public static void P(PinCloseupFragment pinCloseupFragment, w0 w0Var) {
        pinCloseupFragment.f47018r1 = w0Var;
    }

    public static void P0(GraphQLSearchGridFragment graphQLSearchGridFragment, yk1.v vVar) {
        graphQLSearchGridFragment.f47656a1 = vVar;
    }

    public static void Q(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.R0 = aVar;
    }

    public static void Q0(bd2.c cVar, com.pinterest.widget.configuration.h hVar) {
        cVar.f22730d0 = hVar;
    }

    public static void R(PinCloseupFragment pinCloseupFragment, rg0.s sVar) {
        pinCloseupFragment.J1 = sVar;
    }

    public static final boolean R0(n6 n6Var) {
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        String str = (String) n6Var.f111729u.get("android_collage_composer_effects");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static void S(PinCloseupFragment pinCloseupFragment, a0 a0Var) {
        pinCloseupFragment.f46973a1 = a0Var;
    }

    public static final boolean S0(n6 n6Var) {
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        String str = (String) n6Var.f111729u.get("android_curation_collage_composer_drawer_pullup");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static void T(GraphQLSearchGridFragment graphQLSearchGridFragment, g3 g3Var) {
        graphQLSearchGridFragment.V0 = g3Var;
    }

    public static final boolean T0(n6 n6Var) {
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        String str = (String) n6Var.f111729u.get("android_curation_collage_templates");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static void U(PinCloseupFragment pinCloseupFragment) {
        pinCloseupFragment.getClass();
    }

    public static final boolean U0(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String str = (String) d0Var.f116688e.get("android_curation_collage_templates");
        return v50.a.a(str) || v50.a.b(str);
    }

    public static void V(PinCloseupFragment pinCloseupFragment) {
        pinCloseupFragment.getClass();
    }

    public static boolean V0(Object obj) {
        return (obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap);
    }

    public static void W(PinCloseupFragment pinCloseupFragment, pb0.d dVar) {
        pinCloseupFragment.f46999j1 = dVar;
    }

    public static final boolean W0(ke2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Object obj = dVar.f79321c.get(1);
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void X(GraphQLSearchGridFragment graphQLSearchGridFragment, k3 k3Var) {
        graphQLSearchGridFragment.X0 = k3Var;
    }

    public static final void X0(String pinId, cc2.c cVar, double d2, String videoSource, long j13, long j14, long j15, double d13, r3 playbackState, float f13, i0 i0Var) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        n1 c13 = n1.f83436b.c();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) c13.f83439a;
        if (!g1Var.o("ios_android_idea_ads_playtime_metric", "enabled", z3Var)) {
            g1Var.l("ios_android_idea_ads_playtime_metric");
        }
        if (cVar != null) {
            cVar.c(new h32.g3(videoSource, null, null, null, Long.valueOf(j13), Long.valueOf(j14), Long.valueOf(j15), Long.valueOf((long) d13), null, Double.valueOf(f13 * 0.01d), null, null, null, Integer.valueOf(cc2.g.INVALID_QUARTILE.getTraditionalQuartile()), playbackState, null, null, null, null, null, k4.WATCHTIME_PLAYSTATE, null, Long.valueOf((long) d2), null, null, null, null, null), videoSource, pinId, i0Var, false);
        }
    }

    public static void Y(PinCloseupFragment pinCloseupFragment, l1 l1Var) {
        pinCloseupFragment.f46976b1 = l1Var;
    }

    public static final cc2.g Y0(double d2, double d13, float f13, long j13, i0 i0Var, r3 playbackState, cc2.c cVar, cc2.g quartile, String pinId, String videoSource) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        double d14 = j13 + d2;
        cc2.f fVar = cc2.g.Companion;
        double min = Math.min((d14 / d13) * 100, 100.0d);
        fVar.getClass();
        cc2.g a13 = cc2.f.a(min);
        if (quartile.getPercentQuartile() == a13.getPercentQuartile()) {
            return quartile;
        }
        long j14 = qg1.j.f103846a[quartile.ordinal()] == 1 ? j13 : (long) d2;
        n1 c13 = n1.f83436b.c();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) c13.f83439a;
        if (!g1Var.o("ios_android_idea_ads_playtime_metric", "enabled", z3Var)) {
            g1Var.l("ios_android_idea_ads_playtime_metric");
        }
        Z0(d14, d13, f13, j14, i0Var, playbackState, cVar, a13, pinId, videoSource);
        return a13;
    }

    public static void Z(PinCloseupFragment pinCloseupFragment, r8 r8Var) {
        pinCloseupFragment.f46993h1 = r8Var;
    }

    public static final void Z0(double d2, double d13, float f13, long j13, i0 i0Var, r3 r3Var, cc2.c cVar, cc2.g gVar, String str, String str2) {
        if (cVar != null) {
            h32.g3 source = new h32.g3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            Intrinsics.checkNotNullParameter(source, "source");
            cVar.f(new h32.g3(null, null, null, null, Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), Long.valueOf(j13), Long.valueOf((long) d2), null, Double.valueOf(f13 * 0.01d), null, null, null, Integer.valueOf(gVar.getTraditionalQuartile()), r3Var, null, Double.valueOf(gVar.getPercentQuartile()), null, null, null, null, null, Long.valueOf((long) d13), null, null, null, null, null), str2, str, i0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r18, float r19, u2.q r20, i2.o r21, int r22, int r23) {
        /*
            r1 = r18
            r2 = r19
            r4 = r22
            r0 = r21
            i2.s r0 = (i2.s) r0
            r3 = 407701127(0x184d0687, float:2.6498924E-24)
            r0.Y(r3)
            r3 = r23 & 1
            r5 = 2
            if (r3 == 0) goto L18
            r3 = r4 | 6
            goto L28
        L18:
            r3 = r4 & 14
            if (r3 != 0) goto L27
            boolean r3 = r0.h(r1)
            if (r3 == 0) goto L24
            r3 = 4
            goto L25
        L24:
            r3 = r5
        L25:
            r3 = r3 | r4
            goto L28
        L27:
            r3 = r4
        L28:
            r6 = r23 & 2
            if (r6 == 0) goto L2f
            r3 = r3 | 48
            goto L3f
        L2f:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L3f
            boolean r6 = r0.e(r2)
            if (r6 == 0) goto L3c
            r6 = 32
            goto L3e
        L3c:
            r6 = 16
        L3e:
            r3 = r3 | r6
        L3f:
            r6 = r23 & 4
            if (r6 == 0) goto L48
            r3 = r3 | 384(0x180, float:5.38E-43)
        L45:
            r7 = r20
            goto L5a
        L48:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L45
            r7 = r20
            boolean r8 = r0.h(r7)
            if (r8 == 0) goto L57
            r8 = 256(0x100, float:3.59E-43)
            goto L59
        L57:
            r8 = 128(0x80, float:1.8E-43)
        L59:
            r3 = r3 | r8
        L5a:
            r3 = r3 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r3 != r8) goto L6c
            boolean r3 = r0.z()
            if (r3 != 0) goto L67
            goto L6c
        L67:
            r0.Q()
            r3 = r7
            goto L9f
        L6c:
            if (r6 == 0) goto L71
            u2.n r3 = u2.n.f120041b
            goto L72
        L71:
            r3 = r7
        L72:
            r6 = 1065353216(0x3f800000, float:1.0)
            u2.q r6 = androidx.compose.foundation.layout.e.b(r3, r6)
            u2.q r6 = androidx.compose.foundation.layout.e.c(r6, r2)
            com.pinterest.feature.pin.closeup.datasource.g r7 = new com.pinterest.feature.pin.closeup.datasource.g
            r7.<init>(r1, r5)
            r5 = -968461365(0xffffffffc64673cb, float:-12700.948)
            q2.h r13 = q2.i.c(r5, r7, r0)
            r11 = 0
            r12 = 0
            r7 = 0
            r8 = 0
            r14 = 0
            r16 = 1572864(0x180000, float:2.204052E-39)
            r17 = 62
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r14
            r14 = r0
            r15 = r16
            r16 = r17
            c2.j1.h(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16)
        L9f:
            i2.f2 r6 = r0.t()
            if (r6 == 0) goto Lb5
            om0.p0 r7 = new om0.p0
            r0 = r7
            r1 = r18
            r2 = r19
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.a(java.lang.String, float, u2.q, i2.o, int, int):void");
    }

    public static void a0(PinCloseupFragment pinCloseupFragment, r8 r8Var) {
        pinCloseupFragment.f46996i1 = r8Var;
    }

    public static final void a1(nx.d0 d0Var, String id3, long j13, int i13, f1 eventType, Integer num) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        HashMap hashMap = new HashMap();
        hashMap.put("grid_index", String.valueOf(i13));
        if (num != null) {
            hashMap.put("grid_click_type", String.valueOf(num.intValue()));
        }
        Unit unit = Unit.f80348a;
        v0 v0Var = new v0();
        v0Var.C = Long.valueOf(j13);
        d0Var.H(eventType, id3, null, hashMap, v0Var, false);
    }

    public static final void b(u21.d0 viewModel, u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        long h10;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2023675862);
        int i16 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i16 != 0 ? nVar : qVar;
        q1 y13 = bs1.c.y(viewModel.f120085g.d(), new u21.b("", q0.f80391a, new zy.a0()), null, sVar, 72, 2);
        u2.q j13 = qVar2.j(androidx.compose.foundation.layout.e.f17184c);
        fc0.g gVar = (fc0.g) ((fc0.f) sVar.m(fc0.h.f61707g));
        int i17 = gVar.f61695a;
        u2.q b13 = androidx.compose.foundation.a.b(j13, gVar.f61696b, s0.f21349a);
        p1.e eVar = p1.l.f98545c;
        p1.y a13 = p1.x.a(eVar, u2.b.f120025m, sVar, 0);
        int i18 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, b13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
            ep.b.y(i18, sVar, i18, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        p1.a0 a0Var = p1.a0.f98480a;
        sVar.X(-343918132);
        sVar.X(1260950861);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new df2.b();
            sVar.g0(J2);
        }
        df2.b bVar = (df2.b) J2;
        sVar.r(false);
        sVar.r(false);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            e0 e0Var = new e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar));
            sVar.g0(e0Var);
            J3 = e0Var;
        }
        j0 j0Var = ((e0) J3).f71100a;
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        i(viewModel.f120085g.e(), null, sVar, 8, 2);
        u2.q a14 = dev.shreyaspatil.capturable.a.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.r(z.a(a0Var, androidx.compose.foundation.layout.e.b(nVar, 1.0f), 1.0f), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, sVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, sVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, sVar), 0.0f, 8), v1.i.a(com.bumptech.glide.d.A(db0.a.reward_page_xlarge_paddings, sVar))), bVar);
        if (androidx.compose.foundation.a.h(sVar)) {
            sVar.W(-1371794843);
            h10 = g0.h(eo1.b.base_color_grayscale_400, sVar);
            i15 = 0;
            sVar.r(false);
        } else {
            i15 = 0;
            sVar.W(-1371698650);
            h10 = g0.h(eo1.b.base_color_grayscale_25, sVar);
            sVar.r(false);
        }
        u2.q qVar3 = qVar2;
        j1.h(a14, null, h10, 0L, null, i15, q2.i.c(756264924, new androidx.compose.foundation.lazy.layout.v(28, a0Var, y13), sVar), sVar, 1769472, 26);
        u2.q o14 = androidx.compose.foundation.layout.b.o(nVar, com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, sVar), com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, sVar));
        p1.y a15 = p1.x.a(eVar, u2.b.f120026n, sVar, 48);
        int i19 = sVar.P;
        z1 o15 = sVar.o();
        u2.q X2 = m0.X(sVar, o14);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a15, hVar);
        tb.f.f0(sVar, o15, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i19))) {
            ep.b.y(i19, sVar, i19, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        rl2.g0.b(new yl1.b(bs1.c.j2(new String[0], db0.f.save_to_board), false, null, null, yl1.d.TERTIARY.getColorPalette(), null, null, null, 0, null, 1006), androidx.compose.foundation.layout.e.b(nVar, 1.0f), new rx0.f(j0Var, bVar, viewModel, 7), sVar, 56, 0);
        rl2.g0.b(new yl1.b(bs1.c.j2(new String[0], x0.share), false, null, null, yl1.d.PRIMARY.getColorPalette(), null, null, null, 0, null, 1006), androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.b(nVar, 1.0f), 0.0f, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, sVar), 0.0f, 0.0f, 13), new aw0.j(j0Var, bVar, viewModel, context, 6), sVar, 8, 0);
        sVar.r(true);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 27, viewModel, qVar3);
        }
    }

    public static void b0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f47001j3 = aVar;
    }

    public static /* synthetic */ void b1(nx.d0 d0Var, String str, long j13, int i13, Integer num, int i14) {
        if ((i14 & 4) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        f1 f1Var = f1.PIN_IAB_DURATION;
        if ((i14 & 16) != 0) {
            num = null;
        }
        a1(d0Var, str, j13, i15, f1Var, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(int r19, int r20, i2.o r21, u2.q r22, kotlin.jvm.functions.Function1 r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r23
            java.lang.String r3 = "onStyleSelected"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r15 = r21
            i2.s r15 = (i2.s) r15
            r3 = 359995846(0x157519c6, float:4.9497688E-26)
            r15.Y(r3)
            r3 = r1 & 1
            r4 = 4
            r5 = 2
            if (r3 == 0) goto L1e
            r3 = r0 | 6
            goto L2e
        L1e:
            r3 = r0 & 14
            if (r3 != 0) goto L2d
            boolean r3 = r15.j(r2)
            if (r3 == 0) goto L2a
            r3 = r4
            goto L2b
        L2a:
            r3 = r5
        L2b:
            r3 = r3 | r0
            goto L2e
        L2d:
            r3 = r0
        L2e:
            r6 = r1 & 2
            if (r6 == 0) goto L37
            r3 = r3 | 48
        L34:
            r7 = r22
            goto L49
        L37:
            r7 = r0 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L34
            r7 = r22
            boolean r8 = r15.h(r7)
            if (r8 == 0) goto L46
            r8 = 32
            goto L48
        L46:
            r8 = 16
        L48:
            r3 = r3 | r8
        L49:
            r8 = r3 & 91
            r9 = 18
            if (r8 != r9) goto L5c
            boolean r8 = r15.z()
            if (r8 != 0) goto L56
            goto L5c
        L56:
            r15.Q()
            r18 = r15
            goto La9
        L5c:
            if (r6 == 0) goto L63
            u2.n r6 = u2.n.f120041b
            r16 = r6
            goto L65
        L63:
            r16 = r7
        L65:
            r1.b r9 = new r1.b
            r9.<init>(r5)
            r5 = 764162136(0x2d8c3058, float:1.5937626E-11)
            r15.W(r5)
            r5 = r3 & 14
            r6 = 0
            if (r5 != r4) goto L77
            r4 = 1
            goto L78
        L77:
            r4 = r6
        L78:
            java.lang.Object r5 = r15.J()
            if (r4 != 0) goto L82
            am.d r4 = i2.n.f71185a
            if (r5 != r4) goto L8b
        L82:
            u81.c0 r5 = new u81.c0
            r4 = 3
            r5.<init>(r2, r4)
            r15.g0(r5)
        L8b:
            r13 = r5
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r15.r(r6)
            r3 = r3 & 112(0x70, float:1.57E-43)
            r14 = 0
            r17 = 0
            r4 = 508(0x1fc, float:7.12E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = r15
            r12 = r16
            r18 = r15
            r15 = r17
            bp1.h.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r7 = r16
        La9:
            i2.f2 r3 = r18.t()
            if (r3 == 0) goto Lb6
            s80.c4 r4 = new s80.c4
            r4.<init>(r2, r7, r0, r1)
            r3.f71113d = r4
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.c(int, int, i2.o, u2.q, kotlin.jvm.functions.Function1):void");
    }

    public static void c0(PinCloseupFragment pinCloseupFragment, hs.d dVar) {
        pinCloseupFragment.C1 = dVar;
    }

    public static void c1(HashMap hashMap) {
        SharedPreferences sharedPreferences = le.v.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        y yVar = y.DATASETID;
        Object obj = hashMap.get(yVar.getRawValue());
        y yVar2 = y.URL;
        Object obj2 = hashMap.get(yVar2.getRawValue());
        y yVar3 = y.ACCESSKEY;
        Object obj3 = hashMap.get(yVar3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(yVar.getRawValue(), obj.toString());
        edit.putString(yVar2.getRawValue(), obj2.toString());
        edit.putString(yVar3.getRawValue(), obj3.toString());
        edit.apply();
        wc.b bVar = u0.f54860d;
        wc.b.y(le.g0.APP_EVENTS, "oe.f", " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }

    public static void d0(PinCloseupFragment pinCloseupFragment, bc2.e eVar) {
        pinCloseupFragment.f47020s1 = eVar;
    }

    public static String d1(int i13, String str) {
        int length = str.length() - i13;
        if (length < 25) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        String substring = str.substring(0, i13);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(substring);
        sb3.append("***<");
        sb3.append(length);
        sb3.append("> CHARS TRUNCATED***");
        return sb3.toString();
    }

    public static final void e(Function0 onBackClicked, i2.o oVar, int i13) {
        int i14;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1797768205);
        if ((i13 & 14) == 0) {
            i14 = (sVar.j(onBackClicked) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 1;
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            rm1.d dVar = new rm1.d(new rm1.f(rm1.q.ARROW_BACK, rm1.i.LG), rm1.c.SUBTLE, null, 0, null, 28);
            gc0.a aVar = gc0.b.f64771a;
            b4.d dVar2 = new b4.d();
            dVar2.f21536a.append("Pick a style to repaint the space");
            b4.g e13 = dVar2.e();
            sVar.W(-1625630075);
            int i16 = 0;
            boolean z13 = (i14 & 14) == 4;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new u81.d0(onBackClicked, i16);
                sVar.g0(J2);
            }
            sVar.r(false);
            kh2.k3.n(dVar, aVar, null, null, e13, null, (Function0) J2, null, null, sVar, 3464, 416);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new sc0.b(i13, i15, onBackClicked);
        }
    }

    public static void e0(PinCloseupFragment pinCloseupFragment, yk1.j jVar) {
        pinCloseupFragment.f47010n1 = jVar;
    }

    public static void e1(tc.g writer, pc.v customScalarAdapters, i5 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f132522a instanceof pc.q0) {
            writer.M0("board");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) value.f132522a);
        }
        r0 r0Var = value.f132523b;
        if (r0Var instanceof pc.q0) {
            writer.M0("exploreArticle");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        r0 r0Var2 = value.f132524c;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("pin");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
        r0 r0Var3 = value.f132525d;
        if (r0Var3 instanceof pc.q0) {
            writer.M0("pins");
            pc.c.d(pc.c.b(pc.c.a(pc.c.f99524e))).a(writer, customScalarAdapters, (pc.q0) r0Var3);
        }
        writer.M0("source");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132526e);
        r0 r0Var4 = value.f132527f;
        if (r0Var4 instanceof pc.q0) {
            writer.M0("text");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var4);
        }
        r0 r0Var5 = value.f132528g;
        if (r0Var5 instanceof pc.q0) {
            writer.M0("todayArticle");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var5);
        }
        r0 r0Var6 = value.f132529h;
        if (r0Var6 instanceof pc.q0) {
            writer.M0("user");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var6);
        }
        r0 r0Var7 = value.f132530i;
        if (r0Var7 instanceof pc.q0) {
            writer.M0("userDidItData");
            pc.c.d(pc.c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var7);
        }
        writer.M0("userIds");
        k0 k0Var = pc.c.f99524e;
        pc.c.a(k0Var).b(writer, customScalarAdapters, value.f132531j);
        r0 r0Var8 = value.f132532k;
        if (r0Var8 instanceof pc.q0) {
            writer.M0("emails");
            pc.c.d(pc.c.b(pc.c.a(k0Var))).a(writer, customScalarAdapters, (pc.q0) r0Var8);
        }
        r0 r0Var9 = value.f132533l;
        if (r0Var9 instanceof pc.q0) {
            writer.M0("imageSpec");
            pc.c.d(eVar).a(writer, customScalarAdapters, (pc.q0) r0Var9);
        }
        r0 r0Var10 = value.f132534m;
        if (r0Var10 instanceof pc.q0) {
            writer.M0("clientTrackingParams");
            pc.c.d(k0Var).a(writer, customScalarAdapters, (pc.q0) r0Var10);
        }
        r0 r0Var11 = value.f132535n;
        if (r0Var11 instanceof pc.q0) {
            writer.M0("shouldRequestPinsubTopicId");
            pc.c.d(pc.c.f99527h).a(writer, customScalarAdapters, (pc.q0) r0Var11);
        } else if (customScalarAdapters.f99608b.f15032b) {
            writer.M0("shouldRequestPinsubTopicId");
            pc.c.f99522c.d(writer, customScalarAdapters, Boolean.FALSE);
        }
    }

    public static void f0(GraphQLSearchGridFragment graphQLSearchGridFragment, yk1.j jVar) {
        graphQLSearchGridFragment.T0 = jVar;
    }

    public static kk2.l f1(ok1.f fVar, wy0 user, String str, Function2 onSuccess, int i13) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        int i14 = i13 & 4;
        ok1.b onFailure = ok1.b.f95453i;
        if (i14 != 0) {
            onSuccess = onFailure;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        xj2.c o13 = (c0.d.d2(user) ? fVar.c(user, null) : ok1.f.a(fVar, user, null, str, 2)).o(new rh1.q1(16, new t3.k3(2, onSuccess)), new rh1.q1(17, new oh1.u(18, onFailure, user)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        return (kk2.l) o13;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(kotlin.Pair r32, u2.q r33, kotlin.jvm.functions.Function0 r34, i2.o r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.g(kotlin.Pair, u2.q, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static void g0(PinCloseupFragment pinCloseupFragment, c91.e eVar) {
        pinCloseupFragment.f46987f1 = eVar;
    }

    public static hd.p g1(int i13, List list) {
        hd.p g13;
        Object obj;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < size) {
            int i17 = i14 + 1;
            Object obj2 = list.get(i14);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str.length() > i13) {
                    String d13 = d1(i13, str);
                    int length = str.length() - i13;
                    list.set(i14, d13);
                    i15++;
                    i16 += length;
                    i14 = i17;
                }
            }
            if (V0(obj2)) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
                g13 = h1(i13, dl2.b.u(obj2));
                obj = obj2;
            } else if ((obj2 instanceof ArrayList) || (obj2 instanceof LinkedList) || (obj2 instanceof CopyOnWriteArrayList) || (obj2 instanceof Vector)) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
                g13 = g1(i13, dl2.b.t(obj2));
                obj = obj2;
            } else if (obj2 instanceof Map) {
                Map u13 = dl2.b.u(z0.r((Map) obj2));
                g13 = h1(i13, u13);
                obj = u13;
            } else if (obj2 instanceof Collection) {
                ArrayList H0 = CollectionsKt.H0((Collection) obj2);
                g13 = g1(i13, H0);
                obj = H0;
            } else {
                i14 = i17;
            }
            list.set(i14, obj);
            i15 += g13.f68843a;
            i16 += g13.f68844b;
            i14 = i17;
        }
        return new hd.p(i15, i16);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(u2.q r13, kotlin.jvm.functions.Function0 r14, kotlin.jvm.functions.Function1 r15, i2.o r16, int r17, int r18) {
        /*
            r4 = r17
            r0 = r16
            i2.s r0 = (i2.s) r0
            r1 = -1847054682(0xffffffff91e82ea6, float:-3.6631895E-28)
            r0.Y(r1)
            r1 = r18 & 1
            if (r1 == 0) goto L15
            r2 = r4 | 6
            r3 = r2
            r2 = r13
            goto L27
        L15:
            r2 = r4 & 14
            if (r2 != 0) goto L25
            r2 = r13
            boolean r3 = r0.h(r13)
            if (r3 == 0) goto L22
            r3 = 4
            goto L23
        L22:
            r3 = 2
        L23:
            r3 = r3 | r4
            goto L27
        L25:
            r2 = r13
            r3 = r4
        L27:
            r5 = r18 & 2
            if (r5 == 0) goto L2f
            r3 = r3 | 48
        L2d:
            r6 = r14
            goto L40
        L2f:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L2d
            r6 = r14
            boolean r7 = r0.j(r14)
            if (r7 == 0) goto L3d
            r7 = 32
            goto L3f
        L3d:
            r7 = 16
        L3f:
            r3 = r3 | r7
        L40:
            r7 = r18 & 4
            if (r7 == 0) goto L48
            r3 = r3 | 384(0x180, float:5.38E-43)
        L46:
            r8 = r15
            goto L59
        L48:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L46
            r8 = r15
            boolean r9 = r0.j(r15)
            if (r9 == 0) goto L56
            r9 = 256(0x100, float:3.59E-43)
            goto L58
        L56:
            r9 = 128(0x80, float:1.8E-43)
        L58:
            r3 = r3 | r9
        L59:
            r3 = r3 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r3 != r9) goto L6d
            boolean r3 = r0.z()
            if (r3 != 0) goto L66
            goto L6d
        L66:
            r0.Q()
            r1 = r2
            r2 = r6
            r3 = r8
            goto L97
        L6d:
            if (r1 == 0) goto L72
            u2.n r1 = u2.n.f120041b
            goto L73
        L72:
            r1 = r2
        L73:
            if (r5 == 0) goto L78
            u81.e0 r2 = u81.e0.f121022i
            goto L79
        L78:
            r2 = r6
        L79:
            if (r7 == 0) goto L7e
            u81.f0 r3 = u81.f0.f121024i
            goto L7f
        L7e:
            r3 = r8
        L7f:
            l1.s r5 = new l1.s
            r5.<init>(r1, r2, r3)
            r6 = 202092934(0xc0bb186, float:1.0761592E-31)
            q2.h r9 = q2.i.c(r6, r5, r0)
            r7 = 0
            r8 = 0
            r5 = 1
            r6 = 0
            r11 = 24582(0x6006, float:3.4447E-41)
            r12 = 14
            r10 = r0
            fc0.n.a(r5, r6, r7, r8, r9, r10, r11, r12)
        L97:
            i2.f2 r6 = r0.t()
            if (r6 == 0) goto La9
            k31.h r7 = new k31.h
            r0 = r7
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.h(u2.q, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static void h0(PinCloseupFragment pinCloseupFragment, k2 k2Var) {
        pinCloseupFragment.f46982d1 = k2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        r4 = g1(r6, dl2.b.t(r3));
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static hd.p h1(int r6, java.util.Map r7) {
        /*
            java.util.Set r7 = r7.entrySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L39
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.length()
            if (r5 <= r6) goto L39
            java.lang.String r3 = d1(r6, r4)
            int r4 = r4.length()
            int r4 = r4 - r6
            r2.setValue(r3)
            int r0 = r0 + 1
            int r1 = r1 + r4
            goto Lc
        L39:
            boolean r4 = V0(r3)
            if (r4 == 0) goto L5b
            if (r3 == 0) goto L53
            java.util.Map r4 = dl2.b.u(r3)
            hd.p r4 = h1(r6, r4)
        L49:
            r2.setValue(r3)
            int r2 = r4.f68843a
            int r0 = r0 + r2
            int r2 = r4.f68844b
            int r1 = r1 + r2
            goto Lc
        L53:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            r6.<init>(r7)
            throw r6
        L5b:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L8e
            boolean r4 = r3 instanceof java.util.LinkedList
            if (r4 != 0) goto L8e
            boolean r4 = r3 instanceof java.util.concurrent.CopyOnWriteArrayList
            if (r4 != 0) goto L8e
            boolean r4 = r3 instanceof java.util.Vector
            if (r4 == 0) goto L6c
            goto L8e
        L6c:
            boolean r4 = r3 instanceof java.util.Map
            if (r4 == 0) goto L7f
            java.util.Map r3 = (java.util.Map) r3
            java.util.LinkedHashMap r3 = kotlin.collections.z0.r(r3)
            java.util.Map r3 = dl2.b.u(r3)
            hd.p r4 = h1(r6, r3)
            goto L49
        L7f:
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto Lc
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.ArrayList r3 = kotlin.collections.CollectionsKt.H0(r3)
            hd.p r4 = g1(r6, r3)
            goto L49
        L8e:
            if (r3 == 0) goto L99
            java.util.List r4 = dl2.b.t(r3)
            hd.p r4 = g1(r6, r4)
            goto L49
        L99:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>"
            r6.<init>(r7)
            throw r6
        La1:
            hd.p r6 = new hd.p
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.h1(int, java.util.Map):hd.p");
    }

    public static final void i(u50.r rVar, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2132013732);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        u2.q r13 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.e.b(qVar2, 1.0f), com.bumptech.glide.d.A(db0.a.toolbar_min_height, sVar), Float.NaN), 0.0f, com.bumptech.glide.d.A(db0.a.reward_page_xlarge_paddings, sVar), 0.0f, 0.0f, 13);
        u2.i iVar = u2.b.f120017e;
        p0 e13 = p1.q.e(iVar, false);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, r13);
        s3.k.Qo.getClass();
        s3.i iVar2 = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar2);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, e13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
        e1 a13 = c1.a(p1.l.f98543a, u2.b.f120023k, sVar, 48);
        int i17 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X2 = m0.X(sVar, b13);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar2);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, hVar);
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        ig1.b.b(new om1.c(rm1.q.CANCEL, om1.e.MD, om1.f.TRANSPARENT_DARK_GRAY, null, null, false, 0, 1016), androidx.compose.foundation.layout.b.p(nVar, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, sVar), 0.0f, 2), new p70.a(rVar, 15), sVar, 8, 0);
        sVar.r(true);
        u2.q b14 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
        p0 e14 = p1.q.e(iVar, false);
        int i18 = sVar.P;
        z1 o15 = sVar.o();
        u2.q X3 = m0.X(sVar, b14);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar2);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e14, hVar);
        tb.f.f0(sVar, o15, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
            ep.b.y(i18, sVar, i18, hVar3);
        }
        tb.f.f0(sVar, X3, hVar4);
        String D0 = a1.D0(db0.f.reward_page_header_title_default, sVar);
        dl2.b.c(new rn1.a(ep.b.x(D0, "string", D0), null, null, null, vn1.g.UI_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097134), null, null, null, sVar, 8, 14);
        sVar.r(true);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u21.r(rVar, qVar2, i13, i14, 0);
        }
    }

    public static void i0(GraphQLSearchGridFragment graphQLSearchGridFragment, k2 k2Var) {
        graphQLSearchGridFragment.W0 = k2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r4)) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(java.util.List r26, float r27, u2.q r28, i2.o r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.j(java.util.List, float, u2.q, i2.o, int, int):void");
    }

    public static void j0(nz0.d dVar, b0 b0Var) {
        dVar.U0 = b0Var;
    }

    public static final String k(String str, String str2, Map map) {
        String str3 = (String) map.get(str);
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                return str3;
            }
        }
        String str4 = (String) map.get(str2);
        return str4 == null ? "" : str4;
    }

    public static void k0(PinCloseupFragment pinCloseupFragment, kv.c cVar) {
        pinCloseupFragment.E1 = cVar;
    }

    public static void l0(PinCloseupFragment pinCloseupFragment, m60.g0 g0Var) {
        pinCloseupFragment.S0 = g0Var;
    }

    public static final void m(x92.b bVar) {
        n60.o.C(bVar, "apiFieldsMap", "pin.domain", "pin.canonical_merchant_domain", "pin.canonical_merchant_name");
        n60.o.w(bVar, "pin.link_domain()", "pin.link_user_website()", "domain.id", "domain.name");
        bVar.e("domain.official_user()");
        bVar.e("userwebsite.official_user()");
        bVar.h("pin.images", "236x");
        n60.o.A(bVar, "pin.images", "736x", "user.image_medium_url", "pin.dominant_color");
        n60.o.w(bVar, "pin.rich_summary()", "pin.domain", "pin.id", "pin.type");
        bVar.e("pin.cacheable_id");
        bVar.e("pin.link");
        com.bumptech.glide.d.e(bVar);
        bVar.e("pin.shopping_flags");
        df.j1.g(bVar);
        bVar.e("user.is_verified_merchant");
    }

    public static void m0(p51.d dVar, m60.g0 g0Var) {
        dVar.f98897z0 = g0Var;
    }

    public static final void n(GestaltStaticSearchBar gestaltStaticSearchBar, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltStaticSearchBar, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        cn1.d0 d0Var = new cn1.d0(gestaltStaticSearchBar.t0());
        init.invoke(d0Var);
        gestaltStaticSearchBar.d0(new an1.i(d0Var, 5));
    }

    public static void n0(PinCloseupFragment pinCloseupFragment, nx.b0 b0Var) {
        pinCloseupFragment.f47026v1 = b0Var;
    }

    public static final boolean o(n6 n6Var, String keyWord) {
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        String str = (String) n6Var.f111729u.get("android_curation_collage_composer_drawer_pullup");
        return str != null && kotlin.text.z.p(str, "control", false) && StringsKt.E(str, keyWord, false);
    }

    public static void o0(PinCloseupFragment pinCloseupFragment, y5 y5Var) {
        pinCloseupFragment.T0 = y5Var;
    }

    public static final boolean p(n6 n6Var, String keyWord) {
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        String str = (String) n6Var.f111729u.get("android_curation_collage_composer_drawer_pullup");
        if (str != null) {
            return (kotlin.text.z.p(str, "enabled", false) || kotlin.text.z.p(str, "employee", false)) && StringsKt.E(str, keyWord, false);
        }
        return false;
    }

    public static void p0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f47005l1 = aVar;
    }

    public static final void q() {
        try {
            le.a0 a0Var = new le.a0(null, Intrinsics.n("/cloudbridge_settings", le.v.b()), null, f0.GET, new e(0));
            wc.b bVar = u0.f54860d;
            wc.b.y(le.g0.APP_EVENTS, "oe.f", " \n\nCreating Graph Request: \n=============\n%s\n\n ", a0Var);
            a0Var.e();
        } catch (JSONException e13) {
            wc.b bVar2 = u0.f54860d;
            wc.b.y(le.g0.APP_EVENTS, "oe.f", " \n\nGraph Request Exception: \n=============\n%s\n\n ", xk2.f.b(e13));
        }
    }

    public static void q0(PinCloseupFragment pinCloseupFragment, i2 i2Var) {
        pinCloseupFragment.X0 = i2Var;
    }

    public static final Drawable r(Context context, em1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        xk2.v n13 = a.c.n(context, 1);
        xk2.v b13 = xk2.m.b(new com.pinterest.feature.search.results.view.b0(context, 29));
        xk2.v n14 = a.c.n(context, 0);
        xk2.v n15 = a.c.n(context, 7);
        xk2.v n16 = a.c.n(context, 5);
        xk2.v n17 = a.c.n(context, 6);
        xk2.v n18 = a.c.n(context, 4);
        xk2.v n19 = a.c.n(context, 2);
        xk2.v n23 = a.c.n(context, 3);
        int i13 = em1.j.f59629b[dVar.f59599b.ordinal()];
        em1.b bVar = dVar.f59598a;
        if (i13 == 1) {
            int i14 = em1.j.f59628a[bVar.ordinal()];
            if (i14 == 1) {
                return (Drawable) n13.getValue();
            }
            if (i14 == 2) {
                return (Drawable) n14.getValue();
            }
            if (i14 == 3) {
                return (Drawable) b13.getValue();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 == 2) {
            int i15 = em1.j.f59628a[bVar.ordinal()];
            if (i15 == 1) {
                return (Drawable) n15.getValue();
            }
            if (i15 == 2) {
                return (Drawable) n17.getValue();
            }
            if (i15 == 3) {
                return (Drawable) n16.getValue();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i16 = em1.j.f59628a[bVar.ordinal()];
        if (i16 == 1) {
            return (Drawable) n18.getValue();
        }
        if (i16 == 2) {
            return (Drawable) n23.getValue();
        }
        if (i16 == 3) {
            return (Drawable) n19.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void r0(GraphQLSearchGridFragment graphQLSearchGridFragment, i2 i2Var) {
        graphQLSearchGridFragment.R0 = i2Var;
    }

    public static final so s(bo0 bo0Var) {
        Intrinsics.checkNotNullParameter(bo0Var, "<this>");
        if (bo0Var.getPhotoItem() != null) {
            d30 photoItem = bo0Var.getPhotoItem();
            Intrinsics.f(photoItem);
            return jk.v.l(photoItem);
        }
        if (bo0Var.getVideoItem() == null) {
            return null;
        }
        k01 videoItem = bo0Var.getVideoItem();
        Intrinsics.f(videoItem);
        return jk.v.l(videoItem);
    }

    public static void s0(nz0.d dVar, i2 i2Var) {
        dVar.R0 = i2Var;
    }

    public static final wy0 t(f30 f30Var, es.a adFormats) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        n1 c13 = n1.f83436b.c();
        if (((es.c) adFormats).M(f30Var) || g02.a.a(f30Var)) {
            return null;
        }
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) c13.f83439a;
        if (g1Var.o("hfp_hide_by_creator_android", "enabled", z3Var) || g1Var.l("hfp_hide_by_creator_android")) {
            return g02.a.b(f30Var);
        }
        return null;
    }

    public static void t0(PinCloseupFragment pinCloseupFragment, nx.f0 f0Var) {
        pinCloseupFragment.Y0 = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(x02.x2 r4, b60.b r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof kv1.b
            if (r0 == 0) goto L13
            r0 = r6
            kv1.b r0 = (kv1.b) r0
            int r1 = r0.f81028s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81028s = r1
            goto L18
        L13:
            kv1.b r0 = new kv1.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81027r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f81028s
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ue.c.H(r6)
            x02.x2 r4 = r4.d0()
            java.lang.String r6 = "me"
            do2.c r4 = ve.h.z(r4, r6)
            c2.r r6 = new c2.r
            r2 = 0
            r6.<init>(r5, r2)
            do2.j0 r5 = new do2.j0
            r5.<init>(r4, r6)
            r0.f81028s = r3
            java.lang.Object r6 = lb.l0.h0(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            com.pinterest.api.model.wy0 r6 = (com.pinterest.api.model.wy0) r6
            kv1.c r4 = new kv1.c
            if (r6 == 0) goto L5b
            java.lang.Integer r5 = r6.k2()
            goto L62
        L5b:
            java.lang.Integer r5 = new java.lang.Integer
            r0 = 23
            r5.<init>(r0)
        L62:
            int r5 = r5.intValue()
            if (r6 == 0) goto L6e
            java.lang.String r0 = r6.a3()
            if (r0 != 0) goto L70
        L6e:
            java.lang.String r0 = "unspecified"
        L70:
            if (r6 == 0) goto L78
            java.lang.String r1 = r6.G2()
            if (r1 != 0) goto L84
        L78:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            java.lang.String r1 = r1.toString()
        L84:
            kotlin.jvm.internal.Intrinsics.f(r1)
            if (r6 == 0) goto L8f
            java.lang.String r6 = r6.R3()
            if (r6 != 0) goto L97
        L8f:
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.toString()
        L97:
            kotlin.jvm.internal.Intrinsics.f(r6)
            r4.<init>(r0, r5, r1, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.u(x02.x2, b60.b, bl2.c):java.lang.Object");
    }

    public static void u0(GraphQLSearchGridFragment graphQLSearchGridFragment, nx.f0 f0Var) {
        graphQLSearchGridFragment.S0 = f0Var;
    }

    public static void v(gr1.d dVar, cr1.a aVar) {
        dVar.f65999d = aVar;
    }

    public static void v0(PinCloseupFragment pinCloseupFragment, i91.z zVar) {
        pinCloseupFragment.f47024u1 = zVar;
    }

    public static void w(PinCloseupFragment pinCloseupFragment, es.a aVar) {
        pinCloseupFragment.f47022t1 = aVar;
    }

    public static void w0(PinCloseupFragment pinCloseupFragment, b20.c cVar) {
        pinCloseupFragment.f47002k1 = cVar;
    }

    public static void x(PinCloseupFragment pinCloseupFragment, ur.a aVar) {
        pinCloseupFragment.H1 = aVar;
    }

    public static void x0(PinCloseupFragment pinCloseupFragment, se2.a aVar) {
        pinCloseupFragment.f47014p1 = aVar;
    }

    public static void y(PinCloseupFragment pinCloseupFragment, kv.a aVar) {
        pinCloseupFragment.D1 = aVar;
    }

    public static void y0(GraphQLSearchGridFragment graphQLSearchGridFragment, lb0.q qVar) {
        graphQLSearchGridFragment.Z0 = qVar;
    }

    public static void z(PinCloseupFragment pinCloseupFragment, es.h hVar) {
        pinCloseupFragment.B1 = hVar;
    }

    public static void z0(nz0.d dVar, k1 k1Var) {
        dVar.S0 = k1Var;
    }
}
