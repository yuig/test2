package uz1;

import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f123314a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.q f123315b;

    /* renamed from: c, reason: collision with root package name */
    public final com.pinterest.pushnotification.d f123316c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f123317d;

    public u(d0 pinalytics, com.google.firebase.messaging.q graphQLAnalyticsDataSource, b20.c gcmRegistrationPreferences, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(graphQLAnalyticsDataSource, "graphQLAnalyticsDataSource");
        Intrinsics.checkNotNullParameter(gcmRegistrationPreferences, "gcmRegistrationPreferences");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f123314a = pinalytics;
        this.f123315b = graphQLAnalyticsDataSource;
        this.f123316c = gcmRegistrationPreferences;
        this.f123317d = crashReporting;
    }
}
