package yx0;

import h32.u0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;

    @NotNull
    private final u0 elementType;

    @NotNull
    private final w12.a newsType;
    private final int titleId;
    public static final c All = new c("All", 0, zu1.e.notification_filters_selection_all, w12.a.None, u0.NOTIFICATION_FILTERS_OPTION_ALL);
    public static final c Comments = new c("Comments", 1, zu1.e.notification_filters_selection_comments, w12.a.Comments, u0.NOTIFICATION_FILTERS_OPTION_COMMENTS);
    public static final c Photos = new c("Photos", 2, zu1.e.notification_filters_selection_photos, w12.a.Tries, u0.NOTIFICATION_FILTERS_OPTION_PHOTOS);

    private static final /* synthetic */ c[] $values() {
        return new c[]{All, Comments, Photos};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
    }

    private c(String str, int i13, int i14, w12.a aVar, u0 u0Var) {
        this.titleId = i14;
        this.newsType = aVar;
        this.elementType = u0Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final u0 getElementType() {
        return this.elementType;
    }

    @NotNull
    public final w12.a getNewsType() {
        return this.newsType;
    }

    public final int getTitleId() {
        return this.titleId;
    }
}
