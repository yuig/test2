package q11;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int viewType;
    public static final b VIEW_TYPE_TEXT_IMAGE_COMPOUND = new b("VIEW_TYPE_TEXT_IMAGE_COMPOUND", 0, 0);
    public static final b VIEW_TYPE_TEXT_INPUT = new b("VIEW_TYPE_TEXT_INPUT", 1, 1);
    public static final b VIEW_TYPE_ACTIONABLE_FIELD = new b("VIEW_TYPE_ACTIONABLE_FIELD", 2, 2);
    public static final b VIEW_TYPE_DIVIDER = new b("VIEW_TYPE_DIVIDER", 3, 3);
    public static final b VIEW_TYPE_DESC_DETAIL_WIDGET = new b("VIEW_TYPE_DESC_DETAIL_WIDGET", 4, 4);

    private static final /* synthetic */ b[] $values() {
        return new b[]{VIEW_TYPE_TEXT_IMAGE_COMPOUND, VIEW_TYPE_TEXT_INPUT, VIEW_TYPE_ACTIONABLE_FIELD, VIEW_TYPE_DIVIDER, VIEW_TYPE_DESC_DETAIL_WIDGET};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.viewType = i14;
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

    public final int getViewType() {
        return this.viewType;
    }
}
