package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/pinterest/api/model/pq;", "Lcom/pinterest/api/model/qq;", "Lcom/pinterest/api/model/rq;", "c", "Lcom/pinterest/api/model/rq;", "b", "()Lcom/pinterest/api/model/rq;", "config", "Lcom/pinterest/api/model/tq;", "d", "Lcom/pinterest/api/model/tq;", "()Lcom/pinterest/api/model/tq;", "durationConfig", "", "e", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "pinId", "<init>", "(Lcom/pinterest/api/model/rq;Lcom/pinterest/api/model/tq;Ljava/lang/String;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class pq extends qq {

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(@NotNull rq config, @NotNull tq durationConfig, @NotNull String pinId) {
        super(config, durationConfig, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.config = config;
        this.durationConfig = durationConfig;
        this.pinId = pinId;
    }

    public static pq g(pq pqVar, rq config, tq durationConfig, String pinId, int i13) {
        if ((i13 & 1) != 0) {
            config = pqVar.config;
        }
        if ((i13 & 2) != 0) {
            durationConfig = pqVar.durationConfig;
        }
        if ((i13 & 4) != 0) {
            pinId = pqVar.pinId;
        }
        pqVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return new pq(config, durationConfig, pinId);
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
        return g(this, null, (tq) update.invoke(this.durationConfig), null, 5);
    }

    @Override // com.pinterest.api.model.qq
    public final qq e(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return g(this, (rq) update.invoke(this.config), null, null, 6);
    }

    @Override // com.pinterest.api.model.qq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(pq.class, obj.getClass())) {
            return false;
        }
        pq pqVar = (pq) obj;
        return Intrinsics.d(this.config, pqVar.config) && Intrinsics.d(this.pinId, pqVar.pinId);
    }

    @Override // com.pinterest.api.model.qq
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final pq a(rq config, tq durationConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        String pinId = this.pinId;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return new pq(config, durationConfig, pinId);
    }

    /* renamed from: h, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    public final int hashCode() {
        return this.pinId.hashCode() + ((this.durationConfig.hashCode() + (this.config.hashCode() * 31)) * 31);
    }

    public final String toString() {
        rq rqVar = this.config;
        tq tqVar = this.durationConfig;
        String str = this.pinId;
        StringBuilder sb3 = new StringBuilder("VTOOverlayBlock(config=");
        sb3.append(rqVar);
        sb3.append(", durationConfig=");
        sb3.append(tqVar);
        sb3.append(", pinId=");
        return a.a.p(sb3, str, ")");
    }
}
