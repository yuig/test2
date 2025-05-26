package e2;

import android.app.Activity;
import android.content.SharedPreferences;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import io.embrace.android.embracesdk.spans.ErrorCode;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oi.g4;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f56856a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f56857b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f56858c;

    /* renamed from: d, reason: collision with root package name */
    public Object f56859d;

    /* renamed from: e, reason: collision with root package name */
    public Object f56860e;

    public g0(fn.b bVar, fn.d dVar, fn.f fVar, fn.f fVar2) {
        this.f56859d = bVar;
        this.f56860e = dVar;
        this.f56857b = fVar;
        if (fVar2 == null) {
            this.f56858c = fn.f.NONE;
        } else {
            this.f56858c = fVar2;
        }
        this.f56856a = false;
    }

    public static g0 b(fn.b bVar, fn.d dVar, fn.f fVar, fn.f fVar2) {
        j1.b(bVar, "CreativeType is null");
        j1.b(dVar, "ImpressionType is null");
        j1.b(fVar, "Impression owner is null");
        if (fVar == fn.f.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (bVar == fn.b.DEFINED_BY_JAVASCRIPT && fVar == fn.f.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (dVar == fn.d.DEFINED_BY_JAVASCRIPT && fVar == fn.f.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new g0(bVar, dVar, fVar, fVar2);
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (k(activity)) {
            zf2.e eVar = (zf2.e) this.f56857b;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            String activityName = activity.getLocalClassName();
            Intrinsics.checkNotNullExpressionValue(activityName, "activity.localClassName");
            long f13 = f();
            boolean isAnnotationPresent = activity.getClass().isAnnotationPresent(mf2.a.class);
            zf2.i iVar = (zf2.i) eVar;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            iVar.d(zf2.j.COLD, hashCode, activityName, f13, isAnnotationPresent);
            iVar.c(hashCode, f13, zf2.d.CREATE);
        }
    }

    public final void c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (k(activity)) {
            zf2.e eVar = (zf2.e) this.f56857b;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            long f13 = f();
            zf2.i iVar = (zf2.i) eVar;
            iVar.getClass();
            iVar.a(hashCode, f13, zf2.d.CREATE);
        }
    }

    public final void d(d3.h hVar, float f13, long j13) {
        float floatValue = ((Number) ((j1.d) this.f56858c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b13 = b3.w.b(j13, floatValue);
            if (!this.f56856a) {
                d3.h.O(hVar, b13, f13, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                return;
            }
            float d2 = a3.f.d(hVar.g());
            float b14 = a3.f.b(hVar.g());
            d3.b p03 = hVar.p0();
            long e13 = p03.e();
            p03.a().j();
            try {
                p03.f53648a.f53655a.a().e(0.0f, 0.0f, d2, b14, 1);
                d3.h.O(hVar, b13, f13, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
            } finally {
                ep.b.z(p03, e13);
            }
        }
    }

    public final void e(o1.j jVar, j0 j0Var) {
        boolean z13 = jVar instanceof o1.h;
        if (z13) {
            ((List) this.f56859d).add(jVar);
        } else if (jVar instanceof o1.i) {
            ((List) this.f56859d).remove(((o1.i) jVar).f92763a);
        } else if (jVar instanceof o1.d) {
            ((List) this.f56859d).add(jVar);
        } else if (jVar instanceof o1.e) {
            ((List) this.f56859d).remove(((o1.e) jVar).f92756a);
        } else if (jVar instanceof o1.b) {
            ((List) this.f56859d).add(jVar);
        } else if (jVar instanceof o1.c) {
            ((List) this.f56859d).remove(((o1.c) jVar).f92755a);
        } else if (!(jVar instanceof o1.a)) {
            return;
        } else {
            ((List) this.f56859d).remove(((o1.a) jVar).f92754a);
        }
        o1.j jVar2 = (o1.j) CollectionsKt.d0((List) this.f56859d);
        if (Intrinsics.d((o1.j) this.f56860e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            i iVar = (i) ((Function0) this.f56857b).invoke();
            float f13 = z13 ? iVar.f56867c : jVar instanceof o1.d ? iVar.f56866b : jVar instanceof o1.b ? iVar.f56865a : 0.0f;
            o2 o2Var = x.f56917a;
            boolean z14 = jVar2 instanceof o1.h;
            o2 o2Var2 = x.f56917a;
            if (!z14) {
                if (jVar2 instanceof o1.d) {
                    o2Var2 = new o2(45, j1.g0.f74072c, 2);
                } else if (jVar2 instanceof o1.b) {
                    o2Var2 = new o2(45, j1.g0.f74072c, 2);
                }
            }
            kotlin.jvm.internal.j.z(j0Var, null, null, new e0(this, f13, o2Var2, null), 3);
        } else {
            o1.j jVar3 = (o1.j) this.f56860e;
            o2 o2Var3 = x.f56917a;
            boolean z15 = jVar3 instanceof o1.h;
            o2 o2Var4 = x.f56917a;
            if (!z15 && !(jVar3 instanceof o1.d) && (jVar3 instanceof o1.b)) {
                o2Var4 = new o2(RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY, j1.g0.f74072c, 2);
            }
            kotlin.jvm.internal.j.z(j0Var, null, null, new f0(this, o2Var4, null), 3);
        }
        this.f56860e = jVar2;
    }

    public final long f() {
        return TimeUnit.NANOSECONDS.toMillis(((zi2.b) this.f56859d).now());
    }

    public final void g(Activity activity) {
        Object m13;
        boolean unregisterFrameCommitCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (k(activity)) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            ((Map) this.f56860e).remove(Integer.valueOf(hashCode));
            zf2.e eVar = (zf2.e) this.f56857b;
            long f13 = f();
            zf2.i iVar = (zf2.i) eVar;
            iVar.getClass();
            iVar.b(hashCode, f13, ErrorCode.USER_ABANDON);
            hi2.f fVar = (hi2.f) this.f56858c;
            if (fVar != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode2 = activity.hashCode();
                ConcurrentHashMap concurrentHashMap = fVar.f69252b;
                Function0 function0 = (Function0) concurrentHashMap.get(Integer.valueOf(hashCode2));
                if (function0 != null) {
                    try {
                        xk2.q qVar = xk2.s.f135225b;
                        unregisterFrameCommitCallback = activity.getWindow().getDecorView().getViewTreeObserver().unregisterFrameCommitCallback(new p4.a(15, function0));
                        m13 = Boolean.valueOf(unregisterFrameCommitCallback);
                    } catch (Throwable th3) {
                        xk2.q qVar2 = xk2.s.f135225b;
                        m13 = ue.c.m(th3);
                    }
                    Throwable a13 = xk2.s.a(m13);
                    if (a13 != null) {
                        ((lh2.e) fVar.f69251a).b(lh2.g.UI_CALLBACK_FAIL, new IllegalStateException("Failed to unregister first draw callback", a13));
                    }
                }
            }
        }
    }

    public final void h(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (k(activity)) {
            zf2.e eVar = (zf2.e) this.f56857b;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            long f13 = f();
            zf2.i iVar = (zf2.i) eVar;
            if (iVar.f141949d) {
                iVar.c(hashCode, f13, zf2.d.RESUME);
            } else if (iVar.e(hashCode) == zf2.f.RESUME) {
                iVar.b(hashCode, f13, null);
            }
        }
    }

    public final void i(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (k(activity)) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            hi2.f fVar = (hi2.f) this.f56858c;
            if (fVar != null) {
                fVar.a(activity, new zf2.c(this, hashCode, 1), new zf2.c(this, hashCode, 0));
            }
            ((Map) this.f56860e).put(Integer.valueOf(hashCode), Long.valueOf(f()));
        }
    }

    public final void j(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (k(activity)) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            zf2.e eVar = (zf2.e) this.f56857b;
            String activityName = activity.getLocalClassName();
            Intrinsics.checkNotNullExpressionValue(activityName, "activity.localClassName");
            Long l13 = (Long) ((Map) this.f56860e).remove(Integer.valueOf(hashCode));
            long longValue = l13 != null ? l13.longValue() : f();
            boolean isAnnotationPresent = activity.getClass().isAnnotationPresent(mf2.a.class);
            zf2.i iVar = (zf2.i) eVar;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            iVar.d(zf2.j.HOT, hashCode, activityName, longValue, isAnnotationPresent);
            zf2.d dVar = zf2.d.START;
            iVar.c(hashCode, longValue, dVar);
            long f13 = f();
            iVar.getClass();
            iVar.a(hashCode, f13, dVar);
        }
    }

    public final boolean k(Activity activity) {
        return (this.f56856a && !activity.getClass().isAnnotationPresent(mf2.c.class)) || activity.getClass().isAnnotationPresent(mf2.a.class) || activity.getClass().isAnnotationPresent(mf2.b.class);
    }

    public final String l() {
        if (!this.f56856a) {
            this.f56856a = true;
            this.f56859d = ((g4) this.f56860e).w().getString((String) this.f56857b, null);
        }
        return (String) this.f56859d;
    }

    public final void m(String str) {
        SharedPreferences.Editor edit = ((g4) this.f56860e).w().edit();
        edit.putString((String) this.f56857b, str);
        edit.apply();
        this.f56859d = str;
    }

    public g0(yh2.c initial, di2.k endType, lh2.b logger, boolean z13, String str) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(endType, "endType");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f56857b = initial;
        this.f56858c = endType;
        this.f56859d = logger;
        this.f56860e = (str == null || str.length() == 0) ? null : str;
        this.f56856a = z13;
    }

    public g0(zf2.e uiLoadEventListener, boolean z13, zi2.b clock) {
        Intrinsics.checkNotNullParameter(uiLoadEventListener, "uiLoadEventListener");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f56857b = uiLoadEventListener;
        this.f56858c = null;
        this.f56856a = z13;
        this.f56859d = clock;
        this.f56860e = new ConcurrentHashMap();
    }

    public g0(g4 g4Var, String str) {
        this.f56860e = g4Var;
        com.bumptech.glide.d.o(str);
        this.f56857b = str;
        this.f56858c = null;
    }

    public g0(boolean z13, Function0 function0) {
        this.f56856a = z13;
        this.f56857b = function0;
        this.f56858c = j1.e.a(0.0f);
        this.f56859d = new ArrayList();
    }
}
