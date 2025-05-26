package x91;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f134331j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f134332k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f134333l = new l(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134334i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f134334i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134334i) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(c52.e.blocked_accounts_page_empty_state);
                bind.b(vn1.c.SUBTLE);
                bind.a(kotlin.collections.e0.b(vn1.b.CENTER));
                return Unit.f80348a;
            case 1:
                k22.i it = (k22.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List list = it.f78217a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new u((wy0) it2.next()));
                }
                return new o82.l0(arrayList, it.f78218b);
            default:
                a it3 = (a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return a.e(it3, null, null, false, null, 14);
        }
    }
}
