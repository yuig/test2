package an2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class n0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 HTML;
    public static final n0 PLAIN;

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{PLAIN, HTML};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        PLAIN = new m0("PLAIN", 0, defaultConstructorMarker);
        HTML = new l0("HTML", 1, defaultConstructorMarker);
        n0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ n0(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    @NotNull
    public abstract String escape(@NotNull String str);

    private n0(String str, int i13) {
    }
}
