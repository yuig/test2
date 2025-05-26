package rm2;

import am2.w0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tm2.s0;
import tm2.x0;

/* loaded from: classes2.dex */
public abstract class f implements ln2.c, ln2.g {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f108730a;

    /* renamed from: b, reason: collision with root package name */
    public final on2.n f108731b;

    public f(on2.q storageManager, fm2.d kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f108730a = kotlinClassFinder;
        this.f108731b = storageManager.d(new e82.l(this, 22));
    }

    public static /* synthetic */ List m(f fVar, ln2.e0 e0Var, j0 j0Var, boolean z13, Boolean bool, boolean z14, int i13) {
        boolean z15 = (i13 & 4) != 0 ? false : z13;
        if ((i13 & 16) != 0) {
            bool = null;
        }
        return fVar.l(e0Var, j0Var, z15, false, bool, (i13 & 32) != 0 ? false : z14);
    }

    public static j0 n(zm2.c proto, vm2.f nameResolver, vm2.i typeTable, ln2.b kind, boolean z13) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof tm2.m) {
            zm2.k kVar = xm2.j.f135411a;
            xm2.e a13 = xm2.j.a((tm2.m) proto, nameResolver, typeTable);
            if (a13 == null) {
                return null;
            }
            return i0.g(a13);
        }
        if (proto instanceof tm2.a0) {
            zm2.k kVar2 = xm2.j.f135411a;
            xm2.e c13 = xm2.j.c((tm2.a0) proto, nameResolver, typeTable);
            if (c13 == null) {
                return null;
            }
            return i0.g(c13);
        }
        if (!(proto instanceof tm2.i0)) {
            return null;
        }
        zm2.s propertySignature = wm2.l.f130417d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        wm2.f fVar = (wm2.f) ao2.m0.w((zm2.q) proto, propertySignature);
        if (fVar == null) {
            return null;
        }
        int i13 = h.f108733a[kind.ordinal()];
        if (i13 == 1) {
            if ((fVar.f130374b & 4) != 4) {
                return null;
            }
            wm2.d dVar = fVar.f130377e;
            Intrinsics.checkNotNullExpressionValue(dVar, "getGetter(...)");
            return i0.h(nameResolver, dVar);
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return null;
            }
            return e0.t.u((tm2.i0) proto, nameResolver, typeTable, true, true, z13);
        }
        if ((fVar.f130374b & 8) != 8) {
            return null;
        }
        wm2.d dVar2 = fVar.f130378f;
        Intrinsics.checkNotNullExpressionValue(dVar2, "getSetter(...)");
        return i0.h(nameResolver, dVar2);
    }

    @Override // ln2.c
    public final Object a(ln2.e0 container, tm2.i0 proto, pn2.b0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return r(container, proto, ln2.b.PROPERTY_GETTER, expectedType, a.f108721i);
    }

    @Override // ln2.c
    public final Object b(ln2.e0 container, tm2.i0 proto, pn2.b0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return r(container, proto, ln2.b.PROPERTY, expectedType, e.f108729i);
    }

    @Override // ln2.g
    public final List c(ln2.c0 container, tm2.v proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        String c13 = container.f84074a.c(proto.f118511d);
        String c14 = container.f84067f.c();
        Intrinsics.checkNotNullExpressionValue(c14, "asString(...)");
        return m(this, container, i0.f(c13, xm2.b.b(c14)), false, null, false, 60);
    }

    @Override // ln2.g
    public final List d(ln2.e0 container, zm2.c proto, ln2.b kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        j0 n13 = n(proto, container.f84074a, container.f84075b, kind, false);
        return n13 != null ? m(this, container, i0.j(n13, 0), false, null, false, 60) : q0.f80391a;
    }

    @Override // ln2.g
    public final List e(ln2.e0 container, tm2.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return s(container, proto, g.BACKING_FIELD);
    }

    @Override // ln2.g
    public final ArrayList f(ln2.c0 container) {
        Intrinsics.checkNotNullParameter(container, "container");
        w0 w0Var = container.f84076c;
        h0 h0Var = w0Var instanceof h0 ? (h0) w0Var : null;
        f0 kotlinClass = h0Var != null ? h0Var.f108734b : null;
        if (kotlinClass == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        i visitor = new i(this, arrayList);
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        b7.c.H(((fm2.c) kotlinClass).f62576a, visitor);
        return arrayList;
    }

    @Override // ln2.g
    public final ArrayList g(s0 proto, vm2.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object j13 = proto.j(wm2.l.f130419f);
        Intrinsics.checkNotNullExpressionValue(j13, "getExtension(...)");
        Iterable<tm2.h> iterable = (Iterable) j13;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable, 10));
        for (tm2.h proto2 : iterable) {
            Intrinsics.f(proto2);
            Intrinsics.checkNotNullParameter(proto2, "proto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            arrayList.add(((o) this).f108766e.e(proto2, nameResolver));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List h(ln2.e0 container, zm2.c proto, ln2.b kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == ln2.b.PROPERTY) {
            return s(container, (tm2.i0) proto, g.PROPERTY);
        }
        j0 n13 = n(proto, container.f84074a, container.f84075b, kind, false);
        return n13 == null ? q0.f80391a : m(this, container, n13, false, null, false, 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if ((r9.f118325c & 64) != 64) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9.f84069h != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if ((r9.f118145c & 64) != 64) goto L26;
     */
    @Override // ln2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List i(ln2.e0 r8, zm2.c r9, ln2.b r10, int r11, tm2.a1 r12) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "callableProto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            vm2.f r12 = r8.f84074a
            vm2.i r0 = r8.f84075b
            r1 = 0
            rm2.j0 r10 = n(r9, r12, r0, r10, r1)
            if (r10 == 0) goto L8c
            boolean r12 = r9 instanceof tm2.a0
            r0 = 64
            java.lang.String r2 = "<this>"
            r3 = 1
            if (r12 == 0) goto L3a
            tm2.a0 r9 = (tm2.a0) r9
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            boolean r12 = r9.t()
            if (r12 != 0) goto L38
            int r9 = r9.f118145c
            r9 = r9 & r0
            if (r9 != r0) goto L63
        L38:
            r1 = r3
            goto L63
        L3a:
            boolean r12 = r9 instanceof tm2.i0
            if (r12 == 0) goto L4f
            tm2.i0 r9 = (tm2.i0) r9
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            boolean r12 = r9.t()
            if (r12 != 0) goto L38
            int r9 = r9.f118325c
            r9 = r9 & r0
            if (r9 != r0) goto L63
            goto L38
        L4f:
            boolean r12 = r9 instanceof tm2.m
            if (r12 == 0) goto L74
            r9 = r8
            ln2.c0 r9 = (ln2.c0) r9
            tm2.j r12 = tm2.j.ENUM_CLASS
            tm2.j r0 = r9.f84068g
            if (r0 != r12) goto L5e
            r1 = 2
            goto L63
        L5e:
            boolean r9 = r9.f84069h
            if (r9 == 0) goto L63
            goto L38
        L63:
            int r11 = r11 + r1
            rm2.j0 r2 = rm2.i0.j(r10, r11)
            r3 = 0
            r6 = 60
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r8
            java.util.List r8 = m(r0, r1, r2, r3, r4, r5, r6)
            goto L8e
        L74:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported message: "
            r10.<init>(r11)
            java.lang.Class r9 = r9.getClass()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L8c:
            kotlin.collections.q0 r8 = kotlin.collections.q0.f80391a
        L8e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rm2.f.i(ln2.e0, zm2.c, ln2.b, int, tm2.a1):java.util.List");
    }

    @Override // ln2.g
    public final ArrayList j(x0 proto, vm2.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object j13 = proto.j(wm2.l.f130421h);
        Intrinsics.checkNotNullExpressionValue(j13, "getExtension(...)");
        Iterable<tm2.h> iterable = (Iterable) j13;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable, 10));
        for (tm2.h proto2 : iterable) {
            Intrinsics.f(proto2);
            Intrinsics.checkNotNullParameter(proto2, "proto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            arrayList.add(((o) this).f108766e.e(proto2, nameResolver));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List k(ln2.e0 container, tm2.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return s(container, proto, g.DELEGATE_FIELD);
    }

    public final List l(ln2.e0 container, j0 j0Var, boolean z13, boolean z14, Boolean bool, boolean z15) {
        f0 binaryClass = re2.f.g(container, z13, z14, bool, z15, this.f108730a, ((o) this).f108767f);
        Intrinsics.checkNotNullParameter(container, "container");
        if (binaryClass == null) {
            if (container instanceof ln2.c0) {
                w0 w0Var = ((ln2.c0) container).f84076c;
                h0 h0Var = w0Var instanceof h0 ? (h0) w0Var : null;
                if (h0Var != null) {
                    binaryClass = h0Var.f108734b;
                }
            }
            binaryClass = null;
        }
        if (binaryClass == null) {
            return q0.f80391a;
        }
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        List list = (List) ((j) this.f108731b.invoke(binaryClass)).f108738b.get(j0Var);
        return list == null ? q0.f80391a : list;
    }

    public final boolean o(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.f() == null || !Intrinsics.d(classId.i().b(), "Container")) {
            return false;
        }
        f0 klass = dl2.b.n0(this.f108730a, classId, ((o) this).f108767f);
        if (klass == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = wl2.b.f130214a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        wl2.a visitor = new wl2.a(f0Var);
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        b7.c.H(((fm2.c) klass).f62576a, visitor);
        return f0Var.f80424a;
    }

    public abstract n p(ym2.b bVar, w0 w0Var, List list);

    public final n q(ym2.b annotationClassId, fm2.a source, List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (wl2.b.f130214a.contains(annotationClassId)) {
            return null;
        }
        return p(annotationClassId, source, result);
    }

    public final Object r(ln2.e0 container, tm2.i0 i0Var, ln2.b bVar, pn2.b0 b0Var, Function2 function2) {
        Object invoke;
        dn2.z zVar;
        f0 g13 = re2.f.g(container, true, true, vm2.e.B.c(i0Var.f118326d), xm2.j.d(i0Var), this.f108730a, ((o) this).f108767f);
        Intrinsics.checkNotNullParameter(container, "container");
        if (g13 == null) {
            if (container instanceof ln2.c0) {
                w0 w0Var = ((ln2.c0) container).f84076c;
                h0 h0Var = w0Var instanceof h0 ? (h0) w0Var : null;
                if (h0Var != null) {
                    g13 = h0Var.f108734b;
                }
            }
            g13 = null;
        }
        if (g13 == null) {
            return null;
        }
        xm2.g gVar = ((fm2.c) g13).f62577b.f113275b;
        xm2.g version = r.f108784e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(version, "version");
        j0 n13 = n(i0Var, container.f84074a, container.f84075b, bVar, gVar.a(version.f126211b, version.f126212c, version.f126213d));
        if (n13 == null || (invoke = function2.invoke(this.f108731b.invoke(g13), n13)) == null) {
            return null;
        }
        if (!xl2.v.c(b0Var)) {
            return invoke;
        }
        dn2.g constant = (dn2.g) invoke;
        Intrinsics.checkNotNullParameter(constant, "constant");
        if (constant instanceof dn2.d) {
            zVar = new dn2.z(((Number) ((dn2.d) constant).f55623a).byteValue());
        } else if (constant instanceof dn2.w) {
            zVar = new dn2.z(((Number) ((dn2.w) constant).f55623a).shortValue());
        } else if (constant instanceof dn2.k) {
            zVar = new dn2.z(((Number) ((dn2.k) constant).f55623a).intValue());
        } else {
            if (!(constant instanceof dn2.u)) {
                return constant;
            }
            zVar = new dn2.z(((Number) ((dn2.u) constant).f55623a).longValue());
        }
        return zVar;
    }

    public final List s(ln2.e0 e0Var, tm2.i0 i0Var, g gVar) {
        j0 u13;
        j0 u14;
        Boolean c13 = vm2.e.B.c(i0Var.f118326d);
        Intrinsics.checkNotNullExpressionValue(c13, "get(...)");
        boolean d2 = xm2.j.d(i0Var);
        if (gVar == g.PROPERTY) {
            u14 = e0.t.u(i0Var, e0Var.f84074a, e0Var.f84075b, (r13 & 8) != 0 ? false : false, (r13 & 16) != 0 ? false : true, true);
            return u14 == null ? q0.f80391a : m(this, e0Var, u14, true, c13, d2, 8);
        }
        u13 = e0.t.u(i0Var, e0Var.f84074a, e0Var.f84075b, (r13 & 8) != 0 ? false : true, (r13 & 16) != 0 ? false : false, true);
        if (u13 == null) {
            return q0.f80391a;
        }
        return StringsKt.E(u13.f108741a, "$delegate", false) != (gVar == g.DELEGATE_FIELD) ? q0.f80391a : l(e0Var, u13, true, true, c13, d2);
    }
}
