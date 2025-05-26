package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e"}, d2 = {"Lcom/appsflyer/internal/AFf1zSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "AFAdRevenueData", "Ljava/lang/String;", "AFa1tSDK", "AFa1zSDK", "AFa1uSDK", "AFa1ySDK", "Lcom/appsflyer/internal/AFf1zSDK$AFa1zSDK;", "Lcom/appsflyer/internal/AFf1zSDK$AFa1uSDK;", "Lcom/appsflyer/internal/AFf1zSDK$AFa1ySDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFf1zSDK {

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> getMediationNetwork = f0.j(AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE);

    @NotNull
    public final String AFAdRevenueData;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFf1zSDK$AFa1tSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1rSDK;", "p0", "Lcom/appsflyer/internal/AFf1zSDK;", "getRevenue", "(Lcom/appsflyer/internal/AFa1rSDK;)Lcom/appsflyer/internal/AFf1zSDK;", "", "", "getMediationNetwork", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1zSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static AFf1zSDK getRevenue(@NotNull AFa1rSDK p03) {
            String obj;
            Object obj2;
            String obj3;
            Intrinsics.checkNotNullParameter(p03, "");
            if (p03.getRevenue() == AFf1rSDK.CONVERSION) {
                return AFa1zSDK.INSTANCE;
            }
            Integer num = null;
            if (p03.getRevenue() != AFf1rSDK.INAPP || !AFf1zSDK.getMediationNetwork.contains(p03.component4)) {
                return null;
            }
            Map<String, Object> map = p03.AFAdRevenueData;
            Float e13 = (map == null || (obj2 = map.get(AFInAppEventParameterName.REVENUE)) == null || (obj3 = obj2.toString()) == null) ? null : y.e(obj3);
            Object obj4 = p03.getCurrencyIso4217Code().get("iaecounter");
            if (obj4 != null && (obj = obj4.toString()) != null) {
                num = StringsKt.toIntOrNull(obj);
            }
            String str = p03.component4;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return new AFa1uSDK(str, e13, num);
        }
    }

    public static final class AFa1uSDK extends AFf1zSDK {
        public final Float getMediationNetwork;

        @NotNull
        private final String getMonetizationNetwork;
        public final Integer getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AFa1uSDK(@NotNull String str, Float f13, Integer num) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.getMonetizationNetwork = str;
            this.getMediationNetwork = f13;
            this.getRevenue = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.d(this.getMonetizationNetwork, aFa1uSDK.getMonetizationNetwork) && Intrinsics.d(this.getMediationNetwork, aFa1uSDK.getMediationNetwork) && Intrinsics.d(this.getRevenue, aFa1uSDK.getRevenue);
        }

        public final int hashCode() {
            int hashCode = this.getMonetizationNetwork.hashCode() * 31;
            Float f13 = this.getMediationNetwork;
            int hashCode2 = (hashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
            Integer num = this.getRevenue;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            String str = this.getMonetizationNetwork;
            Float f13 = this.getMediationNetwork;
            Integer num = this.getRevenue;
            StringBuilder sb3 = new StringBuilder("PredefinedInAppEvent(name=");
            sb3.append(str);
            sb3.append(", eventRevenue=");
            sb3.append(f13);
            sb3.append(", eventCounter=");
            return a.c.i(sb3, num, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFf1zSDK$AFa1ySDK;", "Lcom/appsflyer/internal/AFf1zSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1ySDK extends AFf1zSDK {

        @NotNull
        public static final AFa1ySDK INSTANCE = new AFa1ySDK();

        private AFa1ySDK() {
            super("af_sandbox_revenue", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFf1zSDK$AFa1zSDK;", "Lcom/appsflyer/internal/AFf1zSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1zSDK extends AFf1zSDK {

        @NotNull
        public static final AFa1zSDK INSTANCE = new AFa1zSDK();

        private AFa1zSDK() {
            super("install", null);
        }
    }

    private AFf1zSDK(String str) {
        this.AFAdRevenueData = str;
    }

    public /* synthetic */ AFf1zSDK(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
