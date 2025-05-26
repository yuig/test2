package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.RedactionConfig;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Swazzled
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/RedactionConfigImpl;", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/RedactionConfig;", "()V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RedactionConfigImpl implements RedactionConfig {

    @NotNull
    public static final RedactionConfigImpl INSTANCE = new RedactionConfigImpl();

    private RedactionConfigImpl() {
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.RedactionConfig
    public List<String> getSensitiveKeysDenylist() {
        return RedactionConfig.DefaultImpls.getSensitiveKeysDenylist(this);
    }
}
