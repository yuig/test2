package th2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum m {
    UNSET("Unset"),
    ERROR("Error"),
    OK("Ok");


    @NotNull
    private final String value;

    m(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
