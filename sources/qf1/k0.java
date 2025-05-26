package qf1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m60.x0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 ALLOW_COMMENTS;
    public static final k0 COPY_LINK;
    public static final k0 DOWNLOAD_IMAGE;
    public static final k0 EDIT;
    public static final k0 FOLLOW_USER;
    public static final k0 HIDE;
    public static final k0 REACT;
    public static final k0 REMOVE_MENTION;
    public static final k0 REMOVE_PARTNERSHIP;
    public static final k0 REMOVE_PRODUCTS;
    public static final k0 REPORT;
    public static final k0 SAVE;
    public static final k0 SEND;
    public static final k0 SHARE = new k0("SHARE", 0, x0.share_pin, null, null, 6, null);
    public static final k0 UNFOLLOW_USER;
    public static final k0 VIEW_SIMILAR_IDEAS;
    public static final k0 VISIT;
    public static final k0 WHY_AM_I_SEEING_THIS_AD;
    private final int labelResId;
    private final vn1.c subtitleColorResId;
    private final Integer subtitleResId;

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{SHARE, COPY_LINK, REPORT, EDIT, SAVE, HIDE, VISIT, REMOVE_MENTION, REMOVE_PRODUCTS, SEND, WHY_AM_I_SEEING_THIS_AD, ALLOW_COMMENTS, FOLLOW_USER, UNFOLLOW_USER, DOWNLOAD_IMAGE, REMOVE_PARTNERSHIP, VIEW_SIMILAR_IDEAS, REACT};
    }

    static {
        Integer num = null;
        vn1.c cVar = null;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        COPY_LINK = new k0("COPY_LINK", 1, x0.copy_link, num, cVar, i13, defaultConstructorMarker);
        vn1.c cVar2 = null;
        int i14 = 6;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        REPORT = new k0("REPORT", 2, q82.a.report_pin, 0 == true ? 1 : 0, cVar2, i14, defaultConstructorMarker2);
        EDIT = new k0("EDIT", 3, x0.edit, num, cVar, i13, defaultConstructorMarker);
        SAVE = new k0("SAVE", 4, x0.save_pin, 0 == true ? 1 : 0, cVar2, i14, defaultConstructorMarker2);
        HIDE = new k0("HIDE", 5, x0.hide_pin_option, num, cVar, i13, defaultConstructorMarker);
        VISIT = new k0("VISIT", 6, x0.pin_overflow_visit_site, 0 == true ? 1 : 0, cVar2, i14, defaultConstructorMarker2);
        int i15 = x0.pin_overflow_remove_mention;
        Integer valueOf = Integer.valueOf(q82.a.idea_pin_remove_mention_subtitle);
        vn1.c cVar3 = vn1.c.SUBTLE;
        REMOVE_MENTION = new k0("REMOVE_MENTION", 7, i15, valueOf, cVar3);
        REMOVE_PRODUCTS = new k0("REMOVE_PRODUCTS", 8, q82.a.pin_overflow_remove_products, Integer.valueOf(q82.a.pin_overflow_remove_products_details_ideas), cVar3);
        SEND = new k0("SEND", 9, x0.send, null, null, 6, null);
        WHY_AM_I_SEEING_THIS_AD = new k0("WHY_AM_I_SEEING_THIS_AD", 10, x0.grid_actions_promoted_pin, null, null, 6, null);
        Integer num2 = null;
        vn1.c cVar4 = null;
        int i16 = 6;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        ALLOW_COMMENTS = new k0("ALLOW_COMMENTS", 11, x0.allow_comments, num2, cVar4, i16, defaultConstructorMarker3);
        Integer num3 = null;
        int i17 = 6;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        FOLLOW_USER = new k0("FOLLOW_USER", 12, x0.pin_overflow_follow_user, num3, 0 == true ? 1 : 0, i17, defaultConstructorMarker4);
        UNFOLLOW_USER = new k0("UNFOLLOW_USER", 13, x0.pin_overflow_unfollow_user, num2, cVar4, i16, defaultConstructorMarker3);
        DOWNLOAD_IMAGE = new k0("DOWNLOAD_IMAGE", 14, kw0.b.save_to_device, num3, 0 == true ? 1 : 0, i17, defaultConstructorMarker4);
        REMOVE_PARTNERSHIP = new k0("REMOVE_PARTNERSHIP", 15, q82.a.sponsored_pins_remove_partnership_menu_option, num2, cVar4, i16, defaultConstructorMarker3);
        VIEW_SIMILAR_IDEAS = new k0("VIEW_SIMILAR_IDEAS", 16, q82.a.view_similar_ideas, num3, 0 == true ? 1 : 0, i17, defaultConstructorMarker4);
        REACT = new k0("REACT", 17, x0.contextmenu_react, num2, cVar4, i16, defaultConstructorMarker3);
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ k0(String str, int i13, int i14, Integer num, vn1.c cVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : cVar);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final vn1.c getSubtitleColorResId() {
        return this.subtitleColorResId;
    }

    public final Integer getSubtitleResId() {
        return this.subtitleResId;
    }

    private k0(String str, int i13, int i14, Integer num, vn1.c cVar) {
        this.labelResId = i14;
        this.subtitleResId = num;
        this.subtitleColorResId = cVar;
    }
}
