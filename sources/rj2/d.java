package rj2;

import java.util.List;
import ui2.h;
import ui2.j;
import ui2.l;
import ui2.n;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f108429a;

    /* renamed from: b, reason: collision with root package name */
    public final e f108430b;

    /* renamed from: c, reason: collision with root package name */
    public final e f108431c;

    /* renamed from: d, reason: collision with root package name */
    public final e f108432d;

    /* renamed from: e, reason: collision with root package name */
    public final e f108433e;

    public d(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        this.f108429a = eVar;
        this.f108430b = eVar2 == null ? b.INSTANCE : eVar2;
        this.f108431c = eVar3 == null ? a.INSTANCE : eVar3;
        this.f108432d = eVar4 == null ? b.INSTANCE : eVar4;
        this.f108433e = eVar5 == null ? a.INSTANCE : eVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f108429a.equals(dVar.f108429a) && this.f108430b.equals(dVar.f108430b) && this.f108431c.equals(dVar.f108431c) && this.f108432d.equals(dVar.f108432d) && this.f108433e.equals(dVar.f108433e);
    }

    @Override // rj2.e
    public final String getDescription() {
        String description = this.f108429a.getDescription();
        String description2 = this.f108430b.getDescription();
        String description3 = this.f108431c.getDescription();
        String description4 = this.f108432d.getDescription();
        String description5 = this.f108433e.getDescription();
        StringBuilder w13 = a.a.w("ParentBased{root:", description, ",remoteParentSampled:", description2, ",remoteParentNotSampled:");
        a.a.B(w13, description3, ",localParentSampled:", description4, ",localParentNotSampled:");
        return a.a.p(w13, description5, "}");
    }

    public final int hashCode() {
        return this.f108433e.hashCode() + ((this.f108432d.hashCode() + ((this.f108431c.hashCode() + ((this.f108430b.hashCode() + (this.f108429a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // rj2.e
    public final g shouldSample(vi2.b bVar, String str, String str2, n nVar, qi2.d dVar, List list) {
        l h10 = j.c(bVar).h();
        ri2.b bVar2 = (ri2.b) h10;
        if (!bVar2.f108398f) {
            return this.f108429a.shouldSample(bVar, str, str2, nVar, dVar, list);
        }
        if (bVar2.f108397e) {
            h10.getClass();
            return (((h) ((ri2.b) h10).f108395c).f122313b & 1) != 0 ? this.f108430b.shouldSample(bVar, str, str2, nVar, dVar, list) : this.f108431c.shouldSample(bVar, str, str2, nVar, dVar, list);
        }
        h10.getClass();
        return (((h) ((ri2.b) h10).f108395c).f122313b & 1) != 0 ? this.f108432d.shouldSample(bVar, str, str2, nVar, dVar, list) : this.f108433e.shouldSample(bVar, str, str2, nVar, dVar, list);
    }

    public final String toString() {
        return getDescription();
    }
}
