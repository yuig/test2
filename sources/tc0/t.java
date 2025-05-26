package tc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f117323i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ uc0.p0 f117324j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, uc0.p0 p0Var) {
        super(1);
        this.f117323i = str;
        this.f117324j = p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        GestaltButton.LargeSecondaryButton largeSecondaryButton = new GestaltButton.LargeSecondaryButton(6, it, (AttributeSet) null);
        largeSecondaryButton.d(new s(this.f117323i)).e(new yb0.b(this.f117324j, 2));
        return largeSecondaryButton;
    }
}
