package fi0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f62204b;

    public /* synthetic */ a(c cVar, int i13) {
        this.f62203a = i13;
        this.f62204b = cVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f62203a;
        c this$0 = this.f62204b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.p3(com.bumptech.glide.c.a0(this$0.f62208a));
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean isBound = this$0.isBound();
                Boolean valueOf = Boolean.valueOf(isBound);
                if (!isBound) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    ep.b.C(null, ((ki0.c) ((ei0.a) this$0.getView())).f7());
                    break;
                }
                break;
        }
    }
}
