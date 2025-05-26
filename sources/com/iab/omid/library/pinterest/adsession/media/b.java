package com.iab.omid.library.pinterest.adsession.media;

import androidx.appcompat.widget.z2;
import bk.q;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import df.j1;
import e2.g0;
import fn.f;
import fn.i;
import hn.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i f34021a;

    public /* synthetic */ b(i iVar) {
        this.f34021a = iVar;
    }

    public static b e(i iVar) {
        if (iVar.f62595e.f77071c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        j1.q(iVar);
        b bVar = new b(iVar);
        iVar.f62595e.f77071c = bVar;
        return bVar;
    }

    public static b f(i iVar) {
        g0 g0Var = iVar.f62592b;
        g0Var.getClass();
        if (f.NATIVE != ((f) g0Var.f56858c)) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
        if (iVar.f62596f) {
            throw new IllegalStateException("AdSession is started");
        }
        j1.q(iVar);
        jn.b bVar = iVar.f62595e;
        if (bVar.f77072d != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
        b bVar2 = new b(iVar);
        bVar.f77072d = bVar2;
        return bVar2;
    }

    public void a(a aVar) {
        j1.b(aVar, "InteractionType is null");
        i iVar = this.f34021a;
        j1.a(iVar);
        JSONObject jSONObject = new JSONObject();
        kn.b.b(jSONObject, "interactionType", aVar);
        iVar.f62595e.d("adUserInteraction", jSONObject);
    }

    public void b() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("bufferFinish", null);
    }

    public void c() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("bufferStart", null);
    }

    public void d() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("complete", null);
    }

    public void g() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("firstQuartile", null);
    }

    public void h() {
        i iVar = this.f34021a;
        j1.q(iVar);
        j1.R(iVar);
        if (!iVar.f62596f || iVar.f62597g) {
            try {
                iVar.f();
            } catch (Exception unused) {
            }
        }
        if (!iVar.f62596f || iVar.f62597g) {
            return;
        }
        if (iVar.f62599i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        jn.b bVar = iVar.f62595e;
        h.f69603a.a(bVar.j(), "publishImpressionEvent", bVar.f77069a);
        iVar.f62599i = true;
    }

    public void i() {
        i iVar = this.f34021a;
        j1.a(iVar);
        j1.R(iVar);
        if (iVar.f62600j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        jn.b bVar = iVar.f62595e;
        h.f69603a.a(bVar.j(), "publishLoadedEvent", null, bVar.f77069a);
        iVar.f62600j = true;
    }

    public void j(z2 z2Var) {
        i iVar = this.f34021a;
        j1.a(iVar);
        j1.R(iVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", z2Var.f16748a);
            if (z2Var.f16748a) {
                jSONObject.put("skipOffset", (Float) z2Var.f16750c);
            }
            jSONObject.put("autoPlay", z2Var.f16749b);
            jSONObject.put("position", (d) z2Var.f16751d);
        } catch (JSONException e13) {
            el.a.k("VastProperties: JSON error", e13);
        }
        if (iVar.f62600j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        jn.b bVar = iVar.f62595e;
        h.f69603a.a(bVar.j(), "publishLoadedEvent", jSONObject, bVar.f77069a);
        iVar.f62600j = true;
    }

    public void k() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("midpoint", null);
    }

    public void l() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("pause", null);
    }

    public void m(c cVar) {
        j1.b(cVar, "PlayerState is null");
        i iVar = this.f34021a;
        j1.a(iVar);
        JSONObject jSONObject = new JSONObject();
        kn.b.b(jSONObject, AnimatedTarget.PROPERTY_STATE, cVar);
        iVar.f62595e.d("playerStateChange", jSONObject);
    }

    public void n() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("resume", null);
    }

    public void o(float f13, float f14) {
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f14 < 0.0f || f14 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        i iVar = this.f34021a;
        j1.a(iVar);
        JSONObject jSONObject = new JSONObject();
        kn.b.b(jSONObject, "duration", Float.valueOf(f13));
        kn.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f14));
        kn.b.b(jSONObject, "deviceVolume", Float.valueOf(q.b().f23105a));
        iVar.f62595e.d("start", jSONObject);
    }

    public void p() {
        i iVar = this.f34021a;
        j1.a(iVar);
        iVar.f62595e.d("thirdQuartile", null);
    }

    public void q(float f13) {
        if (f13 < 0.0f || f13 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        i iVar = this.f34021a;
        j1.a(iVar);
        JSONObject jSONObject = new JSONObject();
        kn.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f13));
        kn.b.b(jSONObject, "deviceVolume", Float.valueOf(q.b().f23105a));
        iVar.f62595e.d("volumeChange", jSONObject);
    }
}
