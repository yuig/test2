package ul2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalCallableAccessException;

/* loaded from: classes2.dex */
public abstract class t implements rl2.c, t1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f122602a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f122603b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f122604c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f122605d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f122606e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.k f122607f;

    public t() {
        w1 y13 = ue.c.y(new r(this, 1));
        Intrinsics.checkNotNullExpressionValue(y13, "lazySoft(...)");
        this.f122602a = y13;
        w1 y14 = ue.c.y(new r(this, 2));
        Intrinsics.checkNotNullExpressionValue(y14, "lazySoft(...)");
        this.f122603b = y14;
        w1 y15 = ue.c.y(new r(this, 4));
        Intrinsics.checkNotNullExpressionValue(y15, "lazySoft(...)");
        this.f122604c = y15;
        w1 y16 = ue.c.y(new r(this, 5));
        Intrinsics.checkNotNullExpressionValue(y16, "lazySoft(...)");
        this.f122605d = y16;
        w1 y17 = ue.c.y(new r(this, 0));
        Intrinsics.checkNotNullExpressionValue(y17, "lazySoft(...)");
        this.f122606e = y17;
        this.f122607f = xk2.m.a(xk2.n.PUBLICATION, new r(this, 6));
    }

    public static Object h(q1 q1Var) {
        Class t03 = lb.l0.t0(kh2.w.I(q1Var));
        if (t03.isArray()) {
            Object newInstance = Array.newInstance(t03.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(newInstance, "run(...)");
            return newInstance;
        }
        throw new u1("Cannot instantiate the default empty array of type " + t03.getSimpleName() + ", because it is not an array type");
    }

    @Override // rl2.c
    public final Object call(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return i().call(args);
        } catch (IllegalAccessException e13) {
            throw new IllegalCallableAccessException(e13);
        }
    }

    @Override // rl2.c
    public final Object callBy(Map args) {
        boolean z13;
        Object h10;
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z14 = false;
        if (s()) {
            List<Object> parameters = getParameters();
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(parameters, 10));
            for (Object obj : parameters) {
                if (args.containsKey(obj)) {
                    h10 = args.get(obj);
                    if (h10 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + obj + ')');
                    }
                } else {
                    y0 y0Var = (y0) obj;
                    if (y0Var.i()) {
                        h10 = null;
                    } else {
                        if (!y0Var.j()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + y0Var);
                        }
                        h10 = h(y0Var.h());
                    }
                }
                arrayList.add(h10);
            }
            vl2.g l13 = l();
            if (l13 != null) {
                try {
                    return l13.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e13) {
                    throw new IllegalCallableAccessException(e13);
                }
            }
            throw new u1("This callable does not support a default call: " + n());
        }
        Intrinsics.checkNotNullParameter(args, "args");
        List<rl2.o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return i().call(isSuspend() ? new bl2.c[]{null} : new bl2.c[0]);
            } catch (IllegalAccessException e14) {
                throw new IllegalCallableAccessException(e14);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f122606e.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean booleanValue = ((Boolean) this.f122607f.getValue()).booleanValue();
        int i13 = 0;
        for (rl2.o oVar : parameters2) {
            int r13 = booleanValue ? r(oVar) : 1;
            if (args.containsKey(oVar)) {
                y0 y0Var2 = (y0) oVar;
                objArr[y0Var2.d()] = args.get(y0Var2);
            } else {
                y0 y0Var3 = (y0) oVar;
                if (y0Var3.i()) {
                    if (booleanValue) {
                        int i14 = i13 + r13;
                        for (int i15 = i13; i15 < i14; i15++) {
                            int i16 = (i15 / 32) + size;
                            Object obj2 = objArr[i16];
                            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i16] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i15 % 32)));
                        }
                        z13 = true;
                    } else {
                        int i17 = (i13 / 32) + size;
                        Object obj3 = objArr[i17];
                        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Int");
                        z13 = true;
                        objArr[i17] = Integer.valueOf(((Integer) obj3).intValue() | (1 << (i13 % 32)));
                    }
                    z14 = z13;
                } else if (!y0Var3.j()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + y0Var3);
                }
            }
            if (((y0) oVar).g() == rl2.n.VALUE) {
                i13 += r13;
            }
        }
        if (!z14) {
            try {
                vl2.g i18 = i();
                Object[] copyOf = Arrays.copyOf(objArr, size);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return i18.call(copyOf);
            } catch (IllegalAccessException e15) {
                throw new IllegalCallableAccessException(e15);
            }
        }
        vl2.g l14 = l();
        if (l14 != null) {
            try {
                return l14.call(objArr);
            } catch (IllegalAccessException e16) {
                throw new IllegalCallableAccessException(e16);
            }
        }
        throw new u1("This callable does not support a default call: " + n());
    }

    @Override // rl2.b
    public final List getAnnotations() {
        Object invoke = this.f122602a.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (List) invoke;
    }

    @Override // rl2.c
    public final List getParameters() {
        Object invoke = this.f122603b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (List) invoke;
    }

    @Override // rl2.c
    public final rl2.v getReturnType() {
        Object invoke = this.f122604c.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (rl2.v) invoke;
    }

    @Override // rl2.c
    public final List getTypeParameters() {
        Object invoke = this.f122605d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (List) invoke;
    }

    @Override // rl2.c
    public final rl2.a0 getVisibility() {
        am2.q visibility = n().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        ym2.c cVar = c2.f122505a;
        Intrinsics.checkNotNullParameter(visibility, "<this>");
        if (Intrinsics.d(visibility, am2.s.f15577e)) {
            return rl2.a0.PUBLIC;
        }
        if (Intrinsics.d(visibility, am2.s.f15575c)) {
            return rl2.a0.PROTECTED;
        }
        if (Intrinsics.d(visibility, am2.s.f15576d)) {
            return rl2.a0.INTERNAL;
        }
        if (Intrinsics.d(visibility, am2.s.f15573a) || Intrinsics.d(visibility, am2.s.f15574b)) {
            return rl2.a0.PRIVATE;
        }
        return null;
    }

    public abstract vl2.g i();

    @Override // rl2.c
    public final boolean isAbstract() {
        return n().l() == am2.c0.ABSTRACT;
    }

    @Override // rl2.c
    public final boolean isFinal() {
        return n().l() == am2.c0.FINAL;
    }

    @Override // rl2.c
    public final boolean isOpen() {
        return n().l() == am2.c0.OPEN;
    }

    public abstract i0 j();

    public abstract vl2.g l();

    public abstract am2.d n();

    public final int r(rl2.o oVar) {
        if (!((Boolean) this.f122607f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        y0 y0Var = (y0) oVar;
        if (!c2.h(y0Var.h())) {
            return 1;
        }
        ArrayList R = com.bumptech.glide.c.R(lb.l0.x(y0Var.h().f122585a));
        Intrinsics.f(R);
        return R.size();
    }

    public final boolean s() {
        return Intrinsics.d(getName(), "<init>") && j().c().isAnnotation();
    }

    public abstract boolean t();
}
