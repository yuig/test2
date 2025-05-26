package org.chromium.net;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public abstract class ICronetEngineBuilder {
    public static final int CONNECTION_MIGRATION_OPTIONS = 1;
    public static final int DNS_OPTIONS = 2;
    public static final int QUIC_OPTIONS = 3;

    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z13, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i13, int i14);

    public abstract ExperimentalCronetEngine build();

    public ICronetEngineBuilder enableBrotli(boolean z13) {
        return this;
    }

    public abstract ICronetEngineBuilder enableHttp2(boolean z13);

    public abstract ICronetEngineBuilder enableHttpCache(int i13, long j13);

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z13) {
        return this;
    }

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z13);

    public abstract ICronetEngineBuilder enableQuic(boolean z13);

    public abstract ICronetEngineBuilder enableSdch(boolean z13);

    public abstract String getDefaultUserAgent();

    public Set<Integer> getSupportedConfigOptions() {
        return Collections.emptySet();
    }

    public ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        return this;
    }

    public ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        return this;
    }

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        return this;
    }

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public ICronetEngineBuilder setThreadPriority(int i13) {
        return this;
    }

    public abstract ICronetEngineBuilder setUserAgent(String str);
}
