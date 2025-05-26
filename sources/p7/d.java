package p7;

import a7.o0;
import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.n1;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import d7.n0;
import g7.a0;
import g8.a1;
import g8.b0;
import g8.c0;
import g8.c1;
import g8.d1;
import g8.h0;
import g8.m1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.x;
import m7.x1;
import n7.q0;
import pk.v2;
import pk.y0;

/* loaded from: classes.dex */
public final class d implements c0, c1, h8.k {
    public static final Pattern B = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern C = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public long A;

    /* renamed from: a, reason: collision with root package name */
    public final int f98942a;

    /* renamed from: b, reason: collision with root package name */
    public final a f98943b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f98944c;

    /* renamed from: d, reason: collision with root package name */
    public final k0.a f98945d;

    /* renamed from: e, reason: collision with root package name */
    public final s7.q f98946e;

    /* renamed from: f, reason: collision with root package name */
    public final a10.e f98947f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.firebase.messaging.q f98948g;

    /* renamed from: h, reason: collision with root package name */
    public final long f98949h;

    /* renamed from: i, reason: collision with root package name */
    public final x f98950i;

    /* renamed from: j, reason: collision with root package name */
    public final l8.m f98951j;

    /* renamed from: k, reason: collision with root package name */
    public final m1 f98952k;

    /* renamed from: l, reason: collision with root package name */
    public final c[] f98953l;

    /* renamed from: m, reason: collision with root package name */
    public final n1 f98954m;

    /* renamed from: n, reason: collision with root package name */
    public final u f98955n;

    /* renamed from: p, reason: collision with root package name */
    public final h0 f98957p;

    /* renamed from: q, reason: collision with root package name */
    public final s7.m f98958q;

    /* renamed from: r, reason: collision with root package name */
    public final q0 f98959r;

    /* renamed from: s, reason: collision with root package name */
    public b0 f98960s;

    /* renamed from: v, reason: collision with root package name */
    public g8.l f98963v;

    /* renamed from: w, reason: collision with root package name */
    public q7.c f98964w;

    /* renamed from: x, reason: collision with root package name */
    public int f98965x;

    /* renamed from: y, reason: collision with root package name */
    public List f98966y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f98967z = true;

    /* renamed from: t, reason: collision with root package name */
    public h8.l[] f98961t = new h8.l[0];

    /* renamed from: u, reason: collision with root package name */
    public r[] f98962u = new r[0];

    /* renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f98956o = new IdentityHashMap();

    public d(int i13, q7.c cVar, com.google.firebase.messaging.q qVar, int i14, a aVar, a0 a0Var, k0.a aVar2, s7.q qVar2, s7.m mVar, a10.e eVar, h0 h0Var, long j13, x xVar, l8.m mVar2, n1 n1Var, g gVar, q0 q0Var) {
        List list;
        int i15;
        androidx.media3.common.b[] bVarArr;
        int i16;
        int i17;
        androidx.media3.common.b[] bVarArr2;
        q7.f d2;
        Integer num;
        s7.q qVar3 = qVar2;
        this.f98942a = i13;
        this.f98964w = cVar;
        this.f98948g = qVar;
        this.f98965x = i14;
        this.f98943b = aVar;
        this.f98944c = a0Var;
        this.f98945d = aVar2;
        this.f98946e = qVar3;
        this.f98958q = mVar;
        this.f98947f = eVar;
        this.f98957p = h0Var;
        this.f98949h = j13;
        this.f98950i = xVar;
        this.f98951j = mVar2;
        this.f98954m = n1Var;
        this.f98959r = q0Var;
        this.f98955n = new u(cVar, gVar, mVar2);
        n1Var.getClass();
        y0 y0Var = pk.c1.f100372b;
        v2 v2Var = v2.f100502e;
        this.f98963v = new g8.l(v2Var, v2Var);
        q7.h b13 = cVar.b(i14);
        List list2 = b13.f102642d;
        this.f98966y = list2;
        List list3 = b13.f102641c;
        int size = list3.size();
        HashMap hashMap = new HashMap(bf.b.e(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i18 = 0; i18 < size; i18++) {
            hashMap.put(Long.valueOf(((q7.a) list3.get(i18)).f102594a), Integer.valueOf(i18));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i18));
            arrayList.add(arrayList2);
            sparseArray.put(i18, arrayList2);
        }
        for (int i19 = 0; i19 < size; i19++) {
            q7.a aVar3 = (q7.a) list3.get(i19);
            q7.f d13 = d("http://dashif.org/guidelines/trickmode", aVar3.f102598e);
            List list4 = aVar3.f102599f;
            d13 = d13 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d13;
            int intValue = (d13 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(d13.f102633b)))) == null) ? i19 : num.intValue();
            if (intValue == i19 && (d2 = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i23 = n0.f53866a;
                String[] split = d2.f102633b.split(",", -1);
                int length = split.length;
                int i24 = intValue;
                int i25 = 0;
                while (i25 < length) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i25])));
                    String[] strArr = split;
                    if (num2 != null && b(aVar3, (q7.a) list3.get(num2.intValue()))) {
                        i24 = Math.min(i24, num2.intValue());
                    }
                    i25++;
                    split = strArr;
                }
                intValue = i24;
            }
            if (intValue != i19) {
                List list5 = (List) sparseArray.get(i19);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i19, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i26 = 0; i26 < size2; i26++) {
            int[] B0 = d7.b.B0((Collection) arrayList.get(i26));
            iArr[i26] = B0;
            Arrays.sort(B0);
        }
        boolean[] zArr = new boolean[size2];
        androidx.media3.common.b[][] bVarArr3 = new androidx.media3.common.b[size2][];
        int i27 = 0;
        for (int i28 = 0; i28 < size2; i28++) {
            int[] iArr2 = iArr[i28];
            int length2 = iArr2.length;
            int i29 = 0;
            while (true) {
                if (i29 >= length2) {
                    break;
                }
                List list7 = ((q7.a) list3.get(iArr2[i29])).f102596c;
                int[] iArr3 = iArr2;
                for (int i33 = 0; i33 < list7.size(); i33++) {
                    if (!((q7.m) list7.get(i33)).f102660d.isEmpty()) {
                        zArr[i28] = true;
                        i27++;
                        break;
                    }
                }
                i29++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i28];
            int length3 = iArr4.length;
            int i34 = 0;
            while (true) {
                if (i34 >= length3) {
                    bVarArr2 = new androidx.media3.common.b[0];
                    break;
                }
                int i35 = iArr4[i34];
                q7.a aVar4 = (q7.a) list3.get(i35);
                List list8 = ((q7.a) list3.get(i35)).f102597d;
                int[] iArr5 = iArr4;
                int i36 = length3;
                int i37 = 0;
                while (i37 < list8.size()) {
                    q7.f fVar = (q7.f) list8.get(i37);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f102632a)) {
                        a7.q qVar4 = new a7.q();
                        qVar4.f1181n = o0.r("application/cea-608");
                        qVar4.f1168a = a.a.o(new StringBuilder(), aVar4.f102594a, ":cea608");
                        bVarArr2 = o(fVar, B, new androidx.media3.common.b(qVar4));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f102632a)) {
                        a7.q qVar5 = new a7.q();
                        qVar5.f1181n = o0.r("application/cea-708");
                        qVar5.f1168a = a.a.o(new StringBuilder(), aVar4.f102594a, ":cea708");
                        bVarArr2 = o(fVar, C, new androidx.media3.common.b(qVar5));
                        break;
                    }
                    i37++;
                    list8 = list9;
                }
                i34++;
                iArr4 = iArr5;
                length3 = i36;
            }
            bVarArr3[i28] = bVarArr2;
            if (bVarArr2.length != 0) {
                i27++;
            }
        }
        int size3 = list2.size() + i27 + size2;
        a7.c1[] c1VarArr = new a7.c1[size3];
        c[] cVarArr = new c[size3];
        int i38 = 0;
        int i39 = 0;
        while (i38 < size2) {
            int[] iArr6 = iArr[i38];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i43 = size2;
            int i44 = 0;
            while (i44 < length4) {
                arrayList3.addAll(((q7.a) list3.get(iArr6[i44])).f102596c);
                i44++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            androidx.media3.common.b[] bVarArr4 = new androidx.media3.common.b[size4];
            int i45 = 0;
            while (i45 < size4) {
                int i46 = size4;
                androidx.media3.common.b bVar = ((q7.m) arrayList3.get(i45)).f102657a;
                ArrayList arrayList4 = arrayList3;
                a7.q a13 = bVar.a();
                a13.M = qVar3.d(bVar);
                bVarArr4[i45] = new androidx.media3.common.b(a13);
                i45++;
                size4 = i46;
                arrayList3 = arrayList4;
            }
            q7.a aVar5 = (q7.a) list3.get(iArr6[0]);
            long j14 = aVar5.f102594a;
            String l13 = j14 != -1 ? Long.toString(j14) : a.a.d("unset:", i38);
            int i47 = i39 + 1;
            if (zArr[i38]) {
                i15 = i39 + 2;
                list = list3;
            } else {
                list = list3;
                i15 = i47;
                i47 = -1;
            }
            if (bVarArr3[i38].length != 0) {
                i16 = i15 + 1;
                bVarArr = bVarArr4;
                i17 = i15;
            } else {
                bVarArr = bVarArr4;
                i16 = i15;
                i17 = -1;
            }
            m(aVar, bVarArr);
            c1VarArr[i39] = new a7.c1(l13, bVarArr);
            y0 y0Var2 = pk.c1.f100372b;
            cVarArr[i39] = new c(aVar5.f102595b, 0, iArr6, i39, i47, i17, -1, v2.f100502e);
            int i48 = -1;
            if (i47 != -1) {
                String C2 = a.a.C(l13, ":emsg");
                a7.q qVar6 = new a7.q();
                qVar6.f1168a = C2;
                qVar6.f1181n = o0.r("application/x-emsg");
                c1VarArr[i47] = new a7.c1(C2, new androidx.media3.common.b(qVar6));
                cVarArr[i47] = c.b(iArr6, i39);
                i48 = -1;
            }
            if (i17 != i48) {
                String C3 = a.a.C(l13, ":cc");
                cVarArr[i17] = c.a(iArr6, i39, pk.c1.s(bVarArr3[i38]));
                m(aVar, bVarArr3[i38]);
                c1VarArr[i17] = new a7.c1(C3, bVarArr3[i38]);
            }
            i38++;
            size2 = i43;
            i39 = i16;
            qVar3 = qVar2;
            iArr = iArr7;
            list3 = list;
        }
        int i49 = 0;
        while (i49 < list2.size()) {
            q7.g gVar2 = (q7.g) list2.get(i49);
            a7.q qVar7 = new a7.q();
            qVar7.f1168a = gVar2.a();
            qVar7.f1181n = o0.r("application/x-emsg");
            c1VarArr[i39] = new a7.c1(gVar2.a() + ":" + i49, new androidx.media3.common.b(qVar7));
            cVarArr[i39] = c.c(i49);
            i49++;
            i39++;
        }
        Pair create = Pair.create(new m1(c1VarArr), cVarArr);
        this.f98952k = (m1) create.first;
        this.f98953l = (c[]) create.second;
    }

    public static boolean b(q7.a aVar, q7.a aVar2) {
        if (aVar.f102595b != aVar2.f102595b) {
            return false;
        }
        List list = aVar.f102596c;
        if (!list.isEmpty()) {
            List list2 = aVar2.f102596c;
            if (!list2.isEmpty()) {
                androidx.media3.common.b bVar = ((q7.m) list.get(0)).f102657a;
                androidx.media3.common.b bVar2 = ((q7.m) list2.get(0)).f102657a;
                return Objects.equals(bVar.f18754d, bVar2.f18754d) && bVar.f18756f == bVar2.f18756f;
            }
        }
        return true;
    }

    public static q7.f d(String str, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            q7.f fVar = (q7.f) list.get(i13);
            if (str.equals(fVar.f102632a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void m(a aVar, androidx.media3.common.b[] bVarArr) {
        for (int i13 = 0; i13 < bVarArr.length; i13++) {
            androidx.media3.common.b bVar = bVarArr[i13];
            o5.a aVar2 = (o5.a) ((m) aVar).f99008c;
            if (aVar2.f92884a && ((l9.j) aVar2.f92886c).r(bVar)) {
                a7.q a13 = bVar.a();
                a13.f1181n = o0.r("application/x-media3-cues");
                a13.f1167J = ((l9.j) aVar2.f92886c).h(bVar);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(bVar.f18765o);
                String str = bVar.f18761k;
                sb3.append(str != null ? " ".concat(str) : "");
                a13.f1177j = sb3.toString();
                a13.f1186s = Long.MAX_VALUE;
                bVar = a13.a();
            }
            bVarArr[i13] = bVar;
        }
    }

    public static androidx.media3.common.b[] o(q7.f fVar, Pattern pattern, androidx.media3.common.b bVar) {
        String str = fVar.f102633b;
        if (str == null) {
            return new androidx.media3.common.b[]{bVar};
        }
        int i13 = n0.f53866a;
        String[] split = str.split(";", -1);
        androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[split.length];
        for (int i14 = 0; i14 < split.length; i14++) {
            Matcher matcher = pattern.matcher(split[i14]);
            if (!matcher.matches()) {
                return new androidx.media3.common.b[]{bVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            a7.q a13 = bVar.a();
            a13.f1168a = bVar.f18751a + ":" + parseInt;
            a13.I = parseInt;
            a13.f1171d = matcher.group(2);
            bVarArr[i14] = new androidx.media3.common.b(a13);
        }
        return bVarArr;
    }

    @Override // g8.d1
    public final long a() {
        return this.f98963v.a();
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        for (h8.l lVar : this.f98961t) {
            if (lVar.f68037a == 2) {
                return lVar.f68041e.c(j13, x1Var);
            }
        }
        return j13;
    }

    @Override // g8.c0
    public final long f(long j13) {
        for (h8.l lVar : this.f98961t) {
            lVar.E(j13);
        }
        for (r rVar : this.f98962u) {
            int a13 = n0.a(rVar.f99038c, j13, true);
            rVar.f99042g = a13;
            rVar.f99043h = (rVar.f99039d && a13 == rVar.f99038c.length) ? j13 : -9223372036854775807L;
        }
        return j13;
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f98963v.g();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f98960s = b0Var;
        b0Var.e(this);
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        this.f98960s.i(this);
    }

    public final int j(int[] iArr, int i13) {
        int i14 = iArr[i13];
        if (i14 == -1) {
            return -1;
        }
        c[] cVarArr = this.f98953l;
        int i15 = cVarArr[i14].f98938e;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            if (i17 == i15 && cVarArr[i17].f98936c == 0) {
                return i16;
            }
        }
        return -1;
    }

    @Override // g8.c0
    public final long k() {
        h8.l[] lVarArr = this.f98961t;
        int length = lVarArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            h8.l lVar = lVarArr[i13];
            lVar.getClass();
            try {
                if (lVar.f68060x) {
                    return this.A;
                }
            } finally {
                lVar.f68060x = false;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    @Override // g8.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(k8.t[] r40, boolean[] r41, g8.b1[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.d.l(k8.t[], boolean[], g8.b1[], boolean[], long):long");
    }

    @Override // g8.c0
    public final void n() {
        this.f98950i.b();
    }

    public final void p(q7.c cVar, int i13) {
        this.f98964w = cVar;
        this.f98965x = i13;
        u uVar = this.f98955n;
        uVar.f99058h = false;
        uVar.f99056f = cVar;
        Iterator it = uVar.f99055e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < uVar.f99056f.f102611h) {
                it.remove();
            }
        }
        h8.l[] lVarArr = this.f98961t;
        if (lVarArr != null) {
            for (h8.l lVar : lVarArr) {
                q qVar = (q) ((b) lVar.f68041e);
                o[] oVarArr = qVar.f99029l;
                try {
                    qVar.f99031n = cVar;
                    qVar.f99032o = i13;
                    long d2 = cVar.d(i13);
                    ArrayList j13 = qVar.j();
                    for (int i14 = 0; i14 < oVarArr.length; i14++) {
                        oVarArr[i14] = oVarArr[i14].a(d2, (q7.m) j13.get(qVar.f99030m.f(i14)));
                    }
                } catch (BehindLiveWindowException e13) {
                    qVar.f99033p = e13;
                }
            }
            this.f98960s.i(this);
        }
        this.f98966y = cVar.b(i13).f102642d;
        for (r rVar : this.f98962u) {
            Iterator it2 = this.f98966y.iterator();
            while (true) {
                if (it2.hasNext()) {
                    q7.g gVar = (q7.g) it2.next();
                    if (gVar.a().equals(rVar.f99040e.a())) {
                        rVar.a(gVar, cVar.f102607d && i13 == cVar.f102616m.size() - 1);
                    }
                }
            }
        }
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        return this.f98963v.q(y0Var);
    }

    @Override // g8.c0
    public final m1 r() {
        return this.f98952k;
    }

    @Override // g8.d1
    public final long t() {
        return this.f98963v.t();
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        for (h8.l lVar : this.f98961t) {
            lVar.u(j13, z13);
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
        for (h8.l lVar : this.f98961t) {
            if (!lVar.f68045i.d()) {
                long d2 = this.f98964w.d(this.f98965x);
                bf.b.t(!lVar.f68045i.d());
                if (!lVar.A() && d2 != -9223372036854775807L && !lVar.f68047k.isEmpty()) {
                    h8.a y13 = lVar.y();
                    long j14 = y13.f67999l;
                    if (j14 == -9223372036854775807L) {
                        j14 = y13.f68030h;
                    }
                    if (j14 > d2) {
                        a1 a1Var = lVar.f68049m;
                        long p13 = a1Var.p();
                        if (p13 > d2) {
                            a1Var.k(d2);
                            for (a1 a1Var2 : lVar.f68050n) {
                                a1Var2.k(d2);
                            }
                            lVar.f68043g.i(lVar.f68037a, d2, p13);
                        }
                    }
                }
            }
        }
        this.f98963v.v(j13);
    }
}
