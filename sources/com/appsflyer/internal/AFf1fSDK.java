package com.appsflyer.internal;

import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u0011\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!"}, d2 = {"Lcom/appsflyer/internal/AFf1fSDK;", "Lcom/appsflyer/internal/AFg1ySDK;", "Lcom/appsflyer/internal/AFi1eSDK;", "p0", "Lcom/appsflyer/internal/AFd1nSDK;", "p1", "Lcom/appsflyer/internal/AFd1gSDK;", "p2", "Lcom/appsflyer/internal/AFi1zSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1eSDK;Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFd1gSDK;Lcom/appsflyer/internal/AFi1zSDK;)V", "Lcom/appsflyer/internal/AFa1rSDK;", "", "component3", "(Lcom/appsflyer/internal/AFa1rSDK;)V", "", "getMonetizationNetwork", "()J", "", "", "", "equals", "()Ljava/util/Map;", "getCurrencyIso4217Code", "", "getRevenue", "()Z", "", "(I)V", "hashCode", "Lcom/appsflyer/internal/AFd1nSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFi1eSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1fSDK extends AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static int[] valueOf = {-1612931547, 557009486, -667767602, -1237227999, -528596502, -1637579302, -685255551, 901836962, -463709388, 1016487313, 540296107, -1449668307, 1930739446, 2139422805, 956812049, -1419297548, -652047627, 1016062572};
    private static int values = 1;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final AFi1eSDK getCurrencyIso4217Code;

    /* renamed from: hashCode, reason: from kotlin metadata */
    @NotNull
    private final AFd1nSDK getMediationNetwork;

    public /* synthetic */ AFf1fSDK(AFi1eSDK aFi1eSDK, AFd1nSDK aFd1nSDK, AFd1gSDK aFd1gSDK, AFi1zSDK aFi1zSDK, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1eSDK, aFd1nSDK, aFd1gSDK, (i13 & 8) != 0 ? new AFi1zSDK() : aFi1zSDK);
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i13, int i14, int i15) {
        int i16 = values + 81;
        AFInAppEventParameterName = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return Boolean.valueOf(i16 % 2 != 0);
    }

    private static void a(int[] iArr, int i13, Object[] objArr) {
        AFk1eSDK aFk1eSDK = new AFk1eSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = valueOf;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = $11 + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
                $10 = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i15 % 2 != 0) {
                    iArr3[i14] = (int) (iArr2[i14] * (-785606903507095591L));
                } else {
                    iArr3[i14] = (int) (iArr2[i14] ^ (-785606903507095591L));
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = valueOf;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            $10 = ($11 + 57) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            int i16 = 0;
            while (i16 < length3) {
                int i17 = $11 + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
                $10 = i17 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i17 % 2 != 0) {
                    iArr6[i16] = (int) (iArr5[i16] * (-785606903507095591L));
                    i16 /= 0;
                } else {
                    iArr6[i16] = (int) (iArr5[i16] ^ (-785606903507095591L));
                    i16++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1eSDK.getMediationNetwork = 0;
        while (true) {
            int i18 = aFk1eSDK.getMediationNetwork;
            if (i18 >= iArr.length) {
                break;
            }
            int i19 = iArr[i18];
            char c13 = (char) (i19 >> 16);
            cArr[0] = c13;
            char c14 = (char) i19;
            cArr[1] = c14;
            char c15 = (char) (iArr[i18 + 1] >> 16);
            cArr[2] = c15;
            char c16 = (char) iArr[i18 + 1];
            cArr[3] = c16;
            aFk1eSDK.AFAdRevenueData = (c13 << 16) + c14;
            aFk1eSDK.getRevenue = (c15 << 16) + c16;
            AFk1eSDK.getMonetizationNetwork(iArr4);
            for (int i23 = 0; i23 < 16; i23++) {
                int i24 = aFk1eSDK.AFAdRevenueData ^ iArr4[i23];
                aFk1eSDK.AFAdRevenueData = i24;
                int currencyIso4217Code = AFk1eSDK.getCurrencyIso4217Code(i24) ^ aFk1eSDK.getRevenue;
                int i25 = aFk1eSDK.AFAdRevenueData;
                aFk1eSDK.AFAdRevenueData = currencyIso4217Code;
                aFk1eSDK.getRevenue = i25;
            }
            int i26 = aFk1eSDK.AFAdRevenueData;
            int i27 = aFk1eSDK.getRevenue;
            int i28 = i26 ^ iArr4[16];
            aFk1eSDK.getRevenue = i28;
            int i29 = i27 ^ iArr4[17];
            aFk1eSDK.AFAdRevenueData = i29;
            cArr[0] = (char) (i29 >>> 16);
            cArr[1] = (char) i29;
            cArr[2] = (char) (i28 >>> 16);
            cArr[3] = (char) i28;
            AFk1eSDK.getMonetizationNetwork(iArr4);
            int i33 = aFk1eSDK.getMediationNetwork;
            cArr2[i33 * 2] = cArr[0];
            cArr2[(i33 * 2) + 1] = cArr[1];
            cArr2[(i33 * 2) + 2] = cArr[2];
            cArr2[(i33 * 2) + 3] = cArr[3];
            aFk1eSDK.getMediationNetwork = i33 + 2;
        }
        String str = new String(cArr2, 0, i13);
        int i34 = $10 + 63;
        $11 = i34 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i34 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i35 = 28 / 0;
            objArr[0] = str;
        }
    }

    private final void component3(AFa1rSDK p03) {
        int i13 = AFInAppEventParameterName + 87;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            if (i13 % 2 == 0) {
                equals();
                throw null;
            }
            Map<String, ?> equals = equals();
            if (equals != null) {
                p03.getMonetizationNetwork(equals);
                values = (AFInAppEventParameterName + 99) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            if (this.getCurrencyIso4217Code.getMonetizationNetwork()) {
                return;
            }
            AFInAppEventParameterName = (values + 17) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Map<String, Object> component4 = AFg1xSDK.component4(p03);
            Intrinsics.checkNotNullExpressionValue(component4, "");
            component4.put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th3) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th3, true, false, false, false, 96, null);
        }
    }

    private final Map<String, Object> equals() {
        AFi1cSDK revenue = this.getCurrencyIso4217Code.getRevenue();
        if (revenue == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(revenue.getCurrencyIso4217Code));
        linkedHashMap2.put("ttr_millis", Long.valueOf(revenue.getMediationNetwork));
        String str = revenue.getRevenue;
        if (str != null) {
            linkedHashMap2.put("pia_token", str);
        }
        String str2 = revenue.AFAdRevenueData;
        if (str2 != null) {
            linkedHashMap2.put("error_code", str2);
            AFInAppEventParameterName = (values + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        AFInAppEventParameterName = (values + 47) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return linkedHashMap;
    }

    @Override // com.appsflyer.internal.AFg1ySDK, com.appsflyer.internal.AFg1xSDK
    public final void getCurrencyIso4217Code(@NotNull AFa1rSDK p03) {
        Intrinsics.checkNotNullParameter(p03, "");
        Map<String, Object> currencyIso4217Code = p03.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        Object[] objArr = new Object[1];
        a(new int[]{503371830, 416908944, 585451261, -85639521, -892297407, -676472526}, 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        currencyIso4217Code.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.getCurrencyIso4217Code(p03);
        component3(p03);
        AFj1bSDK aFj1bSDK = new AFj1bSDK(this.getMediationNetwork, null, 2, null);
        p03.getRevenue(aFj1bSDK.getCurrencyIso4217Code(AFj1bSDK.getRevenue(aFj1bSDK.getMediationNetwork(aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%spia.%s/api/v1.0/pia-android-event?app_id=")), false)));
        AFg1gSDK aFg1gSDK = this.toString;
        Map<String, Object> currencyIso4217Code2 = p03.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
        aFg1gSDK.getMediationNetwork(currencyIso4217Code2, this.getMediationNetwork.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0), this.getMediationNetwork.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i13 = AFInAppEventParameterName + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        int i13 = values + 73;
        AFInAppEventParameterName = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 1580297864, -1580297864, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFg1ySDK
    public final void getMonetizationNetwork(int p03) {
        int i13 = values + 81;
        AFInAppEventParameterName = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1fSDK(@NotNull AFi1eSDK aFi1eSDK, @NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1gSDK aFd1gSDK, @NotNull AFi1zSDK aFi1zSDK) {
        super(aFi1zSDK, aFd1gSDK);
        Intrinsics.checkNotNullParameter(aFi1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        Intrinsics.checkNotNullParameter(aFi1zSDK, "");
        this.getCurrencyIso4217Code = aFi1eSDK;
        this.getMediationNetwork = aFd1nSDK;
        this.getMonetizationNetwork.add(AFf1rSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1fSDK(@NotNull AFi1eSDK aFi1eSDK, @NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1gSDK aFd1gSDK) {
        this(aFi1eSDK, aFd1nSDK, aFd1gSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
    }
}
