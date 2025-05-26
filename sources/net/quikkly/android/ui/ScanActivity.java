package net.quikkly.android.ui;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.quikkly.android.Quikkly;
import net.quikkly.android.R;
import net.quikkly.android.ScanResultListener;
import net.quikkly.android.utils.FpsLogger;
import net.quikkly.android.utils.UiUtils;
import net.quikkly.core.ScanResult;
import net.quikkly.core.StrUtils;
import net.quikkly.core.Tag;

/* loaded from: classes4.dex */
public class ScanActivity extends Activity implements ScanResultListener {
    public static final String EXTRA_PREVIEW_FIT = "extra_preview_fit";
    public static final String EXTRA_SHOW_OVERLAY = "extra_show_overlay";
    public static final String EXTRA_SHOW_STATUS_CODE = "extra_show_status_code";
    public static final String EXTRA_ZOOM = "extra_zoom";
    private static long lastLaunchNanos;
    private static Map<BigInteger, String> openUrls;
    Handler handler = new Handler();
    private volatile boolean openUrlInProgress = false;
    private FpsLogger fpsLogger = new FpsLogger(Quikkly.TAG, 10000);

    static {
        HashMap hashMap = new HashMap();
        openUrls = hashMap;
        hashMap.put(new BigInteger("75891038"), "https://www.lifestone.co.nz/virtual-portal/view?uid=qikm9xUdnXe0Xcc56NJG8onRkYC2");
        openUrls.put(new BigInteger("41529803"), "https://www.lifestone.co.nz/");
    }

    public static void launch(Context context, double d2, boolean z13, boolean z14, int i13) {
        lastLaunchNanos = UiUtils.elapsedNanos();
        Intent intent = new Intent(context, (Class<?>) ScanActivity.class);
        intent.putExtra(EXTRA_SHOW_OVERLAY, z13);
        intent.putExtra(EXTRA_SHOW_STATUS_CODE, z14);
        intent.putExtra(EXTRA_ZOOM, d2);
        intent.putExtra(EXTRA_PREVIEW_FIT, i13);
        context.startActivity(intent);
    }

    private static void logLaunchDelay() {
        if (lastLaunchNanos > 0) {
            long elapsedNanos = UiUtils.elapsedNanos() - lastLaunchNanos;
            lastLaunchNanos = 0L;
            Log.e(Quikkly.TAG, String.format(Locale.US, "ScanActivity launch to first ScanResult: %.1fms", Double.valueOf(elapsedNanos / 1000000.0d)));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.setContentView(R.layout.quikkly_scan_activity);
        Quikkly.getInstance();
        ScanFragment scanFragment = new ScanFragment();
        scanFragment.setShowResultOverlay(getIntent().getBooleanExtra(EXTRA_SHOW_OVERLAY, false));
        scanFragment.setShowStatusCode(getIntent().getBooleanExtra(EXTRA_SHOW_STATUS_CODE, false));
        scanFragment.setZoom(getIntent().getDoubleExtra(EXTRA_ZOOM, 1.0d));
        scanFragment.setCameraPreviewFit(getIntent().getIntExtra(EXTRA_PREVIEW_FIT, 0));
        scanFragment.setScanResultListener(this);
        FragmentTransaction beginTransaction = super.getFragmentManager().beginTransaction();
        beginTransaction.add(R.id.quikkly_scan_activity_frame, scanFragment);
        beginTransaction.commit();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.fpsLogger.stop();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.fpsLogger.start();
    }

    @Override // net.quikkly.android.ScanResultListener
    public void onScanResult(ScanResult scanResult) {
        logLaunchDelay();
        this.fpsLogger.ping();
        if (scanResult == null || scanResult.isEmpty()) {
            return;
        }
        for (Tag tag : scanResult.tags) {
            Log.d(Quikkly.TAG, String.format("Scanned template %s, data %s", tag.templateIdentifier, tag.getData()));
        }
        if (this.openUrlInProgress) {
            return;
        }
        for (Tag tag2 : scanResult.tags) {
            final String str = openUrls.get(tag2.getData());
            if (!StrUtils.isEmpty(str)) {
                Log.d(Quikkly.TAG, String.format("Data %s -> open URL %s", tag2.getData(), str));
                this.handler.post(new Runnable() { // from class: net.quikkly.android.ui.ScanActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ScanActivity.this.openUrlInProgress) {
                            return;
                        }
                        ScanActivity.this.openUrlInProgress = true;
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str));
                        ScanActivity.this.startActivity(intent);
                        ScanActivity.this.finish();
                    }
                });
            }
        }
    }
}
