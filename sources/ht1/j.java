package ht1;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements et1.e {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f70247a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f70248b;

    /* renamed from: c, reason: collision with root package name */
    public nt1.c f70249c;

    /* renamed from: d, reason: collision with root package name */
    public final ft1.i f70250d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f70251e;

    /* renamed from: f, reason: collision with root package name */
    public Long f70252f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f70253g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70254h;

    /* renamed from: i, reason: collision with root package name */
    public final mt1.j f70255i;

    /* renamed from: j, reason: collision with root package name */
    public final mt1.j f70256j;

    /* renamed from: k, reason: collision with root package name */
    public final mt1.j f70257k;

    public j(et1.h0 simpleProducerFactory, et1.c component) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f70247a = component;
        this.f70248b = new LinkedHashMap();
        this.f70250d = ft1.i.Float;
        this.f70251e = nt1.d.a(8192);
        simpleProducerFactory.getClass();
        mt1.j jVar = new mt1.j();
        this.f70255i = jVar;
        mt1.j jVar2 = new mt1.j();
        this.f70256j = jVar2;
        this.f70257k = jVar2;
        ((et1.u0) ((et1.v0) component).f60109a).e(jVar2);
        et1.v0 v0Var = (et1.v0) component;
        v0Var.a(jVar, "On Mixed Audio Available");
        v0Var.a(jVar2, "On Output Format Changed");
    }

    public static final void a(j jVar) {
        LinkedHashMap linkedHashMap = jVar.f70248b;
        if (linkedHashMap.isEmpty() || jVar.b()) {
            return;
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i iVar = (i) ((Map.Entry) it.next()).getValue();
                if (!iVar.f70237b && !iVar.f70236a) {
                    return;
                }
            }
        }
        Integer num = jVar.f70253g;
        Intrinsics.f(num);
        int intValue = num.intValue();
        nt1.c cVar = jVar.f70249c;
        Intrinsics.f(cVar);
        ByteBuffer byteBuffer = jVar.f70251e;
        Long l13 = jVar.f70252f;
        Intrinsics.f(l13);
        jVar.f70255i.e(new ft1.a(intValue, cVar, byteBuffer, true, l13.longValue()));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((i) ((Map.Entry) it2.next()).getValue()).f70237b = false;
        }
        jVar.f70252f = null;
        jVar.f70253g = null;
    }

    public final boolean b() {
        LinkedHashMap linkedHashMap = this.f70248b;
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!((i) ((Map.Entry) it.next()).getValue()).f70236a) {
                return false;
            }
        }
        return true;
    }

    public final void c(nt1.c cVar, String str) {
        ft1.i g13 = cVar.g();
        Intrinsics.f(g13);
        ft1.i iVar = this.f70250d;
        if (g13 == iVar) {
            return;
        }
        throw new IllegalArgumentException(("Unexpected PCM type [" + g13 + "] for track [" + str + "]. Expected PCM type [" + iVar + "].").toString());
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f70247a).d(obj);
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f70247a).h(callback);
    }

    @Override // et1.e
    public final void j(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70247a.j(callback);
    }

    public final String toString() {
        return "Audio Mixer: sent done producing? [" + this.f70254h + "] format [" + this.f70249c + "] mixed start time [" + this.f70252f + "] mixed frame count [" + this.f70253g + "]";
    }
}
