package androidx.appcompat.widget;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f16542b;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i13) {
        this.f16541a = i13;
        this.f16542b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16541a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f16542b;
        switch (i13) {
            case 0:
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.f16245w = actionBarOverlayLayout.f16226d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f16246x);
                break;
            default:
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.f16245w = actionBarOverlayLayout.f16226d.animate().translationY(-actionBarOverlayLayout.f16226d.getHeight()).setListener(actionBarOverlayLayout.f16246x);
                break;
        }
    }
}
