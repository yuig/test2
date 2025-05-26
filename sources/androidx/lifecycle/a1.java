package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a1 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18582b = 0;

    /* renamed from: a, reason: collision with root package name */
    public r0 f18583a;

    public final void a(q qVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            bk.f.F(activity, qVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(q.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(q.ON_DESTROY);
        this.f18583a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(q.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        r0 r0Var = this.f18583a;
        if (r0Var != null) {
            r0Var.f18673a.a();
        }
        a(q.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        r0 r0Var = this.f18583a;
        if (r0Var != null) {
            s0 s0Var = r0Var.f18673a;
            int i13 = s0Var.f18676a + 1;
            s0Var.f18676a = i13;
            if (i13 == 1 && s0Var.f18679d) {
                s0Var.f18681f.e(q.ON_START);
                s0Var.f18679d = false;
            }
        }
        a(q.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(q.ON_STOP);
    }
}
