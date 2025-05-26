package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.component.button.LegoButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinTextEditorToolbar;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinTextEditorToolbar extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public v2 f46061a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f46062b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f46063c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f46064d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f46065e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f46066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinTextEditorToolbar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46062b = xk2.m.b(new j2(this, 1));
        this.f46063c = xk2.m.b(new j2(this, 2));
        this.f46064d = xk2.m.b(new j2(this, 0));
        this.f46065e = xk2.m.b(new j2(this, 4));
        this.f46066f = xk2.m.b(new j2(this, 3));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), aq1.f.idea_pin_text_editor_toolbar, this);
    }

    public final LegoButton a() {
        Object value = this.f46066f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LegoButton) value;
    }

    public final void b(boolean z13) {
        if (z13) {
            LegoButton.d(a(), aq1.c.ic_chevron_up_story_pin_nonpds);
        } else {
            LegoButton.d(a(), aq1.c.ic_chevron_down_story_pin_nonpds);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinTextEditorToolbar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46062b = xk2.m.b(new j2(this, 1));
        this.f46063c = xk2.m.b(new j2(this, 2));
        this.f46064d = xk2.m.b(new j2(this, 0));
        this.f46065e = xk2.m.b(new j2(this, 4));
        this.f46066f = xk2.m.b(new j2(this, 3));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), aq1.f.idea_pin_text_editor_toolbar, this);
    }
}
