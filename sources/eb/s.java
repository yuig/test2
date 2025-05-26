package eb;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import q5.a2;
import q5.p1;
import q5.q1;
import q5.r1;

/* loaded from: classes3.dex */
public final class s implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final s f58214b = new s();

    /* renamed from: c, reason: collision with root package name */
    public static final String f58215c;

    static {
        String simpleName = s.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f58215c = simpleName;
        f0.d(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect b(android.app.Activity r12) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.s.b(android.app.Activity):android.graphics.Rect");
    }

    public final q a(Activity activity) {
        Rect rect;
        a2 b13;
        WindowMetrics currentWindowMetrics;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            Intrinsics.checkNotNullParameter(activity, "context");
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(rect, "wm.currentWindowMetrics.bounds");
        } else {
            if (i13 >= 29) {
                String str = f58215c;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                    Intrinsics.g(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                    rect = new Rect((Rect) invoke);
                } catch (IllegalAccessException e13) {
                    Log.w(str, e13);
                    rect = b(activity);
                } catch (NoSuchFieldException e14) {
                    Log.w(str, e14);
                    rect = b(activity);
                } catch (NoSuchMethodException e15) {
                    Log.w(str, e15);
                    rect = b(activity);
                } catch (InvocationTargetException e16) {
                    Log.w(str, e16);
                    rect = b(activity);
                }
            } else if (i13 >= 28) {
                rect = b(activity);
            } else {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Rect rect2 = new Rect();
                Display display = activity.getWindowManager().getDefaultDisplay();
                display.getRectSize(rect2);
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (!activity.isInMultiWindowMode()) {
                    Intrinsics.checkNotNullExpressionValue(display, "defaultDisplay");
                    Intrinsics.checkNotNullParameter(display, "display");
                    Point point = new Point();
                    display.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i14 = rect2.bottom + dimensionPixelSize;
                    if (i14 == point.y) {
                        rect2.bottom = i14;
                    } else {
                        int i15 = rect2.right + dimensionPixelSize;
                        if (i15 == point.x) {
                            rect2.right = i15;
                        }
                    }
                }
                rect = rect2;
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 30) {
            Intrinsics.checkNotNullParameter(activity, "context");
            if (i16 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b13 = ib.a.f72010a.a(activity);
        } else {
            b13 = (i16 >= 30 ? new r1() : i16 >= 29 ? new q1() : new p1()).b();
            Intrinsics.checkNotNullExpressionValue(b13, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new q(new db.b(rect), b13);
    }
}
