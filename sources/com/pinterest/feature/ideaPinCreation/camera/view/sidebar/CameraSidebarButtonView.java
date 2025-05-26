package com.pinterest.feature.ideaPinCreation.camera.view.sidebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq1.f;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.q;
import ut0.a;
import ut0.b;
import ut0.c;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/sidebar/CameraSidebarButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CameraSidebarButtonView extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45946d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f45947a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45948b;

    /* renamed from: c, reason: collision with root package name */
    public q f45949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSidebarButtonView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45947a = m.b(new b(this, 1));
        this.f45948b = m.b(new b(this, 0));
        View.inflate(getContext(), f.view_idea_pin_creation_camera_sidebar_button, this);
    }

    public final void L(boolean z13) {
        q qVar = this.f45949c;
        if (qVar != null) {
            Object value = this.f45948b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            dl2.b.z((GestaltIcon) value, new c(RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM, qVar));
        }
        setEnabled(!z13);
        Object value2 = this.f45947a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltText) value2).i(a.f123086j);
    }

    public final void T() {
        q qVar = this.f45949c;
        if (qVar != null) {
            Object value = this.f45948b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            dl2.b.z((GestaltIcon) value, new c(255, qVar));
        }
        setEnabled(true);
        Object value2 = this.f45947a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltText) value2).i(a.f123087k);
    }

    public final void X(int i13, int i14, q qVar) {
        this.f45949c = qVar;
        if (qVar != null) {
            Object value = this.f45948b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            dl2.b.z((GestaltIcon) value, new c(255, qVar));
        }
        Object value2 = this.f45947a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        a0.o((GestaltText) value2, i13, new Object[0]);
        setContentDescription(bs1.c.f2(this, i14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSidebarButtonView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45947a = m.b(new b(this, 1));
        this.f45948b = m.b(new b(this, 0));
        View.inflate(getContext(), f.view_idea_pin_creation_camera_sidebar_button, this);
    }
}
