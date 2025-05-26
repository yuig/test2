package eu;

import android.content.Context;
import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f60125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(0);
        this.f60124i = i13;
        this.f60125j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f60124i;
        e eVar = this.f60125j;
        switch (i13) {
            case 0:
                Context context = eVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                boolean z13 = eVar.f53234n0;
                Intrinsics.checkNotNullParameter(context, "context");
                a aVar = new a(context, null, 0, z13);
                aVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return aVar;
            default:
                int i14 = e.f60127f1;
                Context context2 = eVar.f8();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new AdsCollectionScrollingModule(context2, null);
        }
    }
}
