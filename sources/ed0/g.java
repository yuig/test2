package ed0;

import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes5.dex */
public final class g extends ConstraintLayout implements com.pinterest.creatorHub.feature.brandedContent.c, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f58511a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f58512b;

    /* renamed from: c, reason: collision with root package name */
    public dd0.c f58513c;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f58511a == null) {
            this.f58511a = new ye2.o(this);
        }
        return this.f58511a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f58511a == null) {
            this.f58511a = new ye2.o(this);
        }
        return this.f58511a.generatedComponent();
    }
}
