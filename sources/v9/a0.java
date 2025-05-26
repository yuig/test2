package v9;

import android.util.SparseArray;
import com.google.android.gms.internal.measurement.q4;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.k0;
import pk.d1;

/* loaded from: classes3.dex */
public final class a0 implements q8.s {

    /* renamed from: e, reason: collision with root package name */
    public boolean f124491e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f124492f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124493g;

    /* renamed from: h, reason: collision with root package name */
    public long f124494h;

    /* renamed from: i, reason: collision with root package name */
    public d1 f124495i;

    /* renamed from: j, reason: collision with root package name */
    public q8.u f124496j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124497k;

    /* renamed from: a, reason: collision with root package name */
    public final k0 f124487a = new k0(0);

    /* renamed from: c, reason: collision with root package name */
    public final d7.d0 f124489c = new d7.d0(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f124488b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f124490d = new y();

    @Override // q8.s
    public final void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r4 != r9) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r7.f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0028, code lost:
    
        if (r8 != false) goto L19;
     */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r7, long r9) {
        /*
            r6 = this;
            d7.k0 r7 = r6.f124487a
            monitor-enter(r7)
            long r0 = r7.f53847b     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r7)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r8 != 0) goto L12
            r8 = 1
            goto L13
        L12:
            r8 = r0
        L13:
            if (r8 != 0) goto L28
            long r4 = r7.d()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L2d
            r1 = 0
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 == 0) goto L2d
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 == 0) goto L2d
            goto L2a
        L28:
            if (r8 == 0) goto L2d
        L2a:
            r7.f(r9)
        L2d:
            pk.d1 r7 = r6.f124495i
            if (r7 == 0) goto L34
            r7.c(r9)
        L34:
            r7 = r0
        L35:
            android.util.SparseArray r8 = r6.f124488b
            int r9 = r8.size()
            if (r7 >= r9) goto L4d
            java.lang.Object r8 = r8.valueAt(r7)
            v9.z r8 = (v9.z) r8
            r8.f124851f = r0
            v9.i r8 = r8.f124846a
            r8.f()
            int r7 = r7 + 1
            goto L35
        L4d:
            return
        L4e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.a0.b(long, long):void");
    }

    @Override // q8.s
    public final int d(q8.t tVar, q8.c0 c0Var) {
        i iVar;
        long j13;
        long j14;
        bf.b.w(this.f124496j);
        long length = tVar.getLength();
        y yVar = this.f124490d;
        int i13 = 1;
        if (length != -1 && !yVar.f124840c) {
            boolean z13 = yVar.f124842e;
            d7.d0 d0Var = yVar.f124839b;
            if (!z13) {
                long length2 = tVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j15 = length2 - min;
                if (tVar.h() != j15) {
                    c0Var.f102894a = j15;
                } else {
                    d0Var.H(min);
                    tVar.g();
                    tVar.s(d0Var.f53806a, 0, min);
                    int i14 = d0Var.f53807b;
                    int i15 = d0Var.f53808c - 4;
                    while (true) {
                        if (i15 < i14) {
                            j14 = -9223372036854775807L;
                            break;
                        }
                        if (y.b(i15, d0Var.f53806a) == 442) {
                            d0Var.K(i15 + 4);
                            long c13 = y.c(d0Var);
                            if (c13 != -9223372036854775807L) {
                                j14 = c13;
                                break;
                            }
                        }
                        i15--;
                    }
                    yVar.f124844g = j14;
                    yVar.f124842e = true;
                    i13 = 0;
                }
            } else {
                if (yVar.f124844g == -9223372036854775807L) {
                    yVar.a(tVar);
                    return 0;
                }
                if (yVar.f124841d) {
                    long j16 = yVar.f124843f;
                    if (j16 == -9223372036854775807L) {
                        yVar.a(tVar);
                        return 0;
                    }
                    k0 k0Var = yVar.f124838a;
                    yVar.f124845h = k0Var.c(yVar.f124844g) - k0Var.b(j16);
                    yVar.a(tVar);
                    return 0;
                }
                int min2 = (int) Math.min(20000L, tVar.getLength());
                long j17 = 0;
                if (tVar.h() != j17) {
                    c0Var.f102894a = j17;
                } else {
                    d0Var.H(min2);
                    tVar.g();
                    tVar.s(d0Var.f53806a, 0, min2);
                    int i16 = d0Var.f53807b;
                    int i17 = d0Var.f53808c;
                    while (true) {
                        if (i16 >= i17 - 3) {
                            j13 = -9223372036854775807L;
                            break;
                        }
                        if (y.b(i16, d0Var.f53806a) == 442) {
                            d0Var.K(i16 + 4);
                            long c14 = y.c(d0Var);
                            if (c14 != -9223372036854775807L) {
                                j13 = c14;
                                break;
                            }
                        }
                        i16++;
                    }
                    yVar.f124843f = j13;
                    yVar.f124841d = true;
                    i13 = 0;
                }
            }
            return i13;
        }
        if (!this.f124497k) {
            this.f124497k = true;
            long j18 = yVar.f124845h;
            if (j18 != -9223372036854775807L) {
                d1 d1Var = new d1(new v5.x(29), new q4(yVar.f124838a, 0), j18, j18 + 1, 0L, length, 188L, 1000);
                this.f124495i = d1Var;
                this.f124496j.j((q8.g) d1Var.f102947b);
            } else {
                this.f124496j.j(new q8.w(j18));
            }
        }
        d1 d1Var2 = this.f124495i;
        if (d1Var2 != null && d1Var2.f102949d != null) {
            return d1Var2.a(tVar, c0Var);
        }
        tVar.g();
        long k13 = length != -1 ? length - tVar.k() : -1L;
        if (k13 != -1 && k13 < 4) {
            return -1;
        }
        d7.d0 d0Var2 = this.f124489c;
        if (!tVar.c(d0Var2.f53806a, 0, 4, true)) {
            return -1;
        }
        d0Var2.K(0);
        int k14 = d0Var2.k();
        if (k14 == 441) {
            return -1;
        }
        if (k14 == 442) {
            tVar.s(d0Var2.f53806a, 0, 10);
            d0Var2.K(9);
            tVar.p((d0Var2.y() & 7) + 14);
            return 0;
        }
        if (k14 == 443) {
            tVar.s(d0Var2.f53806a, 0, 2);
            d0Var2.K(0);
            tVar.p(d0Var2.E() + 6);
            return 0;
        }
        if (((k14 & (-256)) >> 8) != 1) {
            tVar.p(1);
            return 0;
        }
        int i18 = k14 & 255;
        SparseArray sparseArray = this.f124488b;
        z zVar = (z) sparseArray.get(i18);
        if (!this.f124491e) {
            if (zVar == null) {
                if (i18 == 189) {
                    iVar = new b("video/mp2p");
                    this.f124492f = true;
                    this.f124494h = tVar.h();
                } else if ((k14 & RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL) == 192) {
                    iVar = new u(null, 0, "video/mp2p");
                    this.f124492f = true;
                    this.f124494h = tVar.h();
                } else if ((k14 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM) == 224) {
                    iVar = new k(null, "video/mp2p");
                    this.f124493g = true;
                    this.f124494h = tVar.h();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.g(this.f124496j, new h0(i18, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
                    zVar = new z(iVar, this.f124487a);
                    sparseArray.put(i18, zVar);
                }
            }
            if (tVar.h() > ((this.f124492f && this.f124493g) ? this.f124494h + 8192 : 1048576L)) {
                this.f124491e = true;
                this.f124496j.A();
            }
        }
        tVar.s(d0Var2.f53806a, 0, 2);
        d0Var2.K(0);
        int E = d0Var2.E() + 6;
        if (zVar == null) {
            tVar.p(E);
        } else {
            d0Var2.H(E);
            tVar.readFully(d0Var2.f53806a, 0, E);
            d0Var2.K(6);
            d7.c0 c0Var2 = zVar.f124848c;
            d0Var2.i(c0Var2.f53793b, 0, 3);
            c0Var2.m(0);
            c0Var2.o(8);
            zVar.f124849d = c0Var2.f();
            zVar.f124850e = c0Var2.f();
            c0Var2.o(6);
            d0Var2.i(c0Var2.f53793b, 0, c0Var2.g(8));
            c0Var2.m(0);
            zVar.f124852g = 0L;
            if (zVar.f124849d) {
                c0Var2.o(4);
                c0Var2.o(1);
                c0Var2.o(1);
                long g13 = (c0Var2.g(3) << 30) | (c0Var2.g(15) << 15) | c0Var2.g(15);
                c0Var2.o(1);
                boolean z14 = zVar.f124851f;
                k0 k0Var2 = zVar.f124847b;
                if (!z14 && zVar.f124850e) {
                    c0Var2.o(4);
                    c0Var2.o(1);
                    c0Var2.o(1);
                    c0Var2.o(1);
                    k0Var2.b((c0Var2.g(3) << 30) | (c0Var2.g(15) << 15) | c0Var2.g(15));
                    zVar.f124851f = true;
                }
                zVar.f124852g = k0Var2.b(g13);
            }
            long j19 = zVar.f124852g;
            i iVar2 = zVar.f124846a;
            iVar2.i(4, j19);
            iVar2.e(d0Var2);
            iVar2.h(false);
            d0Var2.J(d0Var2.f53806a.length);
        }
        return 0;
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        this.f124496j = uVar;
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        byte[] bArr = new byte[14];
        tVar.s(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        tVar.m(bArr[13] & 7);
        tVar.s(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
