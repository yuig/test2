package on1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.ModifiedSwitchCompat;

/* loaded from: classes5.dex */
public abstract class u extends ModifiedSwitchCompat implements af2.c {
    public ye2.o H;
    public final boolean I;

    public u(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.I) {
            return;
        }
        this.I = true;
        ((t) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.H == null) {
            this.H = new ye2.o(this);
        }
        return this.H;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.H == null) {
            this.H = new ye2.o(this);
        }
        return this.H.generatedComponent();
    }
}
