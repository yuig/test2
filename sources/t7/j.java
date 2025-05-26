package t7;

import a7.c1;
import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import d7.n0;
import g7.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import n7.q0;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final k f116483a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.f f116484b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.f f116485c;

    /* renamed from: d, reason: collision with root package name */
    public final w f116486d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f116487e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.b[] f116488f;

    /* renamed from: g, reason: collision with root package name */
    public final v7.t f116489g;

    /* renamed from: h, reason: collision with root package name */
    public final c1 f116490h;

    /* renamed from: i, reason: collision with root package name */
    public final List f116491i;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f116493k;

    /* renamed from: l, reason: collision with root package name */
    public final k0.a f116494l;

    /* renamed from: m, reason: collision with root package name */
    public final long f116495m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f116496n;

    /* renamed from: p, reason: collision with root package name */
    public BehindLiveWindowException f116498p;

    /* renamed from: q, reason: collision with root package name */
    public Uri f116499q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f116500r;

    /* renamed from: s, reason: collision with root package name */
    public k8.t f116501s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f116503u;

    /* renamed from: v, reason: collision with root package name */
    public long f116504v = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public final t5.e f116492j = new t5.e();

    /* renamed from: o, reason: collision with root package name */
    public byte[] f116497o = n0.f53868c;

    /* renamed from: t, reason: collision with root package name */
    public long f116502t = -9223372036854775807L;

    public j(k kVar, v7.t tVar, Uri[] uriArr, androidx.media3.common.b[] bVarArr, c cVar, a0 a0Var, w wVar, long j13, List list, q0 q0Var, k0.a aVar) {
        this.f116483a = kVar;
        this.f116489g = tVar;
        this.f116487e = uriArr;
        this.f116488f = bVarArr;
        this.f116486d = wVar;
        this.f116495m = j13;
        this.f116491i = list;
        this.f116493k = q0Var;
        this.f116494l = aVar;
        g7.f a13 = cVar.f116467a.a();
        this.f116484b = a13;
        if (a0Var != null) {
            a13.f(a0Var);
        }
        this.f116485c = cVar.f116467a.a();
        this.f116490h = new c1(bVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < uriArr.length; i13++) {
            if ((bVarArr[i13].f18756f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        c1 c1Var = this.f116490h;
        int[] B0 = d7.b.B0(arrayList);
        h hVar = new h(c1Var, B0);
        hVar.f116478g = hVar.d(c1Var.f967d[B0[0]]);
        this.f116501s = hVar;
    }

    public static i d(v7.k kVar, long j13, int i13) {
        int i14 = (int) (j13 - kVar.f124308k);
        pk.c1 c1Var = kVar.f124315r;
        int size = c1Var.size();
        pk.c1 c1Var2 = kVar.f124316s;
        if (i14 == size) {
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 < c1Var2.size()) {
                return new i((v7.i) c1Var2.get(i13), j13, i13);
            }
            return null;
        }
        v7.h hVar = (v7.h) c1Var.get(i14);
        if (i13 == -1) {
            return new i(hVar, j13, -1);
        }
        if (i13 < hVar.f124284m.size()) {
            return new i((v7.i) hVar.f124284m.get(i13), j13, i13);
        }
        int i15 = i14 + 1;
        if (i15 < c1Var.size()) {
            return new i((v7.i) c1Var.get(i15), j13 + 1, -1);
        }
        if (c1Var2.isEmpty()) {
            return null;
        }
        return new i((v7.i) c1Var2.get(0), j13 + 1, 0);
    }

    public final h8.q[] a(long j13, l lVar) {
        List list;
        int b13 = lVar == null ? -1 : this.f116490h.b(lVar.f68026d);
        int length = this.f116501s.length();
        h8.q[] qVarArr = new h8.q[length];
        boolean z13 = false;
        int i13 = 0;
        while (i13 < length) {
            int f13 = this.f116501s.f(i13);
            Uri uri = this.f116487e[f13];
            v7.c cVar = (v7.c) this.f116489g;
            if (cVar.c(uri)) {
                v7.k a13 = cVar.a(z13, uri);
                a13.getClass();
                long j14 = a13.f124305h - cVar.f124259o;
                Pair c13 = c(lVar, f13 != b13 ? true : z13, a13, j14, j13);
                long longValue = ((Long) c13.first).longValue();
                int intValue = ((Integer) c13.second).intValue();
                int i14 = (int) (longValue - a13.f124308k);
                if (i14 >= 0) {
                    pk.c1 c1Var = a13.f124315r;
                    if (c1Var.size() >= i14) {
                        ArrayList arrayList = new ArrayList();
                        if (i14 < c1Var.size()) {
                            if (intValue != -1) {
                                v7.h hVar = (v7.h) c1Var.get(i14);
                                if (intValue == 0) {
                                    arrayList.add(hVar);
                                } else if (intValue < hVar.f124284m.size()) {
                                    pk.c1 c1Var2 = hVar.f124284m;
                                    arrayList.addAll(c1Var2.subList(intValue, c1Var2.size()));
                                }
                                i14++;
                            }
                            arrayList.addAll(c1Var.subList(i14, c1Var.size()));
                            intValue = 0;
                        }
                        if (a13.f124311n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            pk.c1 c1Var3 = a13.f124316s;
                            if (intValue < c1Var3.size()) {
                                arrayList.addAll(c1Var3.subList(intValue, c1Var3.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        qVarArr[i13] = new g(j14, list);
                    }
                }
                y0 y0Var = pk.c1.f100372b;
                list = v2.f100502e;
                qVarArr[i13] = new g(j14, list);
            } else {
                qVarArr[i13] = h8.q.f68073xo;
            }
            i13++;
            z13 = false;
        }
        return qVarArr;
    }

    public final int b(l lVar) {
        if (lVar.f116510o == -1) {
            return 1;
        }
        v7.k a13 = ((v7.c) this.f116489g).a(false, this.f116487e[this.f116490h.b(lVar.f68026d)]);
        a13.getClass();
        int i13 = (int) (lVar.f68072j - a13.f124308k);
        if (i13 < 0) {
            return 1;
        }
        pk.c1 c1Var = a13.f124315r;
        pk.c1 c1Var2 = i13 < c1Var.size() ? ((v7.h) c1Var.get(i13)).f124284m : a13.f124316s;
        int size = c1Var2.size();
        int i14 = lVar.f116510o;
        if (i14 >= size) {
            return 2;
        }
        v7.f fVar = (v7.f) c1Var2.get(i14);
        if (fVar.f124279m) {
            return 0;
        }
        return Objects.equals(Uri.parse(b7.c.N(a13.f124341a, fVar.f124285a)), lVar.f68024b.f63786a) ? 1 : 2;
    }

    public final Pair c(l lVar, boolean z13, v7.k kVar, long j13, long j14) {
        boolean z14 = true;
        if (lVar != null && !z13) {
            boolean z15 = lVar.I;
            long j15 = lVar.f68072j;
            int i13 = lVar.f116510o;
            if (!z15) {
                return new Pair(Long.valueOf(j15), Integer.valueOf(i13));
            }
            if (i13 == -1) {
                j15 = lVar.a();
            }
            return new Pair(Long.valueOf(j15), Integer.valueOf(i13 != -1 ? i13 + 1 : -1));
        }
        long j16 = kVar.f124318u + j13;
        if (lVar != null && !this.f116500r) {
            j14 = lVar.f68029g;
        }
        boolean z16 = kVar.f124312o;
        long j17 = kVar.f124308k;
        pk.c1 c1Var = kVar.f124315r;
        if (!z16 && j14 >= j16) {
            return new Pair(Long.valueOf(j17 + c1Var.size()), -1);
        }
        long j18 = j14 - j13;
        Long valueOf = Long.valueOf(j18);
        int i14 = 0;
        if (((v7.c) this.f116489g).f124258n && lVar != null) {
            z14 = false;
        }
        int c13 = n0.c(c1Var, valueOf, z14);
        long j19 = c13 + j17;
        if (c13 >= 0) {
            v7.h hVar = (v7.h) c1Var.get(c13);
            long j23 = hVar.f124289e + hVar.f124287c;
            pk.c1 c1Var2 = kVar.f124316s;
            pk.c1 c1Var3 = j18 < j23 ? hVar.f124284m : c1Var2;
            while (true) {
                if (i14 >= c1Var3.size()) {
                    break;
                }
                v7.f fVar = (v7.f) c1Var3.get(i14);
                if (j18 >= fVar.f124289e + fVar.f124287c) {
                    i14++;
                } else if (fVar.f124278l) {
                    j19 += c1Var3 == c1Var2 ? 1L : 0L;
                    r1 = i14;
                }
            }
        }
        return new Pair(Long.valueOf(j19), Integer.valueOf(r1));
    }

    public final f e(Uri uri, int i13, boolean z13, l8.k kVar) {
        g7.i iVar;
        if (uri == null) {
            return null;
        }
        t5.e eVar = this.f116492j;
        byte[] bArr = (byte[]) ((LinkedHashMap) eVar.f116429b).remove(uri);
        if (bArr != null) {
            return null;
        }
        g7.i iVar2 = new g7.i(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null);
        if (kVar != null) {
            if (z13) {
                kVar.f82037j = "i";
            }
            iVar = kVar.a().a(iVar2);
        } else {
            iVar = iVar2;
        }
        androidx.media3.common.b bVar = this.f116488f[i13];
        int t13 = this.f116501s.t();
        Object j13 = this.f116501s.j();
        byte[] bArr2 = this.f116497o;
        f fVar = new f(this.f116485c, iVar, 3, bVar, t13, j13, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = n0.f53868c;
        }
        fVar.f116473j = bArr2;
        return fVar;
    }
}
