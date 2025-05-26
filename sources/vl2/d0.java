package vl2;

import am2.p0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb.l0;
import pn2.h0;
import ul2.c2;
import ul2.i0;

/* loaded from: classes4.dex */
public final class d0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Method f126165a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f126166b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f126167c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f126168d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f126169e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    public d0(am2.x descriptor, i0 container, String constructorDesc, List originalParameters) {
        ?? b13;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
        Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
        Method g13 = container.g("constructor-impl", constructorDesc);
        Intrinsics.f(g13);
        this.f126165a = g13;
        Method g14 = container.g("box-impl", StringsKt.S("V", constructorDesc) + gm2.d.b(container.c()));
        Intrinsics.f(g14);
        this.f126166b = g14;
        List list = originalParameters;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List list2 = null;
            if (!it.hasNext()) {
                break;
            }
            pn2.b0 type = ((p0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            h0 x13 = l0.x(type);
            ArrayList R = com.bumptech.glide.c.R(x13);
            if (R == null) {
                Class o13 = com.bumptech.glide.c.o1(x13);
                if (o13 != null) {
                    list2 = kotlin.collections.e0.b(com.bumptech.glide.c.O(o13, descriptor));
                }
            } else {
                list2 = R;
            }
            arrayList.add(list2);
        }
        this.f126167c = arrayList;
        ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            am2.j b14 = ((p0) obj).getType().w0().b();
            Intrinsics.g(b14, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            am2.g gVar = (am2.g) b14;
            List list3 = (List) this.f126167c.get(i13);
            if (list3 != null) {
                List list4 = list3;
                b13 = new ArrayList(g0.q(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    b13.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class k13 = c2.k(gVar);
                Intrinsics.f(k13);
                b13 = kotlin.collections.e0.b(k13);
            }
            arrayList2.add(b13);
            i13 = i14;
        }
        this.f126168d = arrayList2;
        this.f126169e = g0.r(arrayList2);
    }

    @Override // vl2.g
    public final List a() {
        return this.f126169e;
    }

    @Override // vl2.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // vl2.g
    public final Object call(Object[] args) {
        ?? b13;
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList other = this.f126167c;
        Intrinsics.checkNotNullParameter(args, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = args.length;
        ArrayList arrayList = new ArrayList(Math.min(g0.q(other, 10), length));
        int i13 = 0;
        for (Object obj : other) {
            if (i13 >= length) {
                break;
            }
            arrayList.add(new Pair(args[i13], obj));
            i13++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj2 = pair.f80346a;
            List list = (List) pair.f80347b;
            if (list != null) {
                List list2 = list;
                b13 = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    b13.add(((Method) it2.next()).invoke(obj2, new Object[0]));
                }
            } else {
                b13 = kotlin.collections.e0.b(obj2);
            }
            k0.u((Iterable) b13, arrayList2);
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        this.f126165a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f126166b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // vl2.g
    public final Type getReturnType() {
        Class<?> returnType = this.f126166b.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return returnType;
    }
}
