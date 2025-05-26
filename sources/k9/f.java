package k9;

import androidx.media3.common.ParserException;
import d7.d0;
import java.io.EOFException;
import q8.t;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f78681a;

    /* renamed from: b, reason: collision with root package name */
    public long f78682b;

    /* renamed from: c, reason: collision with root package name */
    public int f78683c;

    /* renamed from: d, reason: collision with root package name */
    public int f78684d;

    /* renamed from: e, reason: collision with root package name */
    public int f78685e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f78686f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final d0 f78687g = new d0(255);

    public final boolean a(t tVar, boolean z13) {
        this.f78681a = 0;
        this.f78682b = 0L;
        this.f78683c = 0;
        this.f78684d = 0;
        this.f78685e = 0;
        d0 d0Var = this.f78687g;
        d0Var.H(27);
        try {
            if (tVar.c(d0Var.f53806a, 0, 27, z13) && d0Var.A() == 1332176723) {
                if (d0Var.y() != 0) {
                    if (z13) {
                        return false;
                    }
                    throw ParserException.c("unsupported bit stream revision");
                }
                this.f78681a = d0Var.y();
                this.f78682b = d0Var.n();
                d0Var.p();
                d0Var.p();
                d0Var.p();
                int y13 = d0Var.y();
                this.f78683c = y13;
                this.f78684d = y13 + 27;
                d0Var.H(y13);
                try {
                    if (tVar.c(d0Var.f53806a, 0, this.f78683c, z13)) {
                        for (int i13 = 0; i13 < this.f78683c; i13++) {
                            int y14 = d0Var.y();
                            this.f78686f[i13] = y14;
                            this.f78685e += y14;
                        }
                        return true;
                    }
                } catch (EOFException e13) {
                    if (!z13) {
                        throw e13;
                    }
                }
                return false;
            }
        } catch (EOFException e14) {
            if (!z13) {
                throw e14;
            }
        }
        return false;
    }

    public final boolean b(t tVar, long j13) {
        bf.b.i(tVar.h() == tVar.k());
        d0 d0Var = this.f78687g;
        d0Var.H(4);
        while (true) {
            if (j13 != -1 && tVar.h() + 4 >= j13) {
                break;
            }
            try {
                if (!tVar.c(d0Var.f53806a, 0, 4, true)) {
                    break;
                }
                d0Var.K(0);
                if (d0Var.A() == 1332176723) {
                    tVar.g();
                    return true;
                }
                tVar.p(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j13 != -1 && tVar.h() >= j13) {
                break;
            }
        } while (tVar.n(1) != -1);
        return false;
    }
}
