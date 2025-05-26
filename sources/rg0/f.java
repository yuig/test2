package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final int f107998c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107999d;

    /* renamed from: e, reason: collision with root package name */
    public final int f108000e;

    /* renamed from: f, reason: collision with root package name */
    public final String f108001f;

    /* renamed from: g, reason: collision with root package name */
    public final int f108002g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vd0.c json) {
        super(null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        this.f107998c = json.j(0, "clicks_count");
        String o13 = json.o("image_url", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f107999d = o13;
        this.f108000e = json.j(0, "impressions_count");
        String o14 = json.o("pin_id", "");
        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
        this.f108001f = o14;
        this.f108002g = json.j(0, "saves_count");
    }

    public final int c() {
        return this.f107998c;
    }

    public final String d() {
        return this.f107999d;
    }

    public final int e() {
        return this.f108000e;
    }

    public final String f() {
        return this.f108001f;
    }

    public final int g() {
        return this.f108002g;
    }
}
