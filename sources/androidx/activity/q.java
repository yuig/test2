package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15929a = Color.argb(RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f15930b = Color.argb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 27, 27, 27);

    public static void a(o oVar) {
        int i13 = n0.f15922d;
        m0 detectDarkMode = m0.f15914j;
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        n0 statusBarStyle = new n0(0, 0, detectDarkMode);
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        n0 navigationBarStyle = new n0(f15929a, f15930b, detectDarkMode);
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = oVar.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean booleanValue = ((Boolean) detectDarkMode.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) detectDarkMode.invoke(resources2)).booleanValue();
        u tVar = Build.VERSION.SDK_INT >= 29 ? new t() : new r();
        Window window = oVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        tVar.a(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
    }
}
