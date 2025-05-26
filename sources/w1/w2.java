package w1;

import c2.j4;
import c2.o4;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w2 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127554a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f127555b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f127556c;

    public /* synthetic */ w2(int i13, Object obj, Object obj2) {
        this.f127554a = i13;
        this.f127555b = obj;
        this.f127556c = obj2;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.q0 s03;
        List list2;
        Pair pair;
        int max;
        int i13;
        int i14;
        q3.q0 s04;
        q3.q0 s05;
        int i15 = this.f127554a;
        Object obj = this.f127556c;
        Object obj2 = this.f127555b;
        boolean z13 = true;
        switch (i15) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    Object obj3 = list.get(i16);
                    if (!(((q3.o0) obj3).a() instanceof y2)) {
                        arrayList.add(obj3);
                    }
                }
                List list3 = (List) ((Function0) obj).invoke();
                ArrayList arrayList2 = null;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        a3.d dVar = (a3.d) list3.get(i17);
                        if (dVar != null) {
                            list2 = list3;
                            pair = new Pair(((q3.o0) arrayList.get(i17)).Q(bs1.c.b((int) Math.floor(dVar.d()), (int) Math.floor(dVar.c()), 5)), new n4.h(d7.b.a(Math.round(dVar.f484a), Math.round(dVar.f485b))));
                        } else {
                            list2 = list3;
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList3.add(pair);
                        }
                        i17++;
                        list3 = list2;
                    }
                    arrayList2 = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    Object obj4 = list.get(i18);
                    if (((q3.o0) obj4).a() instanceof y2) {
                        arrayList4.add(obj4);
                    }
                }
                s03 = r0Var.s0(n4.a.h(j13), n4.a.g(j13), kotlin.collections.z0.d(), new j1.x0(15, arrayList2, g1.l(arrayList4, (Function0) obj2)));
                return s03;
            case 1:
                String str = (String) obj2;
                int size4 = list.size();
                for (int i19 = 0; i19 < size4; i19++) {
                    q3.o0 o0Var = (q3.o0) list.get(i19);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(o0Var), str)) {
                        q3.c1 Q = o0Var.Q(j13);
                        int h10 = (n4.a.h(j13) - Q.f102178a) - r0Var.R(o4.f25045d);
                        int j14 = n4.a.j(j13);
                        if (h10 < j14) {
                            h10 = j14;
                        }
                        String str2 = (String) obj;
                        int size5 = list.size();
                        for (int i23 = 0; i23 < size5; i23++) {
                            q3.o0 o0Var2 = (q3.o0) list.get(i23);
                            if (Intrinsics.d(androidx.compose.ui.layout.a.a(o0Var2), str2)) {
                                q3.c1 Q2 = o0Var2.Q(n4.a.a(j13, 0, h10, 0, 0, 9));
                                q3.q qVar = q3.d.f102183a;
                                int i24 = Q2.i(qVar);
                                int i25 = Q2.i(q3.d.f102184b);
                                boolean z14 = (i24 == Integer.MIN_VALUE || i25 == Integer.MIN_VALUE) ? false : true;
                                if (i24 != i25 && z14) {
                                    z13 = false;
                                }
                                int h13 = n4.a.h(j13) - Q.f102178a;
                                if (z13) {
                                    max = Math.max(r0Var.R(o4.f25046e), Q.f102179b);
                                    int i26 = (max - Q2.f102179b) / 2;
                                    int i27 = Q.i(qVar);
                                    i14 = i27 != Integer.MIN_VALUE ? (i24 + i26) - i27 : 0;
                                    i13 = i26;
                                } else {
                                    int R = r0Var.R(o4.f25042a) - i24;
                                    max = Math.max(r0Var.R(o4.f25047f), Q2.f102179b + R);
                                    i13 = R;
                                    i14 = (max - Q.f102179b) / 2;
                                }
                                s04 = r0Var.s0(n4.a.h(j13), max, kotlin.collections.z0.d(), new j4(Q2, i13, Q, h13, i14));
                                return s04;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                ((q4.w) obj2).f102375o = (n4.k) obj;
                s05 = r0Var.s0(0, 0, kotlin.collections.z0.d(), q4.c.f102312l);
                return s05;
        }
    }
}
