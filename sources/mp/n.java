package mp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes3.dex */
public final class n extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f87873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, Integer num, int i13) {
        super(context, null);
        num = (i13 & 2) != 0 ? null : num;
        vn1.g variant = vn1.g.BODY_300;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(variant, "variant");
        View.inflate(context, c52.d.settings_section_header_view, this);
        View findViewById = findViewById(c52.c.settings_section_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f87873a = gestaltText;
        if (num != null) {
            a0.o(gestaltText, num.intValue(), new Object[0]);
        }
    }
}
