package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/BaseUrlConfig;", "", "getConfig", "", "getData", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BaseUrlConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getConfig(@NotNull BaseUrlConfig baseUrlConfig) {
            return null;
        }

        public static String getData(@NotNull BaseUrlConfig baseUrlConfig) {
            return null;
        }
    }

    String getConfig();

    String getData();
}
