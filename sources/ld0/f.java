package ld0;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.creatorHub.feature.hub.view.components.ToolButtonView;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends ConstraintLayout implements fd0.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f82963a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f82964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, rd0.c.module_creator_tools, this);
        int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(eo1.c.space_400);
        inflate.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        int i13 = eo1.d.rounded_bottom_corners;
        Object obj = d5.a.f53679a;
        inflate.setBackground(context.getDrawable(i13));
        inflate.setBackgroundTintList(d5.a.b(context, eo1.b.color_themed_background_default));
        inflate.setPadding(0, 0, 0, dimensionPixelSize);
        View findViewById = findViewById(rd0.b.creation_creator_tool);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(rd0.b.engagements_creator_tool);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(rd0.b.analytics_creator_tool);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f82963a = f0.j((ToolButtonView) findViewById, (ToolButtonView) findViewById2, (ToolButtonView) findViewById3);
    }
}
