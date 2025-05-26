package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"kotlin/collections/e0", "kotlin/collections/f0", "kotlin/collections/g0", "kotlin/collections/h0", "kotlin/collections/i0", "kotlin/collections/j0", "kotlin/collections/k0", "kotlin/collections/l0", "kotlin/collections/m0", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static boolean[] A0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            zArr[i13] = ((Boolean) it.next()).booleanValue();
            i13++;
        }
        return zArr;
    }

    public static byte[] B0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            bArr[i13] = ((Number) it.next()).byteValue();
            i13++;
        }
        return bArr;
    }

    public static float[] C0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            fArr[i13] = ((Number) it.next()).floatValue();
            i13++;
        }
        return fArr;
    }

    public static HashSet D0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashSet hashSet = new HashSet(y0.a(g0.q(arrayList, 12)));
        CollectionsKt___CollectionsKt.I(arrayList, hashSet);
        return hashSet;
    }

    public static int[] E0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            iArr[i13] = ((Number) it.next()).intValue();
            i13++;
        }
        return iArr;
    }

    public static List F0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return f0.m(CollectionsKt___CollectionsKt.J(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return q0.f80391a;
        }
        if (size != 1) {
            return H0(collection);
        }
        return e0.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] G0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            jArr[i13] = ((Number) it.next()).longValue();
            i13++;
        }
        return jArr;
    }

    public static ArrayList H0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet I0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.I(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set J0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.I(iterable, linkedHashSet);
            return h1.e(linkedHashSet);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s0.f80394a;
        }
        if (size == 1) {
            return g1.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(y0.a(collection.size()));
        CollectionsKt___CollectionsKt.I(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static q5.w0 K(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new q5.w0(iterable, 2);
    }

    public static LinkedHashSet K0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        LinkedHashSet I0 = I0(iterable);
        k0.u(other, I0);
        return I0;
    }

    public static boolean L(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : V(iterable, obj) >= 0;
    }

    public static ArrayList L0(Iterable iterable, int i13, int i14, boolean z13) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        kg.o.g(i13, i14);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            arrayList = new ArrayList((size / i14) + (size % i14 == 0 ? 0 : 1));
            int i15 = 0;
            while (i15 >= 0 && i15 < size) {
                int i16 = size - i15;
                if (i13 <= i16) {
                    i16 = i13;
                }
                if (i16 < i13 && !z13) {
                    break;
                }
                ArrayList arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 < i16; i17++) {
                    arrayList2.add(list.get(i17 + i15));
                }
                arrayList.add(arrayList2);
                i15 += i14;
            }
        } else {
            arrayList = new ArrayList();
            Iterator O = kg.o.O(iterable.iterator(), i13, i14, z13, false);
            while (O.hasNext()) {
                arrayList.add((List) O.next());
            }
        }
        return arrayList;
    }

    public static List M(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return F0(I0(iterable));
    }

    public static t0 M0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new t0(new o0(iterable));
    }

    public static List N(Iterable iterable, int i13) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
        }
        if (i13 == 0) {
            return F0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i13;
            if (size <= 0) {
                return q0.f80391a;
            }
            if (size == 1) {
                return e0.b(a0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i13 < size2) {
                        arrayList.add(((List) iterable).get(i13));
                        i13++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i13);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i14 = 0;
        for (Object obj : iterable) {
            if (i14 >= i13) {
                arrayList.add(obj);
            } else {
                i14++;
            }
        }
        return f0.m(arrayList);
    }

    public static ArrayList N0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(g0.q(iterable, 10), g0.q(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List O(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return y0(list2, size);
    }

    public static ArrayList P(Iterable iterable, Function1 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList Q(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object R(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return S((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object S(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object T(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object U(int i13, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i13 < 0 || i13 > f0.i(list)) {
            return null;
        }
        return list.get(i13);
    }

    public static int V(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i13 = 0;
        for (Object obj2 : iterable) {
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            if (Intrinsics.d(obj, obj2)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static int W(Object obj, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(obj);
    }

    public static LinkedHashSet X(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        LinkedHashSet I0 = I0(iterable);
        Intrinsics.checkNotNullParameter(I0, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        I0.retainAll(k0.w(elements));
        return I0;
    }

    public static String Z(Iterable iterable, CharSequence charSequence, String str, String str2, int i13, String str3, Function1 function1, int i14) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i14 & 2) != 0 ? "" : str;
        String postfix = (i14 & 4) != 0 ? "" : str2;
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            str3 = "...";
        }
        String truncated = str3;
        if ((i14 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        CollectionsKt___CollectionsKt.H(iterable, sb3, separator, prefix, postfix, i15, truncated, function1);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static Object a0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return b0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object b0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(f0.i(list));
    }

    public static Object c0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return ep.b.i(list, 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object d0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return ep.b.i(list, 1);
    }

    public static Comparable e0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object f0(ArrayList arrayList, j0.a comparator) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Comparable g0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList h0(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
        boolean z13 = false;
        for (Object obj2 : iterable) {
            boolean z14 = true;
            if (!z13 && Intrinsics.d(obj2, obj)) {
                z13 = true;
                z14 = false;
            }
            if (z14) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List i0(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection w13 = k0.w(elements);
        if (w13.isEmpty()) {
            return F0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!w13.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList j0(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return l0(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        k0.u(iterable, arrayList);
        k0.u(elements, arrayList);
        return arrayList;
    }

    public static ArrayList k0(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        k0.u(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList l0(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            k0.u(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList m0(Object obj, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList n0(Collection collection, yn2.i elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        yn2.h hVar = new yn2.h(elements);
        while (hVar.hasNext()) {
            arrayList.add(hVar.next());
        }
        return arrayList;
    }

    public static Object o0(Collection collection, ol2.e random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Collection collection2 = collection;
        int size = collection.size();
        random.getClass();
        return CollectionsKt___CollectionsKt.G(collection2, ol2.f.f96455b.i(size));
    }

    public static Object p0(Collection collection, ol2.e random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        Collection collection2 = collection;
        int size = collection.size();
        random.getClass();
        return CollectionsKt___CollectionsKt.G(collection2, ol2.f.f96455b.i(size));
    }

    public static List q0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return F0(iterable);
        }
        List J2 = CollectionsKt___CollectionsKt.J(iterable);
        Intrinsics.checkNotNullParameter(J2, "<this>");
        Collections.reverse(J2);
        return J2;
    }

    public static Object r0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return s0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object s0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object t0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object u0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List v0(List list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return q0.f80391a;
        }
        return F0(list.subList(indices.f80453a, indices.f80454b + 1));
    }

    public static List w0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List J2 = CollectionsKt___CollectionsKt.J(iterable);
            j0.s(J2);
            return J2;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        z.u((Comparable[]) array);
        return z.d(array);
    }

    public static List x0(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List J2 = CollectionsKt___CollectionsKt.J(iterable);
            j0.t(J2, comparator);
            return J2;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return z.d(array);
    }

    public static List y0(Iterable iterable, int i13) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
        }
        if (i13 == 0) {
            return q0.f80391a;
        }
        if (iterable instanceof Collection) {
            if (i13 >= ((Collection) iterable).size()) {
                return F0(iterable);
            }
            if (i13 == 1) {
                return e0.b(R(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i13);
        Iterator it = iterable.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i14++;
            if (i14 == i13) {
                break;
            }
        }
        return f0.m(arrayList);
    }

    public static List z0(int i13, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
        }
        if (i13 == 0) {
            return q0.f80391a;
        }
        int size = list.size();
        if (i13 >= size) {
            return F0(list);
        }
        if (i13 == 1) {
            return e0.b(b0(list));
        }
        ArrayList arrayList = new ArrayList(i13);
        if (list instanceof RandomAccess) {
            for (int i14 = size - i13; i14 < size; i14++) {
                arrayList.add(list.get(i14));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i13);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }
}
