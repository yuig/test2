package xv;

import android.content.Context;
import android.widget.FrameLayout;
import ye2.o;

/* loaded from: classes3.dex */
public abstract class j extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136015a;

    /* renamed from: b, reason: collision with root package name */
    public o f136016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i13) {
        super(context);
        this.f136015a = i13;
        if (i13 != 1) {
            b();
        } else {
            super(context);
            b();
        }
    }

    public final o a() {
        o oVar;
        o oVar2;
        int i13 = this.f136015a;
        switch (i13) {
            case 0:
                if (this.f136016b == null) {
                    switch (i13) {
                        case 0:
                            oVar = new o(this);
                            break;
                        default:
                            oVar = new o(this);
                            break;
                    }
                    this.f136016b = oVar;
                }
                break;
            default:
                if (this.f136016b == null) {
                    switch (i13) {
                        case 0:
                            oVar2 = new o(this);
                            break;
                        default:
                            oVar2 = new o(this);
                            break;
                    }
                    this.f136016b = oVar2;
                }
                break;
        }
        return this.f136016b;
    }

    public abstract void b();

    @Override // af2.c
    public final /* bridge */ /* synthetic */ af2.b componentManager() {
        switch (this.f136015a) {
        }
        return a();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f136015a) {
        }
        return a().generatedComponent();
    }
}
