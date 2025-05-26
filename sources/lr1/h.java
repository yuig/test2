package lr1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FacebookLoginMethod = new h("FacebookLoginMethod", 0);
    public static final h FacebookAutoLoginMethod = new h("FacebookAutoLoginMethod", 1);
    public static final h AutoLoginMethod = new h("AutoLoginMethod", 2);
    public static final h GoogleUnifiedAutologin = new h("GoogleUnifiedAutologin", 3);
    public static final h GoogleUnifiedAuthMethod = new h("GoogleUnifiedAuthMethod", 4);
    public static final h LineAuthenticationMethod = new h("LineAuthenticationMethod", 5);
    public static final h FacebookAuthenticationMethod = new h("FacebookAuthenticationMethod", 6);
    public static final h SSOAuthenticationMethod = new h("SSOAuthenticationMethod", 7);

    private static final /* synthetic */ h[] $values() {
        return new h[]{FacebookLoginMethod, FacebookAutoLoginMethod, AutoLoginMethod, GoogleUnifiedAutologin, GoogleUnifiedAuthMethod, LineAuthenticationMethod, FacebookAuthenticationMethod, SSOAuthenticationMethod};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13) {
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
}
