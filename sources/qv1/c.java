package qv1;

import android.content.Context;
import android.util.AttributeSet;
import c71.b0;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.view.descriptors.VisualSearchPill;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yv1.j;
import yv1.l;
import yv1.m;

/* loaded from: classes4.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105247i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ OneBarContainer f105248j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(OneBarContainer oneBarContainer, int i13) {
        super(0);
        this.f105247i = i13;
        this.f105248j = oneBarContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f105247i;
        OneBarContainer oneBarContainer = this.f105248j;
        switch (i13) {
            case 0:
                return (b0) oneBarContainer.f49985i.invoke();
            case 1:
                Context context = oneBarContainer.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (dl2.b.T1(context)) {
                    Context context2 = oneBarContainer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    return new yv1.d(context2);
                }
                Context context3 = oneBarContainer.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new j(context3);
            default:
                Context context4 = oneBarContainer.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                Intrinsics.checkNotNullParameter(context4, "context");
                l lVar = new l(context4);
                if (!lVar.f140244b) {
                    lVar.f140244b = true;
                    ((m) lVar.generatedComponent()).getClass();
                }
                VisualSearchPill visualSearchPill = new VisualSearchPill(6, context4, (AttributeSet) null);
                gh1.e eventHandler = new gh1.e(lVar, 20);
                Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                lVar.f140245c = visualSearchPill;
                lVar.addView(visualSearchPill);
                return lVar;
        }
    }
}
