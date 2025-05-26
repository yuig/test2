package fd1;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m BOARD_LINK;
    public static final m BOARD_VIDEO;
    public static final m COLLAGE_PRE_PUBLISHED_LINK;
    public static final m COLLAGE_PRE_PUBLISHED_VIDEO;
    public static final m COLLAGE_PUBLISHED_IMAGE;
    public static final m COLLAGE_PUBLISHED_VIDEO;
    public static final m EDITORIAL_PAGES;
    public static final m PIN_OR_SPIN;
    public static final m PROFILE_LINK;
    public static final m STATIC_PIN_LINK;
    public static final m STYLE_QUIZ;
    public static final m UPSELLS;
    public static final m VIDEO_PIN_LINK;
    public static final m VIDEO_PIN_VIDEO;

    @NotNull
    private final List<Object> shareDestinations;

    private static final /* synthetic */ m[] $values() {
        return new m[]{STATIC_PIN_LINK, VIDEO_PIN_LINK, VIDEO_PIN_VIDEO, COLLAGE_PRE_PUBLISHED_VIDEO, COLLAGE_PRE_PUBLISHED_LINK, COLLAGE_PUBLISHED_IMAGE, COLLAGE_PUBLISHED_VIDEO, PROFILE_LINK, BOARD_LINK, BOARD_VIDEO, EDITORIAL_PAGES, UPSELLS, PIN_OR_SPIN, STYLE_QUIZ};
    }

    static {
        p32.f fVar = p32.f.COPY_LINK;
        STATIC_PIN_LINK = new m("STATIC_PIN_LINK", 0, kotlin.collections.f0.j(fVar, "com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        VIDEO_PIN_LINK = new m("VIDEO_PIN_LINK", 1, kotlin.collections.f0.j(fVar, "com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        VIDEO_PIN_VIDEO = new m("VIDEO_PIN_VIDEO", 2, kotlin.collections.f0.j("com.instagram.android", "com.facebook.katana"));
        COLLAGE_PRE_PUBLISHED_VIDEO = new m("COLLAGE_PRE_PUBLISHED_VIDEO", 3, kotlin.collections.f0.j("com.whatsapp", "com.instagram.android", "com.facebook.katana", "com.samsung.android.messaging"));
        COLLAGE_PRE_PUBLISHED_LINK = new m("COLLAGE_PRE_PUBLISHED_LINK", 4, kotlin.collections.f0.j(fVar, "com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        COLLAGE_PUBLISHED_IMAGE = new m("COLLAGE_PUBLISHED_IMAGE", 5, kotlin.collections.f0.j("com.instagram.android", "com.facebook.katana"));
        COLLAGE_PUBLISHED_VIDEO = new m("COLLAGE_PUBLISHED_VIDEO", 6, kotlin.collections.f0.j("com.whatsapp", "com.instagram.android"));
        PROFILE_LINK = new m("PROFILE_LINK", 7, kotlin.collections.f0.j(fVar, "com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        BOARD_LINK = new m("BOARD_LINK", 8, kotlin.collections.f0.j(fVar, "com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        BOARD_VIDEO = new m("BOARD_VIDEO", 9, kotlin.collections.e0.b("com.instagram.android"));
        EDITORIAL_PAGES = new m("EDITORIAL_PAGES", 10, kotlin.collections.f0.j(fVar, "com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        UPSELLS = new m("UPSELLS", 11, kotlin.collections.f0.j("com.whatsapp", "com.instagram.android", "com.facebook.orca", "com.facebook.katana", "com.samsung.android.messaging", "com.google.android.gm", "com.viber.voip", "org.telegram.messenger", "jp.naver.line.android"));
        PIN_OR_SPIN = new m("PIN_OR_SPIN", 12, kotlin.collections.e0.b("com.instagram.android"));
        STYLE_QUIZ = new m("STYLE_QUIZ", 13, kotlin.collections.f0.j("com.whatsapp", "com.samsung.android.messaging"));
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private m(String str, int i13, List list) {
        super(str, i13);
        this.shareDestinations = list;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @NotNull
    public final List<Object> getShareDestinations() {
        return this.shareDestinations;
    }

    public final boolean shouldShowContactList() {
        switch (l.f61952a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
