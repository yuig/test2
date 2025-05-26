package s81;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CAMERA_DENIED = new h("CAMERA_DENIED", 0);
    public static final h ACTIVE_CAMERA = new h("ACTIVE_CAMERA", 1);
    public static final h GALLERY_OR_HISTORY = new h("GALLERY_OR_HISTORY", 2);
    public static final h SEARCH_RESULTS = new h("SEARCH_RESULTS", 3);
    public static final h STELA_CROP = new h("STELA_CROP", 4);
    public static final h ROOM_REPAINT_STYLE_PICKER = new h("ROOM_REPAINT_STYLE_PICKER", 5);
    public static final h ROOM_REPAINT_LOADING = new h("ROOM_REPAINT_LOADING", 6);
    public static final h ROOM_REPAINT_RESULTS = new h("ROOM_REPAINT_RESULTS", 7);
    public static final h ROOM_REPAINT_FAILED = new h("ROOM_REPAINT_FAILED", 8);
    public static final h NONE = new h("NONE", 9);

    private static final /* synthetic */ h[] $values() {
        return new h[]{CAMERA_DENIED, ACTIVE_CAMERA, GALLERY_OR_HISTORY, SEARCH_RESULTS, STELA_CROP, ROOM_REPAINT_STYLE_PICKER, ROOM_REPAINT_LOADING, ROOM_REPAINT_RESULTS, ROOM_REPAINT_FAILED, NONE};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
