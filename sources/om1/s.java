package om1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes2.dex */
public abstract class s extends LinearLayoutCompat implements af2.c {

    /* renamed from: p, reason: collision with root package name */
    public ye2.o f96686p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f96687q;

    public s(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f96687q) {
            return;
        }
        this.f96687q = true;
        ((r) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f96686p == null) {
            this.f96686p = new ye2.o(this);
        }
        return this.f96686p;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f96686p == null) {
            this.f96686p = new ye2.o(this);
        }
        return this.f96686p.generatedComponent();
    }
}
