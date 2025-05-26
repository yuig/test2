package x81;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 CAMERA_DENIED = new i0("CAMERA_DENIED", 0);
    public static final i0 GALLERY_DENIED = new i0("GALLERY_DENIED", 1);
    public static final i0 FACE_NOT_DETECTED = new i0("FACE_NOT_DETECTED", 2);
    public static final i0 GALLERY = new i0("GALLERY", 3);
    public static final i0 TRY_ON = new i0("TRY_ON", 4);
    public static final i0 TRY_ON_CAPTURED_PHOTO = new i0("TRY_ON_CAPTURED_PHOTO", 5);
    public static final i0 NONE = new i0("NONE", 6);

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{CAMERA_DENIED, GALLERY_DENIED, FACE_NOT_DETECTED, GALLERY, TRY_ON, TRY_ON_CAPTURED_PHOTO, NONE};
    }

    static {
        i0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
