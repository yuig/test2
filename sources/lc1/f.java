package lc1;

import kotlin.jvm.internal.Intrinsics;
import rl1.t;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f82863b;

    public /* synthetic */ f(h hVar, int i13) {
        this.f82862a = i13;
        this.f82863b = hVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f82862a;
        h this$0 = this.f82863b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.f82874a.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof t) {
                    this$0.f82874a.invoke();
                    break;
                }
                break;
        }
    }
}
