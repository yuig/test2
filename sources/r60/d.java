package r60;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c2.c0;
import c50.ma;
import ca0.e1;
import ca0.i0;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import com.pinterest.api.model.zy0;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.shuffles.scene.composer.z0;
import com.pinterest.ui.menu.ContextMenuItemView;
import com.pinterest.ui.menu.ContextMenuView;
import eq0.n;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.h0;
import h32.u0;
import h32.w3;
import h32.x3;
import i1.l;
import i92.k;
import java.util.LinkedHashMap;
import java.util.List;
import jc0.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import lh0.o0;
import m60.u;
import m60.w;
import m60.x0;
import n72.m;
import nx.d0;
import pg0.j;
import q1.x;
import q2.i;
import t3.s3;
import u50.r;
import x02.p1;
import x40.j5;
import x40.k5;
import zy.l0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f106310j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f106311k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f106312l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f106313m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f106314n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f106315o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        super(1);
        this.f106309i = i13;
        this.f106310j = obj;
        this.f106311k = obj2;
        this.f106312l = obj3;
        this.f106313m = obj4;
        this.f106314n = obj5;
        this.f106315o = obj6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i13 = 0;
        int i14 = this.f106309i;
        int i15 = 1;
        Object obj2 = this.f106315o;
        Object obj3 = this.f106311k;
        Object obj4 = this.f106312l;
        Object obj5 = this.f106313m;
        Object obj6 = this.f106314n;
        Object obj7 = this.f106310j;
        switch (i14) {
            case 0:
                c cVar = (c) obj;
                if (cVar instanceof b) {
                    int i16 = h.f106328e;
                    Resources resources = ((Context) obj7).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    w wVar = (w) obj3;
                    d0 d0Var = ((s60.c) obj4).f111218a;
                    if (d0Var == null) {
                        d0Var = (d0) obj5;
                    }
                    k kVar = (k) obj6;
                    wy0 wy0Var = (wy0) obj2;
                    boolean z13 = !wy0Var.s2().booleanValue();
                    f1 f1Var = z13 ? f1.USER_BLOCK : f1.USER_UNBLOCK;
                    int i17 = z13 ? x0.block_user_sent : x0.unblock_user_sent;
                    String uid = wy0Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    wVar.d(new j(uid, z13));
                    d0.v(d0Var, f1Var, wy0Var.getUid(), false, 12);
                    String Z2 = wy0Var.Z2();
                    if (Z2 != null) {
                        kVar.o(resources.getString(i17, Z2));
                    }
                    w wVar2 = u.f85943a;
                    wVar2.d(new of0.b());
                    wVar2.d(new q(true));
                } else if (cVar instanceof a) {
                    int i18 = h.f106328e;
                    Resources resources2 = ((Context) obj7).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    ma.a(resources2, (k) obj6, (wy0) obj2, !r6.s2().booleanValue());
                }
                return Unit.f80348a;
            case 1:
                x LazyColumn = (x) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                ca0.d dVar = (ca0.d) obj7;
                c0 c0Var = new c0(dVar, (z0) obj3, (m) obj4, 5);
                Object obj8 = i.f102113a;
                x.a(LazyColumn, null, new q2.h(c0Var, true, -1948634304), 3);
                x.a(LazyColumn, null, e1.f27106a, 3);
                r rVar = (r) obj5;
                x.a(LazyColumn, null, new q2.h(new i0(dVar, rVar, i13), true, -1666650504), 3);
                x.a(LazyColumn, null, new q2.h(new i0(dVar, rVar, i15), true, -1820423559), 3);
                x.a(LazyColumn, null, new q2.h(new i0(dVar, rVar, 2), true, -1974196614), 3);
                x.a(LazyColumn, null, new q2.h(new i0(dVar, rVar, 3), true, -2127969669), 3);
                x.a(LazyColumn, null, new q2.h(new l(dVar, rVar, (s3) obj6, (z2.j) obj2, 5), true, 2013224572), 3);
                return Unit.f80348a;
            case 2:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                d4 d4Var = (d4) obj7;
                if (d4Var != null) {
                    update.f67042a = d4Var;
                }
                a4 a4Var = (a4) obj3;
                if (a4Var != null) {
                    update.f67043b = a4Var;
                }
                u0 u0Var = (u0) obj4;
                if (u0Var != null) {
                    update.f67047f = u0Var;
                }
                g0 g0Var = (g0) obj5;
                if (g0Var != null) {
                    update.f67045d = g0Var;
                }
                String str2 = (String) obj6;
                if (str2 != null) {
                    x3 x3Var = ((l0) obj2).f143086a.f67083c;
                    if (!z.j(str2)) {
                        w3 w3Var = x3Var != null ? new w3(x3Var) : new w3();
                        w3Var.f67367f = str2;
                        update.f67044c = w3Var.a();
                    }
                }
                return Unit.f80348a;
            case 3:
                String str3 = (String) obj7;
                String str4 = (String) obj3;
                eq0.k kVar2 = (eq0.k) obj4;
                k5 k5Var = (k5) ((z40.u) obj);
                j5 j5Var = k5Var.f132664d;
                eq0.c.b(str3, str4, kVar2, j5Var != null ? j5Var.f132591d : null);
                n nVar = (n) obj5;
                j5 j5Var2 = k5Var.f132664d;
                if (j5Var2 != null && (str = j5Var2.f132591d) != null) {
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    nVar.f59921b = str;
                    eq0.c.d(str4, nVar, str3, kVar2, (String) obj6, (oc.c) obj2);
                }
                return Unit.f80348a;
            case 4:
                az0 az0Var = (az0) obj;
                qh1.e eVar = (qh1.e) obj7;
                f30 f30Var = (f30) obj3;
                eVar.f103909j.W(b40.d(f30Var, true));
                String value = (String) obj4;
                Intrinsics.f(az0Var);
                List list = n10.c.f88919a;
                Intrinsics.checkNotNullParameter(az0Var, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                LinkedHashMap linkedHashMap = n10.c.f88920b;
                String uid2 = az0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                linkedHashMap.put(uid2, value);
                Function1 function1 = (Function1) obj2;
                rp0.c cVar2 = new rp0.c(az0Var);
                String g13 = b40.g(f30Var);
                String uid3 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                eVar.f103900a.d(new pg0.f(cVar2, g13, uid3));
                String uid4 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                qh1.e.a(eVar, (d0) obj5, (uk1.d) obj6, uid4);
                if (function1 != null) {
                    function1.invoke(new rp0.c(az0Var));
                }
                return Unit.f80348a;
            case 5:
                z2 z2Var = (z2) obj;
                Intrinsics.f(z2Var);
                rp0.d dVar2 = (rp0.d) obj7;
                n10.a.g(z2Var, dVar2.v());
                n10.a.f(z2Var, dVar2.k());
                if (dVar2 instanceof rp0.b) {
                    x02.u uVar = ((qh1.e) obj3).f103907h;
                    y2 c03 = ((rp0.b) dVar2).f109053a.c0();
                    c03.b(Integer.valueOf(dVar2.o() + 1));
                    z2 a13 = c03.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    uVar.W(a13);
                } else if (dVar2 instanceof rp0.c) {
                    p1 p1Var = ((qh1.e) obj3).f103908i;
                    zy0 V = ((rp0.c) dVar2).f109054a.V();
                    V.b(Integer.valueOf(dVar2.o() + 1));
                    az0 a14 = V.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    p1Var.W(a14);
                }
                qh1.e eVar2 = (qh1.e) obj3;
                eVar2.f103900a.d(new pg0.h(z2Var, dVar2));
                String uid5 = ((f30) obj6).getUid();
                Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                qh1.e.a(eVar2, (d0) obj5, (uk1.d) obj4, uid5);
                Function1 function12 = (Function1) obj2;
                if (function12 != null) {
                    function12.invoke(new rp0.b(z2Var));
                }
                return Unit.f80348a;
            case 6:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ml1.u uVar2 = (ml1.u) obj7;
                Animator animator = uVar2.f87550e;
                uVar2.f87551f = animator != null ? animator.isStarted() : false;
                Animator animator2 = uVar2.f87550e;
                if (animator2 != null) {
                    animator2.end();
                }
                uVar2.f87551f = false;
                Animator b13 = ((ml1.m) obj3).b(uVar2.f87546a, (ViewGroup) obj4, (ml1.r) ((com.google.firebase.messaging.q) obj5).f33803a, uVar2.f87547b, (ScreenDescription) obj6, null);
                b13.addListener((ml1.s) obj2);
                b13.start();
                uVar2.f87550e = b13;
                return Unit.f80348a;
            case 7:
                ((wq1.n) obj7).w3((String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj2);
                return Unit.f80348a;
            default:
                List list2 = (List) obj;
                cb2.x xVar = (cb2.x) obj7;
                f30 f30Var2 = xVar.I;
                if (f30Var2 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                boolean booleanValue = f30Var2.i5().booleanValue();
                o0 experiments = xVar.f27388k;
                if (!booleanValue) {
                    Intrinsics.checkNotNullParameter(experiments, "experiments");
                    if (!experiments.b("enabled_3", lh0.a4.f83298b)) {
                        Context context = ((ContextMenuView) obj3).getContext();
                        SendableObject sendableObject = new SendableObject((f30) obj4);
                        d0 d0Var2 = xVar.f27377J;
                        if (d0Var2 == null) {
                            Intrinsics.r("fragmentPinalytics");
                            throw null;
                        }
                        int value2 = y32.f.PIN_LONGPRESS.value();
                        f30 f30Var3 = xVar.I;
                        if (f30Var3 == null) {
                            Intrinsics.r("pin");
                            throw null;
                        }
                        nl1.d a15 = xVar.a();
                        a4 q03 = a15 != null ? a15.getQ0() : null;
                        LayoutInflater layoutInflater = (LayoutInflater) obj5;
                        Intrinsics.checkNotNullExpressionValue(layoutInflater, "$layoutInflater");
                        Intrinsics.f(context);
                        Intrinsics.f(list2);
                        ContextMenuItemView V2 = ig1.b.V(layoutInflater, context, sendableObject, d0Var2, list2, xVar.f27400w, value2, xVar.f27388k, xVar.f27402y, f30Var3, q03);
                        if (V2 != null) {
                            List list3 = (List) obj2;
                            ((List) ((j0) obj6).f80434a).add(V2);
                            if (!ig1.b.c1(experiments)) {
                                list3.add(V2);
                            }
                            return Unit.f80348a;
                        }
                    }
                }
                if (ig1.b.c1(experiments) && b40.M0((f30) obj4)) {
                    List list4 = (List) ((j0) obj6).f80434a;
                    LayoutInflater layoutInflater2 = (LayoutInflater) obj5;
                    Intrinsics.checkNotNullExpressionValue(layoutInflater2, "$layoutInflater");
                    list4.add(xVar.f(layoutInflater2));
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rp0.d dVar, qh1.e eVar, d0 d0Var, uk1.d dVar2, f30 f30Var, Function1 function1) {
        super(1);
        this.f106309i = 5;
        this.f106310j = dVar;
        this.f106311k = eVar;
        this.f106313m = d0Var;
        this.f106312l = dVar2;
        this.f106314n = f30Var;
        this.f106315o = function1;
    }
}
