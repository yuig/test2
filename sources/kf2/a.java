package kf2;

import a.cb;
import ep.b;
import hf2.q;
import kotlin.jvm.internal.Intrinsics;
import mp2.i;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f79356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79358c;

    /* renamed from: d, reason: collision with root package name */
    public final i f79359d;

    /* renamed from: e, reason: collision with root package name */
    public final q f79360e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79361f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f79362g;

    /* renamed from: h, reason: collision with root package name */
    public final long f79363h;

    public a(String messageId, String clientHandle, String topic, i mqttMessage, q qos, boolean z13, boolean z14, long j13) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(clientHandle, "clientHandle");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(mqttMessage, "mqttMessage");
        Intrinsics.checkNotNullParameter(qos, "qos");
        this.f79356a = messageId;
        this.f79357b = clientHandle;
        this.f79358c = topic;
        this.f79359d = mqttMessage;
        this.f79360e = qos;
        this.f79361f = z13;
        this.f79362g = z14;
        this.f79363h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f79356a, aVar.f79356a) && Intrinsics.d(this.f79357b, aVar.f79357b) && Intrinsics.d(this.f79358c, aVar.f79358c) && Intrinsics.d(this.f79359d, aVar.f79359d) && this.f79360e == aVar.f79360e && this.f79361f == aVar.f79361f && this.f79362g == aVar.f79362g && this.f79363h == aVar.f79363h;
    }

    public final int hashCode() {
        return Long.hashCode(this.f79363h) + b.e(this.f79362g, b.e(this.f79361f, (this.f79360e.hashCode() + ((this.f79359d.hashCode() + cb.d(this.f79358c, cb.d(this.f79357b, this.f79356a.hashCode() * 31, 31), 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MqMessageEntity(messageId=");
        sb3.append(this.f79356a);
        sb3.append(", clientHandle=");
        sb3.append(this.f79357b);
        sb3.append(", topic=");
        sb3.append(this.f79358c);
        sb3.append(", mqttMessage=");
        sb3.append(this.f79359d);
        sb3.append(", qos=");
        sb3.append(this.f79360e);
        sb3.append(", retained=");
        sb3.append(this.f79361f);
        sb3.append(", duplicate=");
        sb3.append(this.f79362g);
        sb3.append(", timestamp=");
        return a.a.o(sb3, this.f79363h, ")");
    }
}
