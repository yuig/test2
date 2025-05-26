package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public class k0 extends j0 {
    public static Object A(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object B(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(f0.i(arrayList));
    }

    public static void C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return;
        }
        list.remove(f0.i(list));
    }

    public static void u(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void v(Collection collection, Object[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        collection.addAll(z.d(elements));
    }

    public static final Collection w(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = CollectionsKt.F0(iterable);
        }
        return (Collection) iterable;
    }

    public static final boolean x(Iterable iterable, Function1 function1, boolean z13) {
        Iterator it = iterable.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z13) {
                it.remove();
                z14 = true;
            }
        }
        return z14;
    }

    public static void y(List list, Function1 predicate) {
        int i13;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if ((list instanceof ll2.a) && !(list instanceof ll2.b)) {
                dl2.b.N2(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                x(list, predicate, true);
                return;
            } catch (ClassCastException e13) {
                Intrinsics.m(dl2.b.class.getName(), e13);
                throw e13;
            }
        }
        int i14 = 0;
        ql2.k it = new IntRange(0, f0.i(list), 1).iterator();
        while (it.f104109c) {
            int b13 = it.b();
            Object obj = list.get(b13);
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (i14 != b13) {
                    list.set(i14, obj);
                }
                i14++;
            }
        }
        if (i14 >= list.size() || i14 > (i13 = f0.i(list))) {
            return;
        }
        while (true) {
            list.remove(i13);
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static Object z(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }
}
