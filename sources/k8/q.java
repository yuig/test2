package k8;

import a7.c1;
import a7.g1;
import android.content.Context;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import d7.n0;
import g8.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.ConcurrentHashMap;
import m7.u1;
import m7.v1;
import pk.g0;
import pk.t2;
import pk.v2;
import v.j2;

/* loaded from: classes.dex */
public final class q extends w implements u1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t2 f78564j;

    /* renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f78565k;

    /* renamed from: c, reason: collision with root package name */
    public final Object f78566c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f78567d;

    /* renamed from: e, reason: collision with root package name */
    public final s f78568e;

    /* renamed from: f, reason: collision with root package name */
    public j f78569f;

    /* renamed from: g, reason: collision with root package name */
    public m7.c f78570g;

    /* renamed from: h, reason: collision with root package name */
    public a7.f f78571h;

    /* renamed from: i, reason: collision with root package name */
    public String f78572i;

    static {
        Comparator tVar = new i2.t(6);
        f78564j = tVar instanceof t2 ? (t2) tVar : new g0(tVar);
        f78565k = new ConcurrentHashMap();
    }

    public q(Context context) {
        bk.f fVar = new bk.f();
        j jVar = j.X;
        this.f78572i = null;
        this.f78566c = new Object();
        this.f78567d = context != null ? context.getApplicationContext() : null;
        this.f78568e = fVar;
        if (jVar instanceof j) {
            this.f78569f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.b(jVar);
            this.f78569f = new j(iVar);
        }
        this.f78571h = a7.f.f987g;
        if (this.f78569f.Q && context == null) {
            d7.u.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int j(int i13, int i14) {
        if (i13 == 0 || i13 != i14) {
            return Integer.bitCount(i13 & i14);
        }
        return Integer.MAX_VALUE;
    }

    public static int k(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    public static boolean l(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    public static void m(m1 m1Var, j jVar, HashMap hashMap) {
        for (int i13 = 0; i13 < m1Var.f64348a; i13++) {
        }
    }

    public static int n(androidx.media3.common.b bVar, String str, boolean z13) {
        if (!TextUtils.isEmpty(str) && str.equals(bVar.f18754d)) {
            return 4;
        }
        String s13 = s(str);
        String s14 = s(bVar.f18754d);
        if (s14 == null || s13 == null) {
            return (z13 && s14 == null) ? 1 : 0;
        }
        if (s14.startsWith(s13) || s13.startsWith(s14)) {
            return 3;
        }
        int i13 = n0.f53866a;
        return s14.split("-", 2)[0].equals(s13.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean p(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static void q(v vVar, int[][][] iArr, v1[] v1VarArr, t[] tVarArr) {
        boolean z13;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < vVar.f78576a; i15++) {
            int i16 = vVar.f78577b[i15];
            t tVar = tVarArr[i15];
            if ((i16 == 1 || i16 == 2) && tVar != null) {
                int[][] iArr2 = iArr[i15];
                int b13 = vVar.f78578c[i15].b(tVar.m());
                int i17 = 0;
                while (true) {
                    if (i17 < tVar.length()) {
                        if ((iArr2[b13][tVar.f(i17)] & 32) != 32) {
                            break;
                        } else {
                            i17++;
                        }
                    } else if (i16 == 1) {
                        if (i14 != -1) {
                            z13 = false;
                            break;
                        }
                        i14 = i15;
                    } else {
                        if (i13 != -1) {
                            z13 = false;
                            break;
                        }
                        i13 = i15;
                    }
                }
            }
        }
        z13 = true;
        if (z13 && ((i14 == -1 || i13 == -1) ? false : true)) {
            v1 v1Var = new v1(0, true);
            v1VarArr[i14] = v1Var;
            v1VarArr[i13] = v1Var;
        }
    }

    public static String s(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static String t(String str) {
        try {
            String substring = str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
            if (substring.isEmpty()) {
                return null;
            }
            return substring;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Pair u(v vVar, int[][][] iArr, j jVar) {
        jVar.f1047u.getClass();
        return v(4, vVar, iArr, new a8.v(jVar, 2), new j2(7));
    }

    public static Pair v(int i13, v vVar, int[][][] iArr, n nVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z13;
        v vVar2 = vVar;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (i14 < vVar2.f78576a) {
            if (i13 == vVar2.f78577b[i14]) {
                m1 m1Var = vVar2.f78578c[i14];
                for (int i15 = 0; i15 < m1Var.f64348a; i15++) {
                    c1 a13 = m1Var.a(i15);
                    v2 e13 = nVar.e(i14, a13, iArr[i14][i15]);
                    int i16 = a13.f964a;
                    boolean[] zArr = new boolean[i16];
                    for (int i17 = 0; i17 < i16; i17++) {
                        o oVar = (o) e13.get(i17);
                        int a14 = oVar.a();
                        if (!zArr[i17] && a14 != 0) {
                            if (a14 == 1) {
                                randomAccess = pk.c1.v(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                for (int i18 = i17 + 1; i18 < i16; i18++) {
                                    o oVar2 = (o) e13.get(i18);
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        z13 = true;
                                        zArr[i18] = true;
                                    } else {
                                        z13 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i14++;
            vVar2 = vVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((o) list.get(i19)).f78544c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.f78543b, iArr2), Integer.valueOf(oVar3.f78542a));
    }

    @Override // k8.y
    public final u1 b() {
        return this;
    }

    @Override // k8.y
    public final boolean d() {
        return true;
    }

    @Override // k8.y
    public final void f() {
        m7.c cVar;
        Spatializer spatializer;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        if (n0.f53866a >= 32 && (cVar = this.f78570g) != null && (spatializer = (Spatializer) cVar.f86116c) != null && (spatializer$OnSpatializerStateChangedListener = (Spatializer$OnSpatializerStateChangedListener) cVar.f86118e) != null && ((Handler) cVar.f86117d) != null) {
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) cVar.f86117d).removeCallbacksAndMessages(null);
        }
        super.f();
    }

    @Override // k8.y
    public final void h(a7.f fVar) {
        if (this.f78571h.equals(fVar)) {
            return;
        }
        this.f78571h = fVar;
        r();
    }

    @Override // k8.y
    public final void i(g1 g1Var) {
        if (g1Var instanceof j) {
            w((j) g1Var);
        }
        i iVar = new i(a());
        iVar.b(g1Var);
        w(new j(iVar));
    }

    @Override // k8.y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final j a() {
        j jVar;
        synchronized (this.f78566c) {
            jVar = this.f78569f;
        }
        return jVar;
    }

    public final void r() {
        boolean z13;
        m7.c cVar;
        synchronized (this.f78566c) {
            try {
                z13 = this.f78569f.Q && n0.f53866a >= 32 && (cVar = this.f78570g) != null && cVar.f86115b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z13) {
            c();
        }
    }

    public final void w(j jVar) {
        boolean z13;
        jVar.getClass();
        synchronized (this.f78566c) {
            z13 = !this.f78569f.equals(jVar);
            this.f78569f = jVar;
        }
        if (z13) {
            if (jVar.Q && this.f78567d == null) {
                d7.u.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            c();
        }
    }
}
