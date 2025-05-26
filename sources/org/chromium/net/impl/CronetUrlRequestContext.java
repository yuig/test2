package org.chromium.net.impl;

import J.N;
import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import bk.f;
import bs1.c;
import dp2.g;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import jp2.a;
import jp2.e;
import jp2.f0;
import jp2.g0;
import jp2.h;
import jp2.h0;
import jp2.i;
import jp2.j;
import jp2.k;
import jp2.l;
import jp2.r;
import jp2.s;
import jp2.v;
import jp2.w;
import jp2.x;
import jp2.z;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.build.annotations.UsedByReflection;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestContextConfigOptions;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

@UsedByReflection
/* loaded from: classes2.dex */
public class CronetUrlRequestContext extends e {

    /* renamed from: w, reason: collision with root package name */
    public static final HashSet f97414w = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final Object f97415a;

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f97416b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f97417c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f97418d;

    /* renamed from: e, reason: collision with root package name */
    public long f97419e;

    /* renamed from: f, reason: collision with root package name */
    public Thread f97420f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97421g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f97422h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f97423i;

    /* renamed from: j, reason: collision with root package name */
    public int f97424j;

    /* renamed from: k, reason: collision with root package name */
    public int f97425k;

    /* renamed from: l, reason: collision with root package name */
    public int f97426l;

    /* renamed from: m, reason: collision with root package name */
    public int f97427m;

    /* renamed from: n, reason: collision with root package name */
    public final g f97428n;

    /* renamed from: o, reason: collision with root package name */
    public final g f97429o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f97430p;

    /* renamed from: q, reason: collision with root package name */
    public final ConditionVariable f97431q;

    /* renamed from: r, reason: collision with root package name */
    public final String f97432r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f97433s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f97434t;

    /* renamed from: u, reason: collision with root package name */
    public long f97435u;

    /* renamed from: v, reason: collision with root package name */
    public final v f97436v;

    @UsedByReflection
    public CronetUrlRequestContext(j jVar) {
        boolean MjAZnhE4;
        Object obj = new Object();
        this.f97415a = obj;
        this.f97416b = new ConditionVariable(false);
        this.f97417c = new AtomicInteger(0);
        this.f97418d = new AtomicInteger(0);
        this.f97422h = new Object();
        this.f97423i = new Object();
        this.f97424j = 0;
        this.f97425k = -1;
        this.f97426l = -1;
        this.f97427m = -1;
        g gVar = new g();
        this.f97428n = gVar;
        g gVar2 = new g();
        this.f97429o = gVar2;
        this.f97430p = new HashMap();
        this.f97431q = new ConditionVariable();
        this.f97435u = -1L;
        hashCode();
        gVar.f56053f = false;
        gVar2.f56053f = false;
        this.f97421g = jVar.f77349m;
        CronetLibraryLoader.a(jVar.f77337a, jVar);
        Class cls = null;
        if (jVar.f77346j.getType() == 1) {
            String str = jVar.f77342f;
            this.f97432r = str;
            HashSet hashSet = f97414w;
            synchronized (hashSet) {
                try {
                    if (!hashSet.add(str)) {
                        throw new IllegalStateException("Disk cache storage path already in use");
                    }
                } finally {
                }
            }
        } else {
            this.f97432r = null;
        }
        synchronized (obj) {
            long M135Cu0D = N.M135Cu0D(b(jVar));
            this.f97419e = M135Cu0D;
            if (M135Cu0D == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
            MjAZnhE4 = N.MjAZnhE4(M135Cu0D, this);
        }
        if (MjAZnhE4) {
            Context context = jVar.f77337a;
            k c13 = c();
            boolean z13 = c.J0(context).getBoolean("android.net.http.EnableTelemetry", c13 == k.CRONET_SOURCE_PLATFORM || c13 == k.CRONET_SOURCE_PLAY_SERVICES);
            v vVar = l.f77352a;
            if (z13 && Build.VERSION.SDK_INT >= 30) {
                try {
                    cls = l.class.getClassLoader().loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(v.class);
                } catch (Exception e13) {
                    Log.e("l", "Exception fetching LoggerImpl class", e13);
                }
                if (cls != null) {
                    try {
                        vVar = (v) cls.getConstructor(Integer.TYPE).newInstance(1);
                    } catch (Exception e14) {
                        Log.e("l", "Exception creating an instance of CronetLoggerImpl", e14);
                    }
                }
            }
            this.f97436v = vVar;
        } else {
            this.f97436v = l.f77352a;
        }
        try {
            v vVar2 = this.f97436v;
            jVar.f77346j.toPublicBuilderCacheMode();
            String[] split = "Cronet/119.0.6045.31@c76b9b6a".split("/")[1].split("@")[0].split("\\.");
            Integer.parseInt(split[0]);
            Integer.parseInt(split[1]);
            Integer.parseInt(split[2]);
            Integer.parseInt(split[3]);
            c();
            vVar2.getClass();
        } catch (RuntimeException e15) {
            Log.e("cr_".concat("CronetUrlRequestContext"), "Error while trying to log CronetEngine creation: ", e15);
        }
        androidx.appcompat.app.v vVar3 = new androidx.appcompat.app.v(this, 20);
        HandlerThread handlerThread = CronetLibraryLoader.f97370b;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            vVar3.run();
        } else {
            new Handler(handlerThread.getLooper()).post(vVar3);
        }
    }

    public static long b(j jVar) {
        RequestContextConfigOptions.Builder bypassPublicKeyPinningForLocalTrustAnchors = RequestContextConfigOptions.newBuilder().setQuicEnabled(jVar.f77343g).setHttp2Enabled(jVar.f77344h).setBrotliEnabled(jVar.f77345i).setDisableCache(!jVar.f77346j.isContentCacheEnabled()).setHttpCacheMode(jVar.f77346j.getType()).setHttpCacheMaxSize(jVar.f77347k).setMockCertVerifier(0L).setEnableNetworkQualityEstimator(jVar.f77349m).setBypassPublicKeyPinningForLocalTrustAnchors(jVar.f77340d);
        int i13 = jVar.f77350n;
        if (i13 == 20) {
            i13 = 10;
        }
        RequestContextConfigOptions.Builder networkThreadPriority = bypassPublicKeyPinningForLocalTrustAnchors.setNetworkThreadPriority(i13);
        String str = jVar.f77341e;
        if (str != null) {
            networkThreadPriority.setUserAgent(str);
        }
        String str2 = jVar.f77342f;
        if (str2 != null) {
            networkThreadPriority.setStoragePath(str2);
        }
        if (jVar.a() != null) {
            networkThreadPriority.setQuicDefaultUserAgentId(jVar.a());
        }
        String str3 = jVar.f77348l;
        if (str3 != null) {
            networkThreadPriority.setExperimentalOptions(str3);
        }
        long MB3ntV7V = N.MB3ntV7V(((RequestContextConfigOptions) networkThreadPriority.m101build()).toByteArray());
        if (MB3ntV7V == 0) {
            throw new IllegalArgumentException("Experimental options parsing failed.");
        }
        for (i iVar : jVar.f77338b) {
            new f().o(MB3ntV7V, iVar.f77332a, iVar.f77333b, iVar.f77334c);
        }
        for (h hVar : jVar.f77339c) {
            new f().n(MB3ntV7V, hVar.f77327a, hVar.f77328b, hVar.f77329c, hVar.f77330d.getTime());
        }
        return MB3ntV7V;
    }

    public static k c() {
        ClassLoader classLoader = CronetUrlRequest.class.getClassLoader();
        return classLoader.toString().startsWith("java.lang.BootClassLoader") ? k.CRONET_SOURCE_PLATFORM : CronetEngine.class.getClassLoader().equals(classLoader) ? k.CRONET_SOURCE_STATICALLY_LINKED : k.CRONET_SOURCE_PLAY_SERVICES;
    }

    public static void d(Executor executor, Runnable runnable, w wVar) {
        if (wVar != null) {
            wVar.b();
        }
        try {
            executor.execute(new qg2.f(11, runnable, wVar));
        } catch (RejectedExecutionException e13) {
            if (wVar != null) {
                wVar.a();
            }
            Log.e("cr_CronetUrlRequestContext", "Exception posting task to executor", e13);
        }
    }

    public final void a() {
        if (this.f97419e == 0) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.f97423i) {
            this.f97430p.put(listener, new h0(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            try {
                if (this.f97428n.isEmpty()) {
                    synchronized (this.f97415a) {
                        a();
                        N.MpnFLFF2(this.f97419e, this, true);
                    }
                }
                this.f97428n.b(new f0(networkQualityRttListener));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            try {
                if (this.f97429o.isEmpty()) {
                    synchronized (this.f97415a) {
                        a();
                        N.MnPUhNKP(this.f97419e, this, true);
                    }
                }
                this.f97429o.b(new g0(networkQualityThroughputListener));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j13) {
        this.f97435u = j13;
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z13, boolean z14, boolean z15) {
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97415a) {
            a();
            N.M6sIJDgy_ForTesting(this.f97419e, this, z13, z14, z15);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new kp2.i(this);
    }

    public final void e(x xVar, w wVar) {
        synchronized (this.f97423i) {
            try {
                if (this.f97430p.isEmpty()) {
                    return;
                }
                Iterator it = new ArrayList(this.f97430p.values()).iterator();
                while (it.hasNext()) {
                    h0 h0Var = (h0) it.next();
                    d(h0Var.f77331a.getExecutor(), new s(this, h0Var, xVar), wVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.f97418d.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        int i13;
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            i13 = this.f97427m;
            if (i13 == -1) {
                i13 = -1;
            }
        }
        return i13;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        int i13;
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            int i14 = this.f97424j;
            if (i14 != 0) {
                i13 = 1;
                if (i14 != 1) {
                    i13 = 2;
                    if (i14 != 2) {
                        i13 = 3;
                        if (i14 != 3) {
                            i13 = 4;
                            if (i14 != 4) {
                                i13 = 5;
                                if (i14 != 5) {
                                    throw new RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i14);
                                }
                            }
                        }
                    }
                }
            } else {
                i13 = 0;
            }
        }
        return i13;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return N.M7CZ_Klr();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        int i13;
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            i13 = this.f97425k;
            if (i13 == -1) {
                i13 = -1;
            }
        }
        return i13;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        int i13;
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            i13 = this.f97426l;
            if (i13 == -1) {
                i13 = -1;
            }
        }
        return i13;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "Cronet/119.0.6045.31@c76b9b6a";
    }

    @CalledByNative
    public final void initNetworkThread() {
        this.f97420f = Thread.currentThread();
        this.f97416b.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new a(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new z(str, callback, executor, this);
    }

    @CalledByNative
    public final void onEffectiveConnectionTypeChanged(int i13) {
        synchronized (this.f97422h) {
            this.f97424j = i13;
        }
    }

    @CalledByNative
    public final void onRTTOrThroughputEstimatesComputed(int i13, int i14, int i15) {
        synchronized (this.f97422h) {
            this.f97425k = i13;
            this.f97426l = i14;
            this.f97427m = i15;
        }
    }

    @CalledByNative
    public final void onRttObservation(int i13, long j13, int i14) {
        synchronized (this.f97422h) {
            try {
                Iterator it = this.f97428n.iterator();
                while (true) {
                    dp2.f fVar = (dp2.f) it;
                    if (fVar.hasNext()) {
                        f0 f0Var = (f0) fVar.next();
                        d(f0Var.getExecutor(), new r(f0Var, i13, j13, i14, 0), null);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @CalledByNative
    public final void onThroughputObservation(int i13, long j13, int i14) {
        synchronized (this.f97422h) {
            try {
                Iterator it = this.f97429o.iterator();
                while (true) {
                    dp2.f fVar = (dp2.f) it;
                    if (fVar.hasNext()) {
                        g0 g0Var = (g0) fVar.next();
                        d(g0Var.getExecutor(), new r(g0Var, i13, j13, i14, 1), null);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.f97423i) {
            this.f97430p.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            try {
                if (this.f97428n.d(new f0(networkQualityRttListener)) && this.f97428n.isEmpty()) {
                    synchronized (this.f97415a) {
                        a();
                        N.MpnFLFF2(this.f97419e, this, false);
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.f97421g) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f97422h) {
            try {
                if (this.f97429o.d(new g0(networkQualityThroughputListener)) && this.f97429o.isEmpty()) {
                    synchronized (this.f97415a) {
                        a();
                        N.MnPUhNKP(this.f97419e, this, false);
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        if (this.f97432r != null) {
            HashSet hashSet = f97414w;
            synchronized (hashSet) {
                hashSet.remove(this.f97432r);
            }
        }
        synchronized (this.f97415a) {
            a();
            if (this.f97417c.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with running requests.");
            }
            if (Thread.currentThread() == this.f97420f) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.f97416b.block();
        stopNetLog();
        synchronized (this.f97415a) {
            try {
                long j13 = this.f97419e;
                if (j13 != 0) {
                    N.MeBvNXm5(j13, this);
                    this.f97419e = 0L;
                }
            } finally {
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z13, int i13) {
        synchronized (this.f97415a) {
            try {
                a();
                if (this.f97433s) {
                    return;
                }
                N.MTULt02u(this.f97419e, this, str, z13, i13);
                this.f97433s = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z13) {
        synchronized (this.f97415a) {
            try {
                a();
                if (this.f97433s) {
                    return;
                }
                if (!N.MgwJQAH1(this.f97419e, this, str, z13)) {
                    throw new RuntimeException("Unable to start NetLog");
                }
                this.f97433s = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        synchronized (this.f97415a) {
            a();
            if (this.f97433s && !this.f97434t) {
                N.MKFm_qQ7(this.f97419e, this);
                this.f97434t = true;
                this.f97431q.block();
                this.f97431q.close();
                synchronized (this.f97415a) {
                    this.f97434t = false;
                    this.f97433s = false;
                }
            }
        }
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        this.f97431q.open();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new a(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new kp2.e(url, this);
        }
        throw new UnsupportedOperationException(a.a.j("Unexpected protocol:", protocol));
    }
}
