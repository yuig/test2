package z7;

import d7.e0;

/* loaded from: classes3.dex */
public final class t extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final s f140973h;

    /* renamed from: i, reason: collision with root package name */
    public final h7.e f140974i;

    /* renamed from: j, reason: collision with root package name */
    public final r f140975j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f140976k;

    /* renamed from: l, reason: collision with root package name */
    public final h7.l f140977l;

    public t(s sVar, h7.e eVar, r rVar, byte[] bArr) {
        this.f140973h = sVar;
        this.f140974i = eVar;
        this.f140975j = rVar;
        this.f140976k = bArr;
        this.f140977l = new h7.l(eVar, sVar.f140972b, bArr, rVar);
    }

    @Override // d7.e0
    public final void b() {
        this.f140977l.f67907j = true;
    }

    @Override // d7.e0
    public final Object c() {
        this.f140977l.a();
        r rVar = this.f140975j;
        if (rVar == null) {
            return null;
        }
        rVar.f140970e++;
        ((h) rVar.f140966a).b(rVar.f140967b, rVar.f140969d, rVar.a());
        return null;
    }
}
