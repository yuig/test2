package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class ei2 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm.u f4866a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei2(nm.u uVar) {
        super(0);
        this.f4866a = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator it = ((pm.l) this.f4866a.f91366a.entrySet()).iterator();
        String str = "";
        List list = null;
        while (((pm.m) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((pm.k) it).next();
            Intrinsics.f(entry);
            String str2 = (String) entry.getKey();
            nm.s sVar = (nm.s) entry.getValue();
            if (Intrinsics.d(str2, "params")) {
                str = sVar.p();
                Intrinsics.checkNotNullExpressionValue(str, "getAsString(...)");
            } else if (Intrinsics.d(str2, "csrb_errors")) {
                String p13 = sVar.p();
                Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
                list = StringsKt__StringsKt.split$default(p13, new String[]{","}, false, 0, 6, null);
            }
        }
        return new gi2(str, list);
    }
}
