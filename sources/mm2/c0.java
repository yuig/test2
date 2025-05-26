package mm2;

import am2.c1;
import ao2.m0;
import dm2.b1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.q0;
import kotlin.collections.t0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import pn2.r1;
import pn2.v1;
import q5.x0;

/* loaded from: classes2.dex */
public abstract class c0 extends in2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f87642m;

    /* renamed from: b, reason: collision with root package name */
    public final rg.a f87643b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f87644c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.d f87645d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.l f87646e;

    /* renamed from: f, reason: collision with root package name */
    public final on2.n f87647f;

    /* renamed from: g, reason: collision with root package name */
    public final on2.m f87648g;

    /* renamed from: h, reason: collision with root package name */
    public final on2.n f87649h;

    /* renamed from: i, reason: collision with root package name */
    public final on2.l f87650i;

    /* renamed from: j, reason: collision with root package name */
    public final on2.l f87651j;

    /* renamed from: k, reason: collision with root package name */
    public final on2.l f87652k;

    /* renamed from: l, reason: collision with root package name */
    public final on2.n f87653l;

    static {
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f87642m = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(c0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(c0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(c0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public c0(rg.a c13, c0 c0Var) {
        Intrinsics.checkNotNullParameter(c13, "c");
        this.f87643b = c13;
        this.f87644c = c0Var;
        on2.u c14 = c13.c();
        int i13 = 0;
        y yVar = new y(this, i13);
        q0 q0Var = q0.f80391a;
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        if (q0Var == null) {
            on2.q.a(27);
            throw null;
        }
        this.f87645d = new on2.d(qVar, yVar, q0Var);
        on2.u c15 = c13.c();
        int i14 = 2;
        y yVar2 = new y(this, i14);
        on2.q qVar2 = (on2.q) c15;
        qVar2.getClass();
        this.f87646e = new on2.l(qVar2, yVar2);
        int i15 = 1;
        this.f87647f = ((on2.q) c13.c()).d(new z(this, i15));
        this.f87648g = ((on2.q) c13.c()).e(new z(this, i13));
        this.f87649h = ((on2.q) c13.c()).d(new z(this, i14));
        on2.u c16 = c13.c();
        int i16 = 3;
        y yVar3 = new y(this, i16);
        on2.q qVar3 = (on2.q) c16;
        qVar3.getClass();
        this.f87650i = new on2.l(qVar3, yVar3);
        on2.u c17 = c13.c();
        y yVar4 = new y(this, 4);
        on2.q qVar4 = (on2.q) c17;
        qVar4.getClass();
        this.f87651j = new on2.l(qVar4, yVar4);
        on2.u c18 = c13.c();
        y yVar5 = new y(this, i15);
        on2.q qVar5 = (on2.q) c18;
        qVar5.getClass();
        this.f87652k = new on2.l(qVar5, yVar5);
        this.f87653l = ((on2.q) c13.c()).d(new z(this, i16));
    }

    public static pn2.b0 l(gm2.z method, rg.a c13) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c13, "c");
        Class<?> klass = ((Method) method.b()).getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(klass, "getDeclaringClass(...)");
        Intrinsics.checkNotNullParameter(klass, "klass");
        nm2.a m13 = com.bumptech.glide.c.m1(r1.COMMON, klass.isAnnotation(), false, null, 6);
        com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) c13.f107933e;
        Type genericReturnType = method.f65794a.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
        return qVar.O(re2.f.c(genericReturnType), m13);
    }

    public static a7.o u(rg.a aVar, dm2.z function, List jValueParameters) {
        Pair pair;
        boolean z13;
        ym2.g gVar;
        ym2.g e13;
        rg.a c13 = aVar;
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        t0 M0 = CollectionsKt.M0(jValueParameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(M0, 10));
        Iterator it = M0.iterator();
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            x0 x0Var = (x0) it;
            if (!x0Var.hasNext()) {
                List descriptors = CollectionsKt.F0(arrayList);
                Intrinsics.checkNotNullParameter(descriptors, "descriptors");
                a7.o oVar = new a7.o();
                oVar.f1155b = descriptors;
                oVar.f1154a = z15;
                return oVar;
            }
            IndexedValue indexedValue = (IndexedValue) x0Var.next();
            int i13 = indexedValue.f80349a;
            gm2.f0 f0Var = (gm2.f0) indexedValue.f80350b;
            lm2.d v23 = dl2.b.v2(c13, f0Var);
            nm2.a m13 = com.bumptech.glide.c.m1(r1.COMMON, z14, z14, null, 7);
            boolean z16 = f0Var.f65771d;
            pm2.p pVar = f0Var.f65768a;
            if (z16) {
                pm2.f fVar = pVar instanceof pm2.f ? (pm2.f) pVar : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + f0Var);
                }
                v1 N = ((com.google.firebase.messaging.q) c13.f107933e).N(fVar, m13, true);
                pair = new Pair(N, aVar.b().f().f(N));
            } else {
                pair = new Pair(((com.google.firebase.messaging.q) c13.f107933e).O(pVar, m13), null);
            }
            pn2.b0 b0Var = (pn2.b0) pair.f80346a;
            pn2.b0 b0Var2 = (pn2.b0) pair.f80347b;
            if (Intrinsics.d(function.getName().b(), "equals") && jValueParameters.size() == 1 && Intrinsics.d(aVar.b().f().p(), b0Var)) {
                e13 = ym2.g.e("other");
            } else {
                String str = f0Var.f65770c;
                ym2.g d2 = str != null ? ym2.g.d(str) : null;
                if (d2 == null) {
                    z15 = true;
                }
                if (d2 == null) {
                    e13 = ym2.g.e("p" + i13);
                    Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
                } else {
                    z13 = z15;
                    gVar = d2;
                    fm2.h b13 = ((fm2.f) ((lm2.a) c13.f107929a).f83940j).b(f0Var);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new b1(function, null, i13, v23, gVar, b0Var, false, false, false, b0Var2, b13));
                    arrayList = arrayList2;
                    z15 = z13;
                    z14 = z14;
                    c13 = aVar;
                }
            }
            z13 = z15;
            gVar = e13;
            fm2.h b132 = ((fm2.f) ((lm2.a) c13.f107929a).f83940j).b(f0Var);
            ArrayList arrayList22 = arrayList;
            arrayList22.add(new b1(function, null, i13, v23, gVar, b0Var, false, false, false, b0Var2, b132));
            arrayList = arrayList22;
            z15 = z13;
            z14 = z14;
            c13 = aVar;
        }
    }

    @Override // in2.o, in2.n
    public Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !b().contains(name) ? q0.f80391a : (Collection) this.f87649h.invoke(name);
    }

    @Override // in2.o, in2.n
    public final Set b() {
        return (Set) lb.l0.B0(this.f87650i, f87642m[0]);
    }

    @Override // in2.o, in2.n
    public final Set c() {
        return (Set) lb.l0.B0(this.f87652k, f87642m[2]);
    }

    @Override // in2.o, in2.n
    public Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !f().contains(name) ? q0.f80391a : (Collection) this.f87653l.invoke(name);
    }

    @Override // in2.o, in2.n
    public final Set f() {
        return (Set) lb.l0.B0(this.f87651j, f87642m[1]);
    }

    @Override // in2.o, in2.p
    public Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f87645d.invoke();
    }

    public abstract Set h(in2.g gVar, in2.k kVar);

    public abstract Set i(in2.g gVar, in2.k kVar);

    public void j(ArrayList result, ym2.g name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, ym2.g gVar);

    public abstract void n(ArrayList arrayList, ym2.g gVar);

    public abstract Set o(in2.g gVar);

    public abstract dm2.d p();

    public abstract am2.m q();

    public boolean r(km2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return true;
    }

    public abstract x s(gm2.z zVar, ArrayList arrayList, pn2.b0 b0Var, List list);

    public final km2.g t(gm2.z typeParameterOwner) {
        Intrinsics.checkNotNullParameter(typeParameterOwner, "method");
        rg.a aVar = this.f87643b;
        km2.g containingDeclaration = km2.g.I0(q(), dl2.b.v2(aVar, typeParameterOwner), typeParameterOwner.c(), ((fm2.f) ((lm2.a) aVar.f107929a).f83940j).b(typeParameterOwner), ((c) this.f87646e.invoke()).b(typeParameterOwner.c()) != null && ((ArrayList) typeParameterOwner.f()).isEmpty());
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "createJavaMethod(...)");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        rg.a aVar2 = new rg.a((lm2.a) aVar.f107929a, new lm2.f(aVar, containingDeclaration, typeParameterOwner, 0), (xk2.k) aVar.f107931c);
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            c1 a13 = ((lm2.h) aVar2.f107930b).a((gm2.e0) it.next());
            Intrinsics.f(a13);
            arrayList.add(a13);
        }
        a7.o u13 = u(aVar2, containingDeclaration, typeParameterOwner.f());
        x s13 = s(typeParameterOwner, arrayList, l(typeParameterOwner, aVar2), (List) u13.f1155b);
        dm2.d p13 = p();
        q0 q0Var = q0.f80391a;
        am2.b0 b0Var = am2.c0.Companion;
        boolean isAbstract = Modifier.isAbstract(((Method) typeParameterOwner.b()).getModifiers());
        boolean z13 = !Modifier.isFinal(((Method) typeParameterOwner.b()).getModifiers());
        b0Var.getClass();
        containingDeclaration.H0(null, p13, q0Var, s13.f87740c, s13.f87739b, s13.f87738a, am2.b0.a(false, isAbstract, z13), m0.r0(typeParameterOwner.e()), z0.d());
        containingDeclaration.E = km2.f.get(s13.f87741d, u13.f1154a);
        List list = s13.f87742e;
        if (!(!list.isEmpty())) {
            return containingDeclaration;
        }
        ((re2.h) ((lm2.a) aVar2.f107929a).f83935e).getClass();
        if (list != null) {
            throw new UnsupportedOperationException("Should not be called");
        }
        re2.h.c(6);
        throw null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
