package f4;

import bk.f;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f61038a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f61039b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f61040c;

    /* renamed from: d, reason: collision with root package name */
    public int f61041d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61042e;

    /* renamed from: f, reason: collision with root package name */
    public int f61043f;

    /* renamed from: g, reason: collision with root package name */
    public int f61044g;

    public b(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f61042e = i13;
        this.f61039b = new HashMap(0, 0.75f);
        this.f61040c = new LinkedHashSet();
    }

    public final Object a(Object obj) {
        synchronized (this.f61038a) {
            Object obj2 = this.f61039b.get(obj);
            if (obj2 == null) {
                this.f61044g++;
                return null;
            }
            this.f61040c.remove(obj);
            this.f61040c.add(obj);
            this.f61043f++;
            return obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto Lc0
            if (r7 == 0) goto Lc0
            bk.f r1 = r5.f61038a
            monitor-enter(r1)
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + 1
            r5.f61041d = r2     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r2 = r5.f61039b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r7 = r2.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            if (r7 == 0) goto L24
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + (-1)
            r5.f61041d = r2     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r6 = move-exception
            goto Lbe
        L24:
            java.util.LinkedHashSet r2 = r5.f61040c     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.contains(r6)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L31
            java.util.LinkedHashSet r2 = r5.f61040c     // Catch: java.lang.Throwable -> L21
            r2.remove(r6)     // Catch: java.lang.Throwable -> L21
        L31:
            java.util.LinkedHashSet r2 = r5.f61040c     // Catch: java.lang.Throwable -> L21
            r2.add(r6)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            int r6 = r5.f61042e
        L39:
            bk.f r1 = r5.f61038a
            monitor-enter(r1)
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L51
            if (r2 < 0) goto Lb4
            java.util.HashMap r2 = r5.f61039b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L53
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto Lb4
            goto L53
        L51:
            r6 = move-exception
            goto Lbc
        L53:
            java.util.HashMap r2 = r5.f61039b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            java.util.LinkedHashSet r3 = r5.f61040c     // Catch: java.lang.Throwable -> L51
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 != r3) goto Lb4
            int r2 = r5.d()     // Catch: java.lang.Throwable -> L51
            if (r2 <= r6) goto La3
            java.util.HashMap r2 = r5.f61039b     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto La3
            java.util.LinkedHashSet r2 = r5.f61040c     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = kotlin.collections.CollectionsKt.R(r2)     // Catch: java.lang.Throwable -> L51
            java.util.HashMap r3 = r5.f61039b     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L9b
            java.util.HashMap r4 = r5.f61039b     // Catch: java.lang.Throwable -> L51
            java.util.Map r4 = dl2.b.u(r4)     // Catch: java.lang.Throwable -> L51
            r4.remove(r2)     // Catch: java.lang.Throwable -> L51
            java.util.LinkedHashSet r4 = r5.f61040c     // Catch: java.lang.Throwable -> L51
            java.util.Collection r4 = dl2.b.s(r4)     // Catch: java.lang.Throwable -> L51
            r4.remove(r2)     // Catch: java.lang.Throwable -> L51
            int r4 = r5.d()     // Catch: java.lang.Throwable -> L51
            kotlin.jvm.internal.Intrinsics.f(r2)     // Catch: java.lang.Throwable -> L51
            int r4 = r4 + (-1)
            r5.f61041d = r4     // Catch: java.lang.Throwable -> L51
            goto La5
        L9b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = "inconsistent state"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L51
            throw r6     // Catch: java.lang.Throwable -> L51
        La3:
            r2 = r0
            r3 = r2
        La5:
            kotlin.Unit r4 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)
            if (r2 != 0) goto Lad
            if (r3 != 0) goto Lad
            return r7
        Lad:
            kotlin.jvm.internal.Intrinsics.f(r2)
            kotlin.jvm.internal.Intrinsics.f(r3)
            goto L39
        Lb4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = "map/keySet size inconsistency"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L51
            throw r6     // Catch: java.lang.Throwable -> L51
        Lbc:
            monitor-exit(r1)
            throw r6
        Lbe:
            monitor-exit(r1)
            throw r6
        Lc0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.b.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object c(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f61038a) {
            try {
                remove = this.f61039b.remove(obj);
                this.f61040c.remove(obj);
                if (remove != null) {
                    this.f61041d = d() - 1;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return remove;
    }

    public final int d() {
        int i13;
        synchronized (this.f61038a) {
            i13 = this.f61041d;
        }
        return i13;
    }

    public final String toString() {
        String str;
        synchronized (this.f61038a) {
            try {
                int i13 = this.f61043f;
                int i14 = this.f61044g + i13;
                str = "LruCache[maxSize=" + this.f61042e + ",hits=" + this.f61043f + ",misses=" + this.f61044g + ",hitRate=" + (i14 != 0 ? (i13 * 100) / i14 : 0) + "%]";
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }
}
