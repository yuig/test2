package androidx.appcompat.widget;

/* loaded from: classes2.dex */
public final class m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f16648b;

    public /* synthetic */ m1(ListPopupWindow listPopupWindow, int i13) {
        this.f16647a = i13;
        this.f16648b = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16647a;
        ListPopupWindow listPopupWindow = this.f16648b;
        switch (i13) {
            case 1:
                j1 j1Var = listPopupWindow.f16374c;
                if (j1Var != null) {
                    j1Var.f16611h = true;
                    j1Var.requestLayout();
                    break;
                }
                break;
            default:
                j1 j1Var2 = listPopupWindow.f16374c;
                if (j1Var2 != null && j1Var2.isAttachedToWindow() && listPopupWindow.f16374c.getCount() > listPopupWindow.f16374c.getChildCount() && listPopupWindow.f16374c.getChildCount() <= listPopupWindow.f16384m) {
                    listPopupWindow.f16397z.setInputMethodMode(2);
                    listPopupWindow.k();
                    break;
                }
                break;
        }
    }
}
