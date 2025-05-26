package ua;

import a.bb;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class h0 extends bb {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f121260q;

    @Override // ua.j0
    public final float a(View view, ViewGroup viewGroup) {
        switch (this.f121260q) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }
}
