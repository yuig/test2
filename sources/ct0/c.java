package ct0;

import com.pinterest.api.model.zs;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.l0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f53137j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f53138k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53139i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f53139i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53139i) {
            case 0:
                o12.b response = (o12.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List<dl1.s> list = response.f92783a;
                ArrayList arrayList = new ArrayList();
                for (dl1.s sVar : list) {
                    u uVar = sVar instanceof zs ? new u((zs) sVar) : null;
                    if (uVar != null) {
                        arrayList.add(uVar);
                    }
                }
                return new l0(arrayList, response.f92784b);
            default:
                u it = (u) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.f53168a;
        }
    }
}
