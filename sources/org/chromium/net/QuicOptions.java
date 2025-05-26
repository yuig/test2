package org.chromium.net;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class QuicOptions {
    private final Set<String> mClientConnectionOptions;
    private final Boolean mCloseSessionsOnIpChange;
    private final Set<String> mConnectionOptions;
    private final Long mCryptoHandshakeTimeoutSeconds;
    private final Boolean mDelayJobsWithAvailableSpdySession;
    private final Boolean mEnableTlsZeroRtt;
    private final Set<String> mEnabledQuicVersions;
    private final Set<String> mExtraQuicheFlags;
    private final Boolean mGoawaySessionsOnIpChange;
    private final String mHandshakeUserAgent;
    private final Long mIdleConnectionTimeoutSeconds;
    private final Integer mInMemoryServerConfigsCacheSize;
    private final Boolean mIncreaseBrokenServicePeriodExponentially;
    private final Long mInitialBrokenServicePeriodSeconds;
    private final Long mPreCryptoHandshakeIdleTimeoutSeconds;
    private final Set<String> mQuicHostAllowlist;
    private final Long mRetransmittableOnWireTimeoutMillis;
    private final Boolean mRetryWithoutAltSvcOnQuicErrors;

    public static class Builder {
        private Boolean mCloseSessionsOnIpChange;
        private Long mCryptoHandshakeTimeoutSeconds;
        private Boolean mDelayJobsWithAvailableSpdySession;
        private Boolean mEnableTlsZeroRtt;
        private Boolean mGoawaySessionsOnIpChange;
        private String mHandshakeUserAgent;
        private Long mIdleConnectionTimeoutSeconds;
        private Integer mInMemoryServerConfigsCacheSize;
        private Boolean mIncreaseBrokenServicePeriodExponentially;
        private Long mInitialBrokenServicePeriodSeconds;
        private Long mPreCryptoHandshakeIdleTimeoutSeconds;
        private Long mRetransmittableOnWireTimeoutMillis;
        private Boolean mRetryWithoutAltSvcOnQuicErrors;
        private final Set<String> mQuicHostAllowlist = new LinkedHashSet();
        private final Set<String> mEnabledQuicVersions = new LinkedHashSet();
        private final Set<String> mConnectionOptions = new LinkedHashSet();
        private final Set<String> mClientConnectionOptions = new LinkedHashSet();
        private final Set<String> mExtraQuicheFlags = new LinkedHashSet();

        public Builder addAllowedQuicHost(String str) {
            this.mQuicHostAllowlist.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addClientConnectionOption(String str) {
            this.mClientConnectionOptions.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addConnectionOption(String str) {
            this.mConnectionOptions.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addEnabledQuicVersion(String str) {
            this.mEnabledQuicVersions.add(str);
            return this;
        }

        @QuichePassthroughOption
        public Builder addExtraQuicheFlag(String str) {
            this.mExtraQuicheFlags.add(str);
            return this;
        }

        public QuicOptions build() {
            return new QuicOptions(this);
        }

        @Experimental
        public Builder closeSessionsOnIpChange(boolean z13) {
            this.mCloseSessionsOnIpChange = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder delayJobsWithAvailableSpdySession(boolean z13) {
            this.mDelayJobsWithAvailableSpdySession = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder enableTlsZeroRtt(boolean z13) {
            this.mEnableTlsZeroRtt = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder goawaySessionsOnIpChange(boolean z13) {
            this.mGoawaySessionsOnIpChange = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder increaseBrokenServicePeriodExponentially(boolean z13) {
            this.mIncreaseBrokenServicePeriodExponentially = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder retryWithoutAltSvcOnQuicErrors(boolean z13) {
            this.mRetryWithoutAltSvcOnQuicErrors = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder setCryptoHandshakeTimeoutSeconds(long j13) {
            this.mCryptoHandshakeTimeoutSeconds = Long.valueOf(j13);
            return this;
        }

        public Builder setHandshakeUserAgent(String str) {
            this.mHandshakeUserAgent = str;
            return this;
        }

        public Builder setIdleConnectionTimeoutSeconds(long j13) {
            this.mIdleConnectionTimeoutSeconds = Long.valueOf(j13);
            return this;
        }

        public Builder setInMemoryServerConfigsCacheSize(int i13) {
            this.mInMemoryServerConfigsCacheSize = Integer.valueOf(i13);
            return this;
        }

        @Experimental
        public Builder setInitialBrokenServicePeriodSeconds(long j13) {
            this.mInitialBrokenServicePeriodSeconds = Long.valueOf(j13);
            return this;
        }

        @Experimental
        public Builder setPreCryptoHandshakeIdleTimeoutSeconds(long j13) {
            this.mPreCryptoHandshakeIdleTimeoutSeconds = Long.valueOf(j13);
            return this;
        }

        @Experimental
        public Builder setRetransmittableOnWireTimeoutMillis(long j13) {
            this.mRetransmittableOnWireTimeoutMillis = Long.valueOf(j13);
            return this;
        }
    }

    public @interface Experimental {
    }

    public @interface QuichePassthroughOption {
    }

    public QuicOptions(Builder builder) {
        this.mQuicHostAllowlist = Collections.unmodifiableSet(new LinkedHashSet(builder.mQuicHostAllowlist));
        this.mEnabledQuicVersions = Collections.unmodifiableSet(new LinkedHashSet(builder.mEnabledQuicVersions));
        this.mConnectionOptions = Collections.unmodifiableSet(new LinkedHashSet(builder.mConnectionOptions));
        this.mClientConnectionOptions = Collections.unmodifiableSet(new LinkedHashSet(builder.mClientConnectionOptions));
        this.mInMemoryServerConfigsCacheSize = builder.mInMemoryServerConfigsCacheSize;
        this.mHandshakeUserAgent = builder.mHandshakeUserAgent;
        this.mRetryWithoutAltSvcOnQuicErrors = builder.mRetryWithoutAltSvcOnQuicErrors;
        this.mEnableTlsZeroRtt = builder.mEnableTlsZeroRtt;
        this.mPreCryptoHandshakeIdleTimeoutSeconds = builder.mPreCryptoHandshakeIdleTimeoutSeconds;
        this.mCryptoHandshakeTimeoutSeconds = builder.mCryptoHandshakeTimeoutSeconds;
        this.mIdleConnectionTimeoutSeconds = builder.mIdleConnectionTimeoutSeconds;
        this.mRetransmittableOnWireTimeoutMillis = builder.mRetransmittableOnWireTimeoutMillis;
        this.mCloseSessionsOnIpChange = builder.mCloseSessionsOnIpChange;
        this.mGoawaySessionsOnIpChange = builder.mGoawaySessionsOnIpChange;
        this.mInitialBrokenServicePeriodSeconds = builder.mInitialBrokenServicePeriodSeconds;
        this.mIncreaseBrokenServicePeriodExponentially = builder.mIncreaseBrokenServicePeriodExponentially;
        this.mDelayJobsWithAvailableSpdySession = builder.mDelayJobsWithAvailableSpdySession;
        this.mExtraQuicheFlags = Collections.unmodifiableSet(new LinkedHashSet(builder.mExtraQuicheFlags));
    }

    public static Builder builder() {
        return new Builder();
    }

    public Set<String> getClientConnectionOptions() {
        return this.mClientConnectionOptions;
    }

    public Boolean getCloseSessionsOnIpChange() {
        return this.mCloseSessionsOnIpChange;
    }

    public Set<String> getConnectionOptions() {
        return this.mConnectionOptions;
    }

    public Long getCryptoHandshakeTimeoutSeconds() {
        return this.mCryptoHandshakeTimeoutSeconds;
    }

    public Boolean getDelayJobsWithAvailableSpdySession() {
        return this.mDelayJobsWithAvailableSpdySession;
    }

    public Boolean getEnableTlsZeroRtt() {
        return this.mEnableTlsZeroRtt;
    }

    public Set<String> getEnabledQuicVersions() {
        return this.mEnabledQuicVersions;
    }

    public Set<String> getExtraQuicheFlags() {
        return this.mExtraQuicheFlags;
    }

    public Boolean getGoawaySessionsOnIpChange() {
        return this.mGoawaySessionsOnIpChange;
    }

    public String getHandshakeUserAgent() {
        return this.mHandshakeUserAgent;
    }

    public Long getIdleConnectionTimeoutSeconds() {
        return this.mIdleConnectionTimeoutSeconds;
    }

    public Integer getInMemoryServerConfigsCacheSize() {
        return this.mInMemoryServerConfigsCacheSize;
    }

    public Boolean getIncreaseBrokenServicePeriodExponentially() {
        return this.mIncreaseBrokenServicePeriodExponentially;
    }

    public Long getInitialBrokenServicePeriodSeconds() {
        return this.mInitialBrokenServicePeriodSeconds;
    }

    public Long getPreCryptoHandshakeIdleTimeoutSeconds() {
        return this.mPreCryptoHandshakeIdleTimeoutSeconds;
    }

    public Set<String> getQuicHostAllowlist() {
        return this.mQuicHostAllowlist;
    }

    public Long getRetransmittableOnWireTimeoutMillis() {
        return this.mRetransmittableOnWireTimeoutMillis;
    }

    public Boolean getRetryWithoutAltSvcOnQuicErrors() {
        return this.mRetryWithoutAltSvcOnQuicErrors;
    }
}
