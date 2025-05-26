package gi;

/* loaded from: classes3.dex */
public final class i1 extends k1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f65075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65076e;

    public i1(byte[] bArr, int i13, int i14) {
        super(bArr);
        j1.j(i13, i13 + i14, bArr.length);
        this.f65075d = i13;
        this.f65076e = i14;
    }

    @Override // gi.k1, gi.j1
    public final byte d(int i13) {
        int i14 = this.f65076e;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f65082c[this.f65075d + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a.d("Index < 0: ", i13));
        }
        throw new ArrayIndexOutOfBoundsException(a.a.f("Index > length: ", i13, ", ", i14));
    }

    @Override // gi.k1, gi.j1
    public final byte e(int i13) {
        return this.f65082c[this.f65075d + i13];
    }

    @Override // gi.k1, gi.j1
    public final int f() {
        return this.f65076e;
    }

    @Override // gi.k1, gi.j1
    public final void i(byte[] bArr, int i13) {
        System.arraycopy(this.f65082c, this.f65075d, bArr, 0, i13);
    }

    @Override // gi.k1
    public final int p() {
        return this.f65075d;
    }
}
