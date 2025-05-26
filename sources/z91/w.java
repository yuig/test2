package z91;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c2.m4;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;

/* loaded from: classes5.dex */
public final class w extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f141404d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f141405a;

    /* renamed from: b, reason: collision with root package name */
    public final View f141406b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f141407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i13, l82.c eventIntake, int i14) {
        super(context, attributeSet, i13);
        int i15 = 1;
        if (i14 != 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            View.inflate(context, b52.b.view_settings_claimed_amazon_item, this);
            View findViewById = findViewById(c52.c.title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.f141405a = (GestaltText) findViewById;
            View findViewById2 = findViewById(c52.c.description);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.f141406b = (GestaltText) findViewById2;
            View findViewById3 = findViewById(c52.c.action_button);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            GestaltButton gestaltButton = (GestaltButton) findViewById3;
            this.f141407c = gestaltButton;
            gestaltButton.e(new gu.a(eventIntake, i15));
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        super(context, attributeSet, i13);
        View.inflate(context, b52.b.view_settings_claimed_target_item, this);
        View findViewById4 = findViewById(b52.a.title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f141405a = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b52.a.description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f141406b = (GestaltText) findViewById5;
        View findViewById6 = findViewById(b52.a.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById6;
        this.f141407c = gestaltButton2;
        gestaltButton2.e(new gu.a(eventIntake, 2));
    }

    public final void a(x displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        a0.q((GestaltText) this.f141405a, displayState.f141408a);
        a0.q((GestaltText) this.f141406b, displayState.f141409b);
        ((GestaltButton) this.f141407c).d(new q91.h(displayState, 9));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Context context, l82.c cVar, int i13) {
        this(context, null, 0, cVar, 0);
        if (i13 != 1) {
        } else {
            this(context, null, 0, cVar, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, lb0.q prefsManagerPersisted) {
        super(context);
        int i13;
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f141405a = prefsManagerPersisted;
        View.inflate(context, b52.b.modal_app_theme, this);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 <= 28) {
            i13 = c52.e.settings_dark_mode_battery_saver;
        } else {
            i13 = c52.e.settings_dark_mode_follow_system;
        }
        int i15 = 3;
        this.f141407c = f0.j(new u91.b(i13, i14 <= 28 ? 3 : -1), new u91.b(x0.settings_dark_mode_light, 1), new u91.b(x0.settings_dark_mode_dark, 2));
        int i03 = j1.i0(prefsManagerPersisted);
        View findViewById = findViewById(b52.a.settings_app_theme_radio_group);
        GestaltRadioGroup gestaltRadioGroup = (GestaltRadioGroup) findViewById;
        kh2.r.p(gestaltRadioGroup.t(new m4(this, i03, 13)), new q91.h(this, i15));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f141406b = gestaltRadioGroup;
    }
}
