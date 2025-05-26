package qt;

import gb2.i;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.h;
import tb0.p;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f105103j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f105104k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f105105l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f105106m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f105107n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f105108o = new d(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105109i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f105109i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f105109i) {
            case 0:
                HashSet hashSet = h.f117076w;
                tb0.g.f117075a.q(th3, "Load Data error", p.ONE_TAP_ADS);
                break;
            case 1:
                HashSet hashSet2 = h.f117076w;
                tb0.g.f117075a.q(th3, "Load Data error", p.ONE_TAP_ADS);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105109i) {
            case 0:
                b((Throwable) obj);
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            case 2:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof i ? m0.F(list, i.class) : q0.f80391a;
            case 3:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 4:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return (i) CollectionsKt.d0(it2);
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
