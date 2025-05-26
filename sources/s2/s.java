package s2;

import j1.d1;
import j1.z0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110680i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f110681j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Collection f110682k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13, Collection collection, int i14) {
        super(1);
        this.f110680i = i14;
        this.f110681j = i13;
        this.f110682k = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f110680i;
        Collection collection = this.f110682k;
        int i14 = this.f110681j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(i14, collection));
            default:
                d1 keyframesWithSpline = (d1) obj;
                Intrinsics.checkNotNullParameter(keyframesWithSpline, "$this$keyframesWithSpline");
                keyframesWithSpline.f74021a = i14;
                for (br1.c cVar : (List) collection) {
                    keyframesWithSpline.f74022b.l(ml2.c.c(keyframesWithSpline.f74021a * cVar.f23767c), new z0(new n4.f(cVar.f23768d)));
                }
                return Unit.f80348a;
        }
    }
}
