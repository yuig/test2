package im2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.h1;
import kotlin.collections.z0;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.c f72691a = new ym2.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.c f72692b = new ym2.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c, reason: collision with root package name */
    public static final ym2.c f72693c = new ym2.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d, reason: collision with root package name */
    public static final ym2.c f72694d = new ym2.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e, reason: collision with root package name */
    public static final List f72695e;

    /* renamed from: f, reason: collision with root package name */
    public static final Map f72696f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f72697g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set f72698h;

    static {
        b bVar = b.FIELD;
        b bVar2 = b.METHOD_RETURN_TYPE;
        b bVar3 = b.VALUE_PARAMETER;
        List j13 = kotlin.collections.f0.j(bVar, bVar2, bVar3, b.TYPE_PARAMETER_BOUNDS, b.TYPE_USE);
        f72695e = j13;
        ym2.c cVar = e0.f72721c;
        qm2.f fVar = qm2.f.NOT_NULL;
        List list = j13;
        Map g13 = z0.g(new Pair(cVar, new t(new qm2.g(fVar, false), list, false)), new Pair(e0.f72724f, new t(new qm2.g(fVar, false), list, false)));
        f72696f = g13;
        f72697g = z0.j(z0.g(new Pair(new ym2.c("javax.annotation.ParametersAreNullableByDefault"), new t(new qm2.g(qm2.f.NULLABLE, false), kotlin.collections.e0.b(bVar3))), new Pair(new ym2.c("javax.annotation.ParametersAreNonnullByDefault"), new t(new qm2.g(fVar, false), kotlin.collections.e0.b(bVar3)))), g13);
        f72698h = h1.f(e0.f72726h, e0.f72727i);
    }
}
