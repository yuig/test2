package kq0;

import info.mqtt.android.service.ParcelableMqttMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f80658a;

    /* renamed from: b, reason: collision with root package name */
    public final a f80659b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f80660c;

    public e(f type, a aVar, ParcelableMqttMessage parcelableMqttMessage, ph.a aVar2, int i13) {
        aVar = (i13 & 2) != 0 ? null : aVar;
        parcelableMqttMessage = (i13 & 4) != 0 ? null : parcelableMqttMessage;
        Intrinsics.checkNotNullParameter(type, "type");
        this.f80658a = type;
        this.f80659b = aVar;
        this.f80660c = parcelableMqttMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f80658a != eVar.f80658a || !Intrinsics.d(this.f80659b, eVar.f80659b) || !Intrinsics.d(this.f80660c, eVar.f80660c)) {
            return false;
        }
        eVar.getClass();
        return Intrinsics.d(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f80658a.hashCode() * 31;
        a aVar = this.f80659b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Object obj = this.f80660c;
        return ((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + 0;
    }

    public final String toString() {
        return "MQTTMessageItem(type=" + this.f80658a + ", error=" + this.f80659b + ", message=" + this.f80660c + ", connectionUpdate=" + ((Object) null) + ")";
    }
}
