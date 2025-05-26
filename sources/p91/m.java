package p91;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f99297u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f99298v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltIconButton f99299w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(h52.a.title_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f99297u = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(h52.a.language_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f99298v = (GestaltText) findViewById2;
        View findViewById3 = view.findViewById(h52.a.page_item_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f99299w = (GestaltIconButton) findViewById3;
    }
}
