package xk2;

import g1.s0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 implements Collection, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f135220a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ short[] b() {
        return this.f135220a;
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        short s13 = ((i0) obj).f135213a;
        short[] sArr = this.f135220a;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        int i13 = 0;
        while (i13 < length) {
            if (s13 == sArr[i13]) {
                return i13 >= 0;
            }
            i13++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r5 < 0) goto L22;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L15
            goto L45
        L15:
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            boolean r2 = r0 instanceof xk2.i0
            r3 = 0
            if (r2 == 0) goto L44
            xk2.i0 r0 = (xk2.i0) r0
            short r0 = r0.f135213a
            short[] r2 = r7.f135220a
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            int r4 = r2.length
            r5 = r3
        L38:
            if (r5 >= r4) goto L44
            short r6 = r2[r5]
            if (r0 != r6) goto L41
            if (r5 < 0) goto L44
            goto L19
        L41:
            int r5 = r5 + 1
            goto L38
        L44:
            r1 = r3
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xk2.j0.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return Intrinsics.d(this.f135220a, ((j0) obj).f135220a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f135220a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f135220a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s0(this.f135220a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f135220a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.J(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f135220a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.j.K(this, array);
    }
}
