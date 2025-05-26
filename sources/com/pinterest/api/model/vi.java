package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0012¢\u0006\u0004\b\u001a\u0010\u001bBK\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010 R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R$\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\f\u0010\u0007R$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\t\u0010\u0007R$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/pinterest/api/model/vi;", "", "", "<set-?>", "a", "Z", "d", "()Z", "showPrice", "b", "g", "showTitle", "c", "showMerchantDomain", "e", "showRatingsAndCount", "f", "showShippingInfo", "showLabel", "showDirectClickthroughButton", "", "h", "Ljava/lang/String;", "getDirectClickthroughLable", "()Ljava/lang/String;", "directClickthroughLable", "<init>", "()V", "showRatings", "showShipping", "showClickthrough", "clickthroughLabel", "(ZZZZZZZLjava/lang/String;)V", "com/pinterest/api/model/ui", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class vi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("show_price")
    private boolean showPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("show_title")
    private boolean showTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("show_merchant_domain")
    private boolean showMerchantDomain;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("show_ratings_and_count")
    private boolean showRatingsAndCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("show_shipping_info")
    private boolean showShippingInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("show_label")
    private boolean showLabel;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("show_direct_clickthrough_button")
    private boolean showDirectClickthroughButton;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("direct_clickthrough_label")
    private String directClickthroughLable;

    static {
        new ui(null);
    }

    private vi() {
        this.showPrice = true;
        this.showTitle = true;
        this.showMerchantDomain = true;
        this.showRatingsAndCount = true;
        this.showShippingInfo = true;
        this.showLabel = true;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getShowDirectClickthroughButton() {
        return this.showDirectClickthroughButton;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getShowLabel() {
        return this.showLabel;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShowMerchantDomain() {
        return this.showMerchantDomain;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getShowPrice() {
        return this.showPrice;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getShowRatingsAndCount() {
        return this.showRatingsAndCount;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShowShippingInfo() {
        return this.showShippingInfo;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public vi(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str) {
        this.showPrice = z13;
        this.showTitle = z14;
        this.showMerchantDomain = z15;
        this.showRatingsAndCount = z16;
        this.showShippingInfo = z17;
        this.showLabel = z18;
        this.showDirectClickthroughButton = z19;
        this.directClickthroughLable = str;
    }
}
