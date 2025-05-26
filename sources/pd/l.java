package pd;

import java.io.File;

/* loaded from: classes.dex */
public final class l implements rd.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f99709a;

    /* renamed from: b, reason: collision with root package name */
    public Object f99710b;

    /* renamed from: c, reason: collision with root package name */
    public Object f99711c;

    public l(nd.d dVar, Object obj, nd.l lVar) {
        this.f99709a = dVar;
        this.f99710b = obj;
        this.f99711c = lVar;
    }

    @Override // rd.b
    public final boolean a(File file) {
        return ((nd.d) this.f99709a).l(this.f99710b, file, (nd.l) this.f99711c);
    }

    public final void b(ih.g gVar, nd.l lVar) {
        try {
            gVar.a().g((nd.h) this.f99709a, new l((nd.o) this.f99710b, (f0) this.f99711c, lVar));
        } finally {
            ((f0) this.f99711c).f();
        }
    }

    public final void c(nd.h hVar, nd.o oVar, f0 f0Var) {
        this.f99709a = hVar;
        this.f99710b = oVar;
        this.f99711c = f0Var;
    }

    public l(t tVar, de.i iVar, w wVar) {
        this.f99711c = tVar;
        this.f99710b = iVar;
        this.f99709a = wVar;
    }
}
