package bk1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NO_DEEPLINK_REQUESTED = new b("NO_DEEPLINK_REQUESTED", 0);
    public static final b CHIN_CTA = new b("CHIN_CTA", 1);
    public static final b NAVIGATE_TO_CLOSEUP_COMPREHENSIVE = new b("NAVIGATE_TO_CLOSEUP_COMPREHENSIVE", 2);
    public static final b OPEN_PIN_CLOSEUP_FOR_COLLECTION_PIN = new b("OPEN_PIN_CLOSEUP_FOR_COLLECTION_PIN", 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NO_DEEPLINK_REQUESTED, CHIN_CTA, NAVIGATE_TO_CLOSEUP_COMPREHENSIVE, OPEN_PIN_CLOSEUP_FOR_COLLECTION_PIN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b(String str, int i13) {
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
}
