package a41;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 LayoutBoards = new q0("LayoutBoards", 2, d70.g.manage_visibility, null, 2, null);
    private final Integer subtitleResId;
    private final int titleResId;
    public static final q0 AutoSortBoards = new q0("AutoSortBoards", 0, c52.e.boards_auto_sort, Integer.valueOf(c52.e.boards_auto_sort_description));
    public static final q0 ReorderBoards = new q0("ReorderBoards", 1, d70.g.reorder_boards, Integer.valueOf(nz1.f.lego_profile_organize_reorder_boards_subtitle));

    private static final /* synthetic */ q0[] $values() {
        return new q0[]{AutoSortBoards, ReorderBoards, LayoutBoards};
    }

    static {
        q0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ q0(String str, int i13, int i14, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, (i15 & 2) != 0 ? null : num);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    public final Integer getSubtitleResId() {
        return this.subtitleResId;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    private q0(String str, int i13, int i14, Integer num) {
        this.titleResId = i14;
        this.subtitleResId = num;
    }
}
