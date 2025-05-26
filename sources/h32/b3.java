package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b3[] $VALUES;

    @NotNull
    public static final z2 Companion;
    public static final b3 BOARD_FOLLOW = new b3("BOARD_FOLLOW", 0);
    public static final b3 USER_FOLLOW = new b3("USER_FOLLOW", 1);
    public static final b3 TOPIC_FOLLOW = new b3("TOPIC_FOLLOW", 2);
    public static final b3 BOARD_COLLAB_INVITE = new b3("BOARD_COLLAB_INVITE", 3);
    public static final b3 VIRTUAL_TRY_ON_READY = new b3("VIRTUAL_TRY_ON_READY", 4);
    public static final b3 SEE_IDEA_PIN_DOWNLOAD = new b3("SEE_IDEA_PIN_DOWNLOAD", 5);
    public static final b3 UNREAD_GROUP_BOARD_INVITE_REMINDER = new b3("UNREAD_GROUP_BOARD_INVITE_REMINDER", 6);
    public static final b3 COLLAGE_DOWNLOAD_SUCCESS = new b3("COLLAGE_DOWNLOAD_SUCCESS", 7);

    private static final /* synthetic */ b3[] $values() {
        return new b3[]{BOARD_FOLLOW, USER_FOLLOW, TOPIC_FOLLOW, BOARD_COLLAB_INVITE, VIRTUAL_TRY_ON_READY, SEE_IDEA_PIN_DOWNLOAD, UNREAD_GROUP_BOARD_INVITE_REMINDER, COLLAGE_DOWNLOAD_SUCCESS};
    }

    static {
        b3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new z2();
    }

    private b3(String str, int i13) {
    }

    public static final b3 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 3) {
            return BOARD_FOLLOW;
        }
        if (i13 == 14) {
            return USER_FOLLOW;
        }
        if (i13 == 33) {
            return VIRTUAL_TRY_ON_READY;
        }
        if (i13 == 36) {
            return SEE_IDEA_PIN_DOWNLOAD;
        }
        if (i13 == 16) {
            return TOPIC_FOLLOW;
        }
        if (i13 == 17) {
            return BOARD_COLLAB_INVITE;
        }
        if (i13 == 43) {
            return UNREAD_GROUP_BOARD_INVITE_REMINDER;
        }
        if (i13 != 44) {
            return null;
        }
        return COLLAGE_DOWNLOAD_SUCCESS;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (a3.f66834a[ordinal()]) {
            case 1:
                return 3;
            case 2:
                return 14;
            case 3:
                return 16;
            case 4:
                return 17;
            case 5:
                return 33;
            case 6:
                return 36;
            case 7:
                return 43;
            case 8:
                return 44;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
