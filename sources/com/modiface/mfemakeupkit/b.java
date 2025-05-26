package com.modiface.mfemakeupkit;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.a;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFEFaceTrackingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.facetracking.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes7.dex */
public class b implements a.f, a.s {

    /* renamed from: h, reason: collision with root package name */
    private static final String f34393h = "Camera";

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private static WeakReference<b> f34394i = new WeakReference<>(null);

    /* renamed from: j, reason: collision with root package name */
    private static long f34395j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final Object f34396k = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final a.q f34397a;

    /* renamed from: b, reason: collision with root package name */
    private final a.g f34398b;

    /* renamed from: c, reason: collision with root package name */
    private final com.modiface.mfecommon.utils.q f34399c;

    /* renamed from: d, reason: collision with root package name */
    private double f34400d;

    /* renamed from: e, reason: collision with root package name */
    private final MFEDebugInfo f34401e;

    /* renamed from: f, reason: collision with root package name */
    private final List<WeakReference<c>> f34402f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34403g;

    /* renamed from: com.modiface.mfemakeupkit.b$b, reason: collision with other inner class name */
    public static class C0002b {

        /* renamed from: a, reason: collision with root package name */
        private b f34404a;

        public C0002b(Context context, MFEMakeupEngine.Region region) {
            if (context == null) {
                throw new IllegalArgumentException("context cannot be null when getting singleton instance of MFEFaceTrackingSynchronizer");
            }
            if (region == null) {
                throw new IllegalArgumentException("region cannot be null when getting singleton instance of MFEFaceTrackingSynchronizer");
            }
            synchronized (b.f34396k) {
                try {
                    b bVar = (b) b.f34394i.get();
                    this.f34404a = bVar;
                    if (bVar == null) {
                        this.f34404a = new b(context, region);
                        WeakReference unused = b.f34394i = new WeakReference(this.f34404a);
                        long unused2 = b.f34395j = 0L;
                    }
                    b.b(1L);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public b a() {
            return this.f34404a;
        }

        public synchronized void b() {
            if (this.f34404a == null) {
                return;
            }
            synchronized (b.f34396k) {
                try {
                    b.c(1L);
                    long unused = b.f34395j = Math.max(0L, b.f34395j);
                    if (b.f34395j == 0) {
                        if (!this.f34404a.d()) {
                            Log.e("ModiFace", "MFEFaceTrackingSynchronizer already closed when singleton reference release calls close().");
                        }
                        WeakReference unused2 = b.f34394i = new WeakReference(null);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f34404a = null;
        }
    }

    public interface c {
        void onFaceTrackedOnCameraFrame(@NonNull MFETrackingData mFETrackingData);

        void onProcessCameraFrameErrors(@NonNull ArrayList<Throwable> arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean d() {
        if (this.f34403g) {
            return false;
        }
        this.f34398b.b();
        this.f34397a.b();
        this.f34403g = true;
        return true;
    }

    public MFEDebugInfo e() {
        return this.f34401e;
    }

    @Override // com.modiface.mfecommon.camera.a.f
    public void onProcessCameraFrameErrors(@NonNull ArrayList<Throwable> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator<WeakReference<c>> it = this.f34402f.iterator();
        while (it.hasNext()) {
            c cVar = it.next().get();
            if (cVar != null) {
                cVar.onProcessCameraFrameErrors(arrayList);
            }
        }
    }

    private b(Context context, MFEMakeupEngine.Region region) {
        this.f34399c = new com.modiface.mfecommon.utils.q();
        this.f34400d = 0.0d;
        MFEDebugInfo mFEDebugInfo = new MFEDebugInfo("MFEFaceTrackingSynchronizer");
        this.f34401e = mFEDebugInfo;
        this.f34402f = Collections.synchronizedList(new ArrayList());
        this.f34403g = false;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null when in constructor of MFEFaceTrackingSynchronizer");
        }
        if (region == null) {
            throw new IllegalArgumentException("region cannot be null when in constructor of MFEFaceTrackingSynchronizer");
        }
        a.g gVar = new a.g(context, com.modiface.mfecommon.camera.g.f34219a);
        this.f34398b = gVar;
        com.modiface.mfecommon.camera.a a13 = gVar.a();
        if (a13 != null) {
            mFEDebugInfo.addSubDebugInfo(a13.e());
        }
        this.f34397a = new a.q(context, region);
    }

    public static /* synthetic */ long b(long j13) {
        long j14 = f34395j + j13;
        f34395j = j14;
        return j14;
    }

    public static /* synthetic */ long c(long j13) {
        long j14 = f34395j - j13;
        f34395j = j14;
        return j14;
    }

    public void a(Context context, c cVar) {
        if (com.modiface.mfecommon.utils.h.a()) {
            com.modiface.mfecommon.camera.a a13 = this.f34398b.a();
            if (!this.f34403g && a13 != null) {
                synchronized (this.f34402f) {
                    try {
                        Iterator<WeakReference<c>> it = this.f34402f.iterator();
                        while (it.hasNext()) {
                            if (it.next().get() == cVar) {
                                return;
                            }
                        }
                        boolean isEmpty = this.f34402f.isEmpty();
                        this.f34402f.add(new WeakReference<>(cVar));
                        if (isEmpty) {
                            a13.a(context, this);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            throw new IllegalStateException("MFEFaceTrackingSynchronizer.close() has been called. This method cannot be called after close() is called");
        }
        throw new IllegalStateException("must call requestCameraFramesForCallback() of MFEFaceTrackingSynchronizer in UI thread");
    }

    public void a(c cVar) {
        boolean isEmpty;
        if (com.modiface.mfecommon.utils.h.a()) {
            com.modiface.mfecommon.camera.a a13 = this.f34398b.a();
            if (!this.f34403g && a13 != null) {
                synchronized (this.f34402f) {
                    try {
                        ListIterator<WeakReference<c>> listIterator = this.f34402f.listIterator();
                        while (listIterator.hasNext()) {
                            if (listIterator.next().get() == cVar) {
                                listIterator.remove();
                            }
                        }
                        isEmpty = this.f34402f.isEmpty();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (isEmpty) {
                    a13.a(this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("MFEFaceTrackingSynchronizer.close() has been called. This method cannot be called after close() is called");
        }
        throw new IllegalStateException("must call stopCameraFramesForCallback() of MFEFaceTrackingSynchronizer in UI thread");
    }

    @Override // com.modiface.mfecommon.camera.a.f
    public void a(@NonNull MFEImage mFEImage) {
        this.f34400d = (this.f34400d * 0.9d) + (this.f34399c.a() * 0.1d);
        this.f34399c.c();
        this.f34401e.addSimpleDebugInfo("camera fps", this.f34400d);
        MFEFaceTrackingParameters mFEFaceTrackingParameters = new MFEFaceTrackingParameters(320, false);
        com.modiface.mfemakeupkit.facetracking.a a13 = this.f34397a.a();
        if (a13 != null) {
            a13.a(mFEImage, mFEFaceTrackingParameters, this);
        }
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.s
    public void a(@NonNull MFETrackingData mFETrackingData) {
        ArrayList arrayList;
        c cVar;
        MFEImage image = mFETrackingData.getImage();
        synchronized (this.f34402f) {
            arrayList = new ArrayList(this.f34402f);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null && (cVar = (c) weakReference.get()) != null) {
                com.modiface.mfecommon.utils.q qVar = new com.modiface.mfecommon.utils.q();
                MFETrackingData mFETrackingData2 = new MFETrackingData(image.createCopy());
                mFETrackingData2.copyFacePointsFrom(mFETrackingData);
                mFETrackingData2.setHasFaceMask(mFETrackingData.getHasFaceMask());
                this.f34401e.addDetailedDebugInfo("tracking data copy time (ms)", qVar.d());
                cVar.onFaceTrackedOnCameraFrame(mFETrackingData2);
            }
        }
        image.close();
    }
}
