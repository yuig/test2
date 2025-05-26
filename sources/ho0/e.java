package ho0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f69690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(e02.c.board_section_picker_header_view, (ViewGroup) this, true);
        View findViewById = findViewById(e02.b.header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f69690a = (GestaltText) findViewById;
    }
}
