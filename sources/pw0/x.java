package pw0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x IdeaPinPageAdd = new x("IdeaPinPageAdd", 0);
    public static final x IdeaPinAddMediaClip = new x("IdeaPinAddMediaClip", 1);
    public static final x IdeaPinImageSticker = new x("IdeaPinImageSticker", 2);
    public static final x ProfileCover = new x("ProfileCover", 3);
    public static final x ProfilePhoto = new x("ProfilePhoto", 4);
    public static final x CommentAddPhoto = new x("CommentAddPhoto", 5);
    public static final x TriedItPhoto = new x("TriedItPhoto", 6);
    public static final x CollageCutoutAddPhoto = new x("CollageCutoutAddPhoto", 7);

    private static final /* synthetic */ x[] $values() {
        return new x[]{IdeaPinPageAdd, IdeaPinAddMediaClip, IdeaPinImageSticker, ProfileCover, ProfilePhoto, CommentAddPhoto, TriedItPhoto, CollageCutoutAddPhoto};
    }

    static {
        x[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
