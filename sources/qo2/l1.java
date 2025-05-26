package qo2;

import kh2.n3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class l1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f104587a;

    /* renamed from: b, reason: collision with root package name */
    public final no2.b f104588b;

    /* renamed from: c, reason: collision with root package name */
    public final no2.b f104589c;

    /* renamed from: d, reason: collision with root package name */
    public final oo2.h f104590d;

    public l1(no2.b aSerializer, no2.b bSerializer, no2.b cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f104587a = aSerializer;
        this.f104588b = bSerializer;
        this.f104589c = cSerializer;
        this.f104590d = n3.n("kotlin.Triple", new oo2.g[0], new cd2.n(this, 21));
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104590d;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        xk2.w value = (xk2.w) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        oo2.h hVar = this.f104590d;
        po2.b b13 = encoder.b(hVar);
        b13.u(hVar, 0, this.f104587a, value.f135234a);
        b13.u(hVar, 1, this.f104588b, value.f135235b);
        b13.u(hVar, 2, this.f104589c, value.f135236c);
        b13.a(hVar);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        oo2.h hVar = this.f104590d;
        po2.a b13 = decoder.b(hVar);
        Object obj = m1.f104594a;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int o13 = b13.o(hVar);
            if (o13 == -1) {
                b13.a(hVar);
                Object obj4 = m1.f104594a;
                if (obj == obj4) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (obj2 == obj4) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (obj3 != obj4) {
                    return new xk2.w(obj, obj2, obj3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (o13 == 0) {
                obj = b13.C(hVar, 0, this.f104587a, null);
            } else if (o13 == 1) {
                obj2 = b13.C(hVar, 1, this.f104588b, null);
            } else {
                if (o13 != 2) {
                    throw new SerializationException(a.a.d("Unexpected index ", o13));
                }
                obj3 = b13.C(hVar, 2, this.f104589c, null);
            }
        }
    }
}
