package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;
import we1.n1;

/* loaded from: classes5.dex */
public final class h extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton f48820a;

    /* renamed from: b, reason: collision with root package name */
    public u50.r f48821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), vq1.c.unauth_experience_footer, this);
        View findViewById = findViewById(vq1.b.footer_signup_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48820a = (GestaltButton) findViewById;
    }

    public final void a() {
        pk.a0.m(this.f48820a, new n1(this, 20));
    }

    public final void b(u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f48821b = eventIntake;
    }
}
