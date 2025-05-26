package v9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pk.d1;

/* loaded from: classes3.dex */
public final class f0 implements q8.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f124585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124586b;

    /* renamed from: c, reason: collision with root package name */
    public final List f124587c;

    /* renamed from: d, reason: collision with root package name */
    public final d7.d0 f124588d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f124589e;

    /* renamed from: f, reason: collision with root package name */
    public final ho.i f124590f;

    /* renamed from: g, reason: collision with root package name */
    public final l9.j f124591g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f124592h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f124593i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f124594j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f124595k;

    /* renamed from: l, reason: collision with root package name */
    public d1 f124596l;

    /* renamed from: m, reason: collision with root package name */
    public q8.u f124597m;

    /* renamed from: n, reason: collision with root package name */
    public int f124598n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f124599o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f124600p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f124601q;

    /* renamed from: r, reason: collision with root package name */
    public i0 f124602r;

    /* renamed from: s, reason: collision with root package name */
    public int f124603s;

    /* renamed from: t, reason: collision with root package name */
    public int f124604t;

    public f0(int i13, int i14, l9.j jVar, k0 k0Var, ho.i iVar) {
        this.f124590f = iVar;
        this.f124585a = i13;
        this.f124586b = i14;
        this.f124591g = jVar;
        if (i13 == 1 || i13 == 2) {
            this.f124587c = Collections.singletonList(k0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f124587c = arrayList;
            arrayList.add(k0Var);
        }
        this.f124588d = new d7.d0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f124593i = sparseBooleanArray;
        this.f124594j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f124592h = sparseArray;
        this.f124589e = new SparseIntArray();
        this.f124595k = new d0();
        this.f124597m = q8.u.Po;
        this.f124604t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i15 = 0; i15 < size; i15++) {
            sparseArray.put(sparseArray2.keyAt(i15), (i0) sparseArray2.valueAt(i15));
        }
        sparseArray.put(0, new c0(new sp2.i(this)));
        this.f124602r = null;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        int i13;
        d1 d1Var;
        long j15;
        bf.b.t(this.f124585a != 2);
        List list = this.f124587c;
        int size = list.size();
        for (0; i13 < size; i13 + 1) {
            k0 k0Var = (k0) list.get(i13);
            synchronized (k0Var) {
                j15 = k0Var.f53847b;
            }
            boolean z13 = j15 == -9223372036854775807L;
            if (z13) {
                i13 = z13 ? 0 : i13 + 1;
                k0Var.f(j14);
            } else {
                long d2 = k0Var.d();
                if (d2 != -9223372036854775807L) {
                    if (d2 != 0) {
                        if (d2 == j14) {
                        }
                        k0Var.f(j14);
                    }
                }
            }
        }
        if (j14 != 0 && (d1Var = this.f124596l) != null) {
            d1Var.c(j14);
        }
        this.f124588d.H(0);
        this.f124589e.clear();
        int i14 = 0;
        while (true) {
            SparseArray sparseArray = this.f124592h;
            if (i14 >= sparseArray.size()) {
                this.f124603s = 0;
                return;
            } else {
                ((i0) sparseArray.valueAt(i14)).f();
                i14++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v33 */
    @Override // q8.s
    public final int d(q8.t tVar, q8.c0 c0Var) {
        int i13;
        ?? r33;
        ?? r43;
        int i14;
        int i15;
        boolean z13;
        int i16;
        long j13;
        long j14;
        long length = tVar.getLength();
        int i17 = this.f124585a;
        boolean z14 = i17 == 2;
        if (this.f124599o) {
            d0 d0Var = this.f124595k;
            if (length != -1 && !z14 && !d0Var.f124538d) {
                int i18 = this.f124604t;
                if (i18 <= 0) {
                    d0Var.a(tVar);
                } else {
                    boolean z15 = d0Var.f124540f;
                    d7.d0 d0Var2 = d0Var.f124537c;
                    int i19 = d0Var.f124535a;
                    if (!z15) {
                        long length2 = tVar.getLength();
                        int min = (int) Math.min(i19, length2);
                        long j15 = length2 - min;
                        if (tVar.h() != j15) {
                            c0Var.f102894a = j15;
                            i16 = 1;
                            return i16;
                        }
                        d0Var2.H(min);
                        tVar.g();
                        tVar.s(d0Var2.f53806a, 0, min);
                        int i23 = d0Var2.f53807b;
                        int i24 = d0Var2.f53808c;
                        int i25 = i24 - 188;
                        while (true) {
                            if (i25 < i23) {
                                j14 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = d0Var2.f53806a;
                            int i26 = -4;
                            int i27 = 0;
                            while (true) {
                                if (i26 > 4) {
                                    break;
                                }
                                int i28 = (i26 * RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD) + i25;
                                if (i28 < i23 || i28 >= i24 || bArr[i28] != 71) {
                                    i27 = 0;
                                } else {
                                    i27++;
                                    if (i27 == 5) {
                                        long j03 = f0.h.j0(i25, i18, d0Var2);
                                        if (j03 != -9223372036854775807L) {
                                            j14 = j03;
                                            break;
                                        }
                                    }
                                }
                                i26++;
                            }
                            i25--;
                        }
                        d0Var.f124542h = j14;
                        d0Var.f124540f = true;
                        i16 = 0;
                        return i16;
                    }
                    if (d0Var.f124542h != -9223372036854775807L) {
                        if (d0Var.f124539e) {
                            i16 = 0;
                            long j16 = d0Var.f124541g;
                            if (j16 == -9223372036854775807L) {
                                d0Var.a(tVar);
                            } else {
                                k0 k0Var = d0Var.f124536b;
                                d0Var.f124543i = k0Var.c(d0Var.f124542h) - k0Var.b(j16);
                                d0Var.a(tVar);
                            }
                        } else {
                            int min2 = (int) Math.min(i19, tVar.getLength());
                            i16 = 0;
                            long j17 = 0;
                            if (tVar.h() != j17) {
                                c0Var.f102894a = j17;
                                i16 = 1;
                            } else {
                                d0Var2.H(min2);
                                tVar.g();
                                tVar.s(d0Var2.f53806a, 0, min2);
                                int i29 = d0Var2.f53807b;
                                int i33 = d0Var2.f53808c;
                                while (true) {
                                    if (i29 >= i33) {
                                        j13 = -9223372036854775807L;
                                        break;
                                    }
                                    if (d0Var2.f53806a[i29] == 71) {
                                        j13 = f0.h.j0(i29, i18, d0Var2);
                                        if (j13 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i29++;
                                }
                                d0Var.f124541g = j13;
                                d0Var.f124539e = true;
                            }
                        }
                        return i16;
                    }
                    d0Var.a(tVar);
                }
                return 0;
            }
            if (this.f124600p) {
                i13 = i17;
            } else {
                this.f124600p = true;
                long j18 = d0Var.f124543i;
                if (j18 != -9223372036854775807L) {
                    int i34 = this.f124604t;
                    v5.x xVar = new v5.x(29);
                    g.i iVar = new g.i();
                    iVar.f63178a = i34;
                    iVar.f63180c = d0Var.f124536b;
                    iVar.f63179b = 112800;
                    iVar.f63181d = new d7.d0();
                    i13 = i17;
                    d1 d1Var = new d1(xVar, iVar, j18, j18 + 1, 0L, length, 188L, 940);
                    this.f124596l = d1Var;
                    this.f124597m.j((q8.g) d1Var.f102947b);
                } else {
                    i13 = i17;
                    this.f124597m.j(new q8.w(j18));
                }
            }
            if (this.f124601q) {
                z13 = false;
                this.f124601q = false;
                b(0L, 0L);
                if (tVar.h() != 0) {
                    c0Var.f102894a = 0L;
                    return 1;
                }
            } else {
                z13 = false;
            }
            r43 = 1;
            r43 = 1;
            d1 d1Var2 = this.f124596l;
            r33 = z13;
            if (d1Var2 != null) {
                r33 = z13;
                if (d1Var2.f102949d != null) {
                    return d1Var2.a(tVar, c0Var);
                }
            }
        } else {
            i13 = i17;
            r33 = 0;
            r43 = 1;
        }
        d7.d0 d0Var3 = this.f124588d;
        byte[] bArr2 = d0Var3.f53806a;
        if (9400 - d0Var3.f53807b < 188) {
            int a13 = d0Var3.a();
            if (a13 > 0) {
                System.arraycopy(bArr2, d0Var3.f53807b, bArr2, r33, a13);
            }
            d0Var3.I(a13, bArr2);
        }
        while (true) {
            int a14 = d0Var3.a();
            SparseArray sparseArray = this.f124592h;
            if (a14 >= 188) {
                int i35 = d0Var3.f53807b;
                int i36 = d0Var3.f53808c;
                byte[] bArr3 = d0Var3.f53806a;
                int i37 = i35;
                while (i37 < i36 && bArr3[i37] != 71) {
                    i37++;
                }
                d0Var3.K(i37);
                int i38 = i37 + RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD;
                if (i38 > i36) {
                    int i39 = (i37 - i35) + this.f124603s;
                    this.f124603s = i39;
                    i14 = i13;
                    i15 = 2;
                    if (i14 == 2 && i39 > 376) {
                        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    i14 = i13;
                    i15 = 2;
                    this.f124603s = r33;
                }
                int i43 = d0Var3.f53808c;
                if (i38 > i43) {
                    return r33;
                }
                int k13 = d0Var3.k();
                if ((8388608 & k13) != 0) {
                    d0Var3.K(i38);
                    return r33;
                }
                int i44 = (4194304 & k13) != 0 ? r43 : r33;
                int i45 = (2096896 & k13) >> 8;
                boolean z16 = (k13 & 32) != 0 ? r43 : r33;
                i0 i0Var = (k13 & 16) != 0 ? (i0) sparseArray.get(i45) : null;
                if (i0Var == null) {
                    d0Var3.K(i38);
                    return r33;
                }
                if (i14 != i15) {
                    int i46 = k13 & 15;
                    SparseIntArray sparseIntArray = this.f124589e;
                    int i47 = sparseIntArray.get(i45, i46 - 1);
                    sparseIntArray.put(i45, i46);
                    if (i47 == i46) {
                        d0Var3.K(i38);
                        return r33;
                    }
                    if (i46 != ((i47 + r43) & 15)) {
                        i0Var.f();
                    }
                }
                if (z16) {
                    int y13 = d0Var3.y();
                    i44 |= (d0Var3.y() & 64) != 0 ? i15 : r33;
                    d0Var3.L(y13 - r43);
                }
                boolean z17 = this.f124599o;
                if (i14 == i15 || z17 || !this.f124594j.get(i45, r33)) {
                    d0Var3.J(i38);
                    i0Var.b(i44, d0Var3);
                    d0Var3.J(i43);
                }
                if (i14 != i15 && !z17 && this.f124599o && length != -1) {
                    this.f124601q = r43;
                }
                d0Var3.K(i38);
                return r33;
            }
            int i48 = d0Var3.f53808c;
            int read = tVar.read(bArr2, i48, 9400 - i48);
            if (read == -1) {
                for (int i49 = r33; i49 < sparseArray.size(); i49++) {
                    i0 i0Var2 = (i0) sparseArray.valueAt(i49);
                    if (i0Var2 instanceof x) {
                        x xVar2 = (x) i0Var2;
                        boolean z18 = (!z14 || xVar2.d()) ? r43 : r33;
                        if (xVar2.f124828c == 3 && xVar2.f124835j == -1 && ((!z14 || !(xVar2.f124826a instanceof k)) && z18)) {
                            xVar2.b(r43, new d7.d0());
                        }
                    }
                }
                return -1;
            }
            d0Var3.J(i48 + read);
        }
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        if ((this.f124586b & 1) == 0) {
            uVar = new l9.m(uVar, this.f124591g);
        }
        this.f124597m = uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(q8.t r7) {
        /*
            r6 = this;
            d7.d0 r0 = r6.f124588d
            byte[] r0 = r0.f53806a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.s(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.p(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.f0.i(q8.t):boolean");
    }
}
