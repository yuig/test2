package wk;

/* loaded from: classes3.dex */
public final class p extends q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f130080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(byte[] bArr, int i13, int i14) {
        super(bArr, i13);
        this.f130080d = i14;
    }

    @Override // wk.q
    public final int[] b(int[] iArr, int i13) {
        switch (this.f130080d) {
            case 0:
                if (iArr.length != c() / 4) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f130083c;
                int[] iArr4 = n.f130077a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i13;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != c() / 4) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] b13 = n.b((int[]) this.f130083c, iArr);
                int[] iArr6 = n.f130077a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(b13, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i13;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // wk.q
    public final int c() {
        switch (this.f130080d) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
