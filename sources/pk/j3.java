package pk;

/* loaded from: classes.dex */
public final class j3 extends o1 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f100437d;

    public j3(Object obj) {
        obj.getClass();
        this.f100437d = obj;
    }

    @Override // pk.o1, pk.v0
    public final c1 b() {
        return c1.v(this.f100437d);
    }

    @Override // pk.v0
    public final int c(int i13, Object[] objArr) {
        objArr[i13] = this.f100437d;
        return i13 + 1;
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f100437d.equals(obj);
    }

    @Override // pk.o1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f100437d.hashCode();
    }

    @Override // pk.v0
    public final boolean i() {
        return false;
    }

    @Override // pk.v0
    /* renamed from: j */
    public final n3 iterator() {
        return new y1(this.f100437d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f100437d.toString() + ']';
    }

    @Override // pk.o1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
