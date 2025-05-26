package bz;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.x;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.x3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nx.z0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f24182g = 0;

    /* renamed from: a, reason: collision with root package name */
    public c f24183a;

    /* renamed from: b, reason: collision with root package name */
    public g f24184b;

    /* renamed from: c, reason: collision with root package name */
    public x f24185c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f24186d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24187e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24188f;

    public i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24186d = linkedHashMap;
        d4 d4Var = d4.PIN;
        LinkedHashSet a13 = h.a(d4Var);
        linkedHashMap.put(g0.PIN_CLOSEUP_BODY, a13);
        linkedHashMap.put(g0.PIN_CLOSEUP_RELATED_PINS, a13);
        linkedHashMap.put(g0.PIN_CLOSEUP_RELATED_CREATOR_PINS, a13);
        linkedHashMap.put(g0.PIN_CLOSEUP_RELATED_PRODUCTS, a13);
        linkedHashMap.put(g0.PIN_CLOSEUP_RELATED_RECIPES, a13);
        linkedHashMap.put(g0.PIN_CLOSEUP_RELATED_PRODUCTS_VIRTUAL_TRY_ON, a13);
        LinkedHashSet a14 = h.a(d4Var, d4.FEED);
        linkedHashMap.put(g0.PIN_STORY_PIN_BODY, a14);
        linkedHashMap.put(g0.PIN_STORY_PIN_COVER, a14);
        linkedHashMap.put(g0.PIN_STORY_PIN_PAGE, a14);
        linkedHashMap.put(g0.PIN_STORY_PIN_OOPS_PAGE, a14);
        linkedHashMap.put(g0.PIN_CLOSEUP_VIDEO, a14);
        linkedHashMap.put(g0.LIVE_SESSION_PIN_PREVIEW, a14);
        LinkedHashSet a15 = h.a(d4.USER);
        linkedHashMap.put(g0.USER_BOARDS, a15);
        linkedHashMap.put(g0.USER_PINS, a15);
        linkedHashMap.put(g0.USER_STORY_PINS, a15);
        linkedHashMap.put(g0.USER_LIKES, a15);
        linkedHashMap.put(g0.TRIES_TAB, a15);
        linkedHashMap.put(g0.BROWSER, h.a(d4.BROWSER));
    }

    public static qq2.c a(i0 i0Var, qq2.c cVar) {
        z0 z0Var;
        String str;
        String str2;
        z0 map;
        if (g0.MODULE_IDEA_STREAM != i0Var.f67084d) {
            return cVar;
        }
        if (cVar == null || (map = (z0) cVar.f104883b) == null) {
            z0Var = new z0();
        } else {
            Intrinsics.checkNotNullParameter(map, "map");
            z0Var = new z0();
            z0Var.putAll(map);
        }
        x3 x3Var = i0Var.f67083c;
        if (x3Var != null && (str2 = x3Var.f67413q) != null) {
            z0Var.put("time_spent_parent_pairid", str2);
        }
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            z0Var.put("pin_id", str);
        }
        return new qq2.c(z0Var, cVar != null ? (String) cVar.f104884c : null);
    }

    public final boolean b(i0 i0Var) {
        i0 i0Var2;
        i0 i0Var3;
        String str;
        i0 i0Var4;
        x3 x3Var;
        i0 i0Var5;
        x3 x3Var2;
        i0 i0Var6;
        x3 x3Var3;
        i0 i0Var7;
        if (this.f24184b != null) {
            Set set = (Set) this.f24186d.get(i0Var.f67084d);
            Set set2 = set;
            if (set2 == null || set2.isEmpty()) {
                g gVar = this.f24184b;
                if (gVar != null) {
                    i0 i0Var8 = gVar.f24164h;
                }
            } else {
                d4 d4Var = null;
                x3 x3Var4 = i0Var.f67083c;
                if (x3Var4 != null) {
                    g gVar2 = this.f24184b;
                    if (((gVar2 == null || (i0Var7 = gVar2.f24164h) == null) ? null : i0Var7.f67083c) != null && (str = x3Var4.f67402f) != null) {
                        if (((gVar2 == null || (i0Var6 = gVar2.f24164h) == null || (x3Var3 = i0Var6.f67083c) == null) ? null : x3Var3.f67402f) != null) {
                            if (!Intrinsics.d(str, (gVar2 == null || (i0Var5 = gVar2.f24164h) == null || (x3Var2 = i0Var5.f67083c) == null) ? null : x3Var2.f67402f) && !this.f24187e) {
                                g gVar3 = this.f24184b;
                                if (gVar3 != null && (i0Var4 = gVar3.f24164h) != null && (x3Var = i0Var4.f67083c) != null) {
                                    String str2 = x3Var.f67402f;
                                }
                            }
                        }
                    }
                }
                g gVar4 = this.f24184b;
                if (gVar4 != null) {
                    Iterator it = gVar4.f24179j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((f) it.next()).f24164h.f67084d == i0Var.f67084d) {
                            if (!this.f24188f) {
                                g gVar5 = this.f24184b;
                                if (gVar5 != null && (i0Var3 = gVar5.f24164h) != null) {
                                    d4 d4Var2 = i0Var3.f67081a;
                                }
                            }
                        }
                    }
                }
                g gVar6 = this.f24184b;
                if (gVar6 != null && (i0Var2 = gVar6.f24164h) != null) {
                    d4Var = i0Var2.f67081a;
                }
                if (set.contains(d4Var)) {
                    return true;
                }
                g gVar7 = this.f24184b;
                if (gVar7 != null) {
                    i0 i0Var9 = gVar7.f24164h;
                }
            }
        }
        return false;
    }

    public final void c() {
        g gVar = this.f24184b;
        if (gVar != null) {
            gVar.i();
            this.f24184b = null;
        }
        c cVar = this.f24183a;
        if (cVar != null) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            cVar.f24171f = elapsedRealtimeNanos;
            cVar.f24169d = (elapsedRealtimeNanos - cVar.f24170e) + cVar.f24168c;
            cVar.g();
            this.f24183a = null;
        }
    }

    public final void d(i0 screenElementContext) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(screenElementContext, "screenElementContext");
        if (b(screenElementContext)) {
            c cVar = this.f24183a;
            String str3 = "";
            if (cVar == null || (str = cVar.f24166a) == null) {
                str = "";
            }
            g gVar = this.f24184b;
            if (gVar != null && (str2 = gVar.f24166a) != null) {
                str3 = str2;
            }
            f fVar = new f(screenElementContext, str, str3);
            g gVar2 = this.f24184b;
            if (gVar2 != null) {
                gVar2.f24179j.add(fVar);
            }
        }
    }

    public final void e(i0 screenElementContext, HashMap auxData, String str) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(screenElementContext, "screenElementContext");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (b(screenElementContext)) {
            c cVar = this.f24183a;
            String str4 = (cVar == null || (str3 = cVar.f24166a) == null) ? "" : str3;
            g gVar = this.f24184b;
            f fVar = new f(screenElementContext, str4, (gVar == null || (str2 = gVar.f24166a) == null) ? "" : str2, auxData, str);
            g gVar2 = this.f24184b;
            if (gVar2 != null) {
                gVar2.f24179j.add(fVar);
            }
        }
    }

    public final void f(i0 context, qq2.c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24185c = null;
        g(context, a(context, cVar));
    }

    public final void g(i0 i0Var, qq2.c cVar) {
        c cVar2 = this.f24183a;
        if (cVar2 == null && cVar2 == null) {
            c cVar3 = new c();
            cVar3.f();
            this.f24183a = cVar3;
        }
        g gVar = this.f24184b;
        if (gVar != null) {
            gVar.i();
            this.f24184b = null;
        }
        c cVar4 = this.f24183a;
        if (cVar4 != null) {
            this.f24184b = new g(i0Var, cVar4.f24166a, cVar);
        }
    }

    public final void h(i0 screenElementContext) {
        f fVar;
        Intrinsics.checkNotNullParameter(screenElementContext, "screenElementContext");
        g gVar = this.f24184b;
        if (gVar != null) {
            ArrayList arrayList = gVar.f24179j;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                } else {
                    fVar = (f) it.next();
                    if (fVar.f24164h.equals(screenElementContext)) {
                        break;
                    }
                }
            }
            if (fVar != null) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                fVar.f24171f = elapsedRealtimeNanos;
                fVar.f24169d = (elapsedRealtimeNanos - fVar.f24170e) + fVar.f24168c;
                fVar.g();
                arrayList.remove(fVar);
            }
        }
    }
}
