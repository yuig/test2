package ve;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.h1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f125648m = z0.f(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* renamed from: a, reason: collision with root package name */
    public final a f125649a;

    /* renamed from: b, reason: collision with root package name */
    public final a f125650b;

    /* renamed from: c, reason: collision with root package name */
    public final a f125651c;

    /* renamed from: d, reason: collision with root package name */
    public final a f125652d;

    /* renamed from: e, reason: collision with root package name */
    public final a f125653e;

    /* renamed from: f, reason: collision with root package name */
    public final a f125654f;

    /* renamed from: g, reason: collision with root package name */
    public final a f125655g;

    /* renamed from: h, reason: collision with root package name */
    public final a f125656h;

    /* renamed from: i, reason: collision with root package name */
    public final a f125657i;

    /* renamed from: j, reason: collision with root package name */
    public final a f125658j;

    /* renamed from: k, reason: collision with root package name */
    public final a f125659k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f125660l;

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125649a = (a) obj;
        Object obj2 = hashMap.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125650b = h.k0((a) obj2);
        Object obj3 = hashMap.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125651c = h.k0((a) obj3);
        Object obj4 = hashMap.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125652d = h.k0((a) obj4);
        Object obj5 = hashMap.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125653e = (a) obj5;
        Object obj6 = hashMap.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125654f = (a) obj6;
        Object obj7 = hashMap.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125655g = (a) obj7;
        Object obj8 = hashMap.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125656h = h.j0((a) obj8);
        Object obj9 = hashMap.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125657i = h.j0((a) obj9);
        Object obj10 = hashMap.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125658j = (a) obj10;
        Object obj11 = hashMap.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f125659k = (a) obj11;
        this.f125660l = new HashMap();
        for (String str : h1.f(d.MTML_INTEGRITY_DETECT.toKey(), d.MTML_APP_EVENT_PREDICTION.toKey())) {
            String n13 = Intrinsics.n(".weight", str);
            String n14 = Intrinsics.n(".bias", str);
            a aVar = (a) hashMap.get(n13);
            a aVar2 = (a) hashMap.get(n14);
            if (aVar != null) {
                this.f125660l.put(n13, h.j0(aVar));
            }
            if (aVar2 != null) {
                this.f125660l.put(n14, aVar2);
            }
        }
    }

    public final a a(a dense, String[] texts, String task) {
        HashMap hashMap = this.f125660l;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            a h10 = h.h(h.k(texts, this.f125649a), this.f125650b);
            h.b(h10, this.f125653e);
            h.e0(h10);
            a h13 = h.h(h10, this.f125651c);
            h.b(h13, this.f125654f);
            h.e0(h13);
            a a03 = h.a0(h13, 2);
            a h14 = h.h(a03, this.f125652d);
            h.b(h14, this.f125655g);
            h.e0(h14);
            a a04 = h.a0(h10, h10.f125645a[1]);
            a a05 = h.a0(a03, a03.f125645a[1]);
            a a06 = h.a0(h14, h14.f125645a[1]);
            h.n(a04);
            h.n(a05);
            h.n(a06);
            a j13 = h.j(h.e(new a[]{a04, a05, a06, dense}), this.f125656h, this.f125658j);
            h.e0(j13);
            a j14 = h.j(j13, this.f125657i, this.f125659k);
            h.e0(j14);
            a aVar = (a) hashMap.get(Intrinsics.n(".weight", task));
            a aVar2 = (a) hashMap.get(Intrinsics.n(".bias", task));
            if (aVar != null && aVar2 != null) {
                a j15 = h.j(j14, aVar, aVar2);
                h.g0(j15);
                return j15;
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
