package nr1;

import android.app.Activity;
import ao2.j0;
import com.pinterest.identity.core.error.UnauthException;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u5.f;
import u5.l;

/* loaded from: classes4.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f91890r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f91891s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f91892t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f91893u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ uj2.c f91894v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, Activity activity, a aVar, uj2.c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f91891s = lVar;
        this.f91892t = activity;
        this.f91893u = aVar;
        this.f91894v = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f91891s, this.f91892t, this.f91893u, this.f91894v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f91890r;
        uj2.c cVar = this.f91894v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                l lVar = this.f91891s;
                Activity activity = this.f91892t;
                a aVar2 = this.f91893u;
                f fVar = new f(aVar2.f91886b, aVar2.f91887c);
                this.f91890r = 1;
                if (lVar.a(activity, fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            ((fk2.f) cVar).b();
        } catch (Exception e13) {
            ((fk2.f) cVar).a(new UnauthException.GoogleCredentialKeychain.SavePasswordError(e13));
        }
        return Unit.f80348a;
    }
}
