package fe1;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import zd1.v;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62077i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f62078j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(1);
        this.f62077i = i13;
        this.f62078j = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62077i;
        m mVar = this.f62078j;
        switch (i13) {
            case 0:
                em1.c event = (em1.c) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                mVar.onCheckedChanged(null, c0.d.b2(event));
                return Unit.f80348a;
            default:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = mVar.getResources();
                int i14 = mz1.g.content_description_unselect_product_filter;
                Object[] objArr = new Object[1];
                v vVar = mVar.f62082c;
                if (vVar == null) {
                    Intrinsics.r("standardListFilter");
                    throw null;
                }
                objArr[0] = vVar.f141768c;
                String string = resources.getString(i14, objArr);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return em1.d.e(it, null, null, null, null, null, bs1.c.h2(string), 0, null, false, 0, 991);
        }
    }
}
