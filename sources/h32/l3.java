package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l3[] $VALUES;

    @NotNull
    public static final j3 Companion;
    public static final l3 PROCESSING = new l3("PROCESSING", 0);
    public static final l3 PROCESSING_FAILED = new l3("PROCESSING_FAILED", 1);
    public static final l3 REVIEWING = new l3("REVIEWING", 2);
    public static final l3 REVIEWING_FAILED = new l3("REVIEWING_FAILED", 3);
    public static final l3 SUCCESS = new l3("SUCCESS", 4);
    public static final l3 DEFERRED = new l3("DEFERRED", 5);

    private static final /* synthetic */ l3[] $values() {
        return new l3[]{PROCESSING, PROCESSING_FAILED, REVIEWING, REVIEWING_FAILED, SUCCESS, DEFERRED};
    }

    static {
        l3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new j3();
    }

    private l3(String str, int i13) {
    }

    public static final l3 findByValue(int i13) {
        Companion.getClass();
        return j3.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l3 valueOf(String str) {
        return (l3) Enum.valueOf(l3.class, str);
    }

    public static l3[] values() {
        return (l3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (k3.f67135a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
