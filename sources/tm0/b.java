package tm0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;

    /* renamed from: id, reason: collision with root package name */
    private final int f118126id;
    public static final b ArchiveConfirmation = new b("ArchiveConfirmation", 0, 0);
    public static final b UnarchiveConfirmation = new b("UnarchiveConfirmation", 1, 1);

    private static final /* synthetic */ b[] $values() {
        return new b[]{ArchiveConfirmation, UnarchiveConfirmation};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, int i14) {
        this.f118126id = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f118126id;
    }
}
