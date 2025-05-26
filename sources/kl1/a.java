package kl1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HomeTabKey = new a("HomeTabKey", 0);
    public static final a TodayTabKey = new a("TodayTabKey", 1);
    public static final a NotificationsKey = new a("NotificationsKey", 2);
    public static final a UserProfileKey = new a("UserProfileKey", 3);
    public static final a BoardMoreIdeasTabKey = new a("BoardMoreIdeasTabKey", 4);
    public static final a LateAccessScreenKey = new a("LateAccessScreenKey", 5);
    public static final a WatchTabKey = new a("WatchTabKey", 6);
    public static final a PinterestPicksTabKey = new a("PinterestPicksTabKey", 7);

    private static final /* synthetic */ a[] $values() {
        return new a[]{HomeTabKey, TodayTabKey, NotificationsKey, UserProfileKey, BoardMoreIdeasTabKey, LateAccessScreenKey, WatchTabKey, PinterestPicksTabKey};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
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
}
