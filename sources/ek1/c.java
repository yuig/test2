package ek1;

import android.util.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f59220a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.o f59221b;

    public c(tb0.h crashReporting, nm.o pinterestGson) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(pinterestGson, "pinterestGson");
        this.f59220a = crashReporting;
        this.f59221b = pinterestGson;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, h0 request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        for (cs.a aVar : request.f59238a) {
            this.f59220a.k("MODULARIZATION_DISCREPANCY", kotlin.collections.f0.l(new Pair("field_name", aVar.b()), new Pair("legacy_result", String.valueOf(aVar.c())), new Pair("modularization_result", String.valueOf(aVar.d())), new Pair("pin_uid", aVar.f()), new Pair("is_3p_ad", String.valueOf(aVar.g())), new Pair("pin_ad_data", this.f59221b.k(aVar.a())), new Pair("pin_promotion_id", aVar.e())));
        }
    }
}
