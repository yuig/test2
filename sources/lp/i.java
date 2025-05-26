package lp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.y2;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.j0;
import so.oa;
import so.s8;
import x02.x0;
import x02.x2;

/* loaded from: classes3.dex */
public final class i extends y2 implements nx.a {
    public final GestaltButton A;
    public final gi.m B;
    public final x2 C;
    public final x0 D;
    public final j0 E;

    /* renamed from: u, reason: collision with root package name */
    public final g70.h f84215u;

    /* renamed from: v, reason: collision with root package name */
    public final WebImageView f84216v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f84217w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltText f84218x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltText f84219y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltButton f84220z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView, g70.h boardNavigator) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f84215u = boardNavigator;
        View findViewById = itemView.findViewById(nb2.b.board_image_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f84216v = (WebImageView) findViewById;
        View findViewById2 = itemView.findViewById(nb2.b.badge_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = itemView.findViewById(nb2.b.conversation_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84217w = (GestaltText) findViewById3;
        View findViewById4 = itemView.findViewById(nb2.b.subtitle_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f84218x = (GestaltText) findViewById4;
        View findViewById5 = itemView.findViewById(nb2.b.timestamp_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f84219y = (GestaltText) findViewById5;
        View findViewById6 = itemView.findViewById(nb2.b.positive_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f84220z = (GestaltButton) findViewById6;
        View findViewById7 = itemView.findViewById(nb2.b.negative_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.A = (GestaltButton) findViewById7;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s8 s8Var = (s8) ((h) me.o.a(bs1.c.k0(context), h.class));
        s8Var.y5();
        l10.b.a();
        this.B = s8Var.x5();
        oa oaVar = s8Var.f114255d;
        this.C = (x2) oaVar.f113800m3.get();
        this.D = (x0) oaVar.f113765k3.get();
        this.E = ((nx.m) ((f0) oaVar.f113747j2.get())).a(this);
        ((ImageView) findViewById2).setVisibility(8);
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.BOARD, null, null, null, null, null);
    }
}
