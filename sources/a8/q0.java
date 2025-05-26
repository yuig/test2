package a8;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class q0 extends g7.b implements e {

    /* renamed from: e */
    public final LinkedBlockingQueue f1450e;

    /* renamed from: f */
    public final long f1451f;

    /* renamed from: g */
    public byte[] f1452g;

    /* renamed from: h */
    public int f1453h;

    public q0(long j13) {
        super(true);
        this.f1451f = j13;
        this.f1450e = new LinkedBlockingQueue();
        this.f1452g = new byte[0];
        this.f1453h = -1;
    }

    @Override // a8.e
    public final String a() {
        bf.b.t(this.f1453h != -1);
        int i13 = this.f1453h;
        int i14 = this.f1453h + 1;
        int i15 = d7.n0.f53866a;
        Locale locale = Locale.US;
        return a.a.f("RTP/AVP/TCP;unicast;interleaved=", i13, "-", i14);
    }

    @Override // a8.e
    public final int b() {
        return this.f1453h;
    }

    @Override // g7.f
    public final void close() {
    }

    @Override // g7.f
    public final long d(g7.i iVar) {
        this.f1453h = iVar.f63786a.getPort();
        return -1L;
    }

    @Override // a8.e
    public final boolean j() {
        return false;
    }

    @Override // a8.e
    public final q0 l() {
        return this;
    }

    @Override // g7.f
    public final Uri r() {
        return null;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        int min = Math.min(i14, this.f1452g.length);
        System.arraycopy(this.f1452g, 0, bArr, i13, min);
        byte[] bArr2 = this.f1452g;
        this.f1452g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i14) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f1450e.poll(this.f1451f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i14 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i13 + min, min2);
            if (min2 < bArr3.length) {
                this.f1452g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
