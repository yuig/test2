package v3;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123912a;

    /* renamed from: b, reason: collision with root package name */
    public a3.d f123913b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f123914c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f123915d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f123916e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f123917f;

    public d(a0 a0Var) {
        a3.d dVar = a3.d.f483e;
        this.f123912a = a0Var;
        this.f123913b = dVar;
        this.f123914c = null;
        this.f123915d = null;
        this.f123916e = null;
        this.f123917f = null;
    }

    public static void a(Menu menu, c cVar) {
        menu.add(0, cVar.getId(), cVar.getOrder(), cVar.getTitleResource()).setShowAsAction(1);
    }

    public static void b(Menu menu, c cVar, Function0 function0) {
        if (function0 != null && menu.findItem(cVar.getId()) == null) {
            a(menu, cVar);
        } else {
            if (function0 != null || menu.findItem(cVar.getId()) == null) {
                return;
            }
            menu.removeItem(cVar.getId());
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == c.Copy.getId()) {
            Function0 function0 = this.f123914c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == c.Paste.getId()) {
            Function0 function02 = this.f123915d;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == c.Cut.getId()) {
            Function0 function03 = this.f123916e;
            if (function03 != null) {
                function03.invoke();
            }
        } else {
            if (itemId != c.SelectAll.getId()) {
                return false;
            }
            Function0 function04 = this.f123917f;
            if (function04 != null) {
                function04.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.f123914c != null) {
            a(menu, c.Copy);
        }
        if (this.f123915d != null) {
            a(menu, c.Paste);
        }
        if (this.f123916e != null) {
            a(menu, c.Cut);
        }
        if (this.f123917f != null) {
            a(menu, c.SelectAll);
        }
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        b(menu, c.Copy, this.f123914c);
        b(menu, c.Paste, this.f123915d);
        b(menu, c.Cut, this.f123916e);
        b(menu, c.SelectAll, this.f123917f);
        return true;
    }
}
