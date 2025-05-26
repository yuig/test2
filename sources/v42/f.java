package v42;

import com.google.android.material.card.MaterialCardView;
import ye2.o;

/* loaded from: classes4.dex */
public abstract class f extends MaterialCardView implements af2.c {

    /* renamed from: p, reason: collision with root package name */
    public o f124140p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f124141q;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f124140p == null) {
            this.f124140p = new o(this);
        }
        return this.f124140p;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f124140p == null) {
            this.f124140p = new o(this);
        }
        return this.f124140p.generatedComponent();
    }
}
