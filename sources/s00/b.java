package s00;

import bf2.d;
import cy.k;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import lh0.d3;
import m60.e;
import okhttp3.CookieJar;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import su1.i;
import tb.l;
import z10.c;
import z10.j;

/* loaded from: classes.dex */
public abstract class b implements d {
    public static OkHttpClient a(OkHttpClient baseClient, k networkMetricsCollector, c commonHeaderInterceptor, su1.b crashReportingInterceptor, j surfaceNameInterceptor, HttpLoggingInterceptor httpLoggingInterceptor, e applicationInfoProvider, CookieJar cookieJar, i networkInspectorSource, EventListener.Factory eventListenerFactory, l telemetryPreferences, z10.i requestValidationInterceptor, d3 experiments) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(networkMetricsCollector, "networkMetricsCollector");
        Intrinsics.checkNotNullParameter(commonHeaderInterceptor, "commonHeaderInterceptor");
        Intrinsics.checkNotNullParameter(crashReportingInterceptor, "crashReportingInterceptor");
        Intrinsics.checkNotNullParameter(surfaceNameInterceptor, "surfaceNameInterceptor");
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "httpLoggingInterceptor");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(networkInspectorSource, "networkInspectorSource");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        Intrinsics.checkNotNullParameter(requestValidationInterceptor, "requestValidationInterceptor");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        OkHttpClient.Builder builder = baseClient.newBuilder();
        ((g10.b) networkInspectorSource).getClass();
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        builder.f95678e = eventListenerFactory;
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        builder.f95683j = cookieJar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.c(30L, timeUnit);
        builder.e(30L, timeUnit);
        builder.f(30L, timeUnit);
        builder.a(commonHeaderInterceptor);
        builder.a(surfaceNameInterceptor);
        builder.a(crashReportingInterceptor);
        m60.d dVar = (m60.d) applicationInfoProvider;
        dVar.g();
        if (telemetryPreferences.w()) {
            builder.a(networkMetricsCollector.f53415f);
        }
        dVar.g();
        return new OkHttpClient(builder);
    }
}
