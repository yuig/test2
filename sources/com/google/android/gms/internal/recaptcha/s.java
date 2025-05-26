package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class s extends t {

    /* renamed from: d, reason: collision with root package name */
    public final int f31783d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31784e;

    public s(byte[] bArr, int i13, int i14) {
        super(bArr);
        u.i(i13, i13 + i14, bArr.length);
        this.f31783d = i13;
        this.f31784e = i14;
    }

    @Override // com.google.android.gms.internal.recaptcha.t, com.google.android.gms.internal.recaptcha.u
    public final byte d(int i13) {
        int i14 = this.f31784e;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f31788c[this.f31783d + i13];
        }
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(22);
            sb3.append("Index < 0: ");
            sb3.append(i13);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(40);
        sb4.append("Index > length: ");
        sb4.append(i13);
        sb4.append(", ");
        sb4.append(i14);
        throw new ArrayIndexOutOfBoundsException(sb4.toString());
    }

    @Override // com.google.android.gms.internal.recaptcha.t, com.google.android.gms.internal.recaptcha.u
    public final int e() {
        return this.f31784e;
    }

    @Override // com.google.android.gms.internal.recaptcha.t, com.google.android.gms.internal.recaptcha.u
    public final byte f(int i13) {
        return this.f31788c[this.f31783d + i13];
    }

    @Override // com.google.android.gms.internal.recaptcha.t
    public final int j() {
        return this.f31783d;
    }
}
