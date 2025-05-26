package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class pa implements ma {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f31587a;

    /* renamed from: b, reason: collision with root package name */
    public static final x4 f31588b;

    static {
        b5 b5Var = new b5(null, s4.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        b5Var.a("measurement.redaction.app_instance_id", true);
        b5Var.a("measurement.redaction.client_ephemeral_aiid_generation", true);
        b5Var.a("measurement.redaction.config_redacted_fields", true);
        b5Var.a("measurement.redaction.device_info", true);
        b5Var.a("measurement.redaction.e_tag", true);
        b5Var.a("measurement.redaction.enhanced_uid", true);
        b5Var.a("measurement.redaction.populate_ephemeral_app_instance_id", true);
        b5Var.a("measurement.redaction.google_signals", true);
        b5Var.a("measurement.redaction.no_aiid_in_config_request", true);
        f31587a = b5Var.a("measurement.redaction.retain_major_os_version", true);
        f31588b = b5Var.a("measurement.redaction.scion_payload_generator", true);
        b5Var.a("measurement.redaction.upload_redacted_fields", true);
        b5Var.a("measurement.redaction.upload_subdomain_override", true);
        b5Var.a("measurement.redaction.user_id", true);
    }
}
