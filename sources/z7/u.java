package z7;

import a7.d0;
import a7.i0;
import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import d7.e0;
import d7.n0;
import h7.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import l8.y;

/* loaded from: classes3.dex */
public abstract class u implements l {

    /* renamed from: a, reason: collision with root package name */
    public final g7.i f140978a;

    /* renamed from: b, reason: collision with root package name */
    public final y f140979b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f140980c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.d f140981d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.a f140982e;

    /* renamed from: f, reason: collision with root package name */
    public final c3.e f140983f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f140984g;

    /* renamed from: h, reason: collision with root package name */
    public final long f140985h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f140986i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f140987j;

    public u(i0 i0Var, y yVar, h7.d dVar, Executor executor) {
        i0Var.f1073b.getClass();
        d0 d0Var = i0Var.f1073b;
        this.f140978a = d(d0Var.f969a);
        this.f140979b = yVar;
        this.f140980c = new ArrayList(d0Var.f972d);
        this.f140981d = dVar;
        this.f140984g = executor;
        h7.a aVar = dVar.f67863a;
        aVar.getClass();
        this.f140982e = aVar;
        this.f140983f = h7.i.f67891wo;
        this.f140986i = new ArrayList();
        this.f140985h = n0.X(20000L);
    }

    public static g7.i d(Uri uri) {
        Map emptyMap = Collections.emptyMap();
        bf.b.x(uri, "The uri must be set.");
        return new g7.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
    }

    public static void f(List list, c3.e eVar, long j13) {
        HashMap hashMap;
        int i13;
        s sVar;
        String str;
        HashMap hashMap2 = new HashMap();
        int i14 = 0;
        int i15 = 0;
        while (i14 < list.size()) {
            s sVar2 = (s) list.get(i14);
            String k13 = eVar.k(sVar2.f140972b);
            Integer num = (Integer) hashMap2.get(k13);
            s sVar3 = num == null ? null : (s) list.get(num.intValue());
            if (sVar3 != null) {
                long j14 = sVar3.f140971a;
                if (sVar2.f140971a <= j14 + j13) {
                    g7.i iVar = sVar3.f140972b;
                    Uri uri = iVar.f63786a;
                    g7.i iVar2 = sVar2.f140972b;
                    if (uri.equals(iVar2.f63786a)) {
                        long j15 = iVar.f63792g;
                        if (j15 != -1) {
                            hashMap = hashMap2;
                            i13 = i14;
                            sVar = sVar2;
                            str = k13;
                            if (iVar.f63791f + j15 == iVar2.f63791f && Objects.equals(iVar.f63793h, iVar2.f63793h) && iVar.f63794i == iVar2.f63794i && iVar.f63788c == iVar2.f63788c && iVar.f63790e.equals(iVar2.f63790e)) {
                                long j16 = iVar2.f63792g;
                                g7.i e13 = iVar.e(0L, j16 != -1 ? j15 + j16 : -1L);
                                num.getClass();
                                list.set(num.intValue(), new s(j14, e13));
                                i14 = i13 + 1;
                                hashMap2 = hashMap;
                            }
                            hashMap.put(str, Integer.valueOf(i15));
                            list.set(i15, sVar);
                            i15++;
                            i14 = i13 + 1;
                            hashMap2 = hashMap;
                        }
                    }
                }
            }
            hashMap = hashMap2;
            i13 = i14;
            sVar = sVar2;
            str = k13;
            hashMap.put(str, Integer.valueOf(i15));
            list.set(i15, sVar);
            i15++;
            i14 = i13 + 1;
            hashMap2 = hashMap;
        }
        n0.d0(i15, list.size(), list);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(3:42|114|(1:48)(3:49|50|51))|58|59|60|61|62|64|51) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        r0 = r0.getCause();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
    
        if ((r0 instanceof androidx.media3.common.PriorityTaskManager$PriorityTooLowException) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        r2.addFirst(r5.f140973h);
        g(r4);
        r7.addLast(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        if ((r0 instanceof java.io.IOException) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0131, code lost:
    
        r7 = r25;
     */
    @Override // z7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(z7.k r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.u.a(z7.k):void");
    }

    public final void b(e0 e0Var) {
        synchronized (this.f140986i) {
            try {
                if (this.f140987j) {
                    throw new InterruptedException();
                }
                this.f140986i.add(e0Var);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Object c(e0 e0Var, boolean z13) {
        if (z13) {
            e0Var.run();
            try {
                return e0Var.get();
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i13 = n0.f53866a;
                throw e13;
            }
        }
        while (!this.f140987j) {
            b(e0Var);
            this.f140984g.execute(e0Var);
            try {
                return e0Var.get();
            } catch (ExecutionException e14) {
                Throwable cause2 = e14.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i14 = n0.f53866a;
                    throw e14;
                }
            } finally {
                e0Var.a();
                h(e0Var);
            }
        }
        throw new InterruptedException();
    }

    @Override // z7.l
    public final void cancel() {
        synchronized (this.f140986i) {
            try {
                this.f140987j = true;
                for (int i13 = 0; i13 < this.f140986i.size(); i13++) {
                    ((e0) this.f140986i.get(i13)).cancel(true);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract ArrayList e(h7.e eVar, n nVar, boolean z13);

    public final void g(int i13) {
        synchronized (this.f140986i) {
            this.f140986i.remove(i13);
        }
    }

    public final void h(e0 e0Var) {
        synchronized (this.f140986i) {
            this.f140986i.remove(e0Var);
        }
    }

    @Override // z7.l
    public final void remove() {
        c3.e eVar = this.f140983f;
        h7.a aVar = this.f140982e;
        g7.i iVar = this.f140978a;
        h7.d dVar = this.f140981d;
        h7.e c13 = dVar.c(null, dVar.f67866d | 1, -4000);
        try {
            try {
                ArrayList e13 = e(c13, (n) c(new q(this, c13, iVar), true), true);
                for (int i13 = 0; i13 < e13.size(); i13++) {
                    ((w) aVar).o(eVar.k(((s) e13.get(i13)).f140972b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            ((w) aVar).o(eVar.k(iVar));
        }
    }
}
