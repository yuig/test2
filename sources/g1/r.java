package g1;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f63305a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.b f63306b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.f f63307c;

    /* renamed from: d, reason: collision with root package name */
    public int f63308d;

    /* renamed from: e, reason: collision with root package name */
    public int f63309e;

    /* renamed from: f, reason: collision with root package name */
    public int f63310f;

    public r(int i13) {
        this.f63305a = i13;
        if (i13 <= 0) {
            kh2.n.h0("maxSize <= 0");
            throw null;
        }
        this.f63306b = new h1.b();
        this.f63307c = new bk.f();
    }

    public static void e(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public void b(boolean z13, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object h10;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f63307c) {
            h1.b bVar = this.f63306b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = ((LinkedHashMap) bVar.f66449b).get(key);
            if (obj != null) {
                this.f63309e++;
                return obj;
            }
            this.f63310f++;
            Object a13 = a(key);
            if (a13 == null) {
                return null;
            }
            synchronized (this.f63307c) {
                try {
                    h10 = this.f63306b.h(key, a13);
                    if (h10 != null) {
                        this.f63306b.h(key, h10);
                    } else {
                        int i13 = this.f63308d;
                        e(key, a13);
                        this.f63308d = i13 + 1;
                        Unit unit = Unit.f80348a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (h10 != null) {
                b(false, key, a13, h10);
                return h10;
            }
            f(this.f63305a);
            return a13;
        }
    }

    public final Object d(Object key, Object value) {
        Object h10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f63307c) {
            try {
                int i13 = this.f63308d;
                e(key, value);
                this.f63308d = i13 + 1;
                h10 = this.f63306b.h(key, value);
                if (h10 != null) {
                    int i14 = this.f63308d;
                    e(key, h10);
                    this.f63308d = i14 - 1;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (h10 != null) {
            b(false, key, h10, value);
        }
        f(this.f63305a);
        return h10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0014, B:13:0x0020, B:15:0x0024, B:17:0x0031, B:19:0x0043, B:32:0x0060, B:33:0x006c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r6) {
        /*
            r5 = this;
        L0:
            bk.f r0 = r5.f63307c
            monitor-enter(r0)
            int r1 = r5.f63308d     // Catch: java.lang.Throwable -> L19
            r2 = 1
            if (r1 < 0) goto L1d
            h1.b r1 = r5.f63306b     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.f66449b     // Catch: java.lang.Throwable -> L19
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            int r1 = r5.f63308d     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1d
            goto L1b
        L19:
            r6 = move-exception
            goto L6d
        L1b:
            r1 = r2
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L60
            int r1 = r5.f63308d     // Catch: java.lang.Throwable -> L19
            if (r1 <= r6) goto L5e
            h1.b r1 = r5.f63306b     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.f66449b     // Catch: java.lang.Throwable -> L19
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L31
            goto L5e
        L31:
            h1.b r1 = r5.f63306b     // Catch: java.lang.Throwable -> L19
            java.util.Set r1 = r1.d()     // Catch: java.lang.Throwable -> L19
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = kotlin.collections.CollectionsKt.T(r1)     // Catch: java.lang.Throwable -> L19
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L43
            monitor-exit(r0)
            return
        L43:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L19
            h1.b r4 = r5.f63306b     // Catch: java.lang.Throwable -> L19
            r4.j(r3)     // Catch: java.lang.Throwable -> L19
            int r4 = r5.f63308d     // Catch: java.lang.Throwable -> L19
            e(r3, r1)     // Catch: java.lang.Throwable -> L19
            int r4 = r4 - r2
            r5.f63308d = r4     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            r0 = 0
            r5.b(r2, r3, r1, r0)
            goto L0
        L5e:
            monitor-exit(r0)
            return
        L60:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.String r1 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L19
            throw r1     // Catch: java.lang.Throwable -> L19
        L6d:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.r.f(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f63307c) {
            try {
                int i13 = this.f63309e;
                int i14 = this.f63310f + i13;
                str = "LruCache[maxSize=" + this.f63305a + ",hits=" + this.f63309e + ",misses=" + this.f63310f + ",hitRate=" + (i14 != 0 ? (i13 * 100) / i14 : 0) + "%]";
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }
}
