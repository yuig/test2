package ao1;

import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import ye2.o;

/* loaded from: classes2.dex */
public abstract class k extends ConstraintLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f20106a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20107b;

    public k(m.e eVar, AttributeSet attributeSet, int i13) {
        super(eVar, attributeSet, i13);
        if (this.f20107b) {
            return;
        }
        this.f20107b = true;
        ((j) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f20106a == null) {
            this.f20106a = new o(this);
        }
        return this.f20106a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f20106a == null) {
            this.f20106a = new o(this);
        }
        return this.f20106a.generatedComponent();
    }
}
