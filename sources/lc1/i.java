package lc1;

import a.cb;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kc1.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends LinearLayout implements yk1.n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f82876g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f82877a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltTextField f82878b;

    /* renamed from: c, reason: collision with root package name */
    public String f82879c;

    /* renamed from: d, reason: collision with root package name */
    public bd1.b f82880d;

    /* renamed from: e, reason: collision with root package name */
    public String f82881e;

    /* renamed from: f, reason: collision with root package name */
    public final uk2.f f82882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, hc1.k handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f82877a = handleAction;
        uk2.f r13 = cb.r("create(...)");
        this.f82882f = r13;
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(context, j52.b.view_edit_profile_menu_item, this);
        View findViewById = findViewById(j52.a.edit_profile_text_item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82878b = (GestaltTextField) findViewById;
        r13.A(wj2.c.a()).o().F(new ec1.a(8, new w(this, 2)), ck2.i.f27925e, ck2.i.f27923c, ck2.i.f27924d);
    }
}
