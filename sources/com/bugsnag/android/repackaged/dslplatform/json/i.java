package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class i extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f29509a;

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f29510b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29511c = true;

    /* renamed from: d, reason: collision with root package name */
    public int f29512d;

    public i(InputStream inputStream, byte[] bArr) {
        this.f29509a = bArr;
        this.f29510b = inputStream;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f29511c) {
            int i13 = this.f29512d;
            byte[] bArr = this.f29509a;
            if (i13 < bArr.length) {
                this.f29512d = i13 + 1;
                return bArr[i13];
            }
            this.f29511c = false;
        }
        return this.f29510b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.f29511c) {
            return super.read(bArr);
        }
        return this.f29510b.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        if (this.f29511c) {
            return super.read(bArr, i13, i14);
        }
        return this.f29510b.read(bArr, i13, i14);
    }
}
