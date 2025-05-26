package kotlin.text;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CANON_EQ;
    public static final p COMMENTS;
    public static final p DOT_MATCHES_ALL;
    public static final p IGNORE_CASE;
    public static final p LITERAL;
    public static final p MULTILINE;
    public static final p UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ p[] $values() {
        return new p[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i13 = 2;
        IGNORE_CASE = new p("IGNORE_CASE", 0, i13, 0, 2, null);
        int i14 = 0;
        int i15 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MULTILINE = new p("MULTILINE", 1, 8, i14, i15, defaultConstructorMarker);
        int i16 = 0;
        int i17 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        LITERAL = new p("LITERAL", i13, 16, i16, i17, defaultConstructorMarker2);
        UNIX_LINES = new p("UNIX_LINES", 3, 1, i14, i15, defaultConstructorMarker);
        COMMENTS = new p("COMMENTS", 4, 4, i16, i17, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new p("DOT_MATCHES_ALL", 5, 32, i14, i15, defaultConstructorMarker);
        CANON_EQ = new p("CANON_EQ", 6, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, i16, i17, defaultConstructorMarker2);
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13, int i14, int i15) {
        this.value = i14;
        this.mask = i15;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    public /* synthetic */ p(String str, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, (i16 & 2) != 0 ? i14 : i15);
    }
}
