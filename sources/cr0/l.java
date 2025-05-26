package cr0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l Lifetime = new l("Lifetime", 0);
    public static final l Last30Days = new l("Last30Days", 1);
    public static final l LifetimeOfVideo = new l("LifetimeOfVideo", 2);
    public static final l Unknown = new l("Unknown", 3);

    private static final /* synthetic */ l[] $values() {
        return new l[]{Lifetime, Last30Days, LifetimeOfVideo, Unknown};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private l(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
