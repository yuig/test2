package so;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f114640a;

    public tb(m60.w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f114640a = eventManager;
    }

    public final void a(String title, Integer num, int i13, Function0 positiveAction, Function0 negativeAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positiveAction, "positiveAction");
        Intrinsics.checkNotNullParameter(negativeAction, "negativeAction");
        this.f114640a.d(new yb0.f(new u50.f0(title), new u50.k0(num.intValue()), new u50.k0(yr1.c.edit_age_confirmation_positive_button), new u50.k0(i13), new mp0.b(0, positiveAction, negativeAction), 32));
    }
}
