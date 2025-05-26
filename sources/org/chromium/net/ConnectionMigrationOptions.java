package org.chromium.net;

/* loaded from: classes4.dex */
public class ConnectionMigrationOptions {
    private final Boolean mAllowNonDefaultNetworkUsage;
    private final Boolean mAllowServerMigration;
    private final Boolean mEnableDefaultNetworkMigration;
    private final Boolean mEnablePathDegradationMigration;
    private final Long mIdleMigrationPeriodSeconds;
    private final Integer mMaxPathDegradingEagerMigrationsCount;
    private final Long mMaxTimeOnNonDefaultNetworkSeconds;
    private final Integer mMaxWriteErrorEagerMigrationsCount;
    private final Boolean mMigrateIdleConnections;
    private final Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

    public static class Builder {
        private Boolean mAllowNonDefaultNetworkUsage;
        private Boolean mAllowServerMigration;
        private Boolean mEnableDefaultNetworkConnectionMigration;
        private Boolean mEnablePathDegradationMigration;
        private Long mIdleConnectionMigrationPeriodSeconds;
        private Integer mMaxPathDegradingEagerMigrationsCount;
        private Long mMaxTimeOnNonDefaultNetworkSeconds;
        private Integer mMaxWriteErrorEagerMigrationsCount;
        private Boolean mMigrateIdleConnections;
        private Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

        @Experimental
        public Builder allowNonDefaultNetworkUsage(boolean z13) {
            this.mAllowNonDefaultNetworkUsage = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder allowServerMigration(boolean z13) {
            this.mAllowServerMigration = Boolean.valueOf(z13);
            return this;
        }

        public ConnectionMigrationOptions build() {
            return new ConnectionMigrationOptions(this);
        }

        public Builder enableDefaultNetworkMigration(boolean z13) {
            this.mEnableDefaultNetworkConnectionMigration = Boolean.valueOf(z13);
            return this;
        }

        public Builder enablePathDegradationMigration(boolean z13) {
            this.mEnablePathDegradationMigration = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder migrateIdleConnections(boolean z13) {
            this.mMigrateIdleConnections = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder retryPreHandshakeErrorsOnNonDefaultNetwork(boolean z13) {
            this.mRetryPreHandshakeErrorsOnAlternateNetwork = Boolean.valueOf(z13);
            return this;
        }

        @Experimental
        public Builder setIdleConnectionMigrationPeriodSeconds(long j13) {
            this.mIdleConnectionMigrationPeriodSeconds = Long.valueOf(j13);
            return this;
        }

        @Experimental
        public Builder setMaxPathDegradingNonDefaultNetworkMigrationsCount(int i13) {
            this.mMaxPathDegradingEagerMigrationsCount = Integer.valueOf(i13);
            return this;
        }

        @Experimental
        public Builder setMaxTimeOnNonDefaultNetworkSeconds(long j13) {
            this.mMaxTimeOnNonDefaultNetworkSeconds = Long.valueOf(j13);
            return this;
        }

        @Experimental
        public Builder setMaxWriteErrorNonDefaultNetworkMigrationsCount(int i13) {
            this.mMaxWriteErrorEagerMigrationsCount = Integer.valueOf(i13);
            return this;
        }
    }

    public @interface Experimental {
    }

    public ConnectionMigrationOptions(Builder builder) {
        this.mEnableDefaultNetworkMigration = builder.mEnableDefaultNetworkConnectionMigration;
        this.mEnablePathDegradationMigration = builder.mEnablePathDegradationMigration;
        this.mAllowServerMigration = builder.mAllowServerMigration;
        this.mMigrateIdleConnections = builder.mMigrateIdleConnections;
        this.mIdleMigrationPeriodSeconds = builder.mIdleConnectionMigrationPeriodSeconds;
        this.mRetryPreHandshakeErrorsOnAlternateNetwork = builder.mRetryPreHandshakeErrorsOnAlternateNetwork;
        this.mAllowNonDefaultNetworkUsage = builder.mAllowNonDefaultNetworkUsage;
        this.mMaxTimeOnNonDefaultNetworkSeconds = builder.mMaxTimeOnNonDefaultNetworkSeconds;
        this.mMaxWriteErrorEagerMigrationsCount = builder.mMaxWriteErrorEagerMigrationsCount;
        this.mMaxPathDegradingEagerMigrationsCount = builder.mMaxPathDegradingEagerMigrationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean getAllowNonDefaultNetworkUsage() {
        return this.mAllowNonDefaultNetworkUsage;
    }

    public Boolean getAllowServerMigration() {
        return this.mAllowServerMigration;
    }

    public Boolean getEnableDefaultNetworkMigration() {
        return this.mEnableDefaultNetworkMigration;
    }

    public Boolean getEnablePathDegradationMigration() {
        return this.mEnablePathDegradationMigration;
    }

    public Long getIdleMigrationPeriodSeconds() {
        return this.mIdleMigrationPeriodSeconds;
    }

    public Integer getMaxPathDegradingEagerMigrationsCount() {
        return this.mMaxPathDegradingEagerMigrationsCount;
    }

    public Long getMaxTimeOnNonDefaultNetworkSeconds() {
        return this.mMaxTimeOnNonDefaultNetworkSeconds;
    }

    public Integer getMaxWriteErrorEagerMigrationsCount() {
        return this.mMaxWriteErrorEagerMigrationsCount;
    }

    public Boolean getMigrateIdleConnections() {
        return this.mMigrateIdleConnections;
    }

    public Boolean getRetryPreHandshakeErrorsOnAlternateNetwork() {
        return this.mRetryPreHandshakeErrorsOnAlternateNetwork;
    }
}
