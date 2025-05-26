package com.modiface.mfecommon.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;
import com.modiface.mfecommon.camera.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class f implements r {

    /* renamed from: a */
    private Camera f34209a;

    /* renamed from: b */
    private MFEAndroidCameraParameters f34210b;

    /* renamed from: c */
    private Camera.Size f34211c;

    /* renamed from: d */
    private Boolean f34212d;

    /* renamed from: e */
    private MFEAndroidCameraParameters.CameraRotation f34213e;

    /* renamed from: f */
    private SurfaceTexture f34214f;

    /* renamed from: g */
    private int f34215g;

    /* renamed from: h */
    private Long f34216h;

    /* renamed from: i */
    private final int f34217i;

    /* renamed from: j */
    private final AtomicReference<t> f34218j;

    public f(int i13) {
        this.f34209a = null;
        this.f34210b = new MFEAndroidCameraParameters();
        this.f34211c = null;
        this.f34212d = null;
        this.f34213e = MFEAndroidCameraParameters.CameraRotation.ROTATE_0;
        this.f34214f = null;
        this.f34215g = 0;
        this.f34216h = null;
        this.f34218j = new AtomicReference<>(new t(1080, 1920, RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, null));
        this.f34217i = i13;
    }

    @Override // com.modiface.mfecommon.camera.r
    @NonNull
    public d.c a(@NonNull d.b bVar) {
        Integer a13;
        Camera open;
        Camera.Parameters parameters;
        List<Integer> list;
        d.c cVar = new d.c();
        cVar.f34200a = false;
        String str = "set camera parameters";
        MFEAndroidCameraParameters mFEAndroidCameraParameters = bVar.f34196a;
        this.f34210b = mFEAndroidCameraParameters;
        try {
            a13 = c.a(mFEAndroidCameraParameters.isFrontCamera);
        } catch (Exception e13) {
            e = e13;
            str = "get camera id";
        }
        if (a13 == null) {
            StringBuilder sb3 = new StringBuilder("Failed to find ");
            sb3.append(this.f34210b.isFrontCamera ? "front" : "back");
            sb3.append(" camera id");
            cVar.f34201b = sb3.toString();
            return cVar;
        }
        try {
            open = Camera.open(a13.intValue());
            this.f34209a = open;
        } catch (Exception e14) {
            e = e14;
            str = "open camera";
        }
        if (open == null) {
            cVar.f34201b = "Failed to open camera with Camera.open()";
            return cVar;
        }
        try {
            Camera.Parameters parameters2 = open.getParameters();
            if (this.f34210b.shouldZoomIn && parameters2.isZoomSupported()) {
                try {
                    long round = Math.round(Math.max(1.0d, Math.min(1.4d, (((parameters2.getHorizontalViewAngle() - 50.0d) * 0.4d) / 20.0d) + 1.0d)) * 100.0d);
                    List<Integer> zoomRatios = parameters2.getZoomRatios();
                    if (round > 100 && zoomRatios != null) {
                        int maxZoom = parameters2.getMaxZoom();
                        int i13 = 1;
                        while (true) {
                            if (i13 >= Math.min(maxZoom + 1, zoomRatios.size())) {
                                break;
                            }
                            if (zoomRatios.get(i13) != null) {
                                list = zoomRatios;
                                if (r9.intValue() >= round) {
                                    parameters2.setZoom(i13);
                                    break;
                                }
                            } else {
                                list = zoomRatios;
                            }
                            i13++;
                            zoomRatios = list;
                        }
                    }
                    this.f34209a.setParameters(parameters2);
                    parameters2 = this.f34209a.getParameters();
                } catch (Exception e15) {
                    e = e15;
                    str = "set camera parameters";
                    cVar.f34202c = e;
                    cVar.f34201b = "exception thrown when doing ".concat(str);
                    return cVar;
                }
            }
            t tVar = this.f34218j.get();
            MFEAndroidCameraParameters mFEAndroidCameraParameters2 = this.f34210b;
            b a14 = c.a(mFEAndroidCameraParameters2.isFrontCamera, tVar.f34252c, mFEAndroidCameraParameters2.cameraRotation);
            MFEAndroidCameraParameters mFEAndroidCameraParameters3 = this.f34210b;
            int i14 = mFEAndroidCameraParameters3.hintWidth;
            int i15 = mFEAndroidCameraParameters3.hintHeight;
            if (i14 == 0) {
                i14 = a14.d() ? tVar.f34251b : tVar.f34250a;
            }
            if (i15 == 0) {
                i15 = a14.d() ? tVar.f34250a : tVar.f34251b;
            }
            Camera.Size a15 = c.a(i14, i15, this.f34217i, parameters2);
            if (a15 != null) {
                parameters2.setPreviewSize(a15.width, a15.height);
            }
            parameters2.setPreviewFormat(17);
            List<String> supportedFocusModes = parameters2.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                if (this.f34210b.isContinuousAutoFocusOn) {
                    if (supportedFocusModes.contains("continuous-video")) {
                        parameters2.setFocusMode("continuous-video");
                    }
                } else if (supportedFocusModes.contains("auto")) {
                    parameters2.setFocusMode("auto");
                } else if (supportedFocusModes.contains("fixed")) {
                    parameters2.setFocusMode("fixed");
                }
            }
            this.f34209a.setParameters(parameters2);
            Camera.Parameters parameters3 = this.f34209a.getParameters();
            MFEAndroidCameraParametersCallback mFEAndroidCameraParametersCallback = bVar.f34198c;
            if (mFEAndroidCameraParametersCallback != null) {
                mFEAndroidCameraParametersCallback.onCameraSetParameters(parameters3, this.f34210b);
                this.f34209a.setParameters(parameters3);
            }
            parameters = this.f34209a.getParameters();
        } catch (Exception e16) {
            e = e16;
        }
        if (parameters == null) {
            cVar.f34201b = "Failed to setup camera preview because camera parameter is null";
            return cVar;
        }
        Camera.Size previewSize = parameters.getPreviewSize();
        if (previewSize == null) {
            cVar.f34201b = "Failed to setup camera preview because camera preview size is null";
            return cVar;
        }
        str = "prepare to start camera preview";
        try {
            this.f34211c = previewSize;
            this.f34212d = Boolean.valueOf(this.f34210b.isFrontCamera);
            this.f34213e = this.f34210b.cameraRotation;
        } catch (Exception e17) {
            e = e17;
            cVar.f34202c = e;
            cVar.f34201b = "exception thrown when doing ".concat(str);
            return cVar;
        }
        if (!bVar.f34199d) {
            cVar.f34201b = "Failed to start camera preview due to fail to setup EGL that is necessary for initializing surface";
            return cVar;
        }
        int i16 = this.f34215g;
        if (i16 == 0) {
            int[] iArr = {i16};
            GLES20.glGenTextures(1, iArr, 0);
            this.f34215g = iArr[0];
        }
        if (this.f34214f == null && this.f34215g != 0) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f34215g);
            this.f34214f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(bVar.f34197b);
        }
        this.f34216h = null;
        SurfaceTexture surfaceTexture2 = this.f34214f;
        if (surfaceTexture2 == null) {
            cVar.f34201b = "Failed to start camera preview due to fail to initialize surface";
            return cVar;
        }
        this.f34209a.setPreviewTexture(surfaceTexture2);
        this.f34209a.startPreview();
        cVar.f34200a = true;
        return cVar;
    }

    @Override // com.modiface.mfecommon.camera.r
    public d.f b() {
        SurfaceTexture surfaceTexture = this.f34214f;
        d.f fVar = null;
        if (surfaceTexture == null) {
            return null;
        }
        surfaceTexture.updateTexImage();
        long timestamp = surfaceTexture.getTimestamp();
        Long l13 = this.f34216h;
        if (l13 != null && timestamp < l13.longValue()) {
            return null;
        }
        this.f34216h = Long.valueOf(timestamp);
        Boolean bool = this.f34212d;
        if (bool == null) {
            return null;
        }
        MFEAndroidCameraParameters.CameraRotation cameraRotation = this.f34213e;
        if (cameraRotation == null) {
            cameraRotation = MFEAndroidCameraParameters.CameraRotation.ROTATE_0;
        }
        Camera.Size size = this.f34211c;
        if (size != null && size.width > 0 && size.height > 0) {
            b a13 = c.a(bool.booleanValue(), this.f34218j.get().f34252c, cameraRotation);
            fVar = new d.f();
            fVar.f34205a = this.f34215g;
            fVar.f34206b = a13.d() ? size.height : size.width;
            fVar.f34207c = a13.d() ? size.width : size.height;
            fVar.f34208d = c.a(a13);
        }
        return fVar;
    }

    @Override // com.modiface.mfecommon.camera.r
    public void c() {
        Camera camera = this.f34209a;
        if (camera != null) {
            camera.stopPreview();
            Camera.Parameters parameters = this.f34209a.getParameters();
            if (parameters != null) {
                parameters.setFlashMode("off");
                this.f34209a.setParameters(parameters);
            }
            this.f34209a.startPreview();
        }
    }

    @Override // com.modiface.mfecommon.camera.r
    public void close() {
    }

    @Override // com.modiface.mfecommon.camera.r
    public boolean d() {
        return true;
    }

    @Override // com.modiface.mfecommon.camera.r
    public d.a e() {
        d.a aVar = new d.a();
        aVar.f34194a = this.f34214f;
        aVar.f34195b = this.f34215g;
        this.f34214f = null;
        this.f34215g = 0;
        return aVar;
    }

    public f() {
        this(-1);
    }

    @Override // com.modiface.mfecommon.camera.r
    public void a() {
        Camera camera = this.f34209a;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception unused) {
            }
            try {
                this.f34209a.setPreviewTexture(null);
            } catch (Exception unused2) {
            }
            this.f34209a.release();
        }
        this.f34209a = null;
        this.f34211c = null;
        this.f34212d = null;
        this.f34213e = MFEAndroidCameraParameters.CameraRotation.ROTATE_0;
    }

    @Override // com.modiface.mfecommon.camera.r
    public void a(@NonNull Context context) {
        Display defaultDisplay;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i13 = displayMetrics.widthPixels;
            int i14 = displayMetrics.heightPixels;
            int rotation = defaultDisplay.getRotation();
            this.f34218j.set(new t(i13, i14, rotation != 0 ? rotation != 1 ? rotation != 2 ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF : RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP : 90 : 0, null));
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r2.setFlashMode("on");
     */
    @Override // com.modiface.mfecommon.camera.r
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.modiface.mfecommon.camera.d.e a(boolean r10, @androidx.annotation.NonNull com.modiface.mfecommon.camera.d.InterfaceC0001d r11) {
        /*
            r9 = this;
            java.lang.String r0 = "on"
            com.modiface.mfecommon.camera.d$e r1 = new com.modiface.mfecommon.camera.d$e
            r1.<init>()
            r2 = 0
            r1.f34203a = r2
            android.hardware.Camera r2 = r9.f34209a
            if (r2 != 0) goto L18
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "failed to take picture because camera has not started"
            r10.<init>(r11)
            r1.f34204b = r10
            return r1
        L18:
            r2.stopPreview()     // Catch: java.lang.Throwable -> L5f
            com.modiface.mfecommon.camera.MFEAndroidCameraParameters r2 = r9.f34210b     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r2.isFrontCamera     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicReference<com.modiface.mfecommon.camera.t> r2 = r9.f34218j     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L5f
            com.modiface.mfecommon.camera.t r2 = (com.modiface.mfecommon.camera.t) r2     // Catch: java.lang.Throwable -> L5f
            int r6 = r2.f34252c     // Catch: java.lang.Throwable -> L5f
            com.modiface.mfecommon.camera.MFEAndroidCameraParameters r2 = r9.f34210b     // Catch: java.lang.Throwable -> L5f
            com.modiface.mfecommon.camera.MFEAndroidCameraParameters$CameraRotation r7 = r2.cameraRotation     // Catch: java.lang.Throwable -> L5f
            android.hardware.Camera r2 = r9.f34209a     // Catch: java.lang.Throwable -> L5f
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L61
            if (r10 == 0) goto L56
            java.util.List r10 = r2.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L56
            if (r10 == 0) goto L56
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L56
        L41:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L56
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L56
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L41
            r2.setFlashMode(r0)     // Catch: java.lang.Throwable -> L56
        L56:
            r11.a(r2)     // Catch: java.lang.Throwable -> L5f
            android.hardware.Camera r10 = r9.f34209a     // Catch: java.lang.Throwable -> L5f
            r10.setParameters(r2)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r10 = move-exception
            goto L75
        L61:
            android.hardware.Camera r10 = r9.f34209a     // Catch: java.lang.Throwable -> L5f
            r10.startPreview()     // Catch: java.lang.Throwable -> L5f
            android.hardware.Camera r10 = r9.f34209a     // Catch: java.lang.Throwable -> L5f
            com.modiface.mfecommon.camera.s r0 = new com.modiface.mfecommon.camera.s     // Catch: java.lang.Throwable -> L5f
            r3 = r0
            r4 = r9
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5f
            r11 = 0
            r10.takePicture(r11, r11, r0)     // Catch: java.lang.Throwable -> L5f
            goto L77
        L75:
            r1.f34204b = r10
        L77:
            r10 = 1
            r1.f34203a = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfecommon.camera.f.a(boolean, com.modiface.mfecommon.camera.d$d):com.modiface.mfecommon.camera.d$e");
    }
}
