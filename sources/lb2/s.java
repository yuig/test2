package lb2;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f82812b;

    public /* synthetic */ s(x xVar, int i13) {
        this.f82811a = i13;
        this.f82812b = xVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f82811a;
        x this$0 = this.f82812b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0.v(this$0.f82824c, f1.USER_DISABLE_FACBOOK, "0", false, 12);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                b60.d dVar = (b60.d) this$0.f82835n;
                lb0.m c13 = ((lb0.b) dVar.f22011a).c();
                c13.clear();
                c13.apply();
                dVar.f22014d.c("\u0000");
                dVar.f22013c = null;
                c60.d.f26516d = null;
                lb0.b bVar = (lb0.b) lb0.n.f82725d.a();
                bVar.k("PREF_ACCESSTOKEN");
                bVar.k("PREF_V5_ACCESS_TOKEN");
                bVar.k("PREF_V5_REFRESH_TOKEN");
                break;
        }
    }
}
