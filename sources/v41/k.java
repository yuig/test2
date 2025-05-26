package v41;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o82.l0;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f124132j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f124133k = new k(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124134i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f124134i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124134i) {
            case 0:
                b22.d response = (b22.d) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List list = response.f21289a;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new w41.i((f30) it.next()));
                }
                return new l0(arrayList, response.f21290b);
            default:
                w31.c filter = (w31.c) obj;
                Intrinsics.checkNotNullParameter(filter, "filter");
                return filter.b().name();
        }
    }
}
