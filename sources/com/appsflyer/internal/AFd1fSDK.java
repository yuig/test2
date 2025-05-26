package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getRevenue", "()Lorg/json/JSONObject;", "getMonetizationNetwork", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "getCurrencyIso4217Code", "AFAdRevenueData", "Ljava/lang/String;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AFd1fSDK {

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    final String AFAdRevenueData;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    int getCurrencyIso4217Code;

    @NotNull
    public String getMonetizationNetwork;

    @NotNull
    public String getRevenue;

    public AFd1fSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
        this.getMonetizationNetwork = str3;
        this.getCurrencyIso4217Code = i13;
    }

    public final boolean equals(Object p03) {
        if (this == p03) {
            return true;
        }
        if (!(p03 instanceof AFd1fSDK)) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) p03;
        return Intrinsics.d(this.getRevenue, aFd1fSDK.getRevenue) && Intrinsics.d(this.AFAdRevenueData, aFd1fSDK.AFAdRevenueData) && Intrinsics.d(this.getMonetizationNetwork, aFd1fSDK.getMonetizationNetwork) && this.getCurrencyIso4217Code == aFd1fSDK.getCurrencyIso4217Code;
    }

    @NotNull
    public final String getMonetizationNetwork() {
        String str = this.getRevenue;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getMonetizationNetwork;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        String encodeToString3 = Base64.encodeToString(bytes3, 2);
        int i13 = this.getCurrencyIso4217Code;
        StringBuilder w13 = a.a.w("label=", encodeToString, "\nhashName=", encodeToString2, "\nstackTrace=");
        w13.append(encodeToString3);
        w13.append("\nc=");
        w13.append(i13);
        return w13.toString();
    }

    @NotNull
    public final JSONObject getRevenue() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getRevenue);
        jSONObject.put("hash_name", this.AFAdRevenueData);
        jSONObject.put("st", this.getMonetizationNetwork);
        jSONObject.put("c", String.valueOf(this.getCurrencyIso4217Code));
        return jSONObject;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getCurrencyIso4217Code) + ((this.getMonetizationNetwork.hashCode() + ((this.AFAdRevenueData.hashCode() + (this.getRevenue.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        String str3 = this.getMonetizationNetwork;
        int i13 = this.getCurrencyIso4217Code;
        StringBuilder w13 = a.a.w("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
        w13.append(str3);
        w13.append(", counter=");
        w13.append(i13);
        w13.append(")");
        return w13.toString();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getRevenue", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1fSDK;", "getCurrencyIso4217Code", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1fSDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static AFd1fSDK getCurrencyIso4217Code(@NotNull String p03) {
            List<String> split$default;
            Intrinsics.checkNotNullParameter(p03, "");
            split$default = StringsKt__StringsKt.split$default(p03, new String[]{"\n"}, false, 0, 6, null);
            if (split$default.size() != 4) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            for (String str4 : split$default) {
                if (z.p(str4, "label=", false)) {
                    str = getRevenue(str4, "label=");
                } else if (z.p(str4, "hashName=", false)) {
                    str2 = getRevenue(str4, "hashName=");
                } else if (!z.p(str4, "stackTrace=", false)) {
                    if (!z.p(str4, "c=", false)) {
                        break;
                    }
                    String substring = str4.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(StringsKt.i0(substring).toString()));
                } else {
                    str3 = getRevenue(str4, "stackTrace=");
                }
            }
            if (getRevenue(num, str, str2, str3)) {
                return null;
            }
            Intrinsics.f(str);
            Intrinsics.f(str2);
            Intrinsics.f(str3);
            Intrinsics.f(num);
            return new AFd1fSDK(str, str2, str3, num.intValue());
        }

        private static boolean getRevenue(Integer p03, String... p13) {
            boolean z13 = p03 == null;
            int length = p13.length;
            for (int i13 = 0; i13 < 3; i13++) {
                String str = p13[i13];
                z13 = z13 || str == null || str.length() == 0;
            }
            return z13;
        }

        private static String getRevenue(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.i0(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }
    }

    public /* synthetic */ AFd1fSDK(String str, String str2, String str3, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i14 & 8) != 0 ? 1 : i13);
    }
}
