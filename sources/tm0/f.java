package tm0;

import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.x0;
import om0.a0;
import om0.b0;
import om0.b1;
import om0.c0;
import om0.c1;
import om0.d1;
import om0.e1;
import om0.f1;
import om0.p;
import om0.p1;
import om0.q;
import om0.q0;
import om0.q1;
import om0.r;
import om0.r1;
import om0.t0;
import om0.t1;
import om0.v0;
import qm0.a2;
import qm0.b2;
import qm0.c2;
import qm0.d2;
import qm0.e2;
import qm0.g2;
import qm0.h2;
import qm0.k2;
import qm0.l2;
import qm0.m2;
import qm0.n2;
import u50.f0;
import u50.g0;
import u50.h0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f118128a = new b1(g0.b(new String[0], y60.e.board_no_saved_content_banner_title), g0.b(new String[0], y60.e.board_no_saved_content_banner_message));

    public static final i0 a(d2 d2Var) {
        if (!z.j(d2Var.f104261d)) {
            String str = d2Var.f104261d;
            return ep.b.x(str, "string", str);
        }
        int i13 = x0.see_all;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs.length);
        for (String str2 : formatArgs) {
            arrayList.add(new f0(str2));
        }
        return new k0(i13, arrayList);
    }

    public static final e1 b(k2 k2Var, b0 metadataCreator) {
        Object obj;
        e1 c1Var;
        i0 i0Var;
        Iterator it;
        f1 c0Var;
        h2 h2Var;
        i0 k0Var;
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(metadataCreator, "metadataCreator");
        if (k2Var instanceof b2) {
            return f118128a;
        }
        int i13 = 1;
        int i14 = 0;
        if (!(k2Var instanceof e2)) {
            if (!(k2Var instanceof d2)) {
                throw new NoWhenBranchMatchedException();
            }
            d2 d2Var = (d2) k2Var;
            Iterator it2 = d2Var.f104260c.iterator();
            do {
                if (it2.hasNext()) {
                    obj = it2.next();
                    h2Var = (h2) obj;
                    Intrinsics.checkNotNullParameter(h2Var, "<this>");
                    if (!(h2Var instanceof l2) && !(h2Var instanceof n2)) {
                    }
                } else {
                    obj = null;
                }
                boolean z13 = obj == null;
                List list = d2Var.f104260c;
                int size = list.size();
                int i15 = z13 ? 10 : 11;
                List y03 = CollectionsKt.y0(list, i15);
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(y03, 10));
                Iterator it3 = y03.iterator();
                int i16 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    h2 h2Var2 = (h2) next;
                    int i18 = i16 >= i15 + (-1) ? i13 : i14;
                    i0 a13 = a(d2Var);
                    if (h2Var2 instanceof l2) {
                        l2 l2Var = (l2) h2Var2;
                        om0.k0 k0Var2 = new om0.k0(CollectionsKt.y0(l2Var.f104300a, 5));
                        String str = l2Var.f104301b;
                        c0Var = new p1(k0Var2, new q0(ep.b.x(str, "string", str), ((p) metadataCreator).b(l2Var.f104302c)));
                        it = it3;
                    } else if (h2Var2 instanceof n2) {
                        n2 n2Var = (n2) h2Var2;
                        List list2 = n2Var.f104314b;
                        String str2 = (String) (kotlin.collections.f0.i(list2) >= 0 ? list2.get(i14) : "");
                        List list3 = n2Var.f104314b;
                        it = it3;
                        om0.i0 i0Var2 = new om0.i0(str2, (String) (1 <= kotlin.collections.f0.i(list3) ? list3.get(1) : ""));
                        String str3 = n2Var.f104315c;
                        c0Var = new t1(i0Var2, new q0(ep.b.x(str3, "string", str3), ((p) metadataCreator).b(n2Var.f104316d)), i18 != 0 ? new q1(a13) : r1.f96581a, n2Var.f104313a);
                    } else {
                        it = it3;
                        if (!(h2Var2 instanceof g2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0Var = new c0(i16, ((g2) h2Var2).f104275a);
                    }
                    arrayList.add(c0Var);
                    it3 = it;
                    i16 = i17;
                    i13 = 1;
                    i14 = 0;
                }
                if (z13 && size > i15) {
                    arrayList = CollectionsKt.m0(new a0(a(d2Var)), arrayList);
                }
                t0 t0Var = new t0(arrayList);
                if (z13) {
                    String str4 = d2Var.f104259b;
                    i0Var = ep.b.x(str4, "string", str4);
                } else {
                    i0Var = h0.f120562a;
                }
                c1Var = new c1(t0Var, i0Var);
            } while (h2Var instanceof g2);
            throw new NoWhenBranchMatchedException();
        }
        e2 e2Var = (e2) k2Var;
        List list4 = e2Var.f104267c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list4) {
            if (obj2 instanceof g2) {
                arrayList2.add(obj2);
            }
        }
        List y04 = CollectionsKt.y0(arrayList2, 6);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(y04, 10));
        int i19 = 0;
        for (Object obj3 : y04) {
            int i23 = i19 + 1;
            if (i19 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            arrayList3.add(new c0(i19, ((g2) obj3).f104275a));
            i19 = i23;
        }
        v0 v0Var = new v0(arrayList3);
        String str5 = e2Var.f104266b;
        f0 x13 = ep.b.x(str5, "string", str5);
        String str6 = e2Var.f104268d;
        if (!z.j(str6)) {
            k0Var = ep.b.x(str6, "string", str6);
        } else {
            int i24 = x0.see_all;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            k0Var = new k0(i24, new ArrayList(0));
        }
        c1Var = new d1(v0Var, x13, k0Var);
        return c1Var;
    }

    public static final rm0.a c(qm0.a aVar, b0 metadataCreator) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(metadataCreator, "metadataCreator");
        if (aVar instanceof a2) {
            return rm0.a.f108681c;
        }
        if (!(aVar instanceof c2)) {
            throw new NoWhenBranchMatchedException();
        }
        c2 c2Var = (c2) aVar;
        String string = c2Var.f104253a.j1();
        Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
        Intrinsics.checkNotNullParameter(string, "string");
        f0 f0Var = new f0(string);
        v7 v7Var = c2Var.f104253a;
        om0.i iVar = kh2.d.M0(v7Var) ? q.f96566a : kh2.d.A0(v7Var) ? q.f96567b : om0.h.f96502a;
        Integer l13 = v7Var.l1();
        Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
        int intValue = l13.intValue();
        Integer q13 = v7Var.q1();
        Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
        return new rm0.a(f0Var, new r(iVar, c2Var.f104254b, b0.a(metadataCreator, intValue, q13.intValue())));
    }

    public static final rm0.d d(m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        return new rm0.d(m2Var.f104308a, 2);
    }
}
