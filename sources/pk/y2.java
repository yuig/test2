package pk;

/* loaded from: classes3.dex */
public final class y2 extends o1 {

    /* renamed from: d, reason: collision with root package name */
    public final transient h1 f100523d;

    /* renamed from: e, reason: collision with root package name */
    public final transient c1 f100524e;

    public y2(h1 h1Var, z2 z2Var) {
        this.f100523d = h1Var;
        this.f100524e = z2Var;
    }

    @Override // pk.o1, pk.v0
    public final c1 b() {
        return this.f100524e;
    }

    @Override // pk.v0
    public final int c(int i13, Object[] objArr) {
        return this.f100524e.c(i13, objArr);
    }

    @Override // pk.v0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f100523d.get(obj) != null;
    }

    @Override // pk.v0
    public final boolean i() {
        return true;
    }

    @Override // pk.v0
    /* renamed from: j */
    public final n3 iterator() {
        return this.f100524e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f100523d.size();
    }

    @Override // pk.o1, pk.v0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
