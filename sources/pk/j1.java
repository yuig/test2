package pk;

/* loaded from: classes3.dex */
public final class j1 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    public final n3 f100435a;

    /* renamed from: b, reason: collision with root package name */
    public n3 f100436b = v1.f100500d;

    public j1(l1 l1Var) {
        this.f100435a = l1Var.f100447d.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100436b.hasNext() || this.f100435a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f100436b.hasNext()) {
            this.f100436b = ((v0) this.f100435a.next()).iterator();
        }
        return this.f100436b.next();
    }
}
