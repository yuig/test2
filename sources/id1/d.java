package id1;

import h32.g0;
import java.util.HashMap;
import nx.d0;

/* loaded from: classes5.dex */
public final class d implements oe1.a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f72143a;

    /* renamed from: b, reason: collision with root package name */
    public final ze1.c f72144b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72145c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72146d;

    public d(g gVar) {
        gVar.getPresenterPinalytics();
        this.f72143a = gVar.getPinalytics();
        h hVar = gVar.f72153a;
        this.f72144b = new ze1.c((String) hVar.f72165d.get("source"), (String) hVar.f72165d.get("search_query"));
        this.f72145c = hVar.f72169h;
        this.f72146d = hVar.f72170i;
    }

    @Override // oe1.a
    public final d0 a() {
        return this.f72143a;
    }

    @Override // oe1.a
    public final String b() {
        return this.f72145c;
    }

    @Override // oe1.a
    public final /* bridge */ /* synthetic */ String c() {
        return null;
    }

    @Override // oe1.a
    public final String d() {
        return this.f72146d;
    }

    public final ze1.c e() {
        return this.f72144b;
    }

    @Override // oe1.a
    public final /* bridge */ /* synthetic */ HashMap getAuxData() {
        return null;
    }

    @Override // oe1.a
    public final g0 getComponentType() {
        return null;
    }
}
