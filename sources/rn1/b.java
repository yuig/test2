package rn1;

import android.text.TextUtils;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final TextUtils.TruncateAt ellipsize;
    public static final b NONE = new b("NONE", 0, null);
    public static final b START = new b("START", 1, TextUtils.TruncateAt.START);
    public static final b MIDDLE = new b("MIDDLE", 2, TextUtils.TruncateAt.MIDDLE);
    public static final b END = new b("END", 3, TextUtils.TruncateAt.END);
    public static final b MARQUEE = new b("MARQUEE", 4, TextUtils.TruncateAt.MARQUEE);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NONE, START, MIDDLE, END, MARQUEE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }
}
