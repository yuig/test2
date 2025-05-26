package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements dl1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131504a;

    public /* synthetic */ v(int i13) {
        this.f131504a = i13;
    }

    @Override // dl1.z
    public final boolean a(dl1.m mVar, dl1.a action) {
        int i13 = this.f131504a;
        switch (i13) {
            case 0:
                break;
            case 1:
                dl1.u params = (dl1.u) mVar;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action == dl1.a.READ) {
                            break;
                        }
                        break;
                }
            default:
                dl1.u params2 = (dl1.u) mVar;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action == dl1.a.READ) {
                            break;
                        }
                        break;
                }
        }
        return true;
    }

    @Override // dl1.z
    public final boolean b(dl1.m mVar, dl1.a action) {
        int i13 = this.f131504a;
        switch (i13) {
            case 0:
                w wVar = (w) mVar;
                int i14 = wVar.f131491c;
                if (i14 == 4 || i14 == 2 || i14 == 3 || wVar.f131510g) {
                    break;
                }
                break;
            case 1:
                dl1.u params = (dl1.u) mVar;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        break;
                }
            default:
                dl1.u params2 = (dl1.u) mVar;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(action, "action");
                        break;
                }
        }
        return true;
    }
}
