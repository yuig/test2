package ee0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import zd0.e;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58777i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f58778j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f58777i = i13;
        this.f58778j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58777i;
        b bVar = this.f58778j;
        switch (i13) {
            case 0:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                bVar.getClass();
                return new cw0.a(it.f141672a, it.f141673b, it.f141674c, it.f141675d, it.f141676e, it.f141677f);
            default:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                bVar.getClass();
                List<e> list = it2;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (e eVar : list) {
                    arrayList.add(new cw0.a(eVar.f141672a, eVar.f141673b, eVar.f141674c, eVar.f141675d, eVar.f141676e, eVar.f141677f));
                }
                return arrayList;
        }
    }
}
