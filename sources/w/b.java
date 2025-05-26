package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import c0.c0;
import c0.e0;
import c0.i0;
import c0.p1;
import c0.z;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ur0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import g8.a0;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import java.io.Writer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kh2.m0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m7.j1;
import o7.f0;
import org.json.JSONObject;
import x02.t1;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f126905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f126906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f126907e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f126903a = i13;
        this.f126904b = obj;
        this.f126905c = obj2;
        this.f126906d = obj3;
        this.f126907e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object m13;
        final int i13 = 0;
        String str = null;
        switch (this.f126903a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((e) this.f126904b).f126919b).onCaptureCompleted((CameraCaptureSession) this.f126905c, (CaptureRequest) this.f126906d, (TotalCaptureResult) this.f126907e);
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((e) this.f126904b).f126919b).onCaptureProgressed((CameraCaptureSession) this.f126905c, (CaptureRequest) this.f126906d, (CaptureResult) this.f126907e);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((e) this.f126904b).f126919b).onCaptureFailed((CameraCaptureSession) this.f126905c, (CaptureRequest) this.f126906d, (CaptureFailure) this.f126907e);
                return;
            case 3:
                i0 i0Var = (i0) this.f126904b;
                e0 e0Var = (e0) this.f126905c;
                Executor executor = (Executor) this.f126906d;
                fp0.b bVar = (fp0.b) this.f126907e;
                c0 c0Var = i0.f24252z;
                i0Var.G(e0Var, executor, bVar);
                return;
            case 4:
                l0.i iVar = (l0.i) this.f126904b;
                z zVar = (z) this.f126905c;
                Map map = (Map) this.f126906d;
                r4.i iVar2 = (r4.i) this.f126907e;
                iVar.getClass();
                try {
                    iVar.f81221a.e(zVar, map);
                    iVar2.b(null);
                    return;
                } catch (RuntimeException e13) {
                    iVar2.d(e13);
                    return;
                }
            case 5:
                m0.e eVar = (m0.e) this.f126904b;
                z zVar2 = (z) this.f126905c;
                Map map2 = (Map) this.f126906d;
                r4.i iVar3 = (r4.i) this.f126907e;
                eVar.getClass();
                try {
                    eVar.f85260a.e(zVar2, map2);
                    iVar3.b(null);
                    return;
                } catch (RuntimeException e14) {
                    iVar3.d(e14);
                    return;
                }
            case 6:
                b1.v vVar = (b1.v) this.f126904b;
                Surface surface = (Surface) this.f126905c;
                com.google.common.util.concurrent.c0 c0Var2 = (com.google.common.util.concurrent.c0) this.f126906d;
                p1 p1Var = (p1) this.f126907e;
                vVar.getClass();
                m0.p("TextureViewImpl", "Safe to release surface.");
                l0.d dVar = vVar.f20839l;
                if (dVar != null) {
                    dVar.b();
                    vVar.f20839l = null;
                }
                surface.release();
                if (vVar.f20834g == c0Var2) {
                    vVar.f20834g = null;
                }
                if (vVar.f20835h == p1Var) {
                    vVar.f20835h = null;
                    return;
                }
                return;
            case 7:
                j1 j1Var = (j1) this.f126904b;
                Pair pair = (Pair) this.f126905c;
                ((n7.c0) j1Var.f86222b.f86322h).e(((Integer) pair.first).intValue(), (g8.e0) pair.second, (g8.v) this.f126906d, (a0) this.f126907e);
                return;
            case 8:
                AudioTrack audioTrack = (AudioTrack) this.f126904b;
                final h1.b bVar2 = (h1.b) this.f126905c;
                Handler handler = (Handler) this.f126906d;
                final o7.m mVar = (o7.m) this.f126907e;
                Object obj = f0.f93049k0;
                final int i14 = 1;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (bVar2 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: o7.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i15 = 0;
                                int i16 = i13;
                                m mVar2 = mVar;
                                h1.b bVar3 = bVar2;
                                switch (i16) {
                                    case 0:
                                        qq2.c cVar = ((h0) bVar3.f66449b).F0;
                                        Handler handler2 = (Handler) cVar.f104883b;
                                        if (handler2 != null) {
                                            handler2.post(new l(cVar, mVar2, i15));
                                            break;
                                        }
                                        break;
                                    default:
                                        qq2.c cVar2 = ((h0) bVar3.f66449b).F0;
                                        Handler handler3 = (Handler) cVar2.f104883b;
                                        if (handler3 != null) {
                                            handler3.post(new l(cVar2, mVar2, i15));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (f0.f93049k0) {
                        try {
                            int i15 = f0.f93051m0 - 1;
                            f0.f93051m0 = i15;
                            if (i15 == 0) {
                                f0.f93050l0.shutdown();
                                f0.f93050l0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (bVar2 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: o7.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = 0;
                                int i16 = i14;
                                m mVar2 = mVar;
                                h1.b bVar3 = bVar2;
                                switch (i16) {
                                    case 0:
                                        qq2.c cVar = ((h0) bVar3.f66449b).F0;
                                        Handler handler2 = (Handler) cVar.f104883b;
                                        if (handler2 != null) {
                                            handler2.post(new l(cVar, mVar2, i152));
                                            break;
                                        }
                                        break;
                                    default:
                                        qq2.c cVar2 = ((h0) bVar3.f66449b).F0;
                                        Handler handler3 = (Handler) cVar2.f104883b;
                                        if (handler3 != null) {
                                            handler3.post(new l(cVar2, mVar2, i152));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (f0.f93049k0) {
                        try {
                            int i16 = f0.f93051m0 - 1;
                            f0.f93051m0 = i16;
                            if (i16 == 0) {
                                f0.f93050l0.shutdown();
                                f0.f93050l0 = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            case 9:
                JSONObject viewData = (JSONObject) this.f126904b;
                String buttonText = (String) this.f126905c;
                ye.f this$0 = (ye.f) this.f126906d;
                String pathID = (String) this.f126907e;
                HashSet hashSet = ye.f.f138834e;
                if (p001if.a.b(ye.f.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(viewData, "$viewData");
                    Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(pathID, "$pathID");
                    try {
                        String e03 = df.j1.e0(le.v.a());
                        if (e03 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = e03.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        float[] a13 = ye.a.a(lowerCase, viewData);
                        String c13 = ye.a.c(buttonText, this$0.f138838d, lowerCase);
                        if (a13 == null) {
                            return;
                        }
                        ve.g gVar = ve.g.f125671a;
                        String[] g13 = ve.g.g(ve.d.MTML_APP_EVENT_PREDICTION, new float[][]{a13}, new String[]{c13});
                        if (g13 == null) {
                            return;
                        }
                        String str2 = g13[0];
                        ye.b.a(pathID, str2);
                        if (Intrinsics.d(str2, "other")) {
                            return;
                        }
                        HashSet hashSet2 = ye.f.f138834e;
                        me.f.p(str2, buttonText, a13);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th4) {
                    p001if.a.a(ye.f.class, th4);
                    return;
                }
            case 10:
                cg.k kVar = (cg.k) this.f126904b;
                Writer writer = (Writer) this.f126905c;
                Callable callable = (Callable) this.f126906d;
                gg.c cVar = (gg.c) this.f126907e;
                kVar.getClass();
                try {
                    Object call = callable.call();
                    if (call != null) {
                        kVar.f27669c.getClass();
                        str = call.toString();
                    }
                    kVar.p(writer, str);
                    synchronized (cVar) {
                        cVar.f64891c.append((CharSequence) cVar.f64890b);
                        cVar.f64889a.countDown();
                    }
                    return;
                } catch (Throwable th5) {
                    cVar.f64892d = th5;
                    cVar.f64889a.countDown();
                    return;
                }
            case 11:
                pg.a aVar = (pg.a) this.f126904b;
                lg.b bVar3 = (lg.b) this.f126905c;
                a.e eVar2 = (a.e) this.f126906d;
                lg.a aVar2 = (lg.a) this.f126907e;
                Logger logger = pg.a.f100035f;
                aVar.getClass();
                Logger logger2 = pg.a.f100035f;
                try {
                    mg.g a14 = aVar.f100038c.a(bVar3.f83178a);
                    if (a14 == null) {
                        String str3 = "Transport backend '" + bVar3.f83178a + "' is not registered";
                        logger2.warning(str3);
                        new IllegalArgumentException(str3);
                        eVar2.getClass();
                    } else {
                        ((rg.g) aVar.f100040e).f(new l0.d(aVar, bVar3, ((jg.b) a14).a(aVar2), 11));
                        eVar2.getClass();
                    }
                    return;
                } catch (Exception e15) {
                    logger2.warning("Error scheduling event " + e15.getMessage());
                    eVar2.getClass();
                    return;
                }
            case 12:
                dr.k kVar2 = (dr.k) this.f126904b;
                String str4 = (String) this.f126905c;
                List list = (List) this.f126906d;
                Boolean bool = (Boolean) this.f126907e;
                if (str4.equals(kVar2.f56201p)) {
                    kVar2.f56200o = list;
                }
                kVar2.notifyDataSetChanged();
                if (bool != null) {
                    kVar2.C.d(new dr.h(pk.a0.x0(str4), bool.booleanValue()));
                    return;
                }
                return;
            case 13:
                cz.e this$02 = (cz.e) this.f126904b;
                ur0 surveyData = (ur0) this.f126905c;
                String str5 = (String) this.f126906d;
                String str6 = (String) this.f126907e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(surveyData, "$surveyData");
                ScreenLocation screenLocation = (ScreenLocation) com.pinterest.screens.h.f50869j.getValue();
                this$02.getClass();
                if (screenLocation != null) {
                    NavigationImpl w13 = Navigation.w1(screenLocation);
                    this$02.c(surveyData, str5, str6);
                    this$02.f53454b.d(w13);
                    return;
                }
                return;
            case 14:
                uq0.h this$03 = (uq0.h) this.f126904b;
                t1 params = (t1) this.f126905c;
                t1 modelKey = (t1) this.f126906d;
                Feed model = (Feed) this.f126907e;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                Intrinsics.checkNotNullParameter(modelKey, "$modelKey");
                Intrinsics.checkNotNullParameter(model, "$model");
                if (this$03.f123053c.a(params, dl1.a.WRITE)) {
                    this$03.f123051a.c(modelKey, model);
                    return;
                }
                return;
            default:
                pg2.n nVar = (pg2.n) this.f126904b;
                Function1 function1 = (Function1) this.f126905c;
                ApiRequest apiRequest = (ApiRequest) this.f126906d;
                Function1 function12 = (Function1) this.f126907e;
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    m13 = nVar.b(apiRequest, function12);
                } catch (Throwable th6) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th6);
                }
                Object obj2 = (pg2.i) (m13 instanceof xk2.r ? null : m13);
                if (obj2 == null) {
                    obj2 = pg2.e.f100124a;
                }
                function1.invoke(obj2);
                return;
        }
    }
}
