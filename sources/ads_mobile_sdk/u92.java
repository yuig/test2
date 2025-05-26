package ads_mobile_sdk;

import android.net.Uri;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u92 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w92 f11897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f11898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f11899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo f11900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u92(w92 w92Var, Uri uri, r0 r0Var, vo voVar, bl2.c cVar) {
        super(2, cVar);
        this.f11897b = w92Var;
        this.f11898c = uri;
        this.f11899d = r0Var;
        this.f11900e = voVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u92(this.f11897b, this.f11898c, this.f11899d, this.f11900e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u92) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11896a;
        if (i13 == 0) {
            ue.c.H(obj);
            w92 w92Var = this.f11897b;
            Uri uri = this.f11898c;
            yn1 yn1Var = this.f11899d.f10390r0;
            Intrinsics.f(yn1Var);
            zn1 zn1Var = yn1Var.f14343a;
            zn2.a aVar2 = zn2.b.f142311b;
            long P2 = dl2.b.P2(0, zn2.d.MILLISECONDS);
            String str = this.f11900e.f12583h;
            this.f11896a = 1;
            if (w92Var.a(uri, zn1Var, 1, P2, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
