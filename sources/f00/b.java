package f00;

import ac2.o1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60747b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f60746a = i13;
        this.f60747b = obj;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f60746a;
        Object obj2 = this.f60747b;
        switch (i13) {
            case 0:
                g this$0 = (g) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f110219b.d(new sb0.a(Boolean.TRUE));
                break;
            default:
                o1 this$02 = (o1) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.w();
                break;
        }
    }
}
