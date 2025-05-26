package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.widget.c1;
import java.io.IOException;
import n.r;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class l extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f85232e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f85233f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f85234a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f85235b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f85236c;

    /* renamed from: d, reason: collision with root package name */
    public Object f85237d;

    static {
        Class[] clsArr = {Context.class};
        f85232e = clsArr;
        f85233f = clsArr;
    }

    public l(Context context) {
        super(context);
        this.f85236c = context;
        Object[] objArr = {context};
        this.f85234a = objArr;
        this.f85235b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i13;
        k kVar = new k(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i13 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z13 = false;
        boolean z14 = false;
        String str = null;
        while (!z13) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i13) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z14 && name2.equals(str)) {
                        z14 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        kVar.f85207b = 0;
                        kVar.f85208c = 0;
                        kVar.f85209d = 0;
                        kVar.f85210e = 0;
                        kVar.f85211f = true;
                        kVar.f85212g = true;
                    } else if (name2.equals("item")) {
                        if (!kVar.f85213h) {
                            r rVar = kVar.f85231z;
                            if (rVar == null || !rVar.f88702b.hasSubMenu()) {
                                kVar.f85213h = true;
                                kVar.b(kVar.f85206a.add(kVar.f85207b, kVar.f85214i, kVar.f85215j, kVar.f85216k));
                            } else {
                                kVar.f85213h = true;
                                kVar.b(kVar.f85206a.addSubMenu(kVar.f85207b, kVar.f85214i, kVar.f85215j, kVar.f85216k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z13 = true;
                    }
                    eventType = xmlResourceParser.next();
                    i13 = 2;
                    z13 = z13;
                    z14 = z14;
                }
                eventType = xmlResourceParser.next();
                i13 = 2;
                z13 = z13;
                z14 = z14;
            } else {
                if (!z14) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    l lVar = kVar.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = lVar.f85236c.obtainStyledAttributes(attributeSet, i.j.MenuGroup);
                        kVar.f85207b = obtainStyledAttributes.getResourceId(i.j.MenuGroup_android_id, 0);
                        kVar.f85208c = obtainStyledAttributes.getInt(i.j.MenuGroup_android_menuCategory, 0);
                        kVar.f85209d = obtainStyledAttributes.getInt(i.j.MenuGroup_android_orderInCategory, 0);
                        kVar.f85210e = obtainStyledAttributes.getInt(i.j.MenuGroup_android_checkableBehavior, 0);
                        kVar.f85211f = obtainStyledAttributes.getBoolean(i.j.MenuGroup_android_visible, true);
                        kVar.f85212g = obtainStyledAttributes.getBoolean(i.j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        x92.b M = x92.b.M(lVar.f85236c, attributeSet, i.j.MenuItem);
                        kVar.f85214i = M.C(i.j.MenuItem_android_id, 0);
                        kVar.f85215j = (M.B(i.j.MenuItem_android_menuCategory, kVar.f85208c) & (-65536)) | (M.B(i.j.MenuItem_android_orderInCategory, kVar.f85209d) & 65535);
                        kVar.f85216k = M.E(i.j.MenuItem_android_title);
                        kVar.f85217l = M.E(i.j.MenuItem_android_titleCondensed);
                        kVar.f85218m = M.C(i.j.MenuItem_android_icon, 0);
                        String D = M.D(i.j.MenuItem_android_alphabeticShortcut);
                        kVar.f85219n = D == null ? (char) 0 : D.charAt(0);
                        kVar.f85220o = M.B(i.j.MenuItem_alphabeticModifiers, 4096);
                        String D2 = M.D(i.j.MenuItem_android_numericShortcut);
                        kVar.f85221p = D2 == null ? (char) 0 : D2.charAt(0);
                        kVar.f85222q = M.B(i.j.MenuItem_numericModifiers, 4096);
                        if (M.G(i.j.MenuItem_android_checkable)) {
                            kVar.f85223r = M.t(i.j.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            kVar.f85223r = kVar.f85210e;
                        }
                        kVar.f85224s = M.t(i.j.MenuItem_android_checked, false);
                        kVar.f85225t = M.t(i.j.MenuItem_android_visible, kVar.f85211f);
                        kVar.f85226u = M.t(i.j.MenuItem_android_enabled, kVar.f85212g);
                        kVar.f85227v = M.B(i.j.MenuItem_showAsAction, -1);
                        kVar.f85230y = M.D(i.j.MenuItem_android_onClick);
                        kVar.f85228w = M.C(i.j.MenuItem_actionLayout, 0);
                        kVar.f85229x = M.D(i.j.MenuItem_actionViewClass);
                        String D3 = M.D(i.j.MenuItem_actionProviderClass);
                        boolean z15 = D3 != null;
                        if (z15 && kVar.f85228w == 0 && kVar.f85229x == null) {
                            kVar.f85231z = (r) kVar.a(D3, f85233f, lVar.f85235b);
                        } else {
                            if (z15) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            kVar.f85231z = null;
                        }
                        kVar.A = M.E(i.j.MenuItem_contentDescription);
                        kVar.B = M.E(i.j.MenuItem_tooltipText);
                        if (M.G(i.j.MenuItem_iconTintMode)) {
                            kVar.D = c1.d(M.B(i.j.MenuItem_iconTintMode, -1), kVar.D);
                        } else {
                            kVar.D = null;
                        }
                        if (M.G(i.j.MenuItem_iconTint)) {
                            kVar.C = M.u(i.j.MenuItem_iconTint);
                        } else {
                            kVar.C = null;
                        }
                        M.O();
                        kVar.f85213h = false;
                    } else {
                        if (name3.equals("menu")) {
                            kVar.f85213h = true;
                            SubMenu addSubMenu = kVar.f85206a.addSubMenu(kVar.f85207b, kVar.f85214i, kVar.f85215j, kVar.f85216k);
                            kVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z14 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i13 = 2;
                        z13 = z13;
                        z14 = z14;
                    }
                }
                eventType = xmlResourceParser.next();
                i13 = 2;
                z13 = z13;
                z14 = z14;
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i13, Menu menu) {
        if (!(menu instanceof h5.a)) {
            super.inflate(i13, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z13 = false;
        try {
            try {
                xmlResourceParser = this.f85236c.getResources().getLayout(i13);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof n.o) {
                    n.o oVar = (n.o) menu;
                    if (!oVar.f88663p) {
                        oVar.B();
                        z13 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z13) {
                    ((n.o) menu).A();
                }
                xmlResourceParser.close();
            } catch (IOException e13) {
                throw new InflateException("Error inflating menu XML", e13);
            } catch (XmlPullParserException e14) {
                throw new InflateException("Error inflating menu XML", e14);
            }
        } catch (Throwable th3) {
            if (z13) {
                ((n.o) menu).A();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th3;
        }
    }
}
