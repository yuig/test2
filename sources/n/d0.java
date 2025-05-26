package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import g1.o0;

/* loaded from: classes2.dex */
public class d0 extends d implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final h5.a f88572c;

    public d0(Context context, h5.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f88572c = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(((o) this.f88572c).add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i13, int i14, int i15, ComponentName componentName, Intent[] intentArr, Intent intent, int i16, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((o) this.f88572c).addIntentOptions(i13, i14, i15, componentName, intentArr, intent, i16, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i17 = 0; i17 < length; i17++) {
                menuItemArr[i17] = c(menuItemArr2[i17]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f88572c).addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        o0 o0Var = this.f88571b;
        if (o0Var != null) {
            o0Var.clear();
        }
        ((o) this.f88572c).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f88572c).close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i13) {
        return c(((o) this.f88572c).findItem(i13));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i13) {
        return c(((o) this.f88572c).getItem(i13));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f88572c).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i13, KeyEvent keyEvent) {
        return ((o) this.f88572c).isShortcutKey(i13, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i13, int i14) {
        return ((o) this.f88572c).performIdentifierAction(i13, i14);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i13, KeyEvent keyEvent, int i14) {
        return ((o) this.f88572c).performShortcut(i13, keyEvent, i14);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i13) {
        if (this.f88571b != null) {
            int i14 = 0;
            while (true) {
                o0 o0Var = this.f88571b;
                if (i14 >= o0Var.f63294c) {
                    break;
                }
                if (((h5.b) o0Var.f(i14)).getGroupId() == i13) {
                    this.f88571b.h(i14);
                    i14--;
                }
                i14++;
            }
        }
        ((o) this.f88572c).removeGroup(i13);
    }

    @Override // android.view.Menu
    public final void removeItem(int i13) {
        if (this.f88571b != null) {
            int i14 = 0;
            while (true) {
                o0 o0Var = this.f88571b;
                if (i14 >= o0Var.f63294c) {
                    break;
                }
                if (((h5.b) o0Var.f(i14)).getItemId() == i13) {
                    this.f88571b.h(i14);
                    break;
                }
                i14++;
            }
        }
        ((o) this.f88572c).removeItem(i13);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i13, boolean z13, boolean z14) {
        ((o) this.f88572c).setGroupCheckable(i13, z13, z14);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i13, boolean z13) {
        ((o) this.f88572c).setGroupEnabled(i13, z13);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i13, boolean z13) {
        ((o) this.f88572c).setGroupVisible(i13, z13);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z13) {
        this.f88572c.setQwertyMode(z13);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f88572c).size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13) {
        return c(((o) this.f88572c).add(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13) {
        return ((o) this.f88572c).addSubMenu(i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, CharSequence charSequence) {
        return c(((o) this.f88572c).add(i13, i14, i15, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        return this.f88572c.addSubMenu(i13, i14, i15, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, int i16) {
        return c(((o) this.f88572c).add(i13, i14, i15, i16));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, int i16) {
        return ((o) this.f88572c).addSubMenu(i13, i14, i15, i16);
    }
}
