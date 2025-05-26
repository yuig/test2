package s7;

import a7.o0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import d7.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kh2.a1;
import n7.q0;
import pk.c1;
import pk.n3;
import pk.o1;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class h implements q {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f111295b;

    /* renamed from: c, reason: collision with root package name */
    public final t.a f111296c;

    /* renamed from: d, reason: collision with root package name */
    public final z f111297d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f111298e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f111299f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f111300g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f111301h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.appcompat.app.d f111302i;

    /* renamed from: j, reason: collision with root package name */
    public final a10.e f111303j;

    /* renamed from: k, reason: collision with root package name */
    public final e f111304k;

    /* renamed from: l, reason: collision with root package name */
    public final long f111305l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f111306m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f111307n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f111308o;

    /* renamed from: p, reason: collision with root package name */
    public int f111309p;

    /* renamed from: q, reason: collision with root package name */
    public v f111310q;

    /* renamed from: r, reason: collision with root package name */
    public d f111311r;

    /* renamed from: s, reason: collision with root package name */
    public d f111312s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f111313t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f111314u;

    /* renamed from: v, reason: collision with root package name */
    public int f111315v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f111316w;

    /* renamed from: x, reason: collision with root package name */
    public q0 f111317x;

    /* renamed from: y, reason: collision with root package name */
    public volatile f f111318y;

    public h(UUID uuid, t.a aVar, z zVar, HashMap hashMap, boolean z13, int[] iArr, boolean z14, a10.e eVar, long j13) {
        uuid.getClass();
        bf.b.h("Use C.CLEARKEY_UUID instead", !a7.i.f1067b.equals(uuid));
        this.f111295b = uuid;
        this.f111296c = aVar;
        this.f111297d = zVar;
        this.f111298e = hashMap;
        this.f111299f = z13;
        this.f111300g = iArr;
        this.f111301h = z14;
        this.f111303j = eVar;
        this.f111302i = new androidx.appcompat.app.d(this);
        this.f111304k = new e(this, 1);
        this.f111315v = 0;
        this.f111306m = new ArrayList();
        this.f111307n = Collections.newSetFromMap(new IdentityHashMap());
        this.f111308o = Collections.newSetFromMap(new IdentityHashMap());
        this.f111305l = j13;
    }

    public static boolean h(d dVar) {
        dVar.p();
        if (dVar.f111279p != 1) {
            return false;
        }
        DrmSession$DrmSessionException a13 = dVar.a();
        a13.getClass();
        Throwable cause = a13.getCause();
        return (cause instanceof ResourceBusyException) || a1.h0(cause);
    }

    public static ArrayList k(DrmInitData drmInitData, UUID uuid, boolean z13) {
        ArrayList arrayList = new ArrayList(drmInitData.f18737d);
        for (int i13 = 0; i13 < drmInitData.f18737d; i13++) {
            DrmInitData.SchemeData schemeData = drmInitData.f18734a[i13];
            if ((schemeData.d(uuid) || (a7.i.f1068c.equals(uuid) && schemeData.d(a7.i.f1067b))) && (schemeData.f18742e != null || z13)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // s7.q
    public final void a() {
        n(true);
        int i13 = this.f111309p - 1;
        this.f111309p = i13;
        if (i13 != 0) {
            return;
        }
        if (this.f111305l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f111306m);
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((d) arrayList.get(i14)).c(null);
            }
        }
        n3 it = o1.r(this.f111307n).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
        l();
    }

    @Override // s7.q
    public final void b() {
        v rVar;
        n(true);
        int i13 = this.f111309p;
        this.f111309p = i13 + 1;
        if (i13 != 0) {
            return;
        }
        int i14 = 0;
        if (this.f111310q == null) {
            UUID uuid = this.f111295b;
            getClass();
            try {
                try {
                    rVar = new y(uuid);
                } catch (UnsupportedSchemeException e13) {
                    throw new UnsupportedDrmException(e13);
                } catch (Exception e14) {
                    throw new UnsupportedDrmException(e14);
                }
            } catch (UnsupportedDrmException unused) {
                d7.u.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                rVar = new r();
            }
            this.f111310q = rVar;
            rVar.h(new e(this, 0));
            return;
        }
        if (this.f111305l == -9223372036854775807L) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f111306m;
            if (i14 >= arrayList.size()) {
                return;
            }
            ((d) arrayList.get(i14)).f(null);
            i14++;
        }
    }

    @Override // s7.q
    public final j c(m mVar, androidx.media3.common.b bVar) {
        n(false);
        bf.b.t(this.f111309p > 0);
        bf.b.w(this.f111313t);
        return g(this.f111313t, mVar, bVar, true);
    }

    @Override // s7.q
    public final int d(androidx.media3.common.b bVar) {
        n(false);
        v vVar = this.f111310q;
        vVar.getClass();
        int g13 = vVar.g();
        DrmInitData drmInitData = bVar.f18769s;
        if (drmInitData != null) {
            if (this.f111316w != null) {
                return g13;
            }
            UUID uuid = this.f111295b;
            if (k(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.f18737d == 1 && drmInitData.f18734a[0].d(a7.i.f1067b)) {
                    d7.u.g("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.f18736c;
            if (str == null || "cenc".equals(str)) {
                return g13;
            }
            if ("cbcs".equals(str)) {
                if (n0.f53866a >= 25) {
                    return g13;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return g13;
            }
            return 1;
        }
        int j13 = o0.j(bVar.f18765o);
        int i13 = 0;
        while (true) {
            int[] iArr = this.f111300g;
            if (i13 >= iArr.length) {
                return 0;
            }
            if (iArr[i13] == j13) {
                if (i13 != -1) {
                    return g13;
                }
                return 0;
            }
            i13++;
        }
    }

    @Override // s7.q
    public final void e(Looper looper, q0 q0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f111313t;
                if (looper2 == null) {
                    this.f111313t = looper;
                    this.f111314u = new Handler(looper);
                } else {
                    bf.b.t(looper2 == looper);
                    this.f111314u.getClass();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f111317x = q0Var;
    }

    @Override // s7.q
    public final p f(m mVar, androidx.media3.common.b bVar) {
        bf.b.t(this.f111309p > 0);
        bf.b.w(this.f111313t);
        g gVar = new g(this, mVar);
        Handler handler = this.f111314u;
        handler.getClass();
        handler.post(new w2.c(19, gVar, bVar));
        return gVar;
    }

    public final j g(Looper looper, m mVar, androidx.media3.common.b bVar, boolean z13) {
        ArrayList arrayList;
        if (this.f111318y == null) {
            this.f111318y = new f(this, looper);
        }
        DrmInitData drmInitData = bVar.f18769s;
        d dVar = null;
        if (drmInitData == null) {
            int j13 = o0.j(bVar.f18765o);
            v vVar = this.f111310q;
            vVar.getClass();
            if (vVar.g() == 2 && w.f111336c) {
                return null;
            }
            int[] iArr = this.f111300g;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                if (iArr[i13] == j13) {
                    if (i13 == -1 || vVar.g() == 1) {
                        return null;
                    }
                    d dVar2 = this.f111311r;
                    if (dVar2 == null) {
                        y0 y0Var = c1.f100372b;
                        d j14 = j(v2.f100502e, true, null, z13);
                        this.f111306m.add(j14);
                        this.f111311r = j14;
                    } else {
                        dVar2.f(null);
                    }
                    return this.f111311r;
                }
            }
            return null;
        }
        if (this.f111316w == null) {
            arrayList = k(drmInitData, this.f111295b, false);
            if (arrayList.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.f111295b);
                d7.u.d("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (mVar != null) {
                    mVar.e(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new s(new DrmSession$DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
            }
        } else {
            arrayList = null;
        }
        if (this.f111299f) {
            Iterator it = this.f111306m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar3 = (d) it.next();
                if (Objects.equals(dVar3.f111264a, arrayList)) {
                    dVar = dVar3;
                    break;
                }
            }
        } else {
            dVar = this.f111312s;
        }
        if (dVar == null) {
            dVar = j(arrayList, false, mVar, z13);
            if (!this.f111299f) {
                this.f111312s = dVar;
            }
            this.f111306m.add(dVar);
        } else {
            dVar.f(mVar);
        }
        return dVar;
    }

    public final d i(List list, boolean z13, m mVar) {
        this.f111310q.getClass();
        boolean z14 = this.f111301h | z13;
        v vVar = this.f111310q;
        androidx.appcompat.app.d dVar = this.f111302i;
        int i13 = this.f111315v;
        byte[] bArr = this.f111316w;
        Looper looper = this.f111313t;
        looper.getClass();
        q0 q0Var = this.f111317x;
        q0Var.getClass();
        d dVar2 = new d(this.f111295b, vVar, dVar, this.f111304k, list, i13, z14, z13, bArr, this.f111298e, this.f111297d, looper, this.f111303j, q0Var);
        dVar2.f(mVar);
        if (this.f111305l != -9223372036854775807L) {
            dVar2.f(null);
        }
        return dVar2;
    }

    public final d j(List list, boolean z13, m mVar, boolean z14) {
        d i13 = i(list, z13, mVar);
        boolean h10 = h(i13);
        long j13 = this.f111305l;
        Set set = this.f111308o;
        if (h10 && !set.isEmpty()) {
            n3 it = o1.r(set).iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(null);
            }
            i13.c(mVar);
            if (j13 != -9223372036854775807L) {
                i13.c(null);
            }
            i13 = i(list, z13, mVar);
        }
        if (!h(i13) || !z14) {
            return i13;
        }
        Set set2 = this.f111307n;
        if (set2.isEmpty()) {
            return i13;
        }
        n3 it2 = o1.r(set2).iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a();
        }
        if (!set.isEmpty()) {
            n3 it3 = o1.r(set).iterator();
            while (it3.hasNext()) {
                ((j) it3.next()).c(null);
            }
        }
        i13.c(mVar);
        if (j13 != -9223372036854775807L) {
            i13.c(null);
        }
        return i(list, z13, mVar);
    }

    public final void l() {
        if (this.f111310q != null && this.f111309p == 0 && this.f111306m.isEmpty() && this.f111307n.isEmpty()) {
            v vVar = this.f111310q;
            vVar.getClass();
            vVar.a();
            this.f111310q = null;
        }
    }

    public final void m(byte[] bArr) {
        bf.b.t(this.f111306m.isEmpty());
        this.f111315v = 0;
        this.f111316w = bArr;
    }

    public final void n(boolean z13) {
        if (z13 && this.f111313t == null) {
            d7.u.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f111313t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            d7.u.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f111313t.getThread().getName(), new IllegalStateException());
        }
    }
}
