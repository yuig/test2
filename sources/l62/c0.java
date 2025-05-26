package l62;

import java.util.EnumSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.l1;
import r72.z1;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1 f81622i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ EnumSet f81623j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ double f81624k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f81625l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l1 l1Var, EnumSet enumSet, double d2, double d13) {
        super(1);
        this.f81622i = l1Var;
        this.f81623j = enumSet;
        this.f81624k = d2;
        this.f81625l = d13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z1 it = (z1) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean d2 = Intrinsics.d(it.c(), this.f81622i);
        EnumSet enumSet = this.f81623j;
        if (!d2) {
            enumSet.add(b0.MOVE);
        } else if (it.e() != this.f81624k) {
            enumSet.add(b0.SCALE);
        } else if (it.d() != this.f81625l) {
            enumSet.add(b0.ROTATE);
        }
        return kh2.w.v(it, null, this.f81622i, this.f81624k, this.f81625l, null, 17);
    }
}
