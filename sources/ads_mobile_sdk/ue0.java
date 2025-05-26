package ads_mobile_sdk;

import android.view.View;
import android.widget.ImageView;
import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ue0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kf0 f12045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f12047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView.ScaleType f12048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f12049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(kf0 kf0Var, View view, Map map, ImageView.ScaleType scaleType, View view2, bl2.c cVar) {
        super(2, cVar);
        this.f12045b = kf0Var;
        this.f12046c = view;
        this.f12047d = map;
        this.f12048e = scaleType;
        this.f12049f = view2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ue0(this.f12045b, this.f12046c, this.f12047d, this.f12048e, this.f12049f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ue0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12044a;
        if (i13 == 0) {
            ue.c.H(obj);
            a.pf pfVar = (a.pf) this.f12045b.f13640b.get();
            if (pfVar != null) {
                kf0 kf0Var = this.f12045b;
                this.f12044a = 1;
                if (kf0.b(kf0Var, pfVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        kf0 kf0Var2 = this.f12045b;
        qh1 j13 = kh2.a1.j(kf0Var2.f7269m, kf0Var2.f7270n, kf0Var2.f7267k, this.f12046c, this.f12047d, this.f12048e);
        String a13 = kf0.a(this.f12045b, this.f12049f, this.f12047d);
        kf0 kf0Var3 = this.f12045b;
        this.f12045b.a(this.f12046c, j13, a13, kf0Var3.f7267k.a(a13, kf0Var3.f7282z, kf0Var3.f7281y), false);
        return Unit.f80348a;
    }
}
