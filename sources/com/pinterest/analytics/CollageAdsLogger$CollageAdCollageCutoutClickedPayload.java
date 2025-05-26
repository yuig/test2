package com.pinterest.analytics;

import a.a;
import a.cb;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b2\u00103J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0086\u0001\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0004J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010\u0007R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b*\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b+\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b,\u0010\u0007R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b-\u0010\u0007R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b.\u0010\u0007R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b/\u0010\u0007R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b1\u0010\u0004¨\u00064"}, d2 = {"com/pinterest/analytics/CollageAdsLogger$CollageAdCollageCutoutClickedPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "()Ljava/lang/Boolean;", "component10", "pinId", "numberOfCutouts", "cutoutItemPinId", "cutoutPositionOnScreen", "clickPositionX", "clickPositionY", "screenWidth", "screenHeight", "isAdCloseupUi", "animationType", "Lcom/pinterest/analytics/CollageAdsLogger$CollageAdCollageCutoutClickedPayload;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/pinterest/analytics/CollageAdsLogger$CollageAdCollageCutoutClickedPayload;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPinId", "Ljava/lang/Integer;", "getNumberOfCutouts", "getCutoutItemPinId", "getCutoutPositionOnScreen", "getClickPositionX", "getClickPositionY", "getScreenWidth", "getScreenHeight", "Ljava/lang/Boolean;", "getAnimationType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "collagesLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class CollageAdsLogger$CollageAdCollageCutoutClickedPayload extends BaseAdsPayload {

    @b("animation_type")
    private final String animationType;

    @b("click_position_x")
    private final Integer clickPositionX;

    @b("click_position_y")
    private final Integer clickPositionY;

    @b("cutout_item_pin_id")
    private final String cutoutItemPinId;

    @b("cutout_position_on_screen")
    @NotNull
    private final String cutoutPositionOnScreen;

    @b("is_ad_closeup_ui")
    private final Boolean isAdCloseupUi;

    @b("number_of_cutouts")
    private final Integer numberOfCutouts;

    @b("pin_id")
    private final String pinId;

    @b("screen_height")
    private final Integer screenHeight;

    @b("screen_width")
    private final Integer screenWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageAdsLogger$CollageAdCollageCutoutClickedPayload(String str, Integer num, String str2, @NotNull String cutoutPositionOnScreen, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, String str3) {
        super(wr.b.COLLAGE_ADS);
        Intrinsics.checkNotNullParameter(cutoutPositionOnScreen, "cutoutPositionOnScreen");
        this.pinId = str;
        this.numberOfCutouts = num;
        this.cutoutItemPinId = str2;
        this.cutoutPositionOnScreen = cutoutPositionOnScreen;
        this.clickPositionX = num2;
        this.clickPositionY = num3;
        this.screenWidth = num4;
        this.screenHeight = num5;
        this.isAdCloseupUi = bool;
        this.animationType = str3;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAnimationType() {
        return this.animationType;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getNumberOfCutouts() {
        return this.numberOfCutouts;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCutoutItemPinId() {
        return this.cutoutItemPinId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCutoutPositionOnScreen() {
        return this.cutoutPositionOnScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getClickPositionX() {
        return this.clickPositionX;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getClickPositionY() {
        return this.clickPositionY;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getScreenWidth() {
        return this.screenWidth;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getScreenHeight() {
        return this.screenHeight;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsAdCloseupUi() {
        return this.isAdCloseupUi;
    }

    @NotNull
    public final CollageAdsLogger$CollageAdCollageCutoutClickedPayload copy(String pinId, Integer numberOfCutouts, String cutoutItemPinId, @NotNull String cutoutPositionOnScreen, Integer clickPositionX, Integer clickPositionY, Integer screenWidth, Integer screenHeight, Boolean isAdCloseupUi, String animationType) {
        Intrinsics.checkNotNullParameter(cutoutPositionOnScreen, "cutoutPositionOnScreen");
        return new CollageAdsLogger$CollageAdCollageCutoutClickedPayload(pinId, numberOfCutouts, cutoutItemPinId, cutoutPositionOnScreen, clickPositionX, clickPositionY, screenWidth, screenHeight, isAdCloseupUi, animationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollageAdsLogger$CollageAdCollageCutoutClickedPayload)) {
            return false;
        }
        CollageAdsLogger$CollageAdCollageCutoutClickedPayload collageAdsLogger$CollageAdCollageCutoutClickedPayload = (CollageAdsLogger$CollageAdCollageCutoutClickedPayload) other;
        return Intrinsics.d(this.pinId, collageAdsLogger$CollageAdCollageCutoutClickedPayload.pinId) && Intrinsics.d(this.numberOfCutouts, collageAdsLogger$CollageAdCollageCutoutClickedPayload.numberOfCutouts) && Intrinsics.d(this.cutoutItemPinId, collageAdsLogger$CollageAdCollageCutoutClickedPayload.cutoutItemPinId) && Intrinsics.d(this.cutoutPositionOnScreen, collageAdsLogger$CollageAdCollageCutoutClickedPayload.cutoutPositionOnScreen) && Intrinsics.d(this.clickPositionX, collageAdsLogger$CollageAdCollageCutoutClickedPayload.clickPositionX) && Intrinsics.d(this.clickPositionY, collageAdsLogger$CollageAdCollageCutoutClickedPayload.clickPositionY) && Intrinsics.d(this.screenWidth, collageAdsLogger$CollageAdCollageCutoutClickedPayload.screenWidth) && Intrinsics.d(this.screenHeight, collageAdsLogger$CollageAdCollageCutoutClickedPayload.screenHeight) && Intrinsics.d(this.isAdCloseupUi, collageAdsLogger$CollageAdCollageCutoutClickedPayload.isAdCloseupUi) && Intrinsics.d(this.animationType, collageAdsLogger$CollageAdCollageCutoutClickedPayload.animationType);
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    public final Integer getClickPositionX() {
        return this.clickPositionX;
    }

    public final Integer getClickPositionY() {
        return this.clickPositionY;
    }

    public final String getCutoutItemPinId() {
        return this.cutoutItemPinId;
    }

    @NotNull
    public final String getCutoutPositionOnScreen() {
        return this.cutoutPositionOnScreen;
    }

    public final Integer getNumberOfCutouts() {
        return this.numberOfCutouts;
    }

    public final String getPinId() {
        return this.pinId;
    }

    public final Integer getScreenHeight() {
        return this.screenHeight;
    }

    public final Integer getScreenWidth() {
        return this.screenWidth;
    }

    public int hashCode() {
        String str = this.pinId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.numberOfCutouts;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cutoutItemPinId;
        int d2 = cb.d(this.cutoutPositionOnScreen, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num2 = this.clickPositionX;
        int hashCode3 = (d2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.clickPositionY;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.screenWidth;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.screenHeight;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.isAdCloseupUi;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.animationType;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isAdCloseupUi() {
        return this.isAdCloseupUi;
    }

    @NotNull
    public String toString() {
        String str = this.pinId;
        Integer num = this.numberOfCutouts;
        String str2 = this.cutoutItemPinId;
        String str3 = this.cutoutPositionOnScreen;
        Integer num2 = this.clickPositionX;
        Integer num3 = this.clickPositionY;
        Integer num4 = this.screenWidth;
        Integer num5 = this.screenHeight;
        Boolean bool = this.isAdCloseupUi;
        String str4 = this.animationType;
        StringBuilder sb3 = new StringBuilder("CollageAdCollageCutoutClickedPayload(pinId=");
        sb3.append(str);
        sb3.append(", numberOfCutouts=");
        sb3.append(num);
        sb3.append(", cutoutItemPinId=");
        a.B(sb3, str2, ", cutoutPositionOnScreen=", str3, ", clickPositionX=");
        sb3.append(num2);
        sb3.append(", clickPositionY=");
        sb3.append(num3);
        sb3.append(", screenWidth=");
        sb3.append(num4);
        sb3.append(", screenHeight=");
        sb3.append(num5);
        sb3.append(", isAdCloseupUi=");
        sb3.append(bool);
        sb3.append(", animationType=");
        sb3.append(str4);
        sb3.append(")");
        return sb3.toString();
    }
}
