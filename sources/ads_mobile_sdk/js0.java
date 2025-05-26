package ads_mobile_sdk;

import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public abstract class js0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6937b;

    public js0(int i13, byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f6936a = vm.a(bArr);
        this.f6937b = i13;
    }

    public abstract int a();

    public abstract int[] a(int[] iArr, int i13);
}
