package n1;

import ao2.j0;
import j1.a0;
import j1.o;
import j1.p;
import j1.p2;
import j1.q2;
import j1.x2;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.g0;
import m1.f1;
import m1.m1;
import ql2.s;
import s1.f0;
import s1.k0;
import s1.o0;

/* loaded from: classes2.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public g0 f88882r;

    /* renamed from: s, reason: collision with root package name */
    public int f88883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f88884t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f88885u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f88886v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m1 f88887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f13, m1 m1Var, h hVar, bl2.c cVar, Function1 function1) {
        super(2, cVar);
        this.f88884t = hVar;
        this.f88885u = f13;
        this.f88886v = function1;
        this.f88887w = m1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        Function1 function1 = this.f88886v;
        return new e(this.f88885u, this.f88887w, this.f88884t, cVar, function1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        float f13;
        g0 g0Var;
        Object b13;
        float f14;
        float f15;
        e eVar = this;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = eVar.f88883s;
        Function1 function1 = eVar.f88886v;
        h hVar = eVar.f88884t;
        if (i13 == 0) {
            ue.c.H(obj);
            a0 a0Var = hVar.f88895b;
            p2 p2Var = q2.f74205a;
            x2 x2Var = new x2(a0Var.f73970a);
            p pVar = new p(0.0f);
            float f16 = eVar.f88885u;
            float f17 = ((p) x2Var.a(pVar, new p(f16))).f74189a;
            b bVar = hVar.f88894a;
            o0 o0Var = bVar.f88872a;
            int o13 = ((f0) o0Var.f110505o.getValue()).f110420c + o0Var.o();
            if (o13 == 0) {
                f13 = 0.0f;
            } else {
                int i14 = f16 < 0.0f ? o0Var.f110494d + 1 : o0Var.f110494d;
                int g13 = s.g(((int) (f17 / o13)) + i14, 0, o0Var.n());
                o0Var.o();
                int i15 = ((f0) o0Var.f110505o.getValue()).f110420c;
                long j13 = i14;
                long j14 = ((k0) bVar.f88874c).f110457a;
                int abs = Math.abs((s.g(s.g(g13, (int) s.b(j13 - j14, 0L), (int) s.d(j13 + j14, 2147483647L)), 0, o0Var.n()) - i14) * o13) - o13;
                if (abs < 0) {
                    abs = 0;
                }
                f13 = abs == 0 ? abs : Math.signum(f16) * abs;
            }
            if (!(!Float.isNaN(f13))) {
                throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.".toString());
            }
            g0Var = new g0();
            float signum = Math.signum(f16) * Math.abs(f13);
            g0Var.f80425a = signum;
            function1.invoke(new Float(signum));
            float f18 = g0Var.f80425a;
            d dVar = new d(g0Var, function1, 1);
            eVar = this;
            eVar.f88882r = g0Var;
            eVar.f88883s = 1;
            b13 = h.b(eVar.f88884t, eVar.f88887w, f18, eVar.f88885u, dVar, this);
            if (b13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return obj;
            }
            g0 g0Var2 = eVar.f88882r;
            ue.c.H(obj);
            g0Var = g0Var2;
            b13 = obj;
        }
        o oVar = (o) b13;
        b bVar2 = hVar.f88894a;
        float floatValue = ((Number) oVar.b()).floatValue();
        o0 o0Var2 = bVar2.f88872a;
        n nVar = ((f0) o0Var2.m()).f110432o;
        List list = ((f0) o0Var2.m()).f110418a;
        int size = list.size();
        int i16 = 0;
        float f19 = Float.NEGATIVE_INFINITY;
        float f23 = Float.POSITIVE_INFINITY;
        while (i16 < size) {
            s1.m mVar = (s1.m) list.get(i16);
            f0 f0Var = (f0) o0Var2.m();
            f1 f1Var = f0Var.f110422e;
            List list2 = list;
            f1 f1Var2 = f1.Vertical;
            f0Var.a();
            int i17 = ((f0) o0Var2.m()).f110423f;
            int i18 = ((f0) o0Var2.m()).f110421d;
            int i19 = ((f0) o0Var2.m()).f110419b;
            int i23 = ((s1.l) mVar).f110470m;
            o0Var2.n();
            nVar.getClass();
            float f24 = i23 - 0;
            if (f24 <= 0.0f && f24 > f19) {
                f19 = f24;
            }
            if (f24 >= 0.0f && f24 < f23) {
                f23 = f24;
            }
            i16++;
            list = list2;
        }
        if (f19 == Float.NEGATIVE_INFINITY) {
            f19 = f23;
        }
        if (f23 == Float.POSITIVE_INFINITY) {
            f23 = f19;
        }
        boolean z13 = !(k3.Q(o0Var2) == 0.0f);
        if (!o0Var2.e()) {
            if (z13 && k3.r1(o0Var2)) {
                f19 = 0.0f;
            }
            f23 = 0.0f;
        }
        if (o0Var2.d()) {
            f14 = f19;
            f15 = f23;
        } else {
            f15 = (!z13 || k3.r1(o0Var2)) ? f23 : 0.0f;
            f14 = 0.0f;
        }
        float floatValue2 = ((Number) bVar2.f88873b.invoke(Float.valueOf(floatValue), Float.valueOf(f14), Float.valueOf(f15))).floatValue();
        if (floatValue2 != f14 && floatValue2 != f15 && floatValue2 != 0.0f) {
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + f14 + ", " + f15 + " or 0.0").toString());
        }
        float f25 = (floatValue2 == Float.POSITIVE_INFINITY || floatValue2 == Float.NEGATIVE_INFINITY) ? 0.0f : floatValue2;
        if (!(!Float.isNaN(f25))) {
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.".toString());
        }
        g0Var.f80425a = f25;
        o l13 = j1.e.l(oVar, 0.0f, 0.0f, 30);
        d dVar2 = new d(g0Var, function1, 0);
        eVar.f88882r = null;
        eVar.f88883s = 2;
        Object b14 = l.b(eVar.f88887w, f25, f25, l13, hVar.f88896c, dVar2, this);
        return b14 == aVar ? aVar : b14;
    }
}
