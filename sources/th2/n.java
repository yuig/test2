package th2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum n {
    TAP("tap"),
    LONG_PRESS("long_press");


    @NotNull
    private final String value;

    n(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
