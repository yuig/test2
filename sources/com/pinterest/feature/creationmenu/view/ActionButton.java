package com.pinterest.feature.creationmenu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import bd0.a;
import bd0.b;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/creationmenu/view/ActionButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "createContentModalLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ActionButton extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45646d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f45647a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIcon f45648b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_action_button, this);
        View findViewById = findViewById(a.action_button_icon_container);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        Intrinsics.f(viewGroup);
        viewGroup.setBackgroundTintList(dl2.b.z0(viewGroup, eo1.a.comp_action_button_background_color));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45647a = viewGroup;
        View findViewById2 = findViewById(a.action_button_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45648b = (GestaltIcon) findViewById2;
        View findViewById3 = findViewById(a.action_button_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45649c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_action_button, this);
        View findViewById = findViewById(a.action_button_icon_container);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        Intrinsics.f(viewGroup);
        viewGroup.setBackgroundTintList(dl2.b.z0(viewGroup, eo1.a.comp_action_button_background_color));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45647a = viewGroup;
        View findViewById2 = findViewById(a.action_button_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45648b = (GestaltIcon) findViewById2;
        View findViewById3 = findViewById(a.action_button_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45649c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_action_button, this);
        View findViewById = findViewById(a.action_button_icon_container);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        Intrinsics.f(viewGroup);
        viewGroup.setBackgroundTintList(dl2.b.z0(viewGroup, eo1.a.comp_action_button_background_color));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45647a = viewGroup;
        View findViewById2 = findViewById(a.action_button_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45648b = (GestaltIcon) findViewById2;
        View findViewById3 = findViewById(a.action_button_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45649c = (GestaltText) findViewById3;
    }
}
