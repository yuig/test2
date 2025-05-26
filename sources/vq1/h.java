package vq1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final int tosAccessibilityRes;
    private final int tosLinkRes;
    private final int tosStringRes;
    public static final h PERSONAL = new h("PERSONAL", 0, yr1.c.unauth_landing_terms_of_service, yr1.c.url_terms_of_service, yr1.c.accessibility_signup_wall_terms);
    public static final h BUSINESS = new h("BUSINESS", 1, yr1.c.unauth_landing_business_terms_of_service, yr1.c.url_business_terms_of_service, yr1.c.accessibility_signup_wall_business_terms);

    private static final /* synthetic */ h[] $values() {
        return new h[]{PERSONAL, BUSINESS};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, int i14, int i15, int i16) {
        this.tosStringRes = i14;
        this.tosLinkRes = i15;
        this.tosAccessibilityRes = i16;
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

    public final int getTosAccessibilityRes() {
        return this.tosAccessibilityRes;
    }

    public final int getTosLinkRes() {
        return this.tosLinkRes;
    }

    public final int getTosStringRes() {
        return this.tosStringRes;
    }
}
