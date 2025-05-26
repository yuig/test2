package t7;

import a7.o0;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import d7.n0;
import g7.y;
import g8.a0;
import g8.d1;
import g8.h0;
import g8.m1;
import g8.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m7.x0;
import m7.y0;
import pk.c1;
import q8.e0;
import q8.k0;
import v.z1;

/* loaded from: classes3.dex */
public final class t implements l8.r, l8.v, d1, q8.u, z0 {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public androidx.media3.common.b F;
    public androidx.media3.common.b G;
    public boolean H;
    public m1 I;

    /* renamed from: J, reason: collision with root package name */
    public Set f116576J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public DrmInitData W;
    public l X;

    /* renamed from: a, reason: collision with root package name */
    public final String f116577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f116578b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.e f116579c;

    /* renamed from: d, reason: collision with root package name */
    public final j f116580d;

    /* renamed from: e, reason: collision with root package name */
    public final l8.m f116581e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.b f116582f;

    /* renamed from: g, reason: collision with root package name */
    public final s7.q f116583g;

    /* renamed from: h, reason: collision with root package name */
    public final s7.m f116584h;

    /* renamed from: i, reason: collision with root package name */
    public final a10.e f116585i;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f116587k;

    /* renamed from: l, reason: collision with root package name */
    public final int f116588l;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f116590n;

    /* renamed from: o, reason: collision with root package name */
    public final List f116591o;

    /* renamed from: p, reason: collision with root package name */
    public final q f116592p;

    /* renamed from: q, reason: collision with root package name */
    public final q f116593q;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f116594r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f116595s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f116596t;

    /* renamed from: u, reason: collision with root package name */
    public h8.f f116597u;

    /* renamed from: v, reason: collision with root package name */
    public s[] f116598v;

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f116600x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseIntArray f116601y;

    /* renamed from: z, reason: collision with root package name */
    public r f116602z;

    /* renamed from: j, reason: collision with root package name */
    public final l8.w f116586j = new l8.w("Loader:HlsSampleStreamWrapper");

    /* renamed from: m, reason: collision with root package name */
    public final z1 f116589m = new z1(3);

    /* renamed from: w, reason: collision with root package name */
    public int[] f116599w = new int[0];

    public t(String str, int i13, t5.e eVar, j jVar, Map map, l8.m mVar, long j13, androidx.media3.common.b bVar, s7.q qVar, s7.m mVar2, a10.e eVar2, h0 h0Var, int i14) {
        this.f116577a = str;
        this.f116578b = i13;
        this.f116579c = eVar;
        this.f116580d = jVar;
        this.f116596t = map;
        this.f116581e = mVar;
        this.f116582f = bVar;
        this.f116583g = qVar;
        this.f116584h = mVar2;
        this.f116585i = eVar2;
        this.f116587k = h0Var;
        this.f116588l = i14;
        Set set = Y;
        this.f116600x = new HashSet(set.size());
        this.f116601y = new SparseIntArray(set.size());
        this.f116598v = new s[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f116590n = arrayList;
        this.f116591o = Collections.unmodifiableList(arrayList);
        this.f116595s = new ArrayList();
        this.f116592p = new q(this, 0);
        this.f116593q = new q(this, 1);
        this.f116594r = n0.n(null);
        this.P = j13;
        this.Q = j13;
    }

    public static int B(int i13) {
        if (i13 == 1) {
            return 2;
        }
        if (i13 != 2) {
            return i13 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static q8.r o(int i13, int i14) {
        d7.u.g("HlsSampleStreamWrapper", "Unmapped track with id " + i13 + " of type " + i14);
        return new q8.r();
    }

    public static androidx.media3.common.b x(androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z13) {
        String str;
        String str2;
        if (bVar == null) {
            return bVar2;
        }
        String str3 = bVar2.f18765o;
        int j13 = o0.j(str3);
        String str4 = bVar.f18761k;
        if (n0.w(j13, str4) == 1) {
            str2 = n0.x(j13, str4);
            str = o0.f(str2);
        } else {
            String c13 = o0.c(str4, str3);
            str = str3;
            str2 = c13;
        }
        a7.q a13 = bVar2.a();
        a13.f1168a = bVar.f18751a;
        a13.f1169b = bVar.f18752b;
        a13.f1170c = c1.r(bVar.f18753c);
        a13.f1171d = bVar.f18754d;
        a13.f1172e = bVar.f18755e;
        a13.f1173f = bVar.f18756f;
        a13.f1175h = z13 ? bVar.f18758h : -1;
        a13.f1176i = z13 ? bVar.f18759i : -1;
        a13.f1177j = str2;
        if (j13 == 2) {
            a13.f1188u = bVar.f18772v;
            a13.f1189v = bVar.f18773w;
            a13.f1190w = bVar.f18774x;
        }
        if (str != null) {
            a13.h(str);
        }
        int i13 = bVar.E;
        if (i13 != -1 && j13 == 1) {
            a13.D = i13;
        }
        a7.n0 n0Var = bVar.f18762l;
        if (n0Var != null) {
            a7.n0 n0Var2 = bVar2.f18762l;
            if (n0Var2 != null) {
                n0Var = n0Var2.b(n0Var);
            }
            a13.f1178k = n0Var;
        }
        return new androidx.media3.common.b(a13);
    }

    @Override // q8.u
    public final void A() {
        this.U = true;
        this.f116594r.post(this.f116593q);
    }

    public final boolean C() {
        return this.Q != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [q8.r] */
    @Override // q8.u
    public final k0 D(int i13, int i14) {
        Integer valueOf = Integer.valueOf(i14);
        Set set = Y;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f116600x;
        SparseIntArray sparseIntArray = this.f116601y;
        s sVar = null;
        if (contains) {
            bf.b.i(set.contains(Integer.valueOf(i14)));
            int i15 = sparseIntArray.get(i14, -1);
            if (i15 != -1) {
                if (hashSet.add(Integer.valueOf(i14))) {
                    this.f116599w[i15] = i13;
                }
                sVar = this.f116599w[i15] == i13 ? this.f116598v[i15] : o(i13, i14);
            }
        } else {
            int i16 = 0;
            while (true) {
                s[] sVarArr = this.f116598v;
                if (i16 >= sVarArr.length) {
                    break;
                }
                if (this.f116599w[i16] == i13) {
                    sVar = sVarArr[i16];
                    break;
                }
                i16++;
            }
        }
        if (sVar == null) {
            if (this.U) {
                return o(i13, i14);
            }
            int length = this.f116598v.length;
            boolean z13 = i14 == 1 || i14 == 2;
            sVar = new s(this.f116581e, this.f116583g, this.f116584h, this.f116596t);
            sVar.f64205t = this.P;
            if (z13) {
                sVar.I = this.W;
                sVar.f64211z = true;
            }
            long j13 = this.V;
            if (sVar.F != j13) {
                sVar.F = j13;
                sVar.w();
            }
            if (this.X != null) {
                sVar.C = r6.f116506k;
            }
            sVar.f64191f = this;
            int i17 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f116599w, i17);
            this.f116599w = copyOf;
            copyOf[length] = i13;
            s[] sVarArr2 = this.f116598v;
            int i18 = n0.f53866a;
            Object[] copyOf2 = Arrays.copyOf(sVarArr2, sVarArr2.length + 1);
            copyOf2[sVarArr2.length] = sVar;
            this.f116598v = (s[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.O, i17);
            this.O = copyOf3;
            copyOf3[length] = z13;
            this.M |= z13;
            hashSet.add(Integer.valueOf(i14));
            sparseIntArray.append(i14, length);
            if (B(i14) > B(this.A)) {
                this.B = length;
                this.A = i14;
            }
            this.N = Arrays.copyOf(this.N, i17);
        }
        if (i14 != 5) {
            return sVar;
        }
        if (this.f116602z == null) {
            this.f116602z = new r(sVar, this.f116588l);
        }
        return this.f116602z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E() {
        int i13;
        if (!this.H && this.K == null && this.C) {
            int i14 = 0;
            for (s sVar : this.f116598v) {
                if (sVar.u() == null) {
                    return;
                }
            }
            m1 m1Var = this.I;
            if (m1Var != null) {
                int i15 = m1Var.f64348a;
                int[] iArr = new int[i15];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i16 = 0; i16 < i15; i16++) {
                    int i17 = 0;
                    while (true) {
                        s[] sVarArr = this.f116598v;
                        if (i17 < sVarArr.length) {
                            androidx.media3.common.b u13 = sVarArr[i17].u();
                            bf.b.w(u13);
                            androidx.media3.common.b bVar = this.I.a(i16).f967d[0];
                            String str = bVar.f18765o;
                            String str2 = u13.f18765o;
                            int j13 = o0.j(str2);
                            if (j13 == 3) {
                                if (Objects.equals(str2, str)) {
                                    if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || u13.f18750J == bVar.f18750J) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i17++;
                            } else if (j13 == o0.j(str)) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    this.K[i16] = i17;
                }
                Iterator it = this.f116595s.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a();
                }
                return;
            }
            int length = this.f116598v.length;
            int i18 = 0;
            int i19 = -1;
            int i23 = -2;
            while (true) {
                int i24 = 1;
                if (i18 >= length) {
                    break;
                }
                androidx.media3.common.b u14 = this.f116598v[i18].u();
                bf.b.w(u14);
                String str3 = u14.f18765o;
                if (o0.q(str3)) {
                    i24 = 2;
                } else if (!o0.m(str3)) {
                    i24 = o0.p(str3) ? 3 : -2;
                }
                if (B(i24) > B(i23)) {
                    i19 = i18;
                    i23 = i24;
                } else if (i24 == i23 && i19 != -1) {
                    i19 = -1;
                }
                i18++;
            }
            a7.c1 c1Var = this.f116580d.f116490h;
            int i25 = c1Var.f964a;
            this.L = -1;
            this.K = new int[length];
            for (int i26 = 0; i26 < length; i26++) {
                this.K[i26] = i26;
            }
            a7.c1[] c1VarArr = new a7.c1[length];
            int i27 = 0;
            while (i27 < length) {
                androidx.media3.common.b u15 = this.f116598v[i27].u();
                bf.b.w(u15);
                String str4 = this.f116577a;
                androidx.media3.common.b bVar2 = this.f116582f;
                if (i27 == i19) {
                    androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[i25];
                    for (int i28 = i14; i28 < i25; i28++) {
                        androidx.media3.common.b bVar3 = c1Var.f967d[i28];
                        if (i23 == 1 && bVar2 != null) {
                            bVar3 = bVar3.e(bVar2);
                        }
                        bVarArr[i28] = i25 == 1 ? u15.e(bVar3) : x(bVar3, u15, true);
                    }
                    c1VarArr[i27] = new a7.c1(str4, bVarArr);
                    this.L = i27;
                    i13 = 0;
                } else {
                    if (i23 != 2 || !o0.m(u15.f18765o)) {
                        bVar2 = null;
                    }
                    StringBuilder D = ep.b.D(str4, ":muxed:");
                    D.append(i27 < i19 ? i27 : i27 - 1);
                    i13 = 0;
                    c1VarArr[i27] = new a7.c1(D.toString(), x(bVar2, u15, false));
                }
                i27++;
                i14 = i13;
            }
            int i29 = i14;
            this.I = w(c1VarArr);
            bf.b.t(this.f116576J == null ? 1 : i29);
            this.f116576J = Collections.emptySet();
            this.D = true;
            this.f116579c.w();
        }
    }

    public final void F() {
        this.f116586j.b();
        j jVar = this.f116580d;
        BehindLiveWindowException behindLiveWindowException = jVar.f116498p;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = jVar.f116499q;
        if (uri == null || !jVar.f116503u) {
            return;
        }
        v7.b bVar = (v7.b) ((v7.c) jVar.f116489g).f124248d.get(uri);
        bVar.f124233b.b();
        IOException iOException = bVar.f124241j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void G(a7.c1[] c1VarArr, int... iArr) {
        this.I = w(c1VarArr);
        this.f116576J = new HashSet();
        for (int i13 : iArr) {
            this.f116576J.add(this.I.a(i13));
        }
        this.L = 0;
        Handler handler = this.f116594r;
        t5.e eVar = this.f116579c;
        Objects.requireNonNull(eVar);
        handler.post(new q(eVar, 2));
        this.D = true;
    }

    public final void H() {
        for (s sVar : this.f116598v) {
            sVar.E(this.R);
        }
        this.R = false;
    }

    public final boolean I(long j13, boolean z13) {
        l lVar;
        int i13;
        this.P = j13;
        if (C()) {
            this.Q = j13;
            return true;
        }
        boolean z14 = this.f116580d.f116500r;
        ArrayList arrayList = this.f116590n;
        if (z14) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                lVar = (l) arrayList.get(i14);
                if (lVar.f68029g == j13) {
                    break;
                }
            }
        }
        lVar = null;
        if (this.C && !z13) {
            int length = this.f116598v.length;
            for (0; i13 < length; i13 + 1) {
                s sVar = this.f116598v[i13];
                i13 = ((lVar != null ? sVar.F(lVar.e(i13)) : sVar.G(j13, false)) || (!this.O[i13] && this.M)) ? i13 + 1 : 0;
            }
            return false;
        }
        this.Q = j13;
        this.T = false;
        arrayList.clear();
        l8.w wVar = this.f116586j;
        if (wVar.d()) {
            if (this.C) {
                for (s sVar2 : this.f116598v) {
                    sVar2.j();
                }
            }
            wVar.a();
        } else {
            wVar.f82099c = null;
            H();
        }
        return true;
    }

    @Override // g8.d1
    public final long a() {
        if (C()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return z().f68030h;
    }

    @Override // g8.z0
    public final void b() {
        this.f116594r.post(this.f116592p);
    }

    @Override // l8.r
    public final void d(l8.u uVar, long j13, long j14) {
        h8.f fVar = (h8.f) uVar;
        this.f116597u = null;
        j jVar = this.f116580d;
        jVar.getClass();
        if (fVar instanceof f) {
            f fVar2 = (f) fVar;
            jVar.f116497o = fVar2.f116473j;
            Uri uri = fVar2.f68024b.f63786a;
            byte[] bArr = fVar2.f116475l;
            bArr.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) jVar.f116492j.f116429b;
            uri.getClass();
        }
        long j15 = fVar.f68023a;
        y yVar = fVar.f68031i;
        g8.v vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        this.f116585i.getClass();
        this.f116587k.e(vVar, fVar.f68025c, this.f116578b, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h);
        if (this.D) {
            this.f116579c.i(this);
            return;
        }
        x0 x0Var = new x0();
        x0Var.f86477a = this.P;
        q(new y0(x0Var));
    }

    @Override // l8.r
    public final l8.s e(l8.u uVar, long j13, long j14, IOException iOException, int i13) {
        boolean z13;
        l8.s sVar;
        int i14;
        h8.f fVar = (h8.f) uVar;
        boolean z14 = fVar instanceof l;
        if (z14 && !((l) fVar).L && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i14 = ((HttpDataSource$InvalidResponseCodeException) iOException).f18780d) == 410 || i14 == 404)) {
            return l8.w.f82094d;
        }
        long j15 = fVar.f68031i.f63852b;
        y yVar = fVar.f68031i;
        g8.v vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        k0.a aVar = new k0.a(vVar, new a0(fVar.f68025c, this.f116578b, fVar.f68026d, fVar.f68027e, fVar.f68028f, n0.o0(fVar.f68029g), n0.o0(fVar.f68030h)), iOException, i13);
        j jVar = this.f116580d;
        l8.q v13 = this.f116585i.v(d7.b.v(jVar.f116501s), aVar);
        if (v13 == null || v13.f82080b != 2) {
            z13 = false;
        } else {
            long j16 = v13.f82081c;
            k8.t tVar = jVar.f116501s;
            z13 = tVar.h(tVar.l(jVar.f116490h.b(fVar.f68026d)), j16);
        }
        if (z13) {
            if (z14 && j15 == 0) {
                ArrayList arrayList = this.f116590n;
                bf.b.t(((l) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((l) com.bumptech.glide.c.P(arrayList)).K = true;
                }
            }
            sVar = l8.w.f82095e;
        } else {
            long x13 = a10.e.x(aVar);
            sVar = x13 != -9223372036854775807L ? new l8.s(0, x13) : l8.w.f82096f;
        }
        boolean z15 = !sVar.c();
        this.f116587k.f(vVar, fVar.f68025c, this.f116578b, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h, iOException, z15);
        if (z15) {
            this.f116597u = null;
        }
        if (z13) {
            if (this.D) {
                this.f116579c.i(this);
            } else {
                x0 x0Var = new x0();
                x0Var.f86477a = this.P;
                q(new y0(x0Var));
            }
        }
        return sVar;
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f116586j.d();
    }

    public final void i() {
        bf.b.t(this.D);
        this.I.getClass();
        this.f116576J.getClass();
    }

    @Override // q8.u
    public final void j(e0 e0Var) {
    }

    @Override // l8.v
    public final void m() {
        for (s sVar : this.f116598v) {
            sVar.D();
        }
    }

    @Override // l8.r
    public final void p(l8.u uVar, long j13, long j14, int i13) {
        g8.v vVar;
        h8.f fVar = (h8.f) uVar;
        if (i13 == 0) {
            vVar = new g8.v(fVar.f68023a, fVar.f68024b, j13);
        } else {
            long j15 = fVar.f68023a;
            y yVar = fVar.f68031i;
            vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        }
        this.f116587k.h(vVar, fVar.f68025c, this.f116578b, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0336 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    @Override // g8.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(m7.y0 r64) {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.t.q(m7.y0):boolean");
    }

    @Override // l8.r
    public final void s(l8.u uVar, long j13, long j14, boolean z13) {
        h8.f fVar = (h8.f) uVar;
        this.f116597u = null;
        long j15 = fVar.f68023a;
        y yVar = fVar.f68031i;
        g8.v vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        this.f116585i.getClass();
        this.f116587k.c(vVar, fVar.f68025c, this.f116578b, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h);
        if (z13) {
            return;
        }
        if (C() || this.E == 0) {
            H();
        }
        if (this.E > 0) {
            this.f116579c.i(this);
        }
    }

    @Override // g8.d1
    public final long t() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.Q;
        }
        long j13 = this.P;
        l z13 = z();
        if (!z13.I) {
            ArrayList arrayList = this.f116590n;
            z13 = arrayList.size() > 1 ? (l) ep.b.h(arrayList, 2) : null;
        }
        if (z13 != null) {
            j13 = Math.max(j13, z13.f68030h);
        }
        if (this.C) {
            for (s sVar : this.f116598v) {
                j13 = Math.max(j13, sVar.p());
            }
        }
        return j13;
    }

    @Override // g8.d1
    public final void v(long j13) {
        l8.w wVar = this.f116586j;
        if (wVar.c() || C()) {
            return;
        }
        boolean d2 = wVar.d();
        j jVar = this.f116580d;
        List list = this.f116591o;
        if (d2) {
            this.f116597u.getClass();
            h8.f fVar = this.f116597u;
            if (jVar.f116498p == null && jVar.f116501s.s(j13, fVar, list)) {
                wVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && jVar.b((l) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            y(size);
        }
        int size2 = (jVar.f116498p != null || jVar.f116501s.length() < 2) ? list.size() : jVar.f116501s.p(j13, list);
        if (size2 < this.f116590n.size()) {
            y(size2);
        }
    }

    public final m1 w(a7.c1[] c1VarArr) {
        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
            a7.c1 c1Var = c1VarArr[i13];
            androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[c1Var.f964a];
            for (int i14 = 0; i14 < c1Var.f964a; i14++) {
                androidx.media3.common.b bVar = c1Var.f967d[i14];
                int d2 = this.f116583g.d(bVar);
                a7.q a13 = bVar.a();
                a13.M = d2;
                bVarArr[i14] = a13.a();
            }
            c1VarArr[i13] = new a7.c1(c1Var.f965b, bVarArr);
        }
        return new m1(c1VarArr);
    }

    public final void y(int i13) {
        ArrayList arrayList;
        bf.b.t(!this.f116586j.d());
        loop0: while (true) {
            arrayList = this.f116590n;
            if (i13 >= arrayList.size()) {
                i13 = -1;
                break;
            }
            int i14 = i13;
            while (true) {
                if (i14 >= arrayList.size()) {
                    l lVar = (l) arrayList.get(i13);
                    for (int i15 = 0; i15 < this.f116598v.length; i15++) {
                        if (this.f116598v[i15].r() > lVar.e(i15)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((l) arrayList.get(i14)).f116509n) {
                    break;
                } else {
                    i14++;
                }
            }
            i13++;
        }
        if (i13 == -1) {
            return;
        }
        long j13 = z().f68030h;
        l lVar2 = (l) arrayList.get(i13);
        n0.d0(i13, arrayList.size(), arrayList);
        for (int i16 = 0; i16 < this.f116598v.length; i16++) {
            this.f116598v[i16].m(lVar2.e(i16));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((l) com.bumptech.glide.c.P(arrayList)).K = true;
        }
        this.T = false;
        this.f116587k.i(this.A, lVar2.f68029g, j13);
    }

    public final l z() {
        return (l) ep.b.h(this.f116590n, 1);
    }
}
