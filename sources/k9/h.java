package k9;

import a7.n0;
import a7.o0;
import a7.q;
import com.google.android.gms.internal.measurement.q4;
import d7.d0;
import java.util.ArrayList;
import java.util.Arrays;
import pk.c1;

/* loaded from: classes3.dex */
public final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f78688o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f78689p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f78690n;

    public static boolean e(d0 d0Var, byte[] bArr) {
        if (d0Var.a() < bArr.length) {
            return false;
        }
        int i13 = d0Var.f53807b;
        byte[] bArr2 = new byte[bArr.length];
        d0Var.i(bArr2, 0, bArr.length);
        d0Var.K(i13);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // k9.i
    public final long b(d0 d0Var) {
        byte[] bArr = d0Var.f53806a;
        return (this.f78699i * gh0.b.Q(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // k9.i
    public final boolean c(d0 d0Var, long j13, q4 q4Var) {
        if (e(d0Var, f78688o)) {
            byte[] copyOf = Arrays.copyOf(d0Var.f53806a, d0Var.f53808c);
            int i13 = copyOf[9] & 255;
            ArrayList D = gh0.b.D(copyOf);
            if (((androidx.media3.common.b) q4Var.f31594b) != null) {
                return true;
            }
            q qVar = new q();
            qVar.f1180m = o0.r("audio/ogg");
            qVar.f1181n = o0.r("audio/opus");
            qVar.D = i13;
            qVar.E = 48000;
            qVar.f1184q = D;
            q4Var.f31594b = new androidx.media3.common.b(qVar);
            return true;
        }
        if (!e(d0Var, f78689p)) {
            bf.b.w((androidx.media3.common.b) q4Var.f31594b);
            return false;
        }
        bf.b.w((androidx.media3.common.b) q4Var.f31594b);
        if (this.f78690n) {
            return true;
        }
        this.f78690n = true;
        d0Var.L(8);
        n0 S0 = ig1.b.S0(c1.s((String[]) ig1.b.V0(d0Var, false, false).f23561d));
        if (S0 == null) {
            return true;
        }
        q a13 = ((androidx.media3.common.b) q4Var.f31594b).a();
        a13.f1178k = S0.b(((androidx.media3.common.b) q4Var.f31594b).f18762l);
        q4Var.f31594b = new androidx.media3.common.b(a13);
        return true;
    }

    @Override // k9.i
    public final void d(boolean z13) {
        super.d(z13);
        if (z13) {
            this.f78690n = false;
        }
    }
}
