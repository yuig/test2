package g6;

import android.view.Choreographer;
import c0.s0;

/* loaded from: classes3.dex */
public final class c extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final Choreographer f63648b;

    /* renamed from: c, reason: collision with root package name */
    public final b f63649c;

    public c(t5.e eVar) {
        super(eVar);
        this.f63648b = Choreographer.getInstance();
        this.f63649c = new b(this);
    }

    public final void q() {
        this.f63648b.postFrameCallback(this.f63649c);
    }
}
