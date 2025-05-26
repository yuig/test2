package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/pinterest/api/model/jq;", "Lcom/pinterest/api/model/qq;", "Lcom/pinterest/api/model/rq;", "c", "Lcom/pinterest/api/model/rq;", "b", "()Lcom/pinterest/api/model/rq;", "config", "Lcom/pinterest/api/model/tq;", "d", "Lcom/pinterest/api/model/tq;", "()Lcom/pinterest/api/model/tq;", "durationConfig", "", "e", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "boardId", "La42/c;", "f", "La42/c;", "k", "()La42/c;", "variantType", "g", "j", "m", "(Ljava/lang/String;)V", "filePath", "Lcom/pinterest/api/model/v7;", "h", "Lcom/pinterest/api/model/v7;", "()Lcom/pinterest/api/model/v7;", "l", "(Lcom/pinterest/api/model/v7;)V", "board", "<init>", "(Lcom/pinterest/api/model/rq;Lcom/pinterest/api/model/tq;Ljava/lang/String;La42/c;Ljava/lang/String;Lcom/pinterest/api/model/v7;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class jq extends qq {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("config")
    @NotNull
    private final rq config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("durationConfig")
    @NotNull
    private final tq durationConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("boardId")
    @NotNull
    private final String boardId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("variantType")
    @NotNull
    private final a42.c variantType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("filePath")
    private String filePath;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("board")
    private v7 board;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(@NotNull rq config, @NotNull tq durationConfig, @NotNull String boardId, @NotNull a42.c variantType, String str, v7 v7Var) {
        super(config, durationConfig, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(variantType, "variantType");
        this.config = config;
        this.durationConfig = durationConfig;
        this.boardId = boardId;
        this.variantType = variantType;
        this.filePath = str;
        this.board = v7Var;
    }

    public static jq g(jq jqVar, rq rqVar, tq tqVar, String str, a42.c cVar, String str2, v7 v7Var, int i13) {
        if ((i13 & 1) != 0) {
            rqVar = jqVar.config;
        }
        rq config = rqVar;
        if ((i13 & 2) != 0) {
            tqVar = jqVar.durationConfig;
        }
        tq durationConfig = tqVar;
        if ((i13 & 4) != 0) {
            str = jqVar.boardId;
        }
        String boardId = str;
        if ((i13 & 8) != 0) {
            cVar = jqVar.variantType;
        }
        a42.c variantType = cVar;
        if ((i13 & 16) != 0) {
            str2 = jqVar.filePath;
        }
        String str3 = str2;
        if ((i13 & 32) != 0) {
            v7Var = jqVar.board;
        }
        jqVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(variantType, "variantType");
        return new jq(config, durationConfig, boardId, variantType, str3, v7Var);
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
        return g(this, null, (tq) update.invoke(this.durationConfig), null, null, null, null, 61);
    }

    @Override // com.pinterest.api.model.qq
    public final qq e(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return g(this, (rq) update.invoke(this.config), null, null, null, null, null, 62);
    }

    @Override // com.pinterest.api.model.qq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(jq.class, obj.getClass())) {
            return false;
        }
        jq jqVar = (jq) obj;
        return Intrinsics.d(this.config, jqVar.config) && Intrinsics.d(this.boardId, jqVar.boardId);
    }

    @Override // com.pinterest.api.model.qq
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jq a(rq config, tq durationConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        return g(this, config, durationConfig, this.boardId, this.variantType, this.filePath, null, 32);
    }

    /* renamed from: h, reason: from getter */
    public final v7 getBoard() {
        return this.board;
    }

    public final int hashCode() {
        int hashCode = (this.variantType.hashCode() + a.cb.d(this.boardId, (this.durationConfig.hashCode() + (this.config.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.filePath;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v7 v7Var = this.board;
        return hashCode2 + (v7Var != null ? v7Var.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getBoardId() {
        return this.boardId;
    }

    /* renamed from: j, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: k, reason: from getter */
    public final a42.c getVariantType() {
        return this.variantType;
    }

    public final void l(v7 v7Var) {
        this.board = v7Var;
    }

    public final void m(String str) {
        this.filePath = str;
    }

    public final String toString() {
        return "BoardStickerOverlayBlock(config=" + this.config + ", durationConfig=" + this.durationConfig + ", boardId=" + this.boardId + ", variantType=" + this.variantType + ", filePath=" + this.filePath + ", board=" + this.board + ")";
    }

    public /* synthetic */ jq(rq rqVar, tq tqVar, String str, a42.c cVar, String str2, v7 v7Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(rqVar, tqVar, str, cVar, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : v7Var);
    }
}
