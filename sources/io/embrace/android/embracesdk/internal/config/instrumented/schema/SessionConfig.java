package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0006"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/SessionConfig;", "", "getFullSessionEvents", "", "", "getSessionComponents", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SessionConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static List<String> getFullSessionEvents(@NotNull SessionConfig sessionConfig) {
            return q0.f80391a;
        }

        public static List<String> getSessionComponents(@NotNull SessionConfig sessionConfig) {
            return null;
        }
    }

    @NotNull
    List<String> getFullSessionEvents();

    List<String> getSessionComponents();
}
