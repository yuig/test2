package oi1;

import com.pinterest.api.model.f30;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(f30 f30Var, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        hashMap.put("is_third_party_ad", String.valueOf(f30Var != null ? Intrinsics.d(f30Var.i5(), Boolean.TRUE) : false));
    }

    public static final void b(HashMap hashMap, boolean z13, f30 f30Var, Integer num, boolean z14, b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        if (z13) {
            Pair pair = new Pair("shopping_ad_ce_types", "slideshow_animation");
            pinAuxHelper.getClass();
            b0.g(hashMap, pair);
            if (!z14 || f30Var == null) {
                return;
            }
            b0.g(hashMap, new Pair("shopping_ad_slideshow_index", String.valueOf(num)));
        }
    }
}
