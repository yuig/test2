package s7;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import d7.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kh2.a1;
import n7.q0;

/* loaded from: classes3.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List f111264a;

    /* renamed from: b, reason: collision with root package name */
    public final v f111265b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.app.d f111266c;

    /* renamed from: d, reason: collision with root package name */
    public final e f111267d;

    /* renamed from: e, reason: collision with root package name */
    public final int f111268e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f111269f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f111270g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f111271h;

    /* renamed from: i, reason: collision with root package name */
    public final d7.j f111272i;

    /* renamed from: j, reason: collision with root package name */
    public final a10.e f111273j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f111274k;

    /* renamed from: l, reason: collision with root package name */
    public final z f111275l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f111276m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f111277n;

    /* renamed from: o, reason: collision with root package name */
    public final c f111278o;

    /* renamed from: p, reason: collision with root package name */
    public int f111279p;

    /* renamed from: q, reason: collision with root package name */
    public int f111280q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f111281r;

    /* renamed from: s, reason: collision with root package name */
    public a f111282s;

    /* renamed from: t, reason: collision with root package name */
    public k7.a f111283t;

    /* renamed from: u, reason: collision with root package name */
    public DrmSession$DrmSessionException f111284u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f111285v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f111286w;

    /* renamed from: x, reason: collision with root package name */
    public t f111287x;

    /* renamed from: y, reason: collision with root package name */
    public u f111288y;

    public d(UUID uuid, v vVar, androidx.appcompat.app.d dVar, e eVar, List list, int i13, boolean z13, boolean z14, byte[] bArr, HashMap hashMap, z zVar, Looper looper, a10.e eVar2, q0 q0Var) {
        if (i13 == 1 || i13 == 3) {
            bArr.getClass();
        }
        this.f111276m = uuid;
        this.f111266c = dVar;
        this.f111267d = eVar;
        this.f111265b = vVar;
        this.f111268e = i13;
        this.f111269f = z13;
        this.f111270g = z14;
        if (bArr != null) {
            this.f111286w = bArr;
            this.f111264a = null;
        } else {
            list.getClass();
            this.f111264a = Collections.unmodifiableList(list);
        }
        this.f111271h = hashMap;
        this.f111275l = zVar;
        this.f111272i = new d7.j();
        this.f111273j = eVar2;
        this.f111274k = q0Var;
        this.f111279p = 2;
        this.f111277n = looper;
        this.f111278o = new c(this, looper);
    }

    @Override // s7.j
    public final DrmSession$DrmSessionException a() {
        p();
        if (this.f111279p == 1) {
            return this.f111284u;
        }
        return null;
    }

    @Override // s7.j
    public final UUID b() {
        p();
        return this.f111276m;
    }

    @Override // s7.j
    public final void c(m mVar) {
        p();
        int i13 = this.f111280q;
        if (i13 <= 0) {
            d7.u.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i14 = i13 - 1;
        this.f111280q = i14;
        if (i14 == 0) {
            this.f111279p = 0;
            c cVar = this.f111278o;
            int i15 = n0.f53866a;
            cVar.removeCallbacksAndMessages(null);
            a aVar = this.f111282s;
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.f111257a = true;
            }
            this.f111282s = null;
            this.f111281r.quit();
            this.f111281r = null;
            this.f111283t = null;
            this.f111284u = null;
            this.f111287x = null;
            this.f111288y = null;
            byte[] bArr = this.f111285v;
            if (bArr != null) {
                this.f111265b.j(bArr);
                this.f111285v = null;
            }
        }
        if (mVar != null) {
            d7.j jVar = this.f111272i;
            synchronized (jVar.f53830a) {
                try {
                    Integer num = (Integer) jVar.f53831b.get(mVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(jVar.f53833d);
                        arrayList.remove(mVar);
                        jVar.f53833d = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            jVar.f53831b.remove(mVar);
                            HashSet hashSet = new HashSet(jVar.f53832c);
                            hashSet.remove(mVar);
                            jVar.f53832c = Collections.unmodifiableSet(hashSet);
                        } else {
                            jVar.f53831b.put(mVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.f111272i.b(mVar) == 0) {
                mVar.f();
            }
        }
        e eVar = this.f111267d;
        int i16 = this.f111280q;
        h hVar = eVar.f111289a;
        if (i16 == 1 && hVar.f111309p > 0 && hVar.f111305l != -9223372036854775807L) {
            hVar.f111308o.add(this);
            Handler handler = hVar.f111314u;
            handler.getClass();
            handler.postAtTime(new u0.n(this, 17), this, SystemClock.uptimeMillis() + hVar.f111305l);
        } else if (i16 == 0) {
            hVar.f111306m.remove(this);
            if (hVar.f111311r == this) {
                hVar.f111311r = null;
            }
            if (hVar.f111312s == this) {
                hVar.f111312s = null;
            }
            androidx.appcompat.app.d dVar = hVar.f111302i;
            ((Set) dVar.f15966b).remove(this);
            if (((d) dVar.f15967c) == this) {
                dVar.f15967c = null;
                if (!((Set) dVar.f15966b).isEmpty()) {
                    d dVar2 = (d) ((Set) dVar.f15966b).iterator().next();
                    dVar.f15967c = dVar2;
                    u c13 = dVar2.f111265b.c();
                    dVar2.f111288y = c13;
                    a aVar2 = dVar2.f111282s;
                    int i17 = n0.f53866a;
                    c13.getClass();
                    aVar2.getClass();
                    aVar2.obtainMessage(1, new b(g8.v.f64440d.getAndIncrement(), true, SystemClock.elapsedRealtime(), c13)).sendToTarget();
                }
            }
            if (hVar.f111305l != -9223372036854775807L) {
                Handler handler2 = hVar.f111314u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                hVar.f111308o.remove(this);
            }
        }
        hVar.l();
    }

    @Override // s7.j
    public final boolean d() {
        p();
        return this.f111269f;
    }

    @Override // s7.j
    public final k7.a e() {
        p();
        return this.f111283t;
    }

    @Override // s7.j
    public final void f(m mVar) {
        p();
        if (this.f111280q < 0) {
            d7.u.c("DefaultDrmSession", "Session reference count less than zero: " + this.f111280q);
            this.f111280q = 0;
        }
        if (mVar != null) {
            d7.j jVar = this.f111272i;
            synchronized (jVar.f53830a) {
                try {
                    ArrayList arrayList = new ArrayList(jVar.f53833d);
                    arrayList.add(mVar);
                    jVar.f53833d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) jVar.f53831b.get(mVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(jVar.f53832c);
                        hashSet.add(mVar);
                        jVar.f53832c = Collections.unmodifiableSet(hashSet);
                    }
                    jVar.f53831b.put(mVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i13 = this.f111280q + 1;
        this.f111280q = i13;
        if (i13 == 1) {
            bf.b.t(this.f111279p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f111281r = handlerThread;
            handlerThread.start();
            this.f111282s = new a(this, this.f111281r.getLooper());
            if (l()) {
                h(true);
            }
        } else if (mVar != null && i() && this.f111272i.b(mVar) == 1) {
            mVar.d(this.f111279p);
        }
        h hVar = this.f111267d.f111289a;
        if (hVar.f111305l != -9223372036854775807L) {
            hVar.f111308o.remove(this);
            Handler handler = hVar.f111314u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // s7.j
    public final boolean g(String str) {
        p();
        byte[] bArr = this.f111285v;
        bf.b.w(bArr);
        return this.f111265b.n(str, bArr);
    }

    @Override // s7.j
    public final int getState() {
        p();
        return this.f111279p;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:62|63|64|(6:66|67|68|69|(1:71)|73)|76|67|68|69|(0)|73) */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089 A[Catch: NumberFormatException -> 0x008d, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x008d, blocks: (B:69:0x0081, B:71:0x0089), top: B:68:0x0081 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.d.h(boolean):void");
    }

    public final boolean i() {
        int i13 = this.f111279p;
        return i13 == 3 || i13 == 4;
    }

    public final void j(int i13, Throwable th3) {
        int i14;
        Set set;
        if (th3 instanceof MediaDrm.MediaDrmStateException) {
            i14 = n0.z(n0.A(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo()));
        } else {
            if (n0.f53866a < 23 || !(th3 instanceof MediaDrmResetException)) {
                if (!(th3 instanceof NotProvisionedException) && !a1.g0(th3)) {
                    if (th3 instanceof DeniedByServerException) {
                        i14 = 6007;
                    } else if (th3 instanceof UnsupportedDrmException) {
                        i14 = 6001;
                    } else if (th3 instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i14 = 6003;
                    } else if (th3 instanceof KeysExpiredException) {
                        i14 = 6008;
                    } else if (i13 != 1) {
                        if (i13 == 2) {
                            i14 = 6004;
                        } else if (i13 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i14 = 6002;
            }
            i14 = 6006;
        }
        this.f111284u = new DrmSession$DrmSessionException(i14, th3);
        d7.u.d("DefaultDrmSession", "DRM session error", th3);
        if (th3 instanceof Exception) {
            d7.j jVar = this.f111272i;
            synchronized (jVar.f53830a) {
                set = jVar.f53832c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((m) it.next()).e((Exception) th3);
            }
        } else {
            if (!(th3 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th3);
            }
            if (!a1.h0(th3) && !a1.g0(th3)) {
                throw ((Error) th3);
            }
        }
        if (this.f111279p != 4) {
            this.f111279p = 1;
        }
    }

    public final void k(boolean z13, Throwable th3) {
        if ((th3 instanceof NotProvisionedException) || a1.g0(th3)) {
            this.f111266c.K(this);
        } else {
            j(z13 ? 1 : 2, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r4 = this;
            boolean r0 = r4.i()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            s7.v r0 = r4.f111265b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.d()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f111285v = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            s7.v r2 = r4.f111265b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            n7.q0 r3 = r4.f111274k     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.m(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            s7.v r0 = r4.f111265b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.f111285v     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            k7.a r0 = r0.i(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f111283t = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.f111279p = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            d7.j r2 = r4.f111272i     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f53830a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f53832c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            s7.m r3 = (s7.m) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.d(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.f111285v     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = kh2.a1.g0(r0)
            if (r2 == 0) goto L59
            androidx.appcompat.app.d r0 = r4.f111266c
            r0.K(r4)
            goto L62
        L59:
            r4.j(r1, r0)
            goto L62
        L5d:
            androidx.appcompat.app.d r0 = r4.f111266c
            r0.K(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.d.l():boolean");
    }

    public final void m(byte[] bArr, int i13, boolean z13) {
        try {
            t l13 = this.f111265b.l(bArr, this.f111264a, i13, this.f111271h);
            this.f111287x = l13;
            a aVar = this.f111282s;
            int i14 = n0.f53866a;
            l13.getClass();
            aVar.getClass();
            aVar.obtainMessage(2, new b(g8.v.f64440d.getAndIncrement(), z13, SystemClock.elapsedRealtime(), l13)).sendToTarget();
        } catch (Exception | NoSuchMethodError e13) {
            k(true, e13);
        }
    }

    public final Map n() {
        p();
        byte[] bArr = this.f111285v;
        if (bArr == null) {
            return null;
        }
        return this.f111265b.b(bArr);
    }

    public final boolean o() {
        try {
            this.f111265b.e(this.f111285v, this.f111286w);
            return true;
        } catch (Exception | NoSuchMethodError e13) {
            j(1, e13);
            return false;
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f111277n;
        if (currentThread != looper.getThread()) {
            d7.u.h("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
