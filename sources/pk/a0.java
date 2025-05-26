package pk;

import a.cb;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.sr;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.z3;

/* loaded from: classes.dex */
public abstract class a0 {
    public static void A(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean A0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return receiver instanceof dn2.o;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static void B(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(a.a.i("null key in entry: null=", obj2));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static boolean B0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return receiver instanceof pn2.a0;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static void C(int i13, String str) {
        if (i13 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i13);
    }

    public static boolean C0(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.h0) {
            return ((pn2.h0) receiver).x0();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void D(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        if (fragmentActivity.getWindow() != null) {
            fragmentActivity.getWindow().setStatusBarColor(dl2.b.x0(fragmentActivity, eo1.a.color_black_cosmicore_900));
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            f1(window);
        }
    }

    public static boolean D0(CharSequence charSequence) {
        return !x0(charSequence);
    }

    public static boolean E(String str, String str2) {
        return str != null && str.toString().indexOf(str2.toString(), 0) >= 0;
    }

    public static boolean E0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return xl2.l.J((pn2.b1) receiver, xl2.q.f135294b);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static boolean F(CharSequence charSequence, String str) {
        if (charSequence != null && str != null) {
            int length = str.length();
            int length2 = charSequence.length() - length;
            for (int i13 = 0; i13 <= length2; i13++) {
                if (a1(i13, length, charSequence, str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean F0(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return pn2.t1.g((pn2.b0) receiver);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.a1 G(boolean z13, boolean z14, qn2.p pVar, qn2.g gVar, qn2.h hVar, int i13) {
        if ((i13 & 2) != 0) {
            z14 = true;
        }
        boolean z15 = z14;
        if ((i13 & 4) != 0) {
            pVar = qn2.p.f104516a;
        }
        qn2.p typeSystemContext = pVar;
        if ((i13 & 8) != 0) {
            gVar = qn2.e.f104497a;
        }
        qn2.g kotlinTypePreparator = gVar;
        if ((i13 & 16) != 0) {
            hVar = qn2.h.f104498a;
        }
        qn2.h kotlinTypeRefiner = hVar;
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new pn2.a1(z13, z15, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static final boolean G0(Context context, String permissionId) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissionId, "permissionId");
        return d5.a.a(context, permissionId) == 0;
    }

    public static pn2.v1 H(qn2.b bVar, sn2.g lowerBound, sn2.g upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        if (!(lowerBound instanceof pn2.h0)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(bVar);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, bVar.getClass(), sb3).toString());
        }
        if (upperBound instanceof pn2.h0) {
            return pn2.g.i((pn2.h0) lowerBound, (pn2.h0) upperBound);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(bVar);
        sb4.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, bVar.getClass(), sb4).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean H0(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return xl2.l.H((pn2.b0) receiver);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final String I(pn2.b1 b1Var) {
        StringBuilder sb3 = new StringBuilder();
        J("type: " + b1Var, sb3);
        J("hashCode: " + b1Var.hashCode(), sb3);
        J("javaClass: " + b1Var.getClass().getCanonicalName(), sb3);
        for (am2.m b13 = b1Var.b(); b13 != null; b13 = b13.g()) {
            J("fqName: " + an2.y.f15818c.z(b13), sb3);
            J("javaClass: " + b13.getClass().getCanonicalName(), sb3);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static boolean I0(sn2.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof qn2.k) {
            return ((qn2.k) receiver).f104505g;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void J(String str, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb3.append(str);
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
    }

    public static boolean J0(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return receiver instanceof pn2.g0;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final int K(int i13, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) TypedValue.applyDimension(1, i13, resources.getDisplayMetrics());
    }

    public static boolean K0(pn2.g1 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.g1) {
            return receiver.b();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final int L(Resources resources, float f13) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (int) TypedValue.applyDimension(1, f13, resources.getDisplayMetrics());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L0(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (!(receiver instanceof pn2.h0)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(receiver);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
        }
        pn2.b0 b0Var = (pn2.b0) receiver;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        if (b0Var instanceof pn2.r) {
            pn2.h0 h0Var = ((pn2.r) b0Var).f100836b;
        }
    }

    public static final Object M(Context context, Class clazz) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return lb.l0.k0(context.getApplicationContext(), clazz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M0(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (!(receiver instanceof pn2.h0)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(receiver);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
        }
        pn2.b0 b0Var = (pn2.b0) receiver;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        if (b0Var instanceof pn2.r) {
            pn2.h0 h0Var = ((pn2.r) b0Var).f100836b;
        }
    }

    public static boolean N(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? charSequence.equals(charSequence2) : a1(0, charSequence.length(), charSequence, charSequence2, false);
    }

    public static boolean N0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            am2.j b13 = ((pn2.b1) receiver).b();
            return b13 != null && xl2.l.K(b13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static boolean O(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return charSequence == str;
        }
        if (charSequence == str) {
            return true;
        }
        if (charSequence.length() != str.length()) {
            return false;
        }
        return a1(0, charSequence.length(), charSequence, str, true);
    }

    public static pn2.h0 O0(sn2.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.v) {
            return ((pn2.v) receiver).f100850b;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.g1 P(sn2.f receiver, int i13) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return (pn2.g1) ((pn2.b0) receiver).u0().get(i13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.v1 P0(sn2.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof qn2.k) {
            return ((qn2.k) receiver).f104502d;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static List Q(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return ((pn2.b0) receiver).u0();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.v1 Q0(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.v1) {
            return lb.l0.K0((pn2.v1) receiver, false);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final String R(GestaltText gestaltText) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        u50.i0 i0Var = gestaltText.l().f108849g;
        Context context = gestaltText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return i0Var.a(context).toString();
    }

    public static final ArrayList S(cc carouselData, String pinId, boolean z13, boolean z14) {
        sr e13;
        int i13;
        int i14;
        List list;
        Collection values;
        Intrinsics.checkNotNullParameter(carouselData, "carouselData");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        ArrayList arrayList = new ArrayList();
        List d2 = carouselData.d();
        if (d2 == null) {
            return arrayList;
        }
        int size = d2.size();
        int i15 = 0;
        while (i15 < size) {
            l30 l30Var = (l30) d2.get(i15);
            Intrinsics.f(l30Var);
            if (z13) {
                Intrinsics.checkNotNullParameter(l30Var, "<this>");
                Map s13 = l30Var.s();
                e13 = s13 != null ? (sr) s13.get("750x") : null;
            } else {
                e13 = dl2.b.e1(l30Var);
            }
            if (e13 == null) {
                Map s14 = l30Var.s();
                e13 = (s14 == null || (values = s14.values()) == null) ? null : (sr) CollectionsKt.T(values);
            }
            if (e13 != null) {
                String n13 = l30Var.n();
                String u13 = (n13 == null || n13.length() <= 0) ? l30Var.u() : l30Var.n();
                String r13 = l30Var.r();
                int doubleValue = (int) e13.k().doubleValue();
                int doubleValue2 = (int) e13.h().doubleValue();
                String j13 = e13.j();
                Intrinsics.f(j13);
                String str = r13 == null ? "" : r13;
                String q13 = l30Var.q();
                String x13 = l30Var.x();
                String p13 = l30Var.p();
                String y13 = l30Var.y();
                Intrinsics.f(y13);
                Long valueOf = Long.valueOf(Long.parseLong(y13));
                String f13 = carouselData.f();
                Long valueOf2 = Long.valueOf(f13 != null ? Long.parseLong(f13) : 0L);
                String t13 = l30Var.t();
                i13 = i15;
                i14 = size;
                list = d2;
                arrayList.add(new m21.b(doubleValue, doubleValue2, j13, null, str, u13, q13, x13, p13, pinId, valueOf, valueOf2, z14, false, null, false, false, t13 != null ? StringsKt.h0(t13) : null, null, null, false, 3923968));
            } else {
                i13 = i15;
                i14 = size;
                list = d2;
            }
            i15 = i13 + 1;
            size = i14;
            d2 = list;
        }
        return arrayList;
    }

    public static final ArrayList T(cc carouselData, String pinId, boolean z13, boolean z14, bc2.l lVar, boolean z15) {
        sr e13;
        String str;
        l30 l30Var;
        int i13;
        int i14;
        List list;
        ArrayList arrayList;
        Boolean bool;
        Collection values;
        bc2.l videoPinType = lVar;
        Intrinsics.checkNotNullParameter(carouselData, "carouselData");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        String str2 = "videoPinType";
        Intrinsics.checkNotNullParameter(videoPinType, "videoPinType");
        ArrayList arrayList2 = new ArrayList();
        List d2 = carouselData.d();
        if (d2 == null) {
            return arrayList2;
        }
        int size = d2.size();
        int i15 = 0;
        while (i15 < size) {
            l30 l30Var2 = (l30) d2.get(i15);
            b01 z16 = l30Var2.z();
            if (z13) {
                Intrinsics.checkNotNullParameter(l30Var2, "<this>");
                Map s13 = l30Var2.s();
                e13 = s13 != null ? (sr) s13.get("750x") : null;
            } else {
                e13 = dl2.b.e1(l30Var2);
            }
            if (e13 == null) {
                Map s14 = l30Var2.s();
                e13 = (s14 == null || (values = s14.values()) == null) ? null : (sr) CollectionsKt.T(values);
            }
            sr srVar = e13;
            String n13 = l30Var2.n();
            String u13 = (n13 == null || n13.length() <= 0) ? l30Var2.u() : l30Var2.n();
            String r13 = l30Var2.r();
            Map videoList = z16 != null ? z16.g() : null;
            h01 W = z16 != null ? d7.b.W(z16) : null;
            if (videoList == null || W == null) {
                str = str2;
                l30Var = l30Var2;
                i13 = i15;
                i14 = size;
                list = d2;
                arrayList = arrayList2;
                bool = null;
            } else {
                int doubleValue = (int) W.t().doubleValue();
                int doubleValue2 = (int) W.n().doubleValue();
                String s15 = W.s();
                String str3 = s15 == null ? "" : s15;
                Integer valueOf = Integer.valueOf(i15);
                Intrinsics.checkNotNullParameter(videoList, "videoList");
                Intrinsics.checkNotNullParameter(videoPinType, str2);
                bc2.q q03 = videoList.isEmpty() ? null : dl2.b.q0(videoList, valueOf, videoPinType);
                String str4 = r13 == null ? "" : r13;
                String q13 = l30Var2.q();
                String x13 = l30Var2.x();
                String p13 = l30Var2.p();
                String y13 = l30Var2.y();
                Long h03 = y13 != null ? StringsKt.h0(y13) : null;
                String f13 = carouselData.f();
                Long h04 = f13 != null ? StringsKt.h0(f13) : null;
                String t13 = l30Var2.t();
                l30Var = l30Var2;
                i13 = i15;
                i14 = size;
                list = d2;
                str = str2;
                arrayList = arrayList2;
                bool = Boolean.valueOf(arrayList.add(new m21.b(doubleValue, doubleValue2, str3, q03, str4, u13, q13, x13, p13, pinId, h03, h04, z14, false, null, z15, false, t13 != null ? StringsKt.h0(t13) : null, null, null, z15, 1761280)));
            }
            if (bool == null && srVar != null) {
                int doubleValue3 = (int) srVar.k().doubleValue();
                int doubleValue4 = (int) srVar.h().doubleValue();
                String j13 = srVar.j();
                Intrinsics.f(j13);
                String str5 = r13 == null ? "" : r13;
                String q14 = l30Var.q();
                String x14 = l30Var.x();
                String p14 = l30Var.p();
                String y14 = l30Var.y();
                Intrinsics.f(y14);
                Long valueOf2 = Long.valueOf(Long.parseLong(y14));
                String f14 = carouselData.f();
                Long valueOf3 = Long.valueOf(f14 != null ? Long.parseLong(f14) : 0L);
                String t14 = l30Var.t();
                arrayList.add(new m21.b(doubleValue3, doubleValue4, j13, null, str5, u13, q14, x14, p14, pinId, valueOf2, valueOf3, z14, false, null, false, false, t14 != null ? StringsKt.h0(t14) : null, null, null, false, 3923968));
            }
            i15 = i13 + 1;
            videoPinType = lVar;
            arrayList2 = arrayList;
            size = i14;
            d2 = list;
            str2 = str;
        }
        return arrayList2;
    }

    public static pn2.h0 T0(sn2.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.r) {
            return ((pn2.r) receiver).f100836b;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final ArrayList U(f30 rootPin, List subpagePins, boolean z13, es.h adsCommonDisplay) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(rootPin, "rootPin");
        Intrinsics.checkNotNullParameter(subpagePins, "subpagePins");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        ArrayList arrayList = new ArrayList();
        String y03 = bs1.c.y0(rootPin);
        if (y03 != null) {
            String u33 = rootPin.u3();
            String s53 = (u33 == null || u33.length() <= 0) ? rootPin.s5() : rootPin.u3();
            int z03 = bs1.c.z0(rootPin);
            int x03 = bs1.c.x0(rootPin);
            bc2.q S0 = dl2.b.S0(rootPin, null);
            String z43 = rootPin.z4();
            String str4 = z43 == null ? "" : z43;
            String h43 = rootPin.h4();
            String z63 = rootPin.z6();
            String uid = rootPin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            Boolean p63 = rootPin.p6();
            Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
            str = "getUid(...)";
            str2 = "getShouldMute(...)";
            arrayList.add(new m21.b(z03, x03, y03, S0, str4, s53, h43, z63, null, uid, 0L, 0L, z13, false, null, p63.booleanValue(), true, null, Boolean.valueOf(((es.v) adsCommonDisplay).M(rootPin)), null, false, 3465216));
        } else {
            str = "getUid(...)";
            str2 = "getShouldMute(...)";
        }
        int size = subpagePins.size();
        int i13 = 0;
        while (i13 < size) {
            f30 f30Var = (f30) subpagePins.get(i13);
            String y04 = bs1.c.y0(f30Var);
            if (y04 != null) {
                String u34 = f30Var.u3();
                String s54 = (u34 == null || u34.length() <= 0) ? f30Var.s5() : f30Var.u3();
                String z44 = f30Var.z4();
                int z04 = bs1.c.z0(f30Var);
                int x04 = bs1.c.x0(f30Var);
                String str5 = z44 == null ? "" : z44;
                String h44 = f30Var.h4();
                String z64 = f30Var.z6();
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, str);
                String uid3 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, str);
                Long valueOf = Long.valueOf(Long.parseLong(uid3));
                String uid4 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, str);
                Long valueOf2 = Long.valueOf(Long.parseLong(uid4));
                Boolean p64 = f30Var.p6();
                str3 = str2;
                Intrinsics.checkNotNullExpressionValue(p64, str3);
                arrayList.add(new m21.b(z04, x04, y04, null, str5, s54, h44, z64, null, uid2, valueOf, valueOf2, z13, false, null, p64.booleanValue(), false, null, null, null, false, 4120576));
            } else {
                str3 = str2;
            }
            i13++;
            str2 = str3;
        }
        return arrayList;
    }

    public static int U0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return ((pn2.b1) receiver).getParameters().size();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static ym2.e V(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            am2.j b13 = ((pn2.b1) receiver).b();
            Intrinsics.g(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return fn2.d.h((am2.g) b13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final u50.b V0(u50.n nVar, u50.n other) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new u50.b(nVar, other);
    }

    public static final List W(f30 pin, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        cc J3 = pin.J3();
        if (J3 == null) {
            return kotlin.collections.q0.f80391a;
        }
        if (z14) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            Boolean d53 = pin.d5();
            Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
            return T(J3, uid, z13, d53.booleanValue(), df.j1.z0(pin), true);
        }
        String uid2 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        Boolean d54 = pin.d5();
        Intrinsics.checkNotNullExpressionValue(d54, "getIsPromoted(...)");
        return S(J3, uid2, z13, d54.booleanValue());
    }

    public static Collection W0(qn2.b bVar, sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        pn2.b1 f13 = bVar.f(receiver);
        if (f13 instanceof dn2.o) {
            return ((dn2.o) f13).f55632c;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.g1 X0(cn2.b receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof qn2.l) {
            return ((qn2.l) receiver).f104506a;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static sn2.j Y(sn2.i receiver, int i13) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            Object obj = ((pn2.b1) receiver).getParameters().get(i13);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (sn2.j) obj;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final tb0.h Y0() {
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
        return hVar;
    }

    public static List Z(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            List parameters = ((pn2.b1) receiver).getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            return parameters;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final m60.w Z0() {
        m60.w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        return wVar;
    }

    public static final vn1.g a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? vn1.g.UI_300 : vn1.g.UI_400;
    }

    public static xl2.o a0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            am2.j b13 = ((pn2.b1) receiver).b();
            Intrinsics.g(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return xl2.l.s((am2.g) b13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static boolean a1(int i13, int i14, CharSequence charSequence, CharSequence charSequence2, boolean z13) {
        int i15 = 0;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z13, i13, (String) charSequence2, 0, i14);
        }
        while (true) {
            int i16 = i14 - 1;
            if (i14 <= 0) {
                return true;
            }
            int i17 = i13 + 1;
            char charAt = charSequence.charAt(i13);
            int i18 = i15 + 1;
            char charAt2 = charSequence2.charAt(i15);
            if (charAt != charAt2) {
                if (!z13) {
                    return false;
                }
                if (Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            i13 = i17;
            i14 = i16;
            i15 = i18;
        }
    }

    public static void b(x92.b bVar) {
        com.bumptech.glide.d.e(bVar);
        bVar.e("board.id");
        bVar.e("board.url");
        bVar.e("board.name");
        bVar.e("board.category");
        n60.o.w(bVar, "board.created_at", "board.collaborator_invites_enabled", "board.collaborated_by_me", "board.collaborating_users()");
        n60.o.w(bVar, "board.is_collaborative", "board.action", "board.privacy", "board.section_count");
        n60.o.w(bVar, "board.type", "board.owner()", "board.is_ads_only", "board.layout");
        n60.o.v(bVar, "board.image_cover_url", "board.has_custom_cover", "board.should_show_board_collaborators");
        lh0.g2 d2 = lh0.g2.f83370b.d();
        z3 activate = z3.ACTIVATE_EXPERIMENT;
        Intrinsics.checkNotNullParameter(activate, "activate");
        lh0.z0 z0Var = d2.f83373a;
        if (((lh0.g1) z0Var).g("android_curation_tracking_params_addition", activate) != null) {
            lh0.g1 g1Var = (lh0.g1) z0Var;
            if (!g1Var.o("android_curation_tracking_params_addition", "enabled", a4.f83297a) && !g1Var.l("android_curation_tracking_params_addition")) {
                return;
            }
        }
        bVar.e("board.tracking_params");
    }

    public static xl2.o b0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            am2.j b13 = ((pn2.b1) receiver).b();
            Intrinsics.g(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return xl2.l.u((am2.g) b13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static String b1(String str, String str2, String str3) {
        if (x0(str) || x0(str2)) {
            return str;
        }
        int i13 = 0;
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length2 * 16));
        int i14 = -1;
        while (indexOf != -1) {
            sb3.append(str.substring(i13, indexOf));
            sb3.append(str3);
            i13 = indexOf + length;
            i14--;
            if (i14 == 0) {
                break;
            }
            indexOf = str.indexOf(str2, i13);
        }
        sb3.append(str.substring(i13));
        return sb3.toString();
    }

    public static void c(x92.b bVar) {
        lh0.g2 d2 = lh0.g2.f83370b.d();
        bVar.e("pin.id");
        bVar.e("pin.type");
        bVar.e("pin.cacheable_id");
        bVar.e("pin.description");
        bVar.e("pin.link");
        bVar.h("pin.images", "236x");
        n60.o.w(bVar, "pin.created_at", "pin.comment_count", "pin.via_pinner", "pin.shopping_flags");
        n60.o.w(bVar, "pin.grid_title", "pin.category", "pin.story_pin_data_id", "aggregatedpindata.is_stela");
        n60.o.v(bVar, "aggregatedpindata.pin_tags", "pin.top_interest", "pin.is_eligible_for_related_products");
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        Intrinsics.checkNotNullParameter(activate, "activate");
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.g("android_search_hybrid_v2", activate) != null) {
            if (d2.f("control_pwt", activate) || d2.f("enabled_pwt", activate)) {
                g1Var.c("android_search_hybrid_v2");
            }
            if (!d2.f("control_pwt", activate)) {
                bVar.e("pin.is_eligible_for_hybrid_search");
            }
        }
        bVar.e("pin.image_signature");
        sh.f.f112910e.getClass();
        HashSet d13 = as1.b.a().d();
        Intrinsics.checkNotNullExpressionValue(d13, "getDynamicImageApiFieldsSet(...)");
        Iterator it = d13.iterator();
        while (it.hasNext()) {
            bVar.h("pin.images", (String) it.next());
        }
        n60.o.w(bVar, "pin.is_eligible_for_pdp", "pin.is_unsafe_for_comments", "pin.has_variants", "pin.sponsorship");
        n60.o.w(bVar, "pin.is_oos_product", "pin.is_stale_product", "pin.alt_text", "pin.auto_alt_text");
        n60.o.w(bVar, "aggregatedpindata.slideshow_collections_aspect_ratio", "pin.ip_eligible_for_stela", "pin.shopping_mdl_browser_type", "pin.attribution_source_id");
        bVar.e("pin.advertiser_id");
        bVar.e("pin.campaign_id_reformatted");
        z3 activate2 = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        Intrinsics.checkNotNullParameter(activate2, "activate");
        if (g1Var.g("hfp_gen_ai_topics_opt_out_android", activate2) != null) {
            boolean a13 = d2.a("control_pwt", activate2);
            boolean a14 = d2.a("enabled_pwt", activate2);
            if (a13 || a14) {
                g1Var.c("hfp_gen_ai_topics_opt_out_android");
            }
            if (!d2.a("control_pwt", activate2)) {
                bVar.e("pin.gen_ai_topics");
            }
        }
    }

    public static pn2.b0 c0(sn2.j receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof am2.c1) {
            return kotlin.jvm.internal.j.q((am2.c1) receiver);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void c1(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        if (fragmentActivity.getWindow() != null) {
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            Configuration configuration = fragmentActivity.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
            Intrinsics.checkNotNullParameter(window, "<this>");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            int i13 = configuration.uiMode & 48;
            if (i13 == 16) {
                Intrinsics.checkNotNullParameter(window, "<this>");
                g1(window, false);
                h1.b bVar = new h1.b(window.getDecorView());
                int i14 = Build.VERSION.SDK_INT;
                (i14 >= 35 ? new q5.f2(window, bVar) : i14 >= 30 ? new q5.e2(window, bVar) : new q5.d2(window, bVar)).i(true);
                return;
            }
            if (i13 != 32) {
                return;
            }
            Intrinsics.checkNotNullParameter(window, "<this>");
            g1(window, false);
            h1.b bVar2 = new h1.b(window.getDecorView());
            int i15 = Build.VERSION.SDK_INT;
            (i15 >= 35 ? new q5.f2(window, bVar2) : i15 >= 30 ? new q5.e2(window, bVar2) : new q5.d2(window, bVar2)).i(false);
        }
    }

    public static boolean d(sn2.i c13, sn2.i c23) {
        Intrinsics.checkNotNullParameter(c13, "c1");
        Intrinsics.checkNotNullParameter(c23, "c2");
        if (!(c13 instanceof pn2.b1)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(c13);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, c13.getClass(), sb3).toString());
        }
        if (c23 instanceof pn2.b1) {
            return Intrinsics.d(c13, c23);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(c23);
        sb4.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, c23.getClass(), sb4).toString());
    }

    public static pn2.v1 d0(pn2.g1 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.g1) {
            return receiver.getType().z0();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void d1(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        if (fragmentActivity.getWindow() != null) {
            fragmentActivity.getWindow().setStatusBarColor(dl2.b.x0(fragmentActivity, eo1.a.sema_color_background_default));
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            Configuration configuration = fragmentActivity.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
            j1(window, configuration);
        }
    }

    public static int e(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return ((pn2.b0) receiver).u0().size();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static am2.c1 e0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            am2.j b13 = ((pn2.b1) receiver).b();
            if (b13 instanceof am2.c1) {
                return (am2.c1) b13;
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0110 A[PHI: r0
      0x0110: PHI (r0v20 java.lang.Object) = (r0v12 java.lang.Object), (r0v1 java.lang.Object) binds: [B:22:0x010d, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ec -> B:17:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e1(long r18, int r20, float r21, boolean r22, kotlin.jvm.functions.Function1 r23, yw.e r24, bl2.c r25) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.a0.e1(long, int, float, boolean, kotlin.jvm.functions.Function1, yw.e, bl2.c):java.lang.Object");
    }

    public static sn2.h f(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.h0) {
            return (sn2.h) receiver;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.h0 f0(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return bn2.i.h((pn2.b0) receiver);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void f1(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        new q5.g2(window, window.getDecorView()).a(false);
    }

    public static sn2.c g(qn2.b bVar, sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.h0) {
            if (receiver instanceof pn2.k0) {
                return bVar.a(((pn2.k0) receiver).f100810b);
            }
            if (receiver instanceof qn2.k) {
                return (qn2.k) receiver;
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static List g0(sn2.j receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof am2.c1) {
            List upperBounds = ((am2.c1) receiver).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            return upperBounds;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void g1(Window window, boolean z13) {
        int x03;
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (hf0.b.q() || z13) {
            Context context = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            x03 = dl2.b.x0(context, eo1.a.sema_color_background_default);
        } else {
            Context context2 = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            x03 = dl2.b.x0(context2, eo1.a.sema_color_background_elevation);
        }
        window.setNavigationBarColor(x03);
    }

    public static pn2.r h(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.h0) {
            if (receiver instanceof pn2.r) {
                return (pn2.r) receiver;
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static sn2.m h0(pn2.g1 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.g1) {
            pn2.w1 c13 = receiver.c();
            Intrinsics.checkNotNullExpressionValue(c13, "getProjectionKind(...)");
            return f0.h.w(c13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void h1(GestaltText gestaltText, int i13) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Context context = gestaltText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int F0 = dl2.b.F0(context, i13);
        if (gestaltText.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(F0);
            marginLayoutParams.setMarginEnd(F0);
            gestaltText.setLayoutParams(marginLayoutParams);
        }
    }

    public static void i(pn2.v receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
    }

    public static sn2.m i0(sn2.j receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof am2.c1) {
            pn2.w1 r13 = ((am2.c1) receiver).r();
            Intrinsics.checkNotNullExpressionValue(r13, "getVariance(...)");
            return f0.h.w(r13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void i1(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        new q5.g2(window, window.getDecorView()).a(true);
    }

    public static pn2.v j(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            pn2.v1 z03 = ((pn2.b0) receiver).z0();
            if (z03 instanceof pn2.v) {
                return (pn2.v) z03;
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final int j0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (m1(pin)) {
            return RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE;
        }
        return 1;
    }

    public static final void j1(Window window, Configuration configuration) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i13 = configuration.uiMode & 48;
        if (i13 == 16) {
            i1(window);
        } else {
            if (i13 != 32) {
                return;
            }
            f1(window);
        }
    }

    public static pn2.h0 k(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            pn2.v1 z03 = ((pn2.b0) receiver).z0();
            if (z03 instanceof pn2.h0) {
                return (pn2.h0) z03;
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final GestaltText k0(GestaltText gestaltText) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        return gestaltText.i(rn1.d.f108871k);
    }

    public static final void k1(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i13;
        view.setLayoutParams(layoutParams);
    }

    public static pn2.i1 l(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return kotlin.jvm.internal.j.c((pn2.b0) receiver);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void l0(GestaltButton gestaltButton) {
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        gestaltButton.d(yl1.f.f139322v);
    }

    public static final boolean l1() {
        if (ff0.j.f62103a) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String upperCase = MANUFACTURER.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int i13 = Build.VERSION.SDK_INT;
        return i13 == 31 || i13 == 32 || (i13 == 33 && kotlin.collections.f0.j("SAMSUNG", "MOTOROLA", "OPPO", "REALME", "ONEPLUS").contains(upperCase));
    }

    public static final void m(GestaltButton gestaltButton, Function1 onClick) {
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        gestaltButton.e(new yl1.j(0, onClick));
    }

    public static boolean m0(sn2.f receiver, ym2.c fqName) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (receiver instanceof pn2.b0) {
            return ((pn2.b0) receiver).getAnnotations().Q(fqName);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final boolean m1(f30 f30Var) {
        return vb0.j.a() && !b40.w0(f30Var);
    }

    public static final void n(GestaltText gestaltText, Function1 onClick) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        gestaltText.j(new yl1.j(4, onClick));
    }

    public static boolean n0(sn2.j receiver, sn2.i iVar) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (!(receiver instanceof am2.c1)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(receiver);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
        }
        if (iVar == null || (iVar instanceof pn2.b1)) {
            return kotlin.jvm.internal.j.u((am2.c1) receiver, (pn2.b1) iVar, 4);
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(receiver);
        sb4.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb4).toString());
    }

    public static final String n1(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return kotlin.text.z.n(kotlin.text.z.n(kotlin.text.z.n(kotlin.text.z.n(kotlin.text.z.n(encode, "+", "%20"), "*", "%2A"), "{", "%7B"), "}", "%7D"), "%7E", "~");
    }

    public static final void o(GestaltText gestaltText, int i13, Object... args) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        gestaltText.i(new k1.v2(gestaltText, i13, args, 3));
    }

    public static final vn1.g o0(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? vn1.g.HEADING_600 : vn1.g.HEADING_700;
    }

    public static final yl1.c o1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? yl1.c.LARGE : yl1.c.SMALL;
    }

    public static final void p(GestaltText gestaltText, String text) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        gestaltText.i(new qz.w(text, 2));
    }

    public static boolean p0(sn2.g a13, sn2.g b13) {
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        if (!(a13 instanceof pn2.h0)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(a13);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, a13.getClass(), sb3).toString());
        }
        if (b13 instanceof pn2.h0) {
            return ((pn2.h0) a13).u0() == ((pn2.h0) b13).u0();
        }
        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb4.append(b13);
        sb4.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, b13.getClass(), sb4).toString());
    }

    public static String p1(String str) {
        if (x0(str)) {
            return str;
        }
        if (str == null) {
            str = null;
        } else {
            int length = str.length();
            if (length != 0) {
                int i13 = 0;
                while (i13 != length && Character.isWhitespace(str.charAt(i13))) {
                    i13++;
                }
                str = str.substring(i13);
            }
        }
        if (str == null) {
            return null;
        }
        int length2 = str.length();
        if (length2 == 0) {
            return str;
        }
        while (length2 != 0 && Character.isWhitespace(str.charAt(length2 - 1))) {
            length2--;
        }
        return str.substring(0, length2);
    }

    public static final void q(GestaltText gestaltText, u50.i0 text) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        gestaltText.i(new ni1.c(1, text));
    }

    public static final boolean q0(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qn2.a q1(qn2.b bVar, sn2.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof pn2.h0) {
            m60.f0 f0Var = pn2.d1.f100781b;
            pn2.b0 kotlinType = (pn2.b0) type;
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return new qn2.a(bVar, f0Var.Z(kotlinType.w0(), kotlinType.u0()).c());
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(type);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, type.getClass(), sb3).toString());
    }

    public static final GestaltText r(GestaltText gestaltText) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        return gestaltText.i(new rq.c2(gestaltText, 21));
    }

    public static boolean r0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return xl2.l.J((pn2.b1) receiver, xl2.q.f135292a);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static Collection r1(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            Collection c13 = ((pn2.b1) receiver).c();
            Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
            return c13;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final vn1.g s(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? vn1.g.HEADING_400 : vn1.g.BODY_200;
    }

    public static boolean s0(CharSequence charSequence) {
        int length;
        if (charSequence == null || (length = charSequence.length()) == 0) {
            return true;
        }
        for (int i13 = 0; i13 < length; i13++) {
            if (!Character.isWhitespace(charSequence.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    public static pn2.b1 s1(sn2.g receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.h0) {
            return ((pn2.h0) receiver).w0();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final vn1.g t(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? vn1.g.UI_200 : vn1.g.BODY_200;
    }

    public static final boolean t0(GestaltButton button, gm1.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(button, "button");
        return (cVar instanceof xl1.a) && cVar.j() == button.h().f139308i;
    }

    public static qn2.l t1(sn2.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof qn2.k) {
            return ((qn2.k) receiver).f104501c;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final vn1.g u(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? vn1.g.HEADING_300 : vn1.g.BODY_300;
    }

    public static boolean u0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return ((pn2.b1) receiver).b() instanceof am2.g;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static pn2.h0 u1(sn2.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.v) {
            return ((pn2.v) receiver).f100851c;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final GestaltText v(GestaltText gestaltText) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        return gestaltText.i(new rq.c2(gestaltText, 23));
    }

    public static boolean v0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (!(receiver instanceof pn2.b1)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(receiver);
            sb3.append(", ");
            throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
        }
        am2.j b13 = ((pn2.b1) receiver).b();
        am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
        if (gVar == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return (gVar.l() != am2.c0.FINAL || gVar.c() == am2.h.ENUM_CLASS || gVar.c() == am2.h.ENUM_ENTRY || gVar.c() == am2.h.ANNOTATION_CLASS) ? false : true;
    }

    public static final GestaltButton v1(GestaltButton gestaltButton) {
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        return gestaltButton.d(yl1.k.f139346k);
    }

    public static final vn1.g w(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.T1(context) ? vn1.g.UI_300 : vn1.g.BODY_300;
    }

    public static boolean w0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            return ((pn2.b1) receiver).d();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static final void w1(GestaltText gestaltText) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        gestaltText.i(rn1.j.f108884k);
    }

    public static final void x(View pinRepView, Drawable drawable, boolean z13, Integer num) {
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (pinRepView.getParent() == null || !(pinRepView.getParent() instanceof View)) {
            return;
        }
        Object parent = pinRepView.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        if (!z13) {
            view.setForeground(null);
        } else {
            view.setForeground(drawable);
            view.setForegroundGravity(num != null ? num.intValue() : view.getForegroundGravity());
        }
    }

    public static boolean x0(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static pn2.h0 x1(sn2.g receiver, boolean z13) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.h0) {
            return ((pn2.h0) receiver).A0(z13);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pn2.h0 y(sn2.g r20, sn2.b r21) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.a0.y(sn2.g, sn2.b):pn2.h0");
    }

    public static boolean y0(sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b0) {
            return ao2.m0.U((pn2.b0) receiver);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static sn2.f y1(qn2.b bVar, sn2.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof sn2.g) {
            return bVar.A((sn2.g) receiver, true);
        }
        if (!(receiver instanceof sn2.e)) {
            throw new IllegalStateException("sealed".toString());
        }
        sn2.e eVar = (sn2.e) receiver;
        return bVar.b(bVar.A(bVar.H(eVar), true), bVar.A(bVar.l0(eVar), true));
    }

    public static sn2.b z(sn2.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof qn2.k) {
            return ((qn2.k) receiver).f104500b;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public static boolean z0(sn2.i receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pn2.b1) {
            am2.j b13 = ((pn2.b1) receiver).b();
            am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
            return (gVar != null ? gVar.J() : null) instanceof am2.y;
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(receiver);
        sb3.append(", ");
        throw new IllegalArgumentException(cb.n(kotlin.jvm.internal.k0.f80436a, receiver.getClass(), sb3).toString());
    }

    public int R0(float f13) {
        ec2.g gVar = (ec2.g) this;
        int i13 = gVar.f58449d;
        int i14 = gVar.f58447b;
        if (i14 > 0) {
            return Math.max(i14, i13);
        }
        if (gVar.f58446a <= 0) {
            return X();
        }
        return (int) ((1.0f / f13) * Math.max(r0, i13));
    }

    public int S0(float f13) {
        ec2.g gVar = (ec2.g) this;
        int i13 = gVar.f58449d;
        int i14 = gVar.f58446a;
        if (i14 > 0) {
            return Math.max(i14, i13);
        }
        return gVar.f58447b > 0 ? (int) (Math.max(r0, i13) * f13) : X();
    }

    public abstract int X();
}
