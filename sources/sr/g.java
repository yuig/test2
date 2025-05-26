package sr;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final us1.a f115056a;

    /* renamed from: b, reason: collision with root package name */
    public final vy.m f115057b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.b f115058c;

    public g(us1.a activity, lu1.b baseActivityHelper, vy.m analyticsApi) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f115056a = activity;
        this.f115058c = baseActivityHelper;
        this.f115057b = analyticsApi;
    }

    public g(us1.a activity, vy.m analyticsApi, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f115056a = activity;
        this.f115057b = analyticsApi;
        this.f115058c = baseActivityHelper;
    }
}
