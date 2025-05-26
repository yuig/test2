package vs;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final GestaltText f126466u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f126467v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(ps.p.label);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f126466u = (GestaltText) findViewById;
        View findViewById2 = view.findViewById(ps.p.value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f126467v = (GestaltText) findViewById2;
    }
}
