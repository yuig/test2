package com.pinterest.activity.library.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import d70.d;
import d70.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.i;
import yk1.n;
import z3.m;
import zp.y;
import zp.z;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/activity/library/modal/ManageVisibilityToggleItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "zp/y", "zp/z", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ManageVisibilityToggleItemView extends ConstraintLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltSwitchWithLabel f34949a;

    /* renamed from: b, reason: collision with root package name */
    public z f34950b;

    /* renamed from: c, reason: collision with root package name */
    public y f34951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageVisibilityToggleItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_manage_visibility_basic_section_item, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(d.toggle_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSwitchWithLabel gestaltSwitchWithLabel = (GestaltSwitchWithLabel) findViewById;
        i.j(gestaltSwitchWithLabel, new m(this, 16));
        Intrinsics.checkNotNullParameter(gestaltSwitchWithLabel, "<this>");
        this.f34949a = gestaltSwitchWithLabel.T(on1.e.f96723q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageVisibilityToggleItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_manage_visibility_basic_section_item, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(d.toggle_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSwitchWithLabel gestaltSwitchWithLabel = (GestaltSwitchWithLabel) findViewById;
        i.j(gestaltSwitchWithLabel, new m(this, 16));
        Intrinsics.checkNotNullParameter(gestaltSwitchWithLabel, "<this>");
        this.f34949a = gestaltSwitchWithLabel.T(on1.e.f96723q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageVisibilityToggleItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_manage_visibility_basic_section_item, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(d.toggle_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSwitchWithLabel gestaltSwitchWithLabel = (GestaltSwitchWithLabel) findViewById;
        i.j(gestaltSwitchWithLabel, new m(this, 16));
        Intrinsics.checkNotNullParameter(gestaltSwitchWithLabel, "<this>");
        this.f34949a = gestaltSwitchWithLabel.T(on1.e.f96723q);
    }
}
