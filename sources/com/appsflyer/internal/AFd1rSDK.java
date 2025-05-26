package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFd1rSDK {

    public static final class AFa1vSDK {
        public final float getCurrencyIso4217Code;
        public final String getRevenue;

        public AFa1vSDK(float f13, String str) {
            this.getCurrencyIso4217Code = f13;
            this.getRevenue = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Float.compare(this.getCurrencyIso4217Code, aFa1vSDK.getCurrencyIso4217Code) == 0 && Intrinsics.d(this.getRevenue, aFa1vSDK.getRevenue);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.getCurrencyIso4217Code) * 31;
            String str = this.getRevenue;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getCurrencyIso4217Code + ", charging=" + this.getRevenue + ")";
        }
    }

    @NotNull
    AFa1vSDK getRevenue(@NotNull Context context);
}
