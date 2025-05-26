package lu;

import android.content.Context;
import android.view.ViewTreeObserver;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f84880b;

    public /* synthetic */ e(f fVar, int i13) {
        this.f84879a = i13;
        this.f84880b = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f84879a;
        f fVar = this.f84880b;
        switch (i13) {
            case 0:
                fVar.f53208j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (fVar.f84884J) {
                    f.t0(fVar, fVar.f53208j.getMeasuredHeight());
                } else {
                    Context context = fVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (m2.u1(context)) {
                        fVar.C(0);
                    }
                }
                fVar.L(null, -2);
                fVar.H = Math.min(fVar.C.getHeight(), fVar.H);
                break;
            default:
                fVar.f53208j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                fVar.L(null, -2);
                v vVar = fVar.E;
                pk.a0.k1(vVar, Math.max(vVar.getHeight(), fVar.H));
                f.t0(fVar, Math.max(fVar.f53208j.getHeight(), fVar.G));
                break;
        }
    }
}
