package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5450a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5451b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5452c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f5453d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5454e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f5455f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f5456g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f5457h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f5458i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public boolean f5459j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        String str;
        Activity activity;
        Boolean bool;
        u3 u3Var = u3.f11813c;
        if (u3Var != null) {
            for (t3 t3Var : Collections.unmodifiableCollection(u3Var.f11815b)) {
                View view = (View) t3Var.f11328c.get();
                if (t3Var.f11330e && !t3Var.f11331f) {
                    String str2 = t3Var.f11332g;
                    if (view != null) {
                        Context context = view.getContext();
                        while (true) {
                            str = null;
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (isInPictureInPictureMode) {
                            this.f5457h.add(str2);
                        }
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.f5458i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.f5458i.containsKey(view)) {
                                bool = (Boolean) this.f5458i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.f5458i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || isInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.f5453d.addAll(hashSet);
                                        break;
                                    }
                                    String c13 = ph.a.c(view2);
                                    if (c13 != null) {
                                        str = c13;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f5454e.add(str2);
                            this.f5450a.put(view, str2);
                            Iterator it = t3Var.f11327b.f14246a.iterator();
                            while (it.hasNext()) {
                                wh0 wh0Var = (wh0) it.next();
                                View view3 = (View) wh0Var.f13039a.get();
                                if (view3 != null) {
                                    f6 f6Var = (f6) this.f5451b.get(view3);
                                    if (f6Var != null) {
                                        f6Var.f5064b.add(t3Var.f11332g);
                                    } else {
                                        this.f5451b.put(view3, new f6(wh0Var, t3Var.f11332g));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f5455f.add(str2);
                            this.f5452c.put(str2, view);
                            this.f5456g.put(str2, str);
                        }
                    } else {
                        this.f5455f.add(str2);
                        this.f5456g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}
