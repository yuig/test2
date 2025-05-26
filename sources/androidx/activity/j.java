package androidx.activity;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f15909a;

    public j(o oVar) {
        this.f15909a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e13) {
            if (!TextUtils.equals(e13.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e13;
            }
        } catch (NullPointerException e14) {
            if (!TextUtils.equals(e14.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e14;
            }
        }
    }
}
