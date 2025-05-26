package li1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes5.dex */
public final class j extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f83556e = 0;

    /* renamed from: a, reason: collision with root package name */
    public u50.r f83557a;

    /* renamed from: b, reason: collision with root package name */
    public final v f83558b;

    /* renamed from: c, reason: collision with root package name */
    public final v f83559c;

    /* renamed from: d, reason: collision with root package name */
    public final v f83560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83558b = xk2.m.b(new h(this, 1));
        this.f83559c = xk2.m.b(new h(this, 0));
        this.f83560d = xk2.m.b(new h(this, 2));
        View.inflate(context, nw.b.weight_loss_opt_out_modal_view, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        pp2.a.P0(marginLayoutParams, getResources().getDimensionPixelSize(eo1.c.space_500), 0, getResources().getDimensionPixelSize(eo1.c.space_500), getResources().getDimensionPixelSize(eo1.c.space_500));
        setLayoutParams(marginLayoutParams);
    }
}
