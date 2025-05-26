package gi;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
public final class c0 extends z {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f65050c;

    public c0(d0 d0Var) {
        this.f65050c = d0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i13) {
        m0 m0Var;
        z zVar;
        d0 d0Var = this.f65050c;
        m0Var = d0Var.f65057d.f65062c;
        Object obj = m0Var.f65097f.get(i13);
        zVar = d0Var.f65057d.f65063d;
        return new AbstractMap.SimpleImmutableEntry(obj, zVar.get(i13));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f65050c.f65057d.f65063d.size();
    }
}
