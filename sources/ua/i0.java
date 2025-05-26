package ua;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class i0 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f121265r;

    public i0(int i13) {
        this.f121265r = i13;
    }

    @Override // ua.j0
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.f121265r) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
