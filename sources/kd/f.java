package kd;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f79215a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f79216b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f79217c;

    /* renamed from: d, reason: collision with root package name */
    public int f79218d;

    /* renamed from: e, reason: collision with root package name */
    public int f79219e;

    public f(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(g.f79220a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f79215a = fileInputStream;
        this.f79216b = charset;
        this.f79217c = new byte[8192];
    }

    public final String a() {
        int i13;
        synchronized (this.f79215a) {
            try {
                byte[] bArr = this.f79217c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f79218d >= this.f79219e) {
                    int read = this.f79215a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f79218d = 0;
                    this.f79219e = read;
                }
                for (int i14 = this.f79218d; i14 != this.f79219e; i14++) {
                    byte[] bArr2 = this.f79217c;
                    if (bArr2[i14] == 10) {
                        int i15 = this.f79218d;
                        if (i14 != i15) {
                            i13 = i14 - 1;
                            if (bArr2[i13] == 13) {
                                String str = new String(bArr2, i15, i13 - i15, this.f79216b.name());
                                this.f79218d = i14 + 1;
                                return str;
                            }
                        }
                        i13 = i14;
                        String str2 = new String(bArr2, i15, i13 - i15, this.f79216b.name());
                        this.f79218d = i14 + 1;
                        return str2;
                    }
                }
                e eVar = new e(this, (this.f79219e - this.f79218d) + 80);
                while (true) {
                    byte[] bArr3 = this.f79217c;
                    int i16 = this.f79218d;
                    eVar.write(bArr3, i16, this.f79219e - i16);
                    this.f79219e = -1;
                    byte[] bArr4 = this.f79217c;
                    int read2 = this.f79215a.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f79218d = 0;
                    this.f79219e = read2;
                    for (int i17 = 0; i17 != this.f79219e; i17++) {
                        byte[] bArr5 = this.f79217c;
                        if (bArr5[i17] == 10) {
                            int i18 = this.f79218d;
                            if (i17 != i18) {
                                eVar.write(bArr5, i18, i17 - i18);
                            }
                            this.f79218d = i17 + 1;
                            return eVar.toString();
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f79215a) {
            try {
                if (this.f79217c != null) {
                    this.f79217c = null;
                    this.f79215a.close();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
