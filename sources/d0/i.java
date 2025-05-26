package d0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* loaded from: classes2.dex */
public abstract class i {
    public static Context a(Context context, int i13) {
        return context.createDeviceContext(i13);
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i13) {
        return velocityTracker.getAxisVelocity(i13);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int f(Context context) {
        return context.getDeviceId();
    }

    public static int g(Context context) {
        return context.getDeviceId();
    }

    public static int h(ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i13, i14, i15);
    }

    public static int i(ViewConfiguration viewConfiguration, int i13, int i14, int i15) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i13, i14, i15);
    }

    public static boolean j(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void l(TextView textView, int i13, float f13) {
        textView.setLineHeight(i13, f13);
    }
}
