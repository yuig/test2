package ed1;

import android.content.ClipboardManager;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements ClipboardManager.OnPrimaryClipChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk1.b f58669b;

    public /* synthetic */ o(yk1.b bVar, int i13) {
        this.f58668a = i13;
        this.f58669b = bVar;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        int i13 = this.f58668a;
        int i14 = 1;
        yk1.b bVar = this.f58669b;
        switch (i13) {
            case 0:
                q this$0 = (q) bVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                gs1.d dVar = (gs1.d) this$0.E;
                xj2.c o13 = (dVar.f66080a == null ? uj2.b0.j(Optional.empty()) : new kk2.c(new gs1.c(dVar, 1), 0)).r(tk2.e.f118017c).l(wj2.c.a()).o(new g(6, new n(this$0, i14)), new g(7, c.f58548t));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                this$0.addDisposable(o13);
                break;
            default:
                f0 this$02 = (f0) bVar;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                gs1.d dVar2 = (gs1.d) this$02.D;
                xj2.c o14 = (dVar2.f66080a == null ? uj2.b0.j(Optional.empty()) : new kk2.c(new gs1.c(dVar2, 1), 0)).r(tk2.e.f118017c).l(wj2.c.a()).o(new g(16, new d0(this$02, i14)), new g(17, c.A));
                Intrinsics.checkNotNullExpressionValue(o14, "subscribe(...)");
                this$02.addDisposable(o14);
                break;
        }
    }
}
