package wb1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class o extends LinearLayout implements yk1.n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f129043c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f129044a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f129045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, y0 handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f129044a = handleAction;
        this.f129045b = xk2.m.b(new h81.b(this, 16));
        View.inflate(context, c52.d.view_details_settings_radio_group, this).setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        a().u(new ca1.h(this, 7));
    }

    public final GestaltRadioGroup a() {
        Object value = this.f129045b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltRadioGroup) value;
    }
}
