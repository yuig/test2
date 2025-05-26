package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.collections.z0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/NetworkCaptureConfig;", "", "getIgnoredRequestPatternList", "", "", "getLimitsByDomain", "", "getNetworkBodyCapturePublicKey", "getRequestLimitPerDomain", "", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NetworkCaptureConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static List<String> getIgnoredRequestPatternList(@NotNull NetworkCaptureConfig networkCaptureConfig) {
            return q0.f80391a;
        }

        @NotNull
        public static Map<String, String> getLimitsByDomain(@NotNull NetworkCaptureConfig networkCaptureConfig) {
            return z0.d();
        }

        public static String getNetworkBodyCapturePublicKey(@NotNull NetworkCaptureConfig networkCaptureConfig) {
            return null;
        }

        public static int getRequestLimitPerDomain(@NotNull NetworkCaptureConfig networkCaptureConfig) {
            return 1000;
        }
    }

    @NotNull
    List<String> getIgnoredRequestPatternList();

    @NotNull
    Map<String, String> getLimitsByDomain();

    String getNetworkBodyCapturePublicKey();

    int getRequestLimitPerDomain();
}
