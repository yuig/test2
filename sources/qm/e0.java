package qm;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class e0 extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.w f104149a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.r f104150b;

    /* renamed from: c, reason: collision with root package name */
    public final nm.o f104151c;

    /* renamed from: d, reason: collision with root package name */
    public final TypeToken f104152d;

    /* renamed from: e, reason: collision with root package name */
    public final nm.j0 f104153e;

    /* renamed from: f, reason: collision with root package name */
    public final ll.j f104154f = new ll.j(this);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104155g;

    /* renamed from: h, reason: collision with root package name */
    public volatile nm.i0 f104156h;

    public e0(nm.w wVar, nm.r rVar, nm.o oVar, TypeToken typeToken, nm.j0 j0Var, boolean z13) {
        this.f104149a = wVar;
        this.f104150b = rVar;
        this.f104151c = oVar;
        this.f104152d = typeToken;
        this.f104153e = j0Var;
        this.f104155g = z13;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        nm.r rVar = this.f104150b;
        if (rVar == null) {
            return g().c(aVar);
        }
        nm.s q03 = com.bumptech.glide.d.q0(aVar);
        if (this.f104155g) {
            q03.getClass();
            if (q03 instanceof nm.t) {
                return null;
            }
        }
        return rVar.a(q03, this.f104152d.f33847b, this.f104154f);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        nm.w wVar = this.f104149a;
        if (wVar == null) {
            g().e(cVar, obj);
            return;
        }
        if (this.f104155g && obj == null) {
            cVar.m();
            return;
        }
        Type type = this.f104152d.f33847b;
        nm.s serialize = wVar.serialize(obj);
        z0 z0Var = n1.B;
        z0Var.getClass();
        z0Var.e(serialize, cVar);
    }

    @Override // qm.c0
    public final nm.i0 f() {
        return this.f104149a != null ? this : g();
    }

    public final nm.i0 g() {
        nm.i0 i0Var = this.f104156h;
        if (i0Var != null) {
            return i0Var;
        }
        nm.i0 i13 = this.f104151c.i(this.f104153e, this.f104152d);
        this.f104156h = i13;
        return i13;
    }
}
