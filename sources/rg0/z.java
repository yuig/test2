package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends ag2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(vd0.c json) {
        super(null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullExpressionValue(json.o("dismiss_button_text", ""), "optString(...)");
        Intrinsics.checkNotNullExpressionValue(json.o("title_text", ""), "optString(...)");
    }
}
