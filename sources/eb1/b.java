package eb1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.feature.settings.notifications.c1;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import h32.b4;
import h32.d4;
import k1.n1;
import kotlin.jvm.internal.Intrinsics;
import n91.z;
import u50.r;
import va1.q0;

/* loaded from: classes5.dex */
public final class b extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f58220a;

    /* renamed from: b, reason: collision with root package name */
    public final SettingsToggleItemView f58221b;

    /* renamed from: c, reason: collision with root package name */
    public final SettingsToggleItemView f58222c;

    /* renamed from: d, reason: collision with root package name */
    public final SettingsToggleItemView f58223d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltDivider f58224e;

    /* renamed from: f, reason: collision with root package name */
    public r f58225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e52.b.view_notification_setting_option, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f58220a = (GestaltText) findViewById(e52.a.toggle_section_title);
        this.f58221b = (SettingsToggleItemView) findViewById(e52.a.toggle_item_push);
        this.f58222c = (SettingsToggleItemView) findViewById(e52.a.toggle_item_email);
        this.f58223d = (SettingsToggleItemView) findViewById(e52.a.toggle_item_news);
        this.f58224e = (GestaltDivider) findViewById(e52.a.setting_option_divider);
        b4 b4Var = d4.Companion;
    }

    public final void a(SettingsToggleItemView settingsToggleItemView, c1 c1Var, int i13, boolean z13) {
        settingsToggleItemView.f48365a = new n1(14, this, c1Var);
        settingsToggleItemView.setVisibility(0);
        settingsToggleItemView.a(new q0(i13, z.c(""), true, z13));
    }
}
