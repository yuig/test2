package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r3[] $VALUES;

    @NotNull
    public static final p3 Companion;
    public static final r3 LOADING = new r3("LOADING", 0);
    public static final r3 PLAYING = new r3("PLAYING", 1);
    public static final r3 PAUSED = new r3("PAUSED", 2);
    public static final r3 STALLING = new r3("STALLING", 3);
    public static final r3 UNKNOWN = new r3("UNKNOWN", 4);

    private static final /* synthetic */ r3[] $values() {
        return new r3[]{LOADING, PLAYING, PAUSED, STALLING, UNKNOWN};
    }

    static {
        r3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p3();
    }

    private r3(String str, int i13) {
    }

    public static final r3 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return LOADING;
        }
        if (i13 == 1) {
            return PLAYING;
        }
        if (i13 == 2) {
            return PAUSED;
        }
        if (i13 == 3) {
            return STALLING;
        }
        if (i13 != 4) {
            return null;
        }
        return UNKNOWN;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r3 valueOf(String str) {
        return (r3) Enum.valueOf(r3.class, str);
    }

    public static r3[] values() {
        return (r3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = q3.f67197a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
