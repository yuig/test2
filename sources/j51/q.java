package j51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f74766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f74767c;

    public /* synthetic */ q(d0 d0Var, ur0.e eVar, int i13) {
        this.f74765a = i13;
        this.f74766b = d0Var;
        this.f74767c = eVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f74765a;
        Runnable runnable = this.f74767c;
        d0 this$0 = this.f74766b;
        switch (i13) {
            case 0:
                int i14 = d0.f74720s1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.V0 != null) {
                    zf0.f.a(runnable);
                    return;
                } else {
                    Intrinsics.r("educationHelper");
                    throw null;
                }
            default:
                int i15 = d0.f74720s1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                if (this$0.V0 != null) {
                    zf0.f.a(runnable);
                    return;
                } else {
                    Intrinsics.r("educationHelper");
                    throw null;
                }
        }
    }
}
