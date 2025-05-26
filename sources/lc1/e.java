package lc1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends LinearLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f82858d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f82859a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f82860b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f82861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, hc1.k handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f82859a = handleAction;
        View.inflate(context, j52.b.view_edit_profile_action_item, this);
        View findViewById = findViewById(j52.a.edit_profile_action_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82860b = (GestaltText) findViewById;
        View findViewById2 = findViewById(j52.a.edit_profile_action_item_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f82861c = (GestaltText) findViewById2;
    }
}
