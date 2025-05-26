package fk1;

import h32.h0;
import h32.u0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.e0;
import u50.b0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f62364j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f62365k = new r(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r f62366l = new r(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62367i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(1);
        this.f62367i = i13;
    }

    public final d b(d it) {
        switch (this.f62367i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(CollectionsKt.m0(new ak1.b(new b0(e0.f90645d), null), it.f62348a));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                q0 q0Var = q0.f80391a;
                it.getClass();
                return d.e(q0Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62367i) {
            case 0:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.AD_CLICKTHROUGH_DISCLOSURE;
                break;
        }
        return b((d) obj);
    }
}
