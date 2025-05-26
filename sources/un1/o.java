package un1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes5.dex */
public abstract class o extends AppCompatTextView implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f122913a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122914b;

    public o(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f122914b) {
            return;
        }
        this.f122914b = true;
        ((n) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f122913a == null) {
            this.f122913a = new ye2.o(this);
        }
        return this.f122913a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f122913a == null) {
            this.f122913a = new ye2.o(this);
        }
        return this.f122913a.generatedComponent();
    }
}
