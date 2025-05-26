package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final am2.r0 f122573h;

    /* renamed from: i, reason: collision with root package name */
    public final tm2.i0 f122574i;

    /* renamed from: j, reason: collision with root package name */
    public final wm2.f f122575j;

    /* renamed from: k, reason: collision with root package name */
    public final vm2.f f122576k;

    /* renamed from: l, reason: collision with root package name */
    public final vm2.i f122577l;

    /* renamed from: m, reason: collision with root package name */
    public final String f122578m;

    public p(am2.r0 descriptor, tm2.i0 proto, wm2.f signature, vm2.f nameResolver, vm2.i typeTable) {
        String str;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        this.f122573h = descriptor;
        this.f122574i = proto;
        this.f122575j = signature;
        this.f122576k = nameResolver;
        this.f122577l = typeTable;
        if ((signature.f130374b & 4) == 4) {
            str = nameResolver.c(signature.f130377e.f130361c) + nameResolver.c(signature.f130377e.f130362d);
        } else {
            xm2.d b13 = xm2.j.b(proto, nameResolver, typeTable, true);
            if (b13 == null) {
                throw new u1("No field signature for property: " + descriptor);
            }
            String d2 = b13.d();
            str = im2.c0.a(d2) + n0() + "()" + b13.e();
        }
        this.f122578m = str;
    }

    public final String n0() {
        String str;
        am2.r0 r0Var = this.f122573h;
        am2.m g13 = r0Var.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
        if (Intrinsics.d(r0Var.getVisibility(), am2.s.f15576d) && (g13 instanceof nn2.j)) {
            tm2.k kVar = ((nn2.j) g13).f91594e;
            zm2.s classModuleName = wm2.l.f130422i;
            Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
            Integer num = (Integer) ao2.m0.w(kVar, classModuleName);
            if (num == null || (str = this.f122576k.c(num.intValue())) == null) {
                str = "main";
            }
            return "$" + ym2.h.b(str);
        }
        if (!Intrinsics.d(r0Var.getVisibility(), am2.s.f15573a) || !(g13 instanceof am2.i0)) {
            return "";
        }
        nn2.l lVar = ((nn2.s) r0Var).F;
        if (!(lVar instanceof rm2.u)) {
            return "";
        }
        rm2.u uVar = (rm2.u) lVar;
        if (uVar.d() == null) {
            return "";
        }
        return "$" + uVar.e().b();
    }

    @Override // tb.f
    public final String v() {
        return this.f122578m;
    }
}
