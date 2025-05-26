package mm2;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 extends wn2.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ am2.g f87678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f87679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f87680d;

    public h0(km2.c cVar, LinkedHashSet linkedHashSet, Function1 function1) {
        this.f87678b = cVar;
        this.f87679c = linkedHashSet;
        this.f87680d = function1;
    }

    @Override // wn2.k
    public final boolean d(Object obj) {
        am2.g current = (am2.g) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == this.f87678b) {
            return true;
        }
        in2.n b03 = current.b0();
        Intrinsics.checkNotNullExpressionValue(b03, "getStaticScope(...)");
        if (!(b03 instanceof j0)) {
            return true;
        }
        this.f87679c.addAll((Collection) this.f87680d.invoke(b03));
        return false;
    }

    @Override // wn2.k
    public final /* bridge */ /* synthetic */ Object j() {
        return Unit.f80348a;
    }
}
