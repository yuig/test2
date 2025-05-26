package et1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60067b;

    public /* synthetic */ p(Object obj, int i13) {
        this.f60066a = i13;
        this.f60067b = obj;
    }

    @Override // et1.g
    public final Object a(wk2.a componentProvider) {
        int i13 = this.f60066a;
        Object obj = this.f60067b;
        switch (i13) {
            case 0:
                h0 simpleProducerFactory = (h0) obj;
                Intrinsics.checkNotNullParameter(simpleProducerFactory, "$simpleProducerFactory");
                Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
                Object obj2 = componentProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return new mt1.h(simpleProducerFactory, (c) obj2);
            case 1:
                h0 simpleProducerFactory2 = (h0) obj;
                Intrinsics.checkNotNullParameter(simpleProducerFactory2, "$simpleProducerFactory");
                Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
                Object obj3 = componentProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                return new ht1.j(simpleProducerFactory2, (c) obj3);
            case 2:
                h0 simpleProducerFactory3 = (h0) obj;
                Intrinsics.checkNotNullParameter(simpleProducerFactory3, "$simpleProducerFactory");
                Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
                Object obj4 = componentProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                return new jg1.c(simpleProducerFactory3, (c) obj4);
            default:
                e0 ringByteBufferFactory = (e0) obj;
                Intrinsics.checkNotNullParameter(ringByteBufferFactory, "$ringByteBufferFactory");
                Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
                Object obj5 = componentProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                return new ht1.q((c) obj5, ringByteBufferFactory);
        }
    }
}
