package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class v extends d implements MenuItem {

    /* renamed from: c */
    public final h5.b f88709c;

    /* renamed from: d */
    public Method f88710d;

    public v(Context context, h5.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f88709c = bVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f88709c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f88709c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        r a13 = this.f88709c.a();
        if (a13 instanceof r) {
            return a13.f88702b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f88709c.getActionView();
        return actionView instanceof s ? (View) ((s) actionView).f88704a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f88709c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f88709c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f88709c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f88709c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f88709c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f88709c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f88709c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f88709c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f88709c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f88709c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f88709c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f88709c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f88709c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f88709c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f88709c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f88709c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f88709c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f88709c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f88709c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f88709c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f88709c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f88709c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f88709c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        r rVar = new r(this, actionProvider);
        if (actionProvider == null) {
            rVar = null;
        }
        this.f88709c.b(rVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new s(view);
        }
        this.f88709c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c13) {
        this.f88709c.setAlphabeticShortcut(c13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z13) {
        this.f88709c.setCheckable(z13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z13) {
        this.f88709c.setChecked(z13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f88709c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z13) {
        this.f88709c.setEnabled(z13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f88709c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f88709c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f88709c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f88709c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c13) {
        this.f88709c.setNumericShortcut(c13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f88709c.setOnActionExpandListener(onActionExpandListener != null ? new t(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f88709c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new u(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c13, char c14) {
        this.f88709c.setShortcut(c13, c14);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i13) {
        this.f88709c.setShowAsAction(i13);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i13) {
        this.f88709c.setShowAsActionFlags(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f88709c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f88709c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f88709c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z13) {
        return this.f88709c.setVisible(z13);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c13, int i13) {
        this.f88709c.setAlphabeticShortcut(c13, i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i13) {
        this.f88709c.setIcon(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c13, int i13) {
        this.f88709c.setNumericShortcut(c13, i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c13, char c14, int i13, int i14) {
        this.f88709c.setShortcut(c13, c14, i13, i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i13) {
        this.f88709c.setTitle(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i13) {
        h5.b bVar = this.f88709c;
        bVar.setActionView(i13);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new s(actionView));
        }
        return this;
    }
}
