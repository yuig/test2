package com.modiface.mfemakeupkit;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.MFEAndroidCameraErrorCallback;
import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;
import com.modiface.mfecommon.camera.MFEAndroidCameraParametersCallback;
import com.modiface.mfecommon.camera.a;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfecommon.utils.MFEGLUtil;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.MFENativeError;
import com.modiface.mfecommon.utils.MFESharedGLTexture;
import com.modiface.mfecommon.utils.MFESharedGLTextureThread;
import com.modiface.mfemakeupkit.b;
import com.modiface.mfemakeupkit.data.MFEFaceTrackingParameters;
import com.modiface.mfemakeupkit.data.MFEFoundationMatchStatus;
import com.modiface.mfemakeupkit.data.MFEMakeupRenderingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.data.a;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;
import com.modiface.mfemakeupkit.effects.MFEMakeupTint;
import com.modiface.mfemakeupkit.facetracking.a;
import com.modiface.mfemakeupkit.rendering.a;
import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;
import com.modiface.mfemakeupkit.widgets.MFEMakeupView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class MFEMakeupEngine implements a.q, b.c, m0, a.b {
    private static final String TAG = "MFEMakeupEngine";
    private static final String kMFEMakeupEngineDebugInfoName = "MFE Makeup Engine";
    private WeakReference<v> mCallbackRef;
    private WeakReference<MFEMakeupEngineImageProcessedCallback> mCameraImageProcessedCallbackRef;
    private final a.g mCameraRef;
    private boolean mClosed;
    private final AtomicReference<g0> mCurrentInputState;
    private final MFEDebugInfo mDebugInfo;
    private boolean mDetectFaceMasks;
    private WeakReference<MFEMakeupEngineDetectionCallback> mDetectionCallbackRef;
    private AtomicBoolean mDrawBlankScreenWhenPaused;

    @NonNull
    private final a.c mEnginePosition;
    private WeakReference<MFEMakeupEngineErrorCallback> mErrorCallbackRef;

    @NonNull
    private MFEFoundationMatchStatus mFMStatus;
    private final Object mFMStatusLock;

    @NonNull
    private WeakReference<FoundationMatchStatusUpdateListener> mFMStatusUpdateListener;
    private final Object mFMStatusUpdateListenerLock;
    private WeakReference<MFEFaceMaskCallback> mFaceMaskCallbackRef;
    private boolean mFaceMaskHandlerNeedsUpdate;
    private final a.q mFaceTrackingEngineRef;
    private final b.C0002b mFaceTrackingSynchronizerRef;

    @NonNull
    private final com.modiface.mfemakeupkit.data.a mFrameSynchronizer;
    private boolean mHasFaceMask;
    private final CopyOnWriteArrayList<WeakReference<e>> mInternalUpdateCallbackRefs;
    private final boolean mIsGLES3Supported;
    private final AtomicBoolean mIsPaused;
    private final com.modiface.mfemakeupkit.rendering.a mMakeupRenderingEngine;
    private final CopyOnWriteArrayList<WeakReference<MFEMakeupView>> mMakeupViewRefs;
    private com.modiface.mfemakeupkit.utils.e mRenderTime;
    private MFEMakeupTint mTintEffect;
    private com.modiface.mfemakeupkit.video.e mVideoRecorder;
    public final Region serverRegion;

    public interface ApplyMakeupToPhotoCompletionHandler {
        void onMakeupAppliedToPhoto(Bitmap bitmap, Bitmap bitmap2, Throwable th3);
    }

    public interface CaptureOutputCompletionHandler {
        void onCapturedOutput(Bitmap bitmap, Bitmap bitmap2);
    }

    public enum ErrorSeverity {
        Fatal,
        Recoverable,
        Warning
    }

    public enum ErrorType {
        CaptureOutput,
        RenderInBackground,
        CameraFrameProcessing,
        Render,
        SurfaceSetup,
        SurfaceRender
    }

    public interface FaceTrackedOnPhotoCompletionHandler {
        void onFaceTrackedOnPhoto(Bitmap bitmap, MFETrackingData mFETrackingData);
    }

    public interface FoundationMatchStatusUpdateListener {
        void onUpdateFoundationMatchStatus(@NonNull MFEFoundationMatchStatus mFEFoundationMatchStatus);
    }

    public interface MFEFaceMaskCallback {
        void onFaceMaskStatusChanged(boolean z13);
    }

    public interface MFEMakeupEngineDetectionCallback {
        void onMFEMakeupFinishedDetection(MFETrackingData mFETrackingData);
    }

    public interface MFEMakeupEngineErrorCallback {
        void onMakeupEngineError(@NonNull ErrorSeverity errorSeverity, @NonNull ErrorType errorType, @NonNull ArrayList<Throwable> arrayList);
    }

    public interface MFEMakeupEngineImageProcessedCallback {
        void onMFEMakeupFinishedProcessingImage(MFETrackingData mFETrackingData);
    }

    public interface MFEMakeupEngineLoadResourcesCallback {
        void onMFEMakeupFinishedLoadResources();
    }

    public interface RecordVideoOutputCompletionHandler {
        void onVideoRecorded(File file, boolean z13, long j13, long j14, @NonNull List<MFEVideoRecordingError> list);
    }

    public enum Region {
        US,
        Europe,
        China
    }

    public interface RunningWithPictureCompletionHandler {
        void onRunningWithPictureDone(Bitmap bitmap, MFETrackingData mFETrackingData, Throwable th3);
    }

    public interface TakePictureCameraParametersCallback {
        void onTakePictureFromCameraSetCameraParameters(Camera.Parameters parameters);
    }

    public interface TakePictureFromCameraCompletionHandler {
        void onTakePictureFromCameraDone(Bitmap bitmap, Bitmap bitmap2, Throwable th3);
    }

    public interface v {
        void a(Bitmap bitmap, Bitmap bitmap2);
    }

    public interface w {
        void a();
    }

    public interface x {
        void a();
    }

    public static class y {

        /* renamed from: a, reason: collision with root package name */
        final z f34380a;

        /* renamed from: b, reason: collision with root package name */
        final MFEMakeupEngineDetectionCallback f34381b;

        /* renamed from: c, reason: collision with root package name */
        final MFEMakeupEngineImageProcessedCallback f34382c;

        public y(z zVar, MFEMakeupEngineDetectionCallback mFEMakeupEngineDetectionCallback, MFEMakeupEngineImageProcessedCallback mFEMakeupEngineImageProcessedCallback) {
            this.f34380a = zVar;
            this.f34381b = mFEMakeupEngineDetectionCallback;
            this.f34382c = mFEMakeupEngineImageProcessedCallback;
        }
    }

    public enum z {
        STATIC,
        LIVE
    }

    static {
        com.modiface.mfecommon.utils.k.a("MFEMakeupKit");
        MFENativeError.registerNatives();
        MFEGLFramebuffer.registerNatives();
        MFESharedGLTexture.registerNatives();
        MFESharedGLTextureThread.registerNatives();
        com.modiface.mfecommon.mfea.d.registerNatives();
    }

    public MFEMakeupEngine(Context context, Region region) {
        this(context, region, null);
    }

    private void callOnPauseOnMakeupViewsOnRenderThread() {
        MFEMakeupView mFEMakeupView;
        Iterator<WeakReference<MFEMakeupView>> it = this.mMakeupViewRefs.iterator();
        while (it.hasNext()) {
            WeakReference<MFEMakeupView> next = it.next();
            if (next != null && (mFEMakeupView = next.get()) != null) {
                if (this.mDrawBlankScreenWhenPaused.get()) {
                    mFEMakeupView.getMakeupSurface().a();
                }
                mFEMakeupView.getMakeupSurface().d();
            }
        }
    }

    private void callOnResumeOnMakeupViewsOnRenderThread() {
        MFEMakeupView mFEMakeupView;
        Iterator<WeakReference<MFEMakeupView>> it = this.mMakeupViewRefs.iterator();
        while (it.hasNext()) {
            WeakReference<MFEMakeupView> next = it.next();
            if (next != null && (mFEMakeupView = next.get()) != null) {
                mFEMakeupView.getMakeupSurface().e();
            }
        }
    }

    @NonNull
    public static p5.b createSynchronizedEngines(Context context, Region region, MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback) {
        MFEMakeupEngine mFEMakeupEngine = new MFEMakeupEngine(context, region, mFEMakeupEngineErrorCallback);
        return new p5.b(mFEMakeupEngine, new MFEMakeupEngine(context, region, mFEMakeupEngineErrorCallback, mFEMakeupEngine.mFrameSynchronizer));
    }

    public static String getVersion() {
        return a.f34391f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFaceTrackedOnImage(com.modiface.mfemakeupkit.utils.d dVar, boolean z13) {
        Object obj;
        if (dVar == null || (obj = dVar.f34673b) == null) {
            return;
        }
        MFEMakeupEngineDetectionCallback mFEMakeupEngineDetectionCallback = ((y) obj).f34381b;
        if (mFEMakeupEngineDetectionCallback != null) {
            mFEMakeupEngineDetectionCallback.onMFEMakeupFinishedDetection(dVar.f34672a);
        }
        if (this.mDetectFaceMasks) {
            boolean hasFaceMask = dVar.f34672a.getHasFaceMask();
            if (this.mFaceMaskHandlerNeedsUpdate || hasFaceMask != this.mHasFaceMask) {
                this.mHasFaceMask = hasFaceMask;
                MFEFaceMaskCallback mFEFaceMaskCallback = this.mFaceMaskCallbackRef.get();
                if (mFEFaceMaskCallback != null) {
                    mFEFaceMaskCallback.onFaceMaskStatusChanged(hasFaceMask);
                }
                this.mFaceMaskHandlerNeedsUpdate = false;
            }
        }
        this.mFrameSynchronizer.a(dVar, this.mEnginePosition, z13);
    }

    public void addInternalUpdateCallback(e eVar) {
        this.mInternalUpdateCallbackRefs.add(new WeakReference<>(eVar));
    }

    public void applyMakeupToPhotoInBackground(Bitmap bitmap, boolean z13, ApplyMakeupToPhotoCompletionHandler applyMakeupToPhotoCompletionHandler) {
        if (applyMakeupToPhotoCompletionHandler == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Invalid bitmap to apply makeup on");
        }
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(new MFEImage(bitmap), new MFEFaceTrackingParameters(z13 ? 320 : 0, true), new i(this, applyMakeupToPhotoCompletionHandler, bitmap));
    }

    @Override // com.modiface.mfemakeupkit.data.a.b
    public void applyRender(com.modiface.mfemakeupkit.utils.d dVar) {
        this.mMakeupRenderingEngine.a(dVar, this.mRenderTime.a());
    }

    public void attachMakeupView(MFEMakeupView mFEMakeupView) {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call addMakeupView() of MFEMakeupEngine in UI thread");
        }
        if (mFEMakeupView == null) {
            throw new IllegalArgumentException("makeup view must not be null when calling addMakeupView() of MFEMakeupEngine");
        }
        Iterator<WeakReference<MFEMakeupView>> it = this.mMakeupViewRefs.iterator();
        while (it.hasNext()) {
            WeakReference<MFEMakeupView> next = it.next();
            if (next != null && next.get() == mFEMakeupView) {
                return;
            }
        }
        mFEMakeupView.getMakeupSurface().a(this);
        this.mMakeupViewRefs.add(new WeakReference<>(mFEMakeupView));
    }

    public void captureOutputWithCompletionHandler(CaptureOutputCompletionHandler captureOutputCompletionHandler) {
        if (captureOutputCompletionHandler == null) {
            return;
        }
        this.mMakeupRenderingEngine.a(new f(this, captureOutputCompletionHandler), new g(this, captureOutputCompletionHandler));
    }

    public void clearMakeupLook() {
        this.mMakeupRenderingEngine.a();
    }

    public synchronized void close() {
        try {
            if (this.mClosed) {
                return;
            }
            this.mClosed = true;
            callOnPauseOnMakeupViewsOnRenderThread();
            this.mMakeupRenderingEngine.b(new u(this));
            this.mMakeupRenderingEngine.b();
            this.mCameraRef.b();
            this.mFaceTrackingEngineRef.b();
            b a13 = this.mFaceTrackingSynchronizerRef.a();
            if (a13 != null) {
                a13.a(this);
            }
            this.mFaceTrackingSynchronizerRef.b();
            this.mRenderTime.c();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void disableFaceTracking(w wVar) {
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(new b0(this, wVar));
    }

    @Override // com.modiface.mfemakeupkit.data.a.b
    public void displayRender() {
        MFEMakeupView mFEMakeupView;
        Iterator<WeakReference<MFEMakeupView>> it = this.mMakeupViewRefs.iterator();
        while (it.hasNext()) {
            WeakReference<MFEMakeupView> next = it.next();
            if (next != null && (mFEMakeupView = next.get()) != null) {
                mFEMakeupView.getMakeupSurface().h();
            }
        }
    }

    public void enableFaceTracking(x xVar) {
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(new com.modiface.mfemakeupkit.z(this, xVar));
    }

    public void finalize() {
        close();
        super.finalize();
    }

    public MFEDebugInfo getDebugInfo() {
        MFEDebugInfo newCopy = this.mDebugInfo.getNewCopy();
        b a13 = this.mFaceTrackingSynchronizerRef.a();
        if (a13 != null) {
            newCopy.addSubDebugInfo(a13.e());
        }
        com.modiface.mfemakeupkit.facetracking.a a14 = this.mFaceTrackingEngineRef.a();
        if (a14 != null) {
            newCopy.addSubDebugInfo(a14.e());
        }
        newCopy.addSubDebugInfo(this.mMakeupRenderingEngine.c());
        return newCopy;
    }

    public int getFaceTrackingMaxFaces() {
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        return a13.f();
    }

    public float getFoundationMatchThreshold() {
        return this.mMakeupRenderingEngine.d();
    }

    public MFEMakeupTint getTintEffect() {
        return this.mTintEffect;
    }

    public boolean isFaceTrackingEnabled() {
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        return a13.g();
    }

    public boolean isGLES3Supported() {
        return this.mIsGLES3Supported;
    }

    public void loadResources(Context context, MFEMakeupEngineLoadResourcesCallback mFEMakeupEngineLoadResourcesCallback) {
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(context, new com.modiface.mfemakeupkit.w(this, mFEMakeupEngineLoadResourcesCallback));
    }

    @Override // com.modiface.mfemakeupkit.rendering.a.q
    public void onApplyMakeupWithTrackingDataDone(boolean z13, @NonNull com.modiface.mfemakeupkit.utils.d dVar) {
        Object obj;
        MFEMakeupEngineImageProcessedCallback mFEMakeupEngineImageProcessedCallback;
        this.mFrameSynchronizer.a(z13, this.mEnginePosition);
        if (this.mIsPaused.get() || (obj = dVar.f34673b) == null || (mFEMakeupEngineImageProcessedCallback = ((y) obj).f34382c) == null) {
            return;
        }
        mFEMakeupEngineImageProcessedCallback.onMFEMakeupFinishedProcessingImage(dVar.f34672a);
    }

    public void onConfigurationChanged(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null when calling onConfigurationChanged() in MFEMakeupEngine");
        }
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (a13 != null) {
            a13.a(context);
        }
    }

    @Override // com.modiface.mfemakeupkit.b.c
    public void onFaceTrackedOnCameraFrame(@NonNull MFETrackingData mFETrackingData) {
        if (this.mIsPaused.get() || this.mCurrentInputState.get() != g0.CAMERA_LIVE_FEED) {
            mFETrackingData.getImage().close();
        } else {
            onFaceTrackedOnImage(new com.modiface.mfemakeupkit.utils.d(mFETrackingData, new y(z.LIVE, this.mDetectionCallbackRef.get(), this.mCameraImageProcessedCallbackRef.get())), true);
        }
    }

    @Override // com.modiface.mfemakeupkit.m0
    public void onMFEMakeupSurfaceRenderFrameError(c cVar, Throwable th3) {
        MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback = this.mErrorCallbackRef.get();
        if (mFEMakeupEngineErrorCallback != null) {
            mFEMakeupEngineErrorCallback.onMakeupEngineError(ErrorSeverity.Warning, ErrorType.SurfaceRender, new com.modiface.mfemakeupkit.v(this, th3));
        }
    }

    @Override // com.modiface.mfemakeupkit.m0
    public void onMFEMakeupSurfaceSetSurfaceError(c cVar, ArrayList<Throwable> arrayList) {
        MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback = this.mErrorCallbackRef.get();
        if (mFEMakeupEngineErrorCallback != null) {
            mFEMakeupEngineErrorCallback.onMakeupEngineError(ErrorSeverity.Recoverable, ErrorType.SurfaceSetup, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    @Override // com.modiface.mfemakeupkit.rendering.a.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMakeupApplied(boolean r21, java.util.ArrayList<java.lang.Throwable> r22, com.modiface.mfecommon.utils.MFEGLFramebuffer r23, com.modiface.mfecommon.utils.MFEGLFramebuffer r24, com.modiface.mfemakeupkit.data.MFETrackingData r25, @androidx.annotation.NonNull com.modiface.mfemakeupkit.data.MFEFoundationMatchStatus r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfemakeupkit.MFEMakeupEngine.onMakeupApplied(boolean, java.util.ArrayList, com.modiface.mfecommon.utils.MFEGLFramebuffer, com.modiface.mfecommon.utils.MFEGLFramebuffer, com.modiface.mfemakeupkit.data.MFETrackingData, com.modiface.mfemakeupkit.data.MFEFoundationMatchStatus, boolean):void");
    }

    public void onPause() {
        this.mIsPaused.set(true);
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (a13 != null) {
            a13.f();
        }
        callOnPauseOnMakeupViewsOnRenderThread();
        com.modiface.mfemakeupkit.facetracking.a a14 = this.mFaceTrackingEngineRef.a();
        if (a14 != null) {
            a14.h();
        }
        this.mMakeupRenderingEngine.a(new d0(this));
        MFESharedGLTextureThread.onPause();
    }

    @Override // com.modiface.mfemakeupkit.b.c
    public void onProcessCameraFrameErrors(@NonNull ArrayList<Throwable> arrayList) {
        MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback;
        if (arrayList.isEmpty() || (mFEMakeupEngineErrorCallback = this.mErrorCallbackRef.get()) == null) {
            return;
        }
        mFEMakeupEngineErrorCallback.onMakeupEngineError(ErrorSeverity.Warning, ErrorType.CameraFrameProcessing, arrayList);
    }

    @Override // com.modiface.mfemakeupkit.rendering.a.q
    public void onRenderingEngineErrors(@NonNull ArrayList<Throwable> arrayList) {
        MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback;
        if (arrayList.isEmpty() || (mFEMakeupEngineErrorCallback = this.mErrorCallbackRef.get()) == null) {
            return;
        }
        mFEMakeupEngineErrorCallback.onMakeupEngineError(ErrorSeverity.Warning, ErrorType.Render, arrayList);
    }

    public void onResume(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null when calling onResume() in MFEMakeupEngine");
        }
        MFESharedGLTextureThread.onResume();
        this.mMakeupRenderingEngine.b(this.mRenderTime.a());
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (a13 != null) {
            a13.i();
        }
        this.mMakeupRenderingEngine.b(new e0(this));
        callOnResumeOnMakeupViewsOnRenderThread();
        com.modiface.mfecommon.camera.a a14 = this.mCameraRef.a();
        if (a14 != null) {
            a14.b(context);
        }
        this.mIsPaused.set(false);
    }

    public void requestRender() {
        this.mMakeupRenderingEngine.c(this.mRenderTime.a());
    }

    @Override // com.modiface.mfemakeupkit.m0
    public void requestToRender(c cVar) {
        if (cVar == null) {
            return;
        }
        this.mMakeupRenderingEngine.a(new t(this, cVar));
    }

    public void restartCamera(Context context) {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call restartCamera() of MFEMakeupEngine in UI thread");
        }
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null when calling restartCamera() in MFEMakeupEngine");
        }
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.c(context);
    }

    public void setCallback(v vVar) {
        this.mCallbackRef = new WeakReference<>(vVar);
    }

    public void setCameraErrorCallback(MFEAndroidCameraErrorCallback mFEAndroidCameraErrorCallback) {
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(mFEAndroidCameraErrorCallback);
    }

    public void setCameraParameters(Context context, MFEAndroidCameraParameters mFEAndroidCameraParameters) {
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(context, mFEAndroidCameraParameters);
    }

    public void setCameraParametersCallback(MFEAndroidCameraParametersCallback mFEAndroidCameraParametersCallback) {
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(mFEAndroidCameraParametersCallback);
    }

    public void setDetectFaceMasks(boolean z13) {
        this.mDetectFaceMasks = z13;
        this.mFaceTrackingEngineRef.a().a(z13);
    }

    public void setDetectionCallbackForCameraFeed(MFEMakeupEngineDetectionCallback mFEMakeupEngineDetectionCallback) {
        this.mDetectionCallbackRef = new WeakReference<>(mFEMakeupEngineDetectionCallback);
    }

    public void setDrawBlankScreenWhenPaused(boolean z13) {
        this.mDrawBlankScreenWhenPaused.set(z13);
    }

    public void setErrorCallback(MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback) {
        this.mErrorCallbackRef = new WeakReference<>(mFEMakeupEngineErrorCallback);
    }

    public void setFaceMaskCallback(MFEFaceMaskCallback mFEFaceMaskCallback) {
        this.mFaceMaskCallbackRef = new WeakReference<>(mFEFaceMaskCallback);
    }

    public void setFaceMaskDetectionInterval(int i13) {
        this.mFaceTrackingEngineRef.a().a(i13);
    }

    public void setFaceTrackingMaxFaces(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("maxFaces must be a non-zero positive number");
        }
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.b(i13);
    }

    public void setFoundationMatchStatusUpdateListener(FoundationMatchStatusUpdateListener foundationMatchStatusUpdateListener) {
        synchronized (this.mFMStatusUpdateListenerLock) {
            this.mFMStatusUpdateListener = new WeakReference<>(foundationMatchStatusUpdateListener);
        }
        this.mMakeupRenderingEngine.b(new c0(this));
    }

    public void setFoundationMatchThreshold(float f13) {
        this.mMakeupRenderingEngine.d(f13);
    }

    public void setImageProcessedCallbackForCameraFeed(MFEMakeupEngineImageProcessedCallback mFEMakeupEngineImageProcessedCallback) {
        this.mCameraImageProcessedCallbackRef = new WeakReference<>(mFEMakeupEngineImageProcessedCallback);
    }

    public void setMFELiveMakeupAssetsPath(@NonNull String str) {
        this.mMakeupRenderingEngine.a(str);
    }

    public void setMakeupLook(MFEMakeupLook mFEMakeupLook) {
        this.mMakeupRenderingEngine.a(mFEMakeupLook, this.mRenderTime.a());
        this.mRenderTime.b();
    }

    public void setMakeupRenderingParameters(MFEMakeupRenderingParameters mFEMakeupRenderingParameters) {
        this.mMakeupRenderingEngine.a(mFEMakeupRenderingParameters);
    }

    public void setTintEffect(MFEMakeupTint mFEMakeupTint) {
        if (mFEMakeupTint.isValid()) {
            MFEMakeupTint mFEMakeupTint2 = new MFEMakeupTint(mFEMakeupTint);
            this.mTintEffect = mFEMakeupTint2;
            if (mFEMakeupTint.style != MFEMakeupTint.Style.Custom) {
                this.mMakeupRenderingEngine.a(mFEMakeupTint2.style);
            } else {
                this.mMakeupRenderingEngine.b(mFEMakeupTint2.lutImagePath);
            }
        }
    }

    public void startRecordingOutputToVideoFile(File file, boolean z13) {
        this.mMakeupRenderingEngine.b(new p(this, file, z13));
    }

    public void startRunningWithCamera(Context context) {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call startRunningWithCamera() of MFEMakeupEngine in UI thread");
        }
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null when calling startRunningWithCamera() in MFEMakeupEngine");
        }
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        this.mFaceMaskHandlerNeedsUpdate = true;
        this.mCurrentInputState.set(g0.CAMERA_LIVE_FEED);
        b a14 = this.mFaceTrackingSynchronizerRef.a();
        if (a14 != null) {
            a14.a(context, this);
        }
    }

    public void startRunningWithPhoto(Bitmap bitmap, boolean z13) {
        startRunningWithPhoto(bitmap, z13, null, null);
    }

    public void startRunningWithPictureFromCamera(boolean z13, TakePictureCameraParametersCallback takePictureCameraParametersCallback, boolean z14, RunningWithPictureCompletionHandler runningWithPictureCompletionHandler) {
        if (runningWithPictureCompletionHandler == null) {
            return;
        }
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call startRunningWithPictureFromCamera() of MFEMakeupEngine in UI thread");
        }
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (a13 == null) {
            runningWithPictureCompletionHandler.onRunningWithPictureDone(null, null, new IllegalStateException("failed to take picture because camera is not previously turned on or has failed to turn on"));
        } else {
            a13.a(z13, new o(this, takePictureCameraParametersCallback, runningWithPictureCompletionHandler, z14));
        }
    }

    public void stopRecording(RecordVideoOutputCompletionHandler recordVideoOutputCompletionHandler) {
        this.mMakeupRenderingEngine.a(new q(this, recordVideoOutputCompletionHandler), new s(this, recordVideoOutputCompletionHandler));
    }

    public void takePictureFromCameraWithCompletionHandler(boolean z13, TakePictureCameraParametersCallback takePictureCameraParametersCallback, TakePictureFromCameraCompletionHandler takePictureFromCameraCompletionHandler) {
        if (takePictureFromCameraCompletionHandler == null) {
            return;
        }
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call takePictureFromCameraWithCompletionHandler() of MFEMakeupEngine in UI thread");
        }
        com.modiface.mfecommon.camera.a a13 = this.mCameraRef.a();
        if (a13 == null) {
            takePictureFromCameraCompletionHandler.onTakePictureFromCameraDone(null, null, new IllegalStateException("failed to take picture because camera is not previously turned on or has failed to turn on"));
        } else {
            a13.a(z13, new l(this, takePictureCameraParametersCallback, takePictureFromCameraCompletionHandler));
        }
    }

    public void trackFaceOnPhotoInBackground(Bitmap bitmap, boolean z13, FaceTrackedOnPhotoCompletionHandler faceTrackedOnPhotoCompletionHandler) {
        if (faceTrackedOnPhotoCompletionHandler == null) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Invalid bitmap to apply makeup on");
        }
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        a13.a(new MFEImage(bitmap), new MFEFaceTrackingParameters(z13 ? 320 : 0, true), new j(this, faceTrackedOnPhotoCompletionHandler, bitmap));
    }

    public MFEMakeupEngine(Context context, Region region, MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback) {
        this(context, region, mFEMakeupEngineErrorCallback, new com.modiface.mfemakeupkit.data.a());
    }

    public void startRunningWithPhoto(Bitmap bitmap, boolean z13, MFEMakeupEngineDetectionCallback mFEMakeupEngineDetectionCallback, MFEMakeupEngineImageProcessedCallback mFEMakeupEngineImageProcessedCallback) {
        if (!com.modiface.mfecommon.utils.h.a()) {
            throw new IllegalStateException("must call startRunningWithPhoto() of MFEMakeupEngine in UI thread");
        }
        if (com.modiface.mfecommon.utils.h.a(bitmap)) {
            throw new IllegalArgumentException("Invalid bitmap to apply makeup on");
        }
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (this.mClosed || a13 == null) {
            throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
        }
        this.mCurrentInputState.set(g0.STATIC_IMAGE);
        b a14 = this.mFaceTrackingSynchronizerRef.a();
        if (a14 != null) {
            a14.a(this);
        }
        MFEFaceTrackingParameters mFEFaceTrackingParameters = new MFEFaceTrackingParameters(z13 ? 320 : 0, true);
        MFEImage mFEImage = new MFEImage(bitmap);
        this.mFaceMaskHandlerNeedsUpdate = true;
        a13.a(mFEImage, mFEFaceTrackingParameters, new f0(this, mFEMakeupEngineDetectionCallback, mFEMakeupEngineImageProcessedCallback));
    }

    private MFEMakeupEngine(Context context, Region region, MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback, @NonNull com.modiface.mfemakeupkit.data.a aVar) {
        this.mInternalUpdateCallbackRefs = new CopyOnWriteArrayList<>();
        this.mMakeupViewRefs = new CopyOnWriteArrayList<>();
        this.mDetectionCallbackRef = new WeakReference<>(null);
        this.mCameraImageProcessedCallbackRef = new WeakReference<>(null);
        this.mCallbackRef = new WeakReference<>(null);
        this.mFaceMaskCallbackRef = new WeakReference<>(null);
        this.mErrorCallbackRef = new WeakReference<>(null);
        this.mDebugInfo = new MFEDebugInfo(kMFEMakeupEngineDebugInfoName);
        this.mVideoRecorder = null;
        this.mIsPaused = new AtomicBoolean(false);
        this.mDrawBlankScreenWhenPaused = new AtomicBoolean(true);
        this.mCurrentInputState = new AtomicReference<>(g0.NONE);
        this.mClosed = false;
        this.mFaceMaskHandlerNeedsUpdate = false;
        this.mDetectFaceMasks = false;
        this.mHasFaceMask = false;
        this.mFMStatusUpdateListener = new WeakReference<>(null);
        this.mFMStatusUpdateListenerLock = new Object();
        this.mFMStatus = MFEFoundationMatchStatus.Unavailable;
        this.mFMStatusLock = new Object();
        this.mTintEffect = new MFEMakeupTint(MFEMakeupTint.Style.None);
        this.mRenderTime = new com.modiface.mfemakeupkit.utils.e();
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null when calling MFEMakeupEngine constructor");
        }
        if (region != null) {
            setErrorCallback(mFEMakeupEngineErrorCallback);
            this.mIsGLES3Supported = MFEGLUtil.isGLES3Supported(context);
            this.mFrameSynchronizer = aVar;
            this.serverRegion = region;
            this.mCameraRef = new a.g(context, com.modiface.mfecommon.camera.g.f34219a);
            this.mFaceTrackingEngineRef = new a.q(context, region);
            this.mFaceTrackingSynchronizerRef = new b.C0002b(context, region);
            com.modiface.mfemakeupkit.rendering.a aVar2 = new com.modiface.mfemakeupkit.rendering.a(context, region);
            this.mMakeupRenderingEngine = aVar2;
            aVar2.a(this);
            this.mEnginePosition = aVar.a(this);
            aVar2.a(new MFEMakeupRenderingParameters(false));
            this.mRenderTime.b();
            return;
        }
        throw new IllegalArgumentException("region cannot be null when calling MFEMakeupEngine constructor");
    }

    public void disableFaceTracking() {
        disableFaceTracking(null);
    }

    public void enableFaceTracking() {
        enableFaceTracking(null);
    }

    public void loadResources(String str, MFEMakeupEngineLoadResourcesCallback mFEMakeupEngineLoadResourcesCallback) {
        com.modiface.mfemakeupkit.facetracking.a a13 = this.mFaceTrackingEngineRef.a();
        if (!this.mClosed && a13 != null) {
            a13.a(str, new com.modiface.mfemakeupkit.x(this, mFEMakeupEngineLoadResourcesCallback));
            return;
        }
        throw new IllegalStateException("MFEMakeupEngine.close() has been called. This method cannot be called after close() is called");
    }
}
