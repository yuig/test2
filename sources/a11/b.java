package a11;

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

    @NotNull
    private final nq.b navigationType;
    public static final b Swipe = new b("Swipe", 0, nq.b.SWIPE);
    public static final b Feed = new b("Feed", 1, nq.b.CLICK);
    public static final b Deeplink = new b("Deeplink", 2, nq.b.DEEPLINK);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Swipe, Feed, Deeplink};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, nq.b bVar) {
        this.navigationType = bVar;
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

    @NotNull
    public final nq.b getNavigationType() {
        return this.navigationType;
    }
}
