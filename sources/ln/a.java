package ln;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.x;
import dp2.g;
import fn.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kh2.n;
import ll.j;
import m.h;
import org.chromium.base.ApplicationStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83969a;

    public /* synthetic */ a(int i13) {
        this.f83969a = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        HashSet hashSet;
        HashSet hashSet2;
        Throwable th3;
        HashSet hashSet3;
        Iterator it;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.f83969a) {
            case 0:
                b bVar2 = b.f83970g;
                bVar2.getClass();
                bVar2.f83976b.clear();
                Iterator it2 = Collections.unmodifiableCollection(hn.c.f69594c.f69596b).iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).getClass();
                }
                bVar2.f83980f = System.nanoTime();
                c cVar = bVar2.f83978d;
                cVar.getClass();
                hn.c cVar2 = hn.c.f69594c;
                HashMap hashMap = cVar.f83981a;
                HashSet hashSet4 = cVar.f83984d;
                HashSet hashSet5 = cVar.f83988h;
                HashMap hashMap2 = cVar.f83983c;
                HashMap hashMap3 = cVar.f83987g;
                HashSet hashSet6 = cVar.f83985e;
                HashSet hashSet7 = cVar.f83986f;
                if (cVar2 != null) {
                    Iterator it3 = Collections.unmodifiableCollection(cVar2.f69596b).iterator();
                    while (it3.hasNext()) {
                        i iVar = (i) it3.next();
                        View a13 = iVar.a();
                        if (!iVar.f62596f || iVar.f62597g) {
                            it = it3;
                        } else {
                            String str2 = iVar.f62598h;
                            if (a13 != null) {
                                Context context = a13.getContext();
                                while (true) {
                                    if (!(context instanceof ContextWrapper)) {
                                        activity = null;
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                                boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                                if (isInPictureInPictureMode) {
                                    hashSet5.add(str2);
                                }
                                it = it3;
                                if (a13.isAttachedToWindow()) {
                                    boolean hasWindowFocus = a13.hasWindowFocus();
                                    WeakHashMap weakHashMap = cVar.f83989i;
                                    if (hasWindowFocus) {
                                        weakHashMap.remove(a13);
                                        bool = Boolean.FALSE;
                                    } else if (weakHashMap.containsKey(a13)) {
                                        bool = (Boolean) weakHashMap.get(a13);
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        weakHashMap.put(a13, bool2);
                                        bool = bool2;
                                    }
                                    if (!bool.booleanValue() || isInPictureInPictureMode) {
                                        HashSet hashSet8 = new HashSet();
                                        View view = a13;
                                        while (true) {
                                            if (view == null) {
                                                hashSet4.addAll(hashSet8);
                                                str = null;
                                            } else {
                                                String k13 = n.k(view);
                                                if (k13 != null) {
                                                    str = k13;
                                                } else {
                                                    hashSet8.add(view);
                                                    Object parent = view.getParent();
                                                    view = parent instanceof View ? (View) parent : null;
                                                }
                                            }
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                } else {
                                    str = "notAttached";
                                }
                                if (str == null) {
                                    hashSet6.add(str2);
                                    hashMap.put(a13, str2);
                                    Iterator it4 = iVar.f62593c.f69600a.iterator();
                                    if (it4.hasNext()) {
                                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it4.next());
                                        throw null;
                                    }
                                } else if (str != "noWindowFocus") {
                                    hashSet7.add(str2);
                                    hashMap2.put(str2, a13);
                                    hashMap3.put(str2, str);
                                }
                            } else {
                                it = it3;
                                hashSet7.add(str2);
                                hashMap3.put(str2, "noAdView");
                            }
                        }
                        it3 = it;
                    }
                }
                long nanoTime = System.nanoTime();
                bh.b bVar3 = bVar2.f83977c;
                j jVar = (j) bVar3.f22799c;
                int size = hashSet7.size();
                x xVar = bVar2.f83979e;
                if (size > 0) {
                    Iterator it5 = hashSet7.iterator();
                    while (it5.hasNext()) {
                        String str3 = (String) it5.next();
                        Iterator it6 = it5;
                        JSONObject a14 = jVar.a(null);
                        View view2 = (View) hashMap2.get(str3);
                        j jVar2 = (j) bVar3.f22798b;
                        bh.b bVar4 = bVar3;
                        String str4 = (String) hashMap3.get(str3);
                        if (str4 != null) {
                            JSONObject a15 = jVar2.a(view2);
                            WindowManager windowManager = kn.b.f80207a;
                            try {
                                a15.put("adSessionId", str3);
                                hashSet3 = hashSet7;
                            } catch (JSONException e13) {
                                hashSet3 = hashSet7;
                                el.a.k("Error with setting ad session id", e13);
                            }
                            try {
                                a15.put("notVisibleReason", str4);
                            } catch (JSONException e14) {
                                el.a.k("Error with setting not visible reason", e14);
                            }
                            kn.b.c(a14, a15);
                        } else {
                            hashSet3 = hashSet7;
                        }
                        kn.b.d(a14);
                        HashSet hashSet9 = new HashSet();
                        hashSet9.add(str3);
                        ((h) xVar.f31695c).q(new mn.d(xVar, hashSet9, a14, nanoTime, 0));
                        it5 = it6;
                        bVar3 = bVar4;
                        hashSet7 = hashSet3;
                    }
                }
                HashSet hashSet10 = hashSet7;
                if (hashSet6.size() > 0) {
                    JSONObject a16 = jVar.a(null);
                    d dVar = d.PARENT_VIEW;
                    jVar.b(null, a16, bVar2, true);
                    kn.b.d(a16);
                    th3 = null;
                    bVar = bVar2;
                    hashSet2 = hashSet10;
                    hashSet = hashSet6;
                    ((h) xVar.f31695c).q(new mn.d(xVar, hashSet6, a16, nanoTime, 1));
                } else {
                    bVar = bVar2;
                    hashSet = hashSet6;
                    hashSet2 = hashSet10;
                    th3 = null;
                    xVar.h();
                }
                hashMap.clear();
                cVar.f83982b.clear();
                hashMap2.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet2.clear();
                hashMap3.clear();
                cVar.f83990j = false;
                hashSet5.clear();
                b bVar5 = bVar;
                long nanoTime2 = System.nanoTime() - bVar5.f83980f;
                ArrayList arrayList = bVar5.f83975a;
                if (arrayList.size() > 0) {
                    Iterator it7 = arrayList.iterator();
                    if (it7.hasNext()) {
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it7.next());
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw th3;
                    }
                }
                hn.i iVar2 = hn.i.f69604d;
                Context context2 = (Context) iVar2.f69605a.get();
                if (context2 == null) {
                    return;
                }
                boolean isDeviceLocked = ((KeyguardManager) context2.getSystemService("keyguard")).isDeviceLocked();
                iVar2.a(iVar2.f69606b, isDeviceLocked);
                iVar2.f69607c = isDeviceLocked;
                return;
            case 1:
                Handler handler = b.f83972i;
                if (handler != null) {
                    handler.post(b.f83973j);
                    b.f83972i.postDelayed(b.f83974k, 200L);
                    return;
                }
                return;
            default:
                if (ApplicationStatus.f97281c != null) {
                    return;
                }
                t72.j jVar3 = new t72.j(this, 10);
                ApplicationStatus.f97281c = jVar3;
                if (ApplicationStatus.f97282d == null) {
                    ApplicationStatus.f97282d = new g();
                }
                ApplicationStatus.f97282d.b(jVar3);
                return;
        }
    }
}
