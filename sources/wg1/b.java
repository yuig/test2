package wg1;

import androidx.cardview.widget.CardView;

/* loaded from: classes5.dex */
public abstract class b extends CardView implements af2.c {

    /* renamed from: h, reason: collision with root package name */
    public ye2.o f129720h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f129721i;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129720h == null) {
            this.f129720h = new ye2.o(this);
        }
        return this.f129720h;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129720h == null) {
            this.f129720h = new ye2.o(this);
        }
        return this.f129720h.generatedComponent();
    }
}
