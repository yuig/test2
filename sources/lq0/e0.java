package lq0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends LinearLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f84303d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84304a;

    /* renamed from: b, reason: collision with root package name */
    public Object f84305b;

    /* renamed from: c, reason: collision with root package name */
    public Object f84306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, int i13) {
        super(context);
        this.f84304a = i13;
        if (i13 != 1) {
            this.f84306c = xk2.m.b(new zp0.a(this, 3));
            LayoutInflater.from(context).inflate(xc0.f.conversation_message_reaction_row_item_view, (ViewGroup) this, true);
            return;
        }
        super(context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltButton gestaltButton = new GestaltButton(0, 14, context2, (AttributeSet) null);
        int dimensionPixelSize = gestaltButton.getResources().getDimensionPixelSize(eo1.c.space_500);
        gestaltButton.setPaddingRelative(dimensionPixelSize, gestaltButton.getPaddingTop(), dimensionPixelSize, gestaltButton.getPaddingBottom());
        this.f84305b = gestaltButton;
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.space_200), getPaddingEnd(), getPaddingBottom());
        ((GestaltButton) this.f84305b).d(q71.q.f102738j);
        addView((GestaltButton) this.f84305b);
        ((GestaltButton) this.f84305b).e(new l11.p(this, 15));
    }

    public final oq0.a a() {
        oq0.a aVar = (oq0.a) this.f84305b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("itemReaction");
        throw null;
    }

    public final void b(int i13) {
        ((GestaltButton) this.f84305b).d(new zx0.d(i13, 15));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        switch (this.f84304a) {
            case 1:
                this.f84306c = onClickListener;
                ((GestaltButton) this.f84305b).setOnClickListener(onClickListener);
                break;
            default:
                super.setOnClickListener(onClickListener);
                break;
        }
    }
}
