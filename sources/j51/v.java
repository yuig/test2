package j51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f74780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f74781c;

    public /* synthetic */ v(d0 d0Var, w wVar, int i13) {
        this.f74779a = i13;
        this.f74780b = d0Var;
        this.f74781c = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f74779a;
        w this$1 = this.f74781c;
        d0 this$0 = this.f74780b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.B8(this$1);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.B8(this$1);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                this$0.B8(this$1);
                break;
        }
    }
}
