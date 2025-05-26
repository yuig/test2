package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23199a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.c1 f23200b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f23201c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23202d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23204f;

    public d(f30 pin, h32.c1 eventData, Integer num, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f23199a = pin;
        this.f23200b = eventData;
        this.f23201c = num;
        this.f23202d = str;
        this.f23203e = z13;
        this.f23204f = z14;
    }

    public final Integer a() {
        return this.f23201c;
    }

    public final h32.c1 b() {
        return this.f23200b;
    }

    public final f30 c() {
        return this.f23199a;
    }

    public final boolean d() {
        return this.f23203e;
    }

    public final boolean e() {
        return this.f23204f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f23199a, dVar.f23199a) && Intrinsics.d(this.f23200b, dVar.f23200b) && Intrinsics.d(this.f23201c, dVar.f23201c) && Intrinsics.d(this.f23202d, dVar.f23202d) && this.f23203e == dVar.f23203e && this.f23204f == dVar.f23204f;
    }

    public final int hashCode() {
        int hashCode = (this.f23200b.hashCode() + (this.f23199a.hashCode() * 31)) * 31;
        Integer num = this.f23201c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f23202d;
        return Boolean.hashCode(this.f23204f) + ep.b.e(this.f23203e, ep.b.e(true, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AttemptDeepLink(pin=");
        sb3.append(this.f23199a);
        sb3.append(", eventData=");
        sb3.append(this.f23200b);
        sb3.append(", collectionSelectedPosition=");
        sb3.append(this.f23201c);
        sb3.append(", storyType=");
        sb3.append(this.f23202d);
        sb3.append(", shouldLog=true, shouldLogPrice=");
        sb3.append(this.f23203e);
        sb3.append(", shouldLogRating=");
        return a.a.r(sb3, this.f23204f, ")");
    }
}
