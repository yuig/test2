package z51;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class h extends ConstraintLayout implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f140869e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c f140870a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f140871b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f140872c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f140873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, c actionHandler) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.f140870a = actionHandler;
        View.inflate(context, q22.b.view_scheduled_pin_section_header, this);
        View findViewById = findViewById(q22.a.scheduled_pin_section_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f140871b = (GestaltText) findViewById;
        View findViewById2 = findViewById(q22.a.scheduled_pin_section_empty_state);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140872c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(q22.a.scheduled_pin_section_create_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f140873d = (GestaltIconButton) findViewById3;
    }
}
