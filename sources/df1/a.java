package df1;

import af2.c;
import android.widget.LinearLayout;
import ye2.o;

/* loaded from: classes5.dex */
public final class a extends LinearLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f54893a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f54894b;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f54893a == null) {
            this.f54893a = new o(this);
        }
        return this.f54893a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f54893a == null) {
            this.f54893a = new o(this);
        }
        return this.f54893a.generatedComponent();
    }
}
