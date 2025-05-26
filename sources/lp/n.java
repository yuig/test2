package lp;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class n extends View implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f84228a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84229b;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84228a == null) {
            this.f84228a = new ye2.o(this);
        }
        return this.f84228a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84228a == null) {
            this.f84228a = new ye2.o(this);
        }
        return this.f84228a.generatedComponent();
    }
}
