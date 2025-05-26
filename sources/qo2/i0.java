package qo2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f104567a;

    /* renamed from: b, reason: collision with root package name */
    public final no2.b f104568b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f104569c;

    public i0(no2.b kSerializer, no2.b vSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f104567a = kSerializer;
        this.f104568b = vSerializer;
        this.f104569c = new h0(kSerializer.a(), vSerializer.a());
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104569c;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int i13 = i(obj);
        h0 h0Var = this.f104569c;
        po2.b h10 = encoder.h(h0Var, i13);
        Iterator h13 = h(obj);
        int i14 = 0;
        while (h13.hasNext()) {
            Map.Entry entry = (Map.Entry) h13.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i15 = i14 + 1;
            h10.u(h0Var, i14, this.f104567a, key);
            i14 += 2;
            h10.u(h0Var, i15, this.f104568b, value);
        }
        h10.a(h0Var);
    }

    @Override // qo2.a
    public final Object f() {
        return new LinkedHashMap();
    }

    @Override // qo2.a
    public final int g(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // qo2.a
    public final Iterator h(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // qo2.a
    public final int i(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // qo2.a
    public final Object m(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // qo2.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void k(po2.a decoder, int i13, Map builder, boolean z13) {
        int i14;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        oo2.g gVar = this.f104569c;
        Object C = decoder.C(gVar, i13, this.f104567a, null);
        if (z13) {
            i14 = decoder.o(gVar);
            if (i14 != i13 + 1) {
                throw new IllegalArgumentException(a.a.f("Value must follow key in a map, index for key: ", i13, ", returned index for value: ", i14).toString());
            }
        } else {
            i14 = i13 + 1;
        }
        boolean containsKey = builder.containsKey(C);
        no2.b bVar = this.f104568b;
        builder.put(C, (!containsKey || (bVar.a().c() instanceof oo2.f)) ? decoder.C(gVar, i14, bVar, null) : decoder.C(gVar, i14, bVar, kotlin.collections.z0.e(C, builder)));
    }
}
