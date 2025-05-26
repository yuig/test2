package zb;

import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List f141488a;

    /* renamed from: c, reason: collision with root package name */
    public kc.a f141490c = null;

    /* renamed from: d, reason: collision with root package name */
    public float f141491d = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public kc.a f141489b = f(0.0f);

    public c(List list) {
        this.f141488a = list;
    }

    @Override // zb.b
    public final boolean a(float f13) {
        kc.a aVar = this.f141490c;
        kc.a aVar2 = this.f141489b;
        if (aVar == aVar2 && this.f141491d == f13) {
            return true;
        }
        this.f141490c = aVar2;
        this.f141491d = f13;
        return false;
    }

    @Override // zb.b
    public final kc.a b() {
        return this.f141489b;
    }

    @Override // zb.b
    public final boolean c(float f13) {
        kc.a aVar = this.f141489b;
        if (f13 >= aVar.b() && f13 < aVar.a()) {
            return !this.f141489b.c();
        }
        this.f141489b = f(f13);
        return true;
    }

    @Override // zb.b
    public final float d() {
        return ((kc.a) this.f141488a.get(0)).b();
    }

    @Override // zb.b
    public final float e() {
        return ((kc.a) ep.b.i(this.f141488a, 1)).a();
    }

    public final kc.a f(float f13) {
        List list = this.f141488a;
        kc.a aVar = (kc.a) ep.b.i(list, 1);
        if (f13 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            kc.a aVar2 = (kc.a) list.get(size);
            if (this.f141489b != aVar2 && f13 >= aVar2.b() && f13 < aVar2.a()) {
                return aVar2;
            }
        }
        return (kc.a) list.get(0);
    }

    @Override // zb.b
    public final boolean isEmpty() {
        return false;
    }
}
