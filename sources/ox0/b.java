package ox0;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import zu1.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int titleId;
    public static final b FollowPinAction = new b("FollowPinAction", 0, e.turn_on_updates_from_pin);
    public static final b UnfollowPinAction = new b("UnfollowPinAction", 1, e.turn_off_updates_from_pin);
    public static final b FollowUserAction = new b("FollowUserAction", 2, e.turn_on_updates_from_users);
    public static final b UnfollowUserAction = new b("UnfollowUserAction", 3, e.turn_off_updates_from_users);
    public static final b SeeLessAboutInterest1 = new b("SeeLessAboutInterest1", 4, e.see_less_about_interest);
    public static final b SeeLessAboutInterest2 = new b("SeeLessAboutInterest2", 5, e.see_less_about_interest);
    public static final b ViewNotificationSettings = new b("ViewNotificationSettings", 6, e.view_notification_settings);
    public static final b DeleteNewsHubItem = new b("DeleteNewsHubItem", 7, e.delete_news_hub_item_option_text);

    private static final /* synthetic */ b[] $values() {
        return new b[]{FollowPinAction, UnfollowPinAction, FollowUserAction, UnfollowUserAction, SeeLessAboutInterest1, SeeLessAboutInterest2, ViewNotificationSettings, DeleteNewsHubItem};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.titleId = i14;
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

    public final int getTitleId() {
        return this.titleId;
    }
}
