package mv;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AD_DEEPLINK = new a("AD_DEEPLINK", 0);
    public static final a AD_APPINSTALL = new a("AD_APPINSTALL", 1);
    public static final a AD_ONTAP = new a("AD_ONTAP", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{AD_DEEPLINK, AD_APPINSTALL, AD_ONTAP};
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
