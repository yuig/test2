package lc1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rq.n3;

/* loaded from: classes5.dex */
public final class l extends ConstraintLayout implements yk1.n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f82889f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final jc1.g f82890a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltTextField f82891b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f82892c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82893d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, jc1.g gVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82890a = gVar;
        View inflate = View.inflate(context, j52.b.view_edit_profile_phone, this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, 0, 0, 0, dimensionPixelOffset);
        setLayoutParams(layoutParams);
        View findViewById = inflate.findViewById(j52.a.edit_profile_phone_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = inflate.findViewById(j52.a.edit_profile_phone_item_phone);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById2;
        this.f82891b = gestaltTextField;
        gestaltTextField.X(g.f82868n);
        this.f82892c = ((GestaltButton) inflate.findViewById(j52.a.edit_profile_phone_item_country)).d(g.f82869o).e(new n3(12));
    }
}
