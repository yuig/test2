package mr1;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f88085a;

    public b(Activity activity) {
        this.f88085a = activity;
    }

    @Override // mr1.c
    public final void H3(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        action.invoke(this.f88085a);
    }
}
