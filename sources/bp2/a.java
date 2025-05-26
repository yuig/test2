package bp2;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f23668f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23669a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f23670b;

    /* renamed from: c, reason: collision with root package name */
    public int f23671c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f23672d;

    /* renamed from: e, reason: collision with root package name */
    public int f23673e;

    public a() {
        synchronized (this) {
            a(1024);
        }
    }

    public final void a(int i13) {
        int i14 = this.f23670b;
        ArrayList arrayList = this.f23669a;
        if (i14 < arrayList.size() - 1) {
            this.f23671c += this.f23672d.length;
            int i15 = this.f23670b + 1;
            this.f23670b = i15;
            this.f23672d = (byte[]) arrayList.get(i15);
            return;
        }
        byte[] bArr = this.f23672d;
        if (bArr == null) {
            this.f23671c = 0;
        } else {
            i13 = Math.max(bArr.length << 1, i13 - this.f23671c);
            this.f23671c += this.f23672d.length;
        }
        this.f23670b++;
        byte[] bArr2 = new byte[i13];
        this.f23672d = bArr2;
        arrayList.add(bArr2);
    }

    public final synchronized byte[] c() {
        int i13 = this.f23673e;
        if (i13 == 0) {
            return f23668f;
        }
        byte[] bArr = new byte[i13];
        Iterator it = this.f23669a.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int min = Math.min(bArr2.length, i13);
            System.arraycopy(bArr2, 0, bArr, i14, min);
            i14 += min;
            i13 -= min;
            if (i13 == 0) {
                break;
            }
        }
        return bArr;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String toString() {
        return new String(c(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i13) {
        try {
            int i14 = this.f23673e;
            int i15 = i14 - this.f23671c;
            if (i15 == this.f23672d.length) {
                a(i14 + 1);
                i15 = 0;
            }
            this.f23672d[i15] = (byte) i13;
            this.f23673e++;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        int i15;
        if (i13 < 0 || i13 > bArr.length || i14 < 0 || (i15 = i13 + i14) > bArr.length || i15 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i14 == 0) {
            return;
        }
        synchronized (this) {
            try {
                int i16 = this.f23673e;
                int i17 = i16 + i14;
                int i18 = i16 - this.f23671c;
                while (i14 > 0) {
                    int min = Math.min(i14, this.f23672d.length - i18);
                    System.arraycopy(bArr, i15 - i14, this.f23672d, i18, min);
                    i14 -= min;
                    if (i14 > 0) {
                        a(i17);
                        i18 = 0;
                    }
                }
                this.f23673e = i17;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
