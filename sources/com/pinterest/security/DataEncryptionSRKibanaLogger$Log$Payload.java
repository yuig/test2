package com.pinterest.security;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"com/pinterest/security/DataEncryptionSRKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "status", "action", "Lcom/pinterest/security/DataEncryptionSRKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/security/DataEncryptionSRKibanaLogger$Log$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "getAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class DataEncryptionSRKibanaLogger$Log$Payload implements com.pinterest.analytics.kibana.e {

    @om.b("action")
    private final String action;

    @om.b("status")
    private final String status;

    public DataEncryptionSRKibanaLogger$Log$Payload(String str, String str2) {
        this.status = str;
        this.action = str2;
    }

    public static /* synthetic */ DataEncryptionSRKibanaLogger$Log$Payload copy$default(DataEncryptionSRKibanaLogger$Log$Payload dataEncryptionSRKibanaLogger$Log$Payload, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataEncryptionSRKibanaLogger$Log$Payload.status;
        }
        if ((i13 & 2) != 0) {
            str2 = dataEncryptionSRKibanaLogger$Log$Payload.action;
        }
        return dataEncryptionSRKibanaLogger$Log$Payload.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final DataEncryptionSRKibanaLogger$Log$Payload copy(String status, String action) {
        return new DataEncryptionSRKibanaLogger$Log$Payload(status, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataEncryptionSRKibanaLogger$Log$Payload)) {
            return false;
        }
        DataEncryptionSRKibanaLogger$Log$Payload dataEncryptionSRKibanaLogger$Log$Payload = (DataEncryptionSRKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.status, dataEncryptionSRKibanaLogger$Log$Payload.status) && Intrinsics.d(this.action, dataEncryptionSRKibanaLogger$Log$Payload.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.a.m("Payload(status=", this.status, ", action=", this.action, ")");
    }
}
