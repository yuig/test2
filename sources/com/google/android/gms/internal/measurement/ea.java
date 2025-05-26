package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class ea implements fa {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f31376a;

    /* renamed from: b, reason: collision with root package name */
    public static final a5 f31377b;

    /* renamed from: c, reason: collision with root package name */
    public static final y4 f31378c;

    /* renamed from: d, reason: collision with root package name */
    public static final y4 f31379d;

    /* renamed from: e, reason: collision with root package name */
    public static final z4 f31380e;

    static {
        b5 b5Var = new b5(null, s4.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        f31376a = b5Var.a("measurement.test.boolean_flag", false);
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = v4.f31663g;
        f31377b = new a5(b5Var, "measurement.test.double_flag", valueOf);
        f31378c = b5Var.b(-2L, "measurement.test.int_flag");
        f31379d = b5Var.b(-1L, "measurement.test.long_flag");
        f31380e = b5Var.c("measurement.test.string_flag", "---");
    }
}
