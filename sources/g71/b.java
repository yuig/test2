package g71;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bm1.l;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import j41.i;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final l f63885a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButtonToggle f63886b;

    /* renamed from: c, reason: collision with root package name */
    public a f63887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i13, l buttonType, int i14, int i15) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f63885a = buttonType;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i13, -2);
        layoutParams.setMarginStart(i14);
        layoutParams.setMarginEnd(i15);
        setGravity(17);
        setLayoutParams(layoutParams);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButtonToggle gestaltButtonToggle = new GestaltButtonToggle(6, context2, (AttributeSet) null);
        gestaltButtonToggle.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        j.r(gestaltButtonToggle.s(new i(this, 16)), new y11.c(23, this, gestaltButtonToggle));
        addView(gestaltButtonToggle);
        this.f63886b = gestaltButtonToggle;
    }

    public final void a(boolean z13) {
        GestaltButtonToggle gestaltButtonToggle = this.f63886b;
        if (gestaltButtonToggle != null) {
            gestaltButtonToggle.s(new i31.a(z13, 15));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f63887c = new a(1, onClickListener, View.OnClickListener.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }
    }
}
