package n2;

/* loaded from: classes2.dex */
public final class t extends s {
    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f88961c;
        this.f88961c = i13 + 2;
        Object[] objArr = this.f88959a;
        return new b(objArr[i13], objArr[i13 + 1]);
    }
}
