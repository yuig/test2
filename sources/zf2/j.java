package zf2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum j {
    COLD("cold"),
    HOT("hot");


    @NotNull
    private final String typeName;

    j(String str) {
        this.typeName = str;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }
}
