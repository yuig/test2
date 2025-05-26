package cl0;

import a62.e;
import d70.g;
import lb.l0;
import m60.x0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int titleResId;
    public static final a Edit = new a("Edit", 0, g.edit);
    public static final a Send = new a("Send", 1, x0.send);
    public static final a Share = new a("Share", 2, e.share_simple);
    public static final a Archive = new a("Archive", 3, g.archive_this_board);
    public static final a Unarchive = new a("Unarchive", 4, g.unarchive_confirm);
    public static final a Merge = new a("Merge", 5, g.merge_into);
    public static final a Follow = new a("Follow", 6, g.follow);
    public static final a Unfollow = new a("Unfollow", 7, g.unfollow);
    public static final a Report = new a("Report", 8, g.report);

    private static final /* synthetic */ a[] $values() {
        return new a[]{Edit, Send, Share, Archive, Unarchive, Merge, Follow, Unfollow, Report};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.titleResId = i14;
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

    public final int getTitleResId() {
        return this.titleResId;
    }
}
