package qg2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum k {
    NOT_REACHABLE("none"),
    WIFI("wifi"),
    WAN("wan"),
    UNKNOWN("unknown");


    @NotNull
    private final String value;

    k(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final boolean isReachable() {
        return this != NOT_REACHABLE;
    }
}
