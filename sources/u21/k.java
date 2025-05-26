package u21;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f120096r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f120097s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f120098t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, a0 a0Var, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f120096r = oVar;
        this.f120097s = a0Var;
        this.f120098t = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f120096r, this.f120097s, this.f120098t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        uj2.b0 g13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o oVar = this.f120096r;
        Context context = oVar.f120104a;
        Bitmap bitmap = ((x) this.f120097s).f120128a;
        if (bitmap != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) applicationContext;
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            g13 = new kk2.k(new com.airbnb.lottie.j(application, oVar, bitmap, 5), 1).r(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(g13, "subscribeOn(...)");
        } else {
            g13 = uj2.b0.g(new Throwable("Couldn't save PinnableImage from contentContainer"));
            Intrinsics.checkNotNullExpressionValue(g13, "error(...)");
        }
        kotlin.jvm.internal.j.z(this.f120098t, null, null, new n(g13, oVar, null), 3);
        return Unit.f80348a;
    }
}
