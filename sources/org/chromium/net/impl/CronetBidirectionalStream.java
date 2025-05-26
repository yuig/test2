package org.chromium.net.impl;

import J.N;
import a.a;
import ae.r;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import jp2.a0;
import jp2.b;
import jp2.b0;
import jp2.c;
import jp2.d;
import jp2.d0;
import jp2.m;
import jp2.w;
import jp2.x;
import kh2.e3;
import oi.o6;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* loaded from: classes4.dex */
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    public d A;

    /* renamed from: a, reason: collision with root package name */
    public final CronetUrlRequestContext f97343a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f97344b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f97345c;

    /* renamed from: d, reason: collision with root package name */
    public final String f97346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f97347e;

    /* renamed from: f, reason: collision with root package name */
    public final String f97348f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f97349g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f97350h;

    /* renamed from: i, reason: collision with root package name */
    public final Collection f97351i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f97352j;

    /* renamed from: k, reason: collision with root package name */
    public final int f97353k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f97354l;

    /* renamed from: m, reason: collision with root package name */
    public final int f97355m;

    /* renamed from: n, reason: collision with root package name */
    public final long f97356n;

    /* renamed from: o, reason: collision with root package name */
    public w f97357o;

    /* renamed from: p, reason: collision with root package name */
    public CronetException f97358p;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedList f97360r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedList f97361s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f97362t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f97363u;

    /* renamed from: v, reason: collision with root package name */
    public m f97364v;

    /* renamed from: w, reason: collision with root package name */
    public long f97365w;

    /* renamed from: z, reason: collision with root package name */
    public b0 f97368z;

    /* renamed from: q, reason: collision with root package name */
    public final Object f97359q = new Object();

    /* renamed from: x, reason: collision with root package name */
    public int f97366x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f97367y = 0;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i13, BidirectionalStream.Callback callback, Executor executor, String str2, ArrayList arrayList, boolean z13, ArrayList arrayList2, boolean z14, int i14, boolean z15, int i15, long j13) {
        int i16 = 0;
        this.f97343a = cronetUrlRequestContext;
        this.f97346d = str;
        int i17 = 1;
        if (i13 != 0) {
            if (i13 != 1) {
                i17 = 3;
                if (i13 != 2) {
                    if (i13 == 3) {
                        i17 = 4;
                    } else {
                        if (i13 != 4) {
                            throw new IllegalArgumentException("Invalid stream priority.");
                        }
                        i17 = 5;
                    }
                }
            } else {
                i17 = 2;
            }
        }
        this.f97347e = i17;
        this.f97345c = new d0(callback);
        this.f97344b = executor;
        this.f97348f = str2;
        String[] strArr = new String[arrayList.size() * 2];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i18 = i16 + 1;
            strArr[i16] = (String) entry.getKey();
            i16 += 2;
            strArr[i18] = (String) entry.getValue();
        }
        this.f97349g = strArr;
        this.f97350h = z13;
        this.f97360r = new LinkedList();
        this.f97361s = new LinkedList();
        this.f97351i = arrayList2;
        this.f97352j = z14;
        this.f97353k = i14;
        this.f97354l = z15;
        this.f97355m = i15;
        this.f97356n = j13;
    }

    public static void a(CronetBidirectionalStream cronetBidirectionalStream) {
        synchronized (cronetBidirectionalStream.f97359q) {
            try {
                if (cronetBidirectionalStream.h()) {
                    return;
                }
                if (cronetBidirectionalStream.f97367y == 10 && cronetBidirectionalStream.f97366x == 4) {
                    cronetBidirectionalStream.f97367y = 7;
                    cronetBidirectionalStream.f97366x = 7;
                    cronetBidirectionalStream.c(false);
                    try {
                        cronetBidirectionalStream.f97345c.onSucceeded(cronetBidirectionalStream, cronetBidirectionalStream.f97368z);
                    } catch (Exception e13) {
                        HashSet hashSet = CronetUrlRequestContext.f97414w;
                        Log.e("cr_CronetUrlRequestContext", "Exception in onSucceeded method", e13);
                    }
                    cronetBidirectionalStream.f97357o.a();
                }
            } finally {
            }
        }
    }

    public static void b(CronetBidirectionalStream cronetBidirectionalStream, Exception exc) {
        cronetBidirectionalStream.getClass();
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("CalledByNative method has thrown an exception", exc);
        HashSet hashSet = CronetUrlRequestContext.f97414w;
        Log.e("cr_CronetUrlRequestContext", "Exception in CalledByNative method", exc);
        cronetBidirectionalStream.f(callbackExceptionImpl);
    }

    public static boolean d(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static ArrayList g(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length / 2);
        for (int i13 = 0; i13 < strArr.length; i13 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i13], strArr[i13 + 1]));
        }
        return arrayList;
    }

    public final void c(boolean z13) {
        HashSet hashSet = CronetUrlRequestContext.f97414w;
        Log.i("cr_CronetUrlRequestContext", "destroyNativeStreamLocked " + toString());
        long j13 = this.f97365w;
        if (j13 == 0) {
            return;
        }
        N.MS2l1kNx(j13, this, z13);
        this.f97343a.f97417c.decrementAndGet();
        this.f97365w = 0L;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        synchronized (this.f97359q) {
            try {
                if (!h() && this.f97366x != 0) {
                    this.f97367y = 5;
                    this.f97366x = 5;
                    c(true);
                }
            } finally {
            }
        }
    }

    public final void e(CronetException cronetException) {
        i(new o6(24, this, cronetException));
    }

    public final void f(CronetException cronetException) {
        this.f97358p = cronetException;
        synchronized (this.f97359q) {
            try {
                if (h()) {
                    return;
                }
                this.f97367y = 6;
                this.f97366x = 6;
                c(false);
                try {
                    this.f97345c.onFailed(this, this.f97368z, cronetException);
                } catch (Exception e13) {
                    HashSet hashSet = CronetUrlRequestContext.f97414w;
                    Log.e("cr_CronetUrlRequestContext", "Exception notifying of failed request", e13);
                }
                this.f97357o.a();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        int i13;
        synchronized (this.f97359q) {
            try {
                if (!h() && ((i13 = this.f97367y) == 8 || i13 == 9)) {
                    if (this.f97360r.isEmpty() && this.f97361s.isEmpty()) {
                        if (!this.f97363u) {
                            this.f97363u = true;
                            N.MGLIR7Sc(this.f97365w, this);
                            if (!d(this.f97348f)) {
                                this.f97367y = 10;
                            }
                        }
                        return;
                    }
                    if (!this.f97360r.isEmpty()) {
                        this.f97361s.addAll(this.f97360r);
                        this.f97360r.clear();
                    }
                    if (this.f97367y == 9) {
                        return;
                    }
                    j();
                }
            } finally {
            }
        }
    }

    public final boolean h() {
        return this.f97366x != 0 && this.f97365w == 0;
    }

    public final void i(Runnable runnable) {
        try {
            this.f97344b.execute(runnable);
        } catch (RejectedExecutionException e13) {
            HashSet hashSet = CronetUrlRequestContext.f97414w;
            Log.e("cr_CronetUrlRequestContext", "Exception posting task to executor", e13);
            synchronized (this.f97359q) {
                this.f97367y = 6;
                this.f97366x = 6;
                c(false);
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean h10;
        synchronized (this.f97359q) {
            h10 = h();
        }
        return h10;
    }

    public final void j() {
        LinkedList linkedList = this.f97361s;
        int size = linkedList.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            ByteBuffer byteBuffer = (ByteBuffer) linkedList.poll();
            byteBufferArr[i13] = byteBuffer;
            iArr[i13] = byteBuffer.position();
            iArr2[i13] = byteBuffer.limit();
        }
        this.f97367y = 9;
        this.f97363u = true;
        if (N.MwJCBTMQ(this.f97365w, this, byteBufferArr, iArr, iArr2, this.f97362t && this.f97360r.isEmpty())) {
            return;
        }
        this.f97367y = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    @CalledByNative
    public final void onCanceled() {
        i(new b(this, 1));
    }

    @CalledByNative
    public final void onError(int i13, int i14, int i15, String str, long j13) {
        b0 b0Var = this.f97368z;
        if (b0Var != null) {
            b0Var.f77312g.set(j13);
        }
        if (i13 == 10 || i13 == 3) {
            e(new QuicExceptionImpl(a.j("Exception in BidirectionalStream: ", str), i13, i14, i15));
        } else {
            e(new BidirectionalStreamNetworkException(a.j("Exception in BidirectionalStream: ", str), i13, i14));
        }
    }

    @CalledByNative
    public final void onMetricsCollected(long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25, long j26, long j27, long j28, boolean z13, long j29, long j33) {
        synchronized (this.f97359q) {
            try {
                if (this.f97364v != null) {
                    throw new IllegalStateException("Metrics collection should only happen once.");
                }
                m mVar = new m(j13, j14, j15, j16, j17, j18, j19, j23, j24, j25, j26, j27, j28, z13, j29, j33);
                this.f97364v = mVar;
                int i13 = this.f97366x;
                this.f97343a.e(new x(this.f97346d, this.f97351i, mVar, i13 == 7 ? 0 : i13 == 5 ? 2 : 1, this.f97368z, this.f97358p), this.f97357o);
            } finally {
                this.f97357o.a();
            }
        }
    }

    @CalledByNative
    public final void onReadCompleted(ByteBuffer byteBuffer, int i13, int i14, int i15, long j13) {
        int i16;
        this.f97368z.f77312g.set(j13);
        if (byteBuffer.position() != i14 || byteBuffer.limit() != i15) {
            e(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (i13 < 0 || (i16 = i14 + i13) > i15) {
            e(new CronetExceptionImpl("Invalid number of bytes read", null));
            return;
        }
        d dVar = this.A;
        dVar.f77319b = byteBuffer;
        dVar.f77320c = i13 == 0;
        i(dVar);
    }

    @CalledByNative
    public final void onResponseHeadersReceived(int i13, String str, String[] strArr, long j13) {
        try {
            this.f97368z = new b0(Arrays.asList(this.f97346d), i13, "", g(strArr), false, str, null, j13);
            i(new b(this, 0));
        } catch (Exception unused) {
            e(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
        }
    }

    @CalledByNative
    public final void onResponseTrailersReceived(String[] strArr) {
        i(new c(this, new a0(g(strArr))));
    }

    @CalledByNative
    public final void onStreamReady(boolean z13) {
        i(new r(this, z13, 4));
    }

    @CalledByNative
    public final void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z13) {
        boolean z14;
        synchronized (this.f97359q) {
            try {
                if (h()) {
                    return;
                }
                this.f97367y = 8;
                if (!this.f97361s.isEmpty()) {
                    j();
                }
                for (int i13 = 0; i13 < byteBufferArr.length; i13++) {
                    ByteBuffer byteBuffer = byteBufferArr[i13];
                    if (byteBuffer.position() != iArr[i13] || byteBuffer.limit() != iArr2[i13]) {
                        e(new CronetExceptionImpl("ByteBuffer modified externally during write", null));
                        return;
                    }
                    if (z13) {
                        z14 = true;
                        if (i13 == byteBufferArr.length - 1) {
                            i(new d(this, byteBuffer, z14));
                        }
                    }
                    z14 = false;
                    i(new d(this, byteBuffer, z14));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        synchronized (this.f97359q) {
            try {
                if (!byteBuffer.hasRemaining()) {
                    throw new IllegalArgumentException("ByteBuffer is already full.");
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
                }
                if (this.f97366x != 2) {
                    throw new IllegalStateException("Unexpected read attempt.");
                }
                if (h()) {
                    return;
                }
                if (this.A == null) {
                    this.A = new d(this, 0);
                }
                this.f97366x = 3;
                if (N.Md_rPmgC(this.f97365w, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                }
                this.f97366x = 2;
                throw new IllegalArgumentException("Unable to call native read");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        long j13;
        synchronized (this.f97359q) {
            if (this.f97366x != 0) {
                throw new IllegalStateException("Stream is already started.");
            }
            try {
                CronetUrlRequestContext cronetUrlRequestContext = this.f97343a;
                synchronized (cronetUrlRequestContext.f97415a) {
                    cronetUrlRequestContext.a();
                    j13 = cronetUrlRequestContext.f97419e;
                }
                this.f97365w = N.MqTDYvZd(this, j13, !this.f97350h, this.f97352j, this.f97353k, this.f97354l, this.f97355m, this.f97356n);
                CronetUrlRequestContext cronetUrlRequestContext2 = this.f97343a;
                cronetUrlRequestContext2.f97418d.incrementAndGet();
                cronetUrlRequestContext2.f97417c.incrementAndGet();
                CronetUrlRequestContext cronetUrlRequestContext3 = this.f97343a;
                Objects.requireNonNull(cronetUrlRequestContext3);
                w wVar = new w(new e3(cronetUrlRequestContext3, 7));
                this.f97357o = wVar;
                wVar.b();
                int McDUim_I = N.McDUim_I(this.f97365w, this, this.f97346d, this.f97347e, this.f97348f, this.f97349g, !d(r6));
                if (McDUim_I == -1) {
                    throw new IllegalArgumentException("Invalid http method " + this.f97348f);
                }
                if (McDUim_I > 0) {
                    int i13 = McDUim_I - 1;
                    String[] strArr = this.f97349g;
                    throw new IllegalArgumentException("Invalid header " + strArr[i13] + "=" + strArr[McDUim_I]);
                }
                this.f97367y = 1;
                this.f97366x = 1;
            } catch (RuntimeException e13) {
                c(false);
                this.f97357o.a();
                this.f97357o.a();
                throw e13;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z13) {
        synchronized (this.f97359q) {
            try {
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
                }
                if (!byteBuffer.hasRemaining() && !z13) {
                    throw new IllegalArgumentException("Empty buffer before end of stream.");
                }
                if (this.f97362t) {
                    throw new IllegalArgumentException("Write after writing end of stream.");
                }
                if (h()) {
                    return;
                }
                this.f97360r.add(byteBuffer);
                if (z13) {
                    this.f97362t = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
