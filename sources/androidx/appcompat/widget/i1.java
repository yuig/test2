package androidx.appcompat.widget;

import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16598b;

    public /* synthetic */ i1(ViewGroup viewGroup, int i13) {
        this.f16597a = i13;
        this.f16598b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16597a;
        ViewGroup viewGroup = this.f16598b;
        switch (i13) {
            case 0:
                j1 j1Var = (j1) viewGroup;
                j1Var.f16615l = null;
                j1Var.drawableStateChanged();
                break;
            default:
                ((Toolbar) viewGroup).F();
                break;
        }
    }
}
