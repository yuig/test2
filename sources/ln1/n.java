package ln1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import lh0.j1;
import lh0.z0;
import so.jb;

/* loaded from: classes5.dex */
public abstract class n extends LinearLayoutCompat implements af2.c {

    /* renamed from: p, reason: collision with root package name */
    public ye2.o f84050p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f84051q;

    public n(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f84051q) {
            return;
        }
        this.f84051q = true;
        jb jbVar = (jb) ((m) generatedComponent());
        jbVar.getClass();
        ((GestaltSpinner) this).f49597r = new j1((z0) jbVar.f113483a.D0.get());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84050p == null) {
            this.f84050p = new ye2.o(this);
        }
        return this.f84050p;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84050p == null) {
            this.f84050p = new ye2.o(this);
        }
        return this.f84050p.generatedComponent();
    }
}
