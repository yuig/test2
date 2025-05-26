package nn2;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91584i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f91585j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(0);
        this.f91584i = i13;
        this.f91585j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        in2.k kVar = in2.k.f72872i;
        f fVar = this.f91585j;
        int i13 = this.f91584i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        in2.g gVar = in2.g.f72858l;
                        in2.n.f72875a.getClass();
                        return fVar.i(gVar, kVar, hm2.e.WHEN_GET_ALL_DESCRIPTORS);
                    default:
                        ((qn2.h) fVar.f91587g).getClass();
                        j classDescriptor = fVar.f91590j;
                        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                        List c13 = classDescriptor.f91603n.c();
                        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
                        return c13;
                }
            default:
                switch (i13) {
                    case 0:
                        in2.g gVar2 = in2.g.f72858l;
                        in2.n.f72875a.getClass();
                        return fVar.i(gVar2, kVar, hm2.e.WHEN_GET_ALL_DESCRIPTORS);
                    default:
                        ((qn2.h) fVar.f91587g).getClass();
                        j classDescriptor2 = fVar.f91590j;
                        Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
                        List c14 = classDescriptor2.f91603n.c();
                        Intrinsics.checkNotNullExpressionValue(c14, "getSupertypes(...)");
                        return c14;
                }
        }
    }
}
