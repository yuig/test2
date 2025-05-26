package ln2;

import am2.v0;
import am2.w0;
import dm2.b1;
import dm2.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;
import s3.n1;
import t3.k2;
import t3.s1;
import tm2.a1;
import tm2.g1;
import tm2.s0;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f84059a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.l f84060b;

    public a0(p0 c13) {
        Intrinsics.checkNotNullParameter(c13, "c");
        this.f84059a = c13;
        Object obj = c13.f82653b;
        this.f84060b = new tb.l(((o) obj).f84109b, ((o) obj).f84118k);
    }

    public final e0 a(am2.m mVar) {
        if (mVar instanceof am2.i0) {
            ym2.c cVar = ((dm2.k0) ((am2.i0) mVar)).f55454e;
            p0 p0Var = this.f84059a;
            return new d0(cVar, (vm2.f) p0Var.f82654c, (vm2.i) p0Var.f82656e, (nn2.l) p0Var.f82658g);
        }
        if (mVar instanceof nn2.j) {
            return ((nn2.j) mVar).f91612w;
        }
        return null;
    }

    public final bm2.i b(zm2.c cVar, int i13, b bVar) {
        return !vm2.e.f126221c.c(i13).booleanValue() ? bm2.h.f23540a : new nn2.x(this.f84059a.d(), new n1(this, cVar, bVar, 4));
    }

    public final bm2.i c(tm2.i0 i0Var, boolean z13) {
        return !vm2.e.f126221c.c(i0Var.f118326d).booleanValue() ? bm2.h.f23540a : new nn2.x(this.f84059a.d(), new k2(this, z13, i0Var));
    }

    public final nn2.c d(tm2.m proto, boolean z13) {
        p0 a13;
        Intrinsics.checkNotNullParameter(proto, "proto");
        p0 p0Var = this.f84059a;
        am2.m mVar = (am2.m) p0Var.f82655d;
        Intrinsics.g(mVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        am2.g gVar = (am2.g) mVar;
        int i13 = proto.f118390d;
        b bVar = b.FUNCTION;
        nn2.c cVar = new nn2.c(gVar, null, b(proto, i13, bVar), z13, am2.c.DECLARATION, proto, (vm2.f) p0Var.f82654c, (vm2.i) p0Var.f82656e, (vm2.j) p0Var.f82657f, (nn2.l) p0Var.f82658g, null);
        a13 = p0Var.a(cVar, q0.f80391a, (vm2.f) p0Var.f82654c, (vm2.i) p0Var.f82656e, (vm2.j) p0Var.f82657f, (vm2.a) p0Var.f82652a);
        a0 a0Var = (a0) a13.f82660i;
        List list = proto.f118391e;
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
        cVar.H0(a0Var.g(list, proto, bVar), dl2.b.f0((g1) vm2.e.f126222d.d(proto.f118390d)));
        cVar.D0(gVar.j());
        cVar.f55579r = gVar.Z();
        cVar.f55584w = !vm2.e.f126233o.c(proto.f118390d).booleanValue();
        return cVar;
    }

    public final nn2.t e(tm2.a0 proto) {
        int i13;
        p0 a13;
        pn2.b0 g13;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.f118145c & 1) == 1) {
            i13 = proto.f118146d;
        } else {
            int i14 = proto.f118147e;
            i13 = ((i14 >> 8) << 6) + (i14 & 63);
        }
        int i15 = i13;
        b bVar = b.FUNCTION;
        bm2.i b13 = b(proto, i15, bVar);
        Intrinsics.checkNotNullParameter(proto, "<this>");
        boolean t13 = proto.t();
        bm2.i iVar = bm2.h.f23540a;
        p0 p0Var = this.f84059a;
        bm2.i aVar = (t13 || (proto.f118145c & 64) == 64) ? new nn2.a(p0Var.d(), new jg2.h(this, proto, bVar, 28)) : iVar;
        ym2.c g14 = fn2.d.g((am2.m) p0Var.f82655d);
        Object obj = p0Var.f82654c;
        vm2.j jVar = Intrinsics.d(g14.c(bs1.c.L0((vm2.f) obj, proto.f118148f)), h0.f84088a) ? vm2.j.f126249b : (vm2.j) p0Var.f82657f;
        am2.m mVar = (am2.m) p0Var.f82655d;
        ym2.g L0 = bs1.c.L0((vm2.f) obj, proto.f118148f);
        am2.c c23 = dl2.b.c2((tm2.b0) vm2.e.f126234p.d(i15));
        vm2.f fVar = (vm2.f) obj;
        Object obj2 = p0Var.f82656e;
        bm2.i iVar2 = aVar;
        bm2.i iVar3 = iVar;
        nn2.t ownerFunction = new nn2.t(mVar, null, b13, L0, c23, proto, fVar, (vm2.i) obj2, jVar, (nn2.l) p0Var.f82658g, null);
        List list = proto.f118151i;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        a13 = p0Var.a(ownerFunction, list, (vm2.f) p0Var.f82654c, (vm2.i) p0Var.f82656e, (vm2.j) p0Var.f82657f, (vm2.a) p0Var.f82652a);
        s0 V0 = lb.l0.V0(proto, (vm2.i) obj2);
        Object obj3 = a13.f82659h;
        t0 V = (V0 == null || (g13 = ((l0) obj3).g(V0)) == null) ? null : dl2.b.V(ownerFunction, g13, iVar2);
        am2.m mVar2 = (am2.m) p0Var.f82655d;
        am2.g gVar = mVar2 instanceof am2.g ? (am2.g) mVar2 : null;
        dm2.d t03 = gVar != null ? gVar.t0() : null;
        vm2.i typeTable = (vm2.i) obj2;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list2 = proto.f118154l;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = proto.f118155m;
            Intrinsics.checkNotNullExpressionValue(list3, "getContextReceiverTypeIdList(...)");
            List<Integer> list4 = list3;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list4, 10));
            for (Integer num : list4) {
                Intrinsics.f(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        for (Object obj4 : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            bm2.i iVar4 = iVar3;
            t0 P = dl2.b.P(ownerFunction, ((l0) a13.f82659h).g((s0) obj4), null, iVar4, i16);
            if (P != null) {
                arrayList2.add(P);
            }
            i16 = i17;
            iVar3 = iVar4;
        }
        l0 typeDeserializer = (l0) obj3;
        List b14 = typeDeserializer.b();
        a0 a0Var = (a0) a13.f82660i;
        List list5 = proto.f118157o;
        Intrinsics.checkNotNullExpressionValue(list5, "getValueParameterList(...)");
        ownerFunction.H0(V, t03, arrayList2, b14, a0Var.g(list5, proto, b.FUNCTION), typeDeserializer.g(lb.l0.f1(proto, (vm2.i) obj2)), p.f((tm2.c0) vm2.e.f126223e.d(i15)), dl2.b.f0((g1) vm2.e.f126222d.d(i15)), z0.d());
        ownerFunction.f55574m = s1.k(vm2.e.f126235q, i15, "get(...)");
        ownerFunction.f55575n = s1.k(vm2.e.f126236r, i15, "get(...)");
        ownerFunction.f55576o = s1.k(vm2.e.f126239u, i15, "get(...)");
        ownerFunction.f55577p = s1.k(vm2.e.f126237s, i15, "get(...)");
        ownerFunction.f55578q = s1.k(vm2.e.f126238t, i15, "get(...)");
        ownerFunction.f55583v = s1.k(vm2.e.f126240v, i15, "get(...)");
        ownerFunction.f55579r = s1.k(vm2.e.f126241w, i15, "get(...)");
        ownerFunction.f55584w = !vm2.e.f126242x.c(i15).booleanValue();
        ((p) ((o) p0Var.f82653b).f84119l).getClass();
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
        Intrinsics.checkNotNullParameter((vm2.i) obj2, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        return ownerFunction;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nn2.s f(tm2.i0 r36) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ln2.a0.f(tm2.i0):nn2.s");
    }

    public final List g(List list, zm2.c cVar, b bVar) {
        p0 p0Var = this.f84059a;
        am2.m mVar = (am2.m) p0Var.f82655d;
        Intrinsics.g(mVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        am2.b bVar2 = (am2.b) mVar;
        am2.m g13 = bVar2.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
        e0 a13 = a(g13);
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            a1 a1Var = (a1) obj;
            int i15 = (a1Var.f118166c & 1) == 1 ? a1Var.f118167d : 0;
            bm2.i xVar = (a13 == null || !s1.k(vm2.e.f126221c, i15, "get(...)")) ? bm2.h.f23540a : new nn2.x(p0Var.d(), new z(this, a13, cVar, bVar, i13, a1Var));
            ym2.g L0 = bs1.c.L0((vm2.f) p0Var.f82654c, a1Var.f118168e);
            l0 l0Var = (l0) p0Var.f82659h;
            Object obj2 = p0Var.f82656e;
            pn2.b0 g14 = l0Var.g(lb.l0.B1(a1Var, (vm2.i) obj2));
            boolean k13 = s1.k(vm2.e.H, i15, "get(...)");
            boolean k14 = s1.k(vm2.e.I, i15, "get(...)");
            boolean k15 = s1.k(vm2.e.f126218J, i15, "get(...)");
            vm2.i typeTable = (vm2.i) obj2;
            Intrinsics.checkNotNullParameter(a1Var, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            int i16 = a1Var.f118166c;
            s0 a14 = (i16 & 16) == 16 ? a1Var.f118171h : (i16 & 32) == 32 ? typeTable.a(a1Var.f118172i) : null;
            pn2.b0 g15 = a14 != null ? ((l0) p0Var.f82659h).g(a14) : null;
            v0 NO_SOURCE = w0.f15602a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new b1(bVar2, null, i13, xVar, L0, g14, k13, k14, k15, g15, NO_SOURCE));
            arrayList = arrayList2;
            i13 = i14;
        }
        return CollectionsKt.F0(arrayList);
    }
}
