package ld0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82952i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fd0.c f82953j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(fd0.c cVar, int i13) {
        super(1);
        this.f82952i = i13;
        this.f82953j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f82952i;
        fd0.c cVar = this.f82953j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], cVar.f61839a), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                oa2.a aVar = cVar.f61840b;
                return q.e(it2, aVar.f93844a, aVar.f93845b, false, null, null, false, false, null, 0, new rl1.d(aVar.f93848e), null, 1532);
        }
    }
}
