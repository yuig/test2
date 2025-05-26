package mf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f87109b;

    public /* synthetic */ h(i iVar, int i13) {
        this.f87108a = i13;
        this.f87109b = iVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f87108a;
        i this$0 = this.f87109b;
        switch (i13) {
            case 0:
                int i14 = i.f87110i0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    Function0 function0 = this$0.f87111c0;
                    if (function0 != null) {
                    }
                    this$0.N6(false, false);
                    break;
                }
                break;
            default:
                int i15 = i.f87110i0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$0.N6(false, false);
                    break;
                }
                break;
        }
    }
}
