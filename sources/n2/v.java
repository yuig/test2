package n2;

/* loaded from: classes2.dex */
public final class v extends s {

    /* renamed from: d, reason: collision with root package name */
    public final i f88962d;

    public v(i iVar) {
        this.f88962d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f88961c;
        this.f88961c = i13 + 2;
        Object[] objArr = this.f88959a;
        return new c(this.f88962d, objArr[i13], objArr[i13 + 1]);
    }
}
