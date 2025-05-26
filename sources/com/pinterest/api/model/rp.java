package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/api/model/rp;", "", "", "a", "I", "getAction", "()I", "action", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "blockReason", "<init>", "(ILjava/lang/String;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class rp {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("action")
    private final int action;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("block_reason")
    private final String blockReason;

    public rp(int i13, String str) {
        this.action = i13;
        this.blockReason = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getBlockReason() {
        return this.blockReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp)) {
            return false;
        }
        rp rpVar = (rp) obj;
        return this.action == rpVar.action && Intrinsics.d(this.blockReason, rpVar.blockReason);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.action) * 31;
        String str = this.blockReason;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "IdeaPinLinkValidation(action=" + this.action + ", blockReason=" + this.blockReason + ")";
    }
}
