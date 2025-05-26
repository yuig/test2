package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/RedactionConfig;", "", "getSensitiveKeysDenylist", "", "", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RedactionConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static List<String> getSensitiveKeysDenylist(@NotNull RedactionConfig redactionConfig) {
            return null;
        }
    }

    List<String> getSensitiveKeysDenylist();
}
