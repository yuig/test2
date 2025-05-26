package cp1;

import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q5.a2;

/* loaded from: classes5.dex */
public final class n extends s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public static final n f53010i = new n(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        a2 windowInsets = (a2) obj2;
        yf0.g initialPadding = (yf0.g) obj3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
        f5.e f13 = windowInsets.f102400a.f(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL);
        Intrinsics.checkNotNullExpressionValue(f13, "getInsets(...)");
        view.setPaddingRelative(initialPadding.f138959a, f13.f61082b + initialPadding.f138960b, initialPadding.f138961c, initialPadding.f138962d);
        return Unit.f80348a;
    }
}
