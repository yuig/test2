package sf1;

import android.content.Context;
import com.pinterest.design.widget.RoundedCornersLayout;
import so.jb;
import so.oa;
import so.va;

/* loaded from: classes5.dex */
public abstract class e extends RoundedCornersLayout implements af2.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112541f;

    /* renamed from: g, reason: collision with root package name */
    public ye2.o f112542g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f112543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i13) {
        super(context);
        this.f112541f = i13;
        if (i13 != 1) {
            j();
        } else {
            super(context);
            j();
        }
    }

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f112541f) {
        }
        return i();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f112541f) {
        }
        return i().generatedComponent();
    }

    public final ye2.o i() {
        ye2.o oVar;
        ye2.o oVar2;
        int i13 = this.f112541f;
        switch (i13) {
            case 0:
                if (this.f112542g == null) {
                    switch (i13) {
                        case 0:
                            oVar = new ye2.o(this);
                            break;
                        default:
                            oVar = new ye2.o(this);
                            break;
                    }
                    this.f112542g = oVar;
                }
                break;
            default:
                if (this.f112542g == null) {
                    switch (i13) {
                        case 0:
                            oVar2 = new ye2.o(this);
                            break;
                        default:
                            oVar2 = new ye2.o(this);
                            break;
                    }
                    this.f112542g = oVar2;
                }
                break;
        }
        return this.f112542g;
    }

    public final void j() {
        switch (this.f112541f) {
            case 0:
                if (!this.f112543h) {
                    this.f112543h = true;
                    s1 s1Var = (s1) this;
                    jb jbVar = (jb) ((t1) generatedComponent());
                    oa oaVar = jbVar.f113483a;
                    s1Var.f112734l = (uk1.e) oaVar.f113702ga.get();
                    s1Var.f112735m = (va) jbVar.f113507y.get();
                    s1Var.f112736n = jbVar.c();
                    s1Var.f112737o = (yk1.j) oaVar.Qc.get();
                    s1Var.f112738p = (a11.d) oaVar.f113668ec.get();
                    break;
                }
                break;
            default:
                if (!this.f112543h) {
                    this.f112543h = true;
                    ((ab2.q) generatedComponent()).getClass();
                    break;
                }
                break;
        }
    }
}
