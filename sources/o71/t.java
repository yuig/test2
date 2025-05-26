package o71;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93375i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f93376j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i13) {
        super(1);
        this.f93375i = i13;
        this.f93376j = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93375i;
        v vVar = this.f93376j;
        switch (i13) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!Intrinsics.d(vVar.d(), it));
            default:
                List list = (List) obj;
                Intrinsics.f(list);
                vVar.x3(list);
                return Unit.f80348a;
        }
    }
}
