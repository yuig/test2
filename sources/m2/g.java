package m2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f85680c;

    /* renamed from: d, reason: collision with root package name */
    public final k f85681d;

    public g(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        super(i13, i14);
        this.f85680c = objArr2;
        int i16 = (i14 - 1) & (-32);
        this.f85681d = new k(objArr, i13 > i16 ? i16 : i13, i16, i15);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f85681d;
        if (kVar.hasNext()) {
            this.f85663a++;
            return kVar.next();
        }
        int i13 = this.f85663a;
        this.f85663a = i13 + 1;
        return this.f85680c[i13 - kVar.f85664b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f85663a;
        k kVar = this.f85681d;
        int i14 = kVar.f85664b;
        if (i13 <= i14) {
            this.f85663a = i13 - 1;
            return kVar.previous();
        }
        int i15 = i13 - 1;
        this.f85663a = i15;
        return this.f85680c[i15 - i14];
    }
}
