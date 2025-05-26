package g8;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u implements g7.f {

    /* renamed from: a, reason: collision with root package name */
    public final g7.f f64430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64431b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f64432c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f64433d;

    /* renamed from: e, reason: collision with root package name */
    public int f64434e;

    public u(g7.y yVar, int i13, p0 p0Var) {
        bf.b.i(i13 > 0);
        this.f64430a = yVar;
        this.f64431b = i13;
        this.f64432c = p0Var;
        this.f64433d = new byte[1];
        this.f64434e = i13;
    }

    @Override // g7.f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // g7.f
    public final long d(g7.i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // g7.f
    public final Map e() {
        return this.f64430a.e();
    }

    @Override // g7.f
    public final void f(g7.a0 a0Var) {
        a0Var.getClass();
        this.f64430a.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        return this.f64430a.r();
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f64434e;
        g7.f fVar = this.f64430a;
        if (i15 == 0) {
            byte[] bArr2 = this.f64433d;
            if (fVar.read(bArr2, 0, 1) != -1) {
                int i16 = (bArr2[0] & 255) << 4;
                if (i16 != 0) {
                    byte[] bArr3 = new byte[i16];
                    int i17 = i16;
                    int i18 = 0;
                    while (i17 > 0) {
                        int read = fVar.read(bArr3, i18, i17);
                        if (read != -1) {
                            i18 += read;
                            i17 -= read;
                        }
                    }
                    while (i16 > 0 && bArr3[i16 - 1] == 0) {
                        i16--;
                    }
                    if (i16 > 0) {
                        d7.d0 d0Var = new d7.d0(bArr3, i16);
                        p0 p0Var = this.f64432c;
                        long max = !p0Var.f64382m ? p0Var.f64379j : Math.max(p0Var.f64383n.w(true), p0Var.f64379j);
                        int a13 = d0Var.a();
                        q8.k0 k0Var = p0Var.f64381l;
                        k0Var.getClass();
                        k0Var.d(a13, 0, d0Var);
                        k0Var.a(max, 1, a13, 0, null);
                        p0Var.f64382m = true;
                    }
                }
                this.f64434e = this.f64431b;
            }
            return -1;
        }
        int read2 = fVar.read(bArr, i13, Math.min(this.f64434e, i14));
        if (read2 != -1) {
            this.f64434e -= read2;
        }
        return read2;
    }
}
