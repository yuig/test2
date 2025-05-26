package aq;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d PIN_ID = new d("PIN_ID", 0);
    public static final d TITLE = new d("TITLE", 1);
    public static final d DESCRIPTION = new d("DESCRIPTION", 2);
    public static final d USER_MENTION_TAGS = new d("USER_MENTION_TAGS", 3);
    public static final d LINK = new d("LINK", 4);
    public static final d BOARD_ID = new d("BOARD_ID", 5);
    public static final d SECTION_ID = new d("SECTION_ID", 6);
    public static final d ALT_TEXT = new d("ALT_TEXT", 7);
    public static final d PUBLISH_TIME = new d("PUBLISH_TIME", 8);
    public static final d IS_SHOPPING_REC_ALLOWED = new d("IS_SHOPPING_REC_ALLOWED", 9);
    public static final d IS_COMMENTING_TOGGLE_ALLOWED = new d("IS_COMMENTING_TOGGLE_ALLOWED", 10);
    public static final d IS_COMMENTING_ALLOWED = new d("IS_COMMENTING_ALLOWED", 11);
    public static final d ADVANCE_SETTINGS = new d("ADVANCE_SETTINGS", 12);
    public static final d PAID_PARTNERSHIP = new d("PAID_PARTNERSHIP", 13);
    public static final d INTEREST_TAGGING = new d("INTEREST_TAGGING", 14);
    public static final d FREEFORM_TAGGING = new d("FREEFORM_TAGGING", 15);
    public static final d INTEREST_LABELS = new d("INTEREST_LABELS", 16);
    public static final d DETAILS = new d("DETAILS", 17);
    public static final d TEMPLATE_TYPE = new d("TEMPLATE_TYPE", 18);
    public static final d SPONSOR_ID = new d("SPONSOR_ID", 19);
    public static final d PRODUCT_TAGS = new d("PRODUCT_TAGS", 20);
    public static final d NONE = new d("NONE", 21);

    private static final /* synthetic */ d[] $values() {
        return new d[]{PIN_ID, TITLE, DESCRIPTION, USER_MENTION_TAGS, LINK, BOARD_ID, SECTION_ID, ALT_TEXT, PUBLISH_TIME, IS_SHOPPING_REC_ALLOWED, IS_COMMENTING_TOGGLE_ALLOWED, IS_COMMENTING_ALLOWED, ADVANCE_SETTINGS, PAID_PARTNERSHIP, INTEREST_TAGGING, FREEFORM_TAGGING, INTEREST_LABELS, DETAILS, TEMPLATE_TYPE, SPONSOR_ID, PRODUCT_TAGS, NONE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
