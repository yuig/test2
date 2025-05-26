package kg;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.widget.Toast;
import ao2.j0;
import ao2.l0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import ha2.b0;
import ha2.c0;
import ha2.x;
import i1.y1;
import i2.f2;
import j1.e3;
import j1.o1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kh2.p2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.collections.j1;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import lh0.k2;
import m1.o3;
import nx.d0;
import rh1.x1;
import rq.a0;
import s1.k0;
import s1.o0;
import so.b4;
import yk1.v;
import zy.e0;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f79376a = true;

    public static void A(d91.j jVar) {
        jVar.getClass();
    }

    public static void B(uv1.q qVar, uk1.e eVar) {
        qVar.f123223z0 = eVar;
    }

    public static void C(d91.j jVar, b4 b4Var) {
        jVar.f54084h1 = b4Var;
    }

    public static final boolean D(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z.j(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!Intrinsics.d(lowerCase, "null")) {
                return false;
            }
        }
        return true;
    }

    public static float E(float f13, float f14, float f15) {
        return ep.b.a(f14, f13, f15, f13);
    }

    public static void F(d0 pinalytics, String str, h61.h hVar) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        h61.h hVar2 = h61.h.PRODUCTS;
        if (!Intrinsics.d(str, hVar2.toString()) || hVar == hVar2) {
            return;
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.PRODUCT_SEARCH_BACK_BUTTON_EXIT, (r18 & 2) != 0 ? null : u0.BACK_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public static final e0 G(i0 context, g0 component, u0 element, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        return new e0(new zy.a(com.bumptech.glide.d.z0(context, new nx.i0(element, component, 3)), f1.TAP, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }

    public static void H(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        t(jArr, jArr2, jArr4);
        L(jArr4, jArr3);
    }

    public static final b0 I(k41.f selectedOption, Function1 viewOptionSelectionHandler, int i13, ha2.d0 d0Var, vn1.g gVar, vn1.c cVar, vn1.g gVar2) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(viewOptionSelectionHandler, "viewOptionSelectionHandler");
        x xVar = new x(i13, null, null, cVar, gVar2, 6);
        c0[] c0VarArr = new c0[3];
        int i14 = oz1.e.lego_profile_pins_view_option_wide;
        k41.f fVar = k41.f.Wide;
        c0VarArr[0] = new c0(i14, fVar.ordinal(), d0Var, selectedOption == fVar, false, null, gVar, null, null, null, 4016);
        int i15 = oz1.e.lego_profile_view_option_default;
        k41.f fVar2 = k41.f.Default;
        c0VarArr[1] = new c0(i15, fVar2.ordinal(), d0Var, selectedOption == fVar2, false, null, gVar, null, null, null, 4016);
        int i16 = oz1.e.lego_profile_view_option_compact;
        k41.f fVar3 = k41.f.Compact;
        c0VarArr[2] = new c0(i16, fVar3.ordinal(), d0Var, selectedOption == fVar3, false, null, gVar, null, null, null, 4016);
        return new b0(xVar, f0.j(c0VarArr), viewOptionSelectionHandler);
    }

    public static final void K(ro2.d0 d0Var, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        ro2.d0 d0Var2 = new ro2.d0();
        builderAction.invoke(d0Var2);
        d0Var.a(key, new ro2.c0(d0Var2.f108980a));
    }

    public static void L(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        long j17 = j15 ^ ((j16 >>> 40) ^ (j16 >>> 49));
        long j18 = j13 ^ ((j17 << 15) ^ (j17 << 24));
        long j19 = (j14 ^ ((j16 << 15) ^ (j16 << 24))) ^ ((j17 >>> 40) ^ (j17 >>> 49));
        long j23 = j19 >>> 49;
        jArr2[0] = (j18 ^ j23) ^ (j23 << 9);
        jArr2[1] = 562949953421311L & j19;
    }

    public static void M(int i13, Context context, CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Toast.makeText(context, text, i13).show();
    }

    public static void N(int i13, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        v(jArr, jArr3);
        L(jArr3, jArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            v(jArr2, jArr3);
            L(jArr3, jArr2);
        }
    }

    public static final Iterator O(Iterator iterator, int i13, int i14, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? p0.f80390a : yn2.q.a(new j1(i13, i14, iterator, z14, z13, null));
    }

    public static final void a(bm1.m state, u2.q qVar, Function1 function1, i2.o oVar, int i13, int i14) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2072274886);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = null;
        }
        sVar.W(785030819);
        if (function1 == null) {
            function12 = null;
        } else {
            sVar.W(-348212262);
            boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(function1)) || (i13 & 384) == 256;
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new al1.j(4, function1);
                sVar.g0(J2);
            }
            function12 = (Function1) J2;
            sVar.r(false);
        }
        sVar.r(false);
        b(state, qVar, function12 != null ? new hm1.e(1, function12) : null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 10, qVar, state, function1);
        }
    }

    public static final void b(bm1.m state, u2.q qVar, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(368060491);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        int i15 = 18;
        androidx.compose.ui.viewinterop.a.a(new a0(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar, i15), qVar, new com.pinterest.framework.screens.q(i15, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 11, qVar, state, aVar);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static final void e(ro2.f fVar, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        ro2.d0 d0Var = new ro2.d0();
        builderAction.invoke(d0Var);
        ro2.c0 element = new ro2.c0(d0Var.f108980a);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(element, "element");
        fVar.f108985a.add(element);
    }

    public static final zo.c f(int i13, zo.c cVar) {
        k41.f fVar;
        Intrinsics.checkNotNullParameter(cVar, "default");
        k41.f.Companion.getClass();
        k41.f[] values = k41.f.values();
        int length = values.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                fVar = null;
                break;
            }
            fVar = values[i14];
            if (fVar.ordinal() == i13) {
                break;
            }
            i14++;
        }
        int i15 = fVar == null ? -1 : k41.c.f78303a[fVar.ordinal()];
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? cVar : zo.c.DENSE : zo.c.DEFAULT : zo.c.SINGLE;
    }

    public static final void g(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException((i13 != i14 ? cb.j("Both size ", i13, " and step ", i14, " must be greater than zero.") : a.a.e("size ", i13, " must be greater than zero.")).toString());
        }
    }

    public static float h(float f13, float f14, float f15) {
        return E(0.0f, 1.0f, Math.max(0.0f, Math.min(1.0f, f13 == f14 ? 0.0f : (f15 - f13) / (f14 - f13))));
    }

    public static final double i(Point point, Point otherPoint) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Intrinsics.checkNotNullParameter(otherPoint, "otherPoint");
        double d2 = point.x - otherPoint.x;
        double d13 = point.y - otherPoint.y;
        return Math.sqrt((d13 * d13) + (d2 * d2));
    }

    public static final u0 j(zo.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = k41.c.f78304b[type.ordinal()];
        if (i13 == 1) {
            return u0.PROFILE_PIN_REP_VIEW_SINGLE_COLUMN_OPTION;
        }
        if (i13 == 2) {
            return u0.PROFILE_PIN_REP_VIEW_DENSE_OPTION;
        }
        if (i13 == 3) {
            return u0.PROFILE_PIN_REP_VIEW_DEFAULT_OPTION;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static o3 k(o0 o0Var, o1 o1Var, i2.o oVar, int i13, int i14) {
        k0 k0Var = new k0();
        j1.a0 a13 = y1.a(oVar);
        boolean z13 = true;
        if ((i14 & 8) != 0) {
            Map map = e3.f74054a;
            o1Var = j1.e.q(0.0f, 400.0f, Float.valueOf(1), 1);
        }
        i2.s sVar = (i2.s) oVar;
        n4.b bVar = (n4.b) sVar.m(t3.f2.f115983f);
        n4.k kVar = (n4.k) sVar.m(t3.f2.f115989l);
        boolean h10 = ((((i13 & 14) ^ 6) > 4 && sVar.h(o0Var)) || (i13 & 6) == 4) | sVar.h(a13) | sVar.h(o1Var);
        if ((((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48) <= 32 || !sVar.h(k0Var)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean h13 = h10 | z13 | sVar.h(bVar) | sVar.h(kVar);
        Object J2 = sVar.J();
        if (h13 || J2 == i2.n.f71185a) {
            n1.b bVar2 = new n1.b(k0Var, o0Var, new s1.s(o0Var, kVar, 0.5f));
            float f13 = n1.l.f88914a;
            n1.h hVar = new n1.h(bVar2, a13, o1Var);
            sVar.g0(hVar);
            J2 = hVar;
        }
        return (o3) J2;
    }

    public static go2.b l(j0 j0Var, Function2 function2) {
        kotlin.coroutines.j jVar = kotlin.coroutines.j.f80412a;
        l0 l0Var = l0.DEFAULT;
        if (!l0Var.isLazy()) {
            go2.c cVar = new go2.c(ao2.d0.c(j0Var, jVar));
            l0Var.invoke(function2, cVar, cVar);
            return (go2.b) cVar.f65929e;
        }
        throw new IllegalArgumentException((l0Var + " start is not supported").toString());
    }

    public static final String m(f30 f30Var) {
        sr srVar;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Map A4 = f30Var.A4();
        if (A4 != null) {
            srVar = (sr) A4.get("136x136");
            if (srVar == null) {
                srVar = (sr) A4.get("45x45");
            }
        } else {
            srVar = null;
        }
        if (srVar != null) {
            return bs1.c.D0(srVar);
        }
        return null;
    }

    public static boolean n(an2.f0 f0Var) {
        return f0Var.p().getIncludeAnnotationArguments();
    }

    public static boolean o(an2.f0 f0Var) {
        return f0Var.p().getIncludeEmptyAnnotationArguments();
    }

    public static final PointF p(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        return new PointF(motionEvent.getX(), motionEvent.getY());
    }

    public static final String q(Date date, Resources resources, v vVar) {
        int i13;
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        if (calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1)) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(date);
            i13 = calendar3.get(12) != 0 ? p22.b.schedule_time_today_with_minutes : p22.b.schedule_time_today_without_minutes;
        } else {
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(date);
            i13 = calendar4.get(12) != 0 ? p22.b.schedule_date_time_with_minutes : p22.b.schedule_date_time_without_minutes;
        }
        if ((vVar != null ? ((yk1.a) vVar).f139224a.getString(i13) : null) != null) {
            return df.j1.U(((yk1.a) vVar).f139224a.getString(i13), new Object[]{date});
        }
        if ((resources != null ? resources.getString(i13) : null) == null) {
            return "";
        }
        String string = resources.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return df.j1.U(string, new Object[]{date});
    }

    public static final String r(Date date, yk1.a viewResources) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        calendar2.setTime(date);
        if (calendar2.getTime().compareTo(calendar.getTime()) > 0) {
            return q(date, null, viewResources);
        }
        return viewResources.f139224a.getString(p22.b.idea_pin_schedule_publish_date_default);
    }

    public static final String s(String interestTags, String freeformTags, v vVar) {
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(interestTags, "interestTags");
        Intrinsics.checkNotNullParameter(freeformTags, "freeformTags");
        split$default = StringsKt__StringsKt.split$default(freeformTags, new String[]{","}, false, 0, 6, null);
        String[] strArr = (String[]) split$default.toArray(new String[0]);
        List j13 = f0.j(Arrays.copyOf(strArr, strArr.length));
        split$default2 = StringsKt__StringsKt.split$default(interestTags, new String[]{","}, false, 0, 6, null);
        String[] strArr2 = (String[]) split$default2.toArray(new String[0]);
        List j14 = f0.j(Arrays.copyOf(strArr2, strArr2.length));
        boolean contains = j13.contains("");
        int size = j13.size();
        if (contains) {
            size--;
        }
        boolean contains2 = j14.contains("");
        int size2 = j14.size();
        if (contains2) {
            size2--;
        }
        int i13 = size + size2;
        if (i13 <= 0 || vVar == null) {
            return "";
        }
        if (i13 != 1) {
            return ((yk1.a) vVar).f139224a.getString(p22.b.interest_tags_n_tags, Integer.valueOf(i13));
        }
        String string = ((yk1.a) vVar).f139224a.getString(p22.b.interest_tags_1_tag);
        return string == null ? "" : string;
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long j13 = jArr[0];
        long j14 = ((jArr[1] << 7) ^ (j13 >>> 57)) & 144115188075855871L;
        long j15 = j13 & 144115188075855871L;
        long j16 = jArr2[0];
        long j17 = ((jArr2[1] << 7) ^ (j16 >>> 57)) & 144115188075855871L;
        long j18 = 144115188075855871L & j16;
        long[] jArr4 = new long[6];
        u(j15, j18, jArr4, 0);
        u(j14, j17, jArr4, 2);
        u(j15 ^ j14, j18 ^ j17, jArr4, 4);
        long j19 = jArr4[1] ^ jArr4[2];
        long j23 = jArr4[0];
        long j24 = jArr4[3];
        long j25 = (jArr4[4] ^ j23) ^ j19;
        long j26 = j19 ^ (jArr4[5] ^ j24);
        jArr3[0] = j23 ^ (j25 << 57);
        jArr3[1] = (j25 >>> 7) ^ (j26 << 50);
        jArr3[2] = (j26 >>> 14) ^ (j24 << 43);
        jArr3[3] = j24 >>> 21;
    }

    public static void u(long j13, long j14, long[] jArr, int i13) {
        long j15 = j14 << 1;
        long j16 = j15 ^ j14;
        long j17 = j14 << 2;
        long j18 = j16 << 1;
        long[] jArr2 = {0, j14, j15, j16, j17, j17 ^ j14, j18, j18 ^ j14};
        long j19 = jArr2[((int) j13) & 7];
        long j23 = 0;
        int i14 = 48;
        do {
            int i15 = (int) (j13 >>> i14);
            long j24 = (jArr2[i15 & 7] ^ (jArr2[(i15 >>> 3) & 7] << 3)) ^ (jArr2[(i15 >>> 6) & 7] << 6);
            j19 ^= j24 << i14;
            j23 ^= j24 >>> (-i14);
            i14 -= 9;
        } while (i14 > 0);
        jArr[i13] = 144115188075855871L & j19;
        jArr[i13 + 1] = (((((j13 & 72198606942111744L) & ((j14 << 7) >> 63)) >>> 8) ^ j23) << 7) ^ (j19 >>> 57);
    }

    public static void v(long[] jArr, long[] jArr2) {
        p2.e0(0, jArr[0], jArr2);
        p2.e0(2, jArr[1], jArr2);
    }

    public static void w(uv1.q qVar, k2 k2Var) {
        qVar.A0 = k2Var;
    }

    public static void x(wk1.k kVar) {
        kVar.K0 = eb2.i.f58262a;
    }

    public static void y(d91.j jVar) {
        jVar.getClass();
    }

    public static void z(x1 x1Var) {
        x1Var.getClass();
    }
}
