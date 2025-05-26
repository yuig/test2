package jc0;

import android.content.Context;
import com.pinterest.component.modal.BaseModalViewWrapper;
import nx.f0;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public abstract class g extends BaseModalViewWrapper implements af2.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f75400k = 0;

    /* renamed from: l, reason: collision with root package name */
    public ye2.o f75401l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f75402m;

    public g(Context context) {
        super(context);
        t();
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f75400k) {
        }
        return s();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f75400k) {
        }
        return s().generatedComponent();
    }

    public final ye2.o s() {
        ye2.o oVar;
        ye2.o oVar2;
        int i13 = this.f75400k;
        switch (i13) {
            case 0:
                if (this.f75401l == null) {
                    switch (i13) {
                        case 0:
                            oVar = new ye2.o(this);
                            break;
                        default:
                            oVar = new ye2.o(this);
                            break;
                    }
                    this.f75401l = oVar;
                }
                break;
            default:
                if (this.f75401l == null) {
                    switch (i13) {
                        case 0:
                            oVar2 = new ye2.o(this);
                            break;
                        default:
                            oVar2 = new ye2.o(this);
                            break;
                    }
                    this.f75401l = oVar2;
                }
                break;
        }
        return this.f75401l;
    }

    public final void t() {
        switch (this.f75400k) {
            case 0:
                if (!this.f75402m) {
                    this.f75402m = true;
                    ((f) generatedComponent()).getClass();
                    break;
                }
                break;
            default:
                if (!this.f75402m) {
                    this.f75402m = true;
                    n nVar = (n) this;
                    oa oaVar = ((jb) ((o) generatedComponent())).f113483a;
                    nVar.f75422n = (m60.w) oaVar.f113885r0.get();
                    nVar.f75423o = (f0) oaVar.f113747j2.get();
                    break;
                }
                break;
        }
    }

    public g(Context context, int i13) {
        super(context, true);
        t();
    }
}
