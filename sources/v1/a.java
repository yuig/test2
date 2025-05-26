package v1;

import b3.k0;
import b3.m0;
import b3.x0;
import lb.l0;
import n4.k;

/* loaded from: classes.dex */
public abstract class a implements x0 {

    /* renamed from: a */
    public final b f123820a;

    /* renamed from: b */
    public final b f123821b;

    /* renamed from: c */
    public final b f123822c;

    /* renamed from: d */
    public final b f123823d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f123820a = bVar;
        this.f123821b = bVar2;
        this.f123822c = bVar3;
        this.f123823d = bVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [v1.b] */
    public static h b(a aVar, e eVar, b bVar, b bVar2, int i13) {
        e eVar2 = eVar;
        if ((i13 & 1) != 0) {
            eVar2 = aVar.f123820a;
        }
        b bVar3 = aVar.f123821b;
        if ((i13 & 4) != 0) {
            bVar = aVar.f123822c;
        }
        ((h) aVar).getClass();
        return new h(eVar2, bVar3, bVar, bVar2);
    }

    @Override // b3.x0
    public final m0 a(long j13, k kVar, n4.b bVar) {
        float a13 = this.f123820a.a(j13, bVar);
        float a14 = this.f123821b.a(j13, bVar);
        float a15 = this.f123822c.a(j13, bVar);
        float a16 = this.f123823d.a(j13, bVar);
        float c13 = a3.f.c(j13);
        float f13 = a13 + a16;
        if (f13 > c13) {
            float f14 = c13 / f13;
            a13 *= f14;
            a16 *= f14;
        }
        float f15 = a14 + a15;
        if (f15 > c13) {
            float f16 = c13 / f15;
            a14 *= f16;
            a15 *= f16;
        }
        if (a13 < 0.0f || a14 < 0.0f || a15 < 0.0f || a16 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a13 + ", topEnd = " + a14 + ", bottomEnd = " + a15 + ", bottomStart = " + a16 + ")!").toString());
        }
        if (a13 + a14 + a15 + a16 == 0.0f) {
            return new k0(com.bumptech.glide.d.c(0L, j13));
        }
        a3.d c14 = com.bumptech.glide.d.c(0L, j13);
        k kVar2 = k.Ltr;
        float f17 = kVar == kVar2 ? a13 : a14;
        long c15 = l0.c(f17, f17);
        if (kVar == kVar2) {
            a13 = a14;
        }
        long c16 = l0.c(a13, a13);
        float f18 = kVar == kVar2 ? a15 : a16;
        long c17 = l0.c(f18, f18);
        if (kVar != kVar2) {
            a16 = a15;
        }
        return new b3.l0(new a3.e(c14.f484a, c14.f485b, c14.f486c, c14.f487d, c15, c16, c17, l0.c(a16, a16)));
    }
}
