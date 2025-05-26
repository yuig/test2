package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010%\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/pinterest/api/model/mq;", "Lcom/pinterest/api/model/qq;", "Lcom/pinterest/api/model/rq;", "c", "Lcom/pinterest/api/model/rq;", "b", "()Lcom/pinterest/api/model/rq;", "config", "Lcom/pinterest/api/model/tq;", "d", "Lcom/pinterest/api/model/tq;", "()Lcom/pinterest/api/model/tq;", "durationConfig", "", "e", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "pinId", "La42/o;", "f", "La42/o;", "j", "()La42/o;", "variantType", "", "g", "Z", "isAffiliateLink", "()Z", "h", "l", "(Ljava/lang/String;)V", "filePath", "k", "setInvisible", "(Z)V", "isInvisible", "<init>", "(Lcom/pinterest/api/model/rq;Lcom/pinterest/api/model/tq;Ljava/lang/String;La42/o;ZLjava/lang/String;Z)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class mq extends qq {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("config")
    @NotNull
    private final rq config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("durationConfig")
    @NotNull
    private final tq durationConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("pinId")
    @NotNull
    private final String pinId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("variantType")
    private final a42.o variantType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("isAffiliateLink")
    private final boolean isAffiliateLink;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("filePath")
    private String filePath;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("isInvisible")
    private boolean isInvisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(@NotNull rq config, @NotNull tq durationConfig, @NotNull String pinId, a42.o oVar, boolean z13, String str, boolean z14) {
        super(config, durationConfig, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.config = config;
        this.durationConfig = durationConfig;
        this.pinId = pinId;
        this.variantType = oVar;
        this.isAffiliateLink = z13;
        this.filePath = str;
        this.isInvisible = z14;
    }

    public static mq g(mq mqVar, rq rqVar, tq tqVar, String str, a42.o oVar, boolean z13, String str2, boolean z14, int i13) {
        rq config = (i13 & 1) != 0 ? mqVar.config : rqVar;
        tq durationConfig = (i13 & 2) != 0 ? mqVar.durationConfig : tqVar;
        String pinId = (i13 & 4) != 0 ? mqVar.pinId : str;
        a42.o oVar2 = (i13 & 8) != 0 ? mqVar.variantType : oVar;
        boolean z15 = (i13 & 16) != 0 ? mqVar.isAffiliateLink : z13;
        String str3 = (i13 & 32) != 0 ? mqVar.filePath : str2;
        boolean z16 = (i13 & 64) != 0 ? mqVar.isInvisible : z14;
        mqVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return new mq(config, durationConfig, pinId, oVar2, z15, str3, z16);
    }

    @Override // com.pinterest.api.model.qq
    /* renamed from: b, reason: from getter */
    public final rq getConfig() {
        return this.config;
    }

    @Override // com.pinterest.api.model.qq
    /* renamed from: c, reason: from getter */
    public final tq getDurationConfig() {
        return this.durationConfig;
    }

    @Override // com.pinterest.api.model.qq
    public final qq d(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return g(this, null, (tq) update.invoke(this.durationConfig), null, null, false, null, false, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    }

    @Override // com.pinterest.api.model.qq
    public final qq e(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return g(this, (rq) update.invoke(this.config), null, null, null, false, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    }

    @Override // com.pinterest.api.model.qq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(mq.class, obj.getClass())) {
            return false;
        }
        mq mqVar = (mq) obj;
        return Intrinsics.d(this.config, mqVar.config) && Intrinsics.d(this.pinId, mqVar.pinId);
    }

    @Override // com.pinterest.api.model.qq
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final mq a(rq config, tq durationConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        return g(this, config, durationConfig, this.pinId, this.variantType, this.isAffiliateLink, this.filePath, false, 64);
    }

    /* renamed from: h, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.pinId, (this.durationConfig.hashCode() + (this.config.hashCode() * 31)) * 31, 31);
        a42.o oVar = this.variantType;
        int e13 = ep.b.e(this.isAffiliateLink, (d2 + (oVar == null ? 0 : oVar.hashCode())) * 31, 31);
        String str = this.filePath;
        return Boolean.hashCode(this.isInvisible) + ((e13 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* renamed from: i, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    /* renamed from: j, reason: from getter */
    public final a42.o getVariantType() {
        return this.variantType;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsInvisible() {
        return this.isInvisible;
    }

    public final void l(String str) {
        this.filePath = str;
    }

    public final String toString() {
        rq rqVar = this.config;
        tq tqVar = this.durationConfig;
        String str = this.pinId;
        a42.o oVar = this.variantType;
        boolean z13 = this.isAffiliateLink;
        String str2 = this.filePath;
        boolean z14 = this.isInvisible;
        StringBuilder sb3 = new StringBuilder("ProductTagOverlayBlock(config=");
        sb3.append(rqVar);
        sb3.append(", durationConfig=");
        sb3.append(tqVar);
        sb3.append(", pinId=");
        sb3.append(str);
        sb3.append(", variantType=");
        sb3.append(oVar);
        sb3.append(", isAffiliateLink=");
        sb3.append(z13);
        sb3.append(", filePath=");
        sb3.append(str2);
        sb3.append(", isInvisible=");
        return a.a.r(sb3, z14, ")");
    }

    public /* synthetic */ mq(rq rqVar, tq tqVar, String str, a42.o oVar, boolean z13, String str2, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(rqVar, tqVar, str, (i13 & 8) != 0 ? null : oVar, z13, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? false : z14);
    }
}
