package v42;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends LinearLayout implements s42.e {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f124160a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f124161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, WeakReference headerHeightListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headerHeightListener, "headerHeightListener");
        View.inflate(context, s42.i.board_select_pins_header, this);
        View findViewById = findViewById(s42.h.board_select_pins_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f124160a = (GestaltText) findViewById;
        View findViewById2 = findViewById(s42.h.select_pins_subheading_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f124161b = (GestaltText) findViewById2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new n5.h(11, headerHeightListener, this));
            return;
        }
        s42.a aVar = (s42.a) headerHeightListener.get();
        if (aVar != null) {
            ((c) aVar).S0 = getHeight();
        }
    }
}
