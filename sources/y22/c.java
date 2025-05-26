package y22;

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
    public static final c ADD_PINS = new c("ADD_PINS", 0);
    public static final c MOVE_PINS = new c("MOVE_PINS", 1);
    public static final c REORDER_PINS = new c("REORDER_PINS", 2);
    public static final c EDIT_PINS = new c("EDIT_PINS", 3);
    public static final c DELETE_PINS = new c("DELETE_PINS", 4);
    public static final c REACT_ON_PINS = new c("REACT_ON_PINS", 5);
    public static final c COMMENT_ON_PIN = new c("COMMENT_ON_PIN", 6);
    public static final c CREATE_SECTIONS = new c("CREATE_SECTIONS", 7);
    public static final c EDIT_SECTION_NAME = new c("EDIT_SECTION_NAME", 8);
    public static final c DELETE_SECTIONS = new c("DELETE_SECTIONS", 9);
    public static final c REORDER_SECTIONS = new c("REORDER_SECTIONS", 10);
    public static final c REMOVE_COLLABORATORS = new c("REMOVE_COLLABORATORS", 11);
    public static final c MERGE_SECTIONS = new c("MERGE_SECTIONS", 12);
    public static final c DELETE_NOTE = new c("DELETE_NOTE", 13);
    public static final c EDIT_PIN_NOTES = new c("EDIT_PIN_NOTES", 14);

    private static final /* synthetic */ c[] $values() {
        return new c[]{ADD_PINS, MOVE_PINS, REORDER_PINS, EDIT_PINS, DELETE_PINS, REACT_ON_PINS, COMMENT_ON_PIN, CREATE_SECTIONS, EDIT_SECTION_NAME, DELETE_SECTIONS, REORDER_SECTIONS, REMOVE_COLLABORATORS, MERGE_SECTIONS, DELETE_NOTE, EDIT_PIN_NOTES};
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
            case 1:
                return ADD_PINS;
            case 2:
                return MOVE_PINS;
            case 3:
                return REORDER_PINS;
            case 4:
                return EDIT_PINS;
            case 5:
                return DELETE_PINS;
            case 6:
                return REACT_ON_PINS;
            case 7:
                return COMMENT_ON_PIN;
            case 8:
                return CREATE_SECTIONS;
            case 9:
                return EDIT_SECTION_NAME;
            case 10:
                return DELETE_SECTIONS;
            case 11:
                return REORDER_SECTIONS;
            case 12:
                return REMOVE_COLLABORATORS;
            case 13:
                return MERGE_SECTIONS;
            case 14:
                return DELETE_NOTE;
            case 15:
                return EDIT_PIN_NOTES;
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
        switch (b.f136686a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
