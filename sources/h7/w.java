package h7;

import a.cb;
import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import pk.n3;
import pk.o1;

/* loaded from: classes.dex */
public final class w implements a {

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f67935j = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final File f67936a;

    /* renamed from: b, reason: collision with root package name */
    public final f f67937b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.x f67938c;

    /* renamed from: d, reason: collision with root package name */
    public final h f67939d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f67940e;

    /* renamed from: f, reason: collision with root package name */
    public final Random f67941f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67942g;

    /* renamed from: h, reason: collision with root package name */
    public long f67943h;

    /* renamed from: i, reason: collision with root package name */
    public Cache$CacheException f67944i;

    public w(File file, t tVar, f7.b bVar) {
        boolean add;
        androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x();
        xVar.f16708a = new HashMap();
        xVar.f16709b = new SparseArray();
        xVar.f16710c = new SparseBooleanArray();
        xVar.f16711d = new SparseBooleanArray();
        o oVar = new o(bVar);
        p pVar = new p(new File(file, "cached_content_index.exi"));
        xVar.f16712e = oVar;
        xVar.f16713f = pVar;
        h hVar = new h(bVar);
        synchronized (w.class) {
            add = f67935j.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f67936a = file;
        this.f67937b = tVar;
        this.f67938c = xVar;
        this.f67939d = hVar;
        this.f67940e = new HashMap();
        this.f67941f = new Random();
        this.f67942g = true;
        this.f67943h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new v(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(w wVar) {
        long j13;
        androidx.appcompat.widget.x xVar = wVar.f67938c;
        File file = wVar.f67936a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e13) {
                wVar.f67944i = e13;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            d7.u.c("SimpleCache", str);
            wVar.f67944i = new Cache$CacheException(str);
            return;
        }
        int length = listFiles.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                j13 = -1;
                break;
            }
            File file2 = listFiles[i13];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j13 = m(name);
                    break;
                } catch (NumberFormatException unused) {
                    d7.u.c("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i13++;
        }
        wVar.f67943h = j13;
        if (j13 == -1) {
            try {
                wVar.f67943h = f(file);
            } catch (IOException e14) {
                String str2 = "Failed to create cache UID: " + file;
                d7.u.d("SimpleCache", str2, e14);
                wVar.f67944i = new Cache$CacheException(str2, e14);
                return;
            }
        }
        try {
            xVar.s(wVar.f67943h);
            h hVar = wVar.f67939d;
            if (hVar != null) {
                hVar.b(wVar.f67943h);
                HashMap a13 = hVar.a();
                wVar.l(file, true, listFiles, a13);
                hVar.c(a13.keySet());
            } else {
                wVar.l(file, true, listFiles, null);
            }
            n3 it = o1.r(((HashMap) xVar.f16708a).keySet()).iterator();
            while (it.hasNext()) {
                xVar.t((String) it.next());
            }
            try {
                xVar.E();
            } catch (IOException e15) {
                d7.u.d("SimpleCache", "Storing index file failed", e15);
            }
        } catch (IOException e16) {
            String str3 = "Failed to initialize cache indices: " + file;
            d7.u.d("SimpleCache", str3, e16);
            wVar.f67944i = new Cache$CacheException(str3, e16);
        }
    }

    public static void e(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        d7.u.c("SimpleCache", str);
        throw new Cache$CacheException(str);
    }

    public static long f(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, a.a.C(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long m(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public final void b(x xVar) {
        androidx.appcompat.widget.x xVar2 = this.f67938c;
        String str = xVar.f67892a;
        xVar2.m(str).f67912c.add(xVar);
        ArrayList arrayList = (ArrayList) this.f67940e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t) ((f) arrayList.get(size))).b(this, xVar);
            }
        }
        ((t) this.f67937b).b(this, xVar);
    }

    public final synchronized void c(tb.l lVar, String str) {
        d();
        androidx.appcompat.widget.x xVar = this.f67938c;
        n m13 = xVar.m(str);
        m13.f67914e = m13.f67914e.b(lVar);
        if (!r3.equals(r1)) {
            ((q) xVar.f16712e).f(m13);
        }
        try {
            this.f67938c.E();
        } catch (IOException e13) {
            throw new Cache$CacheException(e13);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.f67944i;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long g(String str, long j13, long j14) {
        long j15;
        long j16 = j14 == -1 ? Long.MAX_VALUE : j13 + j14;
        long j17 = j16 < 0 ? Long.MAX_VALUE : j16;
        long j18 = j13;
        j15 = 0;
        while (j18 < j17) {
            long h10 = h(str, j18, j17 - j18);
            if (h10 > 0) {
                j15 += h10;
            } else {
                h10 = -h10;
            }
            j18 += h10;
        }
        return j15;
    }

    public final synchronized long h(String str, long j13, long j14) {
        n l13;
        if (j14 == -1) {
            j14 = Long.MAX_VALUE;
        }
        l13 = this.f67938c.l(str);
        return l13 != null ? l13.a(j13, j14) : -j14;
    }

    public final synchronized s i(String str) {
        n l13;
        l13 = this.f67938c.l(str);
        return l13 != null ? l13.f67914e : s.f67927c;
    }

    public final synchronized HashSet j() {
        return new HashSet(((HashMap) this.f67938c.f16708a).keySet());
    }

    public final synchronized boolean k(String str, long j13) {
        boolean z13;
        n l13 = this.f67938c.l(str);
        if (l13 != null) {
            z13 = l13.a(0L, j13) >= j13;
        }
        return z13;
    }

    public final void l(File file, boolean z13, File[] fileArr, HashMap hashMap) {
        long j13;
        long j14;
        if (fileArr == null || fileArr.length == 0) {
            if (z13) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z13 && name.indexOf(46) == -1) {
                l(file2, false, file2.listFiles(), hashMap);
            } else if (!z13 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                g gVar = hashMap != null ? (g) hashMap.remove(name) : null;
                if (gVar != null) {
                    j14 = gVar.f67886a;
                    j13 = gVar.f67887b;
                } else {
                    j13 = -9223372036854775807L;
                    j14 = -1;
                }
                x b13 = x.b(file2, j14, j13, this.f67938c);
                if (b13 != null) {
                    b(b13);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void n(j jVar) {
        n l13 = this.f67938c.l(jVar.f67892a);
        l13.getClass();
        long j13 = jVar.f67893b;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = l13.f67913d;
            if (i13 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((m) arrayList.get(i13)).f67908a == j13) {
                arrayList.remove(i13);
                this.f67938c.t(l13.f67911b);
                notifyAll();
            } else {
                i13++;
            }
        }
    }

    public final synchronized void o(String str) {
        TreeSet treeSet;
        synchronized (this) {
            try {
                n l13 = this.f67938c.l(str);
                if (l13 != null && !l13.f67912c.isEmpty()) {
                    treeSet = new TreeSet((Collection) l13.f67912c);
                }
                treeSet = new TreeSet();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            q((j) it.next());
        }
    }

    public final synchronized void p(j jVar) {
        q(jVar);
    }

    public final void q(j jVar) {
        String str = jVar.f67892a;
        androidx.appcompat.widget.x xVar = this.f67938c;
        n l13 = xVar.l(str);
        if (l13 == null || !l13.f67912c.remove(jVar)) {
            return;
        }
        File file = jVar.f67896e;
        if (file != null) {
            file.delete();
        }
        h hVar = this.f67939d;
        if (hVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                hVar.f67890b.getClass();
                try {
                    hVar.f67889a.getWritableDatabase().delete(hVar.f67890b, "name = ?", new String[]{name});
                } catch (SQLException e13) {
                    throw new DatabaseIOException((Throwable) e13);
                }
            } catch (IOException unused) {
                cb.u("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        xVar.t(l13.f67911b);
        ArrayList arrayList = (ArrayList) this.f67940e.get(jVar.f67892a);
        long j13 = jVar.f67894c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                t tVar = (t) ((f) arrayList.get(size));
                tVar.f67930a.remove(jVar);
                tVar.f67931b -= j13;
            }
        }
        t tVar2 = (t) this.f67937b;
        tVar2.f67930a.remove(jVar);
        tVar2.f67931b -= j13;
    }

    public final void r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.f67938c.f16708a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((n) it.next()).f67912c.iterator();
            while (it2.hasNext()) {
                j jVar = (j) it2.next();
                File file = jVar.f67896e;
                file.getClass();
                if (file.length() != jVar.f67894c) {
                    arrayList.add(jVar);
                }
            }
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            q((j) arrayList.get(i13));
        }
    }

    public final synchronized x s(String str, long j13, long j14) {
        x t13;
        d();
        while (true) {
            t13 = t(str, j13, j14);
            if (t13 == null) {
                wait();
            }
        }
        return t13;
    }

    public final synchronized x t(String str, long j13, long j14) {
        x b13;
        x xVar;
        d();
        n l13 = this.f67938c.l(str);
        if (l13 == null) {
            xVar = new x(str, j13, j14, -9223372036854775807L, null);
        } else {
            while (true) {
                b13 = l13.b(j13, j14);
                if (!b13.f67895d) {
                    break;
                }
                File file = b13.f67896e;
                file.getClass();
                if (file.length() == b13.f67894c) {
                    break;
                }
                r();
            }
            xVar = b13;
        }
        if (xVar.f67895d) {
            return u(str, xVar);
        }
        n m13 = this.f67938c.m(str);
        long j15 = xVar.f67894c;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = m13.f67913d;
            if (i13 >= arrayList.size()) {
                arrayList.add(new m(j13, j15));
                return xVar;
            }
            if (((m) arrayList.get(i13)).a(j13, j15)) {
                return null;
            }
            i13++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h7.x u(java.lang.String r18, h7.x r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.f67942g
            if (r2 != 0) goto L9
            return r1
        L9:
            java.io.File r2 = r1.f67896e
            r2.getClass()
            java.lang.String r4 = r2.getName()
            long r5 = r1.f67894c
            long r13 = java.lang.System.currentTimeMillis()
            r16 = 1
            h7.h r3 = r0.f67939d
            if (r3 == 0) goto L2c
            r7 = r13
            r3.d(r4, r5, r7)     // Catch: java.io.IOException -> L23
            goto L2a
        L23:
            java.lang.String r3 = "SimpleCache"
            java.lang.String r4 = "Failed to update index with new touch timestamp."
            d7.u.g(r3, r4)
        L2a:
            r3 = 0
            goto L2e
        L2c:
            r3 = r16
        L2e:
            androidx.appcompat.widget.x r4 = r0.f67938c
            r5 = r18
            h7.n r4 = r4.l(r5)
            r4.getClass()
            java.util.TreeSet r5 = r4.f67912c
            boolean r6 = r5.remove(r1)
            bf.b.t(r6)
            r2.getClass()
            if (r3 == 0) goto L7a
            java.io.File r7 = r2.getParentFile()
            r7.getClass()
            long r9 = r1.f67893b
            int r8 = r4.f67910a
            r11 = r13
            java.io.File r3 = h7.x.c(r7, r8, r9, r11)
            boolean r4 = r2.renameTo(r3)
            if (r4 == 0) goto L5f
            r15 = r3
            goto L7b
        L5f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to rename "
            r4.<init>(r6)
            r4.append(r2)
            java.lang.String r6 = " to "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "CachedContent"
            d7.u.g(r4, r3)
        L7a:
            r15 = r2
        L7b:
            boolean r2 = r1.f67895d
            bf.b.t(r2)
            h7.x r2 = new h7.x
            java.lang.String r8 = r1.f67892a
            long r9 = r1.f67893b
            long r11 = r1.f67894c
            r7 = r2
            r7.<init>(r8, r9, r11, r13, r15)
            r5.add(r2)
            java.util.HashMap r3 = r0.f67940e
            java.lang.String r4 = r1.f67892a
            java.lang.Object r3 = r3.get(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            long r4 = r1.f67894c
            if (r3 == 0) goto Lbd
            int r6 = r3.size()
            int r6 = r6 + (-1)
        La3:
            if (r6 < 0) goto Lbd
            java.lang.Object r7 = r3.get(r6)
            h7.f r7 = (h7.f) r7
            h7.t r7 = (h7.t) r7
            java.util.TreeSet r8 = r7.f67930a
            r8.remove(r1)
            long r8 = r7.f67931b
            long r8 = r8 - r4
            r7.f67931b = r8
            r7.b(r0, r2)
            int r6 = r6 + (-1)
            goto La3
        Lbd:
            h7.f r3 = r0.f67937b
            h7.t r3 = (h7.t) r3
            java.util.TreeSet r6 = r3.f67930a
            r6.remove(r1)
            long r6 = r3.f67931b
            long r6 = r6 - r4
            r3.f67931b = r6
            r3.b(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.w.u(java.lang.String, h7.x):h7.x");
    }
}
