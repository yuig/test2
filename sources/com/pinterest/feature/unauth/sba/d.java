package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48787a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48788b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f48789c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f48790d;

    /* renamed from: e, reason: collision with root package name */
    public final CardView f48791e;

    /* renamed from: f, reason: collision with root package name */
    public final CardView f48792f;

    /* renamed from: g, reason: collision with root package name */
    public u50.r f48793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), vq1.c.interests_topic, this);
        View findViewById = findViewById(vq1.b.card1Text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48787a = (GestaltText) findViewById;
        View findViewById2 = findViewById(vq1.b.card2Text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48788b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(vq1.b.image_one);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48789c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(vq1.b.image_two);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48790d = (WebImageView) findViewById4;
        View findViewById5 = findViewById(vq1.b.card1);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48791e = (CardView) findViewById5;
        View findViewById6 = findViewById(vq1.b.card2);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48792f = (CardView) findViewById6;
    }

    public final void L(String interestOne, String interestTwo, String imageUrlOne, String imageUrlTwo) {
        Intrinsics.checkNotNullParameter(interestOne, "interestOne");
        Intrinsics.checkNotNullParameter(interestTwo, "interestTwo");
        Intrinsics.checkNotNullParameter(imageUrlOne, "imageUrlOne");
        Intrinsics.checkNotNullParameter(imageUrlTwo, "imageUrlTwo");
        pk.a0.p(this.f48787a, interestOne);
        pk.a0.p(this.f48788b, interestTwo);
        this.f48789c.loadUrl(imageUrlOne);
        this.f48790d.loadUrl(imageUrlTwo);
        Intrinsics.checkNotNullParameter(interestOne, "interestOne");
        Intrinsics.checkNotNullParameter(interestTwo, "interestTwo");
        String encode = URLEncoder.encode(interestOne, "UTF-8");
        String encode2 = URLEncoder.encode(interestTwo, "UTF-8");
        final String k13 = a.a.k("https://www.pinterest.com/search/pins/?q=", encode, "&ppm-unauth-android-experience=true");
        final String k14 = a.a.k("https://www.pinterest.com/search/pins/?q=", encode2, "&ppm-unauth-android-experience=true");
        final int i13 = 0;
        this.f48791e.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.unauth.sba.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f48777b;

            {
                this.f48777b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                String urlOne = k13;
                d this$0 = this.f48777b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(urlOne, "$urlOne");
                        u50.r rVar = this$0.f48793g;
                        if (rVar == null) {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                        Context context = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        rVar.a(new j(context, urlOne));
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(urlOne, "$urlTwo");
                        u50.r rVar2 = this$0.f48793g;
                        if (rVar2 == null) {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        rVar2.a(new j(context2, urlOne));
                        return;
                }
            }
        });
        final int i14 = 1;
        this.f48792f.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.unauth.sba.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f48777b;

            {
                this.f48777b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                String urlOne = k14;
                d this$0 = this.f48777b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(urlOne, "$urlOne");
                        u50.r rVar = this$0.f48793g;
                        if (rVar == null) {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                        Context context = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        rVar.a(new j(context, urlOne));
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(urlOne, "$urlTwo");
                        u50.r rVar2 = this$0.f48793g;
                        if (rVar2 == null) {
                            Intrinsics.r("eventIntake");
                            throw null;
                        }
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        rVar2.a(new j(context2, urlOne));
                        return;
                }
            }
        });
    }

    public final void T(u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f48793g = eventIntake;
    }
}
