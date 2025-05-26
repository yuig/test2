package zp;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final aq.j f142357a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f142358b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f142359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, aq.j editablePinWrapper, wy0 user) {
        super(context);
        boolean z13;
        m60.w eventManager = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(editablePinWrapper, "editablePinWrapper");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f142357a = editablePinWrapper;
        this.f142358b = user;
        this.f142359c = eventManager;
        View.inflate(context, ry1.d.pin_edit_advanced_settings_modal_view, this);
        View findViewById = findViewById(ry1.c.pin_edit_disable_recommendations);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSwitchWithLabel gestaltSwitchWithLabel = (GestaltSwitchWithLabel) findViewById;
        View findViewById2 = findViewById(ry1.c.pin_edit_disable_recommendations_details);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        pk.a0.p((GestaltText) findViewById2, Html.fromHtml(L() ? bs1.c.f2(this, f62.e.show_shopping_recommendations_disabled) : editablePinWrapper.W() ? bs1.c.f2(this, f62.e.pin_advanced_settings_has_tagged_products) : bs1.c.f2(this, f62.e.show_shopping_recommendations_details)).toString());
        pe.i.j(gestaltSwitchWithLabel, new z3.m(this, 17));
        View findViewById3 = findViewById(ry1.c.recommendations_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        bs1.c.R1((LinearLayout) findViewById3, true);
        editablePinWrapper.getClass();
        if (Boolean.parseBoolean(editablePinWrapper.z(aq.d.IS_SHOPPING_REC_ALLOWED))) {
            Boolean q43 = user.q4();
            Intrinsics.checkNotNullExpressionValue(q43, "getShoppingRecDisabled(...)");
            if (!q43.booleanValue() || editablePinWrapper.Z()) {
                Intrinsics.checkNotNullParameter(user, "user");
                Boolean q44 = user.q4();
                Intrinsics.checkNotNullExpressionValue(q44, "getShoppingRecDisabled(...)");
                if ((!q44.booleanValue() || !editablePinWrapper.Z()) && !editablePinWrapper.W()) {
                    z13 = true;
                    gestaltSwitchWithLabel.T(new c0(0, z13, L() && !editablePinWrapper.W()));
                    int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_200);
                    setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
            }
        }
        z13 = false;
        gestaltSwitchWithLabel.T(new c0(0, z13, L() && !editablePinWrapper.W()));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_200);
        setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
    }

    public final boolean L() {
        wy0 user = this.f142358b;
        Boolean q43 = user.q4();
        Intrinsics.checkNotNullExpressionValue(q43, "getShoppingRecDisabled(...)");
        if (!q43.booleanValue()) {
            Intrinsics.checkNotNullParameter(user, "user");
            Boolean q44 = user.q4();
            Intrinsics.checkNotNullExpressionValue(q44, "getShoppingRecDisabled(...)");
            if (!q44.booleanValue() || !this.f142357a.Z()) {
                return false;
            }
        }
        return true;
    }
}
