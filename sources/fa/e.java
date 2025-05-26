package fa;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.media3.ui.a0;
import ao2.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.j;

/* loaded from: classes3.dex */
public abstract class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f61473a;

    public e(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f61473a = mMeasurementManager;
    }

    public static Object h(e eVar, a aVar, bl2.c<? super Unit> cVar) {
        new o(1, cl2.h.b(cVar)).v();
        MeasurementManager measurementManager = eVar.f61473a;
        a0.A();
        throw null;
    }

    public static Object i(e eVar, bl2.c<? super Integer> frame) {
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        eVar.f61473a.getMeasurementApiStatus(new j(4), new j5.e(oVar));
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public static Object j(e eVar, Uri uri, InputEvent inputEvent, bl2.c<? super Unit> frame) {
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        eVar.f61473a.registerSource(uri, inputEvent, new j(7), new j5.e(oVar));
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    public static Object k(e eVar, f fVar, bl2.c<? super Unit> cVar) {
        Object O = dl2.b.O(new d(eVar, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    public static Object l(e eVar, Uri uri, bl2.c<? super Unit> frame) {
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        eVar.f61473a.registerTrigger(uri, new j(3), new j5.e(oVar));
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    public static Object m(e eVar, g gVar, bl2.c<? super Unit> cVar) {
        new o(1, cl2.h.b(cVar)).v();
        MeasurementManager measurementManager = eVar.f61473a;
        a0.C();
        throw null;
    }

    public static Object n(e eVar, h hVar, bl2.c<? super Unit> cVar) {
        new o(1, cl2.h.b(cVar)).v();
        MeasurementManager measurementManager = eVar.f61473a;
        a0.B();
        throw null;
    }

    @Override // fa.b
    public Object a(@NotNull a aVar, @NotNull bl2.c<? super Unit> cVar) {
        return h(this, aVar, cVar);
    }

    @Override // fa.b
    public Object b(@NotNull bl2.c<? super Integer> cVar) {
        return i(this, cVar);
    }

    @Override // fa.b
    public Object c(@NotNull Uri uri, InputEvent inputEvent, @NotNull bl2.c<? super Unit> cVar) {
        return j(this, uri, inputEvent, cVar);
    }

    @Override // fa.b
    public Object d(@NotNull f fVar, @NotNull bl2.c<? super Unit> cVar) {
        return k(this, fVar, cVar);
    }

    @Override // fa.b
    public Object e(@NotNull Uri uri, @NotNull bl2.c<? super Unit> cVar) {
        return l(this, uri, cVar);
    }

    @Override // fa.b
    public Object f(@NotNull g gVar, @NotNull bl2.c<? super Unit> cVar) {
        return m(this, gVar, cVar);
    }

    @Override // fa.b
    public Object g(@NotNull h hVar, @NotNull bl2.c<? super Unit> cVar) {
        return n(this, hVar, cVar);
    }
}
