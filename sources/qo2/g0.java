package qo2;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class g0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f104557a;

    /* renamed from: b, reason: collision with root package name */
    public final no2.b f104558b;

    public g0(no2.b bVar, no2.b bVar2) {
        this.f104557a = bVar;
        this.f104558b = bVar2;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        Object key;
        Object value;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        p0 p0Var = (p0) this;
        oo2.h hVar = p0Var.f104607d;
        po2.b b13 = encoder.b(hVar);
        int i13 = p0Var.f104606c;
        switch (i13) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<this>");
                key = pair.f80346a;
                break;
        }
        b13.u(hVar, 0, this.f104557a, key);
        switch (i13) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair2, "<this>");
                value = pair2.f80347b;
                break;
        }
        b13.u(hVar, 1, this.f104558b, value);
        b13.a(hVar);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Object n0Var;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        p0 p0Var = (p0) this;
        oo2.h hVar = p0Var.f104607d;
        po2.a b13 = decoder.b(hVar);
        Object obj = m1.f104594a;
        Object obj2 = obj;
        while (true) {
            int o13 = b13.o(hVar);
            if (o13 == -1) {
                Object obj3 = m1.f104594a;
                if (obj == obj3) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (obj2 == obj3) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (p0Var.f104606c) {
                    case 0:
                        n0Var = new n0(obj, obj2);
                        break;
                    default:
                        n0Var = new Pair(obj, obj2);
                        break;
                }
                b13.a(hVar);
                return n0Var;
            }
            if (o13 == 0) {
                obj = b13.C(hVar, 0, this.f104557a, null);
            } else {
                if (o13 != 1) {
                    throw new SerializationException(a.a.d("Invalid index: ", o13));
                }
                obj2 = b13.C(hVar, 1, this.f104558b, null);
            }
        }
    }
}
