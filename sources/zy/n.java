package zy;

import h32.c1;
import h32.f1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f143090a;

    /* renamed from: b, reason: collision with root package name */
    public final kg.a f143091b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f143092c;

    /* renamed from: d, reason: collision with root package name */
    public final String f143093d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f143094e;

    /* renamed from: f, reason: collision with root package name */
    public final c1 f143095f;

    public n(h32.i0 context, kg.a impression, f1 eventType, String str, HashMap hashMap, int i13) {
        hashMap = (i13 & 16) != 0 ? null : hashMap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(impression, "impression");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f143090a = context;
        this.f143091b = impression;
        this.f143092c = eventType;
        this.f143093d = str;
        this.f143094e = hashMap;
        this.f143095f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f143090a, nVar.f143090a) && Intrinsics.d(this.f143091b, nVar.f143091b) && this.f143092c == nVar.f143092c && Intrinsics.d(this.f143093d, nVar.f143093d) && Intrinsics.d(this.f143094e, nVar.f143094e) && Intrinsics.d(this.f143095f, nVar.f143095f);
    }

    public final int hashCode() {
        int hashCode = (this.f143092c.hashCode() + ((this.f143091b.hashCode() + (this.f143090a.hashCode() * 31)) * 31)) * 31;
        String str = this.f143093d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HashMap hashMap = this.f143094e;
        int hashCode3 = (hashCode2 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        c1 c1Var = this.f143095f;
        return hashCode3 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final String toString() {
        return "ImpressionParams(context=" + this.f143090a + ", impression=" + this.f143091b + ", eventType=" + this.f143092c + ", id=" + this.f143093d + ", auxData=" + this.f143094e + ", eventData=" + this.f143095f + ")";
    }
}
