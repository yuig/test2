package yl1;

import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import ye2.o;

/* loaded from: classes2.dex */
public abstract class n extends AppCompatButton implements af2.c {

    /* renamed from: d, reason: collision with root package name */
    public o f139358d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139359e;

    public n(m.e eVar, AttributeSet attributeSet, int i13) {
        super(eVar, attributeSet, i13);
        if (this.f139359e) {
            return;
        }
        this.f139359e = true;
        ((m) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f139358d == null) {
            this.f139358d = new o(this);
        }
        return this.f139358d;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f139358d == null) {
            this.f139358d = new o(this);
        }
        return this.f139358d.generatedComponent();
    }
}
