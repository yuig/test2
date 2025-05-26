package pk;

/* loaded from: classes3.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f100396a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f100397b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f100398c;

    public f1(Object obj, Object obj2, Object obj3) {
        this.f100396a = obj;
        this.f100397b = obj2;
        this.f100398c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb3 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f100396a;
        sb3.append(obj);
        sb3.append("=");
        sb3.append(this.f100397b);
        sb3.append(" and ");
        sb3.append(obj);
        sb3.append("=");
        sb3.append(this.f100398c);
        return new IllegalArgumentException(sb3.toString());
    }
}
