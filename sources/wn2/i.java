package wn2;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.c0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends AbstractSet {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f130605c = 0;

    /* renamed from: a, reason: collision with root package name */
    public Object f130606a;

    /* renamed from: b, reason: collision with root package name */
    public int f130607b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.HashSet, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i13 = this.f130607b;
        if (i13 == 0) {
            this.f130606a = obj;
        } else if (i13 == 1) {
            if (Intrinsics.d(this.f130606a, obj)) {
                return false;
            }
            this.f130606a = new Object[]{this.f130606a, obj};
        } else if (i13 < 5) {
            Object obj2 = this.f130606a;
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (c0.y(objArr2, obj)) {
                return false;
            }
            int i14 = this.f130607b;
            if (i14 == 4) {
                Object[] elements = Arrays.copyOf(objArr2, objArr2.length);
                Intrinsics.checkNotNullParameter(elements, "elements");
                ?? linkedHashSet = new LinkedHashSet(y0.a(elements.length));
                c0.V(linkedHashSet, elements);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, i14 + 1);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[copyOf.length - 1] = obj;
                objArr = copyOf;
            }
            this.f130606a = objArr;
        } else {
            Object obj3 = this.f130606a;
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!dl2.b.v(obj3).add(obj)) {
                return false;
            }
        }
        this.f130607b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f130606a = null;
        this.f130607b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i13 = this.f130607b;
        if (i13 == 0) {
            return false;
        }
        if (i13 == 1) {
            return Intrinsics.d(this.f130606a, obj);
        }
        if (i13 < 5) {
            Object obj2 = this.f130606a;
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return c0.y((Object[]) obj2, obj);
        }
        Object obj3 = this.f130606a;
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i13 = this.f130607b;
        if (i13 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i13 == 1) {
            return new h(this.f130606a);
        }
        if (i13 < 5) {
            Object obj = this.f130606a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new g((Object[]) obj);
        }
        Object obj2 = this.f130606a;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return dl2.b.v(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f130607b;
    }
}
