package we;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum c {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


    @NotNull
    private final String eventType;

    c(String str) {
        this.eventType = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] valuesCustom = values();
        return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.eventType;
    }
}
