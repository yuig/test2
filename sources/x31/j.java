package x31;

import h32.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f131627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, int i13) {
        super(1);
        this.f131626i = i13;
        this.f131627j = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p pVar = this.f131627j;
        int i13 = this.f131626i;
        switch (i13) {
            case 0:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = pVar.f131642h.f131644a;
                break;
            case 1:
                p it = (p) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            default:
                p it2 = (p) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
        }
        return pVar;
    }
}
