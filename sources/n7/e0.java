package n7;

import a7.a1;
import a7.b1;
import a7.z0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final m7.t f89418h = new m7.t(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f89419i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public i0 f89423d;

    /* renamed from: f, reason: collision with root package name */
    public String f89425f;

    /* renamed from: a, reason: collision with root package name */
    public final a1 f89420a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public final z0 f89421b = new z0();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f89422c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public b1 f89424e = b1.f958a;

    /* renamed from: g, reason: collision with root package name */
    public long f89426g = -1;

    public static long a(e0 e0Var) {
        d0 d0Var = (d0) e0Var.f89422c.get(e0Var.f89425f);
        if (d0Var != null) {
            long j13 = d0Var.f89408c;
            if (j13 != -1) {
                return j13;
            }
        }
        return e0Var.f89426g + 1;
    }

    public final synchronized boolean b(b bVar, String str) {
        d0 d0Var = (d0) this.f89422c.get(str);
        if (d0Var == null) {
            return false;
        }
        d0Var.e(bVar.f89380c, bVar.f89381d);
        return d0Var.c(bVar.f89380c, bVar.f89381d);
    }

    public final void c(d0 d0Var) {
        long j13 = d0Var.f89408c;
        if (j13 != -1) {
            this.f89426g = j13;
        }
        this.f89425f = null;
    }

    public final synchronized void d(b bVar) {
        i0 i0Var;
        try {
            String str = this.f89425f;
            if (str != null) {
                d0 d0Var = (d0) this.f89422c.get(str);
                d0Var.getClass();
                c(d0Var);
            }
            Iterator it = this.f89422c.values().iterator();
            while (it.hasNext()) {
                d0 d0Var2 = (d0) it.next();
                it.remove();
                if (d0Var2.f89410e && (i0Var = this.f89423d) != null) {
                    i0Var.X(bVar, d0Var2.f89406a, false);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final d0 e(int i13, g8.e0 e0Var) {
        g8.e0 e0Var2;
        g8.e0 e0Var3;
        HashMap hashMap = this.f89422c;
        d0 d0Var = null;
        long j13 = Long.MAX_VALUE;
        for (d0 d0Var2 : hashMap.values()) {
            d0Var2.e(i13, e0Var);
            if (d0Var2.c(i13, e0Var)) {
                long j14 = d0Var2.f89408c;
                if (j14 == -1 || j14 < j13) {
                    d0Var = d0Var2;
                    j13 = j14;
                } else if (j14 == j13) {
                    int i14 = d7.n0.f53866a;
                    e0Var2 = d0Var.f89409d;
                    if (e0Var2 != null) {
                        e0Var3 = d0Var2.f89409d;
                        if (e0Var3 != null) {
                            d0Var = d0Var2;
                        }
                    }
                }
            }
        }
        if (d0Var != null) {
            return d0Var;
        }
        String str = (String) f89418h.get();
        d0 d0Var3 = new d0(this, str, i13, e0Var);
        hashMap.put(str, d0Var3);
        return d0Var3;
    }

    public final synchronized String f(b1 b1Var, g8.e0 e0Var) {
        return e(b1Var.h(e0Var.f64233a, this.f89421b).f1253c, e0Var).f89406a;
    }

    public final void g(b bVar) {
        g8.e0 e0Var;
        g8.e0 e0Var2;
        g8.e0 e0Var3;
        boolean q13 = bVar.f89379b.q();
        HashMap hashMap = this.f89422c;
        if (q13) {
            String str = this.f89425f;
            if (str != null) {
                d0 d0Var = (d0) hashMap.get(str);
                d0Var.getClass();
                c(d0Var);
                return;
            }
            return;
        }
        d0 d0Var2 = (d0) hashMap.get(this.f89425f);
        int i13 = bVar.f89380c;
        g8.e0 e0Var4 = bVar.f89381d;
        this.f89425f = e(i13, e0Var4).f89406a;
        h(bVar);
        if (e0Var4 == null || !e0Var4.b()) {
            return;
        }
        long j13 = e0Var4.f64236d;
        if (d0Var2 != null && d0Var2.f89408c == j13) {
            e0Var = d0Var2.f89409d;
            if (e0Var != null) {
                e0Var2 = d0Var2.f89409d;
                if (e0Var2.f64234b == e0Var4.f64234b) {
                    e0Var3 = d0Var2.f89409d;
                    if (e0Var3.f64235c == e0Var4.f64235c) {
                        return;
                    }
                }
            }
        }
        this.f89423d.j(e(i13, new g8.e0(j13, e0Var4.f64233a)).f89406a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:13:0x0028, B:20:0x003a, B:22:0x0046, B:24:0x004c, B:28:0x002f, B:30:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006e, B:37:0x0074, B:39:0x008b, B:40:0x00e6, B:42:0x00ea, B:43:0x00f9, B:45:0x0103, B:47:0x0107), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:13:0x0028, B:20:0x003a, B:22:0x0046, B:24:0x004c, B:28:0x002f, B:30:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006e, B:37:0x0074, B:39:0x008b, B:40:0x00e6, B:42:0x00ea, B:43:0x00f9, B:45:0x0103, B:47:0x0107), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(n7.b r25) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.e0.h(n7.b):void");
    }

    public final synchronized void i(b bVar, int i13) {
        try {
            this.f89423d.getClass();
            boolean z13 = i13 == 0;
            Iterator it = this.f89422c.values().iterator();
            while (it.hasNext()) {
                d0 d0Var = (d0) it.next();
                if (d0Var.d(bVar)) {
                    it.remove();
                    if (d0Var.f89410e) {
                        boolean equals = d0Var.f89406a.equals(this.f89425f);
                        boolean z14 = z13 && equals && d0Var.f89411f;
                        if (equals) {
                            c(d0Var);
                        }
                        this.f89423d.X(bVar, d0Var.f89406a, z14);
                    }
                }
            }
            g(bVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void j(b bVar) {
        try {
            this.f89423d.getClass();
            b1 b1Var = this.f89424e;
            this.f89424e = bVar.f89379b;
            Iterator it = this.f89422c.values().iterator();
            while (it.hasNext()) {
                d0 d0Var = (d0) it.next();
                if (d0Var.f(b1Var, this.f89424e) && !d0Var.d(bVar)) {
                }
                it.remove();
                if (d0Var.f89410e) {
                    if (d0Var.f89406a.equals(this.f89425f)) {
                        c(d0Var);
                    }
                    this.f89423d.X(bVar, d0Var.f89406a, false);
                }
            }
            g(bVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
