package am1;

import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import u50.f0;
import u50.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d APPLE;
    public static final d EMAIL;
    public static final d FACEBOOK;
    public static final d GOOGLE;
    public static final d LINE;
    private final Integer serviceIcon;

    @NotNull
    private final i0 serviceName;

    private static final /* synthetic */ d[] $values() {
        return new d[]{GOOGLE, APPLE, FACEBOOK, EMAIL, LINE};
    }

    static {
        Intrinsics.checkNotNullParameter("Google", "string");
        GOOGLE = new d("GOOGLE", 0, new f0("Google"), Integer.valueOf(i.ic_google_logo));
        Intrinsics.checkNotNullParameter("Apple", "string");
        APPLE = new d("APPLE", 1, new f0("Apple"), Integer.valueOf(i.ic_apple_logo));
        Intrinsics.checkNotNullParameter("Facebook", "string");
        FACEBOOK = new d("FACEBOOK", 2, new f0("Facebook"), Integer.valueOf(i.ic_facebook_logo));
        Intrinsics.checkNotNullParameter("Email", "string");
        EMAIL = new d("EMAIL", 3, new f0("Email"), null);
        Intrinsics.checkNotNullParameter("LINE", "string");
        LINE = new d("LINE", 4, new f0("LINE"), Integer.valueOf(i.ic_line_logo));
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, i0 i0Var, Integer num) {
        this.serviceName = i0Var;
        this.serviceIcon = num;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final Integer getServiceIcon() {
        return this.serviceIcon;
    }

    @NotNull
    public final i0 getServiceName() {
        return this.serviceName;
    }
}
