package p32;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f NONE = new f("NONE", 0);
    public static final f EMAIL = new f("EMAIL", 1);
    public static final f REMINDER_EMAIL_1 = new f("REMINDER_EMAIL_1", 2);
    public static final f REMINDER_EMAIL_2 = new f("REMINDER_EMAIL_2", 3);
    public static final f EMAIL_APP = new f("EMAIL_APP", 4);
    public static final f SMS = new f("SMS", 5);
    public static final f FACEBOOK = new f("FACEBOOK", 6);
    public static final f FACEBOOK_MESSENGER = new f("FACEBOOK_MESSENGER", 7);
    public static final f FACEBOOK_LITE = new f("FACEBOOK_LITE", 8);
    public static final f FACEBOOK_MESSENGER_LITE = new f("FACEBOOK_MESSENGER_LITE", 9);
    public static final f FACEBOOK_STORIES = new f("FACEBOOK_STORIES", 10);
    public static final f LINE = new f("LINE", 11);
    public static final f TWITTER = new f("TWITTER", 12);
    public static final f WHATSAPP = new f("WHATSAPP", 13);
    public static final f WECHAT = new f("WECHAT", 14);
    public static final f KAKAO = new f("KAKAO", 15);
    public static final f PINCODE = new f("PINCODE", 16);
    public static final f TELEGRAM = new f("TELEGRAM", 17);
    public static final f SIGNAL = new f("SIGNAL", 18);
    public static final f VIBER = new f("VIBER", 19);
    public static final f SKYPE = new f("SKYPE", 20);
    public static final f CREATOR_OUTREACH = new f("CREATOR_OUTREACH", 21);
    public static final f SMB_REFERRAL_EMAIL = new f("SMB_REFERRAL_EMAIL", 22);
    public static final f IMESSAGE_EXTENSION = new f("IMESSAGE_EXTENSION", 23);
    public static final f INSTAGRAM = new f("INSTAGRAM", 24);
    public static final f INSTAGRAM_STORY = new f("INSTAGRAM_STORY", 25);
    public static final f REDDIT = new f("REDDIT", 26);
    public static final f SNAPCHAT = new f("SNAPCHAT", 27);
    public static final f TIKTOK = new f("TIKTOK", 28);
    public static final f OTHER = new f("OTHER", 29);
    public static final f COPY_LINK = new f("COPY_LINK", 30);
    public static final f INTERNAL_CONTACT = new f("INTERNAL_CONTACT", 31);
    public static final f TO_BE_DETERMINED = new f("TO_BE_DETERMINED", 32);

    private static final /* synthetic */ f[] $values() {
        return new f[]{NONE, EMAIL, REMINDER_EMAIL_1, REMINDER_EMAIL_2, EMAIL_APP, SMS, FACEBOOK, FACEBOOK_MESSENGER, FACEBOOK_LITE, FACEBOOK_MESSENGER_LITE, FACEBOOK_STORIES, LINE, TWITTER, WHATSAPP, WECHAT, KAKAO, PINCODE, TELEGRAM, SIGNAL, VIBER, SKYPE, CREATOR_OUTREACH, SMB_REFERRAL_EMAIL, IMESSAGE_EXTENSION, INSTAGRAM, INSTAGRAM_STORY, REDDIT, SNAPCHAT, TIKTOK, OTHER, COPY_LINK, INTERNAL_CONTACT, TO_BE_DETERMINED};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        if (i13 == 101) {
            return TO_BE_DETERMINED;
        }
        switch (i13) {
            case 0:
                return NONE;
            case 1:
                return EMAIL;
            case 2:
                return REMINDER_EMAIL_1;
            case 3:
                return EMAIL_APP;
            case 4:
                return SMS;
            case 5:
                return FACEBOOK;
            case 6:
                return FACEBOOK_MESSENGER;
            default:
                switch (i13) {
                    case 8:
                        return LINE;
                    case 9:
                        return TWITTER;
                    case 10:
                        return WHATSAPP;
                    case 11:
                        return OTHER;
                    case 12:
                        return COPY_LINK;
                    case 13:
                        return REMINDER_EMAIL_2;
                    case 14:
                        return WECHAT;
                    case 15:
                        return KAKAO;
                    case 16:
                        return PINCODE;
                    case 17:
                        return FACEBOOK_STORIES;
                    case 18:
                        return FACEBOOK_LITE;
                    case 19:
                        return FACEBOOK_MESSENGER_LITE;
                    case 20:
                        return TELEGRAM;
                    case 21:
                        return SIGNAL;
                    case 22:
                        return VIBER;
                    case 23:
                        return SKYPE;
                    case 24:
                        return CREATOR_OUTREACH;
                    case 25:
                        return SMB_REFERRAL_EMAIL;
                    case 26:
                        return IMESSAGE_EXTENSION;
                    case 27:
                        return INSTAGRAM;
                    case 28:
                        return INTERNAL_CONTACT;
                    case 29:
                        return REDDIT;
                    case 30:
                        return SNAPCHAT;
                    case 31:
                        return TIKTOK;
                    case 32:
                        return INSTAGRAM_STORY;
                    default:
                        return null;
                }
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (e.f98766a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 13;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 18;
            case 10:
                return 19;
            case 11:
                return 17;
            case 12:
                return 8;
            case 13:
                return 9;
            case 14:
                return 10;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            case 25:
                return 27;
            case 26:
                return 32;
            case 27:
                return 29;
            case 28:
                return 30;
            case 29:
                return 31;
            case 30:
                return 11;
            case 31:
                return 12;
            case 32:
                return 28;
            case 33:
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
