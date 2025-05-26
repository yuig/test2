package ha2;

import android.content.Context;
import com.pinterest.ui.components.actionsheets.ActionSheetLabelView;
import com.pinterest.ui.components.actionsheets.ActionSheetOptionView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68466i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f68467j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i13) {
        super(0);
        this.f68466i = i13;
        this.f68467j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f68466i;
        r rVar = this.f68467j;
        switch (i13) {
            case 0:
                Context context = rVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new ActionSheetLabelView(context);
            default:
                Context context2 = rVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new ActionSheetOptionView(context2);
        }
    }
}
