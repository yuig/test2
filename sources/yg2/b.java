package yg2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum b {
    SESSION("ux.session", "session"),
    LOG("sys.log", "log"),
    CRASH("sys.android.crash", "crash"),
    NATIVE_CRASH("sys.android.native_crash", "native"),
    REACT_NATIVE_CRASH("sys.android.react_native_crash", "react"),
    FLUTTER_EXCEPTION("sys.flutter_exception", "flutter"),
    AEI("sys.exit", "aei"),
    EXCEPTION("sys.exception", "exception"),
    NETWORK_CAPTURE("sys.network_capture", "network"),
    INTERNAL_ERROR("sys.internal", "internal"),
    ATTACHMENT("attachment", "attachment"),
    UNKNOWN("unknown", "unknown");


    @NotNull
    public static final a Companion = new a();

    @NotNull
    private static final Map<String, b> filenameMap;

    @NotNull
    private final String filenameComponent;

    @NotNull
    private final String value;

    static {
        b[] values = values();
        int a13 = y0.a(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (b bVar : values) {
            linkedHashMap.put(bVar.filenameComponent, bVar);
        }
        filenameMap = linkedHashMap;
    }

    b(String str, String str2) {
        this.value = str;
        this.filenameComponent = str2;
    }

    @NotNull
    public final String getFilenameComponent() {
        return this.filenameComponent;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
