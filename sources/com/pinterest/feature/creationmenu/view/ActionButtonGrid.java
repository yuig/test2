package com.pinterest.feature.creationmenu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import bs1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/creationmenu/view/ActionButtonGrid;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "createContentModalLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ActionButtonGrid extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Flow f45650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonGrid(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(getContext());
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        flow.setId(View.generateViewId());
        flow.C();
        flow.E(1);
        flow.A();
        flow.D(c.W(flow, eo1.c.lego_spacing_vertical_medium));
        flow.f17494k.J0 = 2;
        flow.requestLayout();
        flow.z(c.W(flow, eo1.c.lego_spacing_horizontal_medium));
        flow.B(3);
        addView(flow);
        this.f45650a = flow;
        p pVar = new p();
        pVar.j(this);
        int id3 = flow.getId();
        pVar.l(id3, 3, 0, 3);
        pVar.l(id3, 4, 0, 4);
        pVar.l(id3, 6, 0, 6);
        pVar.l(id3, 7, 0, 7);
        pVar.b(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonGrid(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(getContext());
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        flow.setId(View.generateViewId());
        flow.C();
        flow.E(1);
        flow.A();
        flow.D(c.W(flow, eo1.c.lego_spacing_vertical_medium));
        flow.f17494k.J0 = 2;
        flow.requestLayout();
        flow.z(c.W(flow, eo1.c.lego_spacing_horizontal_medium));
        flow.B(3);
        addView(flow);
        this.f45650a = flow;
        p pVar = new p();
        pVar.j(this);
        int id3 = flow.getId();
        pVar.l(id3, 3, 0, 3);
        pVar.l(id3, 4, 0, 4);
        pVar.l(id3, 6, 0, 6);
        pVar.l(id3, 7, 0, 7);
        pVar.b(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonGrid(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(getContext());
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        flow.setId(View.generateViewId());
        flow.C();
        flow.E(1);
        flow.A();
        flow.D(c.W(flow, eo1.c.lego_spacing_vertical_medium));
        flow.f17494k.J0 = 2;
        flow.requestLayout();
        flow.z(c.W(flow, eo1.c.lego_spacing_horizontal_medium));
        flow.B(3);
        addView(flow);
        this.f45650a = flow;
        p pVar = new p();
        pVar.j(this);
        int id3 = flow.getId();
        pVar.l(id3, 3, 0, 3);
        pVar.l(id3, 4, 0, 4);
        pVar.l(id3, 6, 0, 6);
        pVar.l(id3, 7, 0, 7);
        pVar.b(this);
    }
}
