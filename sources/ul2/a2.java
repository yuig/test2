package ul2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.b f122487a;

    static {
        ym2.b j13 = ym2.b.j(new ym2.c("java.lang.Void"));
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        f122487a = j13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(am2.x xVar) {
        if (xVar == 0) {
            dl2.b.a(28);
            throw null;
        }
        dm2.o oVar = (dm2.o) xVar;
        if ((oVar.getName().equals(xl2.r.f135323c) && dl2.b.I1(xVar)) || (oVar.getName().equals(xl2.r.f135321a) && dl2.b.I1(xVar))) {
            return true;
        }
        return Intrinsics.d(oVar.getName(), zl2.a.f142101e) && xVar.x().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m b(am2.x xVar) {
        String Q0 = dl2.b.Q0(xVar);
        if (Q0 == null) {
            if (xVar instanceof am2.s0) {
                String b13 = fn2.d.l(xVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
                Q0 = im2.c0.a(b13);
            } else if (xVar instanceof am2.t0) {
                String b14 = fn2.d.l(xVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
                Q0 = im2.c0.b(b14);
            } else {
                Q0 = ((dm2.o) xVar).getName().b();
                Intrinsics.checkNotNullExpressionValue(Q0, "asString(...)");
            }
        }
        return new m(new xm2.e(Q0, com.bumptech.glide.c.s(xVar, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tb.f c(am2.r0 possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        am2.r0 o03 = ((am2.r0) bn2.e.v(possiblyOverriddenProperty)).o0();
        Intrinsics.checkNotNullExpressionValue(o03, "getOriginal(...)");
        if (o03 instanceof nn2.s) {
            nn2.s sVar = (nn2.s) o03;
            tm2.i0 i0Var = sVar.B;
            zm2.s propertySignature = wm2.l.f130417d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            wm2.f fVar = (wm2.f) ao2.m0.w(i0Var, propertySignature);
            if (fVar != null) {
                return new p(o03, i0Var, fVar, sVar.C, sVar.D);
            }
        } else if (o03 instanceof km2.h) {
            am2.w0 b13 = ((km2.h) o03).b();
            fm2.h hVar = b13 instanceof fm2.h ? (fm2.h) b13 : null;
            gm2.u uVar = hVar != null ? hVar.f62585b : null;
            if (uVar instanceof gm2.w) {
                return new n(((gm2.w) uVar).f65792a);
            }
            if (!(uVar instanceof gm2.z)) {
                throw new u1("Incorrect resolution sequence for Java field " + o03 + " (source = " + uVar + ')');
            }
            Method method = ((gm2.z) uVar).f65794a;
            am2.t0 setter = o03.getSetter();
            am2.w0 b14 = setter != null ? ((dm2.p) setter).b() : null;
            fm2.h hVar2 = b14 instanceof fm2.h ? (fm2.h) b14 : null;
            gm2.u uVar2 = hVar2 != null ? hVar2.f62585b : null;
            gm2.z zVar = uVar2 instanceof gm2.z ? (gm2.z) uVar2 : null;
            return new o(method, zVar != null ? zVar.f65794a : null);
        }
        dm2.r0 getter = o03.getGetter();
        Intrinsics.f(getter);
        m b15 = b(getter);
        am2.t0 setter2 = o03.getSetter();
        return new q(b15, setter2 != null ? b(setter2) : null);
    }

    public static so.a d(am2.x possiblySubstitutedFunction) {
        Method method;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        am2.x o03 = ((am2.x) bn2.e.v(possiblySubstitutedFunction)).o0();
        Intrinsics.checkNotNullExpressionValue(o03, "getOriginal(...)");
        if (!(o03 instanceof nn2.b)) {
            if (o03 instanceof km2.g) {
                am2.w0 b13 = ((km2.g) o03).b();
                fm2.h hVar = b13 instanceof fm2.h ? (fm2.h) b13 : null;
                gm2.u uVar = hVar != null ? hVar.f62585b : null;
                gm2.z zVar = uVar instanceof gm2.z ? (gm2.z) uVar : null;
                if (zVar != null && (method = zVar.f65794a) != null) {
                    return new k(method);
                }
                throw new u1("Incorrect resolution sequence for Java method " + o03);
            }
            if (!(o03 instanceof km2.b)) {
                if (a(o03)) {
                    return b(o03);
                }
                throw new u1("Unknown origin of " + o03 + " (" + o03.getClass() + ')');
            }
            am2.w0 b14 = ((km2.b) o03).b();
            fm2.h hVar2 = b14 instanceof fm2.h ? (fm2.h) b14 : null;
            gm2.u uVar2 = hVar2 != null ? hVar2.f62585b : null;
            if (uVar2 instanceof gm2.t) {
                return new j(((gm2.t) uVar2).f65790a);
            }
            if (uVar2 instanceof gm2.q) {
                gm2.q qVar = (gm2.q) uVar2;
                if (qVar.f65786a.isAnnotation()) {
                    return new i(qVar.f65786a);
                }
            }
            throw new u1("Incorrect resolution sequence for Java constructor " + o03 + " (" + uVar2 + ')');
        }
        nn2.b bVar = (nn2.b) o03;
        zm2.c T = bVar.T();
        if (T instanceof tm2.a0) {
            zm2.k kVar = xm2.j.f135411a;
            xm2.e c13 = xm2.j.c((tm2.a0) T, bVar.y(), bVar.v());
            if (c13 != null) {
                return new m(c13);
            }
        }
        if (T instanceof tm2.m) {
            zm2.k kVar2 = xm2.j.f135411a;
            xm2.e a13 = xm2.j.a((tm2.m) T, bVar.y(), bVar.v());
            if (a13 != null) {
                am2.m g13 = possiblySubstitutedFunction.g();
                Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
                if (bn2.i.b(g13)) {
                    return new m(a13);
                }
                am2.m g14 = possiblySubstitutedFunction.g();
                Intrinsics.checkNotNullExpressionValue(g14, "getContainingDeclaration(...)");
                if (!bn2.i.c(g14)) {
                    return new l(a13);
                }
                am2.l lVar = (am2.l) possiblySubstitutedFunction;
                boolean Q = lVar.Q();
                String str = a13.f135401a;
                String str2 = a13.f135402b;
                if (Q) {
                    if (!Intrinsics.d(str, "constructor-impl") || !kotlin.text.z.h(str2, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + a13).toString());
                    }
                } else {
                    if (!Intrinsics.d(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + a13).toString());
                    }
                    am2.g R = lVar.R();
                    Intrinsics.checkNotNullExpressionValue(R, "getConstructedClass(...)");
                    Intrinsics.checkNotNullParameter(R, "<this>");
                    ym2.b f13 = fn2.d.f(R);
                    Intrinsics.f(f13);
                    String c14 = f13.c();
                    Intrinsics.checkNotNullExpressionValue(c14, "asString(...)");
                    String b15 = xm2.b.b(c14);
                    if (kotlin.text.z.h(str2, ")V", false)) {
                        a13 = xm2.e.d(a13, StringsKt.S("V", str2) + b15);
                    } else if (!kotlin.text.z.h(str2, b15, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + a13).toString());
                    }
                }
                return new m(a13);
            }
        }
        return b(o03);
    }
}
