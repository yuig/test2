package ads_mobile_sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class io2 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6511a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io2(Context context) {
        super(context);
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            charSequence = context.getResources().getString(ui.a.test_ad);
        } catch (Resources.NotFoundException unused) {
            charSequence = "Test Ad";
        }
        setText(charSequence);
        setTextSize(15.0f);
        setTextColor(-1);
        setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        setBackground(gradientDrawable);
    }
}
