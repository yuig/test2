package ib2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f72032b;

    public /* synthetic */ b(c cVar, int i13) {
        this.f72031a = i13;
        this.f72032b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f72031a;
        c this$0 = this.f72032b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f72045m) {
                    this$0.invalidateSelf();
                    this$0.f72045m = false;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.invalidateSelf();
                break;
        }
    }
}
