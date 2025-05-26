package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    public static final h0 Companion;
    public static final j0 SPARKLE = new j0("SPARKLE", 0);
    public static final j0 PINTEREST = new j0("PINTEREST", 1);
    public static final j0 SEARCH = new j0("SEARCH", 2);
    public static final j0 FLASHLIGHT = new j0("FLASHLIGHT", 3);
    public static final j0 ADD = new j0("ADD", 4);
    public static final j0 SPEECH_ELLIPSIS = new j0("SPEECH_ELLIPSIS", 5);
    public static final j0 ANGLED_PIN = new j0("ANGLED_PIN", 6);
    public static final j0 INSTAGRAM = new j0("INSTAGRAM", 7);
    public static final j0 CAMERA = new j0("CAMERA", 8);
    public static final j0 CAMERA_ROLL = new j0("CAMERA_ROLL", 9);
    public static final j0 BOARD = new j0("BOARD", 10);
    public static final j0 LAYOUT = new j0("LAYOUT", 11);
    public static final j0 HAND_POINTING = new j0("HAND_POINTING", 12);
    public static final j0 SHARE = new j0("SHARE", 13);
    public static final j0 DOWNLOAD = new j0("DOWNLOAD", 14);
    public static final j0 SHOPPING_BAG = new j0("SHOPPING_BAG", 15);
    public static final j0 CHECK = new j0("CHECK", 16);
    public static final j0 ALERT = new j0("ALERT", 17);
    public static final j0 BELL = new j0("BELL", 18);
    public static final j0 PERSON = new j0("PERSON", 19);
    public static final j0 FLAG = new j0("FLAG", 20);
    public static final j0 LIGHTBULB = new j0("LIGHTBULB", 21);
    public static final j0 HOME = new j0("HOME", 22);
    public static final j0 SPEECH_HEART = new j0("SPEECH_HEART", 23);
    public static final j0 SPEECH_OUTLINE = new j0("SPEECH_OUTLINE", 24);
    public static final j0 HEART_OUTLINE = new j0("HEART_OUTLINE", 25);
    public static final j0 SMILEY_OUTLINE = new j0("SMILEY_OUTLINE", 26);
    public static final j0 FACE_TRYON = new j0("FACE_TRYON", 27);
    public static final j0 STAR_OUTLINE = new j0("STAR_OUTLINE", 28);
    public static final j0 ADS_STATS = new j0("ADS_STATS", 29);
    public static final j0 FILTER = new j0("FILTER", 30);
    public static final j0 HEART = new j0("HEART", 31);
    public static final j0 GIFT = new j0("GIFT", 32);
    public static final j0 CRYSTAL_BALL = new j0("CRYSTAL_BALL", 33);
    public static final j0 SAVED = new j0("SAVED", 34);
    public static final j0 MAGNIFYING_GLASS_SPARKLE = new j0("MAGNIFYING_GLASS_SPARKLE", 35);
    public static final j0 PERFORMANCE_PLUS = new j0("PERFORMANCE_PLUS", 36);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{SPARKLE, PINTEREST, SEARCH, FLASHLIGHT, ADD, SPEECH_ELLIPSIS, ANGLED_PIN, INSTAGRAM, CAMERA, CAMERA_ROLL, BOARD, LAYOUT, HAND_POINTING, SHARE, DOWNLOAD, SHOPPING_BAG, CHECK, ALERT, BELL, PERSON, FLAG, LIGHTBULB, HOME, SPEECH_HEART, SPEECH_OUTLINE, HEART_OUTLINE, SMILEY_OUTLINE, FACE_TRYON, STAR_OUTLINE, ADS_STATS, FILTER, HEART, GIFT, CRYSTAL_BALL, SAVED, MAGNIFYING_GLASS_SPARKLE, PERFORMANCE_PLUS};
    }

    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new h0();
    }

    private j0(String str, int i13) {
    }

    public static final j0 findByValue(int i13) {
        Companion.getClass();
        return h0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (i0.f71482a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            case 31:
                return 31;
            case 32:
                return 32;
            case 33:
                return 33;
            case 34:
                return 34;
            case 35:
                return 35;
            case 36:
                return 36;
            case 37:
                return 37;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
