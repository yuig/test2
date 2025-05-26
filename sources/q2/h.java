package q2;

import androidx.compose.foundation.lazy.layout.u0;
import i1.l0;
import i2.e2;
import i2.f2;
import i2.g2;
import java.util.ArrayList;
import kl2.o;
import kl2.p;
import kl2.q;
import kl2.r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h implements Function2, kl2.l, kl2.m, kl2.n, o, p, q, r, kl2.a, kl2.b, kl2.c, kl2.d, kl2.e, kl2.f, kl2.g, kl2.h, kl2.i, kl2.j, kl2.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f102108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f102109b;

    /* renamed from: c, reason: collision with root package name */
    public Object f102110c;

    /* renamed from: d, reason: collision with root package name */
    public f2 f102111d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f102112e;

    public h(s sVar, boolean z13, int i13) {
        this.f102108a = i13;
        this.f102109b = z13;
        this.f102110c = sVar;
    }

    @Override // kl2.b
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return r(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (i2.o) obj10, ((Number) obj11).intValue());
    }

    public final Object b(Object obj, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int i14 = 1;
        int a13 = sVar.h(this) ? i.a(2, 1) : i.a(1, 1);
        Object obj2 = this.f102110c;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(3, obj2);
        Object invoke = ((kl2.l) obj2).invoke(obj, sVar, Integer.valueOf(a13 | i13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.f2(this, obj, i13, i14);
        }
        return invoke;
    }

    @Override // kl2.m
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (i2.o) obj3, ((Number) obj4).intValue());
    }

    @Override // kl2.q
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return j(obj, obj2, obj3, obj4, obj5, obj6, (i2.o) obj7, ((Number) obj8).intValue());
    }

    public final Object e(Object obj, Object obj2, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 2) : i.a(1, 2);
        Object obj3 = this.f102110c;
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(4, obj3);
        Object c13 = ((kl2.m) obj3).c(obj, obj2, sVar, Integer.valueOf(a13 | i13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new u0(this, obj, obj2, i13, 4);
        }
        return c13;
    }

    public final Object f(Object obj, Object obj2, Object obj3, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 3) : i.a(1, 3);
        Object obj4 = this.f102110c;
        Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(5, obj4);
        Object p13 = ((kl2.n) obj4).p(obj, obj2, obj3, sVar, Integer.valueOf(a13 | i13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b(this, obj, obj2, obj3, i13);
        }
        return p13;
    }

    @Override // kl2.o
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, (i2.o) obj5, ((Number) obj6).intValue());
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 4) : i.a(1, 4);
        Object obj5 = this.f102110c;
        Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(6, obj5);
        Object g13 = ((o) obj5).g(obj, obj2, obj3, obj4, sVar, Integer.valueOf(a13 | i13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new c(this, obj, obj2, obj3, obj4, i13);
        }
        return g13;
    }

    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 5) : i.a(1, 5);
        Object obj6 = this.f102110c;
        Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(7, obj6);
        Object k13 = ((p) obj6).k(obj, obj2, obj3, obj4, obj5, sVar, Integer.valueOf(i13 | a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l0(this, obj, obj2, obj3, obj4, obj5, i13, 1);
        }
        return k13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        i2.s sVar = (i2.s) ((i2.o) obj);
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = intValue | (sVar.h(this) ? i.a(2, 0) : i.a(1, 0));
        Object obj3 = this.f102110c;
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(2, obj3);
        Object invoke = ((Function2) obj3).invoke(sVar, Integer.valueOf(a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            dl2.b.y(2, this);
            t13.f71113d = this;
        }
        return invoke;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 6) : i.a(1, 6);
        Object obj7 = this.f102110c;
        Intrinsics.g(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(8, obj7);
        Object d2 = ((q) obj7).d(obj, obj2, obj3, obj4, obj5, obj6, sVar, Integer.valueOf(i13 | a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new d(this, obj, obj2, obj3, obj4, obj5, obj6, i13);
        }
        return d2;
    }

    @Override // kl2.p
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return i(obj, obj2, obj3, obj4, obj5, (i2.o) obj6, ((Number) obj7).intValue());
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 7) : i.a(1, 7);
        Object obj8 = this.f102110c;
        Intrinsics.g(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(9, obj8);
        Object o13 = ((r) obj8).o(obj, obj2, obj3, obj4, obj5, obj6, obj7, sVar, Integer.valueOf(i13 | a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new e(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i13);
        }
        return o13;
    }

    @Override // kl2.c
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Integer num, Integer num2) {
        return s(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, (i2.o) obj11, num.intValue(), num2.intValue());
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 8) : i.a(1, 8);
        Object obj9 = this.f102110c;
        Intrinsics.g(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(10, obj9);
        Object q13 = ((kl2.a) obj9).q(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, sVar, Integer.valueOf(i13 | a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new f(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i13);
        }
        return q13;
    }

    @Override // kl2.r
    public final /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7, (i2.o) obj8, ((Number) obj9).intValue());
    }

    @Override // kl2.n
    public final /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (i2.o) obj4, ((Number) obj5).intValue());
    }

    @Override // kl2.a
    public final /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return n(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (i2.o) obj9, ((Number) obj10).intValue());
    }

    public final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 9) : i.a(1, 9);
        Object obj10 = this.f102110c;
        Intrinsics.g(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(11, obj10);
        Object a14 = ((kl2.b) obj10).a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, sVar, Integer.valueOf(i13 | a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new g(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i13);
        }
        return a14;
    }

    public final Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(this.f102108a);
        t(sVar);
        int a13 = sVar.h(this) ? i.a(2, 10) : i.a(1, 10);
        Object obj11 = this.f102110c;
        Intrinsics.g(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        dl2.b.y(13, obj11);
        Object m13 = ((kl2.c) obj11).m(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, sVar, Integer.valueOf(i13), Integer.valueOf(i14 | a13));
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new a(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, i13);
        }
        return m13;
    }

    public final void t(i2.o oVar) {
        i2.s sVar;
        f2 x13;
        if (!this.f102109b || (x13 = (sVar = (i2.s) oVar).x()) == null) {
            return;
        }
        sVar.getClass();
        x13.f71110a |= 1;
        if (i.d(this.f102111d, x13)) {
            this.f102111d = x13;
            return;
        }
        ArrayList arrayList = this.f102112e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f102112e = arrayList2;
            arrayList2.add(x13);
            return;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i.d((e2) arrayList.get(i13), x13)) {
                arrayList.set(i13, x13);
                return;
            }
        }
        arrayList.add(x13);
    }

    public final void u(s sVar) {
        if (Intrinsics.d(this.f102110c, sVar)) {
            return;
        }
        boolean z13 = this.f102110c == null;
        this.f102110c = sVar;
        if (z13 || !this.f102109b) {
            return;
        }
        f2 f2Var = this.f102111d;
        if (f2Var != null) {
            g2 g2Var = f2Var.f71111b;
            if (g2Var != null) {
                g2Var.a(f2Var, null);
            }
            this.f102111d = null;
        }
        ArrayList arrayList = this.f102112e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                f2 f2Var2 = (f2) ((e2) arrayList.get(i13));
                g2 g2Var2 = f2Var2.f71111b;
                if (g2Var2 != null) {
                    g2Var2.a(f2Var2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (i2.o) obj2, ((Number) obj3).intValue());
    }
}
