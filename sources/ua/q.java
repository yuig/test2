package ua;

import android.graphics.Rect;

/* loaded from: classes3.dex */
public final class q extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f121341r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Rect f121342s;

    public q(Rect rect, int i13) {
        this.f121341r = i13;
        this.f121342s = rect;
    }

    @Override // ua.k0
    public final Rect g() {
        int i13 = this.f121341r;
        Rect rect = this.f121342s;
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
