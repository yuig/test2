package xr;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import ao2.j0;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pb0.g;

/* loaded from: classes.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f135660r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f30 f135661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f135662t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, f30 f30Var, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f135660r = dVar;
        this.f135661s = f30Var;
        this.f135662t = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f135660r, this.f135661s, this.f135662t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        boolean z13 = this.f135662t;
        f30 f30Var = this.f135661s;
        d dVar = this.f135660r;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            MeasurementManager measurementManager = dVar.f135664a;
            Uri b13 = d.b(f30Var, z13);
            ((g) dVar.f135665b).getClass();
            MotionEvent obtain = MotionEvent.obtain(0L, System.currentTimeMillis(), 0, 0.0f, 0.0f, 0);
            if (!z13) {
                obtain = null;
            }
            measurementManager.registerSource(b13, obtain, d.f135663g, Build.VERSION.SDK_INT >= 31 ? new b(dVar, f30Var, z13) : null);
        } catch (IllegalStateException e13) {
            dVar.d("ARA_SERVICE_NOT_AVAILABLE", e13, f30Var);
        }
        return Unit.f80348a;
    }
}
