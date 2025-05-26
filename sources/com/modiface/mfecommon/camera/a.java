package com.modiface.mfecommon.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.d;
import com.modiface.mfecommon.camera.h;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfecommon.utils.MFEGLUtil;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.MFENativeError;
import com.modiface.mfecommon.utils.MFESharedGLTexture;
import com.modiface.mfecommon.utils.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class a implements p.c, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: o */
    private static final String f34159o = "MFEAndroidCamera";

    /* renamed from: p */
    private static final int f34160p = 11;

    /* renamed from: q */
    private static final int f34161q = 12;

    /* renamed from: r */
    private static final int f34162r = 13;

    /* renamed from: s */
    @NonNull
    private static WeakReference<a> f34163s = new WeakReference<>(null);

    /* renamed from: t */
    private static long f34164t = 0;

    /* renamed from: u */
    private static final Object f34165u = new Object();

    /* renamed from: a */
    private WeakReference<MFEAndroidCameraErrorCallback> f34166a;

    /* renamed from: b */
    private WeakReference<MFEAndroidCameraParametersCallback> f34167b;

    /* renamed from: c */
    private final List<WeakReference<f>> f34168c;

    /* renamed from: d */
    private MFEDebugInfo f34169d;

    /* renamed from: e */
    private final com.modiface.mfecommon.utils.n f34170e;

    /* renamed from: f */
    private AtomicBoolean f34171f;

    /* renamed from: g */
    private boolean f34172g;

    /* renamed from: h */
    private MFEAndroidCameraParameters f34173h;

    /* renamed from: i */
    private MFEGLFramebuffer f34174i;

    /* renamed from: j */
    @NonNull
    private final r f34175j;

    /* renamed from: k */
    private final com.modiface.mfecommon.utils.i f34176k;

    /* renamed from: l */
    private final com.modiface.mfecommon.mfea.d f34177l;

    /* renamed from: m */
    private boolean f34178m;

    /* renamed from: n */
    private com.modiface.mfecommon.camera.h f34179n;

    public interface f {
        void a(@NonNull MFEImage mFEImage);

        void onProcessCameraFrameErrors(@NonNull ArrayList<Throwable> arrayList);
    }

    public interface h {
        void a(Bitmap bitmap, Throwable th3);

        void a(Camera.Parameters parameters);
    }

    public /* synthetic */ a(r rVar, d dVar) {
        this(rVar);
    }

    private void i() {
        ArrayList arrayList;
        if (this.f34171f.get() || this.f34179n.a() == h.e.stop) {
            return;
        }
        com.modiface.mfecommon.utils.q qVar = new com.modiface.mfecommon.utils.q();
        d.f b13 = this.f34175j.b();
        if (b13 == null || !b13.a()) {
            return;
        }
        if (!this.f34177l.f()) {
            this.f34177l.d();
        }
        if (this.f34177l.f()) {
            float min = Math.min(MFEGLFramebuffer.getMaxTextureSize() / Math.max(b13.f34206b, b13.f34207c), 1.0f);
            this.f34176k.a((int) Math.floor(b13.f34206b * min), (int) Math.floor(b13.f34207c * min));
            synchronized (this.f34168c) {
                arrayList = new ArrayList(this.f34168c);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            MFEImage a13 = this.f34176k.a();
            MFESharedGLTexture texture = a13.getTexture();
            Bitmap bitmap = a13.getBitmap();
            texture.waitForGLFences();
            if (texture.isDeleted()) {
                texture.init(bitmap);
            }
            float[] fArr = new float[8];
            float[] fArr2 = MFEGLUtil.untransformedTextureCoordinates;
            Matrix matrix = new Matrix();
            matrix.postConcat(b13.f34208d);
            matrix.mapPoints(fArr, MFEGLUtil.untransformedVertices);
            MFENativeError mFENativeError = new MFENativeError();
            this.f34177l.c(b13.f34205a, fArr, fArr2, texture.getTextureId(), bitmap, mFENativeError.getNativeState());
            Throwable nativeError = mFENativeError.getNativeError();
            if (nativeError != null) {
                ArrayList<Throwable> arrayList2 = new ArrayList<>();
                arrayList2.add(nativeError);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar != null) {
                        fVar.onProcessCameraFrameErrors(arrayList2);
                    }
                }
                a13.close();
                return;
            }
            this.f34169d.addDetailedDebugInfo("camera update texture time (ms)", qVar.d());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                if (this.f34171f.get() || this.f34179n.a() == h.e.stop) {
                    break;
                }
                f fVar2 = (f) weakReference.get();
                if (fVar2 != null) {
                    fVar2.a(a13);
                }
            }
            a13.close();
        }
    }

    public void finalize() {
        if (d()) {
            Log.e("ModiFace", "MFEAndroidCamera close() is called in finalize. close() should be explicitly called.");
        }
        super.finalize();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.modiface.mfecommon.utils.p.c
    public boolean handleMessage(Message message) {
        MFEAndroidCameraErrorCallback mFEAndroidCameraErrorCallback;
        switch (message.what) {
            case 11:
                if (!this.f34171f.get()) {
                    MFEAndroidCameraParameters mFEAndroidCameraParameters = (MFEAndroidCameraParameters) message.obj;
                    if (mFEAndroidCameraParameters == null) {
                        mFEAndroidCameraParameters = new MFEAndroidCameraParameters();
                    }
                    d.b bVar = new d.b();
                    bVar.f34196a = mFEAndroidCameraParameters;
                    bVar.f34197b = this;
                    bVar.f34199d = this.f34170e.d();
                    bVar.f34198c = this.f34167b.get();
                    d.c a13 = this.f34175j.a(bVar);
                    if (!a13.f34200a && (mFEAndroidCameraErrorCallback = this.f34166a.get()) != null) {
                        mFEAndroidCameraErrorCallback.onCameraFailedToStart(a13.f34201b, a13.f34202c);
                    }
                    return true;
                }
                return false;
            case 12:
                if (!this.f34171f.get()) {
                    i();
                    return true;
                }
                return false;
            case 13:
                Object obj = message.obj;
                if (obj != null) {
                    h hVar = (h) obj;
                    if (!this.f34171f.get()) {
                        d.e a14 = this.f34175j.a(message.arg1 == 1, new o(this, hVar));
                        if (!a14.f34203a) {
                            hVar.a(null, a14.f34204b);
                        }
                        return true;
                    }
                    hVar.a(null, new IllegalStateException("failed to take picture because app is paused"));
                } else if (!this.f34171f.get()) {
                    this.f34175j.c();
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Handler b13;
        if (this.f34171f.get() || (b13 = this.f34170e.b()) == null || b13.hasMessages(12)) {
            return;
        }
        b13.sendEmptyMessage(12);
    }

    private a(@NonNull r rVar) {
        this.f34166a = new WeakReference<>(null);
        this.f34167b = new WeakReference<>(null);
        this.f34168c = Collections.synchronizedList(new ArrayList());
        this.f34169d = new MFEDebugInfo("Camera");
        com.modiface.mfecommon.utils.n nVar = new com.modiface.mfecommon.utils.n("MFEAndroidCameraThread");
        this.f34170e = nVar;
        this.f34171f = new AtomicBoolean(false);
        this.f34172g = false;
        this.f34173h = new MFEAndroidCameraParameters();
        this.f34174i = null;
        this.f34176k = new com.modiface.mfecommon.utils.i();
        this.f34177l = new com.modiface.mfecommon.mfea.d();
        this.f34178m = false;
        this.f34175j = rVar;
        nVar.a(this);
        this.f34179n = new com.modiface.mfecommon.camera.h(new d(this));
    }

    public static /* synthetic */ long c(long j13) {
        long j14 = f34164t - j13;
        f34164t = j14;
        return j14;
    }

    public synchronized boolean d() {
        if (this.f34178m) {
            return false;
        }
        this.f34178m = true;
        f();
        this.f34179n.d();
        try {
            this.f34179n.a(Long.MAX_VALUE, TimeUnit.DAYS);
            this.f34170e.a();
            this.f34175j.close();
            return true;
        } catch (InterruptedException e13) {
            throw new RuntimeException(e13);
        }
    }

    private void g() {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call stopCamera() of MFEAndroidCamera in UI thread");
        }
        this.f34172g = false;
        this.f34179n.f();
    }

    public void h() {
        AtomicReference atomicReference = new AtomicReference(null);
        this.f34170e.a((Runnable) new l(this, atomicReference), true);
        this.f34170e.b(com.modiface.mfecommon.utils.h.f34316b);
        this.f34175j.a();
        this.f34170e.b((Runnable) new m(this, atomicReference), true);
    }

    public MFEDebugInfo e() {
        return this.f34169d;
    }

    public void f() {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call onPause() of MFEAndroidCamera in UI thread");
        }
        if (this.f34171f.get()) {
            return;
        }
        this.f34171f.set(true);
        this.f34179n.b(new k(this));
    }

    public static /* synthetic */ long b(long j13) {
        long j14 = f34164t + j13;
        f34164t = j14;
        return j14;
    }

    public void b(Context context) {
        if (com.modiface.mfecommon.utils.h.a()) {
            if (this.f34171f.get()) {
                this.f34179n.g();
                this.f34170e.b((EGLContext) null);
                this.f34171f.set(false);
                if (this.f34172g) {
                    d(context);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("must call onResume() of MFEAndroidCamera in UI thread");
    }

    public void c(Context context) {
        if (com.modiface.mfecommon.utils.h.a()) {
            if (this.f34172g) {
                g();
                d(context);
                return;
            }
            return;
        }
        throw new IllegalStateException("must call restartCamera() of MFEAndroidCamera in UI thread");
    }

    public void a(MFEAndroidCameraParametersCallback mFEAndroidCameraParametersCallback) {
        if (com.modiface.mfecommon.utils.h.a()) {
            this.f34167b = new WeakReference<>(mFEAndroidCameraParametersCallback);
            return;
        }
        throw new IllegalStateException("must call setParametersCallback() of MFEAndroidCamera on the UI thread");
    }

    public static class g {

        /* renamed from: a */
        private a f34180a;

        public g(@NonNull Context context, @NonNull e eVar) {
            synchronized (a.f34165u) {
                try {
                    a aVar = (a) a.f34163s.get();
                    this.f34180a = aVar;
                    if (aVar == null) {
                        this.f34180a = new a(eVar.a(context), null);
                        WeakReference unused = a.f34163s = new WeakReference(this.f34180a);
                        long unused2 = a.f34164t = 0L;
                    }
                    this.f34180a.a(context);
                    a.b(1L);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public a a() {
            return this.f34180a;
        }

        public synchronized void b() {
            if (this.f34180a == null) {
                return;
            }
            synchronized (a.f34165u) {
                try {
                    a.c(1L);
                    long unused = a.f34164t = Math.max(0L, a.f34164t);
                    if (a.f34164t == 0) {
                        if (!this.f34180a.d()) {
                            Log.e("ModiFace", "MFEAndroidCamera already closed when singleton reference release calls close().");
                        }
                        WeakReference unused2 = a.f34163s = new WeakReference(null);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f34180a = null;
        }

        public g(@NonNull Context context) {
            this(context, new p());
        }
    }

    public void a(MFEAndroidCameraErrorCallback mFEAndroidCameraErrorCallback) {
        if (com.modiface.mfecommon.utils.h.a()) {
            this.f34166a = new WeakReference<>(mFEAndroidCameraErrorCallback);
            return;
        }
        throw new IllegalStateException("must call setErrorCallback() of MFEAndroidCamera on the UI thread");
    }

    private void d(Context context) {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call startCamera() of MFEAndroidCamera in UI thread");
        }
        if (context != null) {
            if (this.f34175j.d() && d5.a.a(context, "android.permission.CAMERA") != 0) {
                throw new IllegalStateException("camera permission not granted when calling startCamera() in MFEAndroidCamera");
            }
            this.f34172g = true;
            if (this.f34171f.get() || this.f34170e.b() == null) {
                return;
            }
            this.f34179n.e();
            return;
        }
        throw new IllegalArgumentException("context cannot be null when calling startCamera() in MFEAndroidCamera");
    }

    public void a(Context context, MFEAndroidCameraParameters mFEAndroidCameraParameters) {
        if (com.modiface.mfecommon.utils.h.a()) {
            if (mFEAndroidCameraParameters == null) {
                mFEAndroidCameraParameters = new MFEAndroidCameraParameters();
            }
            this.f34173h = mFEAndroidCameraParameters;
            if (this.f34172g) {
                c(context);
                return;
            }
            return;
        }
        throw new IllegalStateException("must call setCameraParameters() of MFEAndroidCamera in UI thread");
    }

    public void a(Context context, f fVar) {
        if (com.modiface.mfecommon.utils.h.a()) {
            synchronized (this.f34168c) {
                try {
                    Iterator<WeakReference<f>> it = this.f34168c.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == fVar) {
                            return;
                        }
                    }
                    this.f34168c.add(new WeakReference<>(fVar));
                    if (this.f34172g) {
                        return;
                    }
                    d(context);
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        throw new IllegalStateException("must call requestCameraFramesForCallback() of MFEAndroidCamera in UI thread");
    }

    public void a(f fVar) {
        boolean isEmpty;
        if (com.modiface.mfecommon.utils.h.a()) {
            synchronized (this.f34168c) {
                try {
                    ListIterator<WeakReference<f>> listIterator = this.f34168c.listIterator();
                    while (listIterator.hasNext()) {
                        if (listIterator.next().get() == fVar) {
                            listIterator.remove();
                        }
                    }
                    isEmpty = this.f34168c.isEmpty();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (isEmpty) {
                g();
                return;
            }
            return;
        }
        throw new IllegalStateException("must call stopCameraFramesForCallback() of MFEAndroidCamera in UI thread");
    }

    public void a(boolean z13, @NonNull h hVar) {
        if (com.modiface.mfecommon.utils.h.a()) {
            Handler b13 = this.f34170e.b();
            if (b13 != null) {
                if (!b13.hasMessages(13)) {
                    b13.sendMessage(Message.obtain(b13, 13, z13 ? 1 : 0, 0, hVar));
                    return;
                } else {
                    hVar.a(null, new IllegalStateException("failed to take picture because previous call to take picture has not been processed yet"));
                    return;
                }
            }
            hVar.a(null, new IllegalStateException("cannot take picture because initialization failed"));
            return;
        }
        throw new IllegalStateException("must call takePicture() of MFEAndroidCamera in UI thread");
    }

    public void a(Context context) {
        if (context != null) {
            this.f34175j.a(context);
            return;
        }
        throw new IllegalArgumentException("context cannot be null when calling onConfigurationChanged in MFEAndroidCamera");
    }
}
