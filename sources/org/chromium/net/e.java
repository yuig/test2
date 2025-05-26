package org.chromium.net;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97335b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f97334a = i13;
        this.f97335b = obj;
    }

    @Override // org.chromium.net.f
    public final void a(JSONObject jSONObject) {
        int i13 = this.f97334a;
        Object obj = this.f97335b;
        switch (i13) {
            case 0:
                ConnectionMigrationOptions connectionMigrationOptions = (ConnectionMigrationOptions) obj;
                JSONObject a13 = g.a("QUIC", jSONObject);
                if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                    a13.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
                }
                if (connectionMigrationOptions.getAllowServerMigration() != null) {
                    a13.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
                }
                if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                    a13.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
                }
                if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                    a13.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
                }
                if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                    a13.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
                }
                if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                    a13.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
                }
                if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                    a13.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                    a13.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                    boolean booleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                    if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                        boolean booleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                        if (!booleanValue && booleanValue2) {
                            throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                        }
                        if (booleanValue && booleanValue2) {
                            a13.put("migrate_sessions_early_v2", true);
                            return;
                        }
                        a13.put("migrate_sessions_early_v2", false);
                    }
                    a13.put("allow_port_migration", booleanValue);
                    return;
                }
                return;
            default:
                QuicOptions quicOptions = (QuicOptions) obj;
                JSONObject a14 = g.a("QUIC", jSONObject);
                if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                    a14.put("host_whitelist", String.join(",", quicOptions.getQuicHostAllowlist()));
                }
                if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                    a14.put("quic_version", String.join(",", quicOptions.getEnabledQuicVersions()));
                }
                if (!quicOptions.getConnectionOptions().isEmpty()) {
                    a14.put("connection_options", String.join(",", quicOptions.getConnectionOptions()));
                }
                if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                    a14.put("client_connection_options", String.join(",", quicOptions.getClientConnectionOptions()));
                }
                if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                    a14.put("set_quic_flags", String.join(",", quicOptions.getExtraQuicheFlags()));
                }
                if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                    a14.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
                }
                if (quicOptions.getHandshakeUserAgent() != null) {
                    a14.put("user_agent_id", quicOptions.getHandshakeUserAgent());
                }
                if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                    a14.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
                }
                if (quicOptions.getEnableTlsZeroRtt() != null) {
                    a14.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
                }
                if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                    a14.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
                }
                if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                    a14.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
                }
                if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                    a14.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
                }
                if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                    a14.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
                }
                if (quicOptions.getCloseSessionsOnIpChange() != null) {
                    a14.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
                }
                if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                    a14.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
                }
                if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                    a14.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
                }
                if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                    a14.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
                }
                if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                    a14.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
                    return;
                }
                return;
        }
    }
}
