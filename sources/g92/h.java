package g92;

import android.app.Activity;
import android.content.res.Resources;
import ff0.j;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f64577a = z0.g(new Pair(d.CLASSIC, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_Classic)), new Pair(d.VR, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_VR)), new Pair(d.VR_0_1, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_VR_0_1)), new Pair(d.VR_0_1_EXCLUDE_SPINNER, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_VR_0_1_Exclude_Spinner)), new Pair(d.MAIN_0_0_1_BETA_7, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_Main_0_0_1_Beta_7)), new Pair(d.CALICO_0_0_1_BETA_7, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_Calico_0_0_1_Beta_7)), new Pair(d.CALICO, Integer.valueOf(bo1.b.ThemeOverlay_Pinterest_Calico)));

    public static final void a(Activity activity, d gestaltTheme, a androidTheme, boolean z13) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(gestaltTheme, "gestaltTheme");
        Intrinsics.checkNotNullParameter(androidTheme, "androidTheme");
        activity.setTheme(androidTheme.getStyleRes());
        boolean z14 = j.f62103a;
        Resources.Theme theme = activity.getTheme();
        Intrinsics.checkNotNullParameter(gestaltTheme, "<this>");
        Object obj = f64577a.get(gestaltTheme);
        Intrinsics.f(obj);
        theme.applyStyle(((Number) obj).intValue(), true);
        if (z13) {
            return;
        }
        activity.getTheme().applyStyle(bo1.b.OptOutEdgeToEdgeEnforcement, false);
    }
}
