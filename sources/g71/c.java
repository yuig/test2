package g71;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class c extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f63888a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f63889b;

    /* renamed from: c, reason: collision with root package name */
    public final i71.a f63890c;

    /* renamed from: d, reason: collision with root package name */
    public final h71.a f63891d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.d f63892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i13, int i14, int i15, int i16, int i17) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i18 = i13 * 4;
        int i19 = i18 + i15;
        int i23 = i18 + i16;
        this.f63892e = new androidx.appcompat.widget.d(this, 21);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i19, i23);
        layoutParams.setMarginEnd(i17);
        setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        Context context2 = getContext();
        float f13 = i13;
        Intrinsics.f(context2);
        i71.a aVar = new i71.a(context2, f13, i15, i16);
        addView(aVar, layoutParams2);
        this.f63890c = aVar;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        h71.a aVar2 = new h71.a(context3, i19, i23, i14, f13);
        addView(aVar2);
        aVar2.setAlpha(0.0f);
        this.f63891d = aVar2;
    }

    public final void a(String topLeftColor, String topRightColor, String bottomLeftColor, String bottomRightColor) {
        Intrinsics.checkNotNullParameter(topLeftColor, "topLeftColor");
        Intrinsics.checkNotNullParameter(topRightColor, "topRightColor");
        Intrinsics.checkNotNullParameter(bottomLeftColor, "bottomLeftColor");
        Intrinsics.checkNotNullParameter(bottomRightColor, "bottomRightColor");
        i71.a aVar = this.f63890c;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(topLeftColor, "topLeftColor");
            Intrinsics.checkNotNullParameter(topRightColor, "topRightColor");
            Intrinsics.checkNotNullParameter(bottomLeftColor, "bottomLeftColor");
            Intrinsics.checkNotNullParameter(bottomRightColor, "bottomRightColor");
            aVar.f71666c.setColor(Color.parseColor(topLeftColor));
            aVar.f71667d.setColor(Color.parseColor(topRightColor));
            aVar.f71664a.setColor(Color.parseColor(bottomRightColor));
            aVar.f71665b.setColor(Color.parseColor(bottomLeftColor));
            aVar.invalidate();
        }
    }
}
