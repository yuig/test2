package k9;

import a7.o0;
import a7.q;
import com.google.android.gms.internal.measurement.q4;
import d7.d0;
import java.util.Arrays;
import jk.r;
import q8.x;

/* loaded from: classes3.dex */
public final class d extends i {

    /* renamed from: n, reason: collision with root package name */
    public x f78676n;

    /* renamed from: o, reason: collision with root package name */
    public c f78677o;

    @Override // k9.i
    public final long b(d0 d0Var) {
        byte[] bArr = d0Var.f53806a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i13 = (bArr[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            d0Var.L(4);
            d0Var.F();
        }
        int E0 = ph.a.E0(i13, d0Var);
        d0Var.K(0);
        return E0;
    }

    @Override // k9.i
    public final boolean c(d0 d0Var, long j13, q4 q4Var) {
        byte[] bArr = d0Var.f53806a;
        x xVar = this.f78676n;
        if (xVar == null) {
            x xVar2 = new x(bArr, 17);
            this.f78676n = xVar2;
            q a13 = xVar2.c(Arrays.copyOfRange(bArr, 9, d0Var.f53808c), null).a();
            a13.f1180m = o0.r("audio/ogg");
            q4Var.f31594b = new androidx.media3.common.b(a13);
            return true;
        }
        byte b13 = bArr[0];
        if ((b13 & Byte.MAX_VALUE) != 3) {
            if (b13 != -1) {
                return true;
            }
            c cVar = this.f78677o;
            if (cVar != null) {
                cVar.f78674c = j13;
                q4Var.f31595c = cVar;
            }
            ((androidx.media3.common.b) q4Var.f31594b).getClass();
            return false;
        }
        sp2.i t13 = r.t(d0Var);
        x xVar3 = new x(xVar.f102997a, xVar.f102998b, xVar.f102999c, xVar.f103000d, xVar.f103001e, xVar.f103003g, xVar.f103004h, xVar.f103006j, t13, xVar.f103008l);
        this.f78676n = xVar3;
        c cVar2 = new c();
        cVar2.f78672a = xVar3;
        cVar2.f78673b = t13;
        cVar2.f78674c = -1L;
        cVar2.f78675d = -1L;
        this.f78677o = cVar2;
        return true;
    }

    @Override // k9.i
    public final void d(boolean z13) {
        super.d(z13);
        if (z13) {
            this.f78676n = null;
            this.f78677o = null;
        }
    }
}
