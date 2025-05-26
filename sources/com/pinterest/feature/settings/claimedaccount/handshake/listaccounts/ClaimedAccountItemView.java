package com.pinterest.feature.settings.claimedaccount.handshake.listaccounts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.a;
import ba1.e;
import ba1.f;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;
import y71.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/settings/claimedaccount/handshake/listaccounts/ClaimedAccountItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ClaimedAccountItemView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f48136a;

    /* renamed from: b, reason: collision with root package name */
    public final v f48137b;

    /* renamed from: c, reason: collision with root package name */
    public final v f48138c;

    /* renamed from: d, reason: collision with root package name */
    public final v f48139d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClaimedAccountItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((GestaltText) this.f48136a.getValue()).i(new f(state, 0));
        String str = state.f22342e;
        v vVar = this.f48139d;
        if (str == null || state.f22343f) {
            GestaltIcon gestaltIcon = (GestaltIcon) vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltIcon, "<get-errorIcon>(...)");
            t.O(gestaltIcon);
        } else {
            GestaltIcon gestaltIcon2 = (GestaltIcon) vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltIcon2, "<get-errorIcon>(...)");
            t.e1(gestaltIcon2);
        }
        ((GestaltText) this.f48137b.getValue()).i(new b(8, state, this));
        ((GestaltIconButton) this.f48138c.getValue()).t(new f(state, 1));
        setClickable(state.f22340c);
    }

    public /* synthetic */ ClaimedAccountItemView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimedAccountItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48136a = m.b(new e(this, 3));
        this.f48137b = m.b(new e(this, 1));
        this.f48138c = m.b(new e(this, 0));
        this.f48139d = m.b(new e(this, 2));
        View.inflate(context, b52.b.view_claimed_account_item, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
    }
}
