package so2;

import a.cb;
import androidx.lifecycle.k0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kh2.j1;
import kotlin.collections.i1;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import qo2.w0;

/* loaded from: classes4.dex */
public class s extends a {

    /* renamed from: e, reason: collision with root package name */
    public final ro2.c0 f114811e;

    /* renamed from: f, reason: collision with root package name */
    public final String f114812f;

    /* renamed from: g, reason: collision with root package name */
    public final oo2.g f114813g;

    /* renamed from: h, reason: collision with root package name */
    public int f114814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f114815i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ro2.c json, ro2.c0 value, String str, oo2.g gVar) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f114811e = value;
        this.f114812f = str;
        this.f114813g = gVar;
    }

    @Override // so2.a, po2.c
    public final boolean A() {
        return !this.f114815i && super.A();
    }

    @Override // qo2.r0
    public String O(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ro2.c cVar = this.f114752c;
        n.d(descriptor, cVar);
        String f13 = descriptor.f(i13);
        if (!this.f114753d.f109023l || U().f108979a.keySet().contains(f13)) {
            return f13;
        }
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        k0 k0Var = cVar.f108978c;
        rm2.i0 key = n.f114804a;
        xh2.a defaultValue = new xh2.a(10, descriptor, cVar);
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) k0Var.f18655a.get(descriptor);
        Object obj = null;
        Object value = map != null ? map.get(key) : null;
        if (value == null) {
            value = null;
        }
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Map map2 = k0Var.f18655a;
            Object obj2 = map2.get(descriptor);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap(2);
                map2.put(descriptor, obj2);
            }
            ((Map) obj2).put(key, value);
        }
        Map map3 = (Map) value;
        Iterator it = U().f108979a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Integer num = (Integer) map3.get((String) next);
            if (num != null && num.intValue() == i13) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : f13;
    }

    @Override // so2.a
    public ro2.n R(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (ro2.n) z0.e(tag, U());
    }

    @Override // so2.a
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public ro2.c0 U() {
        return this.f114811e;
    }

    @Override // so2.a, po2.a
    public void a(oo2.g descriptor) {
        Set i13;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ro2.k kVar = this.f114753d;
        if (kVar.f109013b || (descriptor.c() instanceof oo2.d)) {
            return;
        }
        ro2.c cVar = this.f114752c;
        n.d(descriptor, cVar);
        if (kVar.f109023l) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set a13 = w0.a(descriptor);
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            k0 k0Var = cVar.f108978c;
            rm2.i0 key = n.f114804a;
            k0Var.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Map map = (Map) k0Var.f18655a.get(descriptor);
            Object obj = map != null ? map.get(key) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = s0.f80394a;
            }
            i13 = i1.i(a13, keySet);
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            i13 = w0.a(descriptor);
        }
        for (String key2 : U().f108979a.keySet()) {
            if (!i13.contains(key2) && !Intrinsics.d(key2, this.f114812f)) {
                String input = U().toString();
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(input, "input");
                StringBuilder o13 = cb.o("Encountered an unknown key '", key2, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                o13.append((Object) j1.j1(-1, input));
                throw j1.h(-1, o13.toString());
            }
        }
    }

    @Override // so2.a, po2.c
    public final po2.a b(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        oo2.g gVar = this.f114813g;
        if (descriptor != gVar) {
            return super.b(descriptor);
        }
        ro2.n S = S();
        if (S instanceof ro2.c0) {
            String str = this.f114812f;
            return new s(this.f114752c, (ro2.c0) S, str, gVar);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        sb3.append(l0Var.b(ro2.c0.class));
        sb3.append(" as the serialized body of ");
        sb3.append(gVar.i());
        sb3.append(", but had ");
        sb3.append(l0Var.b(S.getClass()));
        throw j1.h(-1, sb3.toString());
    }

    @Override // po2.a
    public int o(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f114814h < descriptor.e()) {
            int i13 = this.f114814h;
            this.f114814h = i13 + 1;
            String P = P(descriptor, i13);
            int i14 = this.f114814h - 1;
            this.f114815i = false;
            boolean containsKey = U().containsKey(P);
            ro2.c cVar = this.f114752c;
            if (!containsKey) {
                boolean z13 = (cVar.f108976a.f109017f || descriptor.j(i14) || !descriptor.h(i14).b()) ? false : true;
                this.f114815i = z13;
                if (!z13) {
                    continue;
                }
            }
            if (this.f114753d.f109019h && descriptor.j(i14)) {
                oo2.g h10 = descriptor.h(i14);
                if (h10.b() || !(R(P) instanceof ro2.z)) {
                    if (Intrinsics.d(h10.c(), oo2.m.f96902a) && (!h10.b() || !(R(P) instanceof ro2.z))) {
                        ro2.n R = R(P);
                        String str = null;
                        ro2.h0 h0Var = R instanceof ro2.h0 ? (ro2.h0) R : null;
                        if (h0Var != null) {
                            qo2.b0 b0Var = ro2.o.f109027a;
                            Intrinsics.checkNotNullParameter(h0Var, "<this>");
                            if (!(h0Var instanceof ro2.z)) {
                                str = h0Var.b();
                            }
                        }
                        if (str != null && n.b(h10, cVar, str) == -3) {
                        }
                    }
                }
            }
            return i14;
        }
        return -1;
    }
}
