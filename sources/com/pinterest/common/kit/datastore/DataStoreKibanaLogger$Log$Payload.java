package com.pinterest.common.kit.datastore;

import a.a;
import androidx.annotation.Keep;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0004\"\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"com/pinterest/common/kit/datastore/DataStoreKibanaLogger$Log$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "preferenceKey", "preferenceDataType", "Lcom/pinterest/common/kit/datastore/DataStoreKibanaLogger$Log$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/pinterest/common/kit/datastore/DataStoreKibanaLogger$Log$Payload;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreferenceKey", "setPreferenceKey", "(Ljava/lang/String;)V", "getPreferenceDataType", "setPreferenceDataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "preferences_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class DataStoreKibanaLogger$Log$Payload implements e {
    private String preferenceDataType;
    private String preferenceKey;

    public DataStoreKibanaLogger$Log$Payload(String str, String str2) {
        this.preferenceKey = str;
        this.preferenceDataType = str2;
    }

    public static /* synthetic */ DataStoreKibanaLogger$Log$Payload copy$default(DataStoreKibanaLogger$Log$Payload dataStoreKibanaLogger$Log$Payload, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataStoreKibanaLogger$Log$Payload.preferenceKey;
        }
        if ((i13 & 2) != 0) {
            str2 = dataStoreKibanaLogger$Log$Payload.preferenceDataType;
        }
        return dataStoreKibanaLogger$Log$Payload.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreferenceKey() {
        return this.preferenceKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreferenceDataType() {
        return this.preferenceDataType;
    }

    @NotNull
    public final DataStoreKibanaLogger$Log$Payload copy(String preferenceKey, String preferenceDataType) {
        return new DataStoreKibanaLogger$Log$Payload(preferenceKey, preferenceDataType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataStoreKibanaLogger$Log$Payload)) {
            return false;
        }
        DataStoreKibanaLogger$Log$Payload dataStoreKibanaLogger$Log$Payload = (DataStoreKibanaLogger$Log$Payload) other;
        return Intrinsics.d(this.preferenceKey, dataStoreKibanaLogger$Log$Payload.preferenceKey) && Intrinsics.d(this.preferenceDataType, dataStoreKibanaLogger$Log$Payload.preferenceDataType);
    }

    public final String getPreferenceDataType() {
        return this.preferenceDataType;
    }

    public final String getPreferenceKey() {
        return this.preferenceKey;
    }

    public int hashCode() {
        String str = this.preferenceKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preferenceDataType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPreferenceDataType(String str) {
        this.preferenceDataType = str;
    }

    public final void setPreferenceKey(String str) {
        this.preferenceKey = str;
    }

    @NotNull
    public String toString() {
        return a.m("Payload(preferenceKey=", this.preferenceKey, ", preferenceDataType=", this.preferenceDataType, ")");
    }
}
