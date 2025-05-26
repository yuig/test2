package n;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
public final class a implements h5.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f88543a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f88544b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f88545c;

    /* renamed from: d, reason: collision with root package name */
    public char f88546d;

    /* renamed from: f, reason: collision with root package name */
    public char f88548f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f88550h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f88551i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f88552j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f88553k;

    /* renamed from: e, reason: collision with root package name */
    public int f88547e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f88549g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f88554l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f88555m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f88556n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f88557o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f88558p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f88551i = context;
        this.f88543a = charSequence;
    }

    @Override // h5.b
    public final r a() {
        return null;
    }

    @Override // h5.b
    public final h5.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f88550h;
        if (drawable != null) {
            if (this.f88556n || this.f88557o) {
                this.f88550h = drawable;
                Drawable mutate = drawable.mutate();
                this.f88550h = mutate;
                if (this.f88556n) {
                    mutate.setTintList(this.f88554l);
                }
                if (this.f88557o) {
                    this.f88550h.setTintMode(this.f88555m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // h5.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f88549g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f88548f;
    }

    @Override // h5.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f88552j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f88550h;
    }

    @Override // h5.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f88554l;
    }

    @Override // h5.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f88555m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f88545c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h5.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f88547e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f88546d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f88543a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f88544b;
        return charSequence != null ? charSequence : this.f88543a;
    }

    @Override // h5.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f88553k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f88558p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f88558p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f88558p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f88558p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c13) {
        this.f88548f = Character.toLowerCase(c13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z13) {
        this.f88558p = (z13 ? 1 : 0) | (this.f88558p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z13) {
        this.f88558p = (z13 ? 2 : 0) | (this.f88558p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f88552j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z13) {
        this.f88558p = (z13 ? 16 : 0) | (this.f88558p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f88550h = drawable;
        c();
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f88554l = colorStateList;
        this.f88556n = true;
        c();
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f88555m = mode;
        this.f88557o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f88545c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c13) {
        this.f88546d = c13;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c13, char c14) {
        this.f88546d = c13;
        this.f88548f = Character.toLowerCase(c14);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i13) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i13) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f88543a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f88544b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f88553k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z13) {
        this.f88558p = (this.f88558p & 8) | (z13 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c13, int i13) {
        this.f88548f = Character.toLowerCase(c13);
        this.f88549g = KeyEvent.normalizeMetaState(i13);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final h5.b setContentDescription(CharSequence charSequence) {
        this.f88552j = charSequence;
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c13, int i13) {
        this.f88546d = c13;
        this.f88547e = KeyEvent.normalizeMetaState(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i13) {
        this.f88543a = this.f88551i.getResources().getString(i13);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final h5.b setTooltipText(CharSequence charSequence) {
        this.f88553k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i13) {
        Object obj = d5.a.f53679a;
        this.f88550h = this.f88551i.getDrawable(i13);
        c();
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setShortcut(char c13, char c14, int i13, int i14) {
        this.f88546d = c13;
        this.f88547e = KeyEvent.normalizeMetaState(i13);
        this.f88548f = Character.toLowerCase(c14);
        this.f88549g = KeyEvent.normalizeMetaState(i14);
        return this;
    }
}
