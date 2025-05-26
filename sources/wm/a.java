package wm;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: c, reason: collision with root package name */
    public final short f130216c;

    /* renamed from: d, reason: collision with root package name */
    public final short f130217d;

    public a(f fVar, int i13, int i14) {
        super(fVar);
        this.f130216c = (short) i13;
        this.f130217d = (short) i14;
    }

    @Override // wm.f
    public final void a(xm.a aVar, byte[] bArr) {
        int i13 = 0;
        while (true) {
            short s13 = this.f130217d;
            if (i13 >= s13) {
                return;
            }
            if (i13 == 0 || (i13 == 31 && s13 <= 62)) {
                aVar.b(31, 5);
                if (s13 > 62) {
                    aVar.b(s13 - 31, 16);
                } else if (i13 == 0) {
                    aVar.b(Math.min((int) s13, 31), 5);
                } else {
                    aVar.b(s13 - 31, 5);
                }
            }
            aVar.b(bArr[this.f130216c + i13], 8);
            i13++;
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("<");
        sb3.append((int) this.f130216c);
        sb3.append("::");
        sb3.append((r1 + this.f130217d) - 1);
        sb3.append('>');
        return sb3.toString();
    }
}
