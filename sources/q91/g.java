package q91;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends LinearLayout implements yk1.n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f103100c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f103101a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f103102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, gv0.b handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f103101a = handleAction;
        this.f103102b = xk2.m.b(new h81.b(this, 5));
        View.inflate(context, b52.b.lego_view_account_settings_radio_group, this).setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        a().u(new l11.p(this, 22));
    }

    public final GestaltRadioGroup a() {
        Object value = this.f103102b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltRadioGroup) value;
    }
}
