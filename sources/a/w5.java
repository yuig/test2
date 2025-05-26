package a;

import ads_mobile_sdk.js0;
import ads_mobile_sdk.vm;

/* loaded from: classes2.dex */
public final class w5 extends js0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5(byte[] bArr, int i13, int i14) {
        super(i13, bArr);
        this.f176c = i14;
    }

    @Override // ads_mobile_sdk.js0
    public final int a() {
        switch (this.f176c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    @Override // ads_mobile_sdk.js0
    public final int[] a(int[] iArr, int i13) {
        switch (this.f176c) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = this.f6936a;
                int[] iArr4 = vm.f12563a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i13;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] a13 = vm.a(this.f6936a, iArr);
                int[] iArr6 = vm.f12563a;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(a13, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i13;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }
}
