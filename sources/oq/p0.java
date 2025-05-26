package oq;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final int f97118id;
    public static final p0 SHOW_TRANSLATION = new p0("SHOW_TRANSLATION", 0, n80.f.show_translation_label);
    public static final p0 SHOW_ORIGINAL = new p0("SHOW_ORIGINAL", 1, n80.f.show_original_label);
    public static final p0 LOADING = new p0("LOADING", 2, n80.f.translating_label);

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{SHOW_TRANSLATION, SHOW_ORIGINAL, LOADING};
    }

    static {
        p0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private p0(String str, int i13, int i14) {
        this.f97118id = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f97118id;
    }
}
