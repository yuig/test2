package q8;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f102950a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f102951b;

    /* renamed from: c, reason: collision with root package name */
    public int f102952c;

    /* renamed from: d, reason: collision with root package name */
    public long f102953d;

    /* renamed from: e, reason: collision with root package name */
    public int f102954e;

    /* renamed from: f, reason: collision with root package name */
    public int f102955f;

    /* renamed from: g, reason: collision with root package name */
    public int f102956g;

    public final void a(k0 k0Var, j0 j0Var) {
        if (this.f102952c > 0) {
            k0Var.a(this.f102953d, this.f102954e, this.f102955f, this.f102956g, j0Var);
            this.f102952c = 0;
        }
    }

    public final void b(k0 k0Var, long j13, int i13, int i14, int i15, j0 j0Var) {
        bf.b.s("TrueHD chunk samples must be contiguous in the sample queue.", this.f102956g <= i14 + i15);
        if (this.f102951b) {
            int i16 = this.f102952c;
            int i17 = i16 + 1;
            this.f102952c = i17;
            if (i16 == 0) {
                this.f102953d = j13;
                this.f102954e = i13;
                this.f102955f = 0;
            }
            this.f102955f += i14;
            this.f102956g = i15;
            if (i17 >= 16) {
                a(k0Var, j0Var);
            }
        }
    }

    public final void c(t tVar) {
        if (this.f102951b) {
            return;
        }
        byte[] bArr = this.f102950a;
        tVar.s(bArr, 0, 10);
        tVar.g();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b13 = bArr[7];
            if ((b13 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b13 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f102951b = true;
        }
    }
}
