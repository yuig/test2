package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0007\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\b\u001a\u00020\u0013*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\b\u0010\u0014J\u000f\u0010\u0011\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0011\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\b\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0015\u0010\u001b\u001a\u00020\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010\b\u001a\u00020\u00038CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b#\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005"}, d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "Lcom/appsflyer/internal/AFe1aSDK;", "Lcom/appsflyer/internal/AFh1kSDK;", "", "copy", "()Z", "", "p0", "getCurrencyIso4217Code", "(I)Z", "Landroid/content/Context;", "AFAdRevenueData", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFf1kSDK$AFa1vSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1kSDK$AFa1vSDK;)Z", "getMediationNetwork", "getMonetizationNetwork", "", "", "(Lcom/appsflyer/internal/AFh1kSDK;Ljava/lang/String;)V", "", "()J", "getRevenue", "Lcom/appsflyer/internal/AFf1wSDK;", "()Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFd1oSDK;", "component3", "Lcom/appsflyer/internal/AFd1oSDK;", "Lcom/appsflyer/internal/AFd1nSDK;", "component2", "Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFd1lSDK;", "component4", "Lcom/appsflyer/internal/AFd1lSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFh1kSDK;", "component1", "Lxk2/k;", "equals", "Lcom/appsflyer/internal/AFd1gSDK;", "<init>", "(Lcom/appsflyer/internal/AFd1gSDK;)V", "AFa1tSDK", "AFa1vSDK"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AFf1kSDK extends AFe1aSDK<AFh1kSDK> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFh1kSDK getRevenue;

    /* renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final xk2.k component3;

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFd1nSDK getMediationNetwork;

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFd1oSDK AFAdRevenueData;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final AFd1lSDK component2;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final xk2.k getCurrencyIso4217Code;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1kSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function0<Long> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            Long h03;
            String revenue = AFf1kSDK.this.getMediationNetwork.getRevenue("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((revenue == null || (h03 = StringsKt.h0(revenue)) == null) ? 1000L : h03.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1kSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends s implements Function0<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1kSDK.this.getMediationNetwork.getRevenue("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1rSDK.w$default(AFLogger.INSTANCE, AFh1sSDK.ADVERTISING_ID, a.a.j("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1kSDK$AFa1vSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1kSDK$AFa1vSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AFa1vSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z13, StringBuilder sb3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i13 & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i13 & 4) != 0) {
                z13 = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i13 & 8) != 0) {
                sb3 = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z13, sb3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1vSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1vSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) other;
            return Intrinsics.d(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.d(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.d(this.gaidError, aFa1vSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z13 = this.advertisingIdWithGps;
            int i13 = z13;
            if (z13 != 0) {
                i13 = 1;
            }
            return this.gaidError.hashCode() + ((hashCode2 + i13) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z13) {
            this.advertisingIdWithGps = z13;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1vSDK(String str, Boolean bool, boolean z13, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z13;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z13, StringBuilder sb3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? new StringBuilder() : sb3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1kSDK(@NotNull AFd1gSDK aFd1gSDK) {
        super(AFf1rSDK.FETCH_ADVERTISING_ID, new AFf1rSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        AFd1oSDK AFInAppEventType = aFd1gSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.AFAdRevenueData = AFInAppEventType;
        AFd1nSDK monetizationNetwork = aFd1gSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.getMediationNetwork = monetizationNetwork;
        AFd1lSDK i13 = aFd1gSDK.i();
        Intrinsics.checkNotNullExpressionValue(i13, "");
        this.component2 = i13;
        this.getRevenue = new AFh1kSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component3 = xk2.m.b(new AnonymousClass1());
        this.getCurrencyIso4217Code = xk2.m.b(new AnonymousClass3());
    }

    private static int AFAdRevenueData(Context p03) {
        try {
            return ih.c.f72257d.c(p03, ih.d.f72258a);
        } catch (Throwable th3) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th3, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean areAllFieldsValid() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    private static boolean component2() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th3) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.ADVERTISING_ID, th3 instanceof ClassNotFoundException ? "CloudDevSdk not found" : a.a.j("Unexpected exception while checking if running in cloud environment: ", th3.getMessage()), th3, true, false, false, false, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0005->B:10:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[EDGE_INSN: B:11:0x0048->B:12:0x0048 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean copy() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = r2
        L5:
            if (r1 <= 0) goto L48
            boolean r3 = r17.areAllFieldsValid()
            r4 = 1
            if (r3 == 0) goto L22
            boolean r3 = r0.getMediationNetwork(r1)
            if (r3 == 0) goto L22
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r6 = com.appsflyer.internal.AFh1sSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using Samsung Cloud dev SDK"
            r8 = 0
            com.appsflyer.internal.AFh1rSDK.v$default(r5, r6, r7, r8, r9, r10)
        L20:
            r3 = r4
            goto L43
        L22:
            boolean r3 = r0.getCurrencyIso4217Code(r1)
            if (r3 == 0) goto L35
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r6 = com.appsflyer.internal.AFh1sSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using GMS"
            r8 = 0
            com.appsflyer.internal.AFh1rSDK.v$default(r5, r6, r7, r8, r9, r10)
            goto L20
        L35:
            com.appsflyer.AFLogger r11 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r12 = com.appsflyer.internal.AFh1sSDK.ADVERTISING_ID
            r15 = 4
            r16 = 0
            java.lang.String r13 = "Failed to fetch GAID"
            r14 = 0
            com.appsflyer.internal.AFh1rSDK.v$default(r11, r12, r13, r14, r15, r16)
            r3 = r2
        L43:
            if (r3 != 0) goto L48
            int r1 = r1 + (-1)
            goto L5
        L48:
            com.appsflyer.internal.AFd1lSDK r1 = r0.component2
            com.appsflyer.internal.AFh1kSDK r2 = r0.getRevenue
            r1.component1 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.copy():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        getCurrencyIso4217Code(r21.getRevenue, r3.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        r0 = r3.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00da, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        if (r0.length() != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e3, code lost:
    
        r0 = r21.getRevenue;
        r0.getRevenue = r3.getAdvertisingId();
        r2 = java.lang.Boolean.FALSE;
        r0.component3 = r2;
        r3 = java.lang.Boolean.TRUE;
        r0.AFAdRevenueData = r3;
        r0.getMediationNetwork = r2;
        r0.getMonetizationNetwork = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fa, code lost:
    
        if (r22 == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fc, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        r0.component2 = java.lang.Boolean.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0103, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r3.getGaidError().length() <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (r3.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getMonetizationNetwork(int r22) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.getMonetizationNetwork(int):boolean");
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    @NotNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        if (this.component2.getRevenue()) {
            AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFf1wSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean valueOf = Boolean.valueOf(copy());
        Boolean bool = Boolean.FALSE;
        AFf1wSDK aFf1wSDK = f0.j(valueOf, bool, bool).contains(Boolean.TRUE) ? AFf1wSDK.SUCCESS : AFf1wSDK.FAILURE;
        AFd1lSDK aFd1lSDK = this.component2;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
        AFh1rSDK.v$default(AFLogger.INSTANCE, AFh1sSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFe1mSDK.getMediationNetwork + "ms", false, 4, null);
        aFd1lSDK.getCurrencyIso4217Code(aFe1mSDK);
        return aFf1wSDK;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }

    private final boolean getMediationNetwork(int p03) {
        return getMonetizationNetwork(p03);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x001a, B:7:0x002c, B:12:0x0032, B:13:0x0046, B:15:0x0023), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean AFAdRevenueData(android.content.Context r13, com.appsflyer.internal.AFf1kSDK.AFa1vSDK r14) {
        /*
            r12 = this;
            com.appsflyer.internal.AFb1ySDK$AFa1vSDK r13 = com.appsflyer.internal.AFb1ySDK.getMonetizationNetwork(r13)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r13.getRevenue     // Catch: java.lang.Throwable -> L21
            r14.setAdvertisingId(r0)     // Catch: java.lang.Throwable -> L21
            boolean r13 = r13.getRevenue()     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> L21
            r14.setLimitAdTrackingEnabled(r13)     // Catch: java.lang.Throwable -> L21
            java.lang.String r13 = r14.getAdvertisingId()     // Catch: java.lang.Throwable -> L21
            if (r13 == 0) goto L23
            int r13 = r13.length()     // Catch: java.lang.Throwable -> L21
            if (r13 != 0) goto L2c
            goto L23
        L21:
            r13 = move-exception
            goto L47
        L23:
            java.lang.StringBuilder r13 = r14.getGaidError()     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "emptyOrNull (bypass) |"
            r13.append(r0)     // Catch: java.lang.Throwable -> L21
        L2c:
            kotlin.Unit r13 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L21
            if (r13 == 0) goto L32
            r13 = 1
            goto L8c
        L32:
            java.lang.StringBuilder r13 = r14.getGaidError()     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "gpsAdInfo-null (bypass) |"
            r13.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r13 = "GpsAdInfo is null (bypass)"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L21
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L47:
            com.appsflyer.AFLogger r10 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r11 = com.appsflyer.internal.AFh1sSDK.ADVERTISING_ID
            java.lang.String r0 = r13.getMessage()
            java.lang.String r1 = "Failed to fetch GAID: "
            java.lang.String r2 = a.a.j(r1, r0)
            r8 = 64
            r9 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r1 = r11
            r3 = r13
            com.appsflyer.internal.AFh1rSDK.e$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r14 = r14.getGaidError()
            java.lang.Class r0 = r13.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = " |"
            r14.append(r0)
            java.lang.String r14 = r13.getLocalizedMessage()
            if (r14 != 0) goto L82
            java.lang.String r13 = r13.toString()
            r2 = r13
            goto L83
        L82:
            r2 = r14
        L83:
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r10
            r1 = r11
            com.appsflyer.internal.AFh1rSDK.i$default(r0, r1, r2, r3, r4, r5)
            r13 = 0
        L8c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.AFAdRevenueData(android.content.Context, com.appsflyer.internal.AFf1kSDK$AFa1vSDK):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getCurrencyIso4217Code(int r14) {
        /*
            r13 = this;
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r1 = com.appsflyer.internal.AFh1sSDK.ADVERTISING_ID
            r4 = 4
            r5 = 0
            java.lang.String r2 = "Trying to fetch GAID..."
            r3 = 0
            com.appsflyer.internal.AFh1rSDK.i$default(r0, r1, r2, r3, r4, r5)
            com.appsflyer.internal.AFf1kSDK$AFa1vSDK r0 = new com.appsflyer.internal.AFf1kSDK$AFa1vSDK
            r11 = 15
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.appsflyer.internal.AFd1oSDK r1 = r13.AFAdRevenueData
            android.content.Context r1 = r1.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r1 = AFAdRevenueData(r1)
            com.appsflyer.internal.AFd1oSDK r2 = r13.AFAdRevenueData
            android.content.Context r2 = r2.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.f(r2)
            boolean r2 = r13.getCurrencyIso4217Code(r2, r0)
            r4 = 1
            if (r2 != 0) goto L83
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "enableGpsFallback"
            boolean r2 = r2.getBoolean(r5, r4)
            if (r2 == 0) goto L4d
            com.appsflyer.internal.AFd1oSDK r2 = r13.AFAdRevenueData
            android.content.Context r2 = r2.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.f(r2)
            boolean r2 = r13.AFAdRevenueData(r2, r0)
            if (r2 == 0) goto L4d
            r2 = r4
            goto L4e
        L4d:
            r2 = r3
        L4e:
            java.lang.StringBuilder r5 = r0.getGaidError()
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L7b
            boolean r6 = kotlin.text.z.j(r5)
            if (r6 == 0) goto L5f
            goto L7b
        L5f:
            java.lang.CharSequence r5 = kotlin.text.StringsKt.i0(r5)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = ": "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L7b:
            com.appsflyer.internal.AFh1kSDK r1 = r13.getRevenue
            getCurrencyIso4217Code(r1, r5)
            if (r2 != 0) goto L83
            return r3
        L83:
            com.appsflyer.internal.AFh1kSDK r1 = r13.getRevenue
            java.lang.String r2 = r0.getAdvertisingId()
            r1.getRevenue = r2
            java.lang.Boolean r2 = r0.isLimitAdTrackingEnabled()
            r1.component3 = r2
            java.lang.Boolean r2 = r0.isLimitAdTrackingEnabled()
            if (r2 == 0) goto La1
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto La2
        La1:
            r2 = 0
        La2:
            r1.AFAdRevenueData = r2
            boolean r0 = r0.getAdvertisingIdWithGps()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.getMediationNetwork = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.getMonetizationNetwork = r0
            r0 = 2
            if (r14 == r0) goto Lb6
            r3 = r4
        Lb6:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r1.component2 = r14
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1kSDK.getCurrencyIso4217Code(int):boolean");
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return ((Number) this.component3.getValue()).longValue();
    }

    private final boolean getCurrencyIso4217Code(Context p03, AFa1vSDK p13) {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p03);
            if (advertisingIdInfo != null) {
                p13.setAdvertisingId(advertisingIdInfo.getId());
                p13.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p13.setAdvertisingIdWithGps(true);
                String advertisingId = p13.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.f80348a;
                }
                p13.getGaidError().append("emptyOrNull |");
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p13.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1sSDK aFh1sSDK = AFh1sSDK.ADVERTISING_ID;
            AFh1rSDK.e$default(aFLogger, aFh1sSDK, a.a.j("Google Play Services is missing ", th3.getMessage()), th3, false, false, false, false, 88, null);
            StringBuilder gaidError = p13.getGaidError();
            gaidError.append(th3.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1rSDK.i$default(aFLogger, aFh1sSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private static void getCurrencyIso4217Code(AFh1kSDK aFh1kSDK, String str) {
        String D;
        if (str == null) {
            return;
        }
        String str2 = aFh1kSDK.getCurrencyIso4217Code;
        if (str2 != null && (D = a.a.D(str2, " | ", str)) != null) {
            str = D;
        }
        aFh1kSDK.getCurrencyIso4217Code = str;
    }
}
