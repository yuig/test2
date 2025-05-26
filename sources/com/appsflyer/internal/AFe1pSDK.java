package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFe1pSDK;", "Lcom/appsflyer/internal/AFe1kSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1pSDK extends AFe1kSDK {

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFe1pSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCurrencyIso4217Code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1pSDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String getCurrencyIso4217Code(String p03, String p13, String p23) {
            return String.format(AFe1sSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName()) + p03 + p23 + "?device_id=" + p13;
        }

        public static String getRevenue(@NotNull String p03, @NotNull String p13, String p23, @NotNull String p33, @NotNull String p43) {
            Intrinsics.checkNotNullParameter(p03, "");
            Intrinsics.checkNotNullParameter(p13, "");
            Intrinsics.checkNotNullParameter(p33, "");
            Intrinsics.checkNotNullParameter(p43, "");
            return AFb1mSDK.getRevenue(TextUtils.join("\u2063", new String[]{p43, p23, p03 + p13}), p33);
        }
    }

    public /* synthetic */ AFe1pSDK(String str, Map map, byte[] bArr, String str2, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i13 & 4) != 0 ? null : bArr, (i13 & 8) != 0 ? "GET" : str2, (i13 & 16) != 0 ? false : z13);
    }

    @NotNull
    public static final AFe1pSDK getMediationNetwork(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String currencyIso4217Code = Companion.getCurrencyIso4217Code(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFe1pSDK aFe1pSDK = new AFe1pSDK(currencyIso4217Code, z0.g(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf), new Pair("af_sig", Companion.getRevenue(str, str3, str2, str4, valueOf))), null, null, false, 28, null);
        aFe1pSDK.component1 = 10000;
        return aFe1pSDK;
    }

    private AFe1pSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z13) {
        super(str, bArr, str2, map, z13);
    }
}
