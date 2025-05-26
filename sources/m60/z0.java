package m60;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 NONE = new z0("NONE", 0);
    public static final z0 SKIN_TONE = new z0("SKIN_TONE", 1);
    public static final z0 SHOPPING = new z0("SHOPPING", 2);
    public static final z0 CONTENT_QUALITY = new z0("CONTENT_QUALITY", 3);
    public static final z0 TRUST_AND_SAFETY = new z0("TRUST_AND_SAFETY", 4);

    private static final /* synthetic */ z0[] $values() {
        return new z0[]{NONE, SKIN_TONE, SHOPPING, CONTENT_QUALITY, TRUST_AND_SAFETY};
    }

    static {
        z0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private z0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
