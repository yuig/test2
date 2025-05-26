package com.pinterest.handshake.model.models;

import a.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/pinterest/handshake/model/models/HandshakeDataConnect;", "", "accessToken", "", "apiKey", "timeStamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAccessToken", "()Ljava/lang/String;", "getApiKey", "getTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/pinterest/handshake/model/models/HandshakeDataConnect;", "equals", "", "other", "hashCode", "", "toString", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HandshakeDataConnect {
    private final String accessToken;
    private final String apiKey;
    private final Long timeStamp;

    public HandshakeDataConnect() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ HandshakeDataConnect copy$default(HandshakeDataConnect handshakeDataConnect, String str, String str2, Long l13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = handshakeDataConnect.accessToken;
        }
        if ((i13 & 2) != 0) {
            str2 = handshakeDataConnect.apiKey;
        }
        if ((i13 & 4) != 0) {
            l13 = handshakeDataConnect.timeStamp;
        }
        return handshakeDataConnect.copy(str, str2, l13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final HandshakeDataConnect copy(String accessToken, String apiKey, Long timeStamp) {
        return new HandshakeDataConnect(accessToken, apiKey, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandshakeDataConnect)) {
            return false;
        }
        HandshakeDataConnect handshakeDataConnect = (HandshakeDataConnect) other;
        return Intrinsics.d(this.accessToken, handshakeDataConnect.accessToken) && Intrinsics.d(this.apiKey, handshakeDataConnect.apiKey) && Intrinsics.d(this.timeStamp, handshakeDataConnect.timeStamp);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.accessToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.apiKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l13 = this.timeStamp;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.apiKey;
        Long l13 = this.timeStamp;
        StringBuilder w13 = a.w("HandshakeDataConnect(accessToken=", str, ", apiKey=", str2, ", timeStamp=");
        w13.append(l13);
        w13.append(")");
        return w13.toString();
    }

    public HandshakeDataConnect(String str, String str2, Long l13) {
        this.accessToken = str;
        this.apiKey = str2;
        this.timeStamp = l13;
    }

    public /* synthetic */ HandshakeDataConnect(String str, String str2, Long l13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : l13);
    }
}
