package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class nn0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sn0 f8874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn0 f8875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mn0 f8876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(sn0 sn0Var, mn0 mn0Var, mn0 mn0Var2, boolean z13, boolean z14, bl2.c cVar) {
        super(2, cVar);
        this.f8874a = sn0Var;
        this.f8875b = mn0Var;
        this.f8876c = mn0Var2;
        this.f8877d = z13;
        this.f8878e = z14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nn0(this.f8874a, this.f8875b, this.f8876c, this.f8877d, this.f8878e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nn0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        wi.c0 videoLifecycleCallbacks;
        wi.c0 videoLifecycleCallbacks2;
        wi.c0 videoLifecycleCallbacks3;
        wi.c0 videoLifecycleCallbacks4;
        wi.c0 videoLifecycleCallbacks5;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        sn0 sn0Var = this.f8874a;
        Object obj2 = sn0Var.f11173e;
        mn0 mn0Var = this.f8875b;
        mn0 mn0Var2 = this.f8876c;
        boolean z13 = this.f8877d;
        boolean z14 = this.f8878e;
        synchronized (obj2) {
            boolean z15 = mn0Var != mn0Var2;
            try {
                boolean z16 = sn0Var.f11178j;
                boolean z17 = !z16 && mn0Var2 == mn0.f8294c;
                boolean z18 = z15 && mn0Var2 == mn0.f8294c;
                boolean z19 = z15 && mn0Var2 == mn0.f8295d;
                boolean z23 = z15 && mn0Var2 == mn0.f8296e;
                boolean z24 = z13 != z14;
                sn0Var.f11178j = z16 || z17;
                if (z17 && (videoLifecycleCallbacks5 = sn0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks5.onVideoStart();
                }
                if (z18 && (videoLifecycleCallbacks4 = sn0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks4.onVideoPlay();
                }
                if (z19 && (videoLifecycleCallbacks3 = sn0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks3.onVideoPause();
                }
                if (z23 && (videoLifecycleCallbacks2 = sn0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks2.onVideoEnd();
                }
                if (z24 && (videoLifecycleCallbacks = sn0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks.onVideoMute(z14);
                }
                unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return unit;
    }
}
