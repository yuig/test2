package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k4 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k4[] $VALUES;

    @NotNull
    public static final i4 Companion;
    public static final k4 WATCHTIME_VOLUME = new k4("WATCHTIME_VOLUME", 0);
    public static final k4 WATCHTIME_PLAYSTATE = new k4("WATCHTIME_PLAYSTATE", 1);
    public static final k4 WATCHTIME_VIEWABILITY = new k4("WATCHTIME_VIEWABILITY", 2);
    public static final k4 WATCHTIME_TRANSITION = new k4("WATCHTIME_TRANSITION", 3);
    public static final k4 WATCHTIME_SEEK_START = new k4("WATCHTIME_SEEK_START", 4);
    public static final k4 WATCHTIME_SEEK_END = new k4("WATCHTIME_SEEK_END", 5);
    public static final k4 WATCHTIME_VIDEO_END = new k4("WATCHTIME_VIDEO_END", 6);
    public static final k4 WATCHTIME_BEGIN_SESSION = new k4("WATCHTIME_BEGIN_SESSION", 7);
    public static final k4 WATCHTIME_END_SESSION = new k4("WATCHTIME_END_SESSION", 8);

    private static final /* synthetic */ k4[] $values() {
        return new k4[]{WATCHTIME_VOLUME, WATCHTIME_PLAYSTATE, WATCHTIME_VIEWABILITY, WATCHTIME_TRANSITION, WATCHTIME_SEEK_START, WATCHTIME_SEEK_END, WATCHTIME_VIDEO_END, WATCHTIME_BEGIN_SESSION, WATCHTIME_END_SESSION};
    }

    static {
        k4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new i4();
    }

    private k4(String str, int i13) {
    }

    public static final k4 findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return WATCHTIME_VOLUME;
            case 1:
                return WATCHTIME_PLAYSTATE;
            case 2:
                return WATCHTIME_VIEWABILITY;
            case 3:
                return WATCHTIME_TRANSITION;
            case 4:
                return WATCHTIME_SEEK_START;
            case 5:
                return WATCHTIME_SEEK_END;
            case 6:
                return WATCHTIME_VIDEO_END;
            case 7:
                return WATCHTIME_BEGIN_SESSION;
            case 8:
                return WATCHTIME_END_SESSION;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (j4.f67126a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
