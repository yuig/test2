package com.pinterest.feature.ideaPinCreation.drafts.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq1.f;
import aq1.h;
import br0.a;
import bs1.c;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu0.k;
import nu0.l;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.q;
import wf1.b;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/drafts/view/StorageStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StorageStateView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f46474a;

    /* renamed from: b, reason: collision with root package name */
    public final v f46475b;

    /* renamed from: c, reason: collision with root package name */
    public final v f46476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46474a = m.b(new l(this, 0));
        this.f46475b = m.b(new l(this, 1));
        this.f46476c = m.b(new l(this, 2));
        View.inflate(getContext(), f.view_idea_pin_draft_storage_state_label, this);
    }

    public final void L(b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = k.f92331a[state.ordinal()];
        if (i13 == 1 || i13 == 2) {
            c.X0(this);
            return;
        }
        if (i13 != 3) {
            return;
        }
        int i14 = h.idea_pin_drafts_out_of_storage_message;
        q qVar = q.WORKFLOW_STATUS_PROBLEM;
        rm1.c cVar = rm1.c.ERROR;
        Object value = this.f46475b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        dl2.b.z((GestaltIcon) value, new a(1, cVar, qVar));
        Object value2 = this.f46476c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        a0.o((GestaltText) value2, i14, new Object[0]);
        v vVar = this.f46474a;
        Object value3 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((View) value3).setBackgroundTintList(ColorStateList.valueOf(dl2.b.x0(context, cVar.getColorAttrRes())));
        Object value4 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((View) value4).setAlpha(0.1f);
        c.U1(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageStateView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46474a = m.b(new l(this, 0));
        this.f46475b = m.b(new l(this, 1));
        this.f46476c = m.b(new l(this, 2));
        View.inflate(getContext(), f.view_idea_pin_draft_storage_state_label, this);
    }
}
