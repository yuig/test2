package ww0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.design.brio.widget.LegacyLinearLayout;
import com.pinterest.feature.minicell.view.PinMiniCellView;
import kh2.b0;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public abstract class a extends LegacyLinearLayout implements af2.c {

    /* renamed from: c */
    public o f131185c;

    /* renamed from: d */
    public boolean f131186d;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public final void b() {
        if (this.f131186d) {
            return;
        }
        this.f131186d = true;
        b0.C0((PinMiniCellView) this, (b60.b) ((jb) ((f) generatedComponent())).f113483a.f113850p0.get());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f131185c == null) {
            this.f131185c = new o(this);
        }
        return this.f131185c;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f131185c == null) {
            this.f131185c = new o(this);
        }
        return this.f131185c.generatedComponent();
    }

    public a(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        b();
    }
}
