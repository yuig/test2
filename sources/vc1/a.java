package vc1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f125595b;

    public /* synthetic */ a(d dVar, int i13) {
        this.f125594a = i13;
        this.f125595b = dVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f125594a;
        d this$0 = this.f125595b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.f125603c.d(new of0.a(null));
                }
                this$0.f125609i = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.f125603c.d(new of0.a(null));
                    break;
                }
                break;
        }
    }
}
