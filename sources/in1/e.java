package in1;

import hn1.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72840i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f72841j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i13) {
        super(1);
        this.f72840i = i13;
        this.f72841j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f72840i;
        h hVar = this.f72841j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ((hn1.d) hVar).f69649a;
            default:
                cm1.d it2 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return ((hn1.e) hVar).f69650a;
        }
    }
}
