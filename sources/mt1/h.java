package mt1;

import et1.h0;
import et1.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f88152a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f88153b;

    /* renamed from: c, reason: collision with root package name */
    public final j f88154c;

    /* renamed from: d, reason: collision with root package name */
    public final j f88155d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f88156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f88157f;

    public h(h0 simpleProducerFactory, et1.c component) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f88152a = component;
        this.f88153b = new HashMap();
        simpleProducerFactory.getClass();
        j jVar = new j();
        this.f88154c = jVar;
        this.f88155d = jVar;
        ((v0) component).a(jVar, "On Minimum Changed");
    }

    public final Long a() {
        HashMap hashMap = this.f88153b;
        Long l13 = null;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((g) ((Map.Entry) it.next()).getValue()).f88150a == null) {
                    hashMap = null;
                    break;
                }
            }
        }
        if (hashMap != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Long l14 = ((g) ((Map.Entry) it2.next()).getValue()).f88150a;
                if (l14 != null) {
                    arrayList.add(l14);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                Long valueOf = Long.valueOf(((Number) it3.next()).longValue());
                loop2: while (true) {
                    l13 = valueOf;
                    while (it3.hasNext()) {
                        valueOf = Long.valueOf(((Number) it3.next()).longValue());
                        if (l13.compareTo(valueOf) > 0) {
                            break;
                        }
                    }
                }
            }
        }
        return l13;
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((v0) this.f88152a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((v0) this.f88152a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f88152a.j(callback);
    }

    public final String toString() {
        return "Minimum minimum=[" + a() + "] reachedEndOfInput=[" + this.f88157f + "]";
    }
}
