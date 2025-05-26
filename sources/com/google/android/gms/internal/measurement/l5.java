package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class l5 extends n5 {

    /* renamed from: e, reason: collision with root package name */
    public final int f31505e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31506f;

    public l5(byte[] bArr, int i13, int i14) {
        super(bArr);
        o5.e(i13, i13 + i14, bArr.length);
        this.f31505e = i13;
        this.f31506f = i14;
    }

    @Override // com.google.android.gms.internal.measurement.n5, com.google.android.gms.internal.measurement.o5
    public final byte d(int i13) {
        int i14 = this.f31506f;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f31553d[this.f31505e + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a.d("Index < 0: ", i13));
        }
        throw new ArrayIndexOutOfBoundsException(a.a.f("Index > length: ", i13, ", ", i14));
    }

    @Override // com.google.android.gms.internal.measurement.n5, com.google.android.gms.internal.measurement.o5
    public final byte i(int i13) {
        return this.f31553d[this.f31505e + i13];
    }

    @Override // com.google.android.gms.internal.measurement.n5, com.google.android.gms.internal.measurement.o5
    public final int j() {
        return this.f31506f;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final int l() {
        return this.f31505e;
    }
}
