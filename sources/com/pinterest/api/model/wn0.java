package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00101\u001a\u00020,\u0012\b\b\u0002\u00105\u001a\u000202¢\u0006\u0004\b6\u00107R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001a\u00101\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00105\u001a\u0002028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b-\u00104¨\u00068"}, d2 = {"Lcom/pinterest/api/model/wn0;", "Lcom/pinterest/api/model/wx;", "Ldl1/s;", "", "a", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", "setTemplateType", "(Ljava/lang/Integer;)V", "templateType", "", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "setPinTitle", "(Ljava/lang/String;)V", "pinTitle", "c", "h", "setPinDescription", "pinDescription", "", "Lcom/pinterest/api/model/ts0;", "d", "Ljava/util/List;", "q", "()Ljava/util/List;", "setUserMentionTags", "(Ljava/util/List;)V", "userMentionTags", "Lcom/pinterest/api/model/kn0;", "e", "Lcom/pinterest/api/model/kn0;", "getBasics", "()Lcom/pinterest/api/model/kn0;", "setBasics", "(Lcom/pinterest/api/model/kn0;)V", "basics", "f", "l", "setSponsorId", "sponsorId", "", "g", "Z", "k", "()Z", "shopSimilarEnabled", "Lcom/pinterest/api/model/so;", "Lcom/pinterest/api/model/so;", "()Lcom/pinterest/api/model/so;", "canvasAspectRatio", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pinterest/api/model/kn0;Ljava/lang/String;ZLcom/pinterest/api/model/so;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class wn0 extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b(alternate = {"template_type"}, value = "templateType")
    private Integer templateType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("pinTitle")
    private String pinTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("pinDescription")
    private String pinDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("userMentionTags")
    @NotNull
    private List<? extends ts0> userMentionTags;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("basics")
    private kn0 basics;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("sponsor_id")
    private String sponsorId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("shopSimilarEnabled")
    private final boolean shopSimilarEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("canvasAspectRatio")
    @NotNull
    private final so canvasAspectRatio;

    public wn0() {
        this(null, null, null, null, null, null, false, null, 255, null);
    }

    public static wn0 a(wn0 wn0Var, String str, String str2, List list, String str3, boolean z13, so soVar, int i13) {
        Integer num = wn0Var.templateType;
        String str4 = (i13 & 2) != 0 ? wn0Var.pinTitle : str;
        String str5 = (i13 & 4) != 0 ? wn0Var.pinDescription : str2;
        List userMentionTags = (i13 & 8) != 0 ? wn0Var.userMentionTags : list;
        kn0 kn0Var = wn0Var.basics;
        String str6 = (i13 & 32) != 0 ? wn0Var.sponsorId : str3;
        boolean z14 = (i13 & 64) != 0 ? wn0Var.shopSimilarEnabled : z13;
        so canvasAspectRatio = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? wn0Var.canvasAspectRatio : soVar;
        wn0Var.getClass();
        Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        return new wn0(num, str4, str5, userMentionTags, kn0Var, str6, z14, canvasAspectRatio);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(hashCode());
    }

    public final String e() {
        if (Intrinsics.d(this.sponsorId, "-1")) {
            return null;
        }
        return this.sponsorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(wn0.class, obj.getClass())) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return Intrinsics.d(this.templateType, wn0Var.templateType) && Intrinsics.d(this.pinTitle, wn0Var.pinTitle) && Intrinsics.d(this.pinDescription, wn0Var.pinDescription) && Intrinsics.d(this.basics, wn0Var.basics) && Intrinsics.d(this.sponsorId, wn0Var.sponsorId) && this.shopSimilarEnabled == wn0Var.shopSimilarEnabled && Intrinsics.d(this.canvasAspectRatio, wn0Var.canvasAspectRatio);
    }

    /* renamed from: g, reason: from getter */
    public final so getCanvasAspectRatio() {
        return this.canvasAspectRatio;
    }

    /* renamed from: h, reason: from getter */
    public final String getPinDescription() {
        return this.pinDescription;
    }

    public final int hashCode() {
        Integer num = this.templateType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.pinTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pinDescription;
        int c13 = ep.b.c(this.userMentionTags, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        kn0 kn0Var = this.basics;
        int hashCode3 = (c13 + (kn0Var == null ? 0 : kn0Var.hashCode())) * 31;
        String str3 = this.sponsorId;
        return this.canvasAspectRatio.hashCode() + ep.b.e(this.shopSimilarEnabled, (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    /* renamed from: j, reason: from getter */
    public final String getPinTitle() {
        return this.pinTitle;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getShopSimilarEnabled() {
        return this.shopSimilarEnabled;
    }

    /* renamed from: l, reason: from getter */
    public final String getSponsorId() {
        return this.sponsorId;
    }

    /* renamed from: n, reason: from getter */
    public final Integer getTemplateType() {
        return this.templateType;
    }

    /* renamed from: q, reason: from getter */
    public final List getUserMentionTags() {
        return this.userMentionTags;
    }

    public final boolean s() {
        return this.sponsorId != null;
    }

    public final String toString() {
        return "StoryPinLocalMetadata(templateType=" + this.templateType + ", pinTitle=" + this.pinTitle + ", pinDescription=" + this.pinDescription + ", userMentionTags=" + this.userMentionTags + ", basics=" + this.basics + ", sponsorId=" + this.sponsorId + ", shopSimilarEnabled=" + this.shopSimilarEnabled + ", canvasAspectRatio=" + this.canvasAspectRatio + ")";
    }

    public wn0(Integer num, String str, String str2, @NotNull List<? extends ts0> userMentionTags, kn0 kn0Var, String str3, boolean z13, @NotNull so canvasAspectRatio) {
        Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        this.templateType = num;
        this.pinTitle = str;
        this.pinDescription = str2;
        this.userMentionTags = userMentionTags;
        this.basics = kn0Var;
        this.sponsorId = str3;
        this.shopSimilarEnabled = z13;
        this.canvasAspectRatio = canvasAspectRatio;
    }

    public wn0(Integer num, String str, String str2, List list, kn0 kn0Var, String str3, boolean z13, so soVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? kotlin.collections.q0.f80391a : list, (i13 & 16) != 0 ? null : kn0Var, (i13 & 32) == 0 ? str3 : null, (i13 & 64) != 0 ? true : z13, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? lo.f39845e : soVar);
    }
}
