package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f108003c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108004d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108005e;

    /* renamed from: f, reason: collision with root package name */
    public final long f108006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(vd0.c json) {
        super(null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        String o13 = json.o("text", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f108003c = o13;
        String o14 = json.o("button_text", "");
        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
        this.f108004d = o14;
        String o15 = json.o("image_url", "");
        Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
        this.f108005e = o15;
        this.f108006f = json.n(0L, "duration_in_seconds");
    }
}
