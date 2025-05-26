package ew;

import android.content.Context;
import ao2.j0;
import com.pinterest.api.model.f30;
import h32.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends dl2.j implements Function2 {
    public final /* synthetic */ f30 A;
    public final /* synthetic */ Function1 B;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f60302r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f60303s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0 f60304t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f60305u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f60306v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function2 f60307w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kl2.l f60308x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f60309y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function0 f60310z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, i0 i0Var, String str, String str2, Function2 function2, kl2.l lVar, Function0 function0, Function0 function02, f30 f30Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f60302r = jVar;
        this.f60303s = context;
        this.f60304t = i0Var;
        this.f60305u = str;
        this.f60306v = str2;
        this.f60307w = function2;
        this.f60308x = lVar;
        this.f60309y = function0;
        this.f60310z = function02;
        this.A = f30Var;
        this.B = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f60302r, this.f60303s, this.f60304t, this.f60305u, this.f60306v, this.f60307w, this.f60308x, this.f60309y, this.f60310z, this.A, this.B, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j jVar = this.f60302r;
        gw.f fVar = jVar.f60318d;
        e onAdLoaded = new e(this.A, jVar, this.B, 0);
        fVar.getClass();
        Context context = this.f60303s;
        Intrinsics.checkNotNullParameter(context, "context");
        i0 loggingContext = this.f60304t;
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        String adUnitId = this.f60305u;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(onAdLoaded, "onAdLoaded");
        Function2 onAdLoadCallback = this.f60307w;
        Intrinsics.checkNotNullParameter(onAdLoadCallback, "onAdLoadCallback");
        kl2.l onAdFailedToLoad = this.f60308x;
        Intrinsics.checkNotNullParameter(onAdFailedToLoad, "onAdFailedToLoad");
        Function0 onAdClicked = this.f60309y;
        Intrinsics.checkNotNullParameter(onAdClicked, "onAdClicked");
        Function0 onAdImpression = this.f60310z;
        Intrinsics.checkNotNullParameter(onAdImpression, "onAdImpression");
        return Unit.f80348a;
    }
}
