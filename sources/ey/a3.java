package ey;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a3 {

    /* renamed from: a */
    public static final String[] f60429a;

    /* renamed from: b */
    public static final String[] f60430b;

    /* renamed from: c */
    public static final String[] f60431c;

    /* renamed from: d */
    public static final String[] f60432d;

    static {
        s92.i iVar = s92.i.HOME_FEED_RENDER;
        String a13 = a(iVar);
        s92.i iVar2 = s92.i.HOME_FEED_LOAD_AND_RENDER;
        String a14 = a(iVar2);
        s92.i iVar3 = s92.i.SEARCH_FEED_RENDER;
        f60429a = new String[]{a13, a14, a(iVar3), a(s92.i.PINCH_TO_ZOOM_FEED_RENDER), a(s92.i.FLASHLIGHT_FEED_RENDER), a(s92.i.LENS_FEED_RENDER), a(s92.i.YOUR_SHOP_FEED_RENDER), a(s92.i.BOARD_PICKER), a(s92.i.ALL_PINS)};
        f60430b = new String[]{"prefetch_image"};
        f60431c = new String[]{"prefetch_image", "load_pin_cell_image"};
        f60432d = new String[]{a(iVar), a(iVar2), a(iVar3)};
    }

    public static String a(s92.i actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        String name = actionName.name();
        Locale locale = Locale.US;
        return a.a.j("pwt/", ep.b.l(locale, "US", name, locale, "toLowerCase(...)"));
    }
}
