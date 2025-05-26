package rh1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x Body = new x("Body", 0);
    public static final x Text = new x("Text", 1);
    public static final x Overflow = new x("Overflow", 2);
    public static final x Like = new x("Like", 3);
    public static final x Unlike = new x("Unlike", 4);
    public static final x Helpful = new x("Helpful", 5);
    public static final x NotHelpful = new x("NotHelpful", 6);
    public static final x ViewLikes = new x("ViewLikes", 7);
    public static final x Reply = new x("Reply", 8);
    public static final x ViewReplies = new x("ViewReplies", 9);
    public static final x HideReplies = new x("HideReplies", 10);
    public static final x ViewPhotoDetail = new x("ViewPhotoDetail", 11);
    public static final x TextLongPress = new x("TextLongPress", 12);

    private static final /* synthetic */ x[] $values() {
        return new x[]{Body, Text, Overflow, Like, Unlike, Helpful, NotHelpful, ViewLikes, Reply, ViewReplies, HideReplies, ViewPhotoDetail, TextLongPress};
    }

    static {
        x[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private x(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
