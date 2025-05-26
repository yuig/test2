package com.pinterest.feature.settings.menu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import d52.a;
import d52.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xa1.v;
import xa1.x;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/settings/menu/view/SettingsProfilePreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lxa1/x;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "menu_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsProfilePreview extends ConstraintLayout implements x {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48148d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48149a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48150b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsProfilePreview(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_settings_profile_preview, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        this.f48149a = ((GestaltAvatar) findViewById(a.profile_preview_avatar)).H2(v.f134486j);
        View findViewById = findViewById(a.profile_preview_title);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.i(v.f134487k);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48150b = gestaltText;
        View findViewById2 = findViewById(a.profile_preview_subtitle);
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        gestaltText2.i(v.f134488l);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f48151c = gestaltText2;
        View findViewById3 = findViewById(a.profile_preview_navigation_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsProfilePreview(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_settings_profile_preview, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        this.f48149a = ((GestaltAvatar) findViewById(a.profile_preview_avatar)).H2(v.f134486j);
        View findViewById = findViewById(a.profile_preview_title);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.i(v.f134487k);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48150b = gestaltText;
        View findViewById2 = findViewById(a.profile_preview_subtitle);
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        gestaltText2.i(v.f134488l);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f48151c = gestaltText2;
        View findViewById3 = findViewById(a.profile_preview_navigation_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsProfilePreview(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_settings_profile_preview, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        this.f48149a = ((GestaltAvatar) findViewById(a.profile_preview_avatar)).H2(v.f134486j);
        View findViewById = findViewById(a.profile_preview_title);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.i(v.f134487k);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48150b = gestaltText;
        View findViewById2 = findViewById(a.profile_preview_subtitle);
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        gestaltText2.i(v.f134488l);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f48151c = gestaltText2;
        View findViewById3 = findViewById(a.profile_preview_navigation_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
    }
}
