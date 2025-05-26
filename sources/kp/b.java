package kp;

import kotlin.jvm.internal.Intrinsics;
import pg0.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f80523b;

    public /* synthetic */ b(m mVar, int i13) {
        this.f80522a = i13;
        this.f80523b = mVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f80522a;
        m this$0 = this.f80523b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ek2.f fVar = this$0.f80557l;
                if (fVar != null) {
                    bk2.c.dispose(fVar);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f80547b.d(new e());
                this$0.f80547b.f(new q());
                ek2.f fVar2 = this$0.f80557l;
                if (fVar2 != null) {
                    bk2.c.dispose(fVar2);
                    break;
                }
                break;
        }
    }
}
