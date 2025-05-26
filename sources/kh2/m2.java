package kh2;

import a.cb;
import a.h4;
import a.tb;
import ads_mobile_sdk.b91;
import ads_mobile_sdk.d81;
import ads_mobile_sdk.e21;
import ads_mobile_sdk.gl;
import ads_mobile_sdk.hw0;
import ads_mobile_sdk.il;
import ads_mobile_sdk.io;
import ads_mobile_sdk.nr0;
import ads_mobile_sdk.pg;
import ads_mobile_sdk.rx2;
import ads_mobile_sdk.sj0;
import ads_mobile_sdk.ya1;
import ads_mobile_sdk.yv2;
import ads_mobile_sdk.zv0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.p3;
import c50.ma;
import com.google.android.gms.common.Feature;
import com.pinterest.api.model.aa0;
import com.pinterest.api.model.ay;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.ds0;
import com.pinterest.api.model.es0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fr0;
import com.pinterest.api.model.gs0;
import com.pinterest.api.model.jr0;
import com.pinterest.api.model.or0;
import com.pinterest.api.model.sr0;
import com.pinterest.api.model.tr0;
import com.pinterest.api.model.ur0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zr0;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.g0;
import h32.u0;
import i2.v3;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import lb0.q;
import nx.d0;
import so.i8;
import so.n5;
import so.oa;
import yb0.n;

/* loaded from: classes4.dex */
public abstract class m2 implements po2.c, po2.a {

    /* renamed from: a */
    public static String f79617a;

    /* renamed from: b */
    public static String f79618b;

    /* renamed from: c */
    public static boolean f79619c;

    public static String A0(nm.s sVar, nr0 nr0Var) {
        sVar.getClass();
        CharSequence charSequence = "";
        if (sVar instanceof nm.u) {
            nm.u i13 = sVar.i();
            Intrinsics.checkNotNullExpressionValue(i13, "getAsJsonObject(...)");
            int A = nr0Var.J() ? nr0Var.A() : -1;
            Set keySet = i13.f91366a.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((pm.l) keySet).iterator();
            while (((pm.m) it).hasNext()) {
                String str = (String) ((pm.k) it).next();
                nm.s v13 = i13.v(str);
                Intrinsics.checkNotNullExpressionValue(v13, "get(...)");
                String A0 = A0(v13, nr0Var);
                String D = (nr0Var.u() <= 0 || A0.length() <= nr0Var.u()) ? a.a.D(str, nr0Var.y(), A0) : null;
                if (D != null) {
                    arrayList.add(D);
                }
            }
            String x13 = nr0Var.x();
            Intrinsics.checkNotNullExpressionValue(x13, "getItemSeparator(...)");
            String Z = CollectionsKt.Z(arrayList, x13, null, null, A, "", null, 38);
            int length = Z.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (Z.charAt(length) != nr0Var.r().charAt(0)) {
                        charSequence = Z.subSequence(0, length + 1);
                        break;
                    }
                    if (i14 < 0) {
                        break;
                    }
                    length = i14;
                }
            }
            return charSequence.toString();
        }
        if (!(sVar instanceof nm.q)) {
            boolean z13 = sVar instanceof nm.v;
            if (z13 && (sVar.j().f91367a instanceof String)) {
                String p13 = sVar.p();
                Intrinsics.f(p13);
                return p13;
            }
            if (z13 && (sVar.j().f91367a instanceof Boolean)) {
                return sVar.j().b() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0";
            }
            String sVar2 = sVar.toString();
            Intrinsics.f(sVar2);
            return sVar2;
        }
        nm.q f13 = sVar.f();
        Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
        int A2 = nr0Var.J() ? nr0Var.A() : -1;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = f13.f91364a.iterator();
        while (it2.hasNext()) {
            nm.s sVar3 = (nm.s) it2.next();
            Intrinsics.f(sVar3);
            String A02 = A0(sVar3, nr0Var);
            if (nr0Var.u() > 0 && A02.length() > nr0Var.u()) {
                A02 = null;
            }
            if (A02 != null) {
                arrayList2.add(A02);
            }
        }
        String r13 = nr0Var.r();
        Intrinsics.checkNotNullExpressionValue(r13, "getArraySeparator(...)");
        String Z2 = CollectionsKt.Z(arrayList2, r13, null, null, A2, "", null, 38);
        int length2 = Z2.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i15 = length2 - 1;
                if (Z2.charAt(length2) != nr0Var.r().charAt(0)) {
                    charSequence = Z2.subSequence(0, length2 + 1);
                    break;
                }
                if (i15 < 0) {
                    break;
                }
                length2 = i15;
            }
        }
        return charSequence.toString();
    }

    public static int A1(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        d81 d81Var = (d81) h4Var;
        int E0 = E0(bArr, i14, pgVar);
        d81Var.a(pgVar.f9671b);
        while (E0 < i15) {
            int i16 = E0 + 1;
            byte b13 = bArr[E0];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i16 = N(b13, bArr, i16, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            E0 = E0(bArr, i16, pgVar);
            d81Var.a(pgVar.f9671b);
        }
        return E0;
    }

    public static final void B1(Context context, boolean z13, String str, String str2, m60.w eventManager, Function0 actionSuccessHandler) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(actionSuccessHandler, "actionSuccessHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionSuccessHandler, "actionSuccessHandler");
        Resources resources = context.getResources();
        int i13 = z13 ? p60.d.unblock_user_title : p60.d.block_user_title;
        Object[] objArr = new Object[1];
        objArr[0] = (str == null || str.length() == 0) ? str2 == null ? "" : str2 : str;
        String string = resources.getString(i13, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = resources.getString(z13 ? p60.d.unblock_user_message_alt : p60.d.block_user_message_alt);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(z13 ? m60.x0.unblock : m60.x0.block);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = resources.getString(p60.d.never_mind);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        int i14 = yb0.n.f138503p;
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : actionSuccessHandler, (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        cb.x(a13, eventManager);
    }

    public static final CharSequence C0(Context context, int i13, CharSequence... texts) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(texts, "texts");
        CharSequence a03 = df.j1.a0(context.getString(i13, Arrays.copyOf(texts, texts.length)));
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        return a03;
    }

    public static int C1(int i13, int i14, int i15) {
        return (i13 & (~i15)) | (i14 & i15);
    }

    public static int D0(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        d81 d81Var = (d81) h4Var;
        d81Var.a(m0(i14, bArr));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int i17 = i16 + 1;
            byte b13 = bArr[i16];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i17 = N(b13, bArr, i17, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            d81Var.a(m0(i17, bArr));
            i16 = i17 + 8;
        }
        return i16;
    }

    public static void D1(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        f1(jArr, jArr2, jArr4);
        G1(jArr4, jArr3);
    }

    public static int E0(byte[] bArr, int i13, pg pgVar) {
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        if (j13 >= 0) {
            pgVar.f9671b = j13;
            return i14;
        }
        int i15 = i13 + 2;
        byte b13 = bArr[i14];
        long j14 = (j13 & 127) | ((b13 & Byte.MAX_VALUE) << 7);
        int i16 = 7;
        while (b13 < 0) {
            int i17 = i15 + 1;
            i16 += 7;
            j14 |= (r10 & Byte.MAX_VALUE) << i16;
            b13 = bArr[i15];
            i15 = i17;
        }
        pgVar.f9671b = j14;
        return i15;
    }

    public static int E1(int i13) {
        return (i13 + 1) * (i13 < 32 ? 4 : 2);
    }

    public static final void F(z9.e0 e0Var, String str, u2.q qVar, u2.e eVar, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, i2.o oVar, int i13, int i14) {
        Function1 function16;
        int i15;
        Function1 function17;
        Object obj;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(410432995);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        u2.e eVar2 = (i14 & 8) != 0 ? u2.b.f120017e : eVar;
        String str3 = (i14 & 16) != 0 ? null : str2;
        Function1 function18 = (i14 & 32) != 0 ? ba.x.f22313i : function1;
        Function1 function19 = (i14 & 64) != 0 ? ba.y.f22314i : function12;
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            i15 = i13 & (-29360129);
            function16 = function18;
        } else {
            function16 = function13;
            i15 = i13;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            i15 &= -234881025;
            function17 = function19;
        } else {
            function17 = function14;
        }
        sVar.X(1618982084);
        boolean h10 = sVar.h(str3) | sVar.h(str) | sVar.h(function15);
        Object J2 = sVar.J();
        if (h10 || J2 == i2.n.f71185a) {
            z9.c0 c0Var = new z9.c0(e0Var.f141275v, str, str3);
            function15.invoke(c0Var);
            z9.b0 b0Var = (z9.b0) c0Var.a();
            ArrayList nodes = c0Var.f141174i;
            Intrinsics.checkNotNullParameter(nodes, "nodes");
            Iterator it = nodes.iterator();
            while (it.hasNext()) {
                z9.z zVar = (z9.z) it.next();
                if (zVar != null) {
                    b0Var.r(zVar);
                }
            }
            String startDestRoute = c0Var.f141173h;
            if (startDestRoute == null) {
                if (c0Var.f141168c == null) {
                    throw new IllegalStateException("You must set a start destination id");
                }
                throw new IllegalStateException("You must set a start destination route");
            }
            Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
            b0Var.w(startDestRoute);
            sVar.g0(b0Var);
            obj = b0Var;
        } else {
            obj = J2;
        }
        sVar.r(false);
        int i16 = (i15 & 896) | 72 | (i15 & 7168);
        int i17 = i15 >> 3;
        G(e0Var, (z9.b0) obj, qVar2, eVar2, function18, function19, function16, function17, sVar, i16 | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), 0);
        i2.f2 t13 = sVar.t();
        if (t13 == null) {
            return;
        }
        t13.f71113d = new ba.z(e0Var, str, qVar2, eVar2, str3, function18, function19, function16, function17, function15, i13, i14);
    }

    public static void F0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        if (z0(bArr, i13, pgVar) + pgVar.f9670a > bArr.length) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw null;
    }

    public static final RuntimeException F1(Throwable th3) {
        if (th3 instanceof InvocationTargetException) {
            throw F1(th3.getCause());
        }
        if (th3 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        throw new RuntimeException(th3);
    }

    public static final void G(z9.e0 e0Var, z9.b0 graph, u2.q qVar, u2.e eVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, i2.o oVar, int i13, int i14) {
        Function1 function15;
        int i15;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        z9.s0 s0Var;
        boolean z13;
        ba.n nVar;
        z9.s0 s0Var2;
        boolean z14;
        Object obj;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1818191915);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        u2.e eVar2 = (i14 & 8) != 0 ? u2.b.f120017e : eVar;
        Function1 function110 = (i14 & 16) != 0 ? ba.a0.f22254i : function1;
        Function1 function111 = (i14 & 32) != 0 ? ba.b0.f22256i : function12;
        if ((i14 & 64) != 0) {
            i15 = i13 & (-3670017);
            function15 = function110;
        } else {
            function15 = function13;
            i15 = i13;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            i15 &= -29360129;
            function16 = function111;
        } else {
            function16 = function14;
        }
        androidx.lifecycle.z zVar = (androidx.lifecycle.z) sVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        androidx.lifecycle.u1 a13 = v6.b.a(sVar);
        if (a13 == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
        }
        e0Var.E(a13.getViewModelStore());
        Intrinsics.checkNotNullParameter(graph, "graph");
        e0Var.z(graph, null);
        z9.s0 s0Var3 = e0Var.f141275v;
        z9.r0 b13 = s0Var3.b("composable");
        ba.i iVar = b13 instanceof ba.i ? (ba.i) b13 : null;
        if (iVar == null) {
            i2.f2 t13 = sVar.t();
            if (t13 == null) {
                return;
            }
            t13.f71113d = new ba.w(e0Var, graph, qVar2, eVar2, function110, function111, function15, function16, i13, i14, 1);
            return;
        }
        ig1.b.a(0, 0, sVar, new j1.q0(e0Var, 28), ((List) bs1.c.z(iVar.b().f141227e, sVar).getValue()).size() > 1);
        i2.u.b(zVar, new ba.s(0, e0Var, zVar), sVar);
        r2.i X = n.X(sVar);
        i2.q1 z15 = bs1.c.z(e0Var.f141263j, sVar);
        sVar.X(-492369756);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        Object obj2 = J2;
        if (J2 == dVar) {
            i2.o0 S = bs1.c.S(new q1.o(z15, 7));
            sVar.g0(S);
            obj2 = S;
        }
        sVar.r(false);
        v3 v3Var = (v3) obj2;
        z9.k kVar = (z9.k) CollectionsKt.d0((List) v3Var.getValue());
        sVar.X(-492369756);
        Object J3 = sVar.J();
        Object obj3 = J3;
        if (J3 == dVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            sVar.g0(linkedHashMap);
            obj3 = linkedHashMap;
        }
        sVar.r(false);
        Map map = (Map) obj3;
        sVar.X(1822177954);
        if (kVar != null) {
            sVar.X(1618982084);
            boolean h10 = sVar.h(iVar) | sVar.h(function15) | sVar.h(function110);
            Object J4 = sVar.J();
            if (h10 || J4 == dVar) {
                s0Var2 = s0Var3;
                z14 = false;
                ba.c0 c0Var = new ba.c0(iVar, function15, function110, false ? 1 : 0);
                sVar.g0(c0Var);
                obj = c0Var;
            } else {
                s0Var2 = s0Var3;
                z14 = false;
                obj = J4;
            }
            sVar.r(z14);
            Function1 function112 = (Function1) obj;
            sVar.X(1618982084);
            boolean h13 = sVar.h(iVar) | sVar.h(function16) | sVar.h(function111);
            function18 = function15;
            Object J5 = sVar.J();
            Object obj4 = J5;
            if (h13 || J5 == dVar) {
                ba.c0 c0Var2 = new ba.c0(iVar, function16, function111, 1);
                sVar.g0(c0Var2);
                obj4 = c0Var2;
            }
            sVar.r(false);
            j1.g2 c13 = j1.m2.c(kVar, "entry", sVar, 56);
            ba.i iVar2 = iVar;
            function17 = function111;
            function19 = function16;
            s0Var = s0Var2;
            nVar = null;
            r.a(c13, qVar2, new e.c(map, iVar, function112, (Function1) obj4, v3Var, 5), eVar2, ba.t.f22294i, q2.i.b(sVar, -1440061047, new ba.u(0, X, v3Var)), sVar, (i15 & 7168) | ((i15 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 221184, 0);
            i2.u.d(c13.c(), c13.f74078d.getValue(), new ba.v(c13, map, v3Var, iVar2, null), sVar);
            Boolean bool = Boolean.TRUE;
            sVar.X(511388516);
            boolean h14 = sVar.h(v3Var) | sVar.h(iVar2);
            Object J6 = sVar.J();
            Object obj5 = J6;
            if (h14 || J6 == dVar) {
                ba.s sVar2 = new ba.s(1, v3Var, iVar2);
                sVar.g0(sVar2);
                obj5 = sVar2;
            }
            z13 = false;
            sVar.r(false);
            i2.u.b(bool, (Function1) obj5, sVar);
        } else {
            function17 = function111;
            function18 = function15;
            function19 = function16;
            s0Var = s0Var3;
            z13 = false;
            nVar = null;
        }
        sVar.r(z13);
        z9.r0 b14 = s0Var.b("dialog");
        ba.n nVar2 = b14 instanceof ba.n ? (ba.n) b14 : nVar;
        if (nVar2 == null) {
            i2.f2 t14 = sVar.t();
            if (t14 == null) {
                return;
            }
            t14.f71113d = new ba.w(e0Var, graph, qVar2, eVar2, function110, function17, function18, function19, i13, i14, 2);
            return;
        }
        m0.b(nVar2, sVar, 0);
        i2.f2 t15 = sVar.t();
        if (t15 == null) {
            return;
        }
        t15.f71113d = new ba.w(e0Var, graph, qVar2, eVar2, function110, function17, function18, function19, i13, i14, 0);
    }

    public static int G0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        zv0 zv0Var = (zv0) h4Var;
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a + z03;
        while (z03 < i14) {
            int i15 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
                z03 = i15;
            } else {
                z03 = N(b13, bArr, i15, pgVar);
            }
            zv0Var.b(io.b(pgVar.f9670a));
        }
        if (z03 == i14) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static void G1(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        long j17 = jArr[4];
        long j18 = jArr[5];
        long j19 = jArr[6];
        long j23 = jArr[7];
        long j24 = jArr[12];
        long j25 = j18 ^ (j24 << 39);
        long j26 = j19 ^ ((j24 >>> 25) ^ (j24 << 62));
        long j27 = j23 ^ (j24 >>> 2);
        long j28 = jArr[11];
        long j29 = j17 ^ (j28 << 39);
        long j33 = j25 ^ ((j28 >>> 25) ^ (j28 << 62));
        long j34 = j26 ^ (j28 >>> 2);
        long j35 = jArr[10];
        long j36 = j16 ^ (j35 << 39);
        long j37 = j29 ^ ((j35 >>> 25) ^ (j35 << 62));
        long j38 = j33 ^ (j35 >>> 2);
        long j39 = jArr[9];
        long j43 = j15 ^ (j39 << 39);
        long j44 = j36 ^ ((j39 >>> 25) ^ (j39 << 62));
        long j45 = j37 ^ (j39 >>> 2);
        long j46 = jArr[8];
        long j47 = j13 ^ (j27 << 39);
        long j48 = (j14 ^ (j46 << 39)) ^ ((j27 >>> 25) ^ (j27 << 62));
        long j49 = (j43 ^ ((j46 >>> 25) ^ (j46 << 62))) ^ (j27 >>> 2);
        long j53 = j34 >>> 25;
        jArr2[0] = j47 ^ j53;
        jArr2[1] = (j53 << 23) ^ j48;
        jArr2[2] = j49;
        jArr2[3] = j44 ^ (j46 >>> 2);
        jArr2[4] = j45;
        jArr2[5] = j38;
        jArr2[6] = j34 & 33554431;
    }

    public static final void H(rm1.d iconDisplayState, gc0.a iconBackgroundDisplayState, u2.q qVar, Function0 function0, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(iconDisplayState, "iconDisplayState");
        Intrinsics.checkNotNullParameter(iconBackgroundDisplayState, "iconBackgroundDisplayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-344704346);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        Function0 function02 = (i14 & 8) != 0 ? gc0.c.f64772i : function0;
        Intrinsics.checkNotNullParameter(qVar2, "<this>");
        Intrinsics.checkNotNullParameter(iconBackgroundDisplayState, "iconBackgroundDisplayState");
        sVar.W(1856694853);
        u2.q j13 = androidx.compose.foundation.layout.e.j(qVar2, com.bumptech.glide.d.A(iconBackgroundDisplayState.f64770c, sVar));
        long h10 = g0.h(iconBackgroundDisplayState.f64769b, sVar);
        b3.x0 x0Var = iconBackgroundDisplayState.f64768a;
        u2.q b13 = androidx.compose.foundation.a.b(j13, h10, x0Var);
        sVar.r(false);
        u2.q b14 = androidx.compose.ui.draw.a.b(b13, x0Var);
        sVar.W(505103689);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        sVar.r(false);
        u2.q p13 = androidx.compose.foundation.layout.e.p(androidx.compose.foundation.a.d(b14, (o1.l) J2, p3.b(0.0f, 6), false, new z3.g(0), function02, 12), null, 3);
        q3.p0 e13 = p1.q.e(u2.b.f120017e, false);
        int i15 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, p13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        g3.f(iconDisplayState, null, sVar, 8, 2);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) iconDisplayState, (Object) iconBackgroundDisplayState, qVar2, function02, i13, i14, 14);
        }
    }

    public static void H0(byte[] bArr, int i13, h4 h4Var) {
        Float.intBitsToFloat(d0(i13, bArr));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        R1(r1, r12, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = C1(r13[r5], r9, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int H1(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = bs1.c.Y1(r9)
            r1 = r0 & r11
            int r2 = Q1(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = kh2.g0.m(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = kh2.g0.m(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            R1(r1, r12, r9)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = C1(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.m2.H1(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static final void I(uc0.t1 t1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(966100234);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(t1Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.t1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                t1Var = (uc0.t1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(t1Var.f121825e, sVar);
            t1Var.i(new uc0.i(new oc0.a(q2.i.c(389713730, new xb0.a(t1Var, 10), sVar))));
            gh0.b.d(((uc0.s1) z13.getValue()).f121860a, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(t1Var, i13, i14, 18);
        }
    }

    public static long I0(int i13, long j13) {
        long j14 = i13;
        com.bumptech.glide.d.g("sampleRate must be greater than 0.", j14 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j13) / j14;
    }

    public static final String I1(String colorHex) {
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        if (colorHex.length() != 9) {
            return colorHex;
        }
        String substring = colorHex.substring(3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return "#" + substring;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void J(float r14, float r15, float r16, int r17, int r18, i2.o r19, u2.q r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.m2.J(float, float, float, int, int, i2.o, u2.q, java.util.List):void");
    }

    public static int J0(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        zv0 zv0Var = (zv0) h4Var;
        int z03 = z0(bArr, i14, pgVar);
        zv0Var.b(io.b(pgVar.f9670a));
        while (z03 < i15) {
            int i16 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i16 = N(b13, bArr, i16, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            z03 = i16 + 1;
            byte b14 = bArr[i16];
            if (b14 >= 0) {
                pgVar.f9670a = b14;
            } else {
                z03 = N(b14, bArr, z03, pgVar);
            }
            zv0Var.b(io.b(pgVar.f9670a));
        }
        return z03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (bn2.i.g(r3) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(fn2.d.g((am2.g) r1), xl2.r.f135328h) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean J1(pn2.b0 r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            pn2.b1 r1 = r3.w0()
            am2.j r1 = r1.b()
            if (r1 == 0) goto L34
            boolean r2 = bn2.i.b(r1)
            if (r2 == 0) goto L2d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = bn2.i.e(r1)
            if (r0 == 0) goto L2d
            am2.g r1 = (am2.g) r1
            ym2.c r0 = fn2.d.g(r1)
            ym2.c r1 = xl2.r.f135328h
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 != 0) goto L2d
            goto L3a
        L2d:
            boolean r0 = bn2.i.g(r3)
            if (r0 == 0) goto L34
            goto L3a
        L34:
            boolean r3 = x1(r3)
            if (r3 == 0) goto L3c
        L3a:
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.m2.J1(pn2.b0):boolean");
    }

    public static double K(int i13, byte[] bArr) {
        return Double.longBitsToDouble(m0(i13, bArr));
    }

    public static int K0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        d81 d81Var = (d81) h4Var;
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a + z03;
        while (z03 < i14) {
            z03 = E0(bArr, z03, pgVar);
            d81Var.a(io.a(pgVar.f9671b));
        }
        if (z03 == i14) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static String K1(String colorHex) {
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        return df.j1.U("#%08X", new Object[]{Integer.valueOf(f5.c.j(Color.parseColor(colorHex), RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN))});
    }

    public static int L(int i13, byte[] bArr, int i14, int i15, pg pgVar) {
        if ((i13 >>> 3) == 0) {
            throw new e21("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            return E0(bArr, i14, pgVar);
        }
        if (i16 == 1) {
            return i14 + 8;
        }
        if (i16 == 2) {
            return z0(bArr, i14, pgVar) + pgVar.f9670a;
        }
        if (i16 != 3) {
            if (i16 == 5) {
                return i14 + 4;
            }
            throw new e21("Protocol message contained an invalid tag (zero).");
        }
        int i17 = (i13 & (-8)) | 4;
        int i18 = 0;
        while (i14 < i15) {
            i14 = z0(bArr, i14, pgVar);
            i18 = pgVar.f9670a;
            if (i18 == i17) {
                break;
            }
            i14 = L(i18, bArr, i14, i15, pgVar);
        }
        if (i14 > i15 || i18 != i17) {
            throw new e21("Failed to parse the message.");
        }
        return i14;
    }

    public static final HashMap L0(f30 f30Var) {
        String str;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        HashMap hashMap = new HashMap();
        if (((es.c) as.c.a()).U(f30Var)) {
            str = "promoted_idea_pin";
        } else {
            Boolean Q5 = f30Var.Q5();
            Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
            str = Q5.booleanValue() ? "promoted_max_width_pin" : ((es.c) as.c.a()).G(f30Var) ? "promoted_direct_to_site_pin" : "promoted_pin";
        }
        hashMap.put("pin_type", str);
        return hashMap;
    }

    public static final boolean L1(am2.d descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        am2.f fVar = descriptor instanceof am2.f ? (am2.f) descriptor : null;
        if (fVar == null) {
            return false;
        }
        dm2.z zVar = (dm2.z) fVar;
        if (am2.s.e(zVar.getVisibility())) {
            return false;
        }
        dm2.k kVar = (dm2.k) fVar;
        am2.g R = kVar.R();
        Intrinsics.checkNotNullExpressionValue(R, "getConstructedClass(...)");
        if (bn2.i.e(R) || bn2.e.s(kVar.R())) {
            return false;
        }
        List x13 = zVar.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
        List list = x13;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pn2.b0 type = ((dm2.c1) ((am2.i1) it.next())).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (J1(type)) {
                return true;
            }
        }
        return false;
    }

    public static int M(int i13, byte[] bArr, int i14, int i15, yv2 yv2Var, pg pgVar) {
        if ((i13 >>> 3) == 0) {
            throw new e21("Protocol message contained an invalid tag (zero).");
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int E0 = E0(bArr, i14, pgVar);
            yv2Var.a(i13, Long.valueOf(pgVar.f9671b));
            return E0;
        }
        if (i16 == 1) {
            yv2Var.a(i13, Long.valueOf(m0(i14, bArr)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int z03 = z0(bArr, i14, pgVar);
            int i17 = pgVar.f9670a;
            if (i17 < 0) {
                throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i17 > bArr.length - z03) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i17 == 0) {
                yv2Var.a(i13, il.f6431b);
            } else {
                il.a(z03, z03 + i17, bArr.length);
                yv2Var.a(i13, new gl(((kp.n) il.f6432c).I(bArr, z03, i17)));
            }
            return z03 + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw new e21("Protocol message contained an invalid tag (zero).");
            }
            yv2Var.a(i13, Integer.valueOf(d0(i14, bArr)));
            return i14 + 4;
        }
        yv2 b13 = yv2.b();
        int i18 = (i13 & (-8)) | 4;
        int i19 = pgVar.f9673d + 1;
        pgVar.f9673d = i19;
        if (i19 >= 100) {
            throw new e21("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i23 = 0;
        while (true) {
            if (i14 >= i15) {
                break;
            }
            int z04 = z0(bArr, i14, pgVar);
            int i24 = pgVar.f9670a;
            if (i24 == i18) {
                i23 = i24;
                i14 = z04;
                break;
            }
            i23 = i24;
            i14 = M(i24, bArr, z04, i15, b13, pgVar);
        }
        pgVar.f9673d--;
        if (i14 > i15 || i23 != i18) {
            throw new e21("Failed to parse the message.");
        }
        yv2Var.a(i13, b13);
        return i14;
    }

    public static final String M0(yk1.v resources, String displayName, boolean z13) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        if (z13) {
            return ((yk1.a) resources).f139224a.getString(le0.h.content_description_user_avatar_verified, displayName);
        }
        return ((yk1.a) resources).f139224a.getString(le0.h.content_description_user_avatar, displayName);
    }

    public static void M1(View sourceView, String query, final String bodyTypeTerm, m60.w eventManager, final nx.d0 pinalytics, final lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bodyTypeTerm, "bodyTypeTerm");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        if (f79619c) {
            return;
        }
        String str = f79617a;
        if (str == null && f79618b == null) {
            f79617a = query;
            f79618b = bodyTypeTerm;
            return;
        }
        String str2 = f79618b;
        f79618b = bodyTypeTerm;
        f79617a = query;
        if (kotlin.text.z.i(query, str, true) || !Intrinsics.d(str2, bodyTypeTerm)) {
            return;
        }
        String v13 = pe.i.v(prefsManagerPersisted);
        if (v13 == null || v13.length() == 0 || !bodyTypeTerm.equals(pe.i.v(prefsManagerPersisted))) {
            Context context = sourceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final yb0.n nVar = new yb0.n(context);
            String string = nVar.getContext().getString(nv1.f.search_results_body_type_remember);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            nVar.w(string);
            nVar.u(nVar.getContext().getString(nv1.f.search_results_body_type_remember_description));
            String string2 = nVar.getContext().getString(m60.x0.icon_save);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            nVar.q(string2);
            String string3 = nVar.getContext().getString(m60.x0.not_now_sentence_case);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            nVar.m(string3);
            final HashMap hashMap = new HashMap();
            hashMap.put("story_type", "body_type_filters");
            final h32.g0 g0Var = h32.g0.BODY_TYPE_FILTERS_REMEMBER_DIALOG;
            nVar.f138513j = new View.OnClickListener() { // from class: sv1.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0 pinalytics2 = d0.this;
                    Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                    g0 componentType = g0Var;
                    Intrinsics.checkNotNullParameter(componentType, "$componentType");
                    HashMap auxData = hashMap;
                    Intrinsics.checkNotNullParameter(auxData, "$auxData");
                    q prefsManagerPersisted2 = prefsManagerPersisted;
                    Intrinsics.checkNotNullParameter(prefsManagerPersisted2, "$prefsManagerPersisted");
                    String pattern = bodyTypeTerm;
                    Intrinsics.checkNotNullParameter(pattern, "$bodyTypeTerm");
                    n this_apply = nVar;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    pinalytics2.h(componentType, u0.BODY_TYPE_FILTER_REMEMBER_YES, auxData);
                    Intrinsics.checkNotNullParameter(prefsManagerPersisted2, "<this>");
                    Intrinsics.checkNotNullParameter(pattern, "pattern");
                    prefsManagerPersisted2.b("PREF_BODY_TYPE_SELECTION", pattern);
                    this_apply.g(yb0.d.CONFIRM_BUTTON_CLICK);
                }
            };
            nVar.f138514k = new sv1.c(pinalytics, g0Var, hashMap, prefsManagerPersisted, nVar, 0);
            nVar.f138515l = new px0.g(pinalytics, g0Var, hashMap, 23);
            eventManager.f(new yb0.e(nVar));
        }
    }

    public static int N(int i13, byte[] bArr, int i14, pg pgVar) {
        int i15 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = i14 + 1;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            pgVar.f9670a = i15 | (b13 << 7);
            return i16;
        }
        int i17 = i15 | ((b13 & Byte.MAX_VALUE) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i16];
        if (b14 >= 0) {
            pgVar.f9670a = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & Byte.MAX_VALUE) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            pgVar.f9670a = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & Byte.MAX_VALUE) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            pgVar.f9670a = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                pgVar.f9670a = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    public static final u50.k0 N0(String displayName, boolean z13) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        if (z13) {
            return new u50.k0(new String[]{displayName}, le0.h.content_description_user_avatar_verified);
        }
        return new u50.k0(new String[]{displayName}, le0.h.content_description_user_avatar);
    }

    public static long N1(int i13, long j13) {
        long j14 = i13;
        com.bumptech.glide.d.g("bytesPerFrame must be greater than 0.", j14 > 0);
        return j13 / j14;
    }

    public static int O(tb tbVar, int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        int i16 = (i13 & (-8)) | 4;
        sj0 a13 = tbVar.a();
        int P = P(a13, tbVar, bArr, i14, i15, i16, pgVar);
        tbVar.c(a13);
        pgVar.f9672c = a13;
        h4Var.add(a13);
        while (P < i15) {
            int z03 = z0(bArr, P, pgVar);
            if (i13 != pgVar.f9670a) {
                break;
            }
            sj0 a14 = tbVar.a();
            int P2 = P(a14, tbVar, bArr, z03, i15, i16, pgVar);
            tbVar.c(a14);
            pgVar.f9672c = a14;
            h4Var.add(a14);
            P = P2;
        }
        return P;
    }

    public static final int O0(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) resources.getDimension(m60.r0.collections_card_spacing);
    }

    public static void O1(int i13, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        g1(jArr, jArr3);
        G1(jArr3, jArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            g1(jArr2, jArr3);
            G1(jArr3, jArr2);
        }
    }

    public static int P(Object obj, tb tbVar, byte[] bArr, int i13, int i14, int i15, pg pgVar) {
        ya1 ya1Var = (ya1) tbVar;
        int i16 = pgVar.f9673d + 1;
        pgVar.f9673d = i16;
        if (i16 >= 100) {
            throw new e21("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int a13 = ya1Var.a(obj, bArr, i13, i14, i15, pgVar);
        pgVar.f9673d--;
        pgVar.f9672c = obj;
        return a13;
    }

    public static com.pinterest.shuffles.scene.composer.a1 P0() {
        return new com.pinterest.shuffles.scene.composer.a1(true, true, false, false);
    }

    public static void P1(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int Q(Object obj, tb tbVar, byte[] bArr, int i13, int i14, pg pgVar) {
        int i15 = i13 + 1;
        int i16 = bArr[i13];
        if (i16 < 0) {
            i15 = N(i16, bArr, i15, pgVar);
            i16 = pgVar.f9670a;
        }
        int i17 = i15;
        if (i16 < 0 || i16 > i14 - i17) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i18 = pgVar.f9673d + 1;
        pgVar.f9673d = i18;
        if (i18 >= 100) {
            throw new e21("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i19 = i16 + i17;
        tbVar.a(obj, bArr, i17, i19, pgVar);
        pgVar.f9673d--;
        pgVar.f9672c = obj;
        return i19;
    }

    public static final int Q0(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = m60.o.f85933a;
        int i14 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        int b13 = ma.b(context.getColor(i14), str);
        float[] fArr = new float[3];
        Color.colorToHSV(b13, fArr);
        fArr[1] = Math.min(fArr[1], 1.0f);
        fArr[2] = Math.min(Math.max(fArr[2], 0.6f), 0.8f);
        return Color.HSVToColor(fArr);
    }

    public static int Q1(int i13, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i13] & 255 : obj instanceof short[] ? ((short[]) obj)[i13] & 65535 : ((int[]) obj)[i13];
    }

    public static int R(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a + z03;
        if (z03 < i14) {
            E0(bArr, z03, pgVar);
            throw null;
        }
        if (z03 == i14) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int R0(int i13, int i14) {
        return i13 & (~i14);
    }

    public static void R1(int i13, Object obj, int i14) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i13] = (byte) i14;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i13] = (short) i14;
        } else {
            ((int[]) obj)[i13] = i14;
        }
    }

    public static int S(byte[] bArr, int i13, pg pgVar) {
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a;
        if (i14 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i14 > bArr.length - z03) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i14 == 0) {
            pgVar.f9672c = il.f6431b;
            return z03;
        }
        int i15 = z03 + i14;
        il.a(z03, i15, bArr.length);
        pgVar.f9672c = new gl(((kp.n) il.f6432c).I(bArr, z03, i14));
        return i15;
    }

    public static int S0(int i13, int i14) {
        return i13 & i14;
    }

    public static int S1(int i13) {
        int max = Math.max(i13 + 1, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0d * highestOneBit))) {
            int i14 = highestOneBit << 1;
            if (i14 <= 0) {
                i14 = 1073741824;
            }
            highestOneBit = i14;
        }
        return Math.max(4, highestOneBit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r8 = kotlin.text.StringsKt__StringsKt.split$default(r8, new java.lang.String[]{"."}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ads_mobile_sdk.rk T(java.lang.String r8) {
        /*
            a.qa r0 = ads_mobile_sdk.rk.r()
            java.lang.String r1 = "newBuilder(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            if (r8 == 0) goto L1e
            java.lang.String r2 = "."
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r3 = 6
            java.util.List r8 = kotlin.text.StringsKt.W(r8, r2, r1, r3)
            if (r8 != 0) goto L20
        L1e:
            kotlin.collections.q0 r8 = kotlin.collections.q0.f80391a
        L20:
            int r2 = r8.size()
            r3 = 3
            if (r2 != r3) goto L96
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Long r1 = kotlin.text.StringsKt.h0(r1)
            r2 = 0
            if (r1 == 0) goto L3a
            long r4 = r1.longValue()
            goto L3b
        L3a:
            r4 = r2
        L3b:
            r0.b()
            ads_mobile_sdk.sj0 r1 = r0.f10110b
            ads_mobile_sdk.rk r1 = (ads_mobile_sdk.rk) r1
            int r6 = ads_mobile_sdk.rk.r(r1)
            r7 = 1
            r6 = r6 | r7
            ads_mobile_sdk.rk.s(r1, r6)
            ads_mobile_sdk.rk.t(r1, r4)
            java.lang.Object r1 = r8.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Long r1 = kotlin.text.StringsKt.h0(r1)
            if (r1 == 0) goto L5f
            long r4 = r1.longValue()
            goto L60
        L5f:
            r4 = r2
        L60:
            r0.b()
            ads_mobile_sdk.sj0 r1 = r0.f10110b
            ads_mobile_sdk.rk r1 = (ads_mobile_sdk.rk) r1
            int r6 = ads_mobile_sdk.rk.r(r1)
            r7 = 2
            r6 = r6 | r7
            ads_mobile_sdk.rk.s(r1, r6)
            ads_mobile_sdk.rk.v(r1, r4)
            java.lang.Object r8 = r8.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Long r8 = kotlin.text.StringsKt.h0(r8)
            if (r8 == 0) goto L83
            long r2 = r8.longValue()
        L83:
            r0.b()
            ads_mobile_sdk.sj0 r8 = r0.f10110b
            ads_mobile_sdk.rk r8 = (ads_mobile_sdk.rk) r8
            int r1 = ads_mobile_sdk.rk.r(r8)
            r1 = r1 | 4
            ads_mobile_sdk.rk.s(r8, r1)
            ads_mobile_sdk.rk.u(r8, r2)
        L96:
            ads_mobile_sdk.sj0 r8 = r0.a()
            java.lang.String r0 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            ads_mobile_sdk.rk r8 = (ads_mobile_sdk.rk) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.m2.T(java.lang.String):ads_mobile_sdk.rk");
    }

    public static final Object T0(Optional optional, Object obj) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : obj;
    }

    public static final ur0 T1(fr0 fr0Var, String surveyId, ModelDeserializerWithSaveAndMerge deserializer, h32.g0 surveyType) {
        aa0 aa0Var;
        aa0 aa0Var2;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        vh vhVar;
        vh vhVar2;
        Iterator it;
        String str2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it2;
        String str3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Intrinsics.checkNotNullParameter(fr0Var, "<this>");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(surveyType, "surveyType");
        String l13 = fr0Var.l();
        String k13 = fr0Var.k();
        Boolean h10 = fr0Var.h();
        List j13 = fr0Var.j();
        Intrinsics.f(j13);
        List list = j13;
        int i13 = 10;
        ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ds0 ds0Var = (ds0) it3.next();
            Intrinsics.f(ds0Var);
            Intrinsics.checkNotNullParameter(ds0Var, "<this>");
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            List m13 = ds0Var.m();
            Intrinsics.f(m13);
            List<jr0> list2 = m13;
            ArrayList arrayList8 = new ArrayList(kotlin.collections.g0.q(list2, i13));
            for (jr0 jr0Var : list2) {
                Intrinsics.f(jr0Var);
                Intrinsics.checkNotNullParameter(jr0Var, "<this>");
                Boolean g13 = jr0Var.g();
                Intrinsics.checkNotNullExpressionValue(g13, "getEndSurvey(...)");
                boolean booleanValue = g13.booleanValue();
                String h13 = jr0Var.h();
                Boolean i14 = jr0Var.i();
                Intrinsics.checkNotNullExpressionValue(i14, "getIsExclusive(...)");
                arrayList8.add(new gs0(booleanValue, h13, i14.booleanValue(), jr0Var.j(), jr0Var.k(), Integer.valueOf((int) jr0Var.l().doubleValue())));
                it3 = it3;
            }
            Iterator it4 = it3;
            List o13 = ds0Var.o();
            if (o13 != null) {
                List list3 = o13;
                ArrayList arrayList9 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    sr0 sr0Var = (sr0) it5.next();
                    Intrinsics.f(sr0Var);
                    Intrinsics.checkNotNullParameter(sr0Var, "<this>");
                    List c13 = sr0Var.c();
                    if (c13 != null) {
                        List list4 = c13;
                        it = it5;
                        arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                        Iterator it6 = list4.iterator();
                        while (it6.hasNext()) {
                            com.pinterest.api.model.nr0 nr0Var = (com.pinterest.api.model.nr0) it6.next();
                            Intrinsics.f(nr0Var);
                            Intrinsics.checkNotNullParameter(nr0Var, "<this>");
                            String c14 = nr0Var.c();
                            List d2 = nr0Var.d();
                            if (d2 != null) {
                                List list5 = d2;
                                it2 = it6;
                                arrayList5 = arrayList8;
                                arrayList6 = new ArrayList(kotlin.collections.g0.q(list5, 10));
                                Iterator it7 = list5.iterator();
                                while (it7.hasNext()) {
                                    arrayList6.add(Integer.valueOf((int) ((Double) it7.next()).doubleValue()));
                                    l13 = l13;
                                }
                                str3 = l13;
                            } else {
                                it2 = it6;
                                str3 = l13;
                                arrayList5 = arrayList8;
                                arrayList6 = null;
                            }
                            arrayList4.add(new or0(c14, arrayList6));
                            it6 = it2;
                            arrayList8 = arrayList5;
                            l13 = str3;
                        }
                        str2 = l13;
                        arrayList3 = arrayList8;
                    } else {
                        it = it5;
                        str2 = l13;
                        arrayList3 = arrayList8;
                        arrayList4 = null;
                    }
                    arrayList9.add(new tr0(arrayList4, sr0Var.d()));
                    it5 = it;
                    arrayList8 = arrayList3;
                    l13 = str2;
                }
                str = l13;
                arrayList = arrayList8;
                arrayList2 = arrayList9;
            } else {
                str = l13;
                arrayList = arrayList8;
                arrayList2 = null;
            }
            Boolean p13 = ds0Var.p();
            String x13 = ds0Var.x();
            String q13 = ds0Var.q();
            Double r13 = ds0Var.r();
            Double s13 = ds0Var.s();
            Boolean t13 = ds0Var.t();
            String u13 = ds0Var.u();
            Map v13 = ds0Var.v();
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            if (v13 != null) {
                try {
                    vhVar = (vh) deserializer.d(new vd0.c(v13));
                } catch (Exception unused) {
                    vhVar = null;
                }
                vhVar2 = vhVar;
            } else {
                vhVar2 = null;
            }
            arrayList7.add(new es0(arrayList, arrayList2, p13, x13, q13, r13, s13, t13, u13, vhVar2, ds0Var.w(), ds0Var.n()));
            l13 = str;
            it3 = it4;
            i13 = 10;
        }
        String str4 = l13;
        zr0 i15 = fr0Var.i();
        if (i15 != null) {
            Intrinsics.checkNotNullParameter(i15, "<this>");
            String g14 = i15.g();
            Intrinsics.checkNotNullExpressionValue(g14, "getTitle(...)");
            aa0Var = new aa0(g14, i15.e(), i15.f());
        } else {
            aa0Var = null;
        }
        zr0 g15 = fr0Var.g();
        if (g15 != null) {
            Intrinsics.checkNotNullParameter(g15, "<this>");
            String g16 = g15.g();
            Intrinsics.checkNotNullExpressionValue(g16, "getTitle(...)");
            aa0Var2 = new aa0(g16, g15.e(), g15.f());
        } else {
            aa0Var2 = null;
        }
        return new ur0(surveyId, surveyType, str4, k13, h10, arrayList7, aa0Var, aa0Var2);
    }

    public static Boolean U(nm.s sVar, boolean z13) {
        boolean z14;
        boolean z15 = sVar instanceof nm.v;
        if (z15 && (sVar.j().f91367a instanceof Boolean)) {
            return Boolean.valueOf(sVar.b() == z13);
        }
        if (z15 && (sVar.j().f91367a instanceof Number)) {
            return Boolean.valueOf(z13 == ((sVar.j().n().longValue() > 0L ? 1 : (sVar.j().n().longValue() == 0L ? 0 : -1)) > 0));
        }
        String p13 = (z15 && (sVar.j().f91367a instanceof String)) ? sVar.p() : sVar.toString();
        Intrinsics.f(p13);
        String lowerCase = p13.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (kotlin.collections.f0.j(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, "t", "true").contains(lowerCase)) {
            z14 = true;
        } else {
            if (!kotlin.collections.f0.j("0", "f", "false").contains(lowerCase)) {
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z13 == z14);
    }

    public static final Object U0(Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    public static final String U1(byte b13) {
        return b13 == 1 ? "quotation mark '\"'" : b13 == 2 ? "string escape sequence '\\'" : b13 == 4 ? "comma ','" : b13 == 5 ? "colon ':'" : b13 == 6 ? "start of the object '{'" : b13 == 7 ? "end of the object '}'" : b13 == 8 ? "start of the array '['" : b13 == 9 ? "end of the array ']'" : b13 == 10 ? "end of the input" : b13 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static String V(double d2, nr0 nr0Var) {
        Object valueOf;
        double B = d2 * (nr0Var.K() ? nr0Var.B() : 1.0d);
        if (nr0Var.L()) {
            r1 = nr0Var.D() >= 0 ? nr0Var.D() : 5;
            valueOf = Double.valueOf(((long) (B * r2)) / Math.pow(10.0d, nr0Var.D()));
        } else {
            valueOf = nr0Var.G() ? Long.valueOf(((long) (B / nr0Var.s())) * nr0Var.s()) : B == Math.floor(B) ? Long.valueOf(ml2.c.d(B)) : Double.valueOf(B);
        }
        String e13 = valueOf instanceof Double ? t3.s1.e(new Object[]{valueOf}, 1, Locale.getDefault(), a.a.e("%.", r1, "f"), "format(...)") : valueOf instanceof Float ? t3.s1.e(new Object[]{valueOf}, 1, Locale.getDefault(), a.a.e("%.", r1, "f"), "format(...)") : t3.s1.e(new Object[]{valueOf}, 1, Locale.getDefault(), "%d", "format(...)");
        if (StringsKt.E(e13, ".", false)) {
            return new Regex("\\.$").replace(new Regex("0*$").replace(e13, ""), "");
        }
        return e13;
    }

    public static final String V0(String str) {
        if (str == null) {
            return "#FFFFFF";
        }
        float[] fArr = {0.0f, 0.0f, 0.0f};
        f5.c.f(Color.parseColor(str), fArr);
        df0.b bVar = df0.b.LIGHTNESS;
        float f13 = fArr[bVar.getIndex()];
        df0.b bVar2 = df0.b.SATURATION;
        float f14 = fArr[bVar2.getIndex()];
        if (f13 <= 0.98f) {
            if (f13 > 0.8f) {
                float f15 = 2;
                fArr[bVar.getIndex()] = ((f15 - f14) * 0.3f) / f15;
                fArr[bVar2.getIndex()] = 0.6f;
                return c3.B(f5.c.a(fArr));
            }
            if (f13 <= 0.5f) {
                return "#FFFFFF";
            }
        }
        return "#111111";
    }

    public static final void V1(z3.q qVar, int i13, y3.l lVar) {
        k2.e eVar = new k2.e(new z3.q[16]);
        List h10 = qVar.h(false, false, false);
        while (true) {
            eVar.c(eVar.f78184c, h10);
            while (eVar.m()) {
                z3.q qVar2 = (z3.q) eVar.o(eVar.f78184c - 1);
                s3.q1 c13 = qVar2.c();
                if (c13 == null || !c13.e1()) {
                    z3.x xVar = z3.t.f140745n;
                    z3.j jVar = qVar2.f140714d;
                    if (jVar.f140700a.containsKey(xVar)) {
                        continue;
                    } else {
                        z3.x xVar2 = z3.t.f140741j;
                        LinkedHashMap linkedHashMap = jVar.f140700a;
                        if (linkedHashMap.containsKey(xVar2)) {
                            continue;
                        } else {
                            s3.q1 c14 = qVar2.c();
                            if (c14 == null) {
                                jk.r.z("Expected semantics node to have a coordinator.");
                                throw null;
                            }
                            n4.i j13 = r.j1(androidx.compose.ui.layout.b.d(c14));
                            if (j13.f89182a < j13.f89184c && j13.f89183b < j13.f89185d) {
                                Function2 function2 = (Function2) bs1.c.M0(jVar, z3.i.f140678e);
                                Object obj = linkedHashMap.get(z3.t.f140748q);
                                z3.h hVar = (z3.h) (obj != null ? obj : null);
                                if (function2 == null || hVar == null || ((Number) hVar.f140672b.invoke()).floatValue() <= 0.0f) {
                                    h10 = qVar2.h(false, false, false);
                                } else {
                                    int i14 = i13 + 1;
                                    lVar.invoke(new y3.n(qVar2, i14, j13, c14));
                                    V1(qVar2, i14, lVar);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    public static final void W(Uri.Builder builder, String str, String str2) {
        if (str2 != null) {
            if ((str2.length() > 0 ? str2 : null) != null) {
                builder.appendQueryParameter(str, str2);
            }
        }
    }

    public static final List W0(f30 f30Var, es.h adsCommonDisplay, boolean z13) {
        bc2.c cVar;
        bc2.c cVar2;
        List d2;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        cc J3 = f30Var.J3();
        boolean z14 = true;
        if (J3 != null && (d2 = J3.d()) != null && !d2.isEmpty()) {
            if (z13) {
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Boolean d53 = f30Var.d5();
                Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
                return pk.a0.T(J3, uid, true, d53.booleanValue(), df.j1.z0(f30Var), false);
            }
            String uid2 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            Boolean d54 = f30Var.d5();
            Intrinsics.checkNotNullExpressionValue(d54, "getIsPromoted(...)");
            return pk.a0.S(J3, uid2, true, d54.booleanValue());
        }
        bc2.q S0 = dl2.b.S0(f30Var, null);
        int z03 = (S0 == null || (cVar2 = S0.f22677f) == null) ? bs1.c.z0(f30Var) : cVar2.f22648a;
        int x03 = (S0 == null || (cVar = S0.f22677f) == null) ? bs1.c.x0(f30Var) : cVar.f22649b;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String o03 = bs1.c.o0(f30Var);
        if (o03 == null) {
            d.R0(f30Var, null, 6);
            o03 = bs1.c.o0(f30Var);
        }
        if (o03 == null) {
            o03 = "";
        }
        String str = o03;
        String z43 = f30Var.z4();
        String D = com.bumptech.glide.c.D(f30Var);
        String h43 = f30Var.h4();
        String r43 = f30Var.r4();
        String c43 = f30Var.c4();
        String uid3 = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
        Boolean d55 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d55, "getIsPromoted(...)");
        if (!d55.booleanValue()) {
            Boolean F4 = f30Var.F4();
            Intrinsics.checkNotNullExpressionValue(F4, "getIsDownstreamPromotion(...)");
            if (!F4.booleanValue()) {
                z14 = false;
            }
        }
        boolean z15 = z14;
        Boolean p63 = f30Var.p6();
        Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
        return kotlin.collections.e0.b(new m21.b(z03, x03, str, S0, z43, D, h43, r43, c43, uid3, null, null, z15, false, null, p63.booleanValue(), false, null, Boolean.valueOf(((es.v) adsCommonDisplay).M(f30Var)), null, false, 3334144));
    }

    public static void X(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        E0(bArr, i13, pgVar);
        throw null;
    }

    public static final List X0(f30 f30Var, es.h adsCommonDisplay) {
        ArrayList t13;
        bc2.c cVar;
        bc2.c cVar2;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        t13 = ((es.v) adsCommonDisplay).t(f30Var, lh0.d.f83320b.b());
        boolean z13 = true;
        if (t13 != null && (!t13.isEmpty())) {
            Boolean d53 = f30Var.d5();
            Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
            return pk.a0.U(f30Var, t13, d53.booleanValue(), adsCommonDisplay);
        }
        bc2.q S0 = dl2.b.S0(f30Var, null);
        int z03 = (S0 == null || (cVar2 = S0.f22677f) == null) ? bs1.c.z0(f30Var) : cVar2.f22648a;
        int x03 = (S0 == null || (cVar = S0.f22677f) == null) ? bs1.c.x0(f30Var) : cVar.f22649b;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String o03 = bs1.c.o0(f30Var);
        if (o03 == null) {
            d.R0(f30Var, null, 6);
            o03 = bs1.c.o0(f30Var);
        }
        if (o03 == null) {
            o03 = "";
        }
        String str = o03;
        String z43 = f30Var.z4();
        String D = com.bumptech.glide.c.D(f30Var);
        String h43 = f30Var.h4();
        String r43 = f30Var.r4();
        String c43 = f30Var.c4();
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        Boolean d54 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d54, "getIsPromoted(...)");
        if (!d54.booleanValue()) {
            Boolean F4 = f30Var.F4();
            Intrinsics.checkNotNullExpressionValue(F4, "getIsDownstreamPromotion(...)");
            if (!F4.booleanValue()) {
                z13 = false;
            }
        }
        Boolean p63 = f30Var.p6();
        Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
        return kotlin.collections.e0.b(new m21.b(z03, x03, str, S0, z43, D, h43, r43, c43, uid, null, null, z13, false, null, p63.booleanValue(), false, null, Boolean.valueOf(((es.v) adsCommonDisplay).M(f30Var)), null, false, 3334144));
    }

    public static boolean Y(b91 b91Var, double d2) {
        boolean u13 = b91Var.u();
        double v13 = b91Var.v();
        if (b91Var.B()) {
            if (u13) {
                if (d2 < v13) {
                    return false;
                }
            } else if (d2 <= v13) {
                return false;
            }
            return true;
        }
        if (!b91Var.C()) {
            if (b91Var.z()) {
                return (((long) d2) & ((long) v13)) > 0;
            }
            return v13 == d2;
        }
        if (u13) {
            if (d2 > v13) {
                return false;
            }
        } else if (d2 >= v13) {
            return false;
        }
        return true;
    }

    public static int Y0(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        d81 d81Var = (d81) h4Var;
        int E0 = E0(bArr, i14, pgVar);
        d81Var.a(io.a(pgVar.f9671b));
        while (E0 < i15) {
            int i16 = E0 + 1;
            byte b13 = bArr[E0];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i16 = N(b13, bArr, i16, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            E0 = E0(bArr, i16, pgVar);
            d81Var.a(io.a(pgVar.f9671b));
        }
        return E0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean Z(nm.s sVar, b91 b91Var) {
        if (b91Var.E()) {
            String x13 = b91Var.x();
            Intrinsics.checkNotNullExpressionValue(x13, "getStringValue(...)");
            boolean z13 = sVar instanceof nm.v;
            String p13 = (z13 && (sVar.j().f91367a instanceof String)) ? sVar.p() : (z13 && (sVar.j().f91367a instanceof Boolean)) ? sVar.b() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0" : sVar.toString();
            Regex regex = new Regex(x13);
            Intrinsics.f(p13);
            return regex.e(p13);
        }
        if (b91Var.A()) {
            Boolean U = U(sVar, b91Var.s());
            if (U != null) {
                return U.booleanValue();
            }
        } else {
            if (!b91Var.D()) {
                if (b91Var.y()) {
                    b91 r13 = b91Var.r();
                    Intrinsics.checkNotNullExpressionValue(r13, "getArrayContains(...)");
                    if (sVar instanceof nm.q) {
                        nm.q f13 = sVar.f();
                        Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
                        if (!(f13 instanceof Collection) || !((Collection) f13).isEmpty()) {
                            Iterator it = f13.f91364a.iterator();
                            while (it.hasNext()) {
                                nm.s sVar2 = (nm.s) it.next();
                                if (r13.w().isEmpty()) {
                                    Intrinsics.f(sVar2);
                                    if (Z(sVar2, r13)) {
                                    }
                                } else {
                                    sVar2.getClass();
                                    if (sVar2 instanceof nm.u) {
                                        nm.u i13 = sVar2.i();
                                        Intrinsics.checkNotNullExpressionValue(i13, "getAsJsonObject(...)");
                                        if (a0(i13, r13)) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            boolean z14 = sVar instanceof nm.v;
            if (z14 && (sVar.j().f91367a instanceof Number)) {
                return Y(b91Var, sVar.n().doubleValue());
            }
            if (z14 && (sVar.j().f91367a instanceof Number)) {
                return Y(b91Var, sVar.b() ? 1.0d : 0.0d);
            }
            String p14 = (z14 && (sVar.j().f91367a instanceof String)) ? sVar.p() : sVar.toString();
            Intrinsics.f(p14);
            String lowerCase = p14.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Double d2 = kotlin.text.y.d(lowerCase);
            if (d2 != null) {
                return Y(b91Var, d2.doubleValue());
            }
        }
        return false;
    }

    public static int Z0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        zv0 zv0Var = (zv0) h4Var;
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a + z03;
        while (z03 < i14) {
            int i15 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
                z03 = i15;
            } else {
                z03 = N(b13, bArr, i15, pgVar);
            }
            zv0Var.b(pgVar.f9670a);
        }
        if (z03 == i14) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static boolean a0(nm.u uVar, b91 b91Var) {
        if (b91Var.w().isEmpty()) {
            return false;
        }
        h4 w13 = b91Var.w();
        Intrinsics.checkNotNullExpressionValue(w13, "getPathList(...)");
        nm.s h03 = h0(uVar, w13);
        if (h03 == null) {
            return false;
        }
        return Z(h03, b91Var);
    }

    public static final void a1(CoroutineContext coroutineContext, Throwable th3) {
        if (th3 instanceof CancellationException) {
            return;
        }
        try {
            lb.l0.R0(th3);
        } catch (Throwable th4) {
            xk2.f.a(th3, th4);
            j1.l0(coroutineContext, th3);
        }
    }

    public static void b0(x92.b bVar) {
        n60.o.v(bVar, "userdiditdata.id", "userdiditdata.type", "userdiditdata.pin()");
        n00.d.f88768a.b(bVar);
        bVar.e("board.privacy");
        pk.a0.b(bVar);
        bVar.e("userdiditdata.has_recommended");
        n60.o.w(bVar, "userdiditdata.done_at", "userdiditdata.tags", "userdiditdata.details", "userdiditdata.user()");
        n60.o.w(bVar, "userdiditdata.highlighted_by_pin_owner", "user.full_name", "user.image_medium_url", "user.image_large_url");
        bVar.e("user.image_xlarge_url");
        bVar.e("userdiditdata.recommend_score");
        bVar.h("userdiditdata.images", "1080x");
        n60.o.w(bVar, "userdiditdata.reaction_by_me", "userdiditdata.reaction_counts", "userdiditdata.comment_count", "userdiditdata.image_signatures");
        n60.o.w(bVar, "userdiditdata.recommendation_reason", "pin.is_whitelisted_for_tried_it", "pin.is_eligible_for_aggregated_comments", "pin.can_delete_did_it_and_comments");
    }

    public static final boolean b1(lh0.g gVar, f30 pin) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!df.j1.B0(pin)) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (!ph.a.f0(pin)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if ((!r4) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0017, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0014, code lost:
    
        if (r4 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c0(int r2, int r3, boolean r4, int r5) {
        /*
            r0 = 0
            if (r3 < r5) goto L9
            if (r4 == 0) goto L6
            goto L2c
        L6:
            int r0 = r5 - r3
            goto L2c
        L9:
            r1 = r4 ^ 1
            if (r1 == 0) goto L10
            if (r3 > r2) goto L1a
            goto L14
        L10:
            int r1 = r5 - r3
            if (r1 <= r2) goto L1a
        L14:
            if (r4 == 0) goto L17
            goto L18
        L17:
            int r2 = r2 - r3
        L18:
            r0 = r2
            goto L2c
        L1a:
            if (r4 == 0) goto L1f
            if (r3 > r2) goto L28
            goto L23
        L1f:
            int r1 = r5 - r3
            if (r1 <= r2) goto L28
        L23:
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            goto L18
        L28:
            r2 = r4 ^ 1
            if (r2 == 0) goto L6
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.m2.c0(int, int, boolean, int):int");
    }

    public static int c1(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        int z03 = z0(bArr, i14, pgVar);
        int i16 = pgVar.f9670a;
        if (i16 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 == 0) {
            h4Var.add("");
        } else {
            h4Var.add(new String(bArr, z03, i16, hw0.f6126a));
            z03 += i16;
        }
        while (z03 < i15) {
            int i17 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i17 = N(b13, bArr, i17, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            z03 = i17 + 1;
            byte b14 = bArr[i17];
            if (b14 >= 0) {
                pgVar.f9670a = b14;
            } else {
                z03 = N(b14, bArr, z03, pgVar);
            }
            int i18 = pgVar.f9670a;
            if (i18 < 0) {
                throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i18 == 0) {
                h4Var.add("");
            } else {
                h4Var.add(new String(bArr, z03, i18, hw0.f6126a));
                z03 += i18;
            }
        }
        return z03;
    }

    public static int d0(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public static int d1(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        d81 d81Var = (d81) h4Var;
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a + z03;
        while (z03 < i14) {
            z03 = E0(bArr, z03, pgVar);
            d81Var.a(pgVar.f9671b);
        }
        if (z03 == i14) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e0(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        int z03 = z0(bArr, i14, pgVar);
        int i16 = pgVar.f9670a;
        if (i16 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 > bArr.length - z03) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i16 == 0) {
            h4Var.add(il.f6431b);
        } else {
            int i17 = z03 + i16;
            il.a(z03, i17, bArr.length);
            h4Var.add(new gl(((kp.n) il.f6432c).I(bArr, z03, i16)));
            z03 = i17;
        }
        while (z03 < i15) {
            int i18 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i18 = N(b13, bArr, i18, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            z03 = i18 + 1;
            byte b14 = bArr[i18];
            if (b14 >= 0) {
                pgVar.f9670a = b14;
            } else {
                z03 = N(b14, bArr, z03, pgVar);
            }
            int i19 = pgVar.f9670a;
            if (i19 < 0) {
                throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i19 > bArr.length - z03) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i19 == 0) {
                h4Var.add(il.f6431b);
            } else {
                int i23 = z03 + i19;
                il.a(z03, i23, bArr.length);
                h4Var.add(new gl(((kp.n) il.f6432c).I(bArr, z03, i19)));
                z03 = i23;
            }
        }
        return z03;
    }

    public static void e1(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        long j17 = jArr[4];
        long j18 = jArr[5];
        long j19 = jArr[6];
        jArr2[0] = j13 & 576460752303423487L;
        jArr2[1] = ((j13 >>> 59) ^ (j14 << 5)) & 576460752303423487L;
        jArr2[2] = ((j14 >>> 54) ^ (j15 << 10)) & 576460752303423487L;
        jArr2[3] = ((j15 >>> 49) ^ (j16 << 15)) & 576460752303423487L;
        jArr2[4] = ((j16 >>> 44) ^ (j17 << 20)) & 576460752303423487L;
        jArr2[5] = ((j17 >>> 39) ^ (j18 << 25)) & 576460752303423487L;
        jArr2[6] = (j18 >>> 34) ^ (j19 << 30);
    }

    public static int f0(tb tbVar, int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        sj0 a13 = tbVar.a();
        int Q = Q(a13, tbVar, bArr, i14, i15, pgVar);
        tbVar.c(a13);
        pgVar.f9672c = a13;
        h4Var.add(a13);
        while (Q < i15) {
            int i16 = Q + 1;
            byte b13 = bArr[Q];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i16 = N(b13, bArr, i16, pgVar);
            }
            int i17 = i16;
            if (i13 != pgVar.f9670a) {
                break;
            }
            sj0 a14 = tbVar.a();
            int Q2 = Q(a14, tbVar, bArr, i17, i15, pgVar);
            tbVar.c(a14);
            pgVar.f9672c = a14;
            h4Var.add(a14);
            Q = Q2;
        }
        return Q;
    }

    public static void f1(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        e1(jArr, jArr4);
        e1(jArr2, jArr5);
        for (int i13 = 0; i13 < 7; i13++) {
            long j13 = jArr5[i13];
            long j14 = j13 << 1;
            long j15 = j14 ^ j13;
            long j16 = j13 << 2;
            long j17 = j15 << 1;
            long[] jArr6 = {0, j13, j14, j15, j16, j16 ^ j13, j17, j17 ^ j13};
            for (int i14 = 0; i14 < 7; i14++) {
                long j18 = jArr4[i14];
                int i15 = (int) j18;
                long j19 = jArr6[i15 & 7] ^ (jArr6[(i15 >>> 3) & 7] << 3);
                int i16 = 54;
                long j23 = 0;
                do {
                    int i17 = (int) (j18 >>> i16);
                    long j24 = jArr6[i17 & 7] ^ (jArr6[(i17 >>> 3) & 7] << 3);
                    j19 ^= j24 << i16;
                    j23 ^= j24 >>> (-i16);
                    i16 -= 6;
                } while (i16 > 0);
                int i18 = i13 + i14;
                jArr3[i18] = jArr3[i18] ^ (j19 & 576460752303423487L);
                int i19 = i18 + 1;
                jArr3[i19] = jArr3[i19] ^ ((j19 >>> 59) ^ (j23 << 5));
            }
        }
        long j25 = jArr3[0];
        long j26 = jArr3[1];
        long j27 = jArr3[2];
        long j28 = jArr3[3];
        long j29 = jArr3[4];
        long j33 = jArr3[5];
        long j34 = jArr3[6];
        long j35 = jArr3[7];
        long j36 = jArr3[8];
        long j37 = jArr3[9];
        long j38 = jArr3[10];
        long j39 = jArr3[11];
        long j43 = jArr3[12];
        long j44 = jArr3[13];
        jArr3[0] = j25 ^ (j26 << 59);
        jArr3[1] = (j26 >>> 5) ^ (j27 << 54);
        jArr3[2] = (j27 >>> 10) ^ (j28 << 49);
        jArr3[3] = (j28 >>> 15) ^ (j29 << 44);
        jArr3[4] = (j29 >>> 20) ^ (j33 << 39);
        jArr3[5] = (j33 >>> 25) ^ (j34 << 34);
        jArr3[6] = (j34 >>> 30) ^ (j35 << 29);
        jArr3[7] = (j35 >>> 35) ^ (j36 << 24);
        jArr3[8] = (j36 >>> 40) ^ (j37 << 19);
        jArr3[9] = (j37 >>> 45) ^ (j38 << 14);
        jArr3[10] = (j38 >>> 50) ^ (j39 << 9);
        jArr3[11] = ((j39 >>> 55) ^ (j43 << 4)) ^ (j44 << 63);
        jArr3[12] = (j43 >>> 60) ^ (j44 >>> 1);
        jArr3[13] = 0;
    }

    public static int g0(byte[] bArr, int i13, pg pgVar) {
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a;
        if (i14 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i14 == 0) {
            pgVar.f9672c = "";
            return z03;
        }
        pgVar.f9672c = new String(bArr, z03, i14, hw0.f6126a);
        return z03 + i14;
    }

    public static void g1(long[] jArr, long[] jArr2) {
        for (int i13 = 0; i13 < 6; i13++) {
            p2.e0(i13 << 1, jArr[i13], jArr2);
        }
        jArr2[12] = p2.d0((int) jArr[6]);
    }

    public static nm.s h0(nm.u uVar, h4 h4Var) {
        Iterator it = h4Var.iterator();
        nm.s sVar = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sVar != null && !(sVar instanceof nm.u)) {
                return null;
            }
            if (sVar == null || (sVar = sVar.i().v(str)) == null) {
                sVar = uVar.v(str);
            }
        }
        return sVar;
    }

    public static void h1(ap0.i iVar, lu1.b bVar) {
        iVar.f20315n0 = bVar;
    }

    public static void i0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        if (z0(bArr, i13, pgVar) + pgVar.f9670a > bArr.length) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw null;
    }

    public static void i1(m90.w wVar, pb0.d dVar) {
        wVar.M0 = dVar;
    }

    public static final NavigationImpl j0(String str, String str2, String str3, boolean z13, boolean z14) {
        gp1.b bVar = z14 ? gp1.b.SIMPLE : null;
        BoardCreateOrPickerNavigation boardCreateOrPickerNavigation = new BoardCreateOrPickerNavigation();
        boardCreateOrPickerNavigation.f45097k = bVar;
        boardCreateOrPickerNavigation.f45088b = (str == null || str.length() == 0) ? new ArrayList() : kotlin.collections.f0.d(str);
        boardCreateOrPickerNavigation.f45093g = true;
        boardCreateOrPickerNavigation.f45094h = true;
        boardCreateOrPickerNavigation.f45096j = z13;
        NavigationImpl L = Navigation.L(com.pinterest.screens.m3.a(), "", ml1.b.MODAL_TRANSITION.getValue());
        L.y0(boardCreateOrPickerNavigation, "com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT");
        if (str3 != null) {
            L.m0("com.pinterest.EXTRA_SOURCE", str3);
        }
        if (str2 != null) {
            L.m0("com.pinterest.EXTRA_SESSION_ID", str2);
        }
        return L;
    }

    public static void j1(ca0.z zVar, n72.b bVar) {
        zVar.f27180c0 = bVar;
    }

    public static int k0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        zv0 zv0Var = (zv0) h4Var;
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a;
        int i15 = z03 + i14;
        if (i15 > bArr.length) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zv0Var.c((i14 / 4) + zv0Var.f14948c);
        while (z03 < i15) {
            zv0Var.b(d0(z03, bArr));
            z03 += 4;
        }
        if (z03 == i15) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static void k1(m90.w wVar, n5 n5Var) {
        wVar.L0 = n5Var;
    }

    public static int l0(byte[] bArr, int i13, pg pgVar) {
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a;
        if (i14 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i14 == 0) {
            pgVar.f9672c = "";
            return z03;
        }
        pgVar.f9672c = rx2.f10845a.c(bArr, z03, i14);
        return z03 + i14;
    }

    public static void l1(zu0.g gVar, ag1.h hVar) {
        gVar.C0 = hVar;
    }

    public static long m0(int i13, byte[] bArr) {
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public static void m1(ap0.i iVar, nu1.a aVar) {
        iVar.f20312k0 = aVar;
    }

    public static void n0(byte[] bArr, int i13, h4 h4Var) {
        Double.longBitsToDouble(m0(i13, bArr));
        throw null;
    }

    public static void n1(ap0.i iVar, mo1.d dVar) {
        iVar.f20314m0 = dVar;
    }

    public static final void o0(FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        if (frameLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = com.bumptech.glide.c.G();
            layoutParams2.height = -1;
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
            return;
        }
        if (frameLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = com.bumptech.glide.c.G();
            layoutParams4.height = -1;
            layoutParams4.gravity = 17;
            frameLayout.setLayoutParams(layoutParams4);
        }
    }

    public static void o1(zu0.g gVar, m20.b bVar) {
        gVar.A0 = bVar;
    }

    public static final byte p0(char c13) {
        if (c13 < '~') {
            return so2.f.f114785b[c13];
        }
        return (byte) 0;
    }

    public static void p1(ca0.z zVar, m72.a aVar) {
        zVar.f27181d0 = aVar;
    }

    public static void q0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void q1(zu0.g gVar, i8 i8Var) {
        gVar.f142827z0 = i8Var;
    }

    public static final NavigationImpl r0(d32.c collageEntryPointSource, String str, String str2, String boardPickerLaunchPoint) {
        Intrinsics.checkNotNullParameter(boardPickerLaunchPoint, "boardPickerLaunchPoint");
        Intrinsics.checkNotNullParameter(collageEntryPointSource, "collageEntryPointSource");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.m3.e());
        w13.m0("com.pinterest.EXTRA_PIN_ID", str);
        w13.m0("com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT", boardPickerLaunchPoint);
        w13.z(collageEntryPointSource.getValue(), "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE");
        if (str2 != null) {
            w13.m0("com.pinterest.EXTRA_SESSION_ID", str2);
        }
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        return w13;
    }

    public static void r1(ap0.i iVar, uk1.e eVar) {
        iVar.f20311j0 = eVar;
    }

    public static u2.q s0(u2.q coloredShadow, float f13, float f14) {
        long j13 = b3.e0.f21313a;
        Intrinsics.checkNotNullParameter(coloredShadow, "$this$coloredShadow");
        return ao2.m0.p(coloredShadow, t3.p.f116119m, new ra0.z0(f14, 0, 0, 0.2f, f13, j13));
    }

    public static void s1(zu0.g gVar, i92.k kVar) {
        gVar.B0 = kVar;
    }

    public static boolean t0(int[] iArr, int i13) {
        for (int i14 : iArr) {
            if (i14 == i13) {
                return true;
            }
        }
        return false;
    }

    public static void t1(ap0.i iVar, c30.a aVar) {
        iVar.f20313l0 = aVar;
    }

    public static boolean u0(Object[] objArr, Feature feature) {
        int length = objArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            if (!com.bumptech.glide.c.x(objArr[i13], feature)) {
                i13++;
            } else if (i13 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean u1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.z1(context, "com.android.chrome") && ((oa) z70.i.a()).r2().f140992a;
    }

    public static Object v0(int i13) {
        if (i13 < 2 || i13 > 1073741824 || Integer.highestOneBit(i13) != i13) {
            throw new IllegalArgumentException(a.a.d("must be power of 2 between 2^1 and 2^30: ", i13));
        }
        return i13 <= 256 ? new byte[i13] : i13 <= 65536 ? new short[i13] : new int[i13];
    }

    public static final boolean v1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean d53 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        if (d53.booleanValue() && f30Var.a6() != null) {
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Boolean d54 = f30Var.d5();
            Intrinsics.checkNotNullExpressionValue(d54, "getIsPromoted(...)");
            if (d54.booleanValue() && f30Var.v3().intValue() == 1) {
                return true;
            }
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Boolean d55 = f30Var.d5();
            Intrinsics.checkNotNullExpressionValue(d55, "getIsPromoted(...)");
            if (d55.booleanValue() && f30Var.v3().intValue() == 2) {
                return true;
            }
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Boolean d56 = f30Var.d5();
            Intrinsics.checkNotNullExpressionValue(d56, "getIsPromoted(...)");
            if (d56.booleanValue() && f30Var.v3().intValue() == 3) {
                return true;
            }
        }
        Boolean R5 = f30Var.R5();
        Intrinsics.checkNotNullExpressionValue(R5, "getPromotedIsPersonalized(...)");
        return R5.booleanValue();
    }

    public static float w0(int i13, byte[] bArr) {
        return Float.intBitsToFloat(d0(i13, bArr));
    }

    public static final boolean w1(ay ayVar) {
        Intrinsics.checkNotNullParameter(ayVar, "<this>");
        return ayVar.n().intValue() == w32.f.LEGO.getValue();
    }

    public static int x0(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        zv0 zv0Var = (zv0) h4Var;
        zv0Var.b(d0(i14, bArr));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int i17 = i16 + 1;
            byte b13 = bArr[i16];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i17 = N(b13, bArr, i17, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            zv0Var.b(d0(i17, bArr));
            i16 = i17 + 4;
        }
        return i16;
    }

    public static final boolean x1(pn2.b0 b0Var) {
        am2.j b13 = b0Var.w0().b();
        am2.c1 c1Var = b13 instanceof am2.c1 ? (am2.c1) b13 : null;
        if (c1Var == null) {
            return false;
        }
        return J1(kotlin.jvm.internal.j.q(c1Var));
    }

    public static int y0(byte[] bArr, int i13, h4 h4Var, pg pgVar) {
        d81 d81Var = (d81) h4Var;
        int z03 = z0(bArr, i13, pgVar);
        int i14 = pgVar.f9670a;
        int i15 = z03 + i14;
        if (i15 > bArr.length) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        d81Var.b((i14 / 8) + d81Var.f4201c);
        while (z03 < i15) {
            d81Var.a(m0(z03, bArr));
            z03 += 8;
        }
        if (z03 == i15) {
            return z03;
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int y1(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        int z03 = z0(bArr, i14, pgVar);
        int i16 = pgVar.f9670a;
        if (i16 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i16 == 0) {
            h4Var.add("");
        } else {
            int i17 = z03 + i16;
            if (!rx2.a(bArr, z03, i17)) {
                throw new e21("Protocol message had invalid UTF-8.");
            }
            h4Var.add(new String(bArr, z03, i16, hw0.f6126a));
            z03 = i17;
        }
        while (z03 < i15) {
            int i18 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i18 = N(b13, bArr, i18, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            z03 = i18 + 1;
            byte b14 = bArr[i18];
            if (b14 >= 0) {
                pgVar.f9670a = b14;
            } else {
                z03 = N(b14, bArr, z03, pgVar);
            }
            int i19 = pgVar.f9670a;
            if (i19 < 0) {
                throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i19 == 0) {
                h4Var.add("");
            } else {
                int i23 = z03 + i19;
                if (!rx2.a(bArr, z03, i23)) {
                    throw new e21("Protocol message had invalid UTF-8.");
                }
                h4Var.add(new String(bArr, z03, i19, hw0.f6126a));
                z03 = i23;
            }
        }
        return z03;
    }

    public static int z0(byte[] bArr, int i13, pg pgVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return N(b13, bArr, i14, pgVar);
        }
        pgVar.f9670a = b13;
        return i14;
    }

    public static int z1(int i13, byte[] bArr, int i14, int i15, h4 h4Var, pg pgVar) {
        zv0 zv0Var = (zv0) h4Var;
        int z03 = z0(bArr, i14, pgVar);
        zv0Var.b(pgVar.f9670a);
        while (z03 < i15) {
            int i16 = z03 + 1;
            byte b13 = bArr[z03];
            if (b13 >= 0) {
                pgVar.f9670a = b13;
            } else {
                i16 = N(b13, bArr, i16, pgVar);
            }
            if (i13 != pgVar.f9670a) {
                break;
            }
            z03 = i16 + 1;
            byte b14 = bArr[i16];
            if (b14 >= 0) {
                pgVar.f9670a = b14;
            } else {
                z03 = N(b14, bArr, z03, pgVar);
            }
            zv0Var.b(pgVar.f9670a);
        }
        return z03;
    }

    @Override // po2.c
    public boolean A() {
        return true;
    }

    @Override // po2.a
    public byte B(qo2.a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E();
    }

    public void B0() {
        throw new SerializationException(kotlin.jvm.internal.k0.f80436a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // po2.a
    public Object C(oo2.g descriptor, int i13, no2.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return m(deserializer);
    }

    @Override // po2.a
    public int D(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g();
    }

    @Override // po2.c
    public abstract byte E();

    @Override // po2.a
    public void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // po2.c
    public po2.a b(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // po2.a
    public long e(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return i();
    }

    @Override // po2.c
    public abstract int g();

    @Override // po2.a
    public boolean h(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return t();
    }

    @Override // po2.c
    public abstract long i();

    @Override // po2.a
    public short j(qo2.a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return q();
    }

    @Override // po2.a
    public String k(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z();
    }

    @Override // po2.a
    public char l(qo2.a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return u();
    }

    @Override // po2.c
    public Object m(no2.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.e(this);
    }

    @Override // po2.a
    public float n(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return r();
    }

    @Override // po2.c
    public po2.c p(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // po2.c
    public abstract short q();

    @Override // po2.c
    public float r() {
        B0();
        throw null;
    }

    @Override // po2.c
    public double s() {
        B0();
        throw null;
    }

    @Override // po2.c
    public boolean t() {
        B0();
        throw null;
    }

    @Override // po2.c
    public char u() {
        B0();
        throw null;
    }

    @Override // po2.a
    public Object v(qo2.y0 descriptor, int i13, no2.b deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.a().b() && !A()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return m(deserializer);
    }

    @Override // po2.c
    public int w(oo2.g enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        B0();
        throw null;
    }

    @Override // po2.a
    public po2.c x(qo2.a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p(descriptor.h(i13));
    }

    @Override // po2.a
    public double y(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return s();
    }

    @Override // po2.c
    public String z() {
        B0();
        throw null;
    }
}
