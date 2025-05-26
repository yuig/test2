package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.w0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48805a;

    /* renamed from: b, reason: collision with root package name */
    public final il1.a f48806b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f48807c;

    /* renamed from: d, reason: collision with root package name */
    public final vy.m f48808d;

    /* renamed from: e, reason: collision with root package name */
    public final View f48809e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f48810f;

    public f(Context context, il1.a fragmentFactory, w0 fragmentManager, vy.m analyticsApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f48805a = context;
        this.f48806b = fragmentFactory;
        this.f48807c = fragmentManager;
        this.f48808d = analyticsApi;
        View inflate = LayoutInflater.from(context).inflate(vq1.c.preload_modal, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f48809e = inflate;
        m60.w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f48810f = wVar;
        View findViewById = inflate.findViewById(vq1.b.preload_confirm_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        Intrinsics.f(gestaltButton);
        pk.a0.m(gestaltButton, new e(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = inflate.findViewById(vq1.b.preload_dismiss_button);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        Intrinsics.f(gestaltButton2);
        pk.a0.m(gestaltButton2, new e(this, 1));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        ((GestaltText) inflate.findViewById(vq1.b.title)).i(new e(this, 2));
        ((GestaltText) inflate.findViewById(vq1.b.description)).i(new e(this, 3));
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context, true);
        nVar.x(this.f48809e);
        return nVar;
    }
}
