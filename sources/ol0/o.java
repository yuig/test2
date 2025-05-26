package ol0;

import com.pinterest.api.model.f30;
import ml0.t0;

/* loaded from: classes5.dex */
public final class o implements s42.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vq0.h f96413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl1.s f96414c;

    public /* synthetic */ o(vq0.h hVar, dl1.s sVar, int i13) {
        this.f96412a = i13;
        this.f96413b = hVar;
        this.f96414c = sVar;
    }

    @Override // s42.d
    public final void b() {
        int i13 = this.f96412a;
        dl1.s sVar = this.f96414c;
        vq0.h hVar = this.f96413b;
        switch (i13) {
            case 0:
                ((p) hVar).f96417c.invoke((t0) sVar);
                break;
            case 1:
                ((s42.k) ((yi0.a) hVar).f139069c).z0((f30) sVar);
                break;
            default:
                ((p) hVar).f96417c.invoke((r52.a) sVar);
                break;
        }
    }
}
