package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class bb implements ya {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f31309a;

    static {
        b5 b5Var = new b5(null, s4.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        b5Var.a("measurement.client.sessions.background_sessions_enabled", true);
        f31309a = b5Var.a("measurement.client.sessions.enable_fix_background_engagement", false);
        b5Var.a("measurement.client.sessions.immediate_start_enabled_foreground", true);
        b5Var.a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        b5Var.a("measurement.client.sessions.session_id_enabled", true);
        b5Var.b(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
