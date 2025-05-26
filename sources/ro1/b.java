package ro1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b WEB = new b("WEB", 0);
    public static final b PROFILE = new b("PROFILE", 1);
    public static final b BOARD = new b("BOARD", 2);
    public static final b STORY = new b("STORY", 3);
    public static final b COLLECTION = new b("COLLECTION", 4);
    public static final b SHOPPING = new b("SHOPPING", 5);
    public static final b LEAD_GEN = new b("LEAD_GEN", 6);
    public static final b CARTING = new b("CARTING", 7);
    public static final b SHOWCASE = new b("SHOWCASE", 8);
    public static final b STANDARD_MDL_PLAYSTORE = new b("STANDARD_MDL_PLAYSTORE", 9);
    public static final b QUIZ = new b("QUIZ", 10);
    public static final b COLLAGE = new b("COLLAGE", 11);

    private static final /* synthetic */ b[] $values() {
        return new b[]{WEB, PROFILE, BOARD, STORY, COLLECTION, SHOPPING, LEAD_GEN, CARTING, SHOWCASE, STANDARD_MDL_PLAYSTORE, QUIZ, COLLAGE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
