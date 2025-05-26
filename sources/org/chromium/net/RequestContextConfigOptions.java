package org.chromium.net;

import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.w1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.InputStream;
import java.nio.ByteBuffer;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class RequestContextConfigOptions extends n0 implements RequestContextConfigOptionsOrBuilder {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    private static final RequestContextConfigOptions DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile w1 PARSER = null;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean brotliEnabled_;
    private boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    private boolean disableCache_;
    private boolean enableNetworkQualityEstimator_;
    private boolean http2Enabled_;
    private long httpCacheMaxSize_;
    private int httpCacheMode_;
    private long mockCertVerifier_;
    private int networkThreadPriority_;
    private boolean quicEnabled_;
    private String userAgent_ = "";
    private String storagePath_ = "";
    private String quicDefaultUserAgentId_ = "";
    private String experimentalOptions_ = "";

    public static final class Builder extends i0 implements RequestContextConfigOptionsOrBuilder {
        public /* synthetic */ Builder(int i13) {
            this();
        }

        public Builder clearBrotliEnabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearBrotliEnabled();
            return this;
        }

        public Builder clearBypassPublicKeyPinningForLocalTrustAnchors() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearBypassPublicKeyPinningForLocalTrustAnchors();
            return this;
        }

        public Builder clearDisableCache() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearDisableCache();
            return this;
        }

        public Builder clearEnableNetworkQualityEstimator() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearEnableNetworkQualityEstimator();
            return this;
        }

        public Builder clearExperimentalOptions() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearExperimentalOptions();
            return this;
        }

        public Builder clearHttp2Enabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttp2Enabled();
            return this;
        }

        public Builder clearHttpCacheMaxSize() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttpCacheMaxSize();
            return this;
        }

        public Builder clearHttpCacheMode() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttpCacheMode();
            return this;
        }

        public Builder clearMockCertVerifier() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearMockCertVerifier();
            return this;
        }

        public Builder clearNetworkThreadPriority() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearNetworkThreadPriority();
            return this;
        }

        public Builder clearQuicDefaultUserAgentId() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearQuicDefaultUserAgentId();
            return this;
        }

        public Builder clearQuicEnabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearQuicEnabled();
            return this;
        }

        public Builder clearStoragePath() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearStoragePath();
            return this;
        }

        public Builder clearUserAgent() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearUserAgent();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getBrotliEnabled() {
            return ((RequestContextConfigOptions) this.instance).getBrotliEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((RequestContextConfigOptions) this.instance).getBypassPublicKeyPinningForLocalTrustAnchors();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getDisableCache() {
            return ((RequestContextConfigOptions) this.instance).getDisableCache();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getEnableNetworkQualityEstimator() {
            return ((RequestContextConfigOptions) this.instance).getEnableNetworkQualityEstimator();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getExperimentalOptions() {
            return ((RequestContextConfigOptions) this.instance).getExperimentalOptions();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.l getExperimentalOptionsBytes() {
            return ((RequestContextConfigOptions) this.instance).getExperimentalOptionsBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getHttp2Enabled() {
            return ((RequestContextConfigOptions) this.instance).getHttp2Enabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public long getHttpCacheMaxSize() {
            return ((RequestContextConfigOptions) this.instance).getHttpCacheMaxSize();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public int getHttpCacheMode() {
            return ((RequestContextConfigOptions) this.instance).getHttpCacheMode();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public long getMockCertVerifier() {
            return ((RequestContextConfigOptions) this.instance).getMockCertVerifier();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public int getNetworkThreadPriority() {
            return ((RequestContextConfigOptions) this.instance).getNetworkThreadPriority();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getQuicDefaultUserAgentId() {
            return ((RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.l getQuicDefaultUserAgentIdBytes() {
            return ((RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentIdBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getQuicEnabled() {
            return ((RequestContextConfigOptions) this.instance).getQuicEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getStoragePath() {
            return ((RequestContextConfigOptions) this.instance).getStoragePath();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.l getStoragePathBytes() {
            return ((RequestContextConfigOptions) this.instance).getStoragePathBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public String getUserAgent() {
            return ((RequestContextConfigOptions) this.instance).getUserAgent();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.l getUserAgentBytes() {
            return ((RequestContextConfigOptions) this.instance).getUserAgentBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasBrotliEnabled() {
            return ((RequestContextConfigOptions) this.instance).hasBrotliEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((RequestContextConfigOptions) this.instance).hasBypassPublicKeyPinningForLocalTrustAnchors();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasDisableCache() {
            return ((RequestContextConfigOptions) this.instance).hasDisableCache();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasEnableNetworkQualityEstimator() {
            return ((RequestContextConfigOptions) this.instance).hasEnableNetworkQualityEstimator();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasExperimentalOptions() {
            return ((RequestContextConfigOptions) this.instance).hasExperimentalOptions();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttp2Enabled() {
            return ((RequestContextConfigOptions) this.instance).hasHttp2Enabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMaxSize() {
            return ((RequestContextConfigOptions) this.instance).hasHttpCacheMaxSize();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMode() {
            return ((RequestContextConfigOptions) this.instance).hasHttpCacheMode();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasMockCertVerifier() {
            return ((RequestContextConfigOptions) this.instance).hasMockCertVerifier();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasNetworkThreadPriority() {
            return ((RequestContextConfigOptions) this.instance).hasNetworkThreadPriority();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicDefaultUserAgentId() {
            return ((RequestContextConfigOptions) this.instance).hasQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicEnabled() {
            return ((RequestContextConfigOptions) this.instance).hasQuicEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasStoragePath() {
            return ((RequestContextConfigOptions) this.instance).hasStoragePath();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasUserAgent() {
            return ((RequestContextConfigOptions) this.instance).hasUserAgent();
        }

        public Builder setBrotliEnabled(boolean z13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setBrotliEnabled(z13);
            return this;
        }

        public Builder setBypassPublicKeyPinningForLocalTrustAnchors(boolean z13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setBypassPublicKeyPinningForLocalTrustAnchors(z13);
            return this;
        }

        public Builder setDisableCache(boolean z13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setDisableCache(z13);
            return this;
        }

        public Builder setEnableNetworkQualityEstimator(boolean z13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setEnableNetworkQualityEstimator(z13);
            return this;
        }

        public Builder setExperimentalOptions(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setExperimentalOptions(str);
            return this;
        }

        public Builder setExperimentalOptionsBytes(com.google.protobuf.l lVar) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setExperimentalOptionsBytes(lVar);
            return this;
        }

        public Builder setHttp2Enabled(boolean z13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttp2Enabled(z13);
            return this;
        }

        public Builder setHttpCacheMaxSize(long j13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttpCacheMaxSize(j13);
            return this;
        }

        public Builder setHttpCacheMode(int i13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttpCacheMode(i13);
            return this;
        }

        public Builder setMockCertVerifier(long j13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setMockCertVerifier(j13);
            return this;
        }

        public Builder setNetworkThreadPriority(int i13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setNetworkThreadPriority(i13);
            return this;
        }

        public Builder setQuicDefaultUserAgentId(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentId(str);
            return this;
        }

        public Builder setQuicDefaultUserAgentIdBytes(com.google.protobuf.l lVar) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentIdBytes(lVar);
            return this;
        }

        public Builder setQuicEnabled(boolean z13) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicEnabled(z13);
            return this;
        }

        public Builder setStoragePath(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setStoragePath(str);
            return this;
        }

        public Builder setStoragePathBytes(com.google.protobuf.l lVar) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setStoragePathBytes(lVar);
            return this;
        }

        public Builder setUserAgent(String str) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setUserAgent(str);
            return this;
        }

        public Builder setUserAgentBytes(com.google.protobuf.l lVar) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setUserAgentBytes(lVar);
            return this;
        }

        private Builder() {
            super(RequestContextConfigOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        RequestContextConfigOptions requestContextConfigOptions = new RequestContextConfigOptions();
        DEFAULT_INSTANCE = requestContextConfigOptions;
        n0.registerDefaultInstance(RequestContextConfigOptions.class, requestContextConfigOptions);
    }

    private RequestContextConfigOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrotliEnabled() {
        this.bitField0_ &= -33;
        this.brotliEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassPublicKeyPinningForLocalTrustAnchors() {
        this.bitField0_ &= -4097;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableCache() {
        this.bitField0_ &= -65;
        this.disableCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableNetworkQualityEstimator() {
        this.bitField0_ &= -2049;
        this.enableNetworkQualityEstimator_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalOptions() {
        this.bitField0_ &= -513;
        this.experimentalOptions_ = getDefaultInstance().getExperimentalOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp2Enabled() {
        this.bitField0_ &= -17;
        this.http2Enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMaxSize() {
        this.bitField0_ &= -257;
        this.httpCacheMaxSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMode() {
        this.bitField0_ &= -129;
        this.httpCacheMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockCertVerifier() {
        this.bitField0_ &= -1025;
        this.mockCertVerifier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkThreadPriority() {
        this.bitField0_ &= -8193;
        this.networkThreadPriority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicDefaultUserAgentId() {
        this.bitField0_ &= -9;
        this.quicDefaultUserAgentId_ = getDefaultInstance().getQuicDefaultUserAgentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicEnabled() {
        this.bitField0_ &= -5;
        this.quicEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoragePath() {
        this.bitField0_ &= -3;
        this.storagePath_ = getDefaultInstance().getStoragePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.bitField0_ &= -2;
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public static RequestContextConfigOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestContextConfigOptions parseDelimitedFrom(InputStream inputStream) {
        return (RequestContextConfigOptions) n0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestContextConfigOptions parseFrom(ByteBuffer byteBuffer) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrotliEnabled(boolean z13) {
        this.bitField0_ |= 32;
        this.brotliEnabled_ = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassPublicKeyPinningForLocalTrustAnchors(boolean z13) {
        this.bitField0_ |= 4096;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCache(boolean z13) {
        this.bitField0_ |= 64;
        this.disableCache_ = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableNetworkQualityEstimator(boolean z13) {
        this.bitField0_ |= 2048;
        this.enableNetworkQualityEstimator_ = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptions(String str) {
        str.getClass();
        this.bitField0_ |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        this.experimentalOptions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptionsBytes(com.google.protobuf.l lVar) {
        this.experimentalOptions_ = lVar.r();
        this.bitField0_ |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp2Enabled(boolean z13) {
        this.bitField0_ |= 16;
        this.http2Enabled_ = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMaxSize(long j13) {
        this.bitField0_ |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        this.httpCacheMaxSize_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMode(int i13) {
        this.bitField0_ |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.httpCacheMode_ = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockCertVerifier(long j13) {
        this.bitField0_ |= 1024;
        this.mockCertVerifier_ = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkThreadPriority(int i13) {
        this.bitField0_ |= 8192;
        this.networkThreadPriority_ = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.quicDefaultUserAgentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentIdBytes(com.google.protobuf.l lVar) {
        this.quicDefaultUserAgentId_ = lVar.r();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicEnabled(boolean z13) {
        this.bitField0_ |= 4;
        this.quicEnabled_ = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePath(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.storagePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePathBytes(com.google.protobuf.l lVar) {
        this.storagePath_ = lVar.r();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(com.google.protobuf.l lVar) {
        this.userAgent_ = lVar.r();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.n0
    public final Object dynamicMethod(m0 m0Var, Object obj, Object obj2) {
        switch (w.f97472a[m0Var.ordinal()]) {
            case 1:
                return new RequestContextConfigOptions();
            case 2:
                return new Builder(0);
            case 3:
                return n0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r", new Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                w1 w1Var = PARSER;
                if (w1Var == null) {
                    synchronized (RequestContextConfigOptions.class) {
                        try {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new j0();
                                PARSER = w1Var;
                            }
                        } finally {
                        }
                    }
                }
                return w1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getBrotliEnabled() {
        return this.brotliEnabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
        return this.bypassPublicKeyPinningForLocalTrustAnchors_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getDisableCache() {
        return this.disableCache_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getEnableNetworkQualityEstimator() {
        return this.enableNetworkQualityEstimator_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getExperimentalOptions() {
        return this.experimentalOptions_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.l getExperimentalOptionsBytes() {
        return com.google.protobuf.l.e(this.experimentalOptions_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getHttp2Enabled() {
        return this.http2Enabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public long getHttpCacheMaxSize() {
        return this.httpCacheMaxSize_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public int getHttpCacheMode() {
        return this.httpCacheMode_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public long getMockCertVerifier() {
        return this.mockCertVerifier_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public int getNetworkThreadPriority() {
        return this.networkThreadPriority_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getQuicDefaultUserAgentId() {
        return this.quicDefaultUserAgentId_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.l getQuicDefaultUserAgentIdBytes() {
        return com.google.protobuf.l.e(this.quicDefaultUserAgentId_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getQuicEnabled() {
        return this.quicEnabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getStoragePath() {
        return this.storagePath_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.l getStoragePathBytes() {
        return com.google.protobuf.l.e(this.storagePath_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.l getUserAgentBytes() {
        return com.google.protobuf.l.e(this.userAgent_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasBrotliEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasDisableCache() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasEnableNetworkQualityEstimator() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasExperimentalOptions() {
        return (this.bitField0_ & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttp2Enabled() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMaxSize() {
        return (this.bitField0_ & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMode() {
        return (this.bitField0_ & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasMockCertVerifier() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasNetworkThreadPriority() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicDefaultUserAgentId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasStoragePath() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasUserAgent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RequestContextConfigOptions requestContextConfigOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(requestContextConfigOptions);
    }

    public static RequestContextConfigOptions parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) {
        return (RequestContextConfigOptions) n0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
    }

    public static RequestContextConfigOptions parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
    }

    public static RequestContextConfigOptions parseFrom(com.google.protobuf.l lVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, lVar);
    }

    public static RequestContextConfigOptions parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
    }

    public static RequestContextConfigOptions parseFrom(byte[] bArr) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestContextConfigOptions parseFrom(byte[] bArr, com.google.protobuf.y yVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
    }

    public static RequestContextConfigOptions parseFrom(InputStream inputStream) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestContextConfigOptions parseFrom(InputStream inputStream, com.google.protobuf.y yVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
    }

    public static RequestContextConfigOptions parseFrom(com.google.protobuf.p pVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RequestContextConfigOptions parseFrom(com.google.protobuf.p pVar, com.google.protobuf.y yVar) {
        return (RequestContextConfigOptions) n0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
    }
}
