package mg;

import android.content.Context;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f87132a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.a f87133b;

    /* renamed from: c, reason: collision with root package name */
    public final tg.a f87134c;

    /* renamed from: d, reason: collision with root package name */
    public final String f87135d;

    public a(Context context, tg.a aVar, tg.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f87132a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f87133b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f87134c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f87135d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f87132a.equals(((a) bVar).f87132a)) {
            a aVar = (a) bVar;
            if (this.f87133b.equals(aVar.f87133b) && this.f87134c.equals(aVar.f87134c) && this.f87135d.equals(aVar.f87135d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f87132a.hashCode() ^ 1000003) * 1000003) ^ this.f87133b.hashCode()) * 1000003) ^ this.f87134c.hashCode()) * 1000003) ^ this.f87135d.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreationContext{applicationContext=");
        sb3.append(this.f87132a);
        sb3.append(", wallClock=");
        sb3.append(this.f87133b);
        sb3.append(", monotonicClock=");
        sb3.append(this.f87134c);
        sb3.append(", backendName=");
        return a.a.p(sb3, this.f87135d, "}");
    }
}
