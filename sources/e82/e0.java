package e82;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    private final int value;
    public static final e0 INDEX_WHATSAPP = new e0("INDEX_WHATSAPP", 0, 0);
    public static final e0 INDEX_FB_MESSENGER = new e0("INDEX_FB_MESSENGER", 1, 1);
    public static final e0 INDEX_FACEBOOK = new e0("INDEX_FACEBOOK", 2, 2);
    public static final e0 INDEX_LINE = new e0("INDEX_LINE", 3, 3);
    public static final e0 INDEX_KAKAO = new e0("INDEX_KAKAO", 4, 4);
    public static final e0 INDEX_WECHAT = new e0("INDEX_WECHAT", 5, 5);
    public static final e0 INDEX_TWITTER = new e0("INDEX_TWITTER", 6, 6);
    public static final e0 INDEX_SMS = new e0("INDEX_SMS", 7, 7);
    public static final e0 INDEX_EMAIL = new e0("INDEX_EMAIL", 8, 8);
    public static final e0 INDEX_OTHER = new e0("INDEX_OTHER", 9, 9);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{INDEX_WHATSAPP, INDEX_FB_MESSENGER, INDEX_FACEBOOK, INDEX_LINE, INDEX_KAKAO, INDEX_WECHAT, INDEX_TWITTER, INDEX_SMS, INDEX_EMAIL, INDEX_OTHER};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e0(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
