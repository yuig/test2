package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Swazzled
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/ProjectConfigImpl;", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/ProjectConfig;", "()V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProjectConfigImpl implements ProjectConfig {

    @NotNull
    public static final ProjectConfigImpl INSTANCE = new ProjectConfigImpl();

    private ProjectConfigImpl() {
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig
    public String getAppFramework() {
        return ProjectConfig.DefaultImpls.getAppFramework(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig
    public String getAppId() {
        ProjectConfig.DefaultImpls.getAppId(this);
        return "tcc5P";
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig
    public String getBuildFlavor() {
        ProjectConfig.DefaultImpls.getBuildFlavor(this);
        return "production";
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig
    public String getBuildId() {
        ProjectConfig.DefaultImpls.getBuildId(this);
        return "060058D53E4F486098A6B69909A238EE";
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig
    public String getBuildType() {
        ProjectConfig.DefaultImpls.getBuildType(this);
        return "release";
    }
}
