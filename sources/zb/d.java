package zb;

import java.util.List;

/* loaded from: classes.dex */
public final class d implements b, bk.n {

    /* renamed from: a, reason: collision with root package name */
    public float f141492a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f141493b;

    public d(List list) {
        this.f141492a = -1.0f;
        this.f141493b = (kc.a) list.get(0);
    }

    @Override // zb.b
    public final boolean a(float f13) {
        if (this.f141492a == f13) {
            return true;
        }
        this.f141492a = f13;
        return false;
    }

    @Override // zb.b
    public final kc.a b() {
        return (kc.a) this.f141493b;
    }

    @Override // zb.b
    public final boolean c(float f13) {
        return !((kc.a) this.f141493b).c();
    }

    @Override // zb.b
    public final float d() {
        return ((kc.a) this.f141493b).b();
    }

    @Override // zb.b
    public final float e() {
        return ((kc.a) this.f141493b).a();
    }

    @Override // bk.n
    public final bk.d h(bk.d dVar) {
        return dVar instanceof bk.k ? dVar : new bk.b(this.f141492a, dVar);
    }

    @Override // zb.b
    public final boolean isEmpty() {
        return false;
    }

    public d(bk.i iVar, float f13) {
        this.f141493b = iVar;
        this.f141492a = f13;
    }
}
