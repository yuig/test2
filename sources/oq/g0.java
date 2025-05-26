package oq;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.design.widget.RoundedCornersLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rq.r1;

/* loaded from: classes3.dex */
public final class g0 extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f97037a;

    /* renamed from: b, reason: collision with root package name */
    public r1 f97038b;

    /* renamed from: c, reason: collision with root package name */
    public final RoundedCornersLayout f97039c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f97040d;

    /* renamed from: e, reason: collision with root package name */
    public final int f97041e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.constraintlayout.widget.p f97042f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f97043g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f97044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97037a = new ArrayList();
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context);
        this.f97039c = roundedCornersLayout;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f97040d = linearLayout;
        int i13 = n80.c.landscape_closeup_guideline;
        this.f97041e = i13;
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        this.f97042f = pVar;
        this.f97043g = new int[2];
        this.f97044h = new int[2];
        setId(n80.c.landscape_closeup_container);
        roundedCornersLayout.setId(n80.c.landscape_closeup_left_container);
        Context context2 = roundedCornersLayout.getContext();
        int i14 = eo1.b.color_black_900;
        Object obj = d5.a.f53679a;
        roundedCornersLayout.a(context2.getColor(i14));
        addView(roundedCornersLayout);
        linearLayout.setId(n80.c.landscape_closeup_non_media_modules_container);
        linearLayout.setOrientation(1);
        addView(linearLayout);
        pVar.j(this);
        pVar.s(i13, 1);
        pVar.G(i13, 0.5f);
        pVar.o(roundedCornersLayout.getId(), 0);
        pVar.n(roundedCornersLayout.getId(), 0);
        pVar.l(roundedCornersLayout.getId(), 6, 0, 6);
        pVar.l(roundedCornersLayout.getId(), 3, 0, 3);
        pVar.l(roundedCornersLayout.getId(), 4, 0, 4);
        pVar.l(roundedCornersLayout.getId(), 7, i13, 6);
        pVar.o(linearLayout.getId(), 0);
        pVar.n(linearLayout.getId(), -2);
        pVar.l(linearLayout.getId(), 6, i13, 6);
        pVar.l(linearLayout.getId(), 3, 0, 3);
        pVar.l(linearLayout.getId(), 7, 0, 7);
        pVar.b(this);
    }

    public final void L(PinCloseupBaseModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f97040d.addView(module, new ConstraintLayout.LayoutParams(-1, -2));
        this.f97037a.add(module);
    }
}
