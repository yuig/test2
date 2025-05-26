package c42;

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
    public static final f UNKNOWN = new f("UNKNOWN", 0);
    public static final f TODAY_TAB_CURATION = new f("TODAY_TAB_CURATION", 1);
    public static final f TODAY_TAB_RECS = new f("TODAY_TAB_RECS", 2);
    public static final f NOTIFICATION = new f("NOTIFICATION", 3);
    public static final f SHARE = new f("SHARE", 4);
    public static final f LINK = new f("LINK", 5);
    public static final f RELATED_ARTICLES = new f("RELATED_ARTICLES", 6);
    public static final f LONGFORM_ARTICLES = new f("LONGFORM_ARTICLES", 7);
    public static final f AUTH_PLP = new f("AUTH_PLP", 8);
    public static final f SEO_HUB_PAGE = new f("SEO_HUB_PAGE", 9);
    public static final f FEED_CARD = new f("FEED_CARD", 10);
    public static final f INTEREST_FEED = new f("INTEREST_FEED", 11);
    public static final f SEARCH_LANDING_PAGE = new f("SEARCH_LANDING_PAGE", 12);

    private static final /* synthetic */ f[] $values() {
        return new f[]{UNKNOWN, TODAY_TAB_CURATION, TODAY_TAB_RECS, NOTIFICATION, SHARE, LINK, RELATED_ARTICLES, LONGFORM_ARTICLES, AUTH_PLP, SEO_HUB_PAGE, FEED_CARD, INTEREST_FEED, SEARCH_LANDING_PAGE};
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
                return UNKNOWN;
            case 1:
                return TODAY_TAB_CURATION;
            case 2:
                return TODAY_TAB_RECS;
            case 3:
                return NOTIFICATION;
            case 4:
                return SHARE;
            case 5:
                return LINK;
            case 6:
                return RELATED_ARTICLES;
            case 7:
                return LONGFORM_ARTICLES;
            case 8:
                return AUTH_PLP;
            case 9:
                return SEO_HUB_PAGE;
            case 10:
                return FEED_CARD;
            case 11:
                return INTEREST_FEED;
            case 12:
                return SEARCH_LANDING_PAGE;
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
        switch (e.f25766a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
