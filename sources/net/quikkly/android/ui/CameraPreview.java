package net.quikkly.android.ui;

import a.a;
import a.cb;
import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import net.quikkly.android.Quikkly;
import net.quikkly.core.StrUtils;

/* loaded from: classes4.dex */
public class CameraPreview extends SurfaceView {
    public static final long AUTOFOCUS_INTERVAL_MILLIS = 2000;
    public static final double DEFAULT_ZOOM = 1.0d;
    Activity activity;
    Camera camera;
    private Camera.PreviewCallback cameraCallback;
    Handler handler;
    ScanResultsOverlay overlay;
    PreviewListener previewListener;
    private Runnable requestAutofocus;
    private SurfaceHolder.Callback surfaceHolderCallback;
    boolean surfaceReady;
    int viewHeight;
    int viewWidth;
    double zoom;

    public interface PreviewListener {
        void onPreviewFrameCaptured(byte[] bArr);

        void onPreviewReady(boolean z13, Camera.Size size);
    }

    public CameraPreview(Context context) {
        super(context);
        this.handler = new Handler();
        this.zoom = 1.0d;
        this.viewWidth = 0;
        this.viewHeight = 0;
        this.surfaceReady = false;
        this.previewListener = null;
        this.surfaceHolderCallback = new SurfaceHolder.Callback() { // from class: net.quikkly.android.ui.CameraPreview.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
                CameraPreview.this.surfaceChanged(surfaceHolder, i13, i14, i15);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                CameraPreview.this.surfaceCreated();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.this.surfaceDestroyed();
            }
        };
        this.cameraCallback = new Camera.PreviewCallback() { // from class: net.quikkly.android.ui.CameraPreview.2
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                PreviewListener previewListener = CameraPreview.this.previewListener;
                if (previewListener != null) {
                    previewListener.onPreviewFrameCaptured(bArr);
                }
            }
        };
        this.requestAutofocus = new Runnable() { // from class: net.quikkly.android.ui.CameraPreview.3
            @Override // java.lang.Runnable
            public void run() {
                Camera camera = CameraPreview.this.camera;
                if (camera != null) {
                    try {
                        camera.autoFocus(null);
                    } catch (RuntimeException unused) {
                    }
                    CameraPreview.this.handler.postDelayed(this, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
                }
            }
        };
        this.overlay = null;
        this.zoom = 1.0d;
        prepareSurface();
    }

    private void applyZoomParameter() {
        Camera camera = this.camera;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            applyZoomParameter(parameters);
            this.camera.setParameters(parameters);
        }
    }

    private void closeCamera() {
        Camera camera = this.camera;
        if (camera != null) {
            camera.stopPreview();
            this.camera.release();
            this.camera = null;
        }
        PreviewListener previewListener = this.previewListener;
        if (previewListener != null) {
            previewListener.onPreviewReady(false, null);
        }
        this.handler.removeCallbacks(this.requestAutofocus);
    }

    private void debugAvailableModes(String str, List<String> list) {
        StringBuilder o13 = cb.o("Unable to set preferred ", str, " mode on camera: supported modes are ");
        if (list == null) {
            o13.append("null.");
        } else {
            o13.append("[");
            o13.append(StrUtils.join(list, ", "));
            o13.append("].");
        }
        Log.e(Quikkly.TAG, o13.toString());
    }

    private int getIdForCameraFacing(int i13) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i14 = 0; i14 < Camera.getNumberOfCameras(); i14++) {
            Camera.getCameraInfo(i14, cameraInfo);
            if (cameraInfo.facing == i13) {
                return i14;
            }
        }
        return -1;
    }

    private int getIdForFirstCameraFacingBack() {
        int idForCameraFacing = getIdForCameraFacing(0);
        return idForCameraFacing == -1 ? getIdForCameraFacing(1) : idForCameraFacing;
    }

    private String getPreferredValue(List<String> list, String[] strArr) {
        if (list == null) {
            return null;
        }
        for (String str : strArr) {
            if (list.contains(str)) {
                return str;
            }
        }
        return null;
    }

    private Camera openCamera(int i13) {
        try {
            return Camera.open(i13);
        } catch (RuntimeException e13) {
            Log.e(Quikkly.TAG, "Unable to open camera " + i13, e13);
            return null;
        }
    }

    private void openStartCamera() {
        if (this.camera == null) {
            int idForFirstCameraFacingBack = getIdForFirstCameraFacingBack();
            if (idForFirstCameraFacingBack == -1) {
                Log.e(Quikkly.TAG, "Cannot open camera - no back-facing camera ID found.");
                return;
            }
            Log.e(Quikkly.TAG, "Opening camera " + idForFirstCameraFacingBack);
            Camera openCamera = openCamera(idForFirstCameraFacingBack);
            this.camera = openCamera;
            if (openCamera == null) {
                Log.e(Quikkly.TAG, "Cannot open camera - Camera.open() failed.");
                return;
            }
            Camera.Size defaultParams = setDefaultParams(openCamera);
            Activity activity = this.activity;
            if (activity != null) {
                int cameraDisplayOrientation = setCameraDisplayOrientation(activity, idForFirstCameraFacingBack, this.camera);
                ScanResultsOverlay scanResultsOverlay = this.overlay;
                if (scanResultsOverlay != null) {
                    scanResultsOverlay.setRotation(cameraDisplayOrientation);
                }
            }
            setCameraDisplay();
            this.camera.startPreview();
            this.camera.setPreviewCallbackWithBuffer(this.cameraCallback);
            PreviewListener previewListener = this.previewListener;
            if (previewListener != null) {
                previewListener.onPreviewReady(true, defaultParams);
            }
            this.handler.postDelayed(this.requestAutofocus, AUTOFOCUS_INTERVAL_MILLIS);
        }
    }

    private void setCameraDisplay() {
        Camera camera = this.camera;
        if (camera != null) {
            try {
                camera.setPreviewDisplay(getHolder());
            } catch (IOException e13) {
                Log.e(Quikkly.TAG, "Unable to set camera preview display to surface.", e13);
                closeCamera();
            }
        }
    }

    private static int setCameraDisplayOrientation(Activity activity, int i13, Camera camera) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i13, cameraInfo);
        int i14 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i14 = 90;
            } else if (rotation == 2) {
                i14 = RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
            } else if (rotation == 3) {
                i14 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
            }
        }
        int i15 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i14) % 360)) % 360 : ((cameraInfo.orientation - i14) + 360) % 360;
        StringBuilder t13 = a.t("Camera surface rotation=", rotation, ", degrees=", i14, ", cameraorientation=");
        t13.append(cameraInfo.orientation);
        t13.append(", facing=");
        t13.append(cameraInfo.facing);
        t13.append(", adjusted=");
        t13.append(i15);
        Log.d(Quikkly.TAG, t13.toString());
        camera.setDisplayOrientation(i15);
        return i15;
    }

    private Camera.Size setDefaultParams(Camera camera) {
        if (camera == null) {
            return null;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.getSupportedPreviewFormats().contains(17)) {
            throw new RuntimeException("Camera does not support the NV21 preview format. Other formats are not yet supported by the Quikkly SDK.");
        }
        parameters.setPreviewFormat(17);
        String preferredValue = getPreferredValue(parameters.getSupportedFocusModes(), new String[]{"auto"});
        if (StrUtils.isEmpty(preferredValue)) {
            debugAvailableModes("Focus", parameters.getSupportedFocusModes());
        } else {
            parameters.setFocusMode(preferredValue);
        }
        String preferredValue2 = getPreferredValue(parameters.getSupportedAntibanding(), new String[]{"auto", "50hz", "60hz", "off"});
        if (StrUtils.isEmpty(preferredValue2)) {
            debugAvailableModes("Antibanding", parameters.getSupportedAntibanding());
        } else {
            parameters.setAntibanding(preferredValue2);
        }
        String preferredValue3 = getPreferredValue(parameters.getSupportedWhiteBalance(), new String[]{"auto"});
        if (StrUtils.isEmpty(preferredValue3)) {
            debugAvailableModes("WhiteBalance", parameters.getSupportedWhiteBalance());
        } else {
            parameters.setWhiteBalance(preferredValue3);
        }
        String preferredValue4 = getPreferredValue(parameters.getSupportedSceneModes(), new String[]{"barcode", "steadyphoto", "sports", "auto"});
        if (StrUtils.isEmpty(preferredValue4)) {
            debugAvailableModes("Scene", parameters.getSupportedSceneModes());
        } else {
            parameters.setSceneMode(preferredValue4);
        }
        parameters.setFlashMode("off");
        applyZoomParameter(parameters);
        camera.setParameters(parameters);
        return parameters.getPreviewSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
        Locale locale = Locale.US;
        Log.d(Quikkly.TAG, cb.j("CameraPreview.surfaceChanged(", i14, "x", i15, ")"));
        this.viewWidth = i14;
        this.viewHeight = i15;
        updateCameraState();
        setCameraDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceCreated() {
        this.surfaceReady = true;
        setWillNotDraw(true);
        updateCameraState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void surfaceDestroyed() {
        this.surfaceReady = false;
        updateCameraState();
    }

    private void updateCameraState() {
        if (!this.surfaceReady || this.previewListener == null) {
            closeCamera();
        } else {
            openStartCamera();
        }
    }

    public void addFreeBuffer(byte[] bArr) {
        Camera camera = this.camera;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    public void prepareSurface() {
        this.surfaceReady = false;
        getHolder().addCallback(this.surfaceHolderCallback);
    }

    public void requestPreview(Activity activity, PreviewListener previewListener) {
        this.activity = activity;
        this.previewListener = previewListener;
        updateCameraState();
    }

    public void setOverlay(ScanResultsOverlay scanResultsOverlay) {
        this.overlay = scanResultsOverlay;
    }

    public void setZoom(double d2) {
        this.zoom = d2;
        applyZoomParameter();
    }

    public void stopPreview() {
        this.activity = null;
        this.previewListener = null;
        updateCameraState();
    }

    private void applyZoomParameter(Camera.Parameters parameters) {
        if (parameters != null) {
            if (parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (parameters.getZoomRatios().size() == maxZoom + 1) {
                    double d2 = 1.0E7d;
                    double d13 = 0.0d;
                    int i13 = 0;
                    for (int i14 = 0; i14 <= maxZoom; i14++) {
                        double intValue = r2.get(i14).intValue() / 100.0d;
                        double abs = Math.abs(intValue - this.zoom);
                        if (abs < d2) {
                            i13 = i14;
                            d13 = intValue;
                            d2 = abs;
                        }
                    }
                    Log.d(Quikkly.TAG, String.format(Locale.US, "Requested zoom %.2f, using level %d, ratio %.2f", Double.valueOf(this.zoom), Integer.valueOf(i13), Double.valueOf(d13)));
                    parameters.setZoom(i13);
                    return;
                }
                Log.e(Quikkly.TAG, "Zoom ratio count mismatch, not setting zoom.");
                return;
            }
            Log.w(Quikkly.TAG, "Zoom not supported for camera, not setting zoom.");
        }
    }
}
