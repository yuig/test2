package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

import ads_mobile_sdk.ci1;
import ads_mobile_sdk.ed2;
import ads_mobile_sdk.f80;
import ads_mobile_sdk.if1;
import ads_mobile_sdk.ki1;
import ads_mobile_sdk.lw0;
import ads_mobile_sdk.n1;
import ads_mobile_sdk.r0;
import ads_mobile_sdk.rw1;
import ads_mobile_sdk.ss2;
import ads_mobile_sdk.ty0;
import ads_mobile_sdk.vo;
import ads_mobile_sdk.xf1;
import androidx.annotation.Keep;
import bl2.c;
import cl2.a;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import java.util.Optional;
import kh2.m2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/nativead/InternalNativeAd;", "Lads_mobile_sdk/lw0;", "Ljava/util/Optional;", "Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "jsEngineContext", "Ljava/util/Optional;", "localJsEngineContext", "Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class InternalNativeAd extends lw0 {

    @Keep
    @NotNull
    private final Optional<PerAdNativeJavscriptEngineJsContext> jsEngineContext;

    @Keep
    private PerAdNativeJavscriptEngineJsContext localJsEngineContext;

    /* renamed from: n, reason: collision with root package name */
    public final if1 f32086n;

    /* renamed from: o, reason: collision with root package name */
    public final xf1 f32087o;

    /* renamed from: p, reason: collision with root package name */
    public final ci1 f32088p;

    /* renamed from: q, reason: collision with root package name */
    public final ki1 f32089q;

    /* renamed from: r, reason: collision with root package name */
    public final ty0 f32090r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalNativeAd(String adId, r0 adConfiguration, vo commonConfiguration, ss2 traceMetaSet, Optional webView, n1 adEventEmitter, f80 delegatingAdListener, if1 nativeAdAssets, xf1 nativeAdCore, ci1 nativeAdViewPopulator, ki1 nativeAdViewabilityTracker, ty0 internalMediaContent, Optional jsEngineContext, rw1 phantomReferences, ed2 safeBrowsingManager) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, webView, adEventEmitter, delegatingAdListener, phantomReferences, safeBrowsingManager);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdListener, "delegatingAdListener");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeAdViewPopulator, "nativeAdViewPopulator");
        Intrinsics.checkNotNullParameter(nativeAdViewabilityTracker, "nativeAdViewabilityTracker");
        Intrinsics.checkNotNullParameter(internalMediaContent, "internalMediaContent");
        Intrinsics.checkNotNullParameter(jsEngineContext, "jsEngineContext");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        this.f32086n = nativeAdAssets;
        this.f32087o = nativeAdCore;
        this.f32088p = nativeAdViewPopulator;
        this.f32089q = nativeAdViewabilityTracker;
        this.f32090r = internalMediaContent;
        this.jsEngineContext = jsEngineContext;
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) m2.U0(jsEngineContext);
    }

    @Override // ads_mobile_sdk.lw0, a.x5
    public final Object a(c cVar) {
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) m2.U0(this.jsEngineContext);
        Object a13 = super.a(cVar);
        return a13 == a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
