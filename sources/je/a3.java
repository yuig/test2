package je;

import com.google.android.gms.ads.AdSize;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f75558a;

    static {
        HashMap hashMap = new HashMap(13);
        f75558a = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        a.c.o(1, hashMap, "bolder", -1, "lighter");
        a.c.o(100, hashMap, "100", 200, "200");
        hashMap.put("300", Integer.valueOf(AdSize.MEDIUM_RECTANGLE_WIDTH));
        hashMap.put("400", 400);
        a.c.o(500, hashMap, "500", AdSize.WIDE_SKYSCRAPER_HEIGHT, "600");
        d7.g.v(hashMap, "700", 700, 800, "800");
        hashMap.put("900", 900);
    }
}
