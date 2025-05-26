package rm2;

import am2.b1;
import am2.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import pn2.g1;
import pn2.p0;

/* loaded from: classes4.dex */
public final class i0 implements zm2.v, wp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108737a;

    public /* synthetic */ i0(int i13) {
        this.f108737a = i13;
    }

    public static dn2.j a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new dn2.j(message);
    }

    public static dn2.t c(pn2.b0 argumentType) {
        Intrinsics.checkNotNullParameter(argumentType, "argumentType");
        if (ao2.m0.U(argumentType)) {
            return null;
        }
        pn2.b0 b0Var = argumentType;
        int i13 = 0;
        while (xl2.l.z(b0Var)) {
            b0Var = ((g1) CollectionsKt.s0(b0Var.u0())).getType();
            Intrinsics.checkNotNullExpressionValue(b0Var, "getType(...)");
            i13++;
        }
        am2.j b13 = b0Var.w0().b();
        if (!(b13 instanceof am2.g)) {
            if (!(b13 instanceof c1)) {
                return null;
            }
            ym2.b j13 = ym2.b.j(xl2.q.f135292a.g());
            Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
            return new dn2.t(j13, 0);
        }
        ym2.b f13 = fn2.d.f(b13);
        if (f13 != null) {
            return new dn2.t(f13, i13);
        }
        dn2.q value = new dn2.q(argumentType);
        Intrinsics.checkNotNullParameter(value, "value");
        return new dn2.t(value);
    }

    public static in2.n d(Collection types, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(types, "types");
        Collection collection = types;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((pn2.b0) it.next()).w());
        }
        wn2.f z13 = ue.c.z(arrayList);
        in2.n e13 = re2.f.e(message, z13);
        return z13.f130600a <= 1 ? e13 : new in2.w(e13);
    }

    public static p0 e(p0 p0Var, b1 typeAliasDescriptor, List arguments) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        List parameters = ((dm2.g) typeAliasDescriptor).f55421h.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List list = parameters;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).o0());
        }
        return new p0(p0Var, typeAliasDescriptor, arguments, z0.m(CollectionsKt.N0(arrayList, arguments)));
    }

    public static j0 f(String name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new j0(name + '#' + desc);
    }

    public static j0 g(xm2.f signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (signature instanceof xm2.e) {
            return i(signature.c(), signature.b());
        }
        if (signature instanceof xm2.d) {
            return f(signature.c(), signature.b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static j0 h(vm2.f nameResolver, wm2.d signature) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return i(nameResolver.c(signature.f130361c), nameResolver.c(signature.f130362d));
    }

    public static j0 i(String name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new j0(a.a.C(name, desc));
    }

    public static j0 j(j0 signature, int i13) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new j0(signature.f108741a + '@' + i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pn2.r k(pn2.v1 r9, boolean r10) {
        /*
            int r0 = pn2.r.f100835d
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r1 = r9 instanceof pn2.r
            if (r1 == 0) goto Lf
            pn2.r r9 = (pn2.r) r9
            goto L93
        Lf:
            r9.w0()
            pn2.b1 r1 = r9.w0()
            am2.j r1 = r1.b()
            boolean r1 = r1 instanceof am2.c1
            r2 = 0
            if (r1 != 0) goto L25
            boolean r1 = r9 instanceof qn2.k
            if (r1 != 0) goto L25
            goto L92
        L25:
            pn2.b1 r1 = r9.w0()
            am2.j r1 = r1.b()
            boolean r3 = r1 instanceof dm2.z0
            if (r3 == 0) goto L34
            dm2.z0 r1 = (dm2.z0) r1
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 == 0) goto L3c
            boolean r1 = r1.f55590m
            if (r1 != 0) goto L3c
            goto L6c
        L3c:
            if (r10 == 0) goto L4f
            pn2.b1 r1 = r9.w0()
            am2.j r1 = r1.b()
            boolean r1 = r1 instanceof am2.c1
            if (r1 == 0) goto L4f
            boolean r0 = pn2.t1.g(r9)
            goto L6a
        L4f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            qn2.p r5 = qn2.p.f104516a
            r4 = 1
            r8 = 24
            r3 = 0
            r6 = 0
            r7 = 0
            pn2.a1 r0 = pk.a0.G(r3, r4, r5, r6, r7, r8)
            pn2.h0 r1 = dl2.b.b2(r9)
            pn2.x0 r3 = pn2.x0.f100855a
            boolean r0 = pn2.c.a(r0, r1, r3)
            r0 = r0 ^ 1
        L6a:
            if (r0 == 0) goto L92
        L6c:
            boolean r0 = r9 instanceof pn2.v
            if (r0 == 0) goto L82
            r0 = r9
            pn2.v r0 = (pn2.v) r0
            pn2.h0 r1 = r0.f100850b
            pn2.b1 r1 = r1.w0()
            pn2.h0 r0 = r0.f100851c
            pn2.b1 r0 = r0.w0()
            kotlin.jvm.internal.Intrinsics.d(r1, r0)
        L82:
            pn2.r r0 = new pn2.r
            pn2.h0 r9 = dl2.b.b2(r9)
            r1 = 0
            pn2.h0 r9 = r9.A0(r1)
            r0.<init>(r9, r10)
            r9 = r0
            goto L93
        L92:
            r9 = r2
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rm2.i0.k(pn2.v1, boolean):pn2.r");
    }

    @Override // zm2.v
    public final zm2.u b(int i13) {
        switch (this.f108737a) {
            case 1:
                return tm2.r.valueOf(i13);
            case 2:
                return tm2.s.valueOf(i13);
            default:
                return tm2.x.valueOf(i13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i13, int i14) {
        this(0);
        this.f108737a = i13;
        switch (i13) {
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            default:
                break;
        }
    }
}
