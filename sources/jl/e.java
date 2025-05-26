package jl;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class e extends bl.v {

    /* renamed from: a, reason: collision with root package name */
    public final c f76828a;

    /* renamed from: b, reason: collision with root package name */
    public final a f76829b;

    /* renamed from: c, reason: collision with root package name */
    public final b f76830c;

    /* renamed from: d, reason: collision with root package name */
    public final d f76831d;

    public e(c cVar, a aVar, b bVar, d dVar) {
        this.f76828a = cVar;
        this.f76829b = aVar;
        this.f76830c = bVar;
        this.f76831d = dVar;
    }

    public static m.h b() {
        return new m.h((m.g) null);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f76831d != d.f76819e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f76828a == this.f76828a && eVar.f76829b == this.f76829b && eVar.f76830c == this.f76830c && eVar.f76831d == this.f76831d;
    }

    public final int hashCode() {
        return Objects.hash(e.class, this.f76828a, this.f76829b, this.f76830c, this.f76831d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.f76831d + ", hashType: " + this.f76830c + ", encoding: " + this.f76828a + ", curve: " + this.f76829b + ")";
    }
}
