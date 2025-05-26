package y32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c UNKNOWN = new c("UNKNOWN", 0);
    public static final c PROFILE = new c("PROFILE", 1);
    public static final c CONVERSATION_MESSAGE = new c("CONVERSATION_MESSAGE", 2);
    public static final c QUICK_REPLY = new c("QUICK_REPLY", 3);
    public static final c GIF_TRAY = new c("GIF_TRAY", 4);
    public static final c NEW_MESSAGE = new c("NEW_MESSAGE", 5);
    public static final c EMPTY_INBOX_SUGGESTION = new c("EMPTY_INBOX_SUGGESTION", 6);
    public static final c SEND_A_PIN = new c("SEND_A_PIN", 7);
    public static final c CREATOR_PROFILE = new c("CREATOR_PROFILE", 8);
    public static final c REACTION_ON_PIN = new c("REACTION_ON_PIN", 9);
    public static final c HEART_ICON = new c("HEART_ICON", 10);
    public static final c NOTIFICATION = new c("NOTIFICATION", 11);
    public static final c MESSAGE_FROM_PINTEREST = new c("MESSAGE_FROM_PINTEREST", 12);
    public static final c PINTEREST_AUTO_REPLY = new c("PINTEREST_AUTO_REPLY", 13);
    public static final c SEND_WAVE = new c("SEND_WAVE", 14);
    public static final c GROUP_BOARD = new c("GROUP_BOARD", 15);
    public static final c REPLY_TO_SENDER = new c("REPLY_TO_SENDER", 16);
    public static final c POST_FOLLOW_TOAST = new c("POST_FOLLOW_TOAST", 17);
    public static final c CONVERSATION_MEDIA_DRAWER_GIF_TAB = new c("CONVERSATION_MEDIA_DRAWER_GIF_TAB", 18);
    public static final c CONVERSATION_MEDIA_DRAWER_RELATED_TAB = new c("CONVERSATION_MEDIA_DRAWER_RELATED_TAB", 19);
    public static final c CONVERSATION_MEDIA_DRAWER_SAVED_TAB = new c("CONVERSATION_MEDIA_DRAWER_SAVED_TAB", 20);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNKNOWN, PROFILE, CONVERSATION_MESSAGE, QUICK_REPLY, GIF_TRAY, NEW_MESSAGE, EMPTY_INBOX_SUGGESTION, SEND_A_PIN, CREATOR_PROFILE, REACTION_ON_PIN, HEART_ICON, NOTIFICATION, MESSAGE_FROM_PINTEREST, PINTEREST_AUTO_REPLY, SEND_WAVE, GROUP_BOARD, REPLY_TO_SENDER, POST_FOLLOW_TOAST, CONVERSATION_MEDIA_DRAWER_GIF_TAB, CONVERSATION_MEDIA_DRAWER_RELATED_TAB, CONVERSATION_MEDIA_DRAWER_SAVED_TAB};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return UNKNOWN;
            case 1:
                return PROFILE;
            case 2:
                return CONVERSATION_MESSAGE;
            case 3:
                return QUICK_REPLY;
            case 4:
                return GIF_TRAY;
            case 5:
                return NEW_MESSAGE;
            case 6:
                return EMPTY_INBOX_SUGGESTION;
            case 7:
                return SEND_A_PIN;
            case 8:
                return CREATOR_PROFILE;
            case 9:
                return REACTION_ON_PIN;
            case 10:
                return HEART_ICON;
            case 11:
                return NOTIFICATION;
            case 12:
                return MESSAGE_FROM_PINTEREST;
            case 13:
                return PINTEREST_AUTO_REPLY;
            case 14:
                return SEND_WAVE;
            case 15:
                return GROUP_BOARD;
            case 16:
                return REPLY_TO_SENDER;
            case 17:
                return POST_FOLLOW_TOAST;
            case 18:
                return CONVERSATION_MEDIA_DRAWER_GIF_TAB;
            case 19:
                return CONVERSATION_MEDIA_DRAWER_RELATED_TAB;
            case 20:
                return CONVERSATION_MEDIA_DRAWER_SAVED_TAB;
            default:
                return null;
        }
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

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f136863a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
