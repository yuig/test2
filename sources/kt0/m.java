package kt0;

import android.view.View;
import ey.v4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f80837a;

    public m(v4 v4Var) {
        this.f80837a = v4Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v13, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        Intrinsics.checkNotNullParameter(v13, "v");
        v13.removeOnLayoutChangeListener(this);
        this.f80837a.invoke();
    }
}
