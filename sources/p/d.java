package p;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f98286a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f98287b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f98288c;

    public d(g gVar) {
        this.f98288c = gVar;
    }

    @Override // p.f
    public final void a(c cVar) {
        c cVar2 = this.f98286a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f98285d;
            this.f98286a = cVar3;
            this.f98287b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f98287b) {
            return this.f98288c.f98291a != null;
        }
        c cVar = this.f98286a;
        return (cVar == null || cVar.f98284c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f98287b) {
            this.f98287b = false;
            this.f98286a = this.f98288c.f98291a;
        } else {
            c cVar = this.f98286a;
            this.f98286a = cVar != null ? cVar.f98284c : null;
        }
        return this.f98286a;
    }
}
