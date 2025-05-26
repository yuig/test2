package ul2;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final Field f122559h;

    public n(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f122559h = field;
    }

    @Override // tb.f
    public final String v() {
        StringBuilder sb3 = new StringBuilder();
        Field field = this.f122559h;
        String name = field.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb3.append(im2.c0.a(name));
        sb3.append("()");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb3.append(gm2.d.b(type));
        return sb3.toString();
    }
}
