package wm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 AVATAR = new a0("AVATAR", 0);
    public static final a0 ICON = new a0("ICON", 1);
    public static final a0 IMAGE = new a0("IMAGE", 2);
    public static final a0 CUSTOM = new a0("CUSTOM", 3);
    public static final a0 NONE = new a0("NONE", 4);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{AVATAR, ICON, IMAGE, CUSTOM, NONE};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
