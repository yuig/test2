package ads_mobile_sdk;

import android.view.View;
import android.widget.FrameLayout;
import ao2.j0;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class jf0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kf0 f6776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference f6778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(kf0 kf0Var, View view, WeakReference weakReference, bl2.c cVar) {
        super(2, cVar);
        this.f6776b = kf0Var;
        this.f6777c = view;
        this.f6778d = weakReference;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new jf0(this.f6776b, this.f6777c, this.f6778d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jf0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout d2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6775a;
        if (i13 == 0) {
            ue.c.H(obj);
            ws1 ws1Var = this.f6776b.f7274r;
            View view = this.f6777c;
            this.f6775a = 1;
            if (ws1Var.a(view, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        a.pf pfVar = (a.pf) this.f6778d.get();
        if (pfVar != null && (d2 = ((yh1) pfVar).d()) != null) {
            ws1 ws1Var2 = this.f6776b.f7274r;
            xh0 xh0Var = xh0.OTHER;
            this.f6775a = 2;
            if (ws1Var2.a(d2, xh0Var, (String) null, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
