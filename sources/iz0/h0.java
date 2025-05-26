package iz0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 HEADER = new h0("HEADER", 0);
    public static final h0 BODY = new h0("BODY", 1);
    public static final h0 PIN_FEED_HEADER = new h0("PIN_FEED_HEADER", 2);
    public static final h0 PIN_FEED = new h0("PIN_FEED", 3);
    public static final h0 SURVEY = new h0("SURVEY", 4);
    public static final h0 FOOTER = new h0("FOOTER", 5);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{HEADER, BODY, PIN_FEED_HEADER, PIN_FEED, SURVEY, FOOTER};
    }

    static {
        h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    @NotNull
    public final String id() {
        return name();
    }
}
