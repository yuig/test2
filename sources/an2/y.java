package an2;

import am2.c1;
import am2.i1;
import am2.j1;
import am2.o0;
import am2.r0;
import am2.t0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dm2.b1;
import dm2.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import pn2.g1;
import pn2.t1;
import pn2.v1;
import t3.s1;

/* loaded from: classes2.dex */
public final class y implements b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y f15818c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f15819d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f15820e;

    /* renamed from: a, reason: collision with root package name */
    public final f0 f15821a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f15822b;

    static {
        re2.f.i(h.f15799i);
        re2.f.i(f.f15769i);
        re2.f.i(g.f15797i);
        re2.f.i(i.f15801i);
        re2.f.i(n.f15806i);
        f15818c = re2.f.i(k.f15803i);
        re2.f.i(l.f15804i);
        f15819d = re2.f.i(o.f15807i);
        f15820e = re2.f.i(j.f15802i);
        re2.f.i(m.f15805i);
    }

    public y(f0 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f15821a = options;
        this.f15822b = xk2.m.b(new tu1.u(this, 23));
    }

    public static /* synthetic */ String B(y yVar, bm2.c cVar) {
        return yVar.A(cVar, null);
    }

    public static void c0(StringBuilder sb3) {
        int length = sb3.length();
        if (length == 0 || sb3.charAt(length - 1) != ' ') {
            sb3.append(' ');
        }
    }

    public static boolean o0(pn2.b0 b0Var) {
        if (kotlin.jvm.internal.j.v(b0Var)) {
            List u03 = b0Var.u0();
            if (!(u03 instanceof Collection) || !u03.isEmpty()) {
                Iterator it = u03.iterator();
                while (it.hasNext()) {
                    if (((g1) it.next()).b()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void p(y yVar, r0 r0Var, StringBuilder sb3) {
        if (!yVar.t()) {
            f0 f0Var = yVar.f15821a;
            d0 d0Var = f0Var.f15777g;
            rl2.u[] uVarArr = f0.X;
            if (!((Boolean) d0Var.c(f0Var, uVarArr[5])).booleanValue()) {
                if (yVar.s().contains(a0.ANNOTATIONS)) {
                    yVar.C(sb3, r0Var, null);
                    dm2.w h03 = r0Var.h0();
                    if (h03 != null) {
                        yVar.C(sb3, h03, bm2.e.FIELD);
                    }
                    dm2.w E = r0Var.E();
                    if (E != null) {
                        yVar.C(sb3, E, bm2.e.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((k0) f0Var.H.c(f0Var, uVarArr[32])) == k0.NONE) {
                        dm2.r0 getter = r0Var.getGetter();
                        if (getter != null) {
                            yVar.C(sb3, getter, bm2.e.PROPERTY_GETTER);
                        }
                        t0 setter = r0Var.getSetter();
                        if (setter != null) {
                            yVar.C(sb3, setter, bm2.e.PROPERTY_SETTER);
                            List x13 = ((s0) setter).x();
                            Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                            i1 i1Var = (i1) CollectionsKt.s0(x13);
                            Intrinsics.f(i1Var);
                            yVar.C(sb3, i1Var, bm2.e.SETTER_PARAMETER);
                        }
                    }
                }
                List i03 = r0Var.i0();
                Intrinsics.checkNotNullExpressionValue(i03, "getContextReceiverParameters(...)");
                yVar.F(sb3, i03);
                am2.q visibility = r0Var.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                yVar.m0(visibility, sb3);
                yVar.S(sb3, yVar.s().contains(a0.CONST) && r0Var.isConst(), "const");
                yVar.O(r0Var, sb3);
                yVar.R(r0Var, sb3);
                yVar.X(r0Var, sb3);
                yVar.S(sb3, yVar.s().contains(a0.LATEINIT) && r0Var.j0(), "lateinit");
                yVar.N(r0Var, sb3);
            }
            yVar.j0(r0Var, sb3, false);
            List typeParameters = r0Var.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            yVar.i0(typeParameters, sb3, true);
            yVar.a0(sb3, r0Var);
        }
        yVar.U(r0Var, sb3, true);
        sb3.append(": ");
        pn2.b0 type = r0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb3.append(yVar.d0(type));
        yVar.b0(sb3, r0Var);
        yVar.L(r0Var, sb3);
        List typeParameters2 = r0Var.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        yVar.n0(sb3, typeParameters2);
    }

    public static am2.c0 y(am2.a0 a0Var) {
        if (a0Var instanceof am2.g) {
            return ((am2.g) a0Var).c() == am2.h.INTERFACE ? am2.c0.ABSTRACT : am2.c0.FINAL;
        }
        am2.m g13 = a0Var.g();
        am2.g gVar = g13 instanceof am2.g ? (am2.g) g13 : null;
        if (gVar != null && (a0Var instanceof am2.d)) {
            am2.d dVar = (am2.d) a0Var;
            Intrinsics.checkNotNullExpressionValue(dVar.h(), "getOverriddenDescriptors(...)");
            if ((!r1.isEmpty()) && gVar.l() != am2.c0.FINAL) {
                return am2.c0.OPEN;
            }
            if (gVar.c() != am2.h.INTERFACE || Intrinsics.d(dVar.getVisibility(), am2.s.f15573a)) {
                return am2.c0.FINAL;
            }
            am2.c0 l13 = dVar.l();
            am2.c0 c0Var = am2.c0.ABSTRACT;
            return l13 == c0Var ? c0Var : am2.c0.OPEN;
        }
        return am2.c0.FINAL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String A(bm2.c annotation, bm2.e eVar) {
        am2.p u13;
        List x13;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb3 = new StringBuilder();
        sb3.append('@');
        if (eVar != null) {
            sb3.append(eVar.getRenderName() + ':');
        }
        pn2.b0 type = annotation.getType();
        sb3.append(d0(type));
        f0 f0Var = this.f15821a;
        f0Var.getClass();
        if (kg.o.n(f0Var)) {
            Map a13 = annotation.a();
            q0 q0Var = null;
            am2.g d2 = ((Boolean) f0Var.I.c(f0Var, f0.X[33])).booleanValue() ? fn2.d.d(annotation) : null;
            if (d2 != null && (u13 = d2.u()) != null && (x13 = ((dm2.z) u13).x()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : x13) {
                    if (((b1) ((i1) obj)).r0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dm2.o) ((i1) it.next())).getName());
                }
                q0Var = arrayList2;
            }
            if (q0Var == null) {
                q0Var = q0.f80391a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : q0Var) {
                Intrinsics.f((ym2.g) obj2);
                if (!a13.containsKey(r7)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((ym2.g) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> entrySet = a13.entrySet();
            ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                ym2.g gVar = (ym2.g) entry.getKey();
                dn2.g gVar2 = (dn2.g) entry.getValue();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(gVar.b());
                sb4.append(" = ");
                sb4.append(!q0Var.contains(gVar) ? E(gVar2) : "...");
                arrayList5.add(sb4.toString());
            }
            List w03 = CollectionsKt.w0(CollectionsKt.l0(arrayList5, arrayList4));
            if (kg.o.o(f0Var) || (!w03.isEmpty())) {
                CollectionsKt___CollectionsKt.H(w03, sb3, ", ", (r16 & 4) != 0 ? "" : "(", (r16 & 8) != 0 ? "" : ")", -1, "...", (r16 & 64) != 0 ? null : null);
            }
        }
        if (w() && (ao2.m0.U(type) || (type.w0().b() instanceof am2.g0))) {
            sb3.append(" /* annotation class not found */");
        }
        String sb5 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
        return sb5;
    }

    public final void C(StringBuilder sb3, bm2.a aVar, bm2.e eVar) {
        if (s().contains(a0.ANNOTATIONS)) {
            boolean z13 = aVar instanceof pn2.b0;
            f0 f0Var = this.f15821a;
            Set g13 = z13 ? f0Var.g() : (Set) f0Var.K.c(f0Var, f0.X[35]);
            Function1 function1 = (Function1) f0Var.M.c(f0Var, f0.X[37]);
            for (bm2.c cVar : aVar.getAnnotations()) {
                if (!CollectionsKt.L(g13, cVar.c()) && !Intrinsics.d(cVar.c(), xl2.q.f135312r) && (function1 == null || ((Boolean) function1.invoke(cVar)).booleanValue())) {
                    sb3.append(A(cVar, eVar));
                    if (((Boolean) f0Var.f15770J.c(f0Var, f0.X[34])).booleanValue()) {
                        sb3.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
                    } else {
                        sb3.append(" ");
                    }
                }
            }
        }
    }

    public final void D(am2.k kVar, StringBuilder sb3) {
        List k13 = kVar.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
        List parameters = kVar.e().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (w() && kVar.q() && parameters.size() > k13.size()) {
            sb3.append(" /*captured type parameters: ");
            h0(sb3, parameters.subList(k13.size(), parameters.size()));
            sb3.append("*/");
        }
    }

    public final String E(dn2.g gVar) {
        f0 f0Var = this.f15821a;
        Function1 function1 = (Function1) f0Var.f15792v.c(f0Var, f0.X[20]);
        if (function1 != null) {
            return (String) function1.invoke(gVar);
        }
        if (gVar instanceof dn2.b) {
            Iterable iterable = (Iterable) ((dn2.b) gVar).f55623a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String E = E((dn2.g) it.next());
                if (E != null) {
                    arrayList.add(E);
                }
            }
            return CollectionsKt.Z(arrayList, ", ", "{", "}", 0, null, null, 56);
        }
        if (gVar instanceof dn2.a) {
            return StringsKt.R("@", B(this, (bm2.c) ((dn2.a) gVar).f55623a));
        }
        if (!(gVar instanceof dn2.t)) {
            return gVar.toString();
        }
        dn2.s sVar = (dn2.s) ((dn2.t) gVar).f55623a;
        if (sVar instanceof dn2.q) {
            return ((dn2.q) sVar).a() + "::class";
        }
        if (!(sVar instanceof dn2.r)) {
            throw new NoWhenBranchMatchedException();
        }
        dn2.r rVar = (dn2.r) sVar;
        String b13 = rVar.b().b().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        int a13 = rVar.a();
        for (int i13 = 0; i13 < a13; i13++) {
            b13 = s1.b("kotlin.Array<", b13, '>');
        }
        return a.a.C(b13, "::class");
    }

    public final void F(StringBuilder sb3, List list) {
        if (!list.isEmpty()) {
            sb3.append("context(");
            Iterator it = list.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int i14 = i13 + 1;
                dm2.d dVar = (dm2.d) it.next();
                C(sb3, dVar, bm2.e.RECEIVER);
                pn2.b0 type = dVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                sb3.append(J(type));
                if (i13 == kotlin.collections.f0.i(list)) {
                    sb3.append(") ");
                } else {
                    sb3.append(", ");
                }
                i13 = i14;
            }
        }
    }

    public final void G(StringBuilder sb3, pn2.h0 type) {
        C(sb3, type, null);
        if (type instanceof pn2.r) {
        }
        if (ao2.m0.U(type)) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z13 = type instanceof rn2.j;
            boolean z14 = z13 && ((rn2.j) type).f108919d.isUnresolved();
            f0 f0Var = this.f15821a;
            if (z14 && ((Boolean) f0Var.U.c(f0Var, f0.X[46])).booleanValue()) {
                rn2.m mVar = rn2.m.f108927a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(type, "type");
                if (z13) {
                    ((rn2.j) type).f108919d.isUnresolved();
                }
                pn2.b1 w03 = type.w0();
                Intrinsics.g(w03, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb3.append(H(((rn2.k) w03).f108925b[0]));
            } else {
                if (!z13 || ((Boolean) f0Var.W.c(f0Var, f0.X[48])).booleanValue()) {
                    sb3.append(type.w0().toString());
                } else {
                    sb3.append(((rn2.j) type).f108923h);
                }
                sb3.append(e0(type.u0()));
            }
        } else {
            pn2.b1 w04 = type.w0();
            Intrinsics.checkNotNullParameter(type, "<this>");
            am2.j b13 = type.w0().b();
            kv0.p z15 = lb.l0.z(type, b13 instanceof am2.k ? (am2.k) b13 : null, 0);
            if (z15 == null) {
                sb3.append(f0(w04));
                sb3.append(e0(type.u0()));
            } else {
                Z(sb3, z15);
            }
        }
        if (type.x0()) {
            sb3.append("?");
        }
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type instanceof pn2.r) {
            sb3.append(" & Any");
        }
    }

    public final String H(String str) {
        int i13 = t.f15811a[u().ordinal()];
        if (i13 == 1) {
            return str;
        }
        if (i13 == 2) {
            return a.a.k("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String I(String lowerRendered, String upperRendered, xl2.l builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (kotlin.jvm.internal.j.L(lowerRendered, upperRendered)) {
            return kotlin.text.z.p(upperRendered, "(", false) ? a.a.k("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        e r13 = r();
        builtIns.getClass();
        am2.g i13 = builtIns.i(xl2.q.B);
        Intrinsics.checkNotNullExpressionValue(i13, "getCollection(...)");
        String a13 = r13.a(i13, this);
        String e03 = StringsKt.e0(a13, "Collection", a13);
        String G = kotlin.jvm.internal.j.G(lowerRendered, a.a.C(e03, "Mutable"), upperRendered, e03, a.a.C(e03, "(Mutable)"));
        if (G != null) {
            return G;
        }
        String G2 = kotlin.jvm.internal.j.G(lowerRendered, a.a.C(e03, "MutableMap.MutableEntry"), upperRendered, a.a.C(e03, "Map.Entry"), a.a.C(e03, "(Mutable)Map.(Mutable)Entry"));
        if (G2 != null) {
            return G2;
        }
        e r14 = r();
        am2.g j13 = builtIns.j("Array");
        Intrinsics.checkNotNullExpressionValue(j13, "getArray(...)");
        String a14 = r14.a(j13, this);
        String e04 = StringsKt.e0(a14, "Array", a14);
        StringBuilder i14 = n60.o.i(e04);
        i14.append(q("Array<"));
        String sb3 = i14.toString();
        StringBuilder i15 = n60.o.i(e04);
        i15.append(q("Array<out "));
        String sb4 = i15.toString();
        StringBuilder i16 = n60.o.i(e04);
        i16.append(q("Array<(out) "));
        String G3 = kotlin.jvm.internal.j.G(lowerRendered, sb3, upperRendered, sb4, i16.toString());
        if (G3 != null) {
            return G3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String J(pn2.b0 b0Var) {
        String d03 = d0(b0Var);
        return ((!o0(b0Var) || t1.g(b0Var)) && !(b0Var instanceof pn2.r)) ? d03 : s1.b("(", d03, ')');
    }

    public final String K(ym2.e fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List e13 = fqName.e();
        Intrinsics.checkNotNullExpressionValue(e13, "pathSegments(...)");
        return q(kotlin.jvm.internal.j.D(e13));
    }

    public final void L(j1 j1Var, StringBuilder sb3) {
        dn2.g d03;
        String E;
        f0 f0Var = this.f15821a;
        if (!((Boolean) f0Var.f15791u.c(f0Var, f0.X[19])).booleanValue() || (d03 = j1Var.d0()) == null || (E = E(d03)) == null) {
            return;
        }
        sb3.append(" = ");
        sb3.append(q(E));
    }

    public final String M(String str) {
        int i13 = t.f15811a[u().ordinal()];
        if (i13 == 1) {
            return str;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        f0 f0Var = this.f15821a;
        return ((Boolean) f0Var.V.c(f0Var, f0.X[47])).booleanValue() ? str : a.a.k("<b>", str, "</b>");
    }

    public final void N(am2.d dVar, StringBuilder sb3) {
        if (s().contains(a0.MEMBER_KIND) && w() && dVar.c() != am2.c.DECLARATION) {
            sb3.append("/*");
            sb3.append(lb.l0.x1(dVar.c().name()));
            sb3.append("*/ ");
        }
    }

    public final void O(am2.a0 a0Var, StringBuilder sb3) {
        S(sb3, a0Var.isExternal(), "external");
        boolean z13 = false;
        S(sb3, s().contains(a0.EXPECT) && a0Var.Z(), "expect");
        if (s().contains(a0.ACTUAL) && a0Var.M()) {
            z13 = true;
        }
        S(sb3, z13, "actual");
    }

    public final String P() {
        Intrinsics.checkNotNullParameter("defined in", "message");
        int i13 = t.f15811a[u().ordinal()];
        if (i13 == 1) {
            return "defined in";
        }
        if (i13 == 2) {
            return "<i>defined in</i>";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void Q(am2.c0 c0Var, StringBuilder sb3, am2.c0 c0Var2) {
        f0 f0Var = this.f15821a;
        if (((Boolean) f0Var.f15786p.c(f0Var, f0.X[14])).booleanValue() || c0Var != c0Var2) {
            S(sb3, s().contains(a0.MODALITY), lb.l0.x1(c0Var.name()));
        }
    }

    public final void R(am2.d dVar, StringBuilder sb3) {
        if (bn2.e.u(dVar) && dVar.l() == am2.c0.FINAL) {
            return;
        }
        f0 f0Var = this.f15821a;
        if (((i0) f0Var.B.c(f0Var, f0.X[26])) == i0.RENDER_OVERRIDE && dVar.l() == am2.c0.OPEN && (!dVar.h().isEmpty())) {
            return;
        }
        am2.c0 l13 = dVar.l();
        Intrinsics.checkNotNullExpressionValue(l13, "getModality(...)");
        Q(l13, sb3, y(dVar));
    }

    public final void S(StringBuilder sb3, boolean z13, String str) {
        if (z13) {
            sb3.append(M(str));
            sb3.append(" ");
        }
    }

    public final String T(ym2.g name, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        String q13 = q(kotlin.jvm.internal.j.C(name));
        f0 f0Var = this.f15821a;
        return (((Boolean) f0Var.V.c(f0Var, f0.X[47])).booleanValue() && u() == n0.HTML && z13) ? a.a.k("<b>", q13, "</b>") : q13;
    }

    public final void U(am2.m mVar, StringBuilder sb3, boolean z13) {
        ym2.g name = mVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb3.append(T(name, z13));
    }

    public final void V(StringBuilder sb3, pn2.b0 b0Var) {
        v1 z03 = b0Var.z0();
        pn2.a aVar = z03 instanceof pn2.a ? (pn2.a) z03 : null;
        if (aVar == null) {
            W(sb3, b0Var);
            return;
        }
        f0 f0Var = this.f15821a;
        d0 d0Var = f0Var.R;
        rl2.u[] uVarArr = f0.X;
        boolean booleanValue = ((Boolean) d0Var.c(f0Var, uVarArr[42])).booleanValue();
        pn2.h0 h0Var = aVar.f100758b;
        if (booleanValue) {
            W(sb3, h0Var);
            return;
        }
        W(sb3, aVar.f100759c);
        if (((Boolean) f0Var.Q.c(f0Var, uVarArr[41])).booleanValue()) {
            n0 u13 = u();
            n0 n0Var = n0.HTML;
            if (u13 == n0Var) {
                sb3.append("<font color=\"808080\"><i>");
            }
            sb3.append(" /* = ");
            W(sb3, h0Var);
            sb3.append(" */");
            if (u() == n0Var) {
                sb3.append("</i></font>");
            }
        }
    }

    public final void W(StringBuilder sb3, pn2.b0 b0Var) {
        ym2.g gVar;
        String q13;
        boolean z13 = b0Var instanceof pn2.d0;
        f0 f0Var = this.f15821a;
        if (z13 && f0Var.h()) {
            on2.l lVar = ((pn2.d0) b0Var).f100780d;
            if (lVar.f96777c == on2.o.NOT_COMPUTED || lVar.f96777c == on2.o.COMPUTING) {
                sb3.append("<Not computed yet>");
                return;
            }
        }
        v1 z03 = b0Var.z0();
        if (z03 instanceof pn2.v) {
            sb3.append(((pn2.v) z03).E0(this, this));
            return;
        }
        if (z03 instanceof pn2.h0) {
            pn2.h0 h0Var = (pn2.h0) z03;
            if (Intrinsics.d(h0Var, t1.f100843b) || h0Var.w0() == t1.f100842a.f108917b) {
                sb3.append("???");
                return;
            }
            pn2.b1 w03 = h0Var.w0();
            if ((w03 instanceof rn2.k) && ((rn2.k) w03).f108924a == rn2.l.UNINFERRED_TYPE_VARIABLE) {
                if (!((Boolean) f0Var.f15790t.c(f0Var, f0.X[18])).booleanValue()) {
                    sb3.append("???");
                    return;
                }
                pn2.b1 w04 = h0Var.w0();
                Intrinsics.g(w04, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb3.append(H(((rn2.k) w04).f108925b[0]));
                return;
            }
            if (ao2.m0.U(h0Var)) {
                G(sb3, h0Var);
                return;
            }
            if (!o0(h0Var)) {
                G(sb3, h0Var);
                return;
            }
            int length = sb3.length();
            ((y) this.f15822b.getValue()).C(sb3, h0Var, null);
            boolean z14 = sb3.length() != length;
            pn2.b0 p13 = kotlin.jvm.internal.j.p(h0Var);
            List n13 = kotlin.jvm.internal.j.n(h0Var);
            if (!n13.isEmpty()) {
                sb3.append("context(");
                Iterator it = n13.subList(0, kotlin.collections.f0.i(n13)).iterator();
                while (it.hasNext()) {
                    V(sb3, (pn2.b0) it.next());
                    sb3.append(", ");
                }
                V(sb3, (pn2.b0) CollectionsKt.b0(n13));
                sb3.append(") ");
            }
            boolean x13 = kotlin.jvm.internal.j.x(h0Var);
            boolean x03 = h0Var.x0();
            boolean z15 = x03 || (z14 && p13 != null);
            if (z15) {
                if (x13) {
                    sb3.insert(length, '(');
                } else {
                    if (z14) {
                        CharsKt.c(kotlin.text.e0.B(sb3));
                        if (sb3.charAt(StringsKt.I(sb3) - 1) != ')') {
                            sb3.insert(StringsKt.I(sb3), "()");
                        }
                    }
                    sb3.append("(");
                }
            }
            S(sb3, x13, "suspend");
            if (p13 != null) {
                boolean z16 = (o0(p13) && !p13.x0()) || kotlin.jvm.internal.j.x(p13) || !p13.getAnnotations().isEmpty() || (p13 instanceof pn2.r);
                if (z16) {
                    sb3.append("(");
                }
                V(sb3, p13);
                if (z16) {
                    sb3.append(")");
                }
                sb3.append(".");
            }
            sb3.append("(");
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            if (!kotlin.jvm.internal.j.v(h0Var) || h0Var.getAnnotations().a(xl2.q.f135310p) == null || h0Var.u0().size() > 1) {
                int i13 = 0;
                for (g1 typeProjection : kotlin.jvm.internal.j.r(h0Var)) {
                    int i14 = i13 + 1;
                    if (i13 > 0) {
                        sb3.append(", ");
                    }
                    if (((Boolean) f0Var.T.c(f0Var, f0.X[44])).booleanValue()) {
                        pn2.b0 type = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        gVar = kotlin.jvm.internal.j.j(type);
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        sb3.append(T(gVar, false));
                        sb3.append(": ");
                    }
                    Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
                    StringBuilder sb4 = new StringBuilder();
                    CollectionsKt___CollectionsKt.H(kotlin.collections.e0.b(typeProjection), sb4, ", ", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : new u(this, 0));
                    String sb5 = sb4.toString();
                    Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                    sb3.append(sb5);
                    i13 = i14;
                }
            } else {
                sb3.append("???");
            }
            sb3.append(") ");
            int i15 = t.f15811a[u().ordinal()];
            if (i15 == 1) {
                q13 = q("->");
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                q13 = "&rarr;";
            }
            sb3.append(q13);
            sb3.append(" ");
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            kotlin.jvm.internal.j.v(h0Var);
            pn2.b0 type2 = ((g1) CollectionsKt.b0(h0Var.u0())).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            V(sb3, type2);
            if (z15) {
                sb3.append(")");
            }
            if (x03) {
                sb3.append("?");
            }
        }
    }

    public final void X(am2.d dVar, StringBuilder sb3) {
        if (s().contains(a0.OVERRIDE) && (!dVar.h().isEmpty())) {
            f0 f0Var = this.f15821a;
            if (((i0) f0Var.B.c(f0Var, f0.X[26])) != i0.RENDER_OPEN) {
                S(sb3, true, "override");
                if (w()) {
                    sb3.append("/*");
                    sb3.append(dVar.h().size());
                    sb3.append("*/ ");
                }
            }
        }
    }

    public final void Y(ym2.c cVar, String str, StringBuilder sb3) {
        sb3.append(M(str));
        ym2.e i13 = cVar.i();
        Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
        String K = K(i13);
        if (K.length() > 0) {
            sb3.append(" ");
            sb3.append(K);
        }
    }

    public final void Z(StringBuilder sb3, kv0.p pVar) {
        kv0.p pVar2 = (kv0.p) pVar.f80996c;
        if (pVar2 != null) {
            Z(sb3, pVar2);
            sb3.append('.');
            ym2.g name = ((am2.k) pVar.f80994a).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb3.append(T(name, false));
        } else {
            pn2.b1 e13 = ((am2.k) pVar.f80994a).e();
            Intrinsics.checkNotNullExpressionValue(e13, "getTypeConstructor(...)");
            sb3.append(f0(e13));
        }
        sb3.append(e0((List) pVar.f80995b));
    }

    @Override // an2.b0
    public final void a() {
        this.f15821a.a();
    }

    public final void a0(StringBuilder sb3, am2.b bVar) {
        dm2.d D = bVar.D();
        if (D != null) {
            C(sb3, D, bm2.e.RECEIVER);
            pn2.b0 type = D.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb3.append(J(type));
            sb3.append(".");
        }
    }

    @Override // an2.b0
    public final void b() {
        this.f15821a.b();
    }

    public final void b0(StringBuilder sb3, am2.b bVar) {
        dm2.d D;
        f0 f0Var = this.f15821a;
        if (((Boolean) f0Var.F.c(f0Var, f0.X[30])).booleanValue() && (D = bVar.D()) != null) {
            sb3.append(" on ");
            pn2.b0 type = D.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb3.append(d0(type));
        }
    }

    @Override // an2.b0
    public final void c(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<set-?>");
        this.f15821a.c(n0Var);
    }

    @Override // an2.b0
    public final boolean d() {
        return this.f15821a.d();
    }

    public final String d0(pn2.b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb3 = new StringBuilder();
        f0 f0Var = this.f15821a;
        V(sb3, (pn2.b0) ((Function1) f0Var.f15795y.c(f0Var, f0.X[23])).invoke(type));
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @Override // an2.b0
    public final void e() {
        this.f15821a.e();
    }

    public final String e0(List typeArguments) {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(q("<"));
        CollectionsKt___CollectionsKt.H(typeArguments, sb3, ", ", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : new u(this, 0));
        sb3.append(q(">"));
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @Override // an2.b0
    public final void f() {
        this.f15821a.f();
    }

    public final String f0(pn2.b1 typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        am2.j klass = typeConstructor.b();
        if ((klass instanceof c1) || (klass instanceof am2.g) || (klass instanceof am2.b1)) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            return rn2.m.g(klass) ? klass.e().toString() : r().a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof pn2.a0 ? ((pn2.a0) typeConstructor).h(x.f15817i) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // an2.b0
    public final Set g() {
        return this.f15821a.g();
    }

    public final void g0(c1 c1Var, StringBuilder sb3, boolean z13) {
        if (z13) {
            sb3.append(q("<"));
        }
        if (w()) {
            sb3.append("/*");
            sb3.append(c1Var.getIndex());
            sb3.append("*/ ");
        }
        S(sb3, c1Var.o(), "reified");
        String label = c1Var.r().getLabel();
        boolean z14 = true;
        S(sb3, label.length() > 0, label);
        C(sb3, c1Var, null);
        U(c1Var, sb3, z13);
        int size = c1Var.getUpperBounds().size();
        if ((size > 1 && !z13) || size == 1) {
            pn2.b0 b0Var = (pn2.b0) c1Var.getUpperBounds().iterator().next();
            if (b0Var == null) {
                xl2.l.a(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL);
                throw null;
            }
            if (!xl2.l.y(b0Var) || !b0Var.x0()) {
                sb3.append(" : ");
                sb3.append(d0(b0Var));
            }
        } else if (z13) {
            for (pn2.b0 b0Var2 : c1Var.getUpperBounds()) {
                if (b0Var2 == null) {
                    xl2.l.a(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL);
                    throw null;
                }
                if (!xl2.l.y(b0Var2) || !b0Var2.x0()) {
                    if (z14) {
                        sb3.append(" : ");
                    } else {
                        sb3.append(" & ");
                    }
                    sb3.append(d0(b0Var2));
                    z14 = false;
                }
            }
        }
        if (z13) {
            sb3.append(q(">"));
        }
    }

    @Override // an2.b0
    public final boolean h() {
        return this.f15821a.h();
    }

    public final void h0(StringBuilder sb3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0((c1) it.next(), sb3, false);
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
    }

    @Override // an2.b0
    public final void i() {
        this.f15821a.i();
    }

    public final void i0(List list, StringBuilder sb3, boolean z13) {
        f0 f0Var = this.f15821a;
        if (!((Boolean) f0Var.f15793w.c(f0Var, f0.X[21])).booleanValue() && (!list.isEmpty())) {
            sb3.append(q("<"));
            h0(sb3, list);
            sb3.append(q(">"));
            if (z13) {
                sb3.append(" ");
            }
        }
    }

    @Override // an2.b0
    public final void j() {
        this.f15821a.j();
    }

    public final void j0(j1 j1Var, StringBuilder sb3, boolean z13) {
        if (z13 || !(j1Var instanceof i1)) {
            sb3.append(M(j1Var.C() ? "var" : "val"));
            sb3.append(" ");
        }
    }

    @Override // an2.b0
    public final void k(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f15821a.k(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(am2.i1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: an2.y.k0(am2.i1, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // an2.b0
    public final void l(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f15821a.l(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r11 == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(java.util.Collection r10, boolean r11, java.lang.StringBuilder r12) {
        /*
            r9 = this;
            an2.f0 r0 = r9.f15821a
            an2.d0 r1 = r0.E
            rl2.u[] r2 = an2.f0.X
            r3 = 29
            r2 = r2[r3]
            java.lang.Object r0 = r1.c(r0, r2)
            an2.j0 r0 = (an2.j0) r0
            int[] r1 = an2.t.f15812b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L2c
            r3 = 2
            if (r0 == r3) goto L2a
            r11 = 3
            if (r0 != r11) goto L24
        L22:
            r11 = r2
            goto L2d
        L24:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L2a:
            if (r11 != 0) goto L22
        L2c:
            r11 = r1
        L2d:
            int r0 = r10.size()
            an2.r r3 = r9.v()
            an2.q r3 = (an2.q) r3
            r3.getClass()
            java.lang.String r3 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            java.lang.String r4 = "("
            r12.append(r4)
            java.util.Iterator r10 = r10.iterator()
            r4 = r2
        L49:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L85
            int r5 = r4 + 1
            java.lang.Object r6 = r10.next()
            am2.i1 r6 = (am2.i1) r6
            an2.r r7 = r9.v()
            an2.q r7 = (an2.q) r7
            r7.getClass()
            java.lang.String r7 = "parameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            r9.k0(r6, r11, r12, r2)
            an2.r r8 = r9.v()
            an2.q r8 = (an2.q) r8
            r8.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            int r6 = r0 + (-1)
            if (r4 == r6) goto L83
            java.lang.String r4 = ", "
            r12.append(r4)
        L83:
            r4 = r5
            goto L49
        L85:
            an2.r r10 = r9.v()
            an2.q r10 = (an2.q) r10
            r10.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            java.lang.String r10 = ")"
            r12.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: an2.y.l0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // an2.b0
    public final void m(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.f15821a.m(linkedHashSet);
    }

    public final boolean m0(am2.q qVar, StringBuilder sb3) {
        if (!s().contains(a0.VISIBILITY)) {
            return false;
        }
        f0 f0Var = this.f15821a;
        d0 d0Var = f0Var.f15784n;
        rl2.u[] uVarArr = f0.X;
        if (((Boolean) d0Var.c(f0Var, uVarArr[12])).booleanValue()) {
            qVar = am2.s.g(qVar.f15569a.c());
            Intrinsics.checkNotNullExpressionValue(qVar, "toDescriptorVisibility(...)");
        }
        if (!((Boolean) f0Var.f15785o.c(f0Var, uVarArr[13])).booleanValue() && Intrinsics.d(qVar, am2.s.f15583k)) {
            return false;
        }
        sb3.append(M(qVar.f15569a.b()));
        sb3.append(" ");
        return true;
    }

    @Override // an2.b0
    public final void n(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.f15821a.n(j0Var);
    }

    public final void n0(StringBuilder sb3, List list) {
        f0 f0Var = this.f15821a;
        if (((Boolean) f0Var.f15793w.c(f0Var, f0.X[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            List upperBounds = c1Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (pn2.b0 b0Var : CollectionsKt.N(upperBounds, 1)) {
                StringBuilder sb4 = new StringBuilder();
                ym2.g name = c1Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb4.append(T(name, false));
                sb4.append(" : ");
                Intrinsics.f(b0Var);
                sb4.append(d0(b0Var));
                arrayList.add(sb4.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb3.append(" ");
            sb3.append(M("where"));
            sb3.append(" ");
            CollectionsKt___CollectionsKt.H(arrayList, sb3, ", ", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : null);
        }
    }

    @Override // an2.b0
    public final void o() {
        this.f15821a.o();
    }

    public final String q(String str) {
        return u().escape(str);
    }

    public final e r() {
        f0 f0Var = this.f15821a;
        return (e) f0Var.f15772b.c(f0Var, f0.X[0]);
    }

    public final Set s() {
        f0 f0Var = this.f15821a;
        return (Set) f0Var.f15775e.c(f0Var, f0.X[3]);
    }

    public final boolean t() {
        f0 f0Var = this.f15821a;
        return ((Boolean) f0Var.f15776f.c(f0Var, f0.X[4])).booleanValue();
    }

    public final n0 u() {
        f0 f0Var = this.f15821a;
        return (n0) f0Var.D.c(f0Var, f0.X[28]);
    }

    public final r v() {
        f0 f0Var = this.f15821a;
        return (r) f0Var.C.c(f0Var, f0.X[27]);
    }

    public final boolean w() {
        f0 f0Var = this.f15821a;
        return ((Boolean) f0Var.f15780j.c(f0Var, f0.X[8])).booleanValue();
    }

    public final boolean x() {
        f0 f0Var = this.f15821a;
        return ((Boolean) f0Var.f15774d.c(f0Var, f0.X[2])).booleanValue();
    }

    public final String z(am2.m declarationDescriptor) {
        am2.m g13;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb3 = new StringBuilder();
        declarationDescriptor.l0(new ul2.e(this), sb3);
        f0 f0Var = this.f15821a;
        if (((Boolean) f0Var.f15773c.c(f0Var, f0.X[1])).booleanValue() && !(declarationDescriptor instanceof am2.i0) && !(declarationDescriptor instanceof o0) && (g13 = declarationDescriptor.g()) != null && !(g13 instanceof am2.d0)) {
            sb3.append(" ");
            sb3.append(P());
            sb3.append(" ");
            ym2.e h10 = bn2.e.h(g13);
            Intrinsics.checkNotNullExpressionValue(h10, "getFqName(...)");
            sb3.append(h10.f139473a.isEmpty() ? "root package" : K(h10));
            if (x() && (g13 instanceof am2.i0) && (declarationDescriptor instanceof am2.n)) {
                ((am2.n) declarationDescriptor).b().b();
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
