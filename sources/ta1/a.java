package ta1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f116925b;

    public /* synthetic */ a(f fVar, int i13) {
        this.f116924a = i13;
        this.f116925b = fVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f116924a;
        f this$0 = this.f116925b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((ua1.d) ((ra1.a) this$0.getView())).V8(false);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((ua1.d) ((ra1.a) this$0.getView())).V8(false);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    ((ua1.d) ((ra1.a) this$0.getView())).V8(false);
                    break;
                }
                break;
        }
    }
}
