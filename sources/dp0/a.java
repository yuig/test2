package dp0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BACKGROUND_CLOSE = new a("BACKGROUND_CLOSE", 0);
    public static final a CAMERA_CALLBACK = new a("CAMERA_CALLBACK", 1);
    public static final a CAMERA_CREATE = new a("CAMERA_CREATE", 2);
    public static final a CAMERA_OPEN = new a("CAMERA_OPEN", 3);
    public static final a CAMERA_CLOSE = new a("CAMERA_CLOSE", 4);
    public static final a CAPTURE_PICTURE = new a("CAPTURE_PICTURE", 5);
    public static final a PREVIEW_CREATE = new a("PREVIEW_CREATE", 6);
    public static final a PREVIEW_CONFIGURE = new a("PREVIEW_CONFIGURE", 7);
    public static final a VIDEO_CONFIGURE = new a("VIDEO_CONFIGURE", 8);
    public static final a VIDEO_RECORDING = new a("VIDEO_RECORDING", 9);

    private static final /* synthetic */ a[] $values() {
        return new a[]{BACKGROUND_CLOSE, CAMERA_CALLBACK, CAMERA_CREATE, CAMERA_OPEN, CAMERA_CLOSE, CAPTURE_PICTURE, PREVIEW_CREATE, PREVIEW_CONFIGURE, VIDEO_CONFIGURE, VIDEO_RECORDING};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
