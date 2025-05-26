package x02;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class a extends t1 {

    /* renamed from: f, reason: collision with root package name */
    public String f131286f;

    /* renamed from: g, reason: collision with root package name */
    public String f131287g;

    /* renamed from: h, reason: collision with root package name */
    public String f131288h;

    public a(int i13, String str, String str2) {
        super(i13);
        this.f131286f = str;
        this.f131287g = str2;
    }

    @Override // x02.t1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f131286f.equals(aVar.f131286f) && Objects.equals(this.f131287g, aVar.f131287g) && Objects.equals(this.f131288h, aVar.f131288h);
    }

    @Override // x02.t1
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f131286f, this.f131287g, this.f131288h);
    }
}
