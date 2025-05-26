package yk1;

import android.view.View;

/* loaded from: classes2.dex */
public final class j implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static j f139228a;

    public static j a() {
        if (f139228a == null) {
            f139228a = new j();
        }
        return f139228a;
    }

    public static m b(View view) {
        Object tag = view.getTag(s.mvp_presenter);
        if (tag instanceof m) {
            return (m) tag;
        }
        StringBuilder sb3 = new StringBuilder("View tag is not a MvpPresenter, tag is ");
        sb3.append(tag == null ? "null" : tag.toString());
        throw new IllegalStateException(sb3.toString());
    }

    public static m c(View view) {
        Object tag = view.getTag(s.mvp_presenter);
        if (tag instanceof m) {
            return (m) tag;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(View view, m mVar) {
        view.setTag(s.mvp_presenter, mVar);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            if (!(view instanceof n)) {
                throw new IllegalStateException("View must implement MVP View");
            }
            n nVar = (n) view;
            if (mVar.isBound()) {
                return;
            }
            mVar.bind(nVar);
            mVar.activate();
        }
    }

    public final void e(View view) {
        m c13;
        if (view.isAttachedToWindow() && (c13 = c(view)) != null && c13.isBound()) {
            c13.deactivate();
            c13.unbind();
        }
        view.removeOnAttachStateChangeListener(this);
        view.setTag(s.mvp_presenter, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!(view instanceof n)) {
            throw new IllegalStateException("View must implement MVP View");
        }
        n nVar = (n) view;
        m b13 = b(view);
        if (b13.isBound()) {
            return;
        }
        b13.bind(nVar);
        b13.activate();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m c13 = c(view);
        if (c13 == null || !c13.isBound()) {
            return;
        }
        c13.deactivate();
        c13.unbind();
    }
}
