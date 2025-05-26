package nq;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String type;
    public static final b SWIPE = new b("SWIPE", 0, "swipe");
    public static final b CLICK = new b("CLICK", 1, SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK);
    public static final b DEEPLINK = new b("DEEPLINK", 2, "deeplink");
    public static final b FIRST_ORDER_AD_CLOSEUP = new b("FIRST_ORDER_AD_CLOSEUP", 3, "first_order_ad_closeup");

    private static final /* synthetic */ b[] $values() {
        return new b[]{SWIPE, CLICK, DEEPLINK, FIRST_ORDER_AD_CLOSEUP};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, String str2) {
        super(str, i13);
        this.type = str2;
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

    @NotNull
    public final String getType() {
        return this.type;
    }
}
