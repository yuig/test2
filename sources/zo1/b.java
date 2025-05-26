package zo1;

import android.view.LayoutInflater;
import android.view.View;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.t0;
import m60.v0;
import pk.a0;
import rg0.g;
import rq.m1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f142327c;

    /* renamed from: a, reason: collision with root package name */
    public final lu1.b f142328a;

    /* renamed from: b, reason: collision with root package name */
    public final View f142329b;

    public b(AlertContainer containerView, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f142328a = baseActivityHelper;
        View inflate = LayoutInflater.from(containerView.getContext()).inflate(v0.view_lego_blocking_nag, containerView);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f142329b = inflate;
    }

    public final void a(g displayData) {
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        if (f142327c) {
            return;
        }
        int i13 = t0.title;
        View view = this.f142329b;
        View findViewById = view.findViewById(i13);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        String str = displayData.f15163a;
        if (str == null) {
            str = "";
        }
        a0.p(gestaltText, str);
        ((GestaltText) view.findViewById(t0.description)).i(new a(displayData, 0));
        GestaltButton gestaltButton = (GestaltButton) view.findViewById(t0.nag_positive_action_button);
        gestaltButton.d(new a(displayData, 1));
        String str2 = displayData.f108010f;
        if (str2 != null && !z.j(str2)) {
            gestaltButton.e(new m1(this, gestaltButton, displayData, 14));
        }
        f142327c = true;
    }
}
