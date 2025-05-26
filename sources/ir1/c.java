package ir1;

import android.app.Activity;
import androidx.credentials.exceptions.NoCredentialException;
import ao2.j0;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u5.l;
import u5.y;
import u5.z;
import uj2.c0;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public c0 f73507r;

    /* renamed from: s, reason: collision with root package name */
    public int f73508s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f73509t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f73510u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f73511v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f73512w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c0 c0Var, l lVar, Activity activity, y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f73509t = c0Var;
        this.f73510u = lVar;
        this.f73511v = activity;
        this.f73512w = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f73509t, this.f73510u, this.f73511v, this.f73512w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f73508s;
        c0 c0Var2 = this.f73509t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                l lVar = this.f73510u;
                Activity activity = this.f73511v;
                y yVar = this.f73512w;
                this.f73507r = c0Var2;
                this.f73508s = 1;
                lVar.getClass();
                obj = l.b(activity, yVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                c0Var = c0Var2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = this.f73507r;
                ue.c.H(obj);
            }
            ((kk2.a) c0Var).b(((z) obj).a());
        } catch (Exception e13) {
            if (e13 instanceof NoCredentialException) {
                ((kk2.a) c0Var2).c(new UnauthException.ThirdParty.GoogleOneTap.NoCredentialFoundError(e13));
            } else {
                ((kk2.a) c0Var2).c(new UnauthException.ThirdParty.GoogleOneTap.UnresolvableCredentialError(e13));
            }
        }
        return Unit.f80348a;
    }
}
