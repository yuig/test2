package t7;

import java.util.List;

/* loaded from: classes3.dex */
public final class g extends h8.b {

    /* renamed from: d, reason: collision with root package name */
    public final List f116476d;

    /* renamed from: e, reason: collision with root package name */
    public final long f116477e;

    public g(long j13, List list) {
        super(0L, list.size() - 1);
        this.f116477e = j13;
        this.f116476d = list;
    }

    @Override // h8.q
    public final long g() {
        a();
        return this.f116477e + ((v7.i) this.f116476d.get((int) this.f68004c)).f124289e;
    }

    @Override // h8.q
    public final long k() {
        a();
        v7.i iVar = (v7.i) this.f116476d.get((int) this.f68004c);
        return this.f116477e + iVar.f124289e + iVar.f124287c;
    }
}
