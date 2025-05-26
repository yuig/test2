package com.pinterest.feature.settings.notifications.expandablesection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import cb1.d;
import cb1.e;
import com.pinterest.feature.settings.notifications.c1;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import e52.a;
import e52.c;
import eb1.b;
import h32.b4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p91.v;
import rq.t0;
import u50.r;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/settings/notifications/expandablesection/ExpandableSectionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "notifications_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExpandableSectionView extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48177i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f48178a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48179b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48180c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIcon f48181d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48182e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f48183f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f48184g;

    /* renamed from: h, reason: collision with root package name */
    public final b f48185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableSectionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e52.b.view_notif_settings_expandable_section, this);
        View findViewById = findViewById(a.expandable_section_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48178a = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(a.collapsed_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48183f = (LinearLayout) findViewById2;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById3 = findViewById(a.settings_notifications_expandable_section_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48179b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.settings_notifications_expandable_section_sub_label);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48180c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(a.settings_notifications_expandable_expand_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48181d = (GestaltIcon) findViewById5;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b bVar = new b(context2);
        this.f48185h = bVar;
        View findViewById6 = findViewById(a.expanded_view_container);
        LinearLayout linearLayout = (LinearLayout) findViewById6;
        linearLayout.addView(bVar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f48184g = linearLayout;
        View findViewById7 = bVar.findViewById(a.toggle_section_title);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48182e = (GestaltText) findViewById7;
        b4 b4Var = d4.Companion;
    }

    public final void a(v onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f48183f.setOnClickListener(new t0(27, onClick));
    }

    public final void b(com.pinterest.feature.settings.notifications.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z13 = state.f48168f;
        LinearLayout linearLayout = this.f48184g;
        GestaltIcon gestaltIcon = this.f48181d;
        b bVar = this.f48185h;
        GestaltText gestaltText = this.f48180c;
        boolean z14 = state.f48170h;
        if (z13) {
            gestaltIcon.setImageResource(sm1.b.ic_arrow_up_gestalt);
            linearLayout.setVisibility(0);
            gestaltText.i(new d(state, 0));
            gestaltText.setTextColor(getResources().getColor(eo1.b.color_text_subtle, getContext().getTheme()));
            bVar.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            GestaltText gestaltText2 = bVar.f58220a;
            if (gestaltText2 != null) {
                gestaltText2.i(new d(state, 3));
            }
            GestaltDivider gestaltDivider = bVar.f58224e;
            if (z14) {
                if (gestaltDivider != null) {
                    gestaltDivider.a(eb1.a.f58217j);
                }
            } else if (gestaltDivider != null) {
                gestaltDivider.a(eb1.a.f58218k);
            }
            Boolean bool = state.f48171i;
            SettingsToggleItemView settingsToggleItemView = bVar.f58221b;
            if (bool == null) {
                if (settingsToggleItemView != null) {
                    settingsToggleItemView.setVisibility(8);
                }
            } else if (settingsToggleItemView != null) {
                bVar.a(settingsToggleItemView, c1.PUSH, c.notif_settings_option_push, bool.booleanValue());
            }
            Boolean bool2 = state.f48172j;
            SettingsToggleItemView settingsToggleItemView2 = bVar.f58222c;
            if (bool2 == null) {
                if (settingsToggleItemView2 != null) {
                    settingsToggleItemView2.setVisibility(8);
                }
            } else if (settingsToggleItemView2 != null) {
                bVar.a(settingsToggleItemView2, c1.EMAIL, c.notif_settings_option_email, bool2.booleanValue());
            }
            Boolean bool3 = state.f48173k;
            SettingsToggleItemView settingsToggleItemView3 = bVar.f58223d;
            if (bool3 == null) {
                if (settingsToggleItemView3 != null) {
                    settingsToggleItemView3.setVisibility(8);
                }
            } else if (settingsToggleItemView3 != null) {
                bVar.a(settingsToggleItemView3, c1.NEWS, c.notif_settings_option_news, bool3.booleanValue());
            }
            bVar.setVisibility(0);
        } else {
            gestaltIcon.setImageResource(sm1.b.ic_arrow_down_gestalt);
            linearLayout.setVisibility(8);
            gestaltText.i(new d(state, 1));
            gestaltText.setTextColor(getResources().getColor(eo1.b.color_text_default, getContext().getTheme()));
            bVar.setVisibility(8);
        }
        GestaltText gestaltText3 = this.f48182e;
        GestaltText gestaltText4 = this.f48179b;
        if (state.f48169g) {
            gestaltText4.i(e.f27270j);
            gestaltText3.i(e.f27271k);
        } else {
            gestaltText4.i(new d(state, 2));
            gestaltText3.i(e.f27272l);
        }
        this.f48178a.setPaddingRelative(0, 0, 0, z14 ? getResources().getDimensionPixelSize(eo1.c.space_0) : getResources().getDimensionPixelSize(eo1.c.space_400));
    }

    public final void c(r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        b bVar = this.f48185h;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        bVar.f58225f = eventIntake;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableSectionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e52.b.view_notif_settings_expandable_section, this);
        View findViewById = findViewById(a.expandable_section_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48178a = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(a.collapsed_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48183f = (LinearLayout) findViewById2;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById3 = findViewById(a.settings_notifications_expandable_section_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48179b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.settings_notifications_expandable_section_sub_label);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48180c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(a.settings_notifications_expandable_expand_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48181d = (GestaltIcon) findViewById5;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b bVar = new b(context2);
        this.f48185h = bVar;
        View findViewById6 = findViewById(a.expanded_view_container);
        LinearLayout linearLayout = (LinearLayout) findViewById6;
        linearLayout.addView(bVar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f48184g = linearLayout;
        View findViewById7 = bVar.findViewById(a.toggle_section_title);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48182e = (GestaltText) findViewById7;
        b4 b4Var = d4.Companion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableSectionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e52.b.view_notif_settings_expandable_section, this);
        View findViewById = findViewById(a.expandable_section_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48178a = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(a.collapsed_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48183f = (LinearLayout) findViewById2;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById3 = findViewById(a.settings_notifications_expandable_section_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48179b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.settings_notifications_expandable_section_sub_label);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48180c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(a.settings_notifications_expandable_expand_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48181d = (GestaltIcon) findViewById5;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b bVar = new b(context2);
        this.f48185h = bVar;
        View findViewById6 = findViewById(a.expanded_view_container);
        LinearLayout linearLayout = (LinearLayout) findViewById6;
        linearLayout.addView(bVar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f48184g = linearLayout;
        View findViewById7 = bVar.findViewById(a.toggle_section_title);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48182e = (GestaltText) findViewById7;
        b4 b4Var = d4.Companion;
    }
}
