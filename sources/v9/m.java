package v9;

import q8.k0;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f124667a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124668b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f124669c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f124670d;

    /* renamed from: e, reason: collision with root package name */
    public int f124671e;

    /* renamed from: f, reason: collision with root package name */
    public int f124672f;

    /* renamed from: g, reason: collision with root package name */
    public long f124673g;

    /* renamed from: h, reason: collision with root package name */
    public long f124674h;

    public m(k0 k0Var) {
        this.f124667a = k0Var;
    }

    public final void a(byte[] bArr, int i13, int i14) {
        if (this.f124669c) {
            int i15 = this.f124672f;
            int i16 = (i13 + 1) - i15;
            if (i16 >= i14) {
                this.f124672f = (i14 - i13) + i15;
            } else {
                this.f124670d = ((bArr[i16] & 192) >> 6) == 0;
                this.f124669c = false;
            }
        }
    }

    public final void b(int i13, long j13, boolean z13) {
        bf.b.t(this.f124674h != -9223372036854775807L);
        if (this.f124671e == 182 && z13 && this.f124668b) {
            this.f124667a.a(this.f124674h, this.f124670d ? 1 : 0, (int) (j13 - this.f124673g), i13, null);
        }
        if (this.f124671e != 179) {
            this.f124673g = j13;
        }
    }
}
