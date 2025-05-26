package l11;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends ConstraintLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f81460a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f81461b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f81462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, e02.c.list_cell_boardless_save, this);
        View findViewById = inflate.findViewById(e02.b.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f81461b = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(e02.b.icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f81462c = (GestaltIcon) findViewById2;
        View findViewById3 = inflate.findViewById(e02.b.header);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f81460a = (GestaltText) findViewById3;
        setImportantForAccessibility(2);
        setFocusable(false);
    }
}
