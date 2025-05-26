package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes3.dex */
public final class i1 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f18352b;

    public /* synthetic */ i1(Rect rect, int i13) {
        this.f18351a = i13;
        this.f18352b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i13 = this.f18351a;
        Rect rect = this.f18352b;
        switch (i13) {
            case 0:
                break;
            default:
                if (rect == null || rect.isEmpty()) {
                }
                break;
        }
        return rect;
    }
}
