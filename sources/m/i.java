package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.d0;

/* loaded from: classes2.dex */
public final class i extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f85201a;

    /* renamed from: b, reason: collision with root package name */
    public final c f85202b;

    public i(Context context, c cVar) {
        this.f85201a = context;
        this.f85202b = cVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f85202b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f85202b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new d0(this.f85201a, this.f85202b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f85202b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f85202b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f85202b.f85181a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f85202b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f85202b.f85182b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f85202b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f85202b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f85202b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f85202b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f85202b.f85181a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f85202b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z13) {
        this.f85202b.o(z13);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i13) {
        this.f85202b.k(i13);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i13) {
        this.f85202b.m(i13);
    }
}
