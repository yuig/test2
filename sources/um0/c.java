package um0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final c DeletionConfirmationAlert = new c("DeletionConfirmationAlert", 0, 0);

    /* renamed from: id, reason: collision with root package name */
    private final int f122691id;

    private static final /* synthetic */ c[] $values() {
        return new c[]{DeletionConfirmationAlert};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b();
    }

    private c(String str, int i13, int i14) {
        this.f122691id = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f122691id;
    }
}
