package ln2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import tm2.a1;
import tm2.s0;
import tm2.x0;

/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final kn2.a f84072a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.l f84073b;

    public e(am2.d0 module, com.google.firebase.messaging.q notFoundClasses, mn2.a protocol) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f84072a = protocol;
        this.f84073b = new tb.l(module, notFoundClasses);
    }

    @Override // ln2.c
    public final Object a(e0 container, tm2.i0 proto, pn2.b0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // ln2.c
    public final Object b(e0 container, tm2.i0 proto, pn2.b0 expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        tm2.e eVar = (tm2.e) ao2.m0.w(proto, this.f84072a.f80288m);
        if (eVar == null) {
            return null;
        }
        return this.f84073b.C(expectedType, eVar, container.f84074a);
    }

    @Override // ln2.g
    public final List c(c0 container, tm2.v proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.j(this.f84072a.f80287l);
        if (iterable == null) {
            iterable = q0.f80391a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List d(e0 container, zm2.c proto, b kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z13 = proto instanceof tm2.a0;
        List list = null;
        kn2.a aVar = this.f84072a;
        if (z13) {
            zm2.s sVar = aVar.f80280e;
            if (sVar != null) {
                list = (List) ((tm2.a0) proto).j(sVar);
            }
        } else {
            if (!(proto instanceof tm2.i0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i13 = d.f84070a[kind.ordinal()];
            if (i13 != 1 && i13 != 2 && i13 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            zm2.s sVar2 = aVar.f80284i;
            if (sVar2 != null) {
                list = (List) ((tm2.i0) proto).j(sVar2);
            }
        }
        if (list == null) {
            list = q0.f80391a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List e(e0 container, tm2.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        zm2.s sVar = this.f84072a.f80285j;
        List list = sVar != null ? (List) proto.j(sVar) : null;
        if (list == null) {
            list = q0.f80391a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final ArrayList f(c0 container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Iterable iterable = (List) container.f84065d.j(this.f84072a.f80278c);
        if (iterable == null) {
            iterable = q0.f80391a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final ArrayList g(s0 proto, vm2.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.j(this.f84072a.f80290o);
        if (iterable == null) {
            iterable = q0.f80391a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List h(e0 container, zm2.c proto, b kind) {
        List list;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean z13 = proto instanceof tm2.m;
        kn2.a aVar = this.f84072a;
        if (z13) {
            list = (List) ((tm2.m) proto).j(aVar.f80277b);
        } else if (proto instanceof tm2.a0) {
            list = (List) ((tm2.a0) proto).j(aVar.f80279d);
        } else {
            if (!(proto instanceof tm2.i0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i13 = d.f84070a[kind.ordinal()];
            if (i13 == 1) {
                list = (List) ((tm2.i0) proto).j(aVar.f80281f);
            } else if (i13 == 2) {
                list = (List) ((tm2.i0) proto).j(aVar.f80282g);
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                list = (List) ((tm2.i0) proto).j(aVar.f80283h);
            }
        }
        if (list == null) {
            list = q0.f80391a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List i(e0 container, zm2.c callableProto, b kind, int i13, a1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Iterable iterable = (List) proto.j(this.f84072a.f80289n);
        if (iterable == null) {
            iterable = q0.f80391a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final ArrayList j(x0 proto, vm2.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.j(this.f84072a.f80291p);
        if (iterable == null) {
            iterable = q0.f80391a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // ln2.g
    public final List k(e0 container, tm2.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        zm2.s sVar = this.f84072a.f80286k;
        List list = sVar != null ? (List) proto.j(sVar) : null;
        if (list == null) {
            list = q0.f80391a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f84073b.e((tm2.h) it.next(), container.f84074a));
        }
        return arrayList;
    }
}
