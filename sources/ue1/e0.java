package ue1;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import z32.a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e0 implements p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 AVATAR;
    public static final e0 CONTENT_LIST;
    public static final e0 CONTENT_LIST_CARD;

    @NotNull
    public static final d0 Companion;
    public static final e0 DOUBLE_PREVIEW;
    public static final e0 LIST;
    public static final e0 SINGLE_PREVIEW;
    public static final e0 TRIPLE_PREVIEW;

    @NotNull
    private final ze0.a repStyle;

    @NotNull
    private final a3 styleThrift;

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{CONTENT_LIST, CONTENT_LIST_CARD, TRIPLE_PREVIEW, DOUBLE_PREVIEW, SINGLE_PREVIEW, LIST, AVATAR};
    }

    static {
        ze0.a aVar = ze0.a.ContentList;
        a3 a3Var = a3.DEFAULT;
        CONTENT_LIST = new e0("CONTENT_LIST", 0, aVar, a3Var);
        CONTENT_LIST_CARD = new e0("CONTENT_LIST_CARD", 1, ze0.a.ContentListCard, a3Var);
        TRIPLE_PREVIEW = new e0("TRIPLE_PREVIEW", 2, ze0.a.Wide, a3.TRIPLE_PREVIEW);
        DOUBLE_PREVIEW = new e0("DOUBLE_PREVIEW", 3, ze0.a.Default, a3.DOUBLE_PREVIEW);
        SINGLE_PREVIEW = new e0("SINGLE_PREVIEW", 4, ze0.a.Compact, a3.SINGLE_PREVIEW);
        LIST = new e0("LIST", 5, ze0.a.List, a3.LIST);
        AVATAR = new e0("AVATAR", 6, ze0.a.NoPreview, a3.AVATAR);
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d0();
    }

    private e0(String str, int i13, ze0.a aVar, a3 a3Var) {
        this.repStyle = aVar;
        this.styleThrift = a3Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    @NotNull
    public final ze0.a getRepStyle() {
        return this.repStyle;
    }

    @NotNull
    public final a3 getStyleThrift() {
        return this.styleThrift;
    }
}
