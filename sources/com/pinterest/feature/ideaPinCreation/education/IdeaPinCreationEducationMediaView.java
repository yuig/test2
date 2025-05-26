package com.pinterest.feature.ideaPinCreation.education;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.LegacyPlayerView;
import cq1.a;
import cq1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import m7.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/education/IdeaPinCreationEducationMediaView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationEducationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationEducationMediaView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public l0 f46523a;

    /* renamed from: b, reason: collision with root package name */
    public final LegacyPlayerView f46524b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationEducationMediaView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(getContext(), b.view_idea_pin_education_onboarding_media, this);
        View findViewById = inflate.findViewById(a.player_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46524b = (LegacyPlayerView) findViewById;
        View findViewById2 = inflate.findViewById(a.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = inflate.findViewById(a.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        inflate.setBackgroundColor(dl2.b.y0(inflate, eo1.a.sema_color_background_wash_dark));
        L();
    }

    public final void L() {
        l0 a13 = new x(getContext()).a();
        a13.O(2);
        a13.B0(true);
        this.f46523a = a13;
        LegacyPlayerView legacyPlayerView = this.f46524b;
        legacyPlayerView.y(a13);
        legacyPlayerView.A(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.f46523a;
        if (l0Var != null) {
            l0Var.stop();
            l0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationEducationMediaView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(getContext(), b.view_idea_pin_education_onboarding_media, this);
        View findViewById = inflate.findViewById(a.player_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46524b = (LegacyPlayerView) findViewById;
        View findViewById2 = inflate.findViewById(a.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = inflate.findViewById(a.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        inflate.setBackgroundColor(dl2.b.y0(inflate, eo1.a.sema_color_background_wash_dark));
        L();
    }
}
