package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.content.res.Resources;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q f48457a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f48458b;

    static {
        Pair pair = new Pair(1, d.f48430b);
        Pair pair2 = new Pair(2, c.f48429b);
        f fVar = f.f48433b;
        f48458b = z0.g(pair, pair2, new Pair(3, fVar), new Pair(4, h.f48435b), new Pair(5, fVar), new Pair(6, g.f48434b));
    }

    public static int a(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = z13 ? b62.a.sharesheet_reserved_height_with_contacts : b62.a.sharesheet_reserved_height_no_contacts;
        Intrinsics.checkNotNullParameter(context, "context");
        return ((int) (hf0.b.d(bs1.c.k0(context)) * 0.85d)) - bs1.c.V(context, i13);
    }

    public static int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Resources.getSystem().getDisplayMetrics().widthPixels - (bs1.c.V(context, b62.a.preview_carousel_horizontal_margin) * 2);
    }
}
