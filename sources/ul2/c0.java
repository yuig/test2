package ul2;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 extends i0 implements rl2.d, d0, t1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f122501d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Class f122502b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.k f122503c;

    public c0(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f122502b = jClass;
        this.f122503c = xk2.m.a(xk2.n.PUBLICATION, new v(this, 7));
    }

    public static dm2.m s(ym2.b bVar, fm2.g gVar) {
        ln2.o oVar = gVar.f62583a;
        am2.d0 d0Var = oVar.f84109b;
        ym2.c g13 = bVar.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
        dm2.m mVar = new dm2.m(new dm2.q(d0Var, g13), bVar.i(), am2.c0.FINAL, am2.h.CLASS, kotlin.collections.e0.b(oVar.f84109b.f().j("Any").j()), oVar.f84108a);
        mVar.u0(new a0(oVar.f84108a, mVar), kotlin.collections.s0.f80394a, null);
        return mVar;
    }

    @Override // rl2.d
    public final boolean b(Object obj) {
        List list = gm2.d.f65761a;
        Class cls = this.f122502b;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Integer num = (Integer) gm2.d.f65764d.get(cls);
        if (num != null) {
            return dl2.b.K1(num.intValue(), obj);
        }
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Class cls2 = (Class) gm2.d.f65763c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // kotlin.jvm.internal.g
    public final Class c() {
        return this.f122502b;
    }

    @Override // rl2.d
    public final String e() {
        y yVar = (y) this.f122503c.getValue();
        yVar.getClass();
        rl2.u uVar = y.f122632l[3];
        return (String) yVar.f122635e.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && Intrinsics.d(lb.l0.u0(this), lb.l0.u0((rl2.d) obj));
    }

    @Override // rl2.d
    public final String f() {
        y yVar = (y) this.f122503c.getValue();
        yVar.getClass();
        rl2.u uVar = y.f122632l[2];
        return (String) yVar.f122634d.invoke();
    }

    @Override // ul2.i0
    public final Collection h() {
        am2.g a13 = a();
        if (a13.c() == am2.h.INTERFACE || a13.c() == am2.h.OBJECT) {
            return kotlin.collections.q0.f80391a;
        }
        Collection n13 = a13.n();
        Intrinsics.checkNotNullExpressionValue(n13, "getConstructors(...)");
        return n13;
    }

    public final int hashCode() {
        return lb.l0.u0(this).hashCode();
    }

    @Override // ul2.i0
    public final Collection i(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        in2.n w13 = a().j().w();
        hm2.e eVar = hm2.e.FROM_REFLECTION;
        Collection a13 = w13.a(name, eVar);
        in2.n b03 = a().b0();
        Intrinsics.checkNotNullExpressionValue(b03, "getStaticScope(...)");
        return CollectionsKt.l0(b03.a(name, eVar), a13);
    }

    @Override // ul2.i0
    public final am2.r0 j(int i13) {
        Class<?> declaringClass;
        Class cls = this.f122502b;
        if (Intrinsics.d(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((c0) lb.l0.w0(declaringClass)).j(i13);
        }
        am2.g a13 = a();
        nn2.j jVar = a13 instanceof nn2.j ? (nn2.j) a13 : null;
        if (jVar == null) {
            return null;
        }
        zm2.s classLocalVariable = wm2.l.f130423j;
        Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
        tm2.i0 i0Var = (tm2.i0) ao2.m0.x(jVar.f91594e, classLocalVariable, i13);
        if (i0Var == null) {
            return null;
        }
        lb.p0 p0Var = jVar.f91601l;
        return (am2.r0) c2.f(this.f122502b, i0Var, (vm2.f) p0Var.f82654c, (vm2.i) p0Var.f82656e, jVar.f91595f, b0.f122495a);
    }

    @Override // ul2.i0
    public final Collection m(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        in2.n w13 = a().j().w();
        hm2.e eVar = hm2.e.FROM_REFLECTION;
        Collection d2 = w13.d(name, eVar);
        in2.n b03 = a().b0();
        Intrinsics.checkNotNullExpressionValue(b03, "getStaticScope(...)");
        return CollectionsKt.l0(b03.d(name, eVar), d2);
    }

    public final ym2.b t() {
        xl2.o primitiveType;
        ym2.b bVar = a2.f122487a;
        Class klass = this.f122502b;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            primitiveType = componentType.isPrimitive() ? gn2.c.get(componentType.getSimpleName()).getPrimitiveType() : null;
            if (primitiveType != null) {
                return new ym2.b(xl2.r.f135332l, primitiveType.getArrayTypeName());
            }
            ym2.b j13 = ym2.b.j(xl2.q.f135301g.g());
            Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
            return j13;
        }
        if (Intrinsics.d(klass, Void.TYPE)) {
            return a2.f122487a;
        }
        primitiveType = klass.isPrimitive() ? gn2.c.get(klass.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new ym2.b(xl2.r.f135332l, primitiveType.getTypeName());
        }
        ym2.b a13 = gm2.d.a(klass);
        if (a13.f139465c) {
            return a13;
        }
        String str = zl2.d.f142106a;
        ym2.c fqName = a13.b();
        Intrinsics.checkNotNullExpressionValue(fqName, "asSingleFqName(...)");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ym2.b bVar2 = (ym2.b) zl2.d.f142113h.get(fqName.i());
        return bVar2 != null ? bVar2 : a13;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("class ");
        ym2.b t13 = t();
        ym2.c g13 = t13.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
        String concat = g13.d() ? "" : g13.b().concat(".");
        String b13 = t13.h().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        sb3.append(concat + kotlin.text.z.m(b13, '.', '$'));
        return sb3.toString();
    }

    @Override // ul2.d0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final am2.g a() {
        return ((y) this.f122503c.getValue()).a();
    }
}
