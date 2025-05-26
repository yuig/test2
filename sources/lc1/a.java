package lc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends FrameLayout implements yk1.n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f82846e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f82847a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f82848b;

    /* renamed from: c, reason: collision with root package name */
    public String f82849c;

    /* renamed from: d, reason: collision with root package name */
    public String f82850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, hc1.d handleSelected) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(handleSelected, "handleSelected");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82847a = handleSelected;
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        View inflate = from.inflate(j52.b.view_country_code_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(j52.a.phone_country_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82848b = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(j52.a.phone_country_area_code);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
    }
}
