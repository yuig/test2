package w41;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements y0, o82.r {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f128094a = new x0();

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f128095b = new x0();

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f128096c = new x0();

    /* renamed from: d, reason: collision with root package name */
    public static final x0 f128097d = new x0();

    @Override // o82.r
    public Object i(Object obj, bl2.c cVar) {
        int i13;
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.profile.pins.ui.ProfilePinsMetadataArgs");
        r0 r0Var = (r0) obj;
        Set set = q0.f128069a;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        int i14 = r0Var.f128072a;
        return new xz.b(kotlin.collections.e0.b((i14 <= 0 || (i13 = r0Var.f128073b) <= 0) ? i14 > 0 ? new s0(i14) : u0.f128090a : new t0(i14, i13)));
    }
}
