package p11;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f98639i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f98639i = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        c cVar = this.f98639i;
        Context requireContext = cVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(a.f98634j).e(new l11.p(cVar, 1));
    }
}
