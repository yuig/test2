package in2;

import a.cb;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final re2.h f72849c = new re2.h(29, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f72850d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f72851e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f72852f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f72853g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f72854h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f72855i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f72856j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f72857k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f72858l;

    /* renamed from: m, reason: collision with root package name */
    public static final g f72859m;

    /* renamed from: n, reason: collision with root package name */
    public static final g f72860n;

    /* renamed from: o, reason: collision with root package name */
    public static final g f72861o;

    /* renamed from: p, reason: collision with root package name */
    public static final g f72862p;

    /* renamed from: q, reason: collision with root package name */
    public static final ArrayList f72863q;

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayList f72864r;

    /* renamed from: a, reason: collision with root package name */
    public final List f72865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72866b;

    static {
        f fVar;
        int i13 = 1 << 1;
        int i14 = i13 << 1;
        f72851e = i13;
        int i15 = i13 << 2;
        f72852f = i14;
        int i16 = i13 << 3;
        f72853g = i15;
        int i17 = i13 << 4;
        f72854h = i16;
        f72855i = i17;
        int i18 = (i13 << 5) - 1;
        f72856j = i18;
        int i19 = 1 | i13 | i14;
        f72857k = i19;
        f72858l = new g(i18);
        f72859m = new g(i16 | i17);
        new g(1);
        new g(i13);
        new g(i14);
        f72860n = new g(i19);
        new g(i15);
        f72861o = new g(i16);
        f72862p = new g(i17);
        new g(i13 | i16 | i17);
        Field[] fields = g.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            f fVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            g gVar = obj instanceof g ? (g) obj : null;
            if (gVar != null) {
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                fVar2 = new f(gVar.f72866b, name);
            }
            if (fVar2 != null) {
                arrayList2.add(fVar2);
            }
        }
        f72863q = arrayList2;
        Field[] fields2 = g.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.d(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                fVar = new f(intValue, name2);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                arrayList5.add(fVar);
            }
        }
        f72864r = arrayList5;
    }

    public g(int i13, List excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f72865a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i13 &= ~((e) it.next()).a();
        }
        this.f72866b = i13;
    }

    public final boolean a(int i13) {
        return (i13 & this.f72866b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        g gVar = (g) obj;
        return Intrinsics.d(this.f72865a, gVar.f72865a) && this.f72866b == gVar.f72866b;
    }

    public final int hashCode() {
        return (this.f72865a.hashCode() * 31) + this.f72866b;
    }

    public final String toString() {
        Object obj;
        Iterator it = f72863q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((f) obj).f72847a == this.f72866b) {
                break;
            }
        }
        f fVar = (f) obj;
        String str = fVar != null ? fVar.f72848b : null;
        if (str == null) {
            ArrayList arrayList = f72864r;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next();
                String str2 = a(fVar2.f72847a) ? fVar2.f72848b : null;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = CollectionsKt.Z(arrayList2, " | ", null, null, 0, null, null, 62);
        }
        return d7.g.k(cb.o("DescriptorKindFilter(", str, ", "), this.f72865a, ')');
    }

    public g(int i13) {
        this(i13, q0.f80391a);
    }
}
