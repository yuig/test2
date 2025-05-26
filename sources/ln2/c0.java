package ln2;

import am2.w0;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes2.dex */
public final class c0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final tm2.k f84065d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f84066e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.b f84067f;

    /* renamed from: g, reason: collision with root package name */
    public final tm2.j f84068g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(tm2.k classProto, vm2.f nameResolver, vm2.i typeTable, w0 w0Var, c0 c0Var) {
        super(nameResolver, typeTable, w0Var);
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        this.f84065d = classProto;
        this.f84066e = c0Var;
        this.f84067f = bs1.c.s0(nameResolver, classProto.f118351e);
        tm2.j jVar = (tm2.j) vm2.e.f126224f.d(classProto.f118350d);
        this.f84068g = jVar == null ? tm2.j.CLASS : jVar;
        this.f84069h = s1.k(vm2.e.f126225g, classProto.f118350d, "get(...)");
    }

    @Override // ln2.e0
    public final ym2.c a() {
        ym2.c b13 = this.f84067f.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asSingleFqName(...)");
        return b13;
    }
}
