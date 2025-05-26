package s02;

import com.pinterest.api.model.mj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import o82.l0;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m f110327j = new m(0);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i13) {
        super(1);
        this.f110328i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110328i) {
            case 0:
                p02.b response = (p02.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List list = response.f98403a;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k(String.valueOf(response.hashCode()), (mj) it.next()));
                }
                return new l0(arrayList, response.f98404b);
            default:
                i0 vmState = (i0) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new c0(new j(((k) vmState).f110323b), vmState, q0.f80391a);
        }
    }
}
