package id1;

import gb2.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f72149j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f72150k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f72151l = new f(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72152i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f72152i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f72152i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72152i) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof k)) {
                    break;
                } else {
                    break;
                }
        }
        return b((List) obj);
    }
}
