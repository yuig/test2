package mq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f88071a;

    /* renamed from: b, reason: collision with root package name */
    public final c f88072b;

    public d(e eVar, c cVar) {
        this.f88071a = eVar;
        this.f88072b = cVar;
    }

    @Override // mq2.a
    public final int a() {
        return this.f88072b.f88070a[r1.length - 1] * this.f88071a.a();
    }

    @Override // mq2.a
    public final BigInteger b() {
        return this.f88071a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f88071a.equals(dVar.f88071a) && this.f88072b.equals(dVar.f88072b);
    }

    public final int hashCode() {
        return this.f88071a.hashCode() ^ Integer.rotateLeft(this.f88072b.hashCode(), 16);
    }
}
