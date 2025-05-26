package fa2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Environment;
import android.util.Log;
import android.widget.ImageView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.camera.CameraPreview;
import e5.n;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tb0.g;
import tb0.h;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static Camera f61593a;

    /* renamed from: b, reason: collision with root package name */
    public static Camera.Parameters f61594b;

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList f61595c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static float f61596d;

    /* renamed from: e, reason: collision with root package name */
    public static int f61597e;

    /* renamed from: f, reason: collision with root package name */
    public static Integer f61598f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f61599g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f61600h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f61601i;

    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public static boolean b() {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (!i() || (parameters = f61594b) == null || parameters.getFlashMode() == null || (supportedFlashModes = f61594b.getSupportedFlashModes()) == null || supportedFlashModes.isEmpty()) {
            return false;
        }
        return (supportedFlashModes.size() == 1 && supportedFlashModes.get(0).equals("off")) ? false : true;
    }

    public static void c() {
        f61595c = new ArrayList();
    }

    public static void d(CameraPreview cameraPreview) {
        if (f61593a != null) {
            cameraPreview.getClass();
            try {
                cameraPreview.f52243c = false;
                Camera camera = cameraPreview.f52242b;
                if (camera != null) {
                    camera.stopPreview();
                }
            } catch (Exception unused) {
                Log.v("CameraPreview", "Tried to stop a non-existent preview");
            }
            e();
            cameraPreview.getHolder().removeCallback(cameraPreview);
            f61600h = false;
            f61593a.release();
            f61593a = null;
            try {
                cameraPreview.f52242b = null;
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    public static void e() {
        Camera.Parameters parameters;
        if (f61593a == null || !f61600h || (parameters = f61594b) == null || parameters.getFlashMode() == null) {
            return;
        }
        try {
            f61593a.cancelAutoFocus();
            List<Camera.Size> supportedPreviewSizes = f61594b.getSupportedPreviewSizes();
            if (supportedPreviewSizes != null && supportedPreviewSizes.size() > 0) {
                Camera.Size size = supportedPreviewSizes.get(0);
                f61594b.setPreviewSize(size.width, size.height);
            }
            if ("on".equals(f61594b.getFlashMode())) {
                f61594b.setFlashMode("off");
            }
            f61593a.setParameters(f61594b);
        } catch (Exception e13) {
            HashSet hashSet = h.f117076w;
            g.f117075a.p(e13);
        }
    }

    public static Camera f() {
        return f61593a;
    }

    public static File g(String str, String str2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return null;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Pinterest");
        if (!file.exists() && !file.mkdirs()) {
            Log.d("CameraManager", "failed to create directory");
            return null;
        }
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file.getPath());
        return new File(a.a.q(sb3, File.separator, str, format, str2));
    }

    public static File h() {
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + File.separator + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpeg");
    }

    public static boolean i() {
        return f61593a != null;
    }

    public static boolean j(String str) {
        return str.contains("VID_FF_") || str.contains("IMG_FF_");
    }

    public static void k(int i13, Camera camera) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i13, cameraInfo);
        int i14 = f61597e;
        int i15 = 0;
        if (i14 != 0) {
            if (i14 == 1) {
                i15 = 90;
            } else if (i14 == 2) {
                i15 = RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
            } else if (i14 == 3) {
                i15 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
            }
        }
        if (cameraInfo.facing == 1) {
            Integer valueOf = Integer.valueOf((cameraInfo.orientation + i15) % 360);
            f61598f = valueOf;
            f61598f = Integer.valueOf((360 - valueOf.intValue()) % 360);
        } else {
            f61598f = Integer.valueOf(((cameraInfo.orientation - i15) + 360) % 360);
        }
        if (camera != null) {
            camera.setDisplayOrientation(f61598f.intValue());
        }
    }

    public static void l(ImageView imageView, int i13, boolean z13) {
        Camera.Parameters parameters;
        Camera.Parameters parameters2;
        if (f61595c.isEmpty() && (parameters2 = f61594b) != null && parameters2.getSupportedFlashModes() != null) {
            if (f61594b.getSupportedFlashModes().contains("off")) {
                f61595c.add("off");
            }
            if (f61594b.getSupportedFlashModes().contains("on")) {
                f61595c.add("on");
            }
            if (f61594b.getSupportedFlashModes().contains("auto")) {
                f61595c.add("auto");
            }
        }
        String str = f61595c.isEmpty() ? "off" : (String) f61595c.get(i13 % f61595c.size());
        Drawable drawable = null;
        if (!b()) {
            if (z13) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            Context context = imageView.getContext();
            int i14 = f80.a.ic_flash_off_nonpds;
            int i15 = eo1.a.color_white_mochimalist_0_opacity_80;
            Intrinsics.checkNotNullParameter(context, "context");
            Resources resources = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = n.f57243a;
            Drawable drawable2 = resources.getDrawable(i14, theme);
            if (drawable2 != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(drawable2, "drawable");
                int t13 = b7.c.t(context, i15, 0);
                if (t13 != 0) {
                    drawable2 = drawable2.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawable2, "mutate(...)");
                    drawable2.setTint(t13);
                }
                drawable = drawable2;
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(0);
        str.getClass();
        int i16 = !str.equals("on") ? !str.equals("auto") ? f80.a.ic_flash_off_nonpds : f80.a.ic_flash_auto_nonpds : f80.a.ic_flash_on_nonpds;
        Context context2 = imageView.getContext();
        int i17 = eo1.a.base_color_grayscale_0;
        Intrinsics.checkNotNullParameter(context2, "context");
        Resources resources2 = context2.getResources();
        Resources.Theme theme2 = context2.getTheme();
        ThreadLocal threadLocal2 = n.f57243a;
        Drawable drawable3 = resources2.getDrawable(i16, theme2);
        if (drawable3 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(drawable3, "drawable");
            int t14 = b7.c.t(context2, i17, 0);
            if (t14 != 0) {
                drawable3 = drawable3.mutate();
                Intrinsics.checkNotNullExpressionValue(drawable3, "mutate(...)");
                drawable3.setTint(t14);
            }
            drawable = drawable3;
        }
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(String.format(imageView.getResources().getString(f80.b.accessibility_camera_flash), str));
        if (f61593a == null || (parameters = f61594b) == null) {
            return;
        }
        parameters.setFlashMode(str);
        f61593a.setParameters(f61594b);
    }

    public static void m(int i13) {
        Camera.Parameters parameters = f61594b;
        if (parameters == null || f61593a == null) {
            return;
        }
        parameters.setRotation(i13);
        f61593a.setParameters(f61594b);
    }

    public static void n() {
        Camera camera = f61593a;
        if (camera == null || f61601i) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
        }
        try {
            f61593a.setParameters(parameters);
        } catch (Exception e13) {
            HashSet hashSet = h.f117076w;
            g.f117075a.p(e13);
        }
    }
}
