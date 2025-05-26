package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class q implements h5.b {
    public r A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a */
    public final int f88675a;

    /* renamed from: b */
    public final int f88676b;

    /* renamed from: c */
    public final int f88677c;

    /* renamed from: d */
    public final int f88678d;

    /* renamed from: e */
    public CharSequence f88679e;

    /* renamed from: f */
    public CharSequence f88680f;

    /* renamed from: g */
    public Intent f88681g;

    /* renamed from: h */
    public char f88682h;

    /* renamed from: j */
    public char f88684j;

    /* renamed from: l */
    public Drawable f88686l;

    /* renamed from: n */
    public final o f88688n;

    /* renamed from: o */
    public g0 f88689o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f88690p;

    /* renamed from: q */
    public CharSequence f88691q;

    /* renamed from: r */
    public CharSequence f88692r;

    /* renamed from: y */
    public int f88699y;

    /* renamed from: z */
    public View f88700z;

    /* renamed from: i */
    public int f88683i = 4096;

    /* renamed from: k */
    public int f88685k = 4096;

    /* renamed from: m */
    public int f88687m = 0;

    /* renamed from: s */
    public ColorStateList f88693s = null;

    /* renamed from: t */
    public PorterDuff.Mode f88694t = null;

    /* renamed from: u */
    public boolean f88695u = false;

    /* renamed from: v */
    public boolean f88696v = false;

    /* renamed from: w */
    public boolean f88697w = false;

    /* renamed from: x */
    public int f88698x = 16;
    public boolean C = false;

    public q(o oVar, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17) {
        this.f88688n = oVar;
        this.f88675a = i14;
        this.f88676b = i13;
        this.f88677c = i15;
        this.f88678d = i16;
        this.f88679e = charSequence;
        this.f88699y = i17;
    }

    public static void c(int i13, int i14, String str, StringBuilder sb3) {
        if ((i13 & i14) == i14) {
            sb3.append(str);
        }
    }

    @Override // h5.b
    public final r a() {
        return this.A;
    }

    @Override // h5.b
    public final h5.b b(r rVar) {
        this.f88700z = null;
        this.A = rVar;
        this.f88688n.q(true);
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.f88701a = new gc.c(this, 4);
            rVar2.f88702b.setVisibilityListener(rVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f88699y & 8) == 0) {
            return false;
        }
        if (this.f88700z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f88688n.e(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f88697w && (this.f88695u || this.f88696v)) {
            drawable = drawable.mutate();
            if (this.f88695u) {
                drawable.setTintList(this.f88693s);
            }
            if (this.f88696v) {
                drawable.setTintMode(this.f88694t);
            }
            this.f88697w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f88699y & 8) == 0) {
            return false;
        }
        if (this.f88700z == null && (rVar = this.A) != null) {
            this.f88700z = rVar.f88702b.onCreateActionView(this);
        }
        return this.f88700z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f88688n.g(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f88698x & 32) == 32;
    }

    public final void g(boolean z13) {
        this.f88698x = (z13 ? 4 : 0) | (this.f88698x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f88700z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar == null) {
            return null;
        }
        View onCreateActionView = rVar.f88702b.onCreateActionView(this);
        this.f88700z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // h5.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f88685k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f88684j;
    }

    @Override // h5.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f88691q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f88676b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f88686l;
        if (drawable != null) {
            return d(drawable);
        }
        int i13 = this.f88687m;
        if (i13 == 0) {
            return null;
        }
        Drawable I = com.bumptech.glide.c.I(this.f88688n.f88648a, i13);
        this.f88687m = 0;
        this.f88686l = I;
        return d(I);
    }

    @Override // h5.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f88693s;
    }

    @Override // h5.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f88694t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f88681g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f88675a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h5.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f88683i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f88682h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f88677c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f88689o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f88679e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f88680f;
        return charSequence != null ? charSequence : this.f88679e;
    }

    @Override // h5.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f88692r;
    }

    public final void h(boolean z13) {
        if (z13) {
            this.f88698x |= 32;
        } else {
            this.f88698x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f88689o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f88698x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f88698x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f88698x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.A;
        return (rVar == null || !rVar.f88702b.overridesItemVisibility()) ? (this.f88698x & 8) == 0 : (this.f88698x & 8) == 0 && this.A.f88702b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i13;
        this.f88700z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i13 = this.f88675a) > 0) {
            view.setId(i13);
        }
        o oVar = this.f88688n;
        oVar.f88658k = true;
        oVar.q(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c13) {
        if (this.f88684j == c13) {
            return this;
        }
        this.f88684j = Character.toLowerCase(c13);
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z13) {
        int i13 = this.f88698x;
        int i14 = (z13 ? 1 : 0) | (i13 & (-2));
        this.f88698x = i14;
        if (i13 != i14) {
            this.f88688n.q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z13) {
        int i13 = this.f88698x;
        if ((i13 & 4) != 0) {
            o oVar = this.f88688n;
            oVar.getClass();
            ArrayList arrayList = oVar.f88653f;
            int size = arrayList.size();
            oVar.B();
            for (int i14 = 0; i14 < size; i14++) {
                q qVar = (q) arrayList.get(i14);
                if (qVar.f88676b == this.f88676b && (qVar.f88698x & 4) != 0 && qVar.isCheckable()) {
                    boolean z14 = qVar == this;
                    int i15 = qVar.f88698x;
                    int i16 = (z14 ? 2 : 0) | (i15 & (-3));
                    qVar.f88698x = i16;
                    if (i15 != i16) {
                        qVar.f88688n.q(false);
                    }
                }
            }
            oVar.A();
        } else {
            int i17 = (i13 & (-3)) | (z13 ? 2 : 0);
            this.f88698x = i17;
            if (i13 != i17) {
                this.f88688n.q(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z13) {
        if (z13) {
            this.f88698x |= 16;
        } else {
            this.f88698x &= -17;
        }
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i13) {
        this.f88686l = null;
        this.f88687m = i13;
        this.f88697w = true;
        this.f88688n.q(false);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f88693s = colorStateList;
        this.f88695u = true;
        this.f88697w = true;
        this.f88688n.q(false);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f88694t = mode;
        this.f88696v = true;
        this.f88697w = true;
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f88681g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c13) {
        if (this.f88682h == c13) {
            return this;
        }
        this.f88682h = c13;
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f88690p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c13, char c14) {
        this.f88682h = c13;
        this.f88684j = Character.toLowerCase(c14);
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i13) {
        int i14 = i13 & 3;
        if (i14 != 0 && i14 != 1 && i14 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f88699y = i13;
        o oVar = this.f88688n;
        oVar.f88658k = true;
        oVar.q(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i13) {
        setShowAsAction(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f88679e = charSequence;
        this.f88688n.q(false);
        g0 g0Var = this.f88689o;
        if (g0Var != null) {
            g0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f88680f = charSequence;
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z13) {
        int i13 = this.f88698x;
        int i14 = (z13 ? 0 : 8) | (i13 & (-9));
        this.f88698x = i14;
        if (i13 != i14) {
            o oVar = this.f88688n;
            oVar.f88655h = true;
            oVar.q(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f88679e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // h5.b, android.view.MenuItem
    public final h5.b setContentDescription(CharSequence charSequence) {
        this.f88691q = charSequence;
        this.f88688n.q(false);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final h5.b setTooltipText(CharSequence charSequence) {
        this.f88692r = charSequence;
        this.f88688n.q(false);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c13, int i13) {
        if (this.f88684j == c13 && this.f88685k == i13) {
            return this;
        }
        this.f88684j = Character.toLowerCase(c13);
        this.f88685k = KeyEvent.normalizeMetaState(i13);
        this.f88688n.q(false);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c13, int i13) {
        if (this.f88682h == c13 && this.f88683i == i13) {
            return this;
        }
        this.f88682h = c13;
        this.f88683i = KeyEvent.normalizeMetaState(i13);
        this.f88688n.q(false);
        return this;
    }

    @Override // h5.b, android.view.MenuItem
    public final MenuItem setShortcut(char c13, char c14, int i13, int i14) {
        this.f88682h = c13;
        this.f88683i = KeyEvent.normalizeMetaState(i13);
        this.f88684j = Character.toLowerCase(c14);
        this.f88685k = KeyEvent.normalizeMetaState(i14);
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i13) {
        setTitle(this.f88688n.f88648a.getString(i13));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f88687m = 0;
        this.f88686l = drawable;
        this.f88697w = true;
        this.f88688n.q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i13) {
        int i14;
        Context context = this.f88688n.f88648a;
        View inflate = LayoutInflater.from(context).inflate(i13, (ViewGroup) new LinearLayout(context), false);
        this.f88700z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i14 = this.f88675a) > 0) {
            inflate.setId(i14);
        }
        o oVar = this.f88688n;
        oVar.f88658k = true;
        oVar.q(true);
        return this;
    }
}
