package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/pinterest/api/model/oq;", "Lcom/pinterest/api/model/qq;", "Lcom/pinterest/api/model/rq;", "c", "Lcom/pinterest/api/model/rq;", "b", "()Lcom/pinterest/api/model/rq;", "config", "Lcom/pinterest/api/model/tq;", "d", "Lcom/pinterest/api/model/tq;", "()Lcom/pinterest/api/model/tq;", "durationConfig", "", "e", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "text", "f", "j", "fontId", "", "g", "F", "k", "()F", "fontSize", "Lcom/pinterest/api/model/aq0;", "h", "Lcom/pinterest/api/model/aq0;", "i", "()Lcom/pinterest/api/model/aq0;", "alignment", "Lcom/pinterest/api/model/er;", "Lcom/pinterest/api/model/er;", "l", "()Lcom/pinterest/api/model/er;", "highlightType", "<init>", "(Lcom/pinterest/api/model/rq;Lcom/pinterest/api/model/tq;Ljava/lang/String;Ljava/lang/String;FLcom/pinterest/api/model/aq0;Lcom/pinterest/api/model/er;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class oq extends qq {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("config")
    @NotNull
    private final rq config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("durationConfig")
    @NotNull
    private final tq durationConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("text")
    @NotNull
    private final String text;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("fontId")
    @NotNull
    private final String fontId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("fontSize")
    private final float fontSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("alignment")
    @NotNull
    private final aq0 alignment;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @om.b("highlightType")
    @NotNull
    private final er highlightType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(@NotNull rq config, @NotNull tq durationConfig, @NotNull String text, @NotNull String fontId, float f13, @NotNull aq0 alignment, @NotNull er highlightType) {
        super(config, durationConfig, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(highlightType, "highlightType");
        this.config = config;
        this.durationConfig = durationConfig;
        this.text = text;
        this.fontId = fontId;
        this.fontSize = f13;
        this.alignment = alignment;
        this.highlightType = highlightType;
    }

    public static oq g(rq config, tq durationConfig, String text, String fontId, float f13, aq0 alignment, er highlightType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(highlightType, "highlightType");
        return new oq(config, durationConfig, text, fontId, f13, alignment, highlightType);
    }

    public static /* synthetic */ oq h(oq oqVar, rq rqVar, tq tqVar, String str, String str2, float f13, aq0 aq0Var, er erVar, int i13) {
        if ((i13 & 1) != 0) {
            rqVar = oqVar.config;
        }
        if ((i13 & 2) != 0) {
            tqVar = oqVar.durationConfig;
        }
        tq tqVar2 = tqVar;
        if ((i13 & 4) != 0) {
            str = oqVar.text;
        }
        String str3 = str;
        if ((i13 & 8) != 0) {
            str2 = oqVar.fontId;
        }
        String str4 = str2;
        if ((i13 & 16) != 0) {
            f13 = oqVar.fontSize;
        }
        float f14 = f13;
        if ((i13 & 32) != 0) {
            aq0Var = oqVar.alignment;
        }
        aq0 aq0Var2 = aq0Var;
        if ((i13 & 64) != 0) {
            erVar = oqVar.highlightType;
        }
        oqVar.getClass();
        return g(rqVar, tqVar2, str3, str4, f14, aq0Var2, erVar);
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
        return h(this, null, (tq) update.invoke(this.durationConfig), null, null, 0.0f, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
    }

    @Override // com.pinterest.api.model.qq
    public final qq e(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return h(this, (rq) update.invoke(this.config), null, null, null, 0.0f, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    }

    @Override // com.pinterest.api.model.qq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(oq.class, obj.getClass())) {
            return false;
        }
        oq oqVar = (oq) obj;
        return Intrinsics.d(this.config, oqVar.config) && Intrinsics.d(this.text, oqVar.text) && Intrinsics.d(this.fontId, oqVar.fontId) && this.fontSize == oqVar.fontSize && this.alignment == oqVar.alignment && this.highlightType == oqVar.highlightType;
    }

    @Override // com.pinterest.api.model.qq
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final oq a(rq config, tq durationConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        return g(config, durationConfig, this.text, this.fontId, this.fontSize, this.alignment, this.highlightType);
    }

    public final int hashCode() {
        return this.highlightType.hashCode() + ((this.alignment.hashCode() + a.a.a(this.fontSize, a.cb.d(this.fontId, a.cb.d(this.text, (this.durationConfig.hashCode() + (this.config.hashCode() * 31)) * 31, 31), 31), 31)) * 31);
    }

    /* renamed from: i, reason: from getter */
    public final aq0 getAlignment() {
        return this.alignment;
    }

    /* renamed from: j, reason: from getter */
    public final String getFontId() {
        return this.fontId;
    }

    /* renamed from: k, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* renamed from: l, reason: from getter */
    public final er getHighlightType() {
        return this.highlightType;
    }

    /* renamed from: m, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final String toString() {
        rq rqVar = this.config;
        tq tqVar = this.durationConfig;
        String str = this.text;
        String str2 = this.fontId;
        float f13 = this.fontSize;
        aq0 aq0Var = this.alignment;
        er erVar = this.highlightType;
        StringBuilder sb3 = new StringBuilder("TextOverlayBlock(config=");
        sb3.append(rqVar);
        sb3.append(", durationConfig=");
        sb3.append(tqVar);
        sb3.append(", text=");
        a.a.B(sb3, str, ", fontId=", str2, ", fontSize=");
        sb3.append(f13);
        sb3.append(", alignment=");
        sb3.append(aq0Var);
        sb3.append(", highlightType=");
        sb3.append(erVar);
        sb3.append(")");
        return sb3.toString();
    }
}
