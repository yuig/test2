package sa0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112186i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f112187j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(e eVar, int i13) {
        super(1);
        this.f112186i = i13;
        this.f112187j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f112186i;
        e eVar = this.f112187j;
        switch (i13) {
            case 0:
                a it = (a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, eVar.f112163a, null, 2);
            default:
                s it2 = (s) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return s.b(it2, null, eVar.f112163a.f120830c, 23);
        }
    }
}
