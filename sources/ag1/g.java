package ag1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    private final String type;
    public static final g MEDIA_ITEMS_CLEANUP = new g("MEDIA_ITEMS_CLEANUP", 0, "media_item_cleanup");
    public static final g CAMERA_TAKE_PHOTO_START = new g("CAMERA_TAKE_PHOTO_START", 1, "camera_take_photo_start");
    public static final g CAMERA_TAKE_PHOTO_SUCCESS = new g("CAMERA_TAKE_PHOTO_SUCCESS", 2, "camera_take_photo_success");
    public static final g CAMERA_TAKE_PHOTO_FAIL = new g("CAMERA_TAKE_PHOTO_FAIL", 3, "camera_take_photo_fail");
    public static final g CAMERA_TAKE_PHOTO_CANCEL = new g("CAMERA_TAKE_PHOTO_CANCEL", 4, "camera_take_photo_cancel");
    public static final g IPC_DATA_INIT_EXP_RETRY_SUCCESS = new g("IPC_DATA_INIT_EXP_RETRY_SUCCESS", 5, "ipc_data_init_exp_retry_success");

    private static final /* synthetic */ g[] $values() {
        return new g[]{MEDIA_ITEMS_CLEANUP, CAMERA_TAKE_PHOTO_START, CAMERA_TAKE_PHOTO_SUCCESS, CAMERA_TAKE_PHOTO_FAIL, CAMERA_TAKE_PHOTO_CANCEL, IPC_DATA_INIT_EXP_RETRY_SUCCESS};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, String str2) {
        this.type = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
