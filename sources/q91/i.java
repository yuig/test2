package q91;

import a.cb;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends xo.s implements yk1.n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f103127j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f103128d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltTextField f103129e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f103130f;

    /* renamed from: g, reason: collision with root package name */
    public String f103131g;

    /* renamed from: h, reason: collision with root package name */
    public bd1.b f103132h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.f f103133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, l handleAction) {
        super(context, 15);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f103128d = handleAction;
        uk2.f r13 = cb.r("create(...)");
        this.f103133i = r13;
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View inflate = View.inflate(context, b52.b.view_account_settings_text_edit_item, this);
        View findViewById = inflate.findViewById(b52.a.account_settings_text_edit_item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f103129e = (GestaltTextField) findViewById;
        View findViewById2 = inflate.findViewById(b52.a.account_settings_text_view_hint_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f103130f = (GestaltText) findViewById2;
        r13.A(wj2.c.a()).o().F(new p91.y(3, new h(this, 0)), ck2.i.f27925e, ck2.i.f27923c, ck2.i.f27924d);
    }
}
