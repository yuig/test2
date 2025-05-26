package p02;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a YOUR_ACCOUNT = new a("YOUR_ACCOUNT", 0, 0, h02.e.rvc_your_account);
    public static final a YOUR_REPORTS = new a("YOUR_REPORTS", 1, 1, h02.e.rvc_your_reports);
    private final int tabIndex;
    private final int title;

    private static final /* synthetic */ a[] $values() {
        return new a[]{YOUR_ACCOUNT, YOUR_REPORTS};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14, int i15) {
        this.tabIndex = i14;
        this.title = i15;
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

    public final int getTabIndex() {
        return this.tabIndex;
    }

    public final int getTitle() {
        return this.title;
    }
}
