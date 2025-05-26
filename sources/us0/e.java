package us0;

import h32.a4;
import h32.u0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final u0 elementType;

    @NotNull
    private final a4 viewParameterType;
    public static final e PINS = new e("PINS", 0, a4.HOMEFEED_CONTROL_ACTIVITY, u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB);
    public static final e INTERESTS = new e("INTERESTS", 1, a4.HOMEFEED_CONTROL_INTERESTS, u0.HOME_FEED_CONTROL_PANEL_TOPICS_TAB);
    public static final e BOARDS = new e("BOARDS", 2, a4.HOMEFEED_CONTROL_BOARDS, u0.HOME_FEED_CONTROL_PANEL_BOARDS_TAB);
    public static final e FOLLOWING = new e("FOLLOWING", 3, a4.HOMEFEED_CONTROL_PROFILES, u0.HOME_FEED_CONTROL_PANEL_PROFILES_TAB);

    private static final /* synthetic */ e[] $values() {
        return new e[]{PINS, INTERESTS, BOARDS, FOLLOWING};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, a4 a4Var, u0 u0Var) {
        this.viewParameterType = a4Var;
        this.elementType = u0Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final u0 getElementType() {
        return this.elementType;
    }

    @NotNull
    public final a4 getViewParameterType() {
        return this.viewParameterType;
    }
}
