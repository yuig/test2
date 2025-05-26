package j51;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f74709a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f74710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, nz1.d.profile_boards_section_header, this);
        setOrientation(1);
        View findViewById = findViewById(nz1.c.header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f74709a = (GestaltText) findViewById;
        View findViewById2 = findViewById(nz1.c.sub_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f74710b = (GestaltText) findViewById2;
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.space_200), getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.space_200));
    }

    public final void a(a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f74709a.setText(state.f74703a);
        String str = state.f74704b;
        String str2 = str == null ? "" : str;
        GestaltText gestaltText = this.f74710b;
        gestaltText.setText(str2);
        bs1.c.R1(gestaltText, str != null);
        Integer num = state.f74705c;
        if (num != null) {
            setPaddingRelative(num.intValue(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        }
    }
}
