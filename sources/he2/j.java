package he2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class j extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f68993j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f68994k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68995i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f68995i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68995i) {
            case 0:
                Intrinsics.checkNotNullParameter((de2.a) obj, "it");
                return Unit.f80348a;
            default:
                de2.a it = (de2.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((f) it).d();
        }
    }
}
