package zc1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import va1.q;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends FrameLayout implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f141588d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f141589a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f141590b;

    /* renamed from: c, reason: collision with root package name */
    public q f141591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, fc1.d handleClickAction) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleClickAction, "handleClickAction");
        this.f141589a = handleClickAction;
        View.inflate(context, c52.d.settings_action_item_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(c52.c.settings_action_item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f141590b = (GestaltText) findViewById;
        setOnClickListener(new lc1.b(this, 6));
    }
}
