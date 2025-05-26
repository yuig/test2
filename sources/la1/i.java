package la1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends ConstraintLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82527a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f82528b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f82529c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f82530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82527a = z13;
        View inflate = LayoutInflater.from(context).inflate(b52.b.view_close_deactivate_account_header, this);
        View findViewById = inflate.findViewById(b52.a.close_deactivate_heading);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82528b = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(b52.a.close_deactivate_explanation);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f82529c = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(b52.a.close_deactivate_account_subheading);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f82530d = (GestaltText) findViewById3;
    }
}
