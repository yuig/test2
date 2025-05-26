package we1;

import android.content.Context;
import android.view.View;
import com.pinterest.component.button.LegoButton;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 extends h {

    /* renamed from: i, reason: collision with root package name */
    public final LegoButton f129367i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, r82.f.view_style_item, this);
        WebImageView webImageView = (WebImageView) findViewById(r82.d.style_item_first_image);
        webImageView.g2(webImageView.f2(), 0.0f, webImageView.f2(), 0.0f);
        webImageView.Y(new yv1.g(1));
        this.f129369a = webImageView;
        WebImageView webImageView2 = (WebImageView) findViewById(r82.d.style_item_second_image);
        webImageView2.g2(0.0f, webImageView2.f2(), 0.0f, webImageView2.f2());
        this.f129370b = webImageView2;
        View findViewById = findViewById(r82.d.style_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f129367i = (LegoButton) findViewById;
    }
}
