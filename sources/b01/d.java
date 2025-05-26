package b01;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class d extends ConstraintLayout implements yk1.n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20726g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f20727a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f20728b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f20729c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f20730d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f20731e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIconButton f20732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, l listener, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f20727a = listener;
        this.f20728b = pinalytics;
        View.inflate(context, iy1.e.view_pear_style_summary_board, this);
        int W = bs1.c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(iy1.d.board_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f20729c = (GestaltText) findViewById;
        View findViewById2 = findViewById(iy1.d.board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f20730d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(iy1.d.board_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f20731e = (WebImageView) findViewById3;
        View findViewById4 = findViewById(iy1.d.board_chevron);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f20732f = (GestaltIconButton) findViewById4;
    }
}
