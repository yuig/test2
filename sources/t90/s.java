package t90;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;

/* loaded from: classes5.dex */
public abstract class s extends MaskedImageView implements af2.c {

    /* renamed from: h, reason: collision with root package name */
    public ye2.o f116827h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f116828i;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.f116828i) {
            return;
        }
        this.f116828i = true;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f116827h == null) {
            this.f116827h = new ye2.o(this);
        }
        return this.f116827h;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f116827h == null) {
            this.f116827h = new ye2.o(this);
        }
        return this.f116827h.generatedComponent();
    }
}
