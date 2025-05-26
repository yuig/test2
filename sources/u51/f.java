package u51;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends RelativeLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f120623d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f120624a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f120625b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f120626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, h handleSelected) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(handleSelected, "handleSelected");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f120624a = handleSelected;
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        View inflate = from.inflate(qf0.b.view_report_aggregated_comment_item, this);
        View findViewById = inflate.findViewById(qf0.a.report_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f120625b = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(qf0.a.report_item_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f120626c = (GestaltText) findViewById2;
    }
}
