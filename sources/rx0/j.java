package rx0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.newshub.view.content.NewsHubImpressionContainer;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class j extends NewsHubImpressionContainer implements n {

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f110197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, zu1.d.news_hub_feed_section_title, this);
        View findViewById = findViewById(zu1.c.header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f110197b = gestaltText;
        if (z13) {
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            gestaltText.setLayoutParams(marginLayoutParams);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.space_200);
            setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
    }
}
