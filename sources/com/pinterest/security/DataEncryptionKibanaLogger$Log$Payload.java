package com.pinterest.security;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J@\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"com/pinterest/security/DataEncryptionKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "key", "action", "error", "stacktrace", "Lcom/pinterest/security/DataEncryptionKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/security/DataEncryptionKibanaLogger$Log$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getAction", "getError", "getStacktrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class DataEncryptionKibanaLogger$Log$Payload implements com.pinterest.analytics.kibana.e {

    @om.b("action")
    private final String action;

    @om.b("error")
    private final String error;

    @om.b("key")
    private final String key;

    @om.b("stacktrace")
    private final String stacktrace;

    public DataEncryptionKibanaLogger$Log$Payload(String str, String str2, String str3, String str4) {
        this.key = str;
        this.action = str2;
        this.error = str3;
        this.stacktrace = str4;
    }

    public static /* synthetic */ DataEncryptionKibanaLogger$Log$Payload copy$default(DataEncryptionKibanaLogger$Log$Payload dataEncryptionKibanaLogger$Log$Payload, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataEncryptionKibanaLogger$Log$Payload.key;
        }
        if ((i13 & 2) != 0) {
            str2 = dataEncryptionKibanaLogger$Log$Payload.action;
        }
        if ((i13 & 4) != 0) {
            str3 = dataEncryptionKibanaLogger$Log$Payload.error;
        }
        if ((i13 & 8) != 0) {
            str4 = dataEncryptionKibanaLogger$Log$Payload.stacktrace;
        }
        return dataEncryptionKibanaLogger$Log$Payload.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStacktrace() {
        return this.stacktrace;
    }

    @NotNull
    public final DataEncryptionKibanaLogger$Log$Payload copy(String key, String action, String error, String stacktrace) {
        return new DataEncryptionKibanaLogger$Log$Payload(key, action, error, stacktrace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataEncryptionKibanaLogger$Log$Payload)) {
            return false;
        }
        DataEncryptionKibanaLogger$Log$Payload dataEncryptionKibanaLogger$Log$Payload = (DataEncryptionKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.key, dataEncryptionKibanaLogger$Log$Payload.key) && Intrinsics.d(this.action, dataEncryptionKibanaLogger$Log$Payload.action) && Intrinsics.d(this.error, dataEncryptionKibanaLogger$Log$Payload.error) && Intrinsics.d(this.stacktrace, dataEncryptionKibanaLogger$Log$Payload.stacktrace);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getError() {
        return this.error;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getStacktrace() {
        return this.stacktrace;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stacktrace;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.action;
        return a.a.q(a.a.w("Payload(key=", str, ", action=", str2, ", error="), this.error, ", stacktrace=", this.stacktrace, ")");
    }
}
