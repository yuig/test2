package nr0;

import com.pinterest.api.model.f30;
import qa2.d0;

/* loaded from: classes.dex */
public final class b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public d f91865a;

    @Override // qa2.d0
    public final void onOpenPinCloseup(f30 f30Var) {
        d dVar = this.f91865a;
        if (dVar != null) {
            dVar.onPinClicked(f30Var);
        }
    }
}
