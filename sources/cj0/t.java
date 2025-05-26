package cj0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t BoardFeed = new t("BoardFeed", 0);

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f27866id = name();

    private static final /* synthetic */ t[] $values() {
        return new t[]{BoardFeed};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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

    @NotNull
    public final String getId() {
        return this.f27866id;
    }
}
