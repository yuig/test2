package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes2.dex */
public final class e0 implements j0, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.k f16543a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f16544b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f16545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f16546d;

    public e0(AppCompatSpinner appCompatSpinner) {
        this.f16546d = appCompatSpinner;
    }

    @Override // androidx.appcompat.widget.j0
    public final boolean a() {
        androidx.appcompat.app.k kVar = this.f16543a;
        if (kVar != null) {
            return kVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.j0
    public final int b() {
        return 0;
    }

    @Override // androidx.appcompat.widget.j0
    public final void c(int i13) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.j0
    public final CharSequence d() {
        return this.f16545c;
    }

    @Override // androidx.appcompat.widget.j0
    public final void dismiss() {
        androidx.appcompat.app.k kVar = this.f16543a;
        if (kVar != null) {
            kVar.dismiss();
            this.f16543a = null;
        }
    }

    @Override // androidx.appcompat.widget.j0
    public final void e(CharSequence charSequence) {
        this.f16545c = charSequence;
    }

    @Override // androidx.appcompat.widget.j0
    public final void f(int i13) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.j0
    public final void g(int i13) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.j0
    public final Drawable getBackground() {
        return null;
    }

    @Override // androidx.appcompat.widget.j0
    public final void h(int i13, int i14) {
        if (this.f16544b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f16546d;
        androidx.appcompat.app.j jVar = new androidx.appcompat.app.j(appCompatSpinner.f16320b);
        CharSequence charSequence = this.f16545c;
        if (charSequence != null) {
            jVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.f16544b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        androidx.appcompat.app.f fVar = jVar.f16054a;
        fVar.f16010k = listAdapter;
        fVar.f16011l = this;
        fVar.f16014o = selectedItemPosition;
        fVar.f16013n = true;
        androidx.appcompat.app.k create = jVar.create();
        this.f16543a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f16058f.f16031f;
        alertController$RecycleListView.setTextDirection(i13);
        alertController$RecycleListView.setTextAlignment(i14);
        this.f16543a.show();
    }

    @Override // androidx.appcompat.widget.j0
    public final int i() {
        return 0;
    }

    @Override // androidx.appcompat.widget.j0
    public final void j(ListAdapter listAdapter) {
        this.f16544b = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        AppCompatSpinner appCompatSpinner = this.f16546d;
        appCompatSpinner.setSelection(i13);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i13, this.f16544b.getItemId(i13));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.j0
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
