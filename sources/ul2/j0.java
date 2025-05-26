package ul2;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122533i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f122534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, int i13) {
        super(0);
        this.f122533i = i13;
        this.f122534j = k0Var;
    }

    public final vl2.g b() {
        Object obj;
        vl2.g rVar;
        GenericDeclaration q13;
        vl2.y yVar;
        vl2.y tVar;
        int i13 = this.f122533i;
        k0 k0Var = this.f122534j;
        switch (i13) {
            case 0:
                ym2.b bVar = a2.f122487a;
                so.a d2 = a2.d(k0Var.n());
                boolean z13 = d2 instanceof l;
                i0 i0Var = k0Var.f122539g;
                if (z13) {
                    if (k0Var.s()) {
                        Class c13 = i0Var.c();
                        List parameters = k0Var.getParameters();
                        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((y0) ((rl2.o) it.next())).getName();
                            Intrinsics.f(name);
                            arrayList.add(name);
                        }
                        return new vl2.c(c13, arrayList, vl2.a.POSITIONAL_CALL, vl2.b.KOTLIN);
                    }
                    String desc = ((l) d2).f122548b.f135402b;
                    i0Var.getClass();
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    obj = i0.q(i0Var.c(), i0Var.n(desc));
                } else if (d2 instanceof m) {
                    am2.x n13 = k0Var.n();
                    am2.m g13 = n13.g();
                    Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
                    if (bn2.i.c(g13) && (n13 instanceof am2.l) && ((am2.l) n13).Q()) {
                        am2.x n14 = k0Var.n();
                        String str = ((m) d2).f122553b.f135402b;
                        List x13 = k0Var.n().x();
                        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                        return new vl2.d0(n14, i0Var, str, x13);
                    }
                    xm2.e eVar = ((m) d2).f122553b;
                    obj = i0Var.g(eVar.f135401a, eVar.f135402b);
                } else if (d2 instanceof k) {
                    obj = ((k) d2).f122537b;
                } else {
                    if (!(d2 instanceof j)) {
                        if (!(d2 instanceof i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Class c14 = i0Var.c();
                        List list = ((i) d2).f122530b;
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new vl2.c(c14, arrayList2, vl2.a.POSITIONAL_CALL, vl2.b.JAVA, list);
                    }
                    obj = ((j) d2).f122532b;
                }
                if (obj instanceof Constructor) {
                    rVar = k0.u(k0Var, (Constructor) obj, k0Var.n(), false);
                } else {
                    if (!(obj instanceof Method)) {
                        throw new u1("Could not compute caller for function: " + k0Var.n() + " (member = " + obj + ')');
                    }
                    Method method = (Method) obj;
                    boolean isStatic = Modifier.isStatic(method.getModifiers());
                    Object obj2 = k0Var.f122541i;
                    rVar = !isStatic ? k0Var.t() ? new vl2.r(com.bumptech.glide.c.r(obj2, k0Var.n()), method) : new vl2.v(method) : ((bm2.b) k0Var.n()).getAnnotations().a(c2.f122505a) != null ? k0Var.t() ? new vl2.s(method) : new vl2.w(0, method) : k0Var.t() ? new vl2.t(com.bumptech.glide.c.r(obj2, k0Var.n()), method) : new vl2.w(1, method);
                }
                return com.bumptech.glide.c.v(rVar, k0Var.n(), false);
            default:
                ym2.b bVar2 = a2.f122487a;
                so.a d13 = a2.d(k0Var.n());
                boolean z14 = d13 instanceof m;
                i0 i0Var2 = k0Var.f122539g;
                if (z14) {
                    am2.x n15 = k0Var.n();
                    am2.m g14 = n15.g();
                    Intrinsics.checkNotNullExpressionValue(g14, "getContainingDeclaration(...)");
                    if (bn2.i.c(g14) && (n15 instanceof am2.l) && ((am2.l) n15).Q()) {
                        throw new u1(k0Var.n().g() + " cannot have default arguments");
                    }
                    xm2.e eVar2 = ((m) d13).f122553b;
                    String name2 = eVar2.f135401a;
                    Member b13 = k0Var.i().b();
                    Intrinsics.f(b13);
                    boolean z15 = !Modifier.isStatic(b13.getModifiers());
                    i0Var2.getClass();
                    Intrinsics.checkNotNullParameter(name2, "name");
                    String desc2 = eVar2.f135402b;
                    Intrinsics.checkNotNullParameter(desc2, "desc");
                    if (!Intrinsics.d(name2, "<init>")) {
                        ArrayList arrayList3 = new ArrayList();
                        if (z15) {
                            arrayList3.add(i0Var2.c());
                        }
                        i0Var2.d(desc2, arrayList3, false);
                        q13 = i0.o(i0Var2.l(), a.a.C(name2, "$default"), (Class[]) arrayList3.toArray(new Class[0]), i0Var2.p(StringsKt.K(desc2, ')', 0, false, 6) + 1, desc2.length(), desc2), z15);
                    }
                    q13 = null;
                } else if (!(d13 instanceof l)) {
                    if (d13 instanceof i) {
                        Class c15 = i0Var2.c();
                        List list3 = ((i) d13).f122530b;
                        List list4 = list3;
                        ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((Method) it3.next()).getName());
                        }
                        return new vl2.c(c15, arrayList4, vl2.a.CALL_BY_NAME, vl2.b.JAVA, list3);
                    }
                    q13 = null;
                } else {
                    if (k0Var.s()) {
                        Class c16 = i0Var2.c();
                        List parameters2 = k0Var.getParameters();
                        ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(parameters2, 10));
                        Iterator it4 = parameters2.iterator();
                        while (it4.hasNext()) {
                            String name3 = ((y0) ((rl2.o) it4.next())).getName();
                            Intrinsics.f(name3);
                            arrayList5.add(name3);
                        }
                        return new vl2.c(c16, arrayList5, vl2.a.CALL_BY_NAME, vl2.b.KOTLIN);
                    }
                    String desc3 = ((l) d13).f122548b.f135402b;
                    i0Var2.getClass();
                    Intrinsics.checkNotNullParameter(desc3, "desc");
                    Class c17 = i0Var2.c();
                    ArrayList arrayList6 = new ArrayList();
                    i0Var2.d(desc3, arrayList6, true);
                    Unit unit = Unit.f80348a;
                    q13 = i0.q(c17, arrayList6);
                }
                if (q13 instanceof Constructor) {
                    yVar = k0.u(k0Var, (Constructor) q13, k0Var.n(), true);
                } else if (q13 instanceof Method) {
                    if (((bm2.b) k0Var.n()).getAnnotations().a(c2.f122505a) != null) {
                        am2.m g15 = k0Var.n().g();
                        Intrinsics.g(g15, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        if (!((am2.g) g15).P()) {
                            Method method2 = (Method) q13;
                            tVar = k0Var.t() ? new vl2.s(method2) : new vl2.w(0, method2);
                            yVar = tVar;
                        }
                    }
                    Method method3 = (Method) q13;
                    tVar = k0Var.t() ? new vl2.t(com.bumptech.glide.c.r(k0Var.f122541i, k0Var.n()), method3) : new vl2.w(1, method3);
                    yVar = tVar;
                } else {
                    yVar = null;
                }
                return yVar != null ? com.bumptech.glide.c.v(yVar, k0Var.n(), true) : null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f122533i) {
        }
        return b();
    }
}
