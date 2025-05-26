package oe;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum l {
    ARRAY,
    BOOL,
    INT;


    @NotNull
    public static final k Companion = new k();

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        l[] valuesCustom = values();
        return (l[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
