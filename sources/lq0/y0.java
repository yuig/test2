package lq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GlideWebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends RelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f84456e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final g70.h f84457a;

    /* renamed from: b, reason: collision with root package name */
    public final GlideWebImageView f84458b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f84459c;

    /* renamed from: d, reason: collision with root package name */
    public v7 f84460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, g70.h boardNavigator) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f84457a = boardNavigator;
        LayoutInflater.from(context).inflate(xc0.f.conversation_shared_boards_header_item_view, (ViewGroup) this, true);
        View findViewById = findViewById(xc0.e.conversation_shared_boards_header_board_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f84458b = (GlideWebImageView) findViewById;
        View findViewById2 = findViewById(xc0.e.conversation_shared_boards_header_board_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f84459c = (GestaltText) findViewById2;
    }
}
