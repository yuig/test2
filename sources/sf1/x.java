package sf1;

import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final x f112789i = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String pageIndex = (String) obj;
        String str = (String) obj2;
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        HashMap hashMap = new HashMap();
        hashMap.put("story_pin_page_id", pageIndex);
        hashMap.put("story_pin_raw_index", pageIndex);
        if (str != null) {
            hashMap.put("story_pin_page_uuid", str);
        }
        return hashMap;
    }
}
