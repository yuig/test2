package ln2;

import am2.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;
import pn2.b1;
import pn2.g1;
import pn2.t0;
import pn2.u0;
import tm2.s0;
import tm2.x0;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f84099a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f84100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84101c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84102d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.m f84103e;

    /* renamed from: f, reason: collision with root package name */
    public final on2.m f84104f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f84105g;

    public l0(p0 c13, l0 l0Var, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f84099a = c13;
        this.f84100b = l0Var;
        this.f84101c = debugName;
        this.f84102d = containerPresentableName;
        int i13 = 0;
        this.f84103e = ((on2.q) c13.d()).e(new i0(this, i13));
        this.f84104f = ((on2.q) c13.d()).e(new i0(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = z0.d();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            while (it.hasNext()) {
                x0 x0Var = (x0) it.next();
                linkedHashMap.put(Integer.valueOf(x0Var.f118533d), new nn2.w(this.f84099a, x0Var, i13));
                i13++;
            }
        }
        this.f84105g = linkedHashMap;
    }

    public static pn2.h0 a(pn2.h0 h0Var, pn2.b0 b0Var) {
        xl2.l m13 = kotlin.jvm.internal.j.m(h0Var);
        bm2.i annotations = h0Var.getAnnotations();
        pn2.b0 p13 = kotlin.jvm.internal.j.p(h0Var);
        List n13 = kotlin.jvm.internal.j.n(h0Var);
        List O = CollectionsKt.O(kotlin.jvm.internal.j.r(h0Var));
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(O, 10));
        Iterator it = O.iterator();
        while (it.hasNext()) {
            arrayList.add(((g1) it.next()).getType());
        }
        return kotlin.jvm.internal.j.h(m13, annotations, p13, n13, arrayList, b0Var, true).A0(h0Var.x0());
    }

    public static final ArrayList e(s0 s0Var, l0 l0Var) {
        List list = s0Var.f118454d;
        Intrinsics.checkNotNullExpressionValue(list, "getArgumentList(...)");
        List list2 = list;
        s0 S0 = lb.l0.S0(s0Var, (vm2.i) l0Var.f84099a.f82656e);
        Iterable e13 = S0 != null ? e(S0, l0Var) : null;
        if (e13 == null) {
            e13 = q0.f80391a;
        }
        return CollectionsKt.l0(e13, list2);
    }

    public static u0 f(List list, bm2.i annotations, b1 b1Var, am2.m mVar) {
        u0 a13;
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((pn2.q) ((pn2.s0) it.next())).getClass();
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            if (annotations.isEmpty()) {
                u0.f100848b.getClass();
                a13 = u0.f100849c;
            } else {
                t0 t0Var = u0.f100848b;
                List b13 = kotlin.collections.e0.b(new pn2.m(annotations));
                t0Var.getClass();
                a13 = t0.a(b13);
            }
            arrayList.add(a13);
        }
        ArrayList r13 = kotlin.collections.g0.r(arrayList);
        u0.f100848b.getClass();
        return t0.a(r13);
    }

    public static final am2.g h(l0 l0Var, s0 s0Var, int i13) {
        ym2.b s03 = bs1.c.s0((vm2.f) l0Var.f84099a.f82654c, i13);
        ArrayList u13 = yn2.c0.u(yn2.c0.p(yn2.x.e(s0Var, new cd2.n(l0Var, 15)), k0.f84095i));
        int h10 = yn2.c0.h(yn2.x.e(s03, j0.f84093a));
        while (u13.size() < h10) {
            u13.add(0);
        }
        return ((o) l0Var.f84099a.f82653b).f84118k.m(s03, u13);
    }

    public final List b() {
        return CollectionsKt.F0(this.f84105g.values());
    }

    public final c1 c(int i13) {
        c1 c1Var = (c1) this.f84105g.get(Integer.valueOf(i13));
        if (c1Var != null) {
            return c1Var;
        }
        l0 l0Var = this.f84100b;
        if (l0Var != null) {
            return l0Var.c(i13);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x033b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8, r11) == false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pn2.h0 d(tm2.s0 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ln2.l0.d(tm2.s0, boolean):pn2.h0");
    }

    public final pn2.b0 g(s0 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.f118453c & 2) != 2) {
            return d(proto, true);
        }
        p0 p0Var = this.f84099a;
        String c13 = ((vm2.f) p0Var.f82654c).c(proto.q());
        pn2.h0 d2 = d(proto, true);
        vm2.i typeTable = (vm2.i) p0Var.f82656e;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        s0 a13 = (proto.f118453c & 4) == 4 ? proto.f118457g : proto.w() ? typeTable.a(proto.f118458h) : null;
        Intrinsics.f(a13);
        return ((o) p0Var.f82653b).c().b(proto, c13, d2, d(a13, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f84101c);
        l0 l0Var = this.f84100b;
        if (l0Var == null) {
            str = "";
        } else {
            str = ". Child of " + l0Var.f84101c;
        }
        sb3.append(str);
        return sb3.toString();
    }
}
