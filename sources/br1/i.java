package br1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends y2 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f23793x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Function1 f23794u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f23795v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f23796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view, Function1 function1) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f23794u = function1;
        View findViewById = view.findViewById(vq1.b.token_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f23795v = (GestaltText) findViewById;
        View findViewById2 = view.findViewById(vq1.b.token_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f23796w = (LinearLayout) findViewById2;
        view.setOnClickListener(new wq1.a(this, 7));
    }

    public final void k0() {
        LinearLayout linearLayout = this.f23796w;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        com.bumptech.glide.c.a1(layoutParams2, layoutParams2.getMarginStart() + linearLayout.getContext().getResources().getDimensionPixelSize(eo1.c.space_400), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutParams2.getMarginEnd(), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        linearLayout.setLayoutParams(layoutParams2);
    }

    public final void o0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        pk.a0.p(this.f23795v, text);
    }
}
