package me;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    public static final int f87023f;

    /* renamed from: a, reason: collision with root package name */
    public final df.c f87024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87025b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f87026c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f87027d;

    /* renamed from: e, reason: collision with root package name */
    public int f87028e;

    static {
        Intrinsics.checkNotNullExpressionValue(u.class.getSimpleName(), "SessionEventsState::class.java.simpleName");
        f87023f = 1000;
    }

    public u(df.c attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f87024a = attributionIdentifiers;
        this.f87025b = anonymousAppDeviceGUID;
        this.f87026c = new ArrayList();
        this.f87027d = new ArrayList();
    }

    public final synchronized void a(e event) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f87026c.size() + this.f87027d.size() >= f87023f) {
                this.f87028e++;
            } else {
                this.f87026c.add(event);
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final synchronized void b(boolean z13) {
        if (p001if.a.b(this)) {
            return;
        }
        if (z13) {
            try {
                this.f87026c.addAll(this.f87027d);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return;
            }
        }
        this.f87027d.clear();
        this.f87028e = 0;
    }

    public final synchronized List c() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f87026c;
            this.f87026c = new ArrayList();
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final int d(a0 request, Context applicationContext, boolean z13, boolean z14) {
        if (p001if.a.b(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                try {
                    int i13 = this.f87028e;
                    re.b bVar = re.b.f107532a;
                    re.b.b(this.f87026c);
                    this.f87027d.addAll(this.f87026c);
                    this.f87026c.clear();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f87027d.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        String str = eVar.f86984e;
                        if (str != null) {
                            String jSONObject = eVar.f86980a.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
                            if (!Intrinsics.d(com.bugsnag.android.a0.m(jSONObject), str)) {
                                Intrinsics.n(eVar, "Event with invalid checksum: ");
                                le.v vVar = le.v.f83104a;
                            }
                        }
                        if (z13 || !eVar.f86981b) {
                            jSONArray.put(eVar.f86980a);
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    Unit unit = Unit.f80348a;
                    e(request, applicationContext, i13, jSONArray, z14);
                    return jSONArray.length();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return 0;
        }
    }

    public final void e(a0 a0Var, Context context, int i13, JSONArray jSONArray, boolean z13) {
        JSONObject jSONObject;
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                HashMap hashMap = ue.e.f121949a;
                jSONObject = ue.e.a(ue.d.CUSTOM_APP_EVENTS, this.f87024a, this.f87025b, z13, context);
                if (this.f87028e > 0) {
                    jSONObject.put("num_skipped_events", i13);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            a0Var.f83008c = jSONObject;
            Bundle bundle = a0Var.f83009d;
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            bundle.putString("custom_events", jSONArray2);
            a0Var.f83010e = jSONArray2;
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            a0Var.f83009d = bundle;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
