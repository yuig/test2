package kq0;

import info.mqtt.android.service.ParcelableMqttMessage;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mp2.h;

/* loaded from: classes5.dex */
public final class c implements mp2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f80648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f80649b;

    public c(d dVar, String str) {
        this.f80648a = dVar;
        this.f80649b = str;
    }

    @Override // mp2.e
    public final void a(Exception exc) {
        this.f80648a.a(this.f80649b, "Connection lost");
    }

    @Override // mp2.e
    public final void b(String str, ParcelableMqttMessage parcelableMqttMessage) {
        d dVar = this.f80648a;
        uk2.f fVar = (uk2.f) dVar.f80654e.get(this.f80649b);
        if (fVar == null) {
            return;
        }
        f fVar2 = f.ChatEvent;
        fVar.c(new e(fVar2, null, parcelableMqttMessage, null, 10));
        uk2.f fVar3 = (uk2.f) dVar.f80657h.get(str);
        if (fVar3 != null) {
            fVar3.c(new e(fVar2, null, parcelableMqttMessage, null, 10));
        }
    }

    @Override // mp2.e
    public final void c(String str, boolean z13) {
        if (z13) {
            d dVar = this.f80648a;
            LinkedHashMap linkedHashMap = dVar.f80656g;
            String mqttEndpoint = this.f80649b;
            List<String> list = (List) linkedHashMap.get(mqttEndpoint);
            if (list == null) {
                return;
            }
            for (String pubSubTopicId : list) {
                Intrinsics.checkNotNullParameter(mqttEndpoint, "mqttEndpoint");
                Intrinsics.checkNotNullParameter(pubSubTopicId, "pubSubTopicId");
                hf2.e eVar = (hf2.e) dVar.f80653d.get(mqttEndpoint);
                if (eVar != null) {
                    eVar.isConnected();
                }
            }
        }
    }

    @Override // mp2.e
    public final void d(h hVar) {
    }
}
