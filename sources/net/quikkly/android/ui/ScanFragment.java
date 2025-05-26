package net.quikkly.android.ui;

import android.app.Activity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.legacy.app.FragmentCompat;
import d5.a;
import net.quikkly.android.PipelineThreadListener;
import net.quikkly.android.Quikkly;
import net.quikkly.android.R;
import net.quikkly.android.ScanResultListener;
import net.quikkly.android.ui.CameraPreview;
import net.quikkly.android.utils.QuikklyUtils;
import net.quikkly.android.utils.UiUtils;
import net.quikkly.core.ScanResult;

/* loaded from: classes4.dex */
public class ScanFragment extends Fragment {
    private static final int CAMERA_PERMISSION_REQUEST = 11;
    public static final int CAMERA_PREVIEW_FIT_CENTER = 2;
    public static final int CAMERA_PREVIEW_FIT_CROP = 1;
    public static final int CAMERA_PREVIEW_FIT_NONE = 0;
    CameraPreview cameraPreview;
    long firstFrameMillis;
    long frameCount;
    ScanResultListener listener;
    ScanResultsOverlay overlay;
    Camera.Size previewSize;
    Quikkly quikkly;
    TextView textStatusCode;
    double zoom;
    Handler handler = new Handler();
    boolean showResultOverlay = false;
    boolean showStatusCode = false;
    boolean permissionGranted = false;
    int cameraPreviewFit = 0;
    private CameraPreview.PreviewListener cameraPreviewListener = new CameraPreview.PreviewListener() { // from class: net.quikkly.android.ui.ScanFragment.1
        @Override // net.quikkly.android.ui.CameraPreview.PreviewListener
        public void onPreviewFrameCaptured(byte[] bArr) {
            ScanFragment.this.quikkly.offerFrame(bArr);
        }

        @Override // net.quikkly.android.ui.CameraPreview.PreviewListener
        public void onPreviewReady(boolean z13, Camera.Size size) {
            ScanFragment.this.quikkly.destroyScannerThreads();
            if (!z13 || size == null) {
                return;
            }
            ScanFragment scanFragment = ScanFragment.this;
            scanFragment.previewSize = size;
            scanFragment.resizeCameraPreview();
            ScanFragment scanFragment2 = ScanFragment.this;
            scanFragment2.quikkly.prepareScannerThreads(size.width, size.height, scanFragment2.pipelineListener);
        }
    };
    private PipelineThreadListener pipelineListener = new PipelineThreadListener() { // from class: net.quikkly.android.ui.ScanFragment.2
        @Override // net.quikkly.android.PipelineThreadListener
        public void onFreeBuffer(@NonNull byte[] bArr) {
            ScanFragment.this.cameraPreview.addFreeBuffer(bArr);
        }

        @Override // net.quikkly.android.ScanResultListener
        public void onScanResult(ScanResult scanResult) {
            ScanFragment scanFragment = ScanFragment.this;
            ScanResultsOverlay scanResultsOverlay = scanFragment.overlay;
            if (scanResultsOverlay != null && scanFragment.showResultOverlay) {
                scanResultsOverlay.setResult(scanResult);
            }
            ScanFragment scanFragment2 = ScanFragment.this;
            if (scanFragment2.textStatusCode != null && scanFragment2.showStatusCode) {
                final int i13 = scanResult.statusCode;
                scanFragment2.handler.post(new Runnable() { // from class: net.quikkly.android.ui.ScanFragment.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ScanFragment.this.textStatusCode.setText("Scan status: " + i13);
                    }
                });
            }
            ScanResultListener scanResultListener = ScanFragment.this.listener;
            if (scanResultListener != null) {
                scanResultListener.onScanResult(scanResult);
            }
        }
    };

    private void checkAndRequestPermission() {
        if (a.a(getActivity(), "android.permission.CAMERA") == 0) {
            this.permissionGranted = true;
        } else {
            this.permissionGranted = false;
            FragmentCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resizeCameraPreview() {
        CameraPreview cameraPreview = this.cameraPreview;
        if (cameraPreview == null || this.previewSize == null) {
            return;
        }
        int width = cameraPreview.getWidth();
        int height = this.cameraPreview.getHeight();
        Camera.Size size = this.previewSize;
        int min = Math.min(size.width, size.height);
        Camera.Size size2 = this.previewSize;
        double d2 = min;
        double d13 = width;
        double d14 = (d2 * 1.0d) / d13;
        double max = Math.max(size2.width, size2.height);
        double d15 = height;
        double d16 = (max * 1.0d) / d15;
        int i13 = this.cameraPreviewFit;
        if (i13 == 2) {
            if (d14 >= d16) {
                double d17 = (d15 - (((d13 * 1.0d) * max) / d2)) / 2.0d;
                UiUtils.setLayoutMargins(this.cameraPreview, 0, (int) Math.floor(d17), 0, (int) Math.ceil(d17));
                return;
            }
            double d18 = (d13 - (((d15 * 1.0d) * d2) / max)) / 2.0d;
            UiUtils.setLayoutMargins(this.cameraPreview, (int) Math.floor(d18), 0, (int) Math.ceil(d18), 0);
            return;
        }
        if (i13 != 1) {
            UiUtils.setLayoutMargins(this.cameraPreview, 0, 0, 0, 0);
            return;
        }
        if (d14 >= d16) {
            double d19 = ((((d15 * 1.0d) * d2) / max) - d13) / 2.0d;
            UiUtils.setLayoutMargins(this.cameraPreview, -((int) Math.floor(d19)), 0, -((int) Math.ceil(d19)), 0);
            return;
        }
        double d23 = ((((d13 * 1.0d) * max) / d2) - d15) / 2.0d;
        UiUtils.setLayoutMargins(this.cameraPreview, 0, -((int) Math.floor(d23)), 0, -((int) Math.ceil(d23)));
    }

    private void showCameraPermissionDeniedDialog() {
        UiUtils.showConfirmDialog(super.getActivity(), R.string.quikkly_permission_required_dialog_title, R.string.quikkly_permission_camera_denied_message, null, new DialogInterface.OnClickListener() { // from class: net.quikkly.android.ui.ScanFragment.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i13) {
                Activity activity = ScanFragment.super.getActivity();
                if (activity != null) {
                    if (i13 == -1) {
                        QuikklyUtils.launchAppSettings(activity);
                    } else {
                        activity.finish();
                    }
                }
            }
        });
    }

    public int getCameraPreviewSizeLarger() {
        Camera.Size size = this.previewSize;
        if (size == null) {
            return 0;
        }
        return Math.max(size.width, size.height);
    }

    public int getCameraPreviewSizeSmaller() {
        Camera.Size size = this.previewSize;
        if (size == null) {
            return 0;
        }
        return Math.min(size.width, size.height);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.quikkly_scan_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.cameraPreview.stopPreview();
        this.quikkly.destroyScannerThreads();
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i13, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i13 != 11) {
            super.onRequestPermissionsResult(i13, strArr, iArr);
            return;
        }
        if (strArr.length != 1 || !strArr[0].equals("android.permission.CAMERA") || iArr.length != 1) {
            throw new RuntimeException("Unexpected results from requesting camera permission.");
        }
        if (iArr[0] == 0) {
            this.permissionGranted = true;
        } else {
            this.permissionGranted = false;
            showCameraPermissionDeniedDialog();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.quikkly = Quikkly.getInstance();
        if (this.permissionGranted) {
            this.cameraPreview.requestPreview(getActivity(), this.cameraPreviewListener);
        } else {
            Log.w(Quikkly.TAG, "No camera permission, not starting preview");
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        checkAndRequestPermission();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.overlay = (ScanResultsOverlay) view.findViewById(R.id.quikkly_results_overlay);
        CameraPreview cameraPreview = new CameraPreview(view.getContext());
        this.cameraPreview = cameraPreview;
        cameraPreview.setOverlay(this.overlay);
        this.cameraPreview.setZoom(this.zoom);
        TextView textView = (TextView) view.findViewById(R.id.quikkly_status_code);
        this.textStatusCode = textView;
        if (textView != null) {
            textView.setVisibility(this.showStatusCode ? 0 : 8);
        }
        ((FrameLayout) view.findViewById(R.id.quikkly_camera_preview)).addView(this.cameraPreview);
    }

    public void setCameraPreviewFit(int i13) {
        if (this.cameraPreviewFit != i13) {
            this.cameraPreviewFit = i13;
            resizeCameraPreview();
        }
    }

    public void setScanResultListener(ScanResultListener scanResultListener) {
        this.listener = scanResultListener;
    }

    public void setShowResultOverlay(boolean z13) {
        this.showResultOverlay = z13;
        ScanResultsOverlay scanResultsOverlay = this.overlay;
        if (scanResultsOverlay != null) {
            scanResultsOverlay.setResult(null);
        }
    }

    public void setShowStatusCode(boolean z13) {
        this.showStatusCode = z13;
        TextView textView = this.textStatusCode;
        if (textView != null) {
            textView.setVisibility(z13 ? 0 : 8);
        }
    }

    public void setZoom(double d2) {
        this.zoom = d2;
        CameraPreview cameraPreview = this.cameraPreview;
        if (cameraPreview != null) {
            cameraPreview.setZoom(d2);
        }
    }
}
