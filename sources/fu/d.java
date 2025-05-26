package fu;

import android.content.Context;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import kh2.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62944i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f62945j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, int i13) {
        super(0);
        this.f62944i = i13;
        this.f62945j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f62944i;
        h hVar = this.f62945j;
        switch (i13) {
            case 0:
                Context context = hVar.getLayoutInflater().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                boolean z13 = hVar.f53234n0;
                Intrinsics.checkNotNullParameter(context, "context");
                AdsBrowserBottomSheet adsBrowserBottomSheet = new AdsBrowserBottomSheet(context, null, 0, z13);
                adsBrowserBottomSheet.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return adsBrowserBottomSheet;
            case 1:
                return new e(hVar);
            case 2:
                int i14 = h.L0;
                Context context2 = hVar.f8();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new AdsCoreScrollingModule(context2, null);
            default:
                int i15 = h.L0;
                return Boolean.valueOf(!m2.u1(hVar.f8()));
        }
    }
}
