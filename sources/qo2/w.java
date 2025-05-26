package qo2;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class w implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104642a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.k f104643b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f104644c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f104645d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(objectInstance, serialName);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f104645d = kotlin.collections.z.d(classAnnotations);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        xk2.k kVar = this.f104643b;
        switch (this.f104642a) {
        }
        return (oo2.g) kVar.getValue();
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object value) {
        switch (this.f104642a) {
            case 0:
                Enum value2 = (Enum) value;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value2, "value");
                Enum[] enumArr = (Enum[]) this.f104644c;
                int K = kotlin.collections.c0.K(enumArr, value2);
                if (K != -1) {
                    encoder.n(a(), K);
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(value2);
                sb3.append(" is not a valid enum ");
                sb3.append(a().i());
                sb3.append(", must be one of ");
                String arrays = Arrays.toString(enumArr);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                sb3.append(arrays);
                throw new SerializationException(sb3.toString());
            default:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.b(a()).a(a());
                return;
        }
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        int i13 = this.f104642a;
        Object obj = this.f104644c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                int w13 = decoder.w(a());
                if (w13 >= 0) {
                    Enum[] enumArr = (Enum[]) obj;
                    if (w13 < enumArr.length) {
                        return enumArr[w13];
                    }
                }
                throw new SerializationException(w13 + " is not among valid " + a().i() + " enum values, values size is " + ((Enum[]) obj).length);
            default:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                oo2.g a13 = a();
                po2.a b13 = decoder.b(a13);
                int o13 = b13.o(a());
                if (o13 != -1) {
                    throw new SerializationException(a.a.d("Unexpected index ", o13));
                }
                Unit unit = Unit.f80348a;
                b13.a(a13);
                return obj;
        }
    }

    public final String toString() {
        switch (this.f104642a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + a().i() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(Enum[] values, v descriptor) {
        this(values, "com.pinterest.shuffles.data.entity.shuffle.ShuffleOverlayEffect");
        Intrinsics.checkNotNullParameter("com.pinterest.shuffles.data.entity.shuffle.ShuffleOverlayEffect", "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f104645d = descriptor;
    }

    public w(Object objectInstance, String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f104644c = objectInstance;
        this.f104645d = kotlin.collections.q0.f80391a;
        this.f104643b = xk2.m.a(xk2.n.PUBLICATION, new xh2.a(9, serialName, this));
    }

    public w(Enum[] values, String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f104644c = values;
        this.f104643b = xk2.m.b(new xh2.a(8, this, serialName));
    }
}
