package ge1;

import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FILTER_ERROR_STATE_BUTTON_TAPPED;
    public static final a FILTER_ERROR_STATE_BUTTON_VIEWED;
    public static final a FILTER_ERROR_STATE_EOF_BUTTON_TAPPED;
    public static final a FILTER_ERROR_STATE_EOF_BUTTON_VIEWED;
    public static final a FILTER_ERROR_STATE_EOF_VIEWED;
    public static final a FILTER_ERROR_STATE_VIEWED;

    @NotNull
    private final g0 componentType;
    private final u0 elementType;

    @NotNull
    private final f1 eventType;

    private static final /* synthetic */ a[] $values() {
        return new a[]{FILTER_ERROR_STATE_VIEWED, FILTER_ERROR_STATE_EOF_VIEWED, FILTER_ERROR_STATE_BUTTON_VIEWED, FILTER_ERROR_STATE_EOF_BUTTON_VIEWED, FILTER_ERROR_STATE_BUTTON_TAPPED, FILTER_ERROR_STATE_EOF_BUTTON_TAPPED};
    }

    static {
        f1 f1Var = f1.VIEW;
        g0 g0Var = g0.FILTER_ERROR_STATE;
        u0 u0Var = null;
        int i13 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        FILTER_ERROR_STATE_VIEWED = new a("FILTER_ERROR_STATE_VIEWED", 0, f1Var, g0Var, u0Var, i13, defaultConstructorMarker);
        g0 g0Var2 = g0.FILTER_ERROR_STATE_EOF;
        FILTER_ERROR_STATE_EOF_VIEWED = new a("FILTER_ERROR_STATE_EOF_VIEWED", 1, f1Var, g0Var2, u0Var, i13, defaultConstructorMarker);
        u0 u0Var2 = u0.FILTER_ERROR_STATE_BUTTON;
        FILTER_ERROR_STATE_BUTTON_VIEWED = new a("FILTER_ERROR_STATE_BUTTON_VIEWED", 2, f1Var, g0Var, u0Var2);
        FILTER_ERROR_STATE_EOF_BUTTON_VIEWED = new a("FILTER_ERROR_STATE_EOF_BUTTON_VIEWED", 3, f1Var, g0Var2, u0Var2);
        f1 f1Var2 = f1.TAP;
        FILTER_ERROR_STATE_BUTTON_TAPPED = new a("FILTER_ERROR_STATE_BUTTON_TAPPED", 4, f1Var2, g0Var, u0Var2);
        FILTER_ERROR_STATE_EOF_BUTTON_TAPPED = new a("FILTER_ERROR_STATE_EOF_BUTTON_TAPPED", 5, f1Var2, g0Var2, u0Var2);
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ a(String str, int i13, f1 f1Var, g0 g0Var, u0 u0Var, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, f1Var, g0Var, (i14 & 4) != 0 ? null : u0Var);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final g0 getComponentType() {
        return this.componentType;
    }

    public final u0 getElementType() {
        return this.elementType;
    }

    @NotNull
    public final f1 getEventType() {
        return this.eventType;
    }

    private a(String str, int i13, f1 f1Var, g0 g0Var, u0 u0Var) {
        this.eventType = f1Var;
        this.componentType = g0Var;
        this.elementType = u0Var;
    }
}
