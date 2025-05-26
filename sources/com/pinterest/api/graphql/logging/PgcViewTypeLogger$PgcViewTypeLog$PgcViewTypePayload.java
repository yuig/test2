package com.pinterest.api.graphql.logging;

import a.a;
import a.cb;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J.\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"com/pinterest/api/graphql/logging/PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "pinId", "viewTypeBefore", "viewTypeAfter", "Lcom/pinterest/api/graphql/logging/PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/api/graphql/logging/PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPinId", "getViewTypeBefore", "getViewTypeAfter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload implements e {

    @b("pin_id")
    @NotNull
    private final String pinId;

    @b("viewType_after")
    @NotNull
    private final String viewTypeAfter;

    @b("viewType_before")
    @NotNull
    private final String viewTypeBefore;

    public PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload(@NotNull String pinId, @NotNull String viewTypeBefore, @NotNull String viewTypeAfter) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewTypeBefore, "viewTypeBefore");
        Intrinsics.checkNotNullParameter(viewTypeAfter, "viewTypeAfter");
        this.pinId = pinId;
        this.viewTypeBefore = viewTypeBefore;
        this.viewTypeAfter = viewTypeAfter;
    }

    public static /* synthetic */ PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload copy$default(PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.pinId;
        }
        if ((i13 & 2) != 0) {
            str2 = pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.viewTypeBefore;
        }
        if ((i13 & 4) != 0) {
            str3 = pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.viewTypeAfter;
        }
        return pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getViewTypeBefore() {
        return this.viewTypeBefore;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getViewTypeAfter() {
        return this.viewTypeAfter;
    }

    @NotNull
    public final PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload copy(@NotNull String pinId, @NotNull String viewTypeBefore, @NotNull String viewTypeAfter) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewTypeBefore, "viewTypeBefore");
        Intrinsics.checkNotNullParameter(viewTypeAfter, "viewTypeAfter");
        return new PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload(pinId, viewTypeBefore, viewTypeAfter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload)) {
            return false;
        }
        PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload = (PgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload) other;
        return Intrinsics.d(this.pinId, pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.pinId) && Intrinsics.d(this.viewTypeBefore, pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.viewTypeBefore) && Intrinsics.d(this.viewTypeAfter, pgcViewTypeLogger$PgcViewTypeLog$PgcViewTypePayload.viewTypeAfter);
    }

    @NotNull
    public final String getPinId() {
        return this.pinId;
    }

    @NotNull
    public final String getViewTypeAfter() {
        return this.viewTypeAfter;
    }

    @NotNull
    public final String getViewTypeBefore() {
        return this.viewTypeBefore;
    }

    public int hashCode() {
        return this.viewTypeAfter.hashCode() + cb.d(this.viewTypeBefore, this.pinId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.pinId;
        String str2 = this.viewTypeBefore;
        return a.p(a.w("PgcViewTypePayload(pinId=", str, ", viewTypeBefore=", str2, ", viewTypeAfter="), this.viewTypeAfter, ")");
    }
}
