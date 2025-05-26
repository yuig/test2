package xi0;

import android.widget.GridLayout;
import ye2.o;

/* loaded from: classes5.dex */
public abstract class k extends GridLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f135023a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f135024b;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f135023a == null) {
            this.f135023a = new o(this);
        }
        return this.f135023a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f135023a == null) {
            this.f135023a = new o(this);
        }
        return this.f135023a.generatedComponent();
    }
}
