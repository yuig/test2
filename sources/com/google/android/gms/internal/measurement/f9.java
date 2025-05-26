package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class f9 implements c9 {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f31394a;

    /* renamed from: b, reason: collision with root package name */
    public static final x4 f31395b;

    /* renamed from: c, reason: collision with root package name */
    public static final x4 f31396c;

    static {
        b5 b5Var = new b5(null, s4.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        b5Var.a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f31394a = b5Var.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f31395b = b5Var.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f31396c = b5Var.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
