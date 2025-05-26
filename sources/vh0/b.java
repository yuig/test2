package vh0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bp.j;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import rq.m1;
import xa0.m;

/* loaded from: classes5.dex */
public final class b extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f125831a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f125832b;

    /* renamed from: c, reason: collision with root package name */
    public final View f125833c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125834d;

    public b(Context context, uh0.a onConfirmClick, m onCancelClick, uh0.b onViewed, uh0.b onInviteDeclined) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onViewed, "onViewed");
        Intrinsics.checkNotNullParameter(onInviteDeclined, "onInviteDeclined");
        this.f125831a = onViewed;
        this.f125832b = onInviteDeclined;
        View inflate = LayoutInflater.from(context).inflate(v0.view_express_survey_invite_prompt, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f125833c = inflate;
        ((GestaltText) inflate.findViewById(t0.express_survey_invite_subtitle)).i(new q0.d(context, 7));
        View findViewById = inflate.findViewById(t0.express_survey_invite_confirm_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.e(new m1(this, onConfirmClick, gestaltButton, 5));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = inflate.findViewById(t0.express_survey_invite_cancel_button);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        gestaltButton2.e(new j(14, onCancelClick, gestaltButton2));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a(context, false);
        int i13 = eo1.d.lego_modal_bg;
        Object obj = d5.a.f53679a;
        aVar.setBackground(context.getDrawable(i13));
        ViewGroup viewGroup = aVar.f44754f;
        if (viewGroup != null) {
            viewGroup.setBackground(context.getDrawable(eo1.d.lego_modal_bg));
        }
        ViewGroup viewGroup2 = aVar.f44754f;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(true);
        }
        aVar.t(this.f125833c);
        aVar.q(false);
        this.f125831a.invoke();
        return aVar;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        if (this.f125834d) {
            return;
        }
        this.f125832b.invoke();
    }
}
