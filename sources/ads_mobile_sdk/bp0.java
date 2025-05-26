package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bp0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f3551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cp0 f3552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(ym0 ym0Var, cp0 cp0Var, bl2.c cVar) {
        super(2, cVar);
        this.f3551a = ym0Var;
        this.f3552b = cp0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bp0(this.f3551a, this.f3552b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bp0(this.f3551a, this.f3552b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout c13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f3551a.setVisibility(8);
        WindowManager windowManager = (WindowManager) this.f3552b.f3994b.f5615a.get();
        a.pf pfVar = (a.pf) ((xf1) this.f3552b.f3995c.get()).f13640b.get();
        Context context = (pfVar == null || (c13 = ((yh1) pfVar).c()) == null) ? null : c13.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        WindowManager windowManager2 = activity != null ? (WindowManager) activity.getSystemService(WindowManager.class) : null;
        if (this.f3551a.getWindowToken() != null) {
            if (windowManager != null) {
                windowManager.removeView(this.f3551a);
            }
            if (windowManager2 != null) {
                windowManager2.removeView(this.f3551a);
            }
        } else {
            Intrinsics.checkNotNullParameter("Failed to remove validator from WindowManager", "message");
            ft2.a(true, "Failed to remove validator from WindowManager", null);
        }
        return Unit.f80348a;
    }
}
