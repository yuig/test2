package pg2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum s {
    LOGS("logs", "v2"),
    SESSIONS("spans", "v2"),
    CONFIG("config", "v2"),
    ATTACHMENTS("attachments", "v2"),
    UNKNOWN("unknown", "v1");


    @NotNull
    private final String path;

    @NotNull
    private final String version;

    s(String str, String str2) {
        this.path = str;
        this.version = str2;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }
}
