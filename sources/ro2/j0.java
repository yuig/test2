package ro2;

import androidx.compose.foundation.lazy.layout.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class j0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f109011a;

    public j0(no2.b tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.f109011a = tSerializer;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f109011a.a();
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t m13 = kg.p.m(encoder);
        c json = m13.d();
        Intrinsics.checkNotNullParameter(json, "json");
        no2.b serializer = this.f109011a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        new so2.q(json, new z0(16, j0Var), 1).k(serializer, value);
        Object obj = j0Var.f80434a;
        if (obj != null) {
            m13.e(g((n) obj));
        } else {
            Intrinsics.r("result");
            throw null;
        }
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        po2.c pVar;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l l13 = kg.p.l(decoder);
        n f13 = l13.f();
        c json = l13.d();
        n element = f(f13);
        json.getClass();
        no2.b deserializer = this.f109011a;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof c0) {
            pVar = new so2.s(json, (c0) element, null, null);
        } else if (element instanceof e) {
            pVar = new so2.t(json, (e) element);
        } else {
            if (!(element instanceof v) && !Intrinsics.d(element, z.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar = new so2.p(json, (h0) element);
        }
        return pVar.m(deserializer);
    }

    public n f(n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    public n g(n element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }
}
