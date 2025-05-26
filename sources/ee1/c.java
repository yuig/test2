package ee1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class c extends ConstraintLayout implements yk1.d, n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f58785d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Flow f58786a;

    /* renamed from: b, reason: collision with root package name */
    public g f58787b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f58788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(context);
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        flow.setId(View.generateViewId());
        flow.C();
        flow.E(1);
        flow.A();
        flow.z(bs1.c.W(flow, eo1.c.space_100));
        flow.D(bs1.c.W(flow, eo1.c.lego_brick_three_quarters));
        flow.f17494k.O0 = 0.5f;
        flow.requestLayout();
        this.f58786a = flow;
        this.f58788c = new ArrayList();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(getResources().getDimensionPixelOffset(eo1.c.space_300), getResources().getDimensionPixelOffset(eo1.c.space_600), getResources().getDimensionPixelOffset(eo1.c.space_300), getResources().getDimensionPixelOffset(eo1.c.space_1200));
        setLayoutParams(layoutParams);
        setPadding(bs1.c.W(this, eo1.c.space_400), bs1.c.W(this, eo1.c.space_200), bs1.c.W(this, eo1.c.space_400), 0);
        p pVar = new p();
        pVar.j(this);
        int id3 = flow.getId();
        pVar.l(id3, 4, 0, 3);
        pVar.l(id3, 4, 0, 4);
        pVar.l(id3, 6, 0, 6);
        pVar.l(id3, 7, 0, 7);
        pVar.b(this);
    }
}
