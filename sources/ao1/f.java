package ao1;

import android.R;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;
import xn1.l;

/* loaded from: classes2.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20074i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextField f20075j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13, GestaltTextField gestaltTextField) {
        super(0);
        this.f20074i = i13;
        this.f20075j = gestaltTextField;
    }

    public static final void b(StateListDrawable stateListDrawable, GestaltTextField gestaltTextField, q qVar, boolean z13) {
        int[] iArr = z13 ? new int[]{R.attr.state_checked} : new int[0];
        Context context = gestaltTextField.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        stateListDrawable.addState(iArr, bs1.c.f0(gestaltTextField, qVar.drawableRes(context), null, Integer.valueOf(eo1.c.comp_text_password_toggle_icon_size), 2));
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20074i;
        GestaltTextField gestaltTextField = this.f20075j;
        switch (i13) {
            case 0:
                return (TextInputEditText) gestaltTextField.findViewById(l.edit_text);
            case 1:
                StateListDrawable stateListDrawable = new StateListDrawable();
                b(stateListDrawable, gestaltTextField, q.EYE_HIDE, true);
                b(stateListDrawable, gestaltTextField, q.EYE, false);
                return stateListDrawable;
            default:
                return (TextInputLayout) gestaltTextField.findViewById(l.text_input_layout);
        }
    }
}
