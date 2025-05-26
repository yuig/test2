package v72;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124406i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f124407j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, int i13) {
        super(1);
        this.f124406i = i13;
        this.f124407j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f124406i;
        g gVar = this.f124407j;
        switch (i13) {
            case 0:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new ge.d(a.a.D(gVar.getClass().getName(), "-", it.getId()));
            case 1:
                Throwable throwable = (Throwable) obj;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                n72.m mVar = gVar.f124421h;
                if (mVar == null) {
                    Intrinsics.r("shuffleCoreLogger");
                    throw null;
                }
                mVar.d(throwable, f.f124414k);
                gVar.f124431r.setVisibility(0);
                return Unit.f80348a;
            default:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gVar.setContentDescription(it2);
                return Unit.f80348a;
        }
    }
}
