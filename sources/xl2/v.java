package xl2;

import am2.i0;
import dm2.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.t1;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f135339a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f135340b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f135341c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f135342d;

    static {
        u[] values = u.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (u uVar : values) {
            arrayList.add(uVar.getTypeName());
        }
        f135339a = CollectionsKt.J0(arrayList);
        t[] values2 = t.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (t tVar : values2) {
            arrayList2.add(tVar.getTypeName());
        }
        CollectionsKt.J0(arrayList2);
        f135340b = new HashMap();
        f135341c = new HashMap();
        z0.f(new Pair(t.UBYTEARRAY, ym2.g.e("ubyteArrayOf")), new Pair(t.USHORTARRAY, ym2.g.e("ushortArrayOf")), new Pair(t.UINTARRAY, ym2.g.e("uintArrayOf")), new Pair(t.ULONGARRAY, ym2.g.e("ulongArrayOf")));
        u[] values3 = u.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (u uVar2 : values3) {
            linkedHashSet.add(uVar2.getArrayClassId().i());
        }
        f135342d = linkedHashSet;
        for (u uVar3 : u.values()) {
            f135340b.put(uVar3.getArrayClassId(), uVar3.getClassId());
            f135341c.put(uVar3.getClassId(), uVar3.getArrayClassId());
        }
    }

    public static ym2.b a(ym2.b arrayClassId) {
        Intrinsics.checkNotNullParameter(arrayClassId, "arrayClassId");
        return (ym2.b) f135340b.get(arrayClassId);
    }

    public static boolean b(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f135342d.contains(name);
    }

    public static final boolean c(b0 type) {
        am2.j descriptor;
        Intrinsics.checkNotNullParameter(type, "type");
        if (t1.p(type) || (descriptor = type.w0().b()) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        am2.m g13 = descriptor.g();
        return (g13 instanceof i0) && Intrinsics.d(((k0) ((i0) g13)).f55454e, r.f135332l) && f135339a.contains(descriptor.getName());
    }
}
