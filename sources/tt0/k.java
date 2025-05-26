package tt0;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.pinterest.feature.ideaPinCreation.camera.view.CenterCropCameraTextureView;
import java.io.File;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {
    public Surface A;

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f119138a;

    /* renamed from: b, reason: collision with root package name */
    public final CenterCropCameraTextureView f119139b;

    /* renamed from: c, reason: collision with root package name */
    public final lb0.r f119140c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f119141d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f119142e;

    /* renamed from: f, reason: collision with root package name */
    public ImageReader f119143f;

    /* renamed from: g, reason: collision with root package name */
    public CameraCaptureSession f119144g;

    /* renamed from: h, reason: collision with root package name */
    public m.h f119145h;

    /* renamed from: i, reason: collision with root package name */
    public final CameraManager f119146i;

    /* renamed from: j, reason: collision with root package name */
    public CameraDevice f119147j;

    /* renamed from: k, reason: collision with root package name */
    public String f119148k;

    /* renamed from: l, reason: collision with root package name */
    public final HandlerThread f119149l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f119150m;

    /* renamed from: n, reason: collision with root package name */
    public final ReentrantLock f119151n;

    /* renamed from: o, reason: collision with root package name */
    public final Condition f119152o;

    /* renamed from: p, reason: collision with root package name */
    public CaptureRequest.Builder f119153p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f119154q;

    /* renamed from: r, reason: collision with root package name */
    public float f119155r;

    /* renamed from: s, reason: collision with root package name */
    public Rect f119156s;

    /* renamed from: t, reason: collision with root package name */
    public File f119157t;

    /* renamed from: u, reason: collision with root package name */
    public Surface f119158u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f119159v;

    /* renamed from: w, reason: collision with root package name */
    public MediaRecorder f119160w;

    /* renamed from: x, reason: collision with root package name */
    public Size f119161x;

    /* renamed from: y, reason: collision with root package name */
    public Long f119162y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f119163z;

    public k(tb0.h crashReporting, CenterCropCameraTextureView previewView, lb0.r prefsManagerUser, u0 cameraInitialized, u0 cameraClosed) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(cameraInitialized, "cameraInitialized");
        Intrinsics.checkNotNullParameter(cameraClosed, "cameraClosed");
        this.f119138a = crashReporting;
        this.f119139b = previewView;
        this.f119140c = prefsManagerUser;
        this.f119141d = cameraInitialized;
        this.f119142e = cameraClosed;
        Object systemService = previewView.getContext().getSystemService("camera");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.f119146i = (CameraManager) systemService;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.f119149l = handlerThread;
        this.f119150m = new Handler(handlerThread.getLooper());
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f119151n = reentrantLock;
        this.f119152o = reentrantLock.newCondition();
        this.f119159v = xk2.m.b(j.f119126j);
        previewView.setSurfaceTextureListener(new b1.u(this, 2));
    }

    public final void a() {
        vb0.j.f125466a.R(Intrinsics.d(Thread.currentThread(), this.f119149l), "closeCamera must be called on camera thread", tb0.p.IDEA_PINS_CREATION, new Object[0]);
        this.f119142e.invoke();
        this.f119139b.post(new c(this, 1));
        try {
            CameraDevice cameraDevice = this.f119147j;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f119147j = null;
            }
            CameraCaptureSession cameraCaptureSession = this.f119144g;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f119144g = null;
            }
        } catch (Throwable th3) {
            Log.e("CameraController", "Error closing camera", th3);
            this.f119138a.q(th3, "Error closing Story Pin camera", tb0.p.IDEA_PINS_CREATION);
        }
    }

    public final MediaRecorder b(Surface surface, Size size, File file) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        CenterCropCameraTextureView centerCropCameraTextureView = this.f119139b;
        Context context = centerCropCameraTextureView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (pk.a0.G0(context, "android.permission.RECORD_AUDIO")) {
            mediaRecorder.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            mediaRecorder.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            mediaRecorder.setAudioChannels(camcorderProfile.audioChannels);
            mediaRecorder.setAudioSource(1);
        }
        mediaRecorder.setVideoSource(2);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setOutputFile(file.getAbsolutePath());
        mediaRecorder.setVideoEncodingBitRate(10000000);
        mediaRecorder.setVideoFrameRate(30);
        mediaRecorder.setVideoSize(size.getWidth(), size.getHeight());
        mediaRecorder.setVideoEncoder(2);
        Context context2 = centerCropCameraTextureView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (pk.a0.G0(context2, "android.permission.RECORD_AUDIO")) {
            mediaRecorder.setAudioEncoder(3);
        }
        mediaRecorder.setInputSurface(surface);
        return mediaRecorder;
    }

    public final CameraCharacteristics c(String str) {
        try {
            return this.f119146i.getCameraCharacteristics(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tt0.k.d():void");
    }

    public final boolean e() {
        CameraCharacteristics c13;
        Integer num;
        String str = this.f119148k;
        return (str == null || (c13 = c(str)) == null || (num = (Integer) c13.get(CameraCharacteristics.LENS_FACING)) == null || num.intValue() != 0) ? false : true;
    }

    public final void f(String str) {
        int[] iArr;
        String str2 = "logDebugCameraData: cameraId=" + str + ":recordSize=" + this.f119161x;
        tb0.h hVar = this.f119138a;
        hVar.h(str2);
        String[] cameraIdList = this.f119146i.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        for (String str3 : cameraIdList) {
            try {
                Intrinsics.f(str3);
                CameraCharacteristics c13 = c(str3);
                hVar.h("logDebugCameraData:id=" + str3 + ":facing=" + (c13 != null ? (Integer) c13.get(CameraCharacteristics.LENS_FACING) : null) + ":max_zoom=" + (c13 != null ? (Float) c13.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM) : null) + ":sensor_array=" + (c13 != null ? (Rect) c13.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) : null) + ":backwardsCompat=" + ((c13 == null || (iArr = (int[]) c13.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) == null) ? false : kotlin.collections.c0.w(iArr, 0)));
            } catch (Exception e13) {
                hVar.h("logDebugCameraData failed to retrieve camera characteristics for camera " + str3 + ": " + e13);
            }
        }
    }

    public final boolean g() {
        return this.f119139b.post(new c(this, 2));
    }

    public final void h(Function1 function1) {
        Long l13;
        if (!this.f119163z || function1 == null || (l13 = this.f119162y) == null) {
            return;
        }
        ((Handler) this.f119159v.getValue()).postDelayed(new l7.j(l13.longValue(), function1, this, 3), 16L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0006, B:8:0x000a, B:11:0x001c, B:13:0x0023, B:15:0x0054, B:16:0x0073, B:18:0x0078, B:20:0x007e, B:22:0x008c, B:24:0x0090, B:25:0x0099, B:27:0x009d, B:30:0x005a, B:32:0x006e, B:33:0x0018), top: B:5:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0006, B:8:0x000a, B:11:0x001c, B:13:0x0023, B:15:0x0054, B:16:0x0073, B:18:0x0078, B:20:0x007e, B:22:0x008c, B:24:0x0090, B:25:0x0099, B:27:0x009d, B:30:0x005a, B:32:0x006e, B:33:0x0018), top: B:5:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0006, B:8:0x000a, B:11:0x001c, B:13:0x0023, B:15:0x0054, B:16:0x0073, B:18:0x0078, B:20:0x007e, B:22:0x008c, B:24:0x0090, B:25:0x0099, B:27:0x009d, B:30:0x005a, B:32:0x006e, B:33:0x0018), top: B:5:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            android.hardware.camera2.CameraCaptureSession r0 = r8.f119144g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.hardware.camera2.CaptureRequest$Builder r2 = r8.f119153p     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L18
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.FLASH_MODE     // Catch: java.lang.Exception -> L15
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L15
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L15
            if (r2 != 0) goto L1c
            goto L18
        L15:
            r10 = move-exception
            goto La8
        L18:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L15
        L1c:
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L15
            r3 = 1
            if (r10 == 0) goto L5a
            android.hardware.camera2.CameraDevice r10 = r0.getDevice()     // Catch: java.lang.Exception -> L15
            r4 = 3
            android.hardware.camera2.CaptureRequest$Builder r10 = r10.createCaptureRequest(r4)     // Catch: java.lang.Exception -> L15
            android.view.Surface r4 = r8.f119158u     // Catch: java.lang.Exception -> L15
            kotlin.jvm.internal.Intrinsics.f(r4)     // Catch: java.lang.Exception -> L15
            r10.addTarget(r4)     // Catch: java.lang.Exception -> L15
            android.view.Surface r4 = r8.A     // Catch: java.lang.Exception -> L15
            kotlin.jvm.internal.Intrinsics.f(r4)     // Catch: java.lang.Exception -> L15
            r10.addTarget(r4)     // Catch: java.lang.Exception -> L15
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch: java.lang.Exception -> L15
            android.util.Range r5 = new android.util.Range     // Catch: java.lang.Exception -> L15
            r6 = 30
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L15
            r5.<init>(r7, r6)     // Catch: java.lang.Exception -> L15
            r10.set(r4, r5)     // Catch: java.lang.Exception -> L15
            android.graphics.Rect r4 = r8.f119156s     // Catch: java.lang.Exception -> L15
            if (r4 == 0) goto L73
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION     // Catch: java.lang.Exception -> L15
            r10.set(r5, r4)     // Catch: java.lang.Exception -> L15
            goto L73
        L5a:
            android.hardware.camera2.CameraDevice r10 = r0.getDevice()     // Catch: java.lang.Exception -> L15
            android.hardware.camera2.CaptureRequest$Builder r10 = r10.createCaptureRequest(r3)     // Catch: java.lang.Exception -> L15
            android.view.Surface r4 = r8.f119158u     // Catch: java.lang.Exception -> L15
            kotlin.jvm.internal.Intrinsics.f(r4)     // Catch: java.lang.Exception -> L15
            r10.addTarget(r4)     // Catch: java.lang.Exception -> L15
            android.graphics.Rect r4 = r8.f119156s     // Catch: java.lang.Exception -> L15
            if (r4 == 0) goto L73
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION     // Catch: java.lang.Exception -> L15
            r10.set(r5, r4)     // Catch: java.lang.Exception -> L15
        L73:
            r8.f119153p = r10     // Catch: java.lang.Exception -> L15
            r10 = 2
            if (r2 != r10) goto L99
            android.hardware.camera2.CameraCharacteristics r2 = r8.c(r9)     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L99
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE     // Catch: java.lang.Exception -> L15
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L15
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L15
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r4)     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L99
            android.hardware.camera2.CaptureRequest$Builder r2 = r8.f119153p     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L99
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE     // Catch: java.lang.Exception -> L15
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L15
            r2.set(r4, r10)     // Catch: java.lang.Exception -> L15
        L99:
            android.hardware.camera2.CaptureRequest$Builder r10 = r8.f119153p     // Catch: java.lang.Exception -> L15
            if (r10 == 0) goto La7
            android.hardware.camera2.CaptureRequest r10 = r10.build()     // Catch: java.lang.Exception -> L15
            android.os.Handler r2 = r8.f119150m     // Catch: java.lang.Exception -> L15
            r4 = 0
            r0.setRepeatingRequest(r10, r4, r2)     // Catch: java.lang.Exception -> L15
        La7:
            return r3
        La8:
            r8.f(r9)
            java.lang.String r9 = "setRepeatingRequest failure"
            tb0.p r0 = tb0.p.IDEA_PINS_CREATION
            tb0.h r2 = r8.f119138a
            r2.q(r10, r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tt0.k.i(java.lang.String, boolean):boolean");
    }

    public final void j() {
        CameraCaptureSession cameraCaptureSession;
        CameraCharacteristics c13;
        CaptureRequest.Builder builder;
        String str = this.f119148k;
        if (str == null || (cameraCaptureSession = this.f119144g) == null || (c13 = c(str)) == null || !Intrinsics.d(c13.get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE) || (builder = this.f119153p) == null) {
            return;
        }
        builder.set(CaptureRequest.FLASH_MODE, 0);
        cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.f119150m);
    }

    public final void k() {
        CameraCaptureSession cameraCaptureSession;
        CameraCharacteristics c13;
        CaptureRequest.Builder builder;
        String str = this.f119148k;
        if (str == null || (cameraCaptureSession = this.f119144g) == null || (c13 = c(str)) == null || !Intrinsics.d(c13.get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE) || (builder = this.f119153p) == null) {
            return;
        }
        builder.set(CaptureRequest.FLASH_MODE, 2);
        cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.f119150m);
    }
}
