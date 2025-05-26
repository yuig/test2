package w72;

import android.view.View;
import ao2.j0;
import ao2.k2;
import c72.b0;
import com.pinterest.api.model.fi0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.i1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import so.da;
import u50.r;
import v72.m;
import v72.n;
import v72.q;
import v72.s;
import v72.t;
import v72.u;
import v72.v;
import v72.w;
import x02.b1;

/* loaded from: classes4.dex */
public final class e implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final long f128209f;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f128210a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f128211b;

    /* renamed from: c, reason: collision with root package name */
    public final v72.a f128212c;

    /* renamed from: d, reason: collision with root package name */
    public k2 f128213d;

    /* renamed from: e, reason: collision with root package name */
    public final ri1.c f128214e;

    static {
        zn2.a aVar = zn2.b.f142311b;
        f128209f = dl2.b.P2(1, zn2.d.SECONDS);
    }

    public e(zw.a pinActionHandlerSEP, b0 shufflesEntityMapper, b1 collageRepository, v72.a collageManager, da pinRepSEPFactory) {
        Intrinsics.checkNotNullParameter(pinActionHandlerSEP, "pinActionHandlerSEP");
        Intrinsics.checkNotNullParameter(shufflesEntityMapper, "shufflesEntityMapper");
        Intrinsics.checkNotNullParameter(collageRepository, "collageRepository");
        Intrinsics.checkNotNullParameter(collageManager, "collageManager");
        Intrinsics.checkNotNullParameter(pinRepSEPFactory, "pinRepSEPFactory");
        this.f128210a = shufflesEntityMapper;
        this.f128211b = collageRepository;
        this.f128212c = collageManager;
        this.f128214e = pinRepSEPFactory.a(pinActionHandlerSEP);
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        Object z13;
        w request = (w) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof s) {
            fi0 fi0Var = ((s) request).f124451b;
            if (fi0Var != null) {
                boolean[] zArr = fi0Var.f37696w;
                if (zArr.length <= 14 || !zArr[14]) {
                    z13 = j.z(scope, null, null, new a(this, fi0Var, eventIntake, request, null), 3);
                } else {
                    List M = fi0Var.M();
                    if (M == null) {
                        M = q0.f80391a;
                    }
                    eventIntake.a(new m(b0.h(this.f128210a, M, null, false, 6)));
                    z13 = Unit.f80348a;
                }
                if (z13 != null) {
                    return;
                }
            }
            eventIntake.a(new n(new NullPointerException("Pin's shuffle is null")));
            Unit unit = Unit.f80348a;
            return;
        }
        if (request instanceof v72.r) {
            k2 k2Var = this.f128213d;
            if (k2Var != null) {
                k2Var.cancel((CancellationException) null);
            }
            this.f128213d = j.z(scope, null, null, new d(eventIntake, request, this, null), 3);
            return;
        }
        if (request instanceof q) {
            k2 k2Var2 = this.f128213d;
            if (k2Var2 != null) {
                k2Var2.cancel((CancellationException) null);
                return;
            }
            return;
        }
        boolean z14 = request instanceof t;
        v72.a aVar = this.f128212c;
        if (z14) {
            t tVar = (t) request;
            String sceneViewIdentityKey = tVar.f124452a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
            Iterator it = aVar.f124395a.f2013p.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                WeakReference weakReference = (WeakReference) entry.getValue();
                LinkedHashMap linkedHashMap = aVar.f124397c;
                if (linkedHashMap.containsKey(sceneViewIdentityKey)) {
                    break;
                }
                oc2.j jVar = (oc2.j) weakReference.get();
                if (jVar != null) {
                    View T = jVar.T();
                    if ((T != null ? T.findViewById(tVar.f124453b) : null) != null) {
                        linkedHashMap.put(sceneViewIdentityKey, Integer.valueOf(intValue));
                        break;
                    }
                }
            }
            aVar.b(sceneViewIdentityKey);
            return;
        }
        if (!(request instanceof u)) {
            if (request instanceof v) {
                this.f128214e.e(scope, ((v) request).f124455a, new kd1.j(eventIntake, 18));
                return;
            }
            return;
        }
        String sceneViewIdentityKey2 = ((u) request).f124454a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey2, "sceneViewIdentityKey");
        LinkedHashMap linkedHashMap2 = aVar.f124397c;
        Integer num = (Integer) linkedHashMap2.get(sceneViewIdentityKey2);
        if (num != null) {
            LinkedHashMap linkedHashMap3 = aVar.f124396b;
            ((Set) linkedHashMap3.getOrDefault(num, new LinkedHashSet())).remove(sceneViewIdentityKey2);
            linkedHashMap2.remove(sceneViewIdentityKey2);
            Iterator it2 = i1.h(linkedHashMap3.keySet(), aVar.f124395a.f2013p.keySet()).iterator();
            while (it2.hasNext()) {
                Set set = (Set) linkedHashMap3.remove(Integer.valueOf(((Number) it2.next()).intValue()));
                if (set != null) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        linkedHashMap2.remove((String) it3.next());
                    }
                }
            }
        }
    }
}
