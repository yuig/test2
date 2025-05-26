package r90;

import com.pinterest.api.model.f30;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p90.c1;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f106860j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f106861k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106862i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f106862i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f106862i) {
            case 0:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), l0.a()));
            default:
                o12.b response = (o12.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List list = response.f92783a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof f30) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new c1((f30) it.next()));
                }
                return new o82.l0(arrayList2, response.f92784b);
        }
    }
}
