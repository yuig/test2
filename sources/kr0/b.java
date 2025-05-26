package kr0;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.repository.pin.PinService;
import m60.q;
import m60.w;
import ye2.o;

/* loaded from: classes5.dex */
public final class b extends ConstraintLayout implements af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f80759f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f80760a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f80761b;

    /* renamed from: c, reason: collision with root package name */
    public w f80762c;

    /* renamed from: d, reason: collision with root package name */
    public q f80763d;

    /* renamed from: e, reason: collision with root package name */
    public PinService f80764e;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f80760a == null) {
            this.f80760a = new o(this);
        }
        return this.f80760a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f80760a == null) {
            this.f80760a = new o(this);
        }
        return this.f80760a.generatedComponent();
    }
}
