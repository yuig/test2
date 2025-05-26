package tj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117859i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f117860j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f117859i = i13;
        this.f117860j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f117859i;
        d dVar = this.f117860j;
        switch (i13) {
            case 0:
                gb2.i it = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(dVar.j9(it));
            default:
                int i14 = d.U0;
                yq0.z zVar = (yq0.z) dVar.f139732f0;
                if (zVar != null) {
                    zVar.h();
                }
                return Unit.f80348a;
        }
    }
}
