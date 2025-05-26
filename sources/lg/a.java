package lg;

import java.util.Map;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83172a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f83173b;

    /* renamed from: c, reason: collision with root package name */
    public final e f83174c;

    /* renamed from: d, reason: collision with root package name */
    public final long f83175d;

    /* renamed from: e, reason: collision with root package name */
    public final long f83176e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f83177f;

    public a(String str, Integer num, e eVar, long j13, long j14, Map map) {
        this.f83172a = str;
        this.f83173b = num;
        this.f83174c = eVar;
        this.f83175d = j13;
        this.f83176e = j14;
        this.f83177f = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f83172a.equals(aVar.f83172a)) {
            Integer num = aVar.f83173b;
            Integer num2 = this.f83173b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f83174c.equals(aVar.f83174c) && this.f83175d == aVar.f83175d && this.f83176e == aVar.f83176e && this.f83177f.equals(aVar.f83177f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f83172a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f83173b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f83174c.hashCode()) * 1000003;
        long j13 = this.f83175d;
        int i13 = (hashCode2 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f83176e;
        return ((i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ this.f83177f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f83172a + ", code=" + this.f83173b + ", encodedPayload=" + this.f83174c + ", eventMillis=" + this.f83175d + ", uptimeMillis=" + this.f83176e + ", autoMetadata=" + this.f83177f + "}";
    }
}
