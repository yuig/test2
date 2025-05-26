package m;

import a.cb;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.r;
import n.v;

/* loaded from: classes2.dex */
public final class k {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ l E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f85206a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f85213h;

    /* renamed from: i, reason: collision with root package name */
    public int f85214i;

    /* renamed from: j, reason: collision with root package name */
    public int f85215j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f85216k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f85217l;

    /* renamed from: m, reason: collision with root package name */
    public int f85218m;

    /* renamed from: n, reason: collision with root package name */
    public char f85219n;

    /* renamed from: o, reason: collision with root package name */
    public int f85220o;

    /* renamed from: p, reason: collision with root package name */
    public char f85221p;

    /* renamed from: q, reason: collision with root package name */
    public int f85222q;

    /* renamed from: r, reason: collision with root package name */
    public int f85223r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f85224s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f85225t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f85226u;

    /* renamed from: v, reason: collision with root package name */
    public int f85227v;

    /* renamed from: w, reason: collision with root package name */
    public int f85228w;

    /* renamed from: x, reason: collision with root package name */
    public String f85229x;

    /* renamed from: y, reason: collision with root package name */
    public String f85230y;

    /* renamed from: z, reason: collision with root package name */
    public r f85231z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f85207b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f85208c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f85209d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f85210e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f85211f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f85212g = true;

    public k(l lVar, Menu menu) {
        this.E = lVar;
        this.f85206a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f85236c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e13) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e13);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z13 = false;
        menuItem.setChecked(this.f85224s).setVisible(this.f85225t).setEnabled(this.f85226u).setCheckable(this.f85223r >= 1).setTitleCondensed(this.f85217l).setIcon(this.f85218m);
        int i13 = this.f85227v;
        if (i13 >= 0) {
            menuItem.setShowAsAction(i13);
        }
        String str = this.f85230y;
        l lVar = this.E;
        if (str != null) {
            if (lVar.f85236c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (lVar.f85237d == null) {
                lVar.f85237d = l.a(lVar.f85236c);
            }
            Object obj = lVar.f85237d;
            String str2 = this.f85230y;
            j jVar = new j();
            jVar.f85204a = obj;
            Class<?> cls = obj.getClass();
            try {
                jVar.f85205b = cls.getMethod(str2, j.f85203c);
                menuItem.setOnMenuItemClickListener(jVar);
            } catch (Exception e13) {
                StringBuilder o13 = cb.o("Couldn't resolve menu item onClick handler ", str2, " in class ");
                o13.append(cls.getName());
                InflateException inflateException = new InflateException(o13.toString());
                inflateException.initCause(e13);
                throw inflateException;
            }
        }
        if (this.f85223r >= 2) {
            if (menuItem instanceof n.q) {
                ((n.q) menuItem).g(true);
            } else if (menuItem instanceof v) {
                v vVar = (v) menuItem;
                try {
                    Method method = vVar.f88710d;
                    h5.b bVar = vVar.f88709c;
                    if (method == null) {
                        vVar.f88710d = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    vVar.f88710d.invoke(bVar, Boolean.TRUE);
                } catch (Exception e14) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e14);
                }
            }
        }
        String str3 = this.f85229x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, l.f85232e, lVar.f85234a));
            z13 = true;
        }
        int i14 = this.f85228w;
        if (i14 > 0) {
            if (z13) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i14);
            }
        }
        r rVar = this.f85231z;
        if (rVar != null) {
            if (menuItem instanceof h5.b) {
                ((h5.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z14 = menuItem instanceof h5.b;
        if (z14) {
            ((h5.b) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z14) {
            ((h5.b) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c13 = this.f85219n;
        int i15 = this.f85220o;
        if (z14) {
            ((h5.b) menuItem).setAlphabeticShortcut(c13, i15);
        } else {
            menuItem.setAlphabeticShortcut(c13, i15);
        }
        char c14 = this.f85221p;
        int i16 = this.f85222q;
        if (z14) {
            ((h5.b) menuItem).setNumericShortcut(c14, i16);
        } else {
            menuItem.setNumericShortcut(c14, i16);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z14) {
                ((h5.b) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z14) {
                ((h5.b) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
