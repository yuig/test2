package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.z3;

/* loaded from: classes.dex */
public final class e extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final lh0.t0 f109734g;

    static {
        new com.google.android.gms.common.api.d(23, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qr.h webhookDeeplinkUtil, lh0.t0 experiments) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f109734g = experiments;
    }

    @Override // rr.d0
    public final String a() {
        return "ad_preview";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        String replace = path != null ? new Regex(".*/(\\d{10,20})/.*").replace(path, "$1") : null;
        if (replace != null) {
            String queryParameter = uri.getQueryParameter("orderline_product_code");
            lh0.t0 t0Var = this.f109734g;
            t0Var.getClass();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) t0Var.f83480a;
            NavigationImpl z03 = Navigation.z0(((g1Var.o("android_premiere_spotlight_ad_preview", "enabled", z3Var) || g1Var.l("android_premiere_spotlight_ad_preview")) && Intrinsics.d("PSSPCPD", queryParameter)) ? com.pinterest.screens.g1.C() : com.pinterest.screens.g1.x(), replace);
            z03.m0("override", uri.toString());
            this.f109723a.m(z03);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        String path;
        Intrinsics.checkNotNullParameter(uri, "uri");
        lh0.t0 t0Var = this.f109734g;
        t0Var.getClass();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) t0Var.f83480a;
        if (!g1Var.o("android_promoted_pin_preview", "enabled", z3Var) && !g1Var.l("android_promoted_pin_preview")) {
            return false;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return StringsKt.E(uri2, "ad_preview", false) && (path = uri.getPath()) != null && path.length() > 1;
    }
}
