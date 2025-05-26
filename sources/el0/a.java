package el0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i13) {
        super(1, obj, c.class, "getBoardAdditionalAuxData", "getBoardAdditionalAuxData(Ljava/lang/String;)Ljava/util/HashMap;", 0);
        this.f59560a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, c.class, "getBoardAdditionalAuxData", "getBoardAdditionalAuxData(Ljava/lang/String;)Ljava/util/HashMap;", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59560a;
        switch (i13) {
            case 0:
                String p03 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(p03, "p0");
                        return ((c) this.receiver).F3(p03);
                    default:
                        Intrinsics.checkNotNullParameter(p03, "p0");
                        return ((c) this.receiver).F3(p03);
                }
            default:
                String p04 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(p04, "p0");
                        return ((c) this.receiver).F3(p04);
                    default:
                        Intrinsics.checkNotNullParameter(p04, "p0");
                        return ((c) this.receiver).F3(p04);
                }
        }
    }
}
