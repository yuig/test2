package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class i8 implements j8 {
    public static final z4 A;
    public static final y4 B;
    public static final y4 C;
    public static final y4 D;
    public static final y4 E;
    public static final y4 F;
    public static final y4 G;
    public static final y4 H;
    public static final y4 I;

    /* renamed from: J, reason: collision with root package name */
    public static final y4 f31440J;
    public static final y4 K;
    public static final y4 L;
    public static final y4 M;
    public static final y4 N;
    public static final y4 O;
    public static final y4 P;
    public static final y4 Q;
    public static final y4 R;
    public static final z4 S;
    public static final y4 T;
    public static final z4 U;

    /* renamed from: a, reason: collision with root package name */
    public static final y4 f31441a;

    /* renamed from: b, reason: collision with root package name */
    public static final y4 f31442b;

    /* renamed from: c, reason: collision with root package name */
    public static final y4 f31443c;

    /* renamed from: d, reason: collision with root package name */
    public static final y4 f31444d;

    /* renamed from: e, reason: collision with root package name */
    public static final z4 f31445e;

    /* renamed from: f, reason: collision with root package name */
    public static final z4 f31446f;

    /* renamed from: g, reason: collision with root package name */
    public static final y4 f31447g;

    /* renamed from: h, reason: collision with root package name */
    public static final z4 f31448h;

    /* renamed from: i, reason: collision with root package name */
    public static final y4 f31449i;

    /* renamed from: j, reason: collision with root package name */
    public static final y4 f31450j;

    /* renamed from: k, reason: collision with root package name */
    public static final y4 f31451k;

    /* renamed from: l, reason: collision with root package name */
    public static final y4 f31452l;

    /* renamed from: m, reason: collision with root package name */
    public static final y4 f31453m;

    /* renamed from: n, reason: collision with root package name */
    public static final y4 f31454n;

    /* renamed from: o, reason: collision with root package name */
    public static final y4 f31455o;

    /* renamed from: p, reason: collision with root package name */
    public static final y4 f31456p;

    /* renamed from: q, reason: collision with root package name */
    public static final y4 f31457q;

    /* renamed from: r, reason: collision with root package name */
    public static final y4 f31458r;

    /* renamed from: s, reason: collision with root package name */
    public static final z4 f31459s;

    /* renamed from: t, reason: collision with root package name */
    public static final y4 f31460t;

    /* renamed from: u, reason: collision with root package name */
    public static final y4 f31461u;

    /* renamed from: v, reason: collision with root package name */
    public static final y4 f31462v;

    /* renamed from: w, reason: collision with root package name */
    public static final y4 f31463w;

    /* renamed from: x, reason: collision with root package name */
    public static final z4 f31464x;

    /* renamed from: y, reason: collision with root package name */
    public static final z4 f31465y;

    /* renamed from: z, reason: collision with root package name */
    public static final z4 f31466z;

    static {
        b5 b5Var = new b5(null, s4.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        f31441a = b5Var.b(10000L, "measurement.ad_id_cache_time");
        f31442b = b5Var.b(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time");
        f31443c = b5Var.b(100L, "measurement.max_bundles_per_iteration");
        f31444d = b5Var.b(86400000L, "measurement.config.cache_time");
        b5Var.c("measurement.log_tag", "FA");
        f31445e = b5Var.c("measurement.config.url_authority", "app-measurement.com");
        f31446f = b5Var.c("measurement.config.url_scheme", "https");
        f31447g = b5Var.b(1000L, "measurement.upload.debug_upload_interval");
        f31448h = b5Var.c("measurement.rb.attribution.event_params", "value|currency");
        f31449i = b5Var.b(4L, "measurement.lifetimevalue.max_currency_tracked");
        f31450j = b5Var.b(100L, "measurement.upload.max_event_parameter_value_length");
        f31451k = b5Var.b(100000L, "measurement.store.max_stored_events_per_app");
        f31452l = b5Var.b(50L, "measurement.experiment.max_ids");
        f31453m = b5Var.b(200L, "measurement.audience.filter_result_max_count");
        f31454n = b5Var.b(27L, "measurement.upload.max_item_scoped_custom_parameters");
        f31455o = b5Var.b(7L, "measurement.rb.attribution.client.min_ad_services_version");
        f31456p = b5Var.b(60000L, "measurement.alarm_manager.minimum_interval");
        f31457q = b5Var.b(500L, "measurement.upload.minimum_delay");
        f31458r = b5Var.b(86400000L, "measurement.monitoring.sample_period_millis");
        f31459s = b5Var.c("measurement.rb.attribution.app_allowlist", "");
        f31460t = b5Var.b(10000L, "measurement.upload.realtime_upload_interval");
        f31461u = b5Var.b(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        b5Var.b(3600000L, "measurement.config.cache_time.service");
        f31462v = b5Var.b(5000L, "measurement.service_client.idle_disconnect_millis");
        b5Var.c("measurement.log_tag.service", "FA-SVC");
        f31463w = b5Var.b(86400000L, "measurement.upload.stale_data_deletion_interval");
        f31464x = b5Var.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        f31465y = b5Var.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f31466z = b5Var.c("measurement.rb.attribution.query_parameters_to_remove", "");
        A = b5Var.c("measurement.rb.attribution.uri_scheme", "https");
        B = b5Var.b(604800000L, "measurement.sdk.attribution.cache.ttl");
        C = b5Var.b(7200000L, "measurement.redaction.app_instance_id.ttl");
        D = b5Var.b(43200000L, "measurement.upload.backoff_period");
        E = b5Var.b(15000L, "measurement.upload.initial_upload_delay_time");
        F = b5Var.b(3600000L, "measurement.upload.interval");
        G = b5Var.b(65536L, "measurement.upload.max_bundle_size");
        H = b5Var.b(100L, "measurement.upload.max_bundles");
        I = b5Var.b(500L, "measurement.upload.max_conversions_per_day");
        f31440J = b5Var.b(1000L, "measurement.upload.max_error_events_per_day");
        K = b5Var.b(1000L, "measurement.upload.max_events_per_bundle");
        L = b5Var.b(100000L, "measurement.upload.max_events_per_day");
        M = b5Var.b(50000L, "measurement.upload.max_public_events_per_day");
        N = b5Var.b(2419200000L, "measurement.upload.max_queue_time");
        O = b5Var.b(10L, "measurement.upload.max_realtime_events_per_day");
        P = b5Var.b(65536L, "measurement.upload.max_batch_size");
        Q = b5Var.b(6L, "measurement.upload.retry_count");
        R = b5Var.b(1800000L, "measurement.upload.retry_time");
        S = b5Var.c("measurement.upload.url", "https://app-measurement.com/a");
        T = b5Var.b(3600000L, "measurement.upload.window_interval");
        U = b5Var.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }
}
