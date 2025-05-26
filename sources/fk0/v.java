package fk0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62326i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f62327j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i13) {
        super(1);
        this.f62326i = i13;
        this.f62327j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w wVar = this.f62327j;
        int i13 = this.f62326i;
        switch (i13) {
            case 0:
                w it = (w) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            default:
                w it2 = (w) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
        }
        return w.b(wVar, null, true, 1);
    }
}
