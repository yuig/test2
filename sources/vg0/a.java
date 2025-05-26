package vg0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ui.components.banners.LegoBannerView;
import so.jb;
import so.oa;
import ye2.o;

/* loaded from: classes5.dex */
public abstract class a extends LegoBannerView implements af2.c {
    public o B;
    public boolean C;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.B == null) {
            this.B = new o(this);
        }
        return this.B;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.B == null) {
            this.B = new o(this);
        }
        return this.B.generatedComponent();
    }

    public final void t0() {
        if (this.C) {
            return;
        }
        this.C = true;
        jb jbVar = (jb) ((c) generatedComponent());
        oa oaVar = jbVar.f113483a;
    }

    public a(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        t0();
    }
}
