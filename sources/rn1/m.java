package rn1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public abstract class m extends AppCompatTextView implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f108907a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f108908b;

    public m(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (this.f108908b) {
            return;
        }
        this.f108908b = true;
        ((l) generatedComponent()).getClass();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f108907a == null) {
            this.f108907a = new ye2.o(this);
        }
        return this.f108907a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f108907a == null) {
            this.f108907a = new ye2.o(this);
        }
        return this.f108907a.generatedComponent();
    }
}
