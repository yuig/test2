package wg1;

import androidx.cardview.widget.CardView;

/* loaded from: classes5.dex */
public abstract class c extends CardView implements af2.c {

    /* renamed from: h, reason: collision with root package name */
    public ye2.o f129732h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f129733i;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129732h == null) {
            this.f129732h = new ye2.o(this);
        }
        return this.f129732h;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129732h == null) {
            this.f129732h = new ye2.o(this);
        }
        return this.f129732h.generatedComponent();
    }
}
