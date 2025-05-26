package yp2;

import java.io.OutputStream;
import java.math.BigInteger;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f139617a;

    public a(long j13) {
        this.f139617a = BigInteger.valueOf(j13).toByteArray();
    }

    @Override // yp2.e
    public final boolean c(e eVar) {
        if (eVar instanceof a) {
            return r.i(this.f139617a, ((a) eVar).f139617a);
        }
        return false;
    }

    @Override // yp2.e
    public final void d(d dVar) {
        dVar.c(2);
        byte[] bArr = this.f139617a;
        dVar.d(bArr.length);
        ((OutputStream) dVar.f139620a).write(bArr);
    }

    @Override // yp2.e
    public final int e() {
        byte[] bArr = this.f139617a;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    @Override // yp2.e, yp2.b
    public final int hashCode() {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f139617a;
            if (i13 == bArr.length) {
                return i14;
            }
            i14 ^= (bArr[i13] & 255) << (i13 % 4);
            i13++;
        }
    }

    public final String toString() {
        return new BigInteger(this.f139617a).toString();
    }

    public a(BigInteger bigInteger) {
        this.f139617a = bigInteger.toByteArray();
    }
}
