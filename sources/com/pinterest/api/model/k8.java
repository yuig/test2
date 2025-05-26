package com.pinterest.api.model;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/pinterest/api/model/k8;", "Ldl1/s;", "Ljava/util/Date;", "c", "Ljava/util/Date;", "createdAt", "", "d", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "status", "getType", "g", "type", "", "f", "Z", "a", "()Z", "(Z)V", "isAcceptable", "message", "inviterUid", "boardUid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "com/pinterest/api/model/j8", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class k8 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f39331a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39332b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("created_at")
    @NotNull
    public Date createdAt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("status")
    private String status;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("type")
    private String type;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("is_acceptable")
    private boolean isAcceptable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("message")
    public String message;

    static {
        new j8(null);
    }

    public k8(@NotNull String inviterUid, @NotNull String boardUid) {
        Intrinsics.checkNotNullParameter(inviterUid, "inviterUid");
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        this.f39331a = inviterUid;
        this.f39332b = boardUid;
        this.createdAt = new Date();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsAcceptable() {
        return this.isAcceptable;
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getF39332b() {
        return this.f39332b;
    }

    public final void c(boolean z13) {
        this.isAcceptable = z13;
    }

    public final void e(String str) {
        this.status = str;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k8)) {
            return Intrinsics.d(((k8) obj).f39332b, this.f39332b);
        }
        return false;
    }

    public final void g(String str) {
        this.type = str;
    }

    public final int hashCode() {
        return this.f39332b.hashCode();
    }
}
