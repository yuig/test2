package u00;

import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb.l0;
import pc.n0;
import pc.o0;
import pc.v;

/* loaded from: classes.dex */
public final class o extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f119864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f119865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f119866k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f119867l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wc.a f119868m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o0 o0Var, n0 n0Var, v vVar, p pVar, wc.a aVar, boolean z13) {
        super(1);
        this.f119864i = o0Var;
        this.f119865j = n0Var;
        this.f119866k = vVar;
        this.f119867l = pVar;
        this.f119868m = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wc.k cache = (wc.k) obj;
        Intrinsics.checkNotNullParameter(cache, "cache");
        p pVar = this.f119867l;
        wc.d dVar = pVar.f119870b;
        o0 operation = this.f119864i;
        n0 operationData = this.f119865j;
        v customScalarAdapters = this.f119866k;
        Map records = l0.N0(operation, operationData, customScalarAdapters, dVar);
        Set c13 = cache.c(CollectionsKt.F0(records.values()), wc.a.f129075b);
        for (k kVar : pVar.f119871c) {
            kVar.getClass();
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(operationData, "operationData");
            Intrinsics.checkNotNullParameter(records, "records");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            wc.a cacheHeaders = this.f119868m;
            Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
            kotlin.jvm.internal.j.z(kVar.f119852f, kVar.f119851e, null, new g(kVar, records, null), 2);
        }
        return c13;
    }
}
