package df;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum e1 {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    @NotNull
    private static final EnumSet<e1> ALL;

    @NotNull
    public static final d1 Companion = new d1();
    private final long value;

    static {
        EnumSet<e1> allOf = EnumSet.allOf(e1.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    e1(long j13) {
        this.value = j13;
    }

    @NotNull
    public static final EnumSet<e1> parseOptions(long j13) {
        Companion.getClass();
        return d1.a(j13);
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e1[] valuesCustom() {
        e1[] valuesCustom = values();
        return (e1[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long getValue() {
        return this.value;
    }
}
