package gb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import eb.g;
import eb.h;
import eb.p;
import eb.q;
import eb.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q5.a2;
import q5.p1;
import q5.q1;
import q5.r1;

/* loaded from: classes3.dex */
public abstract class e {
    public static h a(q windowMetrics, FoldingFeature oemFeature) {
        g gVar;
        eb.e eVar;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            gVar = g.f58189b;
        } else {
            if (type != 2) {
                return null;
            }
            gVar = g.f58190c;
        }
        int state = oemFeature.getState();
        if (state == 1) {
            eVar = eb.e.f58186b;
        } else {
            if (state != 2) {
                return null;
            }
            eVar = eb.e.f58187c;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        db.b bVar = new db.b(bounds);
        Rect c13 = windowMetrics.f58211a.c();
        if (bVar.a() == 0 && bVar.b() == 0) {
            return null;
        }
        if (bVar.b() != c13.width() && bVar.a() != c13.height()) {
            return null;
        }
        if (bVar.b() < c13.width() && bVar.a() < c13.height()) {
            return null;
        }
        if (bVar.b() == c13.width() && bVar.a() == c13.height()) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
        return new h(new db.b(bounds2), gVar, eVar);
    }

    public static p b(Context context, WindowLayoutInfo info2) {
        q qVar;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info2, "info");
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30) {
            if (i13 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            return c(s.f58214b.a((Activity) context), info2);
        }
        s sVar = s.f58214b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i13 < 30) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z13 = context2 instanceof Activity;
                if (!z13 && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "iterator.baseContext");
                    }
                }
                if (z13) {
                    qVar = sVar.a((Activity) context2);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display display = ((WindowManager) systemService).getDefaultDisplay();
                    Intrinsics.checkNotNullExpressionValue(display, "wm.defaultDisplay");
                    Intrinsics.checkNotNullParameter(display, "display");
                    Point point = new Point();
                    display.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i14 = Build.VERSION.SDK_INT;
                    a2 b13 = (i14 >= 30 ? new r1() : i14 >= 29 ? new q1() : new p1()).b();
                    Intrinsics.checkNotNullExpressionValue(b13, "Builder().build()");
                    qVar = new q(rect, b13);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        a2 i15 = a2.i(null, windowInsets);
        Intrinsics.checkNotNullExpressionValue(i15, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "wm.currentWindowMetrics.bounds");
        qVar = new q(bounds, i15);
        return c(qVar, info2);
    }

    public static p c(q windowMetrics, WindowLayoutInfo info2) {
        h hVar;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(info2, "info");
        List<FoldingFeature> displayFeatures = info2.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                hVar = a(windowMetrics, feature);
            } else {
                hVar = null;
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return new p(arrayList);
    }
}
