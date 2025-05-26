package q8;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class r implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f102993a = new byte[4096];

    @Override // q8.k0
    public final void a(long j13, int i13, int i14, int i15, j0 j0Var) {
    }

    @Override // q8.k0
    public final void b(androidx.media3.common.b bVar) {
    }

    @Override // q8.k0
    public final void d(int i13, int i14, d7.d0 d0Var) {
        d0Var.L(i13);
    }

    @Override // q8.k0
    public final int e(a7.k kVar, int i13, boolean z13) {
        byte[] bArr = this.f102993a;
        int read = kVar.read(bArr, 0, Math.min(bArr.length, i13));
        if (read != -1) {
            return read;
        }
        if (z13) {
            return -1;
        }
        throw new EOFException();
    }
}
