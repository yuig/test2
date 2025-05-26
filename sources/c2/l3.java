package c2;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l3 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f24922a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24923b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24924c;

    /* renamed from: d, reason: collision with root package name */
    public final p1.x0 f24925d;

    public l3(Function1 function1, boolean z13, float f13, p1.x0 x0Var) {
        this.f24922a = function1;
        this.f24923b = z13;
        this.f24924c = f13;
        this.f24925d = x0Var;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        q3.q0 s03;
        p1.x0 x0Var = this.f24925d;
        int R = r0Var.R(x0Var.a());
        long a13 = n4.a.a(j13, 0, 0, 0, 0, 10);
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a((q3.o0) obj), "Leading")) {
                break;
            }
            i13++;
        }
        q3.o0 o0Var = (q3.o0) obj;
        q3.c1 Q = o0Var != null ? o0Var.Q(a13) : null;
        int e13 = q5.e(Q);
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a((q3.o0) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        q3.o0 o0Var2 = (q3.o0) obj2;
        q3.c1 Q2 = o0Var2 != null ? o0Var2.Q(bs1.c.w1(-e13, 0, a13)) : null;
        int e14 = q5.e(Q2) + e13;
        int R2 = r0Var.R(x0Var.b(r0Var.getLayoutDirection())) + r0Var.R(x0Var.c(r0Var.getLayoutDirection()));
        int i15 = -e14;
        int i16 = -R;
        long w13 = bs1.c.w1(tb.f.V(i15 - R2, this.f24924c, -R2), i16, a13);
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i17);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a((q3.o0) obj3), "Label")) {
                break;
            }
            i17++;
        }
        q3.o0 o0Var3 = (q3.o0) obj3;
        q3.c1 Q3 = o0Var3 != null ? o0Var3.Q(w13) : null;
        this.f24922a.invoke(new a3.f(Q3 != null ? bs1.c.c(Q3.f102178a, Q3.f102179b) : 0L));
        long a14 = n4.a.a(bs1.c.w1(i15, i16 - Math.max(q5.d(Q3) / 2, r0Var.R(x0Var.d())), j13), 0, 0, 0, 0, 11);
        int size4 = list.size();
        for (int i18 = 0; i18 < size4; i18++) {
            q3.o0 o0Var4 = (q3.o0) list.get(i18);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(o0Var4), "TextField")) {
                q3.c1 Q4 = o0Var4.Q(a14);
                long a15 = n4.a.a(a14, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i19);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a((q3.o0) obj4), "Hint")) {
                        break;
                    }
                    i19++;
                }
                q3.o0 o0Var5 = (q3.o0) obj4;
                q3.c1 Q5 = o0Var5 != null ? o0Var5.Q(a15) : null;
                int d2 = j3.d(q5.e(Q), q5.e(Q2), Q4.f102178a, q5.e(Q3), q5.e(Q5), this.f24924c, j13, r0Var.b(), this.f24925d);
                int c13 = j3.c(q5.d(Q), q5.d(Q2), Q4.f102179b, q5.d(Q3), q5.d(Q5), this.f24924c, j13, r0Var.b(), this.f24925d);
                int size6 = list.size();
                for (int i23 = 0; i23 < size6; i23++) {
                    q3.o0 o0Var6 = (q3.o0) list.get(i23);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(o0Var6), "border")) {
                        s03 = r0Var.s0(d2, c13, kotlin.collections.z0.d(), new k3(c13, d2, Q, Q2, Q4, Q3, Q5, o0Var6.Q(bs1.c.a(d2 != Integer.MAX_VALUE ? d2 : 0, d2, c13 != Integer.MAX_VALUE ? c13 : 0, c13)), this, r0Var));
                        return s03;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q3.p0
    public final int b(s3.q1 q1Var, List list, int i13) {
        return c(q1Var, list, i13, y0.f25398s);
    }

    public final int c(s3.q1 q1Var, List list, int i13, y0 y0Var) {
        Object obj;
        Object obj2;
        int i14;
        int i15;
        Object obj3;
        int i16;
        Object obj4;
        int size = list.size();
        int i17 = 0;
        while (true) {
            obj = null;
            if (i17 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i17);
            if (Intrinsics.d(q5.c((q3.r) obj2), "Leading")) {
                break;
            }
            i17++;
        }
        q3.r rVar = (q3.r) obj2;
        if (rVar != null) {
            i14 = i13 == Integer.MAX_VALUE ? i13 : i13 - rVar.P(Integer.MAX_VALUE);
            i15 = ((Number) y0Var.invoke(rVar, Integer.valueOf(i13))).intValue();
        } else {
            i14 = i13;
            i15 = 0;
        }
        int size2 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i18);
            if (Intrinsics.d(q5.c((q3.r) obj3), "Trailing")) {
                break;
            }
            i18++;
        }
        q3.r rVar2 = (q3.r) obj3;
        if (rVar2 != null) {
            int P = rVar2.P(Integer.MAX_VALUE);
            if (i14 != Integer.MAX_VALUE) {
                i14 -= P;
            }
            i16 = ((Number) y0Var.invoke(rVar2, Integer.valueOf(i13))).intValue();
        } else {
            i16 = 0;
        }
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i19);
            if (Intrinsics.d(q5.c((q3.r) obj4), "Label")) {
                break;
            }
            i19++;
        }
        Object obj5 = (q3.r) obj4;
        int intValue = obj5 != null ? ((Number) y0Var.invoke(obj5, Integer.valueOf(tb.f.V(i14, this.f24924c, i13)))).intValue() : 0;
        int size4 = list.size();
        for (int i23 = 0; i23 < size4; i23++) {
            Object obj6 = list.get(i23);
            if (Intrinsics.d(q5.c((q3.r) obj6), "TextField")) {
                int intValue2 = ((Number) y0Var.invoke(obj6, Integer.valueOf(i14))).intValue();
                int size5 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i24);
                    if (Intrinsics.d(q5.c((q3.r) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i24++;
                }
                Object obj8 = (q3.r) obj;
                return j3.c(i15, i16, intValue2, intValue, obj8 != null ? ((Number) y0Var.invoke(obj8, Integer.valueOf(i14))).intValue() : 0, this.f24924c, q5.f25107a, q1Var.b(), this.f24925d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q3.p0
    public final int d(s3.q1 q1Var, List list, int i13) {
        return f(q1Var, list, i13, y0.f25397r);
    }

    @Override // q3.p0
    public final int e(s3.q1 q1Var, List list, int i13) {
        return f(q1Var, list, i13, y0.f25399t);
    }

    public final int f(s3.q1 q1Var, List list, int i13, y0 y0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj5 = list.get(i14);
            if (Intrinsics.d(q5.c((q3.r) obj5), "TextField")) {
                int intValue = ((Number) y0Var.invoke(obj5, Integer.valueOf(i13))).intValue();
                int size2 = list.size();
                int i15 = 0;
                while (true) {
                    obj = null;
                    if (i15 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (Intrinsics.d(q5.c((q3.r) obj2), "Label")) {
                        break;
                    }
                    i15++;
                }
                q3.r rVar = (q3.r) obj2;
                int intValue2 = rVar != null ? ((Number) y0Var.invoke(rVar, Integer.valueOf(i13))).intValue() : 0;
                int size3 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i16);
                    if (Intrinsics.d(q5.c((q3.r) obj3), "Trailing")) {
                        break;
                    }
                    i16++;
                }
                q3.r rVar2 = (q3.r) obj3;
                int intValue3 = rVar2 != null ? ((Number) y0Var.invoke(rVar2, Integer.valueOf(i13))).intValue() : 0;
                int size4 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i17);
                    if (Intrinsics.d(q5.c((q3.r) obj4), "Leading")) {
                        break;
                    }
                    i17++;
                }
                q3.r rVar3 = (q3.r) obj4;
                int intValue4 = rVar3 != null ? ((Number) y0Var.invoke(rVar3, Integer.valueOf(i13))).intValue() : 0;
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i18);
                    if (Intrinsics.d(q5.c((q3.r) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i18++;
                }
                q3.r rVar4 = (q3.r) obj;
                return j3.d(intValue4, intValue3, intValue, intValue2, rVar4 != null ? ((Number) y0Var.invoke(rVar4, Integer.valueOf(i13))).intValue() : 0, this.f24924c, q5.f25107a, q1Var.b(), this.f24925d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q3.p0
    public final int h(s3.q1 q1Var, List list, int i13) {
        return c(q1Var, list, i13, y0.f25396q);
    }
}
