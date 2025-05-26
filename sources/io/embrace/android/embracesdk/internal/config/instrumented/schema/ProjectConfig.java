package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\b"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/ProjectConfig;", "", "getAppFramework", "", "getAppId", "getBuildFlavor", "getBuildId", "getBuildType", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProjectConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getAppFramework(@NotNull ProjectConfig projectConfig) {
            return null;
        }

        public static String getAppId(@NotNull ProjectConfig projectConfig) {
            return null;
        }

        public static String getBuildFlavor(@NotNull ProjectConfig projectConfig) {
            return null;
        }

        public static String getBuildId(@NotNull ProjectConfig projectConfig) {
            return null;
        }

        public static String getBuildType(@NotNull ProjectConfig projectConfig) {
            return null;
        }
    }

    String getAppFramework();

    String getAppId();

    String getBuildFlavor();

    String getBuildId();

    String getBuildType();
}
