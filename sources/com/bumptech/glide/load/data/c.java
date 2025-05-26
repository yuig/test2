package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f29799a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f29800b;

    /* renamed from: c, reason: collision with root package name */
    public final qd.i f29801c;

    /* renamed from: d, reason: collision with root package name */
    public int f29802d;

    public c(FileOutputStream fileOutputStream, qd.i iVar) {
        this.f29799a = fileOutputStream;
        this.f29801c = iVar;
        this.f29800b = (byte[]) iVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f29799a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f29800b;
            if (bArr != null) {
                this.f29801c.h(bArr);
                this.f29800b = null;
            }
        } catch (Throwable th3) {
            outputStream.close();
            throw th3;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i13 = this.f29802d;
        OutputStream outputStream = this.f29799a;
        if (i13 > 0) {
            outputStream.write(this.f29800b, 0, i13);
            this.f29802d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        byte[] bArr = this.f29800b;
        int i14 = this.f29802d;
        int i15 = i14 + 1;
        this.f29802d = i15;
        bArr[i14] = (byte) i13;
        if (i15 != bArr.length || i15 <= 0) {
            return;
        }
        this.f29799a.write(bArr, 0, i15);
        this.f29802d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        int i15 = 0;
        do {
            int i16 = i14 - i15;
            int i17 = i13 + i15;
            int i18 = this.f29802d;
            OutputStream outputStream = this.f29799a;
            if (i18 == 0 && i16 >= this.f29800b.length) {
                outputStream.write(bArr, i17, i16);
                return;
            }
            int min = Math.min(i16, this.f29800b.length - i18);
            System.arraycopy(bArr, i17, this.f29800b, this.f29802d, min);
            int i19 = this.f29802d + min;
            this.f29802d = i19;
            i15 += min;
            byte[] bArr2 = this.f29800b;
            if (i19 == bArr2.length && i19 > 0) {
                outputStream.write(bArr2, 0, i19);
                this.f29802d = 0;
            }
        } while (i15 < i14);
    }
}
