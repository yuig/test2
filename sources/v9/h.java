package v9;

import a7.o0;
import java.util.Collections;
import java.util.List;
import q8.k0;

/* loaded from: classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124624a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124625b;

    /* renamed from: c, reason: collision with root package name */
    public long f124626c;

    /* renamed from: d, reason: collision with root package name */
    public int f124627d;

    /* renamed from: e, reason: collision with root package name */
    public int f124628e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f124629f;

    /* renamed from: g, reason: collision with root package name */
    public Object f124630g;

    public h(List list) {
        this.f124624a = 0;
        this.f124629f = list;
        this.f124630g = new k0[list.size()];
        this.f124626c = -9223372036854775807L;
    }

    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        switch (this.f124624a) {
            case 0:
                if (this.f124625b) {
                    if (this.f124627d == 2) {
                        if (d0Var.a() != 0) {
                            if (d0Var.y() != 32) {
                                this.f124625b = false;
                            }
                            this.f124627d--;
                            if (!this.f124625b) {
                            }
                        }
                    }
                    if (this.f124627d == 1) {
                        if (d0Var.a() != 0) {
                            if (d0Var.y() != 0) {
                                this.f124625b = false;
                            }
                            this.f124627d--;
                            if (!this.f124625b) {
                            }
                        }
                    }
                    int i13 = d0Var.f53807b;
                    int a13 = d0Var.a();
                    for (k0 k0Var : (k0[]) this.f124630g) {
                        d0Var.K(i13);
                        k0Var.d(a13, 0, d0Var);
                    }
                    this.f124628e += a13;
                    break;
                }
                break;
            default:
                bf.b.w((k0) this.f124630g);
                if (this.f124625b) {
                    int a14 = d0Var.a();
                    int i14 = this.f124628e;
                    if (i14 < 10) {
                        int min = Math.min(a14, 10 - i14);
                        byte[] bArr = d0Var.f53806a;
                        int i15 = d0Var.f53807b;
                        d7.d0 d0Var2 = (d7.d0) this.f124629f;
                        System.arraycopy(bArr, i15, d0Var2.f53806a, this.f124628e, min);
                        if (this.f124628e + min == 10) {
                            d0Var2.K(0);
                            if (73 != d0Var2.y() || 68 != d0Var2.y() || 51 != d0Var2.y()) {
                                d7.u.g("Id3Reader", "Discarding invalid ID3 tag");
                                this.f124625b = false;
                                break;
                            } else {
                                d0Var2.L(3);
                                this.f124627d = d0Var2.x() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a14, this.f124627d - this.f124628e);
                    ((k0) this.f124630g).d(min2, 0, d0Var);
                    this.f124628e += min2;
                    break;
                }
                break;
        }
    }

    @Override // v9.i
    public final void f() {
        switch (this.f124624a) {
            case 0:
                this.f124625b = false;
                this.f124626c = -9223372036854775807L;
                break;
            default:
                this.f124625b = false;
                this.f124626c = -9223372036854775807L;
                break;
        }
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        switch (this.f124624a) {
            case 0:
                for (int i13 = 0; i13 < ((k0[]) this.f124630g).length; i13++) {
                    g0 g0Var = (g0) ((List) this.f124629f).get(i13);
                    h0Var.a();
                    h0Var.b();
                    k0 D = uVar.D(h0Var.f124634d, 3);
                    a7.q qVar = new a7.q();
                    h0Var.b();
                    qVar.f1168a = h0Var.f124635e;
                    qVar.f1180m = o0.r("video/mp2t");
                    qVar.f1181n = o0.r("application/dvbsubs");
                    qVar.f1184q = Collections.singletonList(g0Var.f124623b);
                    qVar.f1171d = g0Var.f124622a;
                    D.b(new androidx.media3.common.b(qVar));
                    ((k0[]) this.f124630g)[i13] = D;
                }
                break;
            default:
                h0Var.a();
                h0Var.b();
                k0 D2 = uVar.D(h0Var.f124634d, 5);
                this.f124630g = D2;
                a7.q qVar2 = new a7.q();
                h0Var.b();
                qVar2.f1168a = h0Var.f124635e;
                qVar2.f1180m = o0.r("video/mp2t");
                qVar2.f1181n = o0.r("application/id3");
                D2.b(new androidx.media3.common.b(qVar2));
                break;
        }
    }

    @Override // v9.i
    public final void h(boolean z13) {
        int i13;
        switch (this.f124624a) {
            case 0:
                if (this.f124625b) {
                    bf.b.t(this.f124626c != -9223372036854775807L);
                    for (k0 k0Var : (k0[]) this.f124630g) {
                        k0Var.a(this.f124626c, 1, this.f124628e, 0, null);
                    }
                    this.f124625b = false;
                    break;
                }
                break;
            default:
                bf.b.w((k0) this.f124630g);
                if (this.f124625b && (i13 = this.f124627d) != 0 && this.f124628e == i13) {
                    bf.b.t(this.f124626c != -9223372036854775807L);
                    ((k0) this.f124630g).a(this.f124626c, 1, this.f124627d, 0, null);
                    this.f124625b = false;
                    break;
                }
                break;
        }
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        switch (this.f124624a) {
            case 0:
                if ((i13 & 4) != 0) {
                    this.f124625b = true;
                    this.f124626c = j13;
                    this.f124628e = 0;
                    this.f124627d = 2;
                    break;
                }
                break;
            default:
                if ((i13 & 4) != 0) {
                    this.f124625b = true;
                    this.f124626c = j13;
                    this.f124627d = 0;
                    this.f124628e = 0;
                    break;
                }
                break;
        }
    }

    public h() {
        this.f124624a = 1;
        this.f124629f = new d7.d0(10);
        this.f124626c = -9223372036854775807L;
    }
}
