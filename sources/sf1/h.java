package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f112578b;

    public /* synthetic */ h(s sVar, int i13) {
        this.f112577a = i13;
        this.f112578b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f112577a;
        s this$0 = this.f112578b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ac2.m mVar = this$0.f112711r;
                if (mVar != null) {
                    ((ac2.o1) mVar).w();
                    return;
                } else {
                    Intrinsics.r("videoManager");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ac2.m mVar2 = this$0.f112711r;
                if (mVar2 != null) {
                    ((ac2.o1) mVar2).w();
                    return;
                } else {
                    Intrinsics.r("videoManager");
                    throw null;
                }
        }
    }
}
