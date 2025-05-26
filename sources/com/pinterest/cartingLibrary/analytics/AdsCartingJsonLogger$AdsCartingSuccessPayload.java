package com.pinterest.cartingLibrary.analytics;

import a.a;
import a.c;
import androidx.annotation.Keep;
import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\b¨\u0006\u001e"}, d2 = {"com/pinterest/cartingLibrary/analytics/AdsCartingJsonLogger$AdsCartingSuccessPayload", "Lcom/pinterest/adFormatsLibrary/analytics/logger/BaseAdsPayload;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Ljava/lang/Integer;", "eventName", "pinUid", "retailerIndex", "Lcom/pinterest/cartingLibrary/analytics/AdsCartingJsonLogger$AdsCartingSuccessPayload;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/pinterest/cartingLibrary/analytics/AdsCartingJsonLogger$AdsCartingSuccessPayload;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "getPinUid", "Ljava/lang/Integer;", "getRetailerIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "cartingLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdsCartingJsonLogger$AdsCartingSuccessPayload extends BaseAdsPayload {

    @b("event_name")
    @NotNull
    private final String eventName;

    @b("pin_uid")
    private final String pinUid;

    @b("index")
    private final Integer retailerIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCartingJsonLogger$AdsCartingSuccessPayload(@NotNull String eventName, String str, Integer num) {
        super(wr.b.CARTING);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.pinUid = str;
        this.retailerIndex = num;
    }

    public static /* synthetic */ AdsCartingJsonLogger$AdsCartingSuccessPayload copy$default(AdsCartingJsonLogger$AdsCartingSuccessPayload adsCartingJsonLogger$AdsCartingSuccessPayload, String str, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = adsCartingJsonLogger$AdsCartingSuccessPayload.eventName;
        }
        if ((i13 & 2) != 0) {
            str2 = adsCartingJsonLogger$AdsCartingSuccessPayload.pinUid;
        }
        if ((i13 & 4) != 0) {
            num = adsCartingJsonLogger$AdsCartingSuccessPayload.retailerIndex;
        }
        return adsCartingJsonLogger$AdsCartingSuccessPayload.copy(str, str2, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPinUid() {
        return this.pinUid;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRetailerIndex() {
        return this.retailerIndex;
    }

    @NotNull
    public final AdsCartingJsonLogger$AdsCartingSuccessPayload copy(@NotNull String eventName, String pinUid, Integer retailerIndex) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AdsCartingJsonLogger$AdsCartingSuccessPayload(eventName, pinUid, retailerIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsCartingJsonLogger$AdsCartingSuccessPayload)) {
            return false;
        }
        AdsCartingJsonLogger$AdsCartingSuccessPayload adsCartingJsonLogger$AdsCartingSuccessPayload = (AdsCartingJsonLogger$AdsCartingSuccessPayload) other;
        return Intrinsics.d(this.eventName, adsCartingJsonLogger$AdsCartingSuccessPayload.eventName) && Intrinsics.d(this.pinUid, adsCartingJsonLogger$AdsCartingSuccessPayload.pinUid) && Intrinsics.d(this.retailerIndex, adsCartingJsonLogger$AdsCartingSuccessPayload.retailerIndex);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final String getPinUid() {
        return this.pinUid;
    }

    public final Integer getRetailerIndex() {
        return this.retailerIndex;
    }

    public int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        String str = this.pinUid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.retailerIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.eventName;
        String str2 = this.pinUid;
        return c.i(a.w("AdsCartingSuccessPayload(eventName=", str, ", pinUid=", str2, ", retailerIndex="), this.retailerIndex, ")");
    }
}
