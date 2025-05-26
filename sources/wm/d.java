package wm;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: c, reason: collision with root package name */
    public final short f130224c;

    /* renamed from: d, reason: collision with root package name */
    public final short f130225d;

    public d(f fVar, int i13, int i14) {
        super(fVar);
        this.f130224c = (short) i13;
        this.f130225d = (short) i14;
    }

    @Override // wm.f
    public final void a(xm.a aVar, byte[] bArr) {
        aVar.b(this.f130224c, this.f130225d);
    }

    public final String toString() {
        short s13 = this.f130225d;
        return "<" + Integer.toBinaryString((1 << s13) | (((1 << s13) - 1) & this.f130224c) | (1 << s13)).substring(1) + '>';
    }
}
