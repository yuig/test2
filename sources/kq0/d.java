package kq0;

import df.j1;
import g4.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Properties;
import kotlin.jvm.internal.Intrinsics;
import mp2.g;
import nm.o;
import org.eclipse.paho.client.mqttv3.MqttException;
import tb0.h;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final h f80650a;

    /* renamed from: b, reason: collision with root package name */
    public final g f80651b;

    /* renamed from: c, reason: collision with root package name */
    public final u f80652c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f80653d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f80654e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f80655f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f80656g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f80657h;

    public d(o gson, h crashReporting, f30.b apiUtils) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
        this.f80650a = crashReporting;
        g gVar = new g();
        gVar.f87940c = true;
        gVar.f87938a = false;
        Properties properties = new Properties();
        properties.setProperty("Authorization", j1.U("Bearer %s", new Object[]{c60.d.a()}));
        properties.setProperty("User-Agent", (String) apiUtils.f60987g.getValue());
        gVar.f87939b = 4;
        this.f80651b = gVar;
        this.f80652c = new u();
        this.f80653d = new LinkedHashMap();
        this.f80654e = new LinkedHashMap();
        this.f80655f = new LinkedHashMap();
        this.f80656g = new LinkedHashMap();
        this.f80657h = new LinkedHashMap();
    }

    public final void a(String str, String str2) {
        uk2.f fVar = (uk2.f) this.f80654e.get(str);
        if (fVar != null) {
            fVar.c(new e(f.Error, new a(true, false, str2), null, null, 12));
        }
    }

    public final void b(String str, String str2) {
        hf2.e eVar = (hf2.e) this.f80653d.get(str);
        if (eVar == null) {
            return;
        }
        try {
            c callback = new c(this, str);
            Intrinsics.checkNotNullParameter(callback, "callback");
            ArrayList arrayList = eVar.f69029m;
            arrayList.clear();
            arrayList.add(callback);
            this.f80655f.put(str, eVar.d(this.f80651b, new b(eVar, this, str, str2)));
        } catch (MqttException unused) {
            a(str, "MqttException on connection establish");
        }
    }
}
