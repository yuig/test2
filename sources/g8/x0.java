package g8;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final l8.m f64472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64473b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.d0 f64474c;

    /* renamed from: d, reason: collision with root package name */
    public w0 f64475d;

    /* renamed from: e, reason: collision with root package name */
    public w0 f64476e;

    /* renamed from: f, reason: collision with root package name */
    public w0 f64477f;

    /* renamed from: g, reason: collision with root package name */
    public long f64478g;

    public x0(l8.m mVar) {
        this.f64472a = mVar;
        int i13 = mVar.f82047b;
        this.f64473b = i13;
        this.f64474c = new d7.d0(32);
        w0 w0Var = new w0(0L, i13);
        this.f64475d = w0Var;
        this.f64476e = w0Var;
        this.f64477f = w0Var;
    }

    public static w0 d(w0 w0Var, long j13, ByteBuffer byteBuffer, int i13) {
        while (j13 >= w0Var.f64466b) {
            w0Var = w0Var.f64468d;
        }
        while (i13 > 0) {
            int min = Math.min(i13, (int) (w0Var.f64466b - j13));
            l8.a aVar = w0Var.f64467c;
            byteBuffer.put(aVar.f81985a, ((int) (j13 - w0Var.f64465a)) + aVar.f81986b, min);
            i13 -= min;
            j13 += min;
            if (j13 == w0Var.f64466b) {
                w0Var = w0Var.f64468d;
            }
        }
        return w0Var;
    }

    public static w0 e(w0 w0Var, long j13, byte[] bArr, int i13) {
        while (j13 >= w0Var.f64466b) {
            w0Var = w0Var.f64468d;
        }
        int i14 = i13;
        while (i14 > 0) {
            int min = Math.min(i14, (int) (w0Var.f64466b - j13));
            l8.a aVar = w0Var.f64467c;
            System.arraycopy(aVar.f81985a, ((int) (j13 - w0Var.f64465a)) + aVar.f81986b, bArr, i13 - i14, min);
            i14 -= min;
            j13 += min;
            if (j13 == w0Var.f64466b) {
                w0Var = w0Var.f64468d;
            }
        }
        return w0Var;
    }

    public static w0 f(w0 w0Var, k7.e eVar, h7.b bVar, d7.d0 d0Var) {
        if (eVar.i(1073741824)) {
            long j13 = bVar.f67851b;
            int i13 = 1;
            d0Var.H(1);
            w0 e13 = e(w0Var, j13, d0Var.f53806a, 1);
            long j14 = j13 + 1;
            byte b13 = d0Var.f53806a[0];
            boolean z13 = (b13 & 128) != 0;
            int i14 = b13 & Byte.MAX_VALUE;
            k7.c cVar = eVar.f78453d;
            byte[] bArr = cVar.f78442a;
            if (bArr == null) {
                cVar.f78442a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            w0Var = e(e13, j14, cVar.f78442a, i14);
            long j15 = j14 + i14;
            if (z13) {
                d0Var.H(2);
                w0Var = e(w0Var, j15, d0Var.f53806a, 2);
                j15 += 2;
                i13 = d0Var.E();
            }
            int[] iArr = cVar.f78445d;
            if (iArr == null || iArr.length < i13) {
                iArr = new int[i13];
            }
            int[] iArr2 = cVar.f78446e;
            if (iArr2 == null || iArr2.length < i13) {
                iArr2 = new int[i13];
            }
            if (z13) {
                int i15 = i13 * 6;
                d0Var.H(i15);
                w0Var = e(w0Var, j15, d0Var.f53806a, i15);
                j15 += i15;
                d0Var.K(0);
                for (int i16 = 0; i16 < i13; i16++) {
                    iArr[i16] = d0Var.E();
                    iArr2[i16] = d0Var.C();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f67850a - ((int) (j15 - bVar.f67851b));
            }
            q8.j0 j0Var = (q8.j0) bVar.f67852c;
            int i17 = d7.n0.f53866a;
            byte[] bArr2 = j0Var.f102943b;
            byte[] bArr3 = cVar.f78442a;
            cVar.f78447f = i13;
            cVar.f78445d = iArr;
            cVar.f78446e = iArr2;
            cVar.f78443b = bArr2;
            cVar.f78442a = bArr3;
            int i18 = j0Var.f102942a;
            cVar.f78444c = i18;
            int i19 = j0Var.f102944c;
            cVar.f78448g = i19;
            int i23 = j0Var.f102945d;
            cVar.f78449h = i23;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f78450i;
            cryptoInfo.numSubSamples = i13;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i18;
            if (d7.n0.f53866a >= 24) {
                k7.b bVar2 = cVar.f78451j;
                bVar2.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = bVar2.f78441b;
                pattern.set(i19, i23);
                bVar2.f78440a.setPattern(pattern);
            }
            long j16 = bVar.f67851b;
            int i24 = (int) (j15 - j16);
            bVar.f67851b = j16 + i24;
            bVar.f67850a -= i24;
        }
        if (!eVar.i(268435456)) {
            eVar.p(bVar.f67850a);
            return d(w0Var, bVar.f67851b, eVar.f78454e, bVar.f67850a);
        }
        d0Var.H(4);
        w0 e14 = e(w0Var, bVar.f67851b, d0Var.f53806a, 4);
        int C = d0Var.C();
        bVar.f67851b += 4;
        bVar.f67850a -= 4;
        eVar.p(C);
        w0 d2 = d(e14, bVar.f67851b, eVar.f78454e, C);
        bVar.f67851b += C;
        int i25 = bVar.f67850a - C;
        bVar.f67850a = i25;
        ByteBuffer byteBuffer = eVar.f78457h;
        if (byteBuffer == null || byteBuffer.capacity() < i25) {
            eVar.f78457h = ByteBuffer.allocate(i25);
        } else {
            eVar.f78457h.clear();
        }
        return d(d2, bVar.f67851b, eVar.f78457h, bVar.f67850a);
    }

    public final void a(w0 w0Var) {
        if (w0Var.f64467c == null) {
            return;
        }
        l8.m mVar = this.f64472a;
        synchronized (mVar) {
            w0 w0Var2 = w0Var;
            while (w0Var2 != null) {
                try {
                    l8.a[] aVarArr = mVar.f82051f;
                    int i13 = mVar.f82050e;
                    mVar.f82050e = i13 + 1;
                    l8.a aVar = w0Var2.f64467c;
                    aVar.getClass();
                    aVarArr[i13] = aVar;
                    mVar.f82049d--;
                    w0Var2 = w0Var2.f64468d;
                    if (w0Var2 == null || w0Var2.f64467c == null) {
                        w0Var2 = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            mVar.notifyAll();
        }
        w0Var.f64467c = null;
        w0Var.f64468d = null;
    }

    public final void b(long j13) {
        w0 w0Var;
        if (j13 == -1) {
            return;
        }
        while (true) {
            w0Var = this.f64475d;
            if (j13 < w0Var.f64466b) {
                break;
            }
            l8.m mVar = this.f64472a;
            l8.a aVar = w0Var.f64467c;
            synchronized (mVar) {
                l8.a[] aVarArr = mVar.f82051f;
                int i13 = mVar.f82050e;
                mVar.f82050e = i13 + 1;
                aVarArr[i13] = aVar;
                mVar.f82049d--;
                mVar.notifyAll();
            }
            w0 w0Var2 = this.f64475d;
            w0Var2.f64467c = null;
            w0 w0Var3 = w0Var2.f64468d;
            w0Var2.f64468d = null;
            this.f64475d = w0Var3;
        }
        if (this.f64476e.f64465a < w0Var.f64465a) {
            this.f64476e = w0Var;
        }
    }

    public final int c(int i13) {
        l8.a aVar;
        w0 w0Var = this.f64477f;
        if (w0Var.f64467c == null) {
            l8.m mVar = this.f64472a;
            synchronized (mVar) {
                try {
                    int i14 = mVar.f82049d + 1;
                    mVar.f82049d = i14;
                    int i15 = mVar.f82050e;
                    if (i15 > 0) {
                        l8.a[] aVarArr = mVar.f82051f;
                        int i16 = i15 - 1;
                        mVar.f82050e = i16;
                        aVar = aVarArr[i16];
                        aVar.getClass();
                        mVar.f82051f[mVar.f82050e] = null;
                    } else {
                        l8.a aVar2 = new l8.a(new byte[mVar.f82047b], 0);
                        l8.a[] aVarArr2 = mVar.f82051f;
                        if (i14 > aVarArr2.length) {
                            mVar.f82051f = (l8.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            w0 w0Var2 = new w0(this.f64477f.f64466b, this.f64473b);
            w0Var.f64467c = aVar;
            w0Var.f64468d = w0Var2;
        }
        return Math.min(i13, (int) (this.f64477f.f64466b - this.f64478g));
    }
}
