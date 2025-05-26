package jd0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class j extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f75499a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f75500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, rd0.c.view_creator_hub_recent_pins_module_header, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setOrientation(1);
        setLayoutParams(layoutParams);
        setBackground(bs1.c.f0(this, rd0.a.recent_pins_module_header_bg, null, null, 6));
        setClipToOutline(true);
        View findViewById = findViewById(rd0.b.recent_pins_module_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f75499a = (GestaltText) findViewById;
        View findViewById2 = findViewById(rd0.b.recent_pins_module_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f75500b = (GestaltText) findViewById2;
    }
}
