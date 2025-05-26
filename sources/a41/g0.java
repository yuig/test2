package a41;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 AvatarIcon = new g0("AvatarIcon", 0);
    public static final g0 BackIcon = new g0("BackIcon", 1);
    public static final g0 OptionsIcon = new g0("OptionsIcon", 2);
    public static final g0 SettingsIcon = new g0("SettingsIcon", 3);
    public static final g0 ShareIcon = new g0("ShareIcon", 4);

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{AvatarIcon, BackIcon, OptionsIcon, SettingsIcon, ShareIcon};
    }

    static {
        g0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private g0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
