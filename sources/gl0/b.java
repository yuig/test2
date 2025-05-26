package gl0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.t;
import h32.u0;
import lb.l0;
import m60.t0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BOARD_NEW_IDEA_TAB = new b("BOARD_NEW_IDEA_TAB", 0, (ScreenLocation) t.f51361b.getValue(), t0.board_host_tab_new_idea, u0.MORE_IDEAS_TAB);

    @NotNull
    public static final a Companion;

    @NotNull
    private final u0 elementType;

    @NotNull
    private final ScreenLocation location;
    private final int viewId;

    private static final /* synthetic */ b[] $values() {
        return new b[]{BOARD_NEW_IDEA_TAB};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, ScreenLocation screenLocation, int i14, u0 u0Var) {
        this.location = screenLocation;
        this.viewId = i14;
        this.elementType = u0Var;
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
    public final u0 getElementType() {
        return this.elementType;
    }

    @NotNull
    public final ScreenLocation getLocation() {
        return this.location;
    }

    public final int getViewId() {
        return this.viewId;
    }
}
