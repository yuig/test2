package su1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final int code;
    public static final f SUCCESS = new f("SUCCESS", 0, 0);
    public static final f ERROR_DOWNLOAD_NOT_SUPPORTED = new f("ERROR_DOWNLOAD_NOT_SUPPORTED", 1, 1);
    public static final f ERROR_NO_INTERNET_1 = new f("ERROR_NO_INTERNET_1", 2, 2);
    public static final f ERROR_NO_INTERNET_2 = new f("ERROR_NO_INTERNET_2", 3, 3);
    public static final f ERROR_FAILED_TO_CREATE_DIR = new f("ERROR_FAILED_TO_CREATE_DIR", 4, 4);
    public static final f ERROR_DOWNLOAD_FAILED = new f("ERROR_DOWNLOAD_FAILED", 5, 5);
    public static final f ERROR_DOWNLOAD_EXCEPTION = new f("ERROR_DOWNLOAD_EXCEPTION", 6, 6);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SUCCESS, ERROR_DOWNLOAD_NOT_SUPPORTED, ERROR_NO_INTERNET_1, ERROR_NO_INTERNET_2, ERROR_FAILED_TO_CREATE_DIR, ERROR_DOWNLOAD_FAILED, ERROR_DOWNLOAD_EXCEPTION};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14) {
        this.code = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
