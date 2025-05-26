package a42;

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
    public static final f PARAGRAPH = new f("PARAGRAPH", 0);
    public static final f HEADING = new f("HEADING", 1);
    public static final f IMAGE = new f("IMAGE", 2);
    public static final f VIDEO = new f("VIDEO", 3);
    public static final f LINK = new f("LINK", 4);
    public static final f INGREDIENT = new f("INGREDIENT", 5);
    public static final f SUPPLY = new f("SUPPLY", 6);
    public static final f LIST = new f("LIST", 7);
    public static final f KEY_VALUE = new f("KEY_VALUE", 8);
    public static final f TEXT = new f("TEXT", 9);
    public static final f ALT_TEXT = new f("ALT_TEXT", 10);
    public static final f MUSIC = new f("MUSIC", 11);
    public static final f MENTION_STICKER = new f("MENTION_STICKER", 12);
    public static final f PRODUCT_STICKER = new f("PRODUCT_STICKER", 13);
    public static final f STATIC_STICKER = new f("STATIC_STICKER", 14);
    public static final f ANIMATED_STICKER = new f("ANIMATED_STICKER", 15);
    public static final f COMMENT_REPLY = new f("COMMENT_REPLY", 16);
    public static final f VIRTUAL_TRY_ON_MAKEUP_STICKER = new f("VIRTUAL_TRY_ON_MAKEUP_STICKER", 17);
    public static final f AD = new f("AD", 18);
    public static final f GENERIC_INTERACTIVE_STICKER = new f("GENERIC_INTERACTIVE_STICKER", 19);

    private static final /* synthetic */ f[] $values() {
        return new f[]{PARAGRAPH, HEADING, IMAGE, VIDEO, LINK, INGREDIENT, SUPPLY, LIST, KEY_VALUE, TEXT, ALT_TEXT, MUSIC, MENTION_STICKER, PRODUCT_STICKER, STATIC_STICKER, ANIMATED_STICKER, COMMENT_REPLY, VIRTUAL_TRY_ON_MAKEUP_STICKER, AD, GENERIC_INTERACTIVE_STICKER};
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
        switch (i13) {
            case 0:
                return PARAGRAPH;
            case 1:
                return HEADING;
            case 2:
                return IMAGE;
            case 3:
                return VIDEO;
            case 4:
                return LINK;
            case 5:
                return INGREDIENT;
            case 6:
                return SUPPLY;
            case 7:
                return LIST;
            case 8:
                return KEY_VALUE;
            case 9:
                return TEXT;
            case 10:
                return ALT_TEXT;
            case 11:
                return MUSIC;
            case 12:
                return MENTION_STICKER;
            case 13:
                return PRODUCT_STICKER;
            case 14:
                return STATIC_STICKER;
            case 15:
                return ANIMATED_STICKER;
            case 16:
                return COMMENT_REPLY;
            case 17:
                return VIRTUAL_TRY_ON_MAKEUP_STICKER;
            case 18:
                return AD;
            case 19:
                return GENERIC_INTERACTIVE_STICKER;
            default:
                return null;
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
        switch (e.f702a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
