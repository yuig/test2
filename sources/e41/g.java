package e41;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z40.y;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f57192j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f57193k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57194i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f57194i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f57194i) {
            case 0:
                y legoUserRepFields = (y) obj;
                Intrinsics.checkNotNullParameter(legoUserRepFields, "legoUserRepFields");
                return legoUserRepFields.getId();
            default:
                y fields = (y) obj;
                Intrinsics.checkNotNullParameter(fields, "fields");
                return fields;
        }
    }
}
