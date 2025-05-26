package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class o implements h5.a {

    /* renamed from: y */
    public static final int[] f88647y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f88648a;

    /* renamed from: b */
    public final Resources f88649b;

    /* renamed from: c */
    public boolean f88650c;

    /* renamed from: d */
    public final boolean f88651d;

    /* renamed from: e */
    public m f88652e;

    /* renamed from: f */
    public final ArrayList f88653f;

    /* renamed from: g */
    public final ArrayList f88654g;

    /* renamed from: h */
    public boolean f88655h;

    /* renamed from: i */
    public final ArrayList f88656i;

    /* renamed from: j */
    public final ArrayList f88657j;

    /* renamed from: k */
    public boolean f88658k;

    /* renamed from: m */
    public CharSequence f88660m;

    /* renamed from: n */
    public Drawable f88661n;

    /* renamed from: o */
    public View f88662o;

    /* renamed from: v */
    public q f88669v;

    /* renamed from: x */
    public boolean f88671x;

    /* renamed from: l */
    public int f88659l = 0;

    /* renamed from: p */
    public boolean f88663p = false;

    /* renamed from: q */
    public boolean f88664q = false;

    /* renamed from: r */
    public boolean f88665r = false;

    /* renamed from: s */
    public boolean f88666s = false;

    /* renamed from: t */
    public final ArrayList f88667t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f88668u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f88670w = false;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z13 = false;
        this.f88648a = context;
        Resources resources2 = context.getResources();
        this.f88649b = resources2;
        this.f88653f = new ArrayList();
        this.f88654g = new ArrayList();
        this.f88655h = true;
        this.f88656i = new ArrayList();
        this.f88657j = new ArrayList();
        this.f88658k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : c5.y.o(viewConfiguration)) {
                z13 = true;
            }
        }
        this.f88651d = z13;
    }

    public final void A() {
        this.f88663p = false;
        if (this.f88664q) {
            this.f88664q = false;
            q(this.f88665r);
        }
    }

    public final void B() {
        if (this.f88663p) {
            return;
        }
        this.f88663p = true;
        this.f88664q = false;
        this.f88665r = false;
    }

    public q a(int i13, int i14, int i15, CharSequence charSequence) {
        int i16;
        int i17 = ((-65536) & i15) >> 16;
        if (i17 < 0 || i17 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i18 = (f88647y[i17] << 16) | (65535 & i15);
        q qVar = new q(this, i13, i14, i15, i18, charSequence, this.f88659l);
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i16 = 0;
                break;
            }
            if (((q) arrayList.get(size)).f88678d <= i18) {
                i16 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i16, qVar);
        q(true);
        return qVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i13, int i14, int i15, ComponentName componentName, Intent[] intentArr, Intent intent, int i16, MenuItem[] menuItemArr) {
        int i17;
        PackageManager packageManager = this.f88648a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i16 & 1) == 0) {
            removeGroup(i13);
        }
        for (int i18 = 0; i18 < size; i18++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i18);
            int i19 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i19 < 0 ? intent : intentArr[i19]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q a13 = a(i13, i14, i15, resolveInfo.loadLabel(packageManager));
            a13.setIcon(resolveInfo.loadIcon(packageManager));
            a13.f88681g = intent2;
            if (menuItemArr != null && (i17 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i17] = a13;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(a0 a0Var) {
        c(a0Var, this.f88648a);
    }

    public final void c(a0 a0Var, Context context) {
        this.f88668u.add(new WeakReference(a0Var));
        a0Var.i(context, this);
        this.f88658k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f88669v;
        if (qVar != null) {
            e(qVar);
        }
        this.f88653f.clear();
        q(true);
    }

    public final void clearHeader() {
        this.f88661n = null;
        this.f88660m = null;
        this.f88662o = null;
        q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        d(true);
    }

    public final void d(boolean z13) {
        if (this.f88666s) {
            return;
        }
        this.f88666s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                a0Var.b(this, z13);
            }
        }
        this.f88666s = false;
    }

    public boolean e(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
        boolean z13 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f88669v == qVar) {
            B();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z13 = a0Var.g(qVar);
                    if (z13) {
                        break;
                    }
                }
            }
            A();
            if (z13) {
                this.f88669v = null;
            }
        }
        return z13;
    }

    public boolean f(o oVar, MenuItem menuItem) {
        m mVar = this.f88652e;
        return mVar != null && mVar.h(oVar, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i13) {
        MenuItem findItem;
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            q qVar = (q) arrayList.get(i14);
            if (qVar.f88675a == i13) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.f88689o.findItem(i13)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
        boolean z13 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        B();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z13 = a0Var.e(qVar);
                if (z13) {
                    break;
                }
            }
        }
        A();
        if (z13) {
            this.f88669v = qVar;
        }
        return z13;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i13) {
        return (MenuItem) this.f88653f.get(i13);
    }

    public final q h(int i13, KeyEvent keyEvent) {
        ArrayList arrayList = this.f88667t;
        arrayList.clear();
        i(arrayList, i13, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean o13 = o();
        for (int i14 = 0; i14 < size; i14++) {
            q qVar = (q) arrayList.get(i14);
            char c13 = o13 ? qVar.f88684j : qVar.f88682h;
            char[] cArr = keyData.meta;
            if ((c13 == cArr[0] && (metaState & 2) == 0) || ((c13 == cArr[2] && (metaState & 2) != 0) || (o13 && c13 == '\b' && i13 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f88671x) {
            return true;
        }
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((q) arrayList.get(i13)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(ArrayList arrayList, int i13, KeyEvent keyEvent) {
        int i14;
        boolean o13 = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i13 == 67) {
            ArrayList arrayList2 = this.f88653f;
            int size = arrayList2.size();
            for (0; i14 < size; i14 + 1) {
                q qVar = (q) arrayList2.get(i14);
                if (qVar.hasSubMenu()) {
                    qVar.f88689o.i(arrayList, i13, keyEvent);
                }
                char c13 = o13 ? qVar.f88684j : qVar.f88682h;
                if ((modifiers & 69647) == ((o13 ? qVar.f88685k : qVar.f88683i) & 69647) && c13 != 0) {
                    char[] cArr = keyData.meta;
                    if (c13 != cArr[0] && c13 != cArr[2]) {
                        if (o13 && c13 == '\b') {
                            i14 = i13 != 67 ? i14 + 1 : 0;
                        }
                    }
                    if (qVar.isEnabled()) {
                        arrayList.add(qVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i13, KeyEvent keyEvent) {
        return h(i13, keyEvent) != null;
    }

    public final void j() {
        ArrayList m13 = m();
        if (this.f88658k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z13 |= a0Var.j();
                }
            }
            ArrayList arrayList = this.f88656i;
            ArrayList arrayList2 = this.f88657j;
            if (z13) {
                arrayList.clear();
                arrayList2.clear();
                int size = m13.size();
                for (int i13 = 0; i13 < size; i13++) {
                    q qVar = (q) m13.get(i13);
                    if (qVar.f()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m());
            }
            this.f88658k = false;
        }
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public o l() {
        return this;
    }

    public final ArrayList m() {
        boolean z13 = this.f88655h;
        ArrayList arrayList = this.f88654g;
        if (!z13) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f88653f;
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            q qVar = (q) arrayList2.get(i13);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f88655h = false;
        this.f88658k = true;
        return arrayList;
    }

    public boolean n() {
        return this.f88670w;
    }

    public boolean o() {
        return this.f88650c;
    }

    public boolean p() {
        return this.f88651d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i13, int i14) {
        return r(findItem(i13), null, i14);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i13, KeyEvent keyEvent, int i14) {
        q h10 = h(i13, keyEvent);
        boolean r13 = h10 != null ? r(h10, null, i14) : false;
        if ((i14 & 2) != 0) {
            d(true);
        }
        return r13;
    }

    public void q(boolean z13) {
        if (this.f88663p) {
            this.f88664q = true;
            if (z13) {
                this.f88665r = true;
                return;
            }
            return;
        }
        if (z13) {
            this.f88655h = true;
            this.f88658k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        B();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                a0Var.h(z13);
            }
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MenuItem r7, n.a0 r8, int r9) {
        /*
            r6 = this;
            n.q r7 = (n.q) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f88690p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            n.o r1 = r7.f88688n
            boolean r3 = r1.f(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f88681g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f88648a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            n.r r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f88702b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            n.r r3 = r7.A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f88702b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.d(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.d(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.d(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            n.g0 r9 = new n.g0
            android.content.Context r5 = r6.f88648a
            r9.<init>(r5, r6, r7)
            r7.f88689o = r9
            java.lang.CharSequence r5 = r7.f88679e
            r9.setHeaderTitle(r5)
        L90:
            n.g0 r7 = r7.f88689o
            if (r4 == 0) goto L9e
            n.v r9 = r3.f88703c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f88702b
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f88668u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.c(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            n.a0 r4 = (n.a0) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.c(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.d(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.o.r(android.view.MenuItem, n.a0, int):boolean");
    }

    @Override // android.view.Menu
    public final void removeGroup(int i13) {
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                i15 = -1;
                break;
            } else if (((q) arrayList.get(i15)).f88676b == i13) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 >= 0) {
            int size2 = arrayList.size() - i15;
            while (true) {
                int i16 = i14 + 1;
                if (i14 >= size2 || ((q) arrayList.get(i15)).f88676b != i13) {
                    break;
                }
                if (i15 >= 0) {
                    ArrayList arrayList2 = this.f88653f;
                    if (i15 < arrayList2.size()) {
                        arrayList2.remove(i15);
                    }
                }
                i14 = i16;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i13) {
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                i14 = -1;
                break;
            } else if (((q) arrayList.get(i14)).f88675a == i13) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            ArrayList arrayList2 = this.f88653f;
            if (i14 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i14);
            q(true);
        }
    }

    public final void s(a0 a0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var2 = (a0) weakReference.get();
            if (a0Var2 == null || a0Var2 == a0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i13, boolean z13, boolean z14) {
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            q qVar = (q) arrayList.get(i14);
            if (qVar.f88676b == i13) {
                qVar.g(z14);
                qVar.setCheckable(z13);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z13) {
        this.f88670w = z13;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i13, boolean z13) {
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            q qVar = (q) arrayList.get(i14);
            if (qVar.f88676b == i13) {
                qVar.setEnabled(z13);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i13, boolean z13) {
        ArrayList arrayList = this.f88653f;
        int size = arrayList.size();
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            q qVar = (q) arrayList.get(i14);
            if (qVar.f88676b == i13) {
                int i15 = qVar.f88698x;
                int i16 = (i15 & (-9)) | (z13 ? 0 : 8);
                qVar.f88698x = i16;
                if (i15 != i16) {
                    z14 = true;
                }
            }
        }
        if (z14) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z13) {
        this.f88650c = z13;
        q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f88653f.size();
    }

    public final void t(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(k());
        int size = this.f88653f.size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = getItem(i13);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((g0) item.getSubMenu()).t(bundle);
            }
        }
        int i14 = bundle.getInt("android:menu:expandedactionview");
        if (i14 <= 0 || (findItem = findItem(i14)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void u(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id3 = a0Var.getId();
                    if (id3 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id3)) != null) {
                        a0Var.d(parcelable);
                    }
                }
            }
        }
    }

    public final void v(Bundle bundle) {
        int size = this.f88653f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = getItem(i13);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((g0) item.getSubMenu()).v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public final void w(Bundle bundle) {
        Parcelable f13;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88668u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id3 = a0Var.getId();
                if (id3 > 0 && (f13 = a0Var.f()) != null) {
                    sparseArray.put(id3, f13);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void x(m mVar) {
        this.f88652e = mVar;
    }

    public final void y(int i13, CharSequence charSequence, int i14, Drawable drawable, View view) {
        if (view != null) {
            this.f88662o = view;
            this.f88660m = null;
            this.f88661n = null;
        } else {
            if (i13 > 0) {
                this.f88660m = this.f88649b.getText(i13);
            } else if (charSequence != null) {
                this.f88660m = charSequence;
            }
            if (i14 > 0) {
                Object obj = d5.a.f53679a;
                this.f88661n = this.f88648a.getDrawable(i14);
            } else if (drawable != null) {
                this.f88661n = drawable;
            }
            this.f88662o = null;
        }
        q(false);
    }

    public final void z(boolean z13) {
        this.f88671x = z13;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13) {
        return a(0, 0, 0, this.f88649b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13) {
        return addSubMenu(0, 0, 0, this.f88649b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, CharSequence charSequence) {
        return a(i13, i14, i15, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        q a13 = a(i13, i14, i15, charSequence);
        g0 g0Var = new g0(this.f88648a, this, a13);
        a13.f88689o = g0Var;
        g0Var.setHeaderTitle(a13.f88679e);
        return g0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, int i16) {
        return a(i13, i14, i15, this.f88649b.getString(i16));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, int i16) {
        return addSubMenu(i13, i14, i15, this.f88649b.getString(i16));
    }
}
