package z9;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 extends n0 {

    /* renamed from: n, reason: collision with root package name */
    public final Class f141209n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Class type) {
        super(type, 0);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isEnum()) {
            this.f141209n = type;
            return;
        }
        throw new IllegalArgumentException((type + " is not an Enum type.").toString());
    }

    @Override // z9.n0, z9.o0
    public final String b() {
        String name = this.f141209n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // z9.n0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String value) {
        Object obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Class cls = this.f141209n;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i13];
            if (kotlin.text.z.i(((Enum) obj).name(), value, true)) {
                break;
            }
            i13++;
        }
        Enum r43 = (Enum) obj;
        if (r43 != null) {
            return r43;
        }
        StringBuilder o13 = cb.o("Enum value ", value, " not found for type ");
        o13.append(cls.getName());
        o13.append('.');
        throw new IllegalArgumentException(o13.toString());
    }
}
