package y81;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import h32.u0;
import hb2.u;
import java.util.ArrayList;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import x81.f0;
import x81.i0;
import x81.o0;
import x81.v;

/* loaded from: classes5.dex */
public final class l extends RelativeLayout implements c, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Integer f138055a;

    /* renamed from: b, reason: collision with root package name */
    public b f138056b;

    /* renamed from: c, reason: collision with root package name */
    public final float f138057c;

    /* renamed from: d, reason: collision with root package name */
    public final float f138058d;

    /* renamed from: e, reason: collision with root package name */
    public final int f138059e;

    /* renamed from: f, reason: collision with root package name */
    public final int f138060f;

    /* renamed from: g, reason: collision with root package name */
    public final int f138061g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f138062h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f138063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(uc2.b.makeup_swatch_center_size);
        float f13 = dimensionPixelSize / 2;
        this.f138057c = f13;
        this.f138058d = f13;
        this.f138059e = getResources().getDimensionPixelSize(uc2.b.glossy_large_icon_margin);
        this.f138060f = getResources().getDimensionPixelSize(uc2.b.glossy_small_icon_margin);
        this.f138061g = getResources().getDimensionPixelSize(eo1.c.margin_quarter);
        ImageView imageView = new ImageView(context);
        int i14 = uc2.c.ic_makeup_shiny_nonpds;
        Object obj = d5.a.f53679a;
        imageView.setImageDrawable(context.getDrawable(i14));
        this.f138062h = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(context.getDrawable(uc2.c.ic_makeup_shiny_nonpds));
        this.f138063i = imageView2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMarginStart(i13);
        layoutParams.setMarginEnd(i13);
        setLayoutParams(layoutParams);
        setPivotX(f13);
        setPivotY(f13);
        setOnClickListener(this);
    }

    public final void a(ArrayList arrayList) {
        int color;
        if ((arrayList != null ? Integer.valueOf(arrayList.size()) : null) != null && arrayList.size() > 1) {
            setRotation(45.0f);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hb2.e eVar = hb2.e.VERTICAL;
            float f13 = this.f138057c;
            addView(new hb2.l(context, f13, f13, this.f138058d, arrayList, eVar));
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Context context2 = getContext();
            int i13 = eo1.b.color_white_0;
            Object obj = d5.a.f53679a;
            color = context2.getColor(i13);
        } else {
            color = Color.parseColor((String) arrayList.get(0));
        }
        int i14 = color;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int i15 = (int) this.f138058d;
        float f14 = this.f138057c;
        addView(new u(context3, f14, f14, i15, i14, null));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View itemView) {
        b bVar;
        x81.u uVar;
        n.a(itemView);
        if (itemView == null || (bVar = this.f138056b) == null) {
            return;
        }
        Integer num = this.f138055a;
        i iVar = (i) bVar;
        Intrinsics.checkNotNullParameter(itemView, "clickedView");
        fb2.b bVar2 = (fb2.b) ((e) iVar.getView());
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView recyclerView = bVar2.getPinterestRecyclerView().f52531a;
        recyclerView.getClass();
        recyclerView.d3(RecyclerView.s1(itemView));
        if (!Intrinsics.d(num, iVar.f138051i) || (uVar = iVar.f138048f) == null) {
            return;
        }
        o0 o0Var = (o0) uVar;
        if (o0Var.f134287w == i0.TRY_ON) {
            AnimatorSet animatorSet = ((f0) ((v) o0Var.getView())).f134226x1;
            if (animatorSet != null) {
                animatorSet.end();
            }
            x81.k kVar = ((f0) ((v) o0Var.getView())).f134220r1;
            if (kVar != null) {
                kVar.takePhoto();
            }
            o0Var.getPinalytics().X(u0.FLASHLIGHT_CAMERA_SCOPE);
        }
    }
}
