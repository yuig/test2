package ui2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public l f122306a;

    @Override // ui2.k
    public final j a() {
        if (this.f122306a == null) {
            vi2.c cVar = vi2.g.f125879b;
            vi2.b current = cVar.current();
            if (current == null) {
                current = cVar.root();
            }
            j jVar = (j) ((vi2.a) current).a(m.f122316a);
            if (jVar == null) {
                jVar = i.f122314b;
            }
            this.f122306a = jVar.h();
        }
        l lVar = this.f122306a;
        if (lVar != null) {
            return new i(lVar);
        }
        ri2.a.a();
        return i.f122314b;
    }

    @Override // ui2.k
    public final k b() {
        this.f122306a = ri2.b.f108392g;
        return this;
    }

    @Override // ui2.k
    public final k c(vi2.b bVar) {
        this.f122306a = j.c(bVar).h();
        return this;
    }

    @Override // ui2.k
    public final k d(long j13, TimeUnit timeUnit) {
        return this;
    }
}
