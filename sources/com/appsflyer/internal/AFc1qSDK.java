package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFc1gSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1gSDK;)V", "", "getMediationNetwork", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "AFAdRevenueData", "Ljava/util/Map;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFc1gSDK;", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1qSDK {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> getCurrencyIso4217Code;
    final AFc1gSDK getMediationNetwork;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK$AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1rSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFa1rSDK;)Lcom/appsflyer/internal/AFc1qSDK;", "Lcom/appsflyer/internal/AFc1gSDK;", "(Lcom/appsflyer/internal/AFc1gSDK;)Lcom/appsflyer/internal/AFc1qSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1qSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static AFc1qSDK getCurrencyIso4217Code(@NotNull AFa1rSDK p03) {
            Intrinsics.checkNotNullParameter(p03, "");
            Map<String, Object> currencyIso4217Code = p03.getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            return new AFc1qSDK(currencyIso4217Code, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public static AFc1qSDK getCurrencyIso4217Code(@NotNull AFc1gSDK p03) {
            Intrinsics.checkNotNullParameter(p03, "");
            return new AFc1qSDK(new LinkedHashMap(), p03, null);
        }
    }

    private AFc1qSDK(Map<String, Object> map, AFc1gSDK aFc1gSDK) {
        this.getCurrencyIso4217Code = map;
        this.getMediationNetwork = aFc1gSDK;
    }

    @NotNull
    public static final AFc1qSDK getRevenue(@NotNull AFa1rSDK aFa1rSDK) {
        return Companion.getCurrencyIso4217Code(aFa1rSDK);
    }

    public final void getMediationNetwork(@NotNull String p03, Object p13) {
        Intrinsics.checkNotNullParameter(p03, "");
        this.getCurrencyIso4217Code.put(p03, p13);
        AFc1gSDK aFc1gSDK = this.getMediationNetwork;
        if (aFc1gSDK != null) {
            aFc1gSDK.getRevenue(this.getCurrencyIso4217Code);
        }
    }

    public final boolean getMediationNetwork(@NotNull String p03) {
        Intrinsics.checkNotNullParameter(p03, "");
        return this.getCurrencyIso4217Code.containsKey(p03);
    }

    public /* synthetic */ AFc1qSDK(Map map, AFc1gSDK aFc1gSDK, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i13 & 2) != 0 ? null : aFc1gSDK);
    }

    @NotNull
    public static final AFc1qSDK getMediationNetwork(@NotNull AFc1gSDK aFc1gSDK) {
        return Companion.getCurrencyIso4217Code(aFc1gSDK);
    }

    public /* synthetic */ AFc1qSDK(Map map, AFc1gSDK aFc1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1gSDK);
    }
}
