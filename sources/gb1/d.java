package gb1;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pk.a0;

/* loaded from: classes5.dex */
public abstract class d extends LinearLayout implements com.pinterest.feature.settings.notifications.c {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f64688a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f64689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, i14, this);
        this.f64688a = (GestaltText) findViewById(c52.c.notif_settings_section_header);
        setOrientation(1);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, K, context.getResources().getDimensionPixelOffset(r0.margin_half), K, context.getResources().getDimensionPixelOffset(r0.empty_padding));
        setLayoutParams(layoutParams);
        this.f64689b = new AtomicInteger(0);
    }

    public void T2(List values, boolean z13, String sectionKey, String label) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(values, "values");
    }

    public void Z5(String str) {
        String str2 = (str == null || str.length() == 0) ? "" : str;
        GestaltText gestaltText = this.f64688a;
        if (gestaltText != null) {
            gestaltText.i(new uq.j(str2, str, 6));
        }
        if (gestaltText == null) {
            return;
        }
        gestaltText.setFocusable(true);
    }

    public void s0() {
    }
}
