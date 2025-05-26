package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0015\u0010\r\u001a\u00020\n8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0003\u001a\u00020\n8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "", "Lcom/appsflyer/internal/AFd1nSDK;", "getRevenue", "Lcom/appsflyer/internal/AFd1nSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1pSDK;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1pSDK;", "component1", "", "component4", "Lxk2/k;", "AFAdRevenueData", "getCurrencyIso4217Code", "", "()Z", "()Ljava/lang/String;", "component2", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFd1pSDK;)V", "AFa1tSDK"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AFe1eSDK {
    private static AFe1fSDK areAllFieldsValid;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final xk2.k AFAdRevenueData;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final xk2.k getRevenue;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFd1pSDK component1;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFd1nSDK getMediationNetwork;

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFAdRevenueData = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String getMediationNetwork = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> component2 = f0.j("googleplay", "playstore", "googleplaystore");

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1eSDK.this.getMediationNetwork.getRevenue.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1eSDK.getMonetizationNetwork(packageName, AFe1eSDK.AFAdRevenueData(AFe1eSDK.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends s implements Function0<String> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code(AFe1eSDK.this.component1, AFe1eSDK.this.getMediationNetwork.component1());
            if (currencyIso4217Code != null && !z.j(currencyIso4217Code)) {
                String obj = StringsKt.i0(currencyIso4217Code).toString();
                List<String> monetizationNetwork = Companion.getMonetizationNetwork();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = obj.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (monetizationNetwork.contains(lowerCase)) {
                    String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    AFLogger.afWarnLog(format);
                    currencyIso4217Code = "";
                } else {
                    currencyIso4217Code = "-".concat(obj);
                }
            }
            return StringsKt.i0(currencyIso4217Code != null ? currencyIso4217Code : "").toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\r\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK$AFa1tSDK;", "", "<init>", "()V", "", "", "component2", "Ljava/util/List;", "getMonetizationNetwork", "()Ljava/util/List;", "getRevenue", "AFAdRevenueData", "Ljava/lang/String;", "getMediationNetwork", "Lcom/appsflyer/internal/AFe1fSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1fSDK;", "(Lcom/appsflyer/internal/AFe1fSDK;)V", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void getMediationNetwork(AFe1fSDK aFe1fSDK) {
            AFe1eSDK.areAllFieldsValid = aFe1fSDK;
        }

        @NotNull
        public static List<String> getMonetizationNetwork() {
            return AFe1eSDK.component2;
        }
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1bSDK.values().length];
            try {
                iArr[AFe1bSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1bSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1bSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    public AFe1eSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.getMediationNetwork = aFd1nSDK;
        this.component1 = aFd1pSDK;
        this.AFAdRevenueData = xk2.m.b(new AnonymousClass4());
        this.getRevenue = xk2.m.b(new AnonymousClass1());
    }

    public static boolean AFAdRevenueData() {
        return areAllFieldsValid == null;
    }

    @NotNull
    public final String getMediationNetwork() {
        int i13 = AFa1ySDK.getCurrencyIso4217Code[(AFAdRevenueData() ? AFe1bSDK.DEFAULT : AFe1bSDK.API).ordinal()];
        if (i13 == 1) {
            return (String) this.getRevenue.getValue();
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1fSDK aFe1fSDK = areAllFieldsValid;
        String str = aFe1fSDK != null ? aFe1fSDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1eSDK aFe1eSDK) {
        return (String) aFe1eSDK.AFAdRevenueData.getValue();
    }

    @NotNull
    public final String getMonetizationNetwork() {
        AFe1bSDK aFe1bSDK;
        if (AFAdRevenueData()) {
            aFe1bSDK = AFe1bSDK.DEFAULT;
        } else {
            aFe1bSDK = AFe1bSDK.API;
        }
        int i13 = AFa1ySDK.getCurrencyIso4217Code[aFe1bSDK.ordinal()];
        if (i13 == 1) {
            return "appsflyersdk.com";
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1fSDK aFe1fSDK = areAllFieldsValid;
        String str = aFe1fSDK != null ? aFe1fSDK.getMediationNetwork : null;
        return str == null ? "" : str;
    }

    public static final void getMediationNetwork(AFe1fSDK aFe1fSDK) {
        Companion.getMediationNetwork(aFe1fSDK);
    }

    public static final /* synthetic */ String getMonetizationNetwork(String str, String str2) {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring + "-";
    }
}
