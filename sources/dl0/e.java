package dl0;

import d70.g;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import rm1.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e FEATURED_BOARD;
    public static final e FEATURED_CREATOR;
    public static final e MADE_FOR_YOU;

    @NotNull
    private final q startIcon;

    @NotNull
    private final rm1.c startIconColor;
    private final int text;

    @NotNull
    private final vn1.c textColor;

    private static final /* synthetic */ e[] $values() {
        return new e[]{FEATURED_CREATOR, FEATURED_BOARD, MADE_FOR_YOU};
    }

    static {
        q qVar = q.PINTEREST;
        FEATURED_CREATOR = new e("FEATURED_CREATOR", 0, qVar, g.board_tag_featured_creator, vn1.c.ERROR, rm1.c.ERROR);
        q qVar2 = q.TAG;
        int i13 = g.board_tag_featured_board;
        vn1.c cVar = vn1.c.DEFAULT;
        FEATURED_BOARD = new e("FEATURED_BOARD", 1, qVar2, i13, cVar, rm1.c.DEFAULT);
        MADE_FOR_YOU = new e("MADE_FOR_YOU", 2, qVar, g.board_tag_made_for_you, cVar, rm1.c.BRAND);
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private e(String str, int i13, q qVar, int i14, vn1.c cVar, rm1.c cVar2) {
        this.startIcon = qVar;
        this.text = i14;
        this.textColor = cVar;
        this.startIconColor = cVar2;
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
    public final q getStartIcon() {
        return this.startIcon;
    }

    @NotNull
    public final rm1.c getStartIconColor() {
        return this.startIconColor;
    }

    public final int getText() {
        return this.text;
    }

    @NotNull
    public final vn1.c getTextColor() {
        return this.textColor;
    }
}
