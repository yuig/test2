package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import h32.f1;
import java.util.HashMap;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends AppCompatTextView implements y92.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(k42.d.search_err_message_view);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        j1.q1(this, eo1.c.font_size_300);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_400);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(eo1.c.space_200);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        setTextColor(context.getColor(i13));
        dl2.b.C2(this);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void i(nx.d0 pinalytics, String searchMessage, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(searchMessage, "searchMessage");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Context context = getContext();
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        int color = context.getColor(i13);
        Spanned fromHtml = Html.fromHtml(df.j1.c0(searchMessage));
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        setText(f0.h.l0(color, fromHtml));
        nx.d0.B(pinalytics, f1.RENDER, h32.g0.NAG, null, hashMap, 20);
    }
}
