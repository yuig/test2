package df;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static Handler f54815b;

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f54814a = new o0();

    /* renamed from: c, reason: collision with root package name */
    public static final v1 f54816c = new v1(8);

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f54817d = new v1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f54818e = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(df.n0 r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.o0.a(df.n0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8, r15) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        r9 = r10;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006f, code lost:
    
        r15 = df.u0.f54860d;
        wc.b.z(le.g0.CACHE, r3, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        df.j1.z(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x008a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:68:0x008a */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(df.n0 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.o0.b(df.n0, boolean):void");
    }

    public static final void c(p0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        n0 n0Var = new n0(request.f54824a, request.f54827d);
        HashMap hashMap = f54818e;
        synchronized (hashMap) {
            m0 m0Var = (m0) hashMap.get(n0Var);
            if (m0Var != null) {
                u1 u1Var = m0Var.f54802b;
                if (u1Var != null) {
                    v1 v1Var = u1Var.f54869e;
                    ReentrantLock reentrantLock = v1Var.f54873c;
                    reentrantLock.lock();
                    try {
                        if (u1Var.f54868d) {
                            Unit unit = Unit.f80348a;
                            reentrantLock.unlock();
                        } else {
                            v1Var.f54874d = u1Var.b(v1Var.f54874d);
                            reentrantLock.unlock();
                            hashMap.remove(n0Var);
                        }
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                m0Var.f54803c = true;
            }
            Unit unit2 = Unit.f80348a;
        }
    }

    public static final void d(p0 p0Var) {
        n0 n0Var = new n0(p0Var.f54824a, p0Var.f54827d);
        HashMap hashMap = f54818e;
        synchronized (hashMap) {
            m0 m0Var = (m0) hashMap.get(n0Var);
            if (m0Var != null) {
                Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
                m0Var.f54801a = p0Var;
                m0Var.f54803c = false;
                u1 u1Var = m0Var.f54802b;
                if (u1Var != null) {
                    v1 v1Var = u1Var.f54869e;
                    ReentrantLock reentrantLock = v1Var.f54873c;
                    reentrantLock.lock();
                    try {
                        if (!u1Var.f54868d) {
                            u1 b13 = u1Var.b(v1Var.f54874d);
                            v1Var.f54874d = b13;
                            v1Var.f54874d = u1Var.a(b13, true);
                        }
                        Unit unit = Unit.f80348a;
                        reentrantLock.unlock();
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
            } else {
                e(p0Var, n0Var, f54817d, new ae.r(n0Var, p0Var.f54826c));
                Unit unit2 = Unit.f80348a;
            }
        }
    }

    public static void e(p0 request, n0 n0Var, v1 v1Var, Runnable runnable) {
        HashMap hashMap = f54818e;
        synchronized (hashMap) {
            Intrinsics.checkNotNullParameter(request, "request");
            m0 m0Var = new m0();
            m0Var.f54801a = request;
            hashMap.put(n0Var, m0Var);
            m0Var.f54802b = v1.a(v1Var, runnable);
            Unit unit = Unit.f80348a;
        }
    }

    public static m0 g(n0 n0Var) {
        m0 m0Var;
        HashMap hashMap = f54818e;
        synchronized (hashMap) {
            m0Var = (m0) hashMap.remove(n0Var);
        }
        return m0Var;
    }

    public final void f(n0 n0Var, Exception exc, Bitmap bitmap, boolean z13) {
        Handler handler;
        m0 g13 = g(n0Var);
        if (g13 == null || g13.f54803c) {
            return;
        }
        p0 p0Var = g13.f54801a;
        bb.p pVar = p0Var == null ? null : p0Var.f54825b;
        if (pVar != null) {
            synchronized (this) {
                try {
                    if (f54815b == null) {
                        f54815b = new Handler(Looper.getMainLooper());
                    }
                    handler = f54815b;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (handler == null) {
                return;
            }
            handler.post(new l0(p0Var, exc, z13, bitmap, pVar));
        }
    }
}
