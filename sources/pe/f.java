package pe;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import df.c0;
import df.e0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import le.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f99903a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f99904b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f99905c;

    /* renamed from: d, reason: collision with root package name */
    public final String f99906d;

    public f(View view, Handler handler, HashSet listenerSet, String activityName) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f99903a = new WeakReference(view);
        this.f99905c = listenerSet;
        this.f99906d = activityName;
        handler.postDelayed(this, 200L);
    }

    public final void a(e eVar, View rootView, qe.c mapping) {
        boolean z13;
        HashSet hashSet;
        String str;
        View hostView = eVar.a();
        if (hostView == null) {
            return;
        }
        View.OnClickListener e13 = qe.h.e(hostView);
        if (e13 instanceof a) {
            if (e13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
            }
            if (((a) e13).f99886e) {
                z13 = true;
                hashSet = this.f99905c;
                str = eVar.f99902b;
                if (!hashSet.contains(str) || z13) {
                }
                a aVar = null;
                if (!p001if.a.b(c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(mapping, "mapping");
                        Intrinsics.checkNotNullParameter(rootView, "rootView");
                        Intrinsics.checkNotNullParameter(hostView, "hostView");
                        aVar = new a(mapping, rootView, hostView);
                    } catch (Throwable th3) {
                        p001if.a.a(c.class, th3);
                    }
                }
                hostView.setOnClickListener(aVar);
                hashSet.add(str);
                return;
            }
        }
        z13 = false;
        hashSet = this.f99905c;
        str = eVar.f99902b;
        if (hashSet.contains(str)) {
        }
    }

    public final void b(e eVar, View rootView, qe.c mapping) {
        boolean z13;
        HashSet hashSet;
        String str;
        AdapterView hostView = (AdapterView) eVar.a();
        if (hostView == null) {
            return;
        }
        AdapterView.OnItemClickListener onItemClickListener = hostView.getOnItemClickListener();
        if (onItemClickListener instanceof b) {
            if (onItemClickListener == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
            }
            if (((b) onItemClickListener).f99891e) {
                z13 = true;
                hashSet = this.f99905c;
                str = eVar.f99902b;
                if (!hashSet.contains(str) || z13) {
                }
                b bVar = null;
                if (!p001if.a.b(c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(mapping, "mapping");
                        Intrinsics.checkNotNullParameter(rootView, "rootView");
                        Intrinsics.checkNotNullParameter(hostView, "hostView");
                        bVar = new b(mapping, rootView, hostView);
                    } catch (Throwable th3) {
                        p001if.a.a(c.class, th3);
                    }
                }
                hostView.setOnItemClickListener(bVar);
                hashSet.add(str);
                return;
            }
        }
        z13 = false;
        hashSet = this.f99905c;
        str = eVar.f99902b;
        if (hashSet.contains(str)) {
        }
    }

    public final void c(e eVar, View rootView, qe.c mapping) {
        boolean z13;
        HashSet hashSet;
        String str;
        View hostView = eVar.a();
        if (hostView == null) {
            return;
        }
        View.OnTouchListener f13 = qe.h.f(hostView);
        if (f13 instanceof h) {
            if (f13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
            }
            if (((h) f13).f99918e) {
                z13 = true;
                hashSet = this.f99905c;
                str = eVar.f99902b;
                if (!hashSet.contains(str) || z13) {
                }
                h hVar = null;
                if (!p001if.a.b(i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(mapping, "mapping");
                        Intrinsics.checkNotNullParameter(rootView, "rootView");
                        Intrinsics.checkNotNullParameter(hostView, "hostView");
                        hVar = new h(mapping, rootView, hostView);
                    } catch (Throwable th3) {
                        p001if.a.a(i.class, th3);
                    }
                }
                hostView.setOnTouchListener(hVar);
                hashSet.add(str);
                return;
            }
        }
        z13 = false;
        hashSet = this.f99905c;
        str = eVar.f99902b;
        if (hashSet.contains(str)) {
        }
    }

    public final void d() {
        View view;
        ArrayList arrayList = this.f99904b;
        if (arrayList == null) {
            return;
        }
        WeakReference weakReference = this.f99903a;
        if (weakReference.get() == null) {
            return;
        }
        int i13 = -1;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            int i15 = i14 + 1;
            qe.c cVar = (qe.c) arrayList.get(i14);
            View view2 = (View) weakReference.get();
            if (cVar != null && view2 != null) {
                String str = this.f99906d;
                String str2 = cVar.f103615d;
                if (str2 == null || str2.length() == 0 || Intrinsics.d(str2, str)) {
                    List unmodifiableList = Collections.unmodifiableList(cVar.f103613b);
                    Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
                    if (unmodifiableList.size() <= 25) {
                        Iterator it = me.f.g(view2, unmodifiableList, 0, i13, str).iterator();
                        while (it.hasNext()) {
                            e eVar = (e) it.next();
                            try {
                                View a13 = eVar.a();
                                if (a13 != null) {
                                    qe.h hVar = qe.h.f103629a;
                                    if (!p001if.a.b(qe.h.class)) {
                                        View view3 = a13;
                                        while (view3 != null) {
                                            try {
                                                qe.h hVar2 = qe.h.f103629a;
                                                if (!p001if.a.b(hVar2)) {
                                                    try {
                                                        if (Intrinsics.d(view3.getClass().getName(), "com.facebook.react.ReactRootView")) {
                                                            view = view3;
                                                            break;
                                                        }
                                                    } catch (Throwable th3) {
                                                        p001if.a.a(hVar2, th3);
                                                    }
                                                }
                                                Object parent = view3.getParent();
                                                if (!(parent instanceof View)) {
                                                    break;
                                                } else {
                                                    view3 = (View) parent;
                                                }
                                            } catch (Throwable th4) {
                                                p001if.a.a(qe.h.class, th4);
                                            }
                                        }
                                    }
                                    view = null;
                                    if (view == null || !qe.h.f103629a.l(a13, view)) {
                                        String name = a13.getClass().getName();
                                        Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                                        if (!z.p(name, "com.facebook.react", false)) {
                                            if (!(a13 instanceof AdapterView)) {
                                                a(eVar, view2, cVar);
                                            } else if (a13 instanceof ListView) {
                                                b(eVar, view2, cVar);
                                            }
                                        }
                                    } else {
                                        c(eVar, view2, cVar);
                                    }
                                }
                            } catch (Exception unused) {
                                if (!p001if.a.b(g.class)) {
                                    try {
                                        me.f fVar = g.f99907f;
                                    } catch (Throwable th5) {
                                        p001if.a.a(g.class, th5);
                                    }
                                }
                                v vVar = v.f83104a;
                            }
                        }
                    }
                }
            }
            if (i15 > size) {
                return;
            }
            i14 = i15;
            i13 = -1;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                c0 b13 = e0.b(v.b());
                if (b13 != null && b13.f54733j) {
                    JSONArray jSONArray = b13.f54734k;
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        try {
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i13 = 0;
                                while (true) {
                                    int i14 = i13 + 1;
                                    JSONObject jSONObject = jSONArray.getJSONObject(i13);
                                    Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                                    arrayList.add(me.f.j(jSONObject));
                                    if (i14 >= length) {
                                        break;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                            }
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    }
                    this.f99904b = arrayList;
                    View view = (View) this.f99903a.get();
                    if (view == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    d();
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }
}
