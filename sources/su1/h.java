package su1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    private final String str;
    public static final h CLIENT_OKHTTP = new h("CLIENT_OKHTTP", 0, "OkHttp");
    public static final h CLIENT_CRONET = new h("CLIENT_CRONET", 1, "Cronet");
    public static final h CLIENT_ENVOY = new h("CLIENT_ENVOY", 2, "Envoy");

    private static final /* synthetic */ h[] $values() {
        return new h[]{CLIENT_OKHTTP, CLIENT_CRONET, CLIENT_ENVOY};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, String str2) {
        this.str = str2;
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

    @NotNull
    public final String getStr() {
        return this.str;
    }
}
