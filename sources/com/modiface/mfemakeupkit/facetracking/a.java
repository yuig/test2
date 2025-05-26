package com.modiface.mfemakeupkit.facetracking;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.p;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFEFaceTrackingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class a implements p.c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f34447l = "MFEFaceTrackingEngine";

    /* renamed from: m, reason: collision with root package name */
    private static final String f34448m = "MFEFaceTrackingThread";

    /* renamed from: n, reason: collision with root package name */
    private static final String f34449n = "MFE Face Tracking Engine";

    /* renamed from: o, reason: collision with root package name */
    private static final String f34450o = "Face Tracker Initialization";

    /* renamed from: p, reason: collision with root package name */
    private static final String f34451p = "Face Tracker Load Resources";

    /* renamed from: q, reason: collision with root package name */
    private static final String f34452q = "Face Tracking";

    /* renamed from: r, reason: collision with root package name */
    private static final String f34453r = "MFEFaceTrackerBundle";

    /* renamed from: s, reason: collision with root package name */
    private static final int f34454s = 17;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    private static WeakReference<a> f34455t = new WeakReference<>(null);

    /* renamed from: u, reason: collision with root package name */
    private static long f34456u = 0;

    /* renamed from: v, reason: collision with root package name */
    private static final Object f34457v = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final com.modiface.mfemakeupkit.mfea.b f34458a;

    /* renamed from: b, reason: collision with root package name */
    private final com.modiface.mfecommon.utils.p f34459b;

    /* renamed from: c, reason: collision with root package name */
    private final MFEDebugInfo f34460c;

    /* renamed from: d, reason: collision with root package name */
    private final com.modiface.mfecommon.utils.q f34461d;

    /* renamed from: e, reason: collision with root package name */
    private double f34462e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f34463f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34464g;

    /* renamed from: h, reason: collision with root package name */
    private final MFEMakeupEngine.Region f34465h;

    /* renamed from: i, reason: collision with root package name */
    private String f34466i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34467j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<com.modiface.mfemakeupkit.facetracking.n> f34468k;

    public interface m {
        void a();
    }

    public interface n {
        void a();
    }

    public interface p {
        void a();
    }

    public static class q {

        /* renamed from: a, reason: collision with root package name */
        private a f34469a;

        public q(Context context, @NonNull MFEMakeupEngine.Region region) {
            if (context == null) {
                throw new IllegalArgumentException("context cannot be null when getting singleton instance of MFEFaceTrackingEngine");
            }
            synchronized (a.f34457v) {
                try {
                    a aVar = (a) a.f34455t.get();
                    this.f34469a = aVar;
                    if (aVar == null) {
                        this.f34469a = new a(context, region, null);
                        WeakReference unused = a.f34455t = new WeakReference(this.f34469a);
                        long unused2 = a.f34456u = 0L;
                    }
                    a.b(1L);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public a a() {
            return this.f34469a;
        }

        public synchronized void b() {
            if (this.f34469a == null) {
                return;
            }
            synchronized (a.f34457v) {
                try {
                    a.c(1L);
                    long unused = a.f34456u = Math.max(0L, a.f34456u);
                    if (a.f34456u == 0) {
                        if (!this.f34469a.d()) {
                            Log.e("ModiFace", "MFEFaceTrackingEngine already closed when singleton reference release calls close().");
                        }
                        WeakReference unused2 = a.f34455t = new WeakReference(null);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f34469a = null;
        }
    }

    public interface r {
        void a(@NonNull MFETrackingData mFETrackingData);
    }

    public interface s {
        void a(@NonNull MFETrackingData mFETrackingData);
    }

    public /* synthetic */ a(Context context, MFEMakeupEngine.Region region, e eVar) {
        this(context, region);
    }

    public void finalize() {
        if (d()) {
            Log.e("ModiFace", "MFEFaceTrackingEngine close() is called in finalize. close() should be explicitly called.");
        }
        super.finalize();
    }

    @Override // com.modiface.mfecommon.utils.p.c
    public boolean handleMessage(Message message) {
        MFEImage mFEImage;
        s sVar;
        MFEFaceTrackingParameters mFEFaceTrackingParameters;
        if (message.what != 17) {
            return false;
        }
        com.modiface.mfemakeupkit.facetracking.n andSet = this.f34468k.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        mFEImage = andSet.f34495a;
        MFETrackingData mFETrackingData = new MFETrackingData(mFEImage);
        if (!this.f34463f.get() && this.f34458a.g()) {
            MFEDebugInfo mFEDebugInfo = new MFEDebugInfo(f34452q);
            com.modiface.mfemakeupkit.mfea.b bVar = this.f34458a;
            mFEFaceTrackingParameters = andSet.f34496b;
            bVar.c(mFETrackingData, mFEFaceTrackingParameters, mFEDebugInfo);
            this.f34462e = (this.f34462e * 0.9d) + (this.f34461d.a() * 0.1d);
            this.f34461d.c();
            mFEDebugInfo.addSimpleDebugInfo("face tracking fps", this.f34462e);
            this.f34460c.addSubDebugInfo(mFEDebugInfo);
        }
        sVar = andSet.f34497c;
        sVar.a(mFETrackingData);
        return true;
    }

    private a(Context context, @NonNull MFEMakeupEngine.Region region) {
        this.f34458a = new com.modiface.mfemakeupkit.mfea.b();
        this.f34460c = new MFEDebugInfo(f34449n);
        this.f34461d = new com.modiface.mfecommon.utils.q();
        this.f34462e = 0.0d;
        this.f34463f = new AtomicBoolean(false);
        this.f34466i = null;
        this.f34467j = false;
        this.f34468k = new AtomicReference<>(null);
        if (context == null) {
            throw new IllegalArgumentException("cannot pass in null context to MFEFaceTrackingEngine constructor");
        }
        this.f34464g = context.getPackageName();
        this.f34465h = region;
        AssetManager assets = context.getAssets();
        com.modiface.mfecommon.utils.p pVar = new com.modiface.mfecommon.utils.p(f34448m);
        this.f34459b = pVar;
        pVar.a(new e(this, assets));
        pVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean d() {
        if (this.f34467j) {
            return false;
        }
        this.f34467j = true;
        this.f34459b.b(new j(this));
        this.f34459b.a();
        return true;
    }

    public MFEDebugInfo e() {
        return this.f34460c;
    }

    public int f() {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.f34459b.b(new b(this, atomicInteger));
        return atomicInteger.get();
    }

    public boolean g() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f34459b.b(new i(this, atomicBoolean), true);
        return atomicBoolean.get();
    }

    public void h() {
        if (this.f34463f.get()) {
            return;
        }
        this.f34463f.set(true);
        this.f34459b.b(new d(this));
    }

    public void i() {
        this.f34463f.set(false);
    }

    public static /* synthetic */ long b(long j13) {
        long j14 = f34456u + j13;
        f34456u = j14;
        return j14;
    }

    public static /* synthetic */ long c(long j13) {
        long j14 = f34456u - j13;
        f34456u = j14;
        return j14;
    }

    private void b(String str, p pVar) {
        if (this.f34459b.a(new f(this, str, pVar)) || pVar == null) {
            return;
        }
        pVar.a();
    }

    public void b(int i13) {
        this.f34459b.b(new k(this, i13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r3.length > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r3, com.modiface.mfemakeupkit.facetracking.a.p r4) {
        /*
            r2 = this;
            java.lang.String r0 = "MFEFaceTrackerBundle"
            if (r3 == 0) goto L28
            r1 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.io.IOException -> L13
            java.lang.String[] r3 = r3.list(r0)     // Catch: java.io.IOException -> L13
            if (r3 == 0) goto L13
            int r3 = r3.length     // Catch: java.io.IOException -> L13
            if (r3 <= 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L20
            java.lang.String r3 = ""
            r2.b(r3, r4)
            return
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "failed to obtain assets for face tracker"
            r3.<init>(r4)
            throw r3
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "cannot pass in null context to MFEFaceTrackingEngine constructor"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfemakeupkit.facetracking.a.a(android.content.Context, com.modiface.mfemakeupkit.facetracking.a$p):void");
    }

    public void a(String str, p pVar) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                String[] list = file.list();
                if (list != null && list.length > 0) {
                    b(str, pVar);
                    return;
                }
                throw new IllegalStateException("face tracker bundle must not be empty");
            }
            throw new IllegalStateException("path to face tracker bundle does not exist or is not a directory");
        }
        throw new IllegalArgumentException("path to face tracker bundle cannot be null");
    }

    public void a(m mVar) {
        if (this.f34459b.a(new g(this, mVar)) || mVar == null) {
            return;
        }
        mVar.a();
    }

    public void a(n nVar) {
        if (this.f34459b.a(new h(this, nVar), true) || nVar == null) {
            return;
        }
        nVar.a();
    }

    public void a(boolean z13) {
        this.f34459b.b(new l(this, z13));
    }

    public void a(int i13) {
        this.f34459b.b(new com.modiface.mfemakeupkit.facetracking.m(this, i13));
    }

    public void a(@NonNull MFEImage mFEImage, @NonNull MFEFaceTrackingParameters mFEFaceTrackingParameters, @NonNull r rVar) {
        Handler b13 = this.f34459b.b();
        if (b13 != null) {
            b13.removeMessages(17);
        }
        if (this.f34459b.a(new c(this, mFEImage, mFEFaceTrackingParameters, rVar))) {
            return;
        }
        rVar.a(new MFETrackingData(mFEImage));
    }

    public void a(@NonNull MFEImage mFEImage, @NonNull MFEFaceTrackingParameters mFEFaceTrackingParameters, @NonNull s sVar) {
        MFEImage mFEImage2;
        MFEImage mFEImage3;
        MFEImage createCopy = mFEImage.createCopy();
        if (this.f34463f.get()) {
            sVar.a(new MFETrackingData(createCopy));
            return;
        }
        com.modiface.mfemakeupkit.facetracking.n andSet = this.f34468k.getAndSet(new com.modiface.mfemakeupkit.facetracking.n(createCopy, mFEFaceTrackingParameters, sVar, null));
        if (andSet != null) {
            mFEImage3 = andSet.f34495a;
            mFEImage3.close();
        }
        Handler b13 = this.f34459b.b();
        if (b13 == null) {
            com.modiface.mfemakeupkit.facetracking.n andSet2 = this.f34468k.getAndSet(null);
            if (andSet2 != null) {
                mFEImage2 = andSet2.f34495a;
                mFEImage2.close();
                return;
            }
            return;
        }
        if (b13.hasMessages(17)) {
            return;
        }
        b13.sendEmptyMessage(17);
    }
}
