package org.chromium.net.impl;

import J.N;
import android.util.Log;
import d.d;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import jp2.b0;
import jp2.h0;
import jp2.j0;
import jp2.m;
import jp2.o;
import jp2.p;
import jp2.q;
import jp2.s;
import jp2.v;
import jp2.w;
import jp2.y;
import lb.x;
import ne0.b;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import s.f;
import sq0.a;

/* loaded from: classes2.dex */
public final class CronetUrlRequest extends y {
    public b0 A;
    public int B;
    public CronetException C;
    public m D;
    public x E;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97388a;

    /* renamed from: b, reason: collision with root package name */
    public long f97389b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97390c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f97391d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97392e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f97393f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final CronetUrlRequestContext f97394g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f97395h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f97396i;

    /* renamed from: j, reason: collision with root package name */
    public final j0 f97397j;

    /* renamed from: k, reason: collision with root package name */
    public final String f97398k;

    /* renamed from: l, reason: collision with root package name */
    public final int f97399l;

    /* renamed from: m, reason: collision with root package name */
    public final int f97400m;

    /* renamed from: n, reason: collision with root package name */
    public String f97401n;

    /* renamed from: o, reason: collision with root package name */
    public final q f97402o;

    /* renamed from: p, reason: collision with root package name */
    public final Collection f97403p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f97404q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f97405r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f97406s;

    /* renamed from: t, reason: collision with root package name */
    public final int f97407t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f97408u;

    /* renamed from: v, reason: collision with root package name */
    public final int f97409v;

    /* renamed from: w, reason: collision with root package name */
    public final h0 f97410w;

    /* renamed from: x, reason: collision with root package name */
    public final long f97411x;

    /* renamed from: y, reason: collision with root package name */
    public final v f97412y;

    /* renamed from: z, reason: collision with root package name */
    public CronetUploadDataStream f97413z;

    public CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i13, UrlRequest.Callback callback, Executor executor, ArrayList arrayList, boolean z13, boolean z14, boolean z15, boolean z16, int i14, boolean z17, int i15, RequestFinishedInfo.Listener listener, int i16, long j13) {
        int i17;
        ArrayList arrayList2 = new ArrayList();
        this.f97396i = arrayList2;
        this.f97402o = new q();
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(callback, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        this.f97388a = z15;
        this.f97394g = cronetUrlRequestContext;
        this.f97412y = cronetUrlRequestContext.f97436v;
        this.f97398k = str;
        arrayList2.add(str);
        int i18 = 2;
        if (i13 == 0) {
            i17 = 1;
        } else if (i13 == 1) {
            i17 = 2;
        } else if (i13 != 2) {
            i17 = 4;
            if (i13 == 4) {
                i17 = 5;
            }
        } else {
            i17 = 3;
        }
        this.f97399l = i17;
        this.f97397j = new j0(callback);
        this.f97395h = executor;
        this.f97403p = arrayList;
        this.f97404q = z13;
        this.f97405r = z14;
        this.f97406s = z16;
        this.f97407t = i14;
        this.f97408u = z17;
        this.f97409v = i15;
        this.f97410w = listener != null ? new h0(listener) : null;
        if (i16 == 1) {
            i18 = 1;
        } else if (i16 != 2) {
            i18 = 0;
        }
        this.f97400m = i18;
        this.f97411x = j13;
    }

    public static void a(CronetUrlRequest cronetUrlRequest) {
        cronetUrlRequest.getClass();
        w wVar = new w(new a(cronetUrlRequest, 10));
        try {
            if (cronetUrlRequest.D != null) {
                try {
                    v vVar = cronetUrlRequest.f97412y;
                    cronetUrlRequest.c();
                    vVar.getClass();
                } catch (RuntimeException e13) {
                    HashSet hashSet = CronetUrlRequestContext.f97414w;
                    Log.e("cr_".concat("CronetUrlRequestContext"), "Error while trying to log CronetTrafficInfo: ", e13);
                }
                jp2.x xVar = new jp2.x(cronetUrlRequest.f97398k, cronetUrlRequest.f97403p, cronetUrlRequest.D, cronetUrlRequest.B, cronetUrlRequest.A, cronetUrlRequest.C);
                cronetUrlRequest.f97394g.e(xVar, wVar);
                h0 h0Var = cronetUrlRequest.f97410w;
                if (h0Var != null) {
                    wVar.b();
                    try {
                        h0Var.f77331a.getExecutor().execute(new s(cronetUrlRequest, xVar, wVar));
                    } catch (RejectedExecutionException e14) {
                        HashSet hashSet2 = CronetUrlRequestContext.f97414w;
                        Log.e("cr_".concat("CronetUrlRequestContext"), "Exception posting task to executor", e14);
                        wVar.a();
                    }
                }
            }
            wVar.a();
        } catch (Throwable th3) {
            wVar.a();
            throw th3;
        }
    }

    public static void b(CronetUrlRequest cronetUrlRequest, Exception exc) {
        cronetUrlRequest.getClass();
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        HashSet hashSet = CronetUrlRequestContext.f97414w;
        Log.e("cr_CronetUrlRequestContext", "Exception in CalledByNative method", exc);
        cronetUrlRequest.g(callbackExceptionImpl);
    }

    public final void c() {
        Map emptyMap;
        boolean z13;
        long j13;
        long j14;
        b0 b0Var = this.A;
        if (b0Var != null) {
            emptyMap = b0Var.f77313h.getAsMap();
            b0 b0Var2 = this.A;
            String str = b0Var2.f77310e;
            z13 = b0Var2.f77309d;
        } else {
            emptyMap = Collections.emptyMap();
            z13 = false;
        }
        long longValue = this.D.f77369q.longValue();
        if (!z13 || longValue != 0) {
            q qVar = this.f97402o;
            if (qVar == null) {
                j13 = 0;
            } else {
                Iterator<E> it = qVar.iterator();
                j13 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()) != null) {
                        j13 += r10.length();
                    }
                    if (((String) entry.getValue()) != null) {
                        j13 += ((String) entry.getValue()).length();
                    }
                }
            }
            Math.max(0L, longValue - j13);
        }
        long longValue2 = this.D.f77370r.longValue();
        if (!z13 || longValue2 != 0) {
            if (emptyMap == null) {
                j14 = 0;
            } else {
                j14 = 0;
                for (Map.Entry entry2 : emptyMap.entrySet()) {
                    if (((String) entry2.getKey()) != null) {
                        j14 += r8.length();
                    }
                    if (entry2.getValue() != null) {
                        while (((List) entry2.getValue()).iterator().hasNext()) {
                            j14 += ((String) r1.next()).length();
                        }
                    }
                }
            }
            Math.max(0L, longValue2 - j14);
        }
        if (m.a(this.D.f77353a) == null || m.a(this.D.f77364l) == null) {
            Duration.ofSeconds(0L);
        } else {
            Duration.ofMillis(m.a(this.D.f77364l).getTime() - m.a(this.D.f77353a).getTime());
        }
        if (m.a(this.D.f77353a) == null || m.a(this.D.f77365m) == null) {
            Duration.ofSeconds(0L);
        } else {
            Duration.ofMillis(m.a(this.D.f77365m).getTime() - m.a(this.D.f77353a).getTime());
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        synchronized (this.f97393f) {
            try {
                if (!h() && this.f97390c) {
                    f(2);
                }
            } finally {
            }
        }
    }

    public final void d() {
        if (!this.f97388a && Thread.currentThread() == this.f97394g.f97420f) {
            throw new InlineExecutionProhibitedException();
        }
    }

    public final void e() {
        synchronized (this.f97393f) {
            try {
                if (this.f97390c || h()) {
                    throw new IllegalStateException("Request is already started.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f(int i13) {
        this.B = i13;
        if (this.f97389b == 0) {
            return;
        }
        this.f97394g.f97417c.decrementAndGet();
        N.M4znfYdB(this.f97389b, this, i13 == 2);
        this.f97389b = 0L;
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        synchronized (this.f97393f) {
            try {
                if (!this.f97391d) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.f97391d = false;
                if (h()) {
                    return;
                }
                N.Mhp54Oqs(this.f97389b, this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g(CronetException cronetException) {
        synchronized (this.f97393f) {
            try {
                if (h()) {
                    return;
                }
                this.C = cronetException;
                f(1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        synchronized (this.f97393f) {
            try {
                long j13 = this.f97389b;
                if (j13 != 0) {
                    N.MgIIMpT9(j13, this, versionSafeCallbacks$UrlRequestStatusListener);
                } else {
                    j(new p(versionSafeCallbacks$UrlRequestStatusListener));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean h() {
        return this.f97390c && this.f97389b == 0;
    }

    public final void i(Throwable th3) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UploadDataProvider", th3);
        HashSet hashSet = CronetUrlRequestContext.f97414w;
        Log.e("cr_CronetUrlRequestContext", "Exception in upload method", th3);
        g(callbackExceptionImpl);
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean h10;
        synchronized (this.f97393f) {
            h10 = h();
        }
        return h10;
    }

    public final void j(Runnable runnable) {
        try {
            this.f97395h.execute(runnable);
        } catch (RejectedExecutionException e13) {
            HashSet hashSet = CronetUrlRequestContext.f97414w;
            Log.e("cr_".concat("CronetUrlRequestContext"), "Exception posting task to executor", e13);
            g(new CronetExceptionImpl("Exception posting task to executor", e13));
        }
    }

    public final b0 k(int i13, String str, String[] strArr, boolean z13, String str2, String str3, long j13) {
        q qVar = new q();
        for (int i14 = 0; i14 < strArr.length; i14 += 2) {
            qVar.add(new AbstractMap.SimpleImmutableEntry(strArr[i14], strArr[i14 + 1]));
        }
        return new b0(new ArrayList(this.f97396i), i13, str, qVar, z13, str2, str3, j13);
    }

    @CalledByNative
    public final void onCanceled() {
        j(new o(this, 3));
    }

    @CalledByNative
    public final void onError(int i13, int i14, int i15, String str, long j13) {
        b0 b0Var = this.A;
        if (b0Var != null) {
            b0Var.f77312g.set(j13);
        }
        if (i13 == 10 || i13 == 3) {
            g(new QuicExceptionImpl(a.a.j("Exception in CronetUrlRequest: ", str), i13, i14, i15));
            return;
        }
        switch (i13) {
            case 1:
                i13 = 1;
                break;
            case 2:
                i13 = 2;
                break;
            case 3:
                i13 = 3;
                break;
            case 4:
                i13 = 4;
                break;
            case 5:
                i13 = 5;
                break;
            case 6:
                i13 = 6;
                break;
            case 7:
                i13 = 7;
                break;
            case 8:
                i13 = 8;
                break;
            case 9:
                i13 = 9;
                break;
            case 10:
                i13 = 10;
                break;
            case 11:
                i13 = 11;
                break;
            default:
                HashSet hashSet = CronetUrlRequestContext.f97414w;
                Log.e("cr_CronetUrlRequestContext", "Unknown error code: " + i13);
                break;
        }
        g(new NetworkExceptionImpl(a.a.j("Exception in CronetUrlRequest: ", str), i13, i14));
    }

    @CalledByNative
    public final void onMetricsCollected(long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25, long j26, long j27, long j28, boolean z13, long j29, long j33, boolean z14, boolean z15) {
        synchronized (this.f97393f) {
            try {
                if (this.D != null) {
                    throw new IllegalStateException("Metrics collection should only happen once.");
                }
                this.D = new m(j13, j14, j15, j16, j17, j18, j19, j23, j24, j25, j26, j27, j28, z13, j29, j33);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @CalledByNative
    public final void onNativeAdapterDestroyed() {
        synchronized (this.f97393f) {
            try {
                if (this.C == null) {
                    return;
                }
                try {
                    this.f97395h.execute(new b(this, 16));
                } catch (RejectedExecutionException e13) {
                    HashSet hashSet = CronetUrlRequestContext.f97414w;
                    Log.e("cr_".concat("CronetUrlRequestContext"), "Exception posting task to executor", e13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @CalledByNative
    public final void onReadCompleted(ByteBuffer byteBuffer, int i13, int i14, int i15, long j13) {
        this.A.f77312g.set(j13);
        if (byteBuffer.position() != i14 || byteBuffer.limit() != i15) {
            g(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.E == null) {
            this.E = new x(this, 0);
        }
        x xVar = this.E;
        xVar.f82681b = byteBuffer;
        j(xVar);
    }

    @CalledByNative
    public final void onRedirectReceived(String str, int i13, String str2, String[] strArr, boolean z13, String str3, String str4, long j13) {
        b0 k13 = k(i13, str2, strArr, z13, str3, str4, j13);
        this.f97396i.add(str);
        j(new f((Object) this, (Object) k13, str, 28));
    }

    @CalledByNative
    public final void onResponseStarted(int i13, String str, String[] strArr, boolean z13, String str2, String str3, long j13) {
        this.A = k(i13, str, strArr, z13, str2, str3, j13);
        j(new o(this, 1));
    }

    @CalledByNative
    public final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i13) {
        j(new d(this, versionSafeCallbacks$UrlRequestStatusListener, i13, 13, 0));
    }

    @CalledByNative
    public final void onSucceeded(long j13) {
        this.A.f77312g.set(j13);
        j(new o(this, 2));
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        synchronized (this.f97393f) {
            try {
                if (!this.f97392e) {
                    throw new IllegalStateException("Unexpected read attempt.");
                }
                this.f97392e = false;
                if (h()) {
                    return;
                }
                if (N.MfCxA8r3(this.f97389b, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                }
                this.f97392e = true;
                throw new IllegalArgumentException("Unable to call native read");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        int i13;
        long j13;
        synchronized (this.f97393f) {
            try {
                try {
                    e();
                    try {
                        CronetUrlRequestContext cronetUrlRequestContext = this.f97394g;
                        try {
                            synchronized (cronetUrlRequestContext.f97415a) {
                                try {
                                    cronetUrlRequestContext.a();
                                    j13 = cronetUrlRequestContext.f97419e;
                                } catch (Throwable th3) {
                                    th = th3;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            }
                        } catch (RuntimeException e13) {
                            e = e13;
                        }
                    } catch (RuntimeException e14) {
                        e = e14;
                    }
                    try {
                    } catch (RuntimeException e15) {
                        e = e15;
                        i13 = 1;
                        f(i13);
                        this.f97394g.f97418d.decrementAndGet();
                        throw e;
                    }
                    try {
                        this.f97389b = N.MuOIsMvf(this, j13, this.f97398k, this.f97399l, this.f97404q, this.f97405r, this.f97406s, this.f97407t, this.f97408u, this.f97409v, this.f97400m, this.f97411x);
                        CronetUrlRequestContext cronetUrlRequestContext2 = this.f97394g;
                        cronetUrlRequestContext2.f97418d.incrementAndGet();
                        cronetUrlRequestContext2.f97417c.incrementAndGet();
                        String str = this.f97401n;
                        if (str != null && !N.M51RPBJe(this.f97389b, this, str)) {
                            throw new IllegalArgumentException("Invalid http method " + this.f97401n);
                        }
                        Iterator<E> it = this.f97402o.iterator();
                        int i14 = 0;
                        boolean z13 = false;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((String) entry.getKey()).equalsIgnoreCase("Content-Type") && !((String) entry.getValue()).isEmpty()) {
                                z13 = true;
                            }
                            if (!N.MvHusd1J(this.f97389b, this, (String) entry.getKey(), (String) entry.getValue())) {
                                throw new IllegalArgumentException("Invalid header " + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                            }
                        }
                        CronetUploadDataStream cronetUploadDataStream = this.f97413z;
                        if (cronetUploadDataStream == null) {
                            this.f97390c = true;
                            N.MabZ5m6r(this.f97389b, this);
                        } else {
                            if (!z13) {
                                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                            }
                            this.f97390c = true;
                            cronetUploadDataStream.e(new o(this, i14));
                        }
                    } catch (RuntimeException e16) {
                        e = e16;
                        i13 = 1;
                        f(i13);
                        this.f97394g.f97418d.decrementAndGet();
                        throw e;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }
}
