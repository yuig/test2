package od1;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final m f94137i = new m(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        nm.u uVar = new nm.u();
        uVar.u("is_product_only_feed", "true");
        HashMap hashMap = new HashMap();
        hashMap.put("commerce_data", uVar.toString());
        return hashMap;
    }
}
