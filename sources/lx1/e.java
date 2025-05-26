package lx1;

import android.view.View;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import ex1.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends y2 {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f85071u;

    /* renamed from: v, reason: collision with root package name */
    public final Function1 f85072v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f85073w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f85074x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView, n onSortStateChanged, boolean z13) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onSortStateChanged, "onSortStateChanged");
        this.f85071u = z13;
        this.f85072v = onSortStateChanged;
        View findViewById = itemView.findViewById(com.pinterest.partnerAnalytics.d.tvAffinity);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f85074x = (GestaltText) findViewById;
        View findViewById2 = itemView.findViewById(com.pinterest.partnerAnalytics.d.tvAudience);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f85073w = (GestaltText) findViewById2;
    }
}
