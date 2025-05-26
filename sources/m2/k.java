package m2;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f85689c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f85690d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85691e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i13, int i14, int i15) {
        super(i13, i14);
        this.f85689c = i15;
        Object[] objArr2 = new Object[i15];
        this.f85690d = objArr2;
        ?? r53 = i13 == i14 ? 1 : 0;
        this.f85691e = r53;
        objArr2[0] = objArr;
        c(i13 - r53, 1);
    }

    public final Object b() {
        int i13 = this.f85663a & 31;
        Object obj = this.f85690d[this.f85689c - 1];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i13];
    }

    public final void c(int i13, int i14) {
        int i15 = (this.f85689c - i14) * 5;
        while (i14 < this.f85689c) {
            Object[] objArr = this.f85690d;
            Object obj = objArr[i14 - 1];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i14] = ((Object[]) obj)[d7.b.b0(i13, i15)];
            i15 -= 5;
            i14++;
        }
    }

    public final void d(int i13) {
        int i14 = 0;
        while (d7.b.b0(this.f85663a, i14) == i13) {
            i14 += 5;
        }
        if (i14 > 0) {
            c(this.f85663a, ((this.f85689c - 1) - (i14 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b13 = b();
        int i13 = this.f85663a + 1;
        this.f85663a = i13;
        if (i13 == this.f85664b) {
            this.f85691e = true;
            return b13;
        }
        d(0);
        return b13;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f85663a--;
        if (this.f85691e) {
            this.f85691e = false;
            return b();
        }
        d(31);
        return b();
    }
}
