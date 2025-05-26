package lc1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends ConstraintLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f82887a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltSwitchWithLabel f82888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, j52.b.view_edit_profile_layout, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(j52.a.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82887a = (GestaltText) findViewById;
        View findViewById2 = findViewById(j52.a.toggle_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f82888b = (GestaltSwitchWithLabel) findViewById2;
    }
}
