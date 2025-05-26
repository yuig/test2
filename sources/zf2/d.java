package zf2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum d {
    CREATE("create"),
    START("start"),
    RESUME("resume"),
    RENDER("render");


    @NotNull
    private final String typeName;

    d(String str) {
        this.typeName = str;
    }

    @NotNull
    public final String spanName(@NotNull String componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        return componentName + '-' + this.typeName;
    }
}
