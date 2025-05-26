package lt0;

import android.content.Context;
import android.widget.TextView;
import com.pinterest.feature.home.viewpager.tabs.HomeFeedTabView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84777i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeFeedTabView f84778j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f84779k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HomeFeedTabView homeFeedTabView, b bVar, int i13) {
        super(1);
        this.f84777i = i13;
        this.f84778j = homeFeedTabView;
        this.f84779k = bVar;
    }

    public final void b(i0 it) {
        int i13 = this.f84777i;
        HomeFeedTabView homeFeedTabView = this.f84778j;
        b bVar = this.f84779k;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                TextView textView = homeFeedTabView.f45886b;
                if (textView == null) {
                    Intrinsics.r("text");
                    throw null;
                }
                i0 i0Var = bVar.f84771b;
                Context context = homeFeedTabView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setText(i0Var.a(context));
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var2 = bVar.f84772c;
                Context context2 = homeFeedTabView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                homeFeedTabView.setContentDescription(i0Var2.a(context2));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84777i;
        HomeFeedTabView homeFeedTabView = this.f84778j;
        b bVar = this.f84779k;
        switch (i13) {
            case 0:
                b newState = (b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                int i14 = HomeFeedTabView.f45884h;
                homeFeedTabView.Z(bVar, newState);
                break;
            case 1:
                b((i0) obj);
                break;
            case 2:
                b((i0) obj);
                break;
            default:
                ((Number) obj).intValue();
                homeFeedTabView.setId(bVar.f84774e);
                break;
        }
        return Unit.f80348a;
    }
}
