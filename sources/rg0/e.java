package rg0;

import kotlin.jvm.internal.Intrinsics;
import so.na;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final s f107983a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f107984b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.f0 f107985c;

    /* renamed from: d, reason: collision with root package name */
    public final wk2.a f107986d;

    /* renamed from: e, reason: collision with root package name */
    public final uh0.c f107987e;

    /* renamed from: f, reason: collision with root package name */
    public final vy.m f107988f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107989g;

    public e(s experiences, m60.w eventManager, nx.f0 pinalyticsFactory, na topContextProvider, uh0.c expressSurveyHelper, vy.m analyticsApi) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(topContextProvider, "topContextProvider");
        Intrinsics.checkNotNullParameter(expressSurveyHelper, "expressSurveyHelper");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f107983a = experiences;
        this.f107984b = eventManager;
        this.f107985c = pinalyticsFactory;
        this.f107986d = topContextProvider;
        this.f107987e = expressSurveyHelper;
        this.f107988f = analyticsApi;
    }
}
