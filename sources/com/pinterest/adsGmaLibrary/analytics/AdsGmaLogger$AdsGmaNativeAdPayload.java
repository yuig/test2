package com.pinterest.adsGmaLibrary.analytics;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020\u0013¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J´\u0001\u0010%\u001a\u00020$2\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0004J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b1\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b2\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b3\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b4\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b5\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b6\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\b7\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b8\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b;\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b<\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b=\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b>\u0010\u0004R\u001a\u0010#\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010?\u001a\u0004\b@\u0010\u0015¨\u0006C"}, d2 = {"com/pinterest/adsGmaLibrary/analytics/AdsGmaLogger$AdsGmaNativeAdPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "()Ljava/lang/Long;", "component10", "component11", "component12", "component13", "", "component14", "()D", "eventName", "adUnitIds", "mediaType", "adCreativeType", "hasVideoContent", "hasImageContent", "failReason", "aspectRatioFromNativeAd", "gmaAdLoadDuration", "videoDuration", "hasIcon", "advertiserName", "headline", "powerScore", "Lcom/pinterest/adsGmaLibrary/analytics/AdsGmaLogger$AdsGmaNativeAdPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/pinterest/adsGmaLibrary/analytics/AdsGmaLogger$AdsGmaNativeAdPayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "getAdUnitIds", "getMediaType", "getAdCreativeType", "getHasVideoContent", "getHasImageContent", "getFailReason", "getAspectRatioFromNativeAd", "Ljava/lang/Long;", "getGmaAdLoadDuration", "getVideoDuration", "getHasIcon", "getAdvertiserName", "getHeadline", "D", "getPowerScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "adsGmaLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class AdsGmaLogger$AdsGmaNativeAdPayload extends BaseAdsPayload {

    @b("ad_creative_type")
    private final String adCreativeType;

    @b("ad_unit_ids")
    private final String adUnitIds;

    @b("advertiser_name")
    private final String advertiserName;

    @b("aspect_ratio_from_native_ad")
    private final String aspectRatioFromNativeAd;

    @b("event_name")
    @NotNull
    private final String eventName;

    @b("fail_reason")
    private final String failReason;

    @b("gma_ad_load_duration")
    private final Long gmaAdLoadDuration;

    @b("has_icon")
    private final String hasIcon;

    @b("has_image_content")
    private final String hasImageContent;

    @b("has_video_content")
    private final String hasVideoContent;

    @b("headline")
    private final String headline;

    @b("media_type")
    private final String mediaType;

    @b("power_score")
    private final double powerScore;

    @b("video_duration")
    private final String videoDuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGmaLogger$AdsGmaNativeAdPayload(@NotNull String eventName, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l13, String str8, String str9, String str10, String str11, double d2) {
        super(wr.b.GMA);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.adUnitIds = str;
        this.mediaType = str2;
        this.adCreativeType = str3;
        this.hasVideoContent = str4;
        this.hasImageContent = str5;
        this.failReason = str6;
        this.aspectRatioFromNativeAd = str7;
        this.gmaAdLoadDuration = l13;
        this.videoDuration = str8;
        this.hasIcon = str9;
        this.advertiserName = str10;
        this.headline = str11;
        this.powerScore = d2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVideoDuration() {
        return this.videoDuration;
    }

    /* renamed from: component11, reason: from getter */
    public final String getHasIcon() {
        return this.hasIcon;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAdvertiserName() {
        return this.advertiserName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* renamed from: component14, reason: from getter */
    public final double getPowerScore() {
        return this.powerScore;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdUnitIds() {
        return this.adUnitIds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAdCreativeType() {
        return this.adCreativeType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHasVideoContent() {
        return this.hasVideoContent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHasImageContent() {
        return this.hasImageContent;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFailReason() {
        return this.failReason;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAspectRatioFromNativeAd() {
        return this.aspectRatioFromNativeAd;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getGmaAdLoadDuration() {
        return this.gmaAdLoadDuration;
    }

    @NotNull
    public final AdsGmaLogger$AdsGmaNativeAdPayload copy(@NotNull String eventName, String adUnitIds, String mediaType, String adCreativeType, String hasVideoContent, String hasImageContent, String failReason, String aspectRatioFromNativeAd, Long gmaAdLoadDuration, String videoDuration, String hasIcon, String advertiserName, String headline, double powerScore) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AdsGmaLogger$AdsGmaNativeAdPayload(eventName, adUnitIds, mediaType, adCreativeType, hasVideoContent, hasImageContent, failReason, aspectRatioFromNativeAd, gmaAdLoadDuration, videoDuration, hasIcon, advertiserName, headline, powerScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsGmaLogger$AdsGmaNativeAdPayload)) {
            return false;
        }
        AdsGmaLogger$AdsGmaNativeAdPayload adsGmaLogger$AdsGmaNativeAdPayload = (AdsGmaLogger$AdsGmaNativeAdPayload) other;
        return Intrinsics.d(this.eventName, adsGmaLogger$AdsGmaNativeAdPayload.eventName) && Intrinsics.d(this.adUnitIds, adsGmaLogger$AdsGmaNativeAdPayload.adUnitIds) && Intrinsics.d(this.mediaType, adsGmaLogger$AdsGmaNativeAdPayload.mediaType) && Intrinsics.d(this.adCreativeType, adsGmaLogger$AdsGmaNativeAdPayload.adCreativeType) && Intrinsics.d(this.hasVideoContent, adsGmaLogger$AdsGmaNativeAdPayload.hasVideoContent) && Intrinsics.d(this.hasImageContent, adsGmaLogger$AdsGmaNativeAdPayload.hasImageContent) && Intrinsics.d(this.failReason, adsGmaLogger$AdsGmaNativeAdPayload.failReason) && Intrinsics.d(this.aspectRatioFromNativeAd, adsGmaLogger$AdsGmaNativeAdPayload.aspectRatioFromNativeAd) && Intrinsics.d(this.gmaAdLoadDuration, adsGmaLogger$AdsGmaNativeAdPayload.gmaAdLoadDuration) && Intrinsics.d(this.videoDuration, adsGmaLogger$AdsGmaNativeAdPayload.videoDuration) && Intrinsics.d(this.hasIcon, adsGmaLogger$AdsGmaNativeAdPayload.hasIcon) && Intrinsics.d(this.advertiserName, adsGmaLogger$AdsGmaNativeAdPayload.advertiserName) && Intrinsics.d(this.headline, adsGmaLogger$AdsGmaNativeAdPayload.headline) && Double.compare(this.powerScore, adsGmaLogger$AdsGmaNativeAdPayload.powerScore) == 0;
    }

    public final String getAdCreativeType() {
        return this.adCreativeType;
    }

    public final String getAdUnitIds() {
        return this.adUnitIds;
    }

    public final String getAdvertiserName() {
        return this.advertiserName;
    }

    public final String getAspectRatioFromNativeAd() {
        return this.aspectRatioFromNativeAd;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final String getFailReason() {
        return this.failReason;
    }

    public final Long getGmaAdLoadDuration() {
        return this.gmaAdLoadDuration;
    }

    public final String getHasIcon() {
        return this.hasIcon;
    }

    public final String getHasImageContent() {
        return this.hasImageContent;
    }

    public final String getHasVideoContent() {
        return this.hasVideoContent;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final double getPowerScore() {
        return this.powerScore;
    }

    public final String getVideoDuration() {
        return this.videoDuration;
    }

    public int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        String str = this.adUnitIds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adCreativeType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hasVideoContent;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hasImageContent;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.failReason;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.aspectRatioFromNativeAd;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l13 = this.gmaAdLoadDuration;
        int hashCode9 = (hashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str8 = this.videoDuration;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.hasIcon;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.advertiserName;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.headline;
        return Double.hashCode(this.powerScore) + ((hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.eventName;
        String str2 = this.adUnitIds;
        String str3 = this.mediaType;
        String str4 = this.adCreativeType;
        String str5 = this.hasVideoContent;
        String str6 = this.hasImageContent;
        String str7 = this.failReason;
        String str8 = this.aspectRatioFromNativeAd;
        Long l13 = this.gmaAdLoadDuration;
        String str9 = this.videoDuration;
        String str10 = this.hasIcon;
        String str11 = this.advertiserName;
        String str12 = this.headline;
        double d2 = this.powerScore;
        StringBuilder w13 = a.w("AdsGmaNativeAdPayload(eventName=", str, ", adUnitIds=", str2, ", mediaType=");
        a.B(w13, str3, ", adCreativeType=", str4, ", hasVideoContent=");
        a.B(w13, str5, ", hasImageContent=", str6, ", failReason=");
        a.B(w13, str7, ", aspectRatioFromNativeAd=", str8, ", gmaAdLoadDuration=");
        w13.append(l13);
        w13.append(", videoDuration=");
        w13.append(str9);
        w13.append(", hasIcon=");
        a.B(w13, str10, ", advertiserName=", str11, ", headline=");
        w13.append(str12);
        w13.append(", powerScore=");
        w13.append(d2);
        w13.append(")");
        return w13.toString();
    }
}
