package wr0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.ui.imageview.WebImageView;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends ConstraintLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f130876d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f130877a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltPreviewTextView f130878b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f130879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, mg0.b.cell_engagement, this).setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(mg0.a.engagement_cell_pin_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f130877a = (WebImageView) findViewById;
        View findViewById2 = findViewById(mg0.a.engagement_cell_notification);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById2;
        m0.g(gestaltPreviewTextView, b.f130868j);
        this.f130878b = gestaltPreviewTextView;
        View findViewById3 = findViewById(mg0.a.engagement_cell_read_status_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f130879c = (ImageView) findViewById3;
    }
}
