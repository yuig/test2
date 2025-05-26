package zn;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public enum a {
    PLAIN("plain"),
    S256("S256");


    @NonNull
    private final String value;

    a(@NonNull String str) {
        this.value = str;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
