package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48812f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48813a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48814b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f48815c;

    /* renamed from: d, reason: collision with root package name */
    public final CardView f48816d;

    /* renamed from: e, reason: collision with root package name */
    public u50.r f48817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), vq1.c.top_today_article, this);
        View findViewById = findViewById(vq1.b.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48813a = (GestaltText) findViewById;
        View findViewById2 = findViewById(vq1.b.description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48814b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(vq1.b.image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48815c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(vq1.b.card);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48816d = (CardView) findViewById4;
    }

    public final void L(String titleText, String descriptionText, String imageUrl, String url) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        pk.a0.p(this.f48813a, titleText);
        pk.a0.p(this.f48814b, descriptionText);
        this.f48815c.loadUrl(imageUrl);
        this.f48816d.setOnClickListener(new fd1.e(this, url, 7));
    }

    public final void T(u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f48817e = eventIntake;
    }
}
