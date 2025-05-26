package jg1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t VIDEO = new t("VIDEO", 0);
    public static final t AUDIO = new t("AUDIO", 1);

    private static final /* synthetic */ t[] $values() {
        return new t[]{VIDEO, AUDIO};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private t(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
