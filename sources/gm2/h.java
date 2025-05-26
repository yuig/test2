package gm2;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends f implements pm2.e {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f65775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ym2.g gVar, Object[] values) {
        super(gVar);
        Intrinsics.checkNotNullParameter(values, "values");
        this.f65775b = values;
    }

    public final ArrayList a() {
        Object[] objArr = this.f65775b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object value : objArr) {
            Intrinsics.f(value);
            Intrinsics.checkNotNullParameter(value, "value");
            Class<?> cls = value.getClass();
            List list = d.f65761a;
            Intrinsics.checkNotNullParameter(cls, "<this>");
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new v(null, (Enum) value) : value instanceof Annotation ? new g(null, (Annotation) value) : value instanceof Object[] ? new h(null, (Object[]) value) : value instanceof Class ? new r(null, (Class) value) : new x(value, null));
        }
        return arrayList;
    }
}
