package bq0;

import kotlin.jvm.internal.Intrinsics;
import mp.r;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23681b;

    public b(d dVar, int i13) {
        this.f23680a = i13;
        this.f23681b = dVar;
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ void c(n nVar, Object obj, int i13) {
        switch (this.f23680a) {
            case 0:
                h((r) nVar, (i) obj);
                break;
            default:
                h((r) nVar, (i) obj);
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f23680a;
        switch (i14) {
            case 0:
                i model = (i) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            default:
                i model2 = (i) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
        }
        return null;
    }

    public final void h(r view, i model) {
        int i13 = this.f23680a;
        d dVar = this.f23681b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.a(model, dVar.f23683k, dVar.f23684l, dVar.f23685m);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.a(model, dVar.f23683k, dVar.f23684l, dVar.f23685m);
                break;
        }
    }
}
