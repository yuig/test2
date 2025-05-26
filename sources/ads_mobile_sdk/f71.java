package ads_mobile_sdk;

import android.webkit.WebSettings;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f71 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym0 f5076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i71 f5079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(ym0 ym0Var, int i13, int i14, i71 i71Var, bl2.c cVar) {
        super(2, cVar);
        this.f5076a = ym0Var;
        this.f5077b = i13;
        this.f5078c = i14;
        this.f5079d = i71Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f71(this.f5076a, this.f5077b, this.f5078c, this.f5079d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f71) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f5076a.a(new l03(k03.f7033b, this.f5077b, this.f5078c, 8));
        WebSettings settings = this.f5076a.getSettings();
        oh0 oh0Var = this.f5079d.f6272a;
        Boolean bool = Boolean.FALSE;
        wg0 wg0Var = oh0.f9281e;
        settings.setUseWideViewPort(((Boolean) oh0Var.a("gads:use_wide_viewport:enabled", bool, wg0Var)).booleanValue());
        this.f5076a.getSettings().setLoadWithOverviewMode(((Boolean) this.f5079d.f6272a.a("gads:load_with_overview_mode:enabled", bool, wg0Var)).booleanValue());
        return Unit.f80348a;
    }
}
