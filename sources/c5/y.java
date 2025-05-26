package c5;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.location.LocationManager;
import android.net.Uri;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class y {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor b(Context context) {
        return context.getMainExecutor();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String d(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params i(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static int j(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri k(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean l(LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }

    public static void m(TextView textView, int i13) {
        textView.setFirstBaselineToTopHeight(i13);
    }

    public static void n(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
