package org.chromium.net;

import com.google.protobuf.o1;
import com.google.protobuf.p1;

/* loaded from: classes2.dex */
public interface RequestContextConfigOptionsOrBuilder extends p1 {
    boolean getBrotliEnabled();

    boolean getBypassPublicKeyPinningForLocalTrustAnchors();

    @Override // com.google.protobuf.p1
    /* synthetic */ o1 getDefaultInstanceForType();

    boolean getDisableCache();

    boolean getEnableNetworkQualityEstimator();

    String getExperimentalOptions();

    com.google.protobuf.l getExperimentalOptionsBytes();

    boolean getHttp2Enabled();

    long getHttpCacheMaxSize();

    int getHttpCacheMode();

    long getMockCertVerifier();

    int getNetworkThreadPriority();

    String getQuicDefaultUserAgentId();

    com.google.protobuf.l getQuicDefaultUserAgentIdBytes();

    boolean getQuicEnabled();

    String getStoragePath();

    com.google.protobuf.l getStoragePathBytes();

    String getUserAgent();

    com.google.protobuf.l getUserAgentBytes();

    boolean hasBrotliEnabled();

    boolean hasBypassPublicKeyPinningForLocalTrustAnchors();

    boolean hasDisableCache();

    boolean hasEnableNetworkQualityEstimator();

    boolean hasExperimentalOptions();

    boolean hasHttp2Enabled();

    boolean hasHttpCacheMaxSize();

    boolean hasHttpCacheMode();

    boolean hasMockCertVerifier();

    boolean hasNetworkThreadPriority();

    boolean hasQuicDefaultUserAgentId();

    boolean hasQuicEnabled();

    boolean hasStoragePath();

    boolean hasUserAgent();

    /* synthetic */ boolean isInitialized();
}
