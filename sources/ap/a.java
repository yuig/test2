package ap;

import df.j1;
import pk.a0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f20245a;

    /* renamed from: b, reason: collision with root package name */
    public String f20246b;

    /* renamed from: c, reason: collision with root package name */
    public String f20247c;

    /* renamed from: d, reason: collision with root package name */
    public String f20248d;

    /* renamed from: e, reason: collision with root package name */
    public String f20249e;

    /* renamed from: f, reason: collision with root package name */
    public String f20250f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20251g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20252h;

    /* renamed from: i, reason: collision with root package name */
    public int f20253i;

    public a(long j13) {
        this.f20245a = j13;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j1.T("{\"id\":%d,", Long.valueOf(this.f20245a)));
        if (!a0.x0(this.f20246b)) {
            sb3.append(j1.T("\"name\":\"%s\",", this.f20246b));
        }
        if (!a0.x0(this.f20247c)) {
            sb3.append(j1.T("\"first_name\":\"%s\",", this.f20247c));
        }
        if (!a0.x0(this.f20248d)) {
            sb3.append(j1.T("\"last_name\":\"%s\",", this.f20248d));
        }
        if (!a0.x0(this.f20249e)) {
            sb3.append(j1.T("\"email\":\"%s\",", this.f20249e));
        }
        if (!a0.x0(this.f20250f)) {
            sb3.append(j1.T("\"phone_number\":\"%s\",", this.f20250f));
        }
        sb3.append(j1.T("\"has_photo\":%d,", Integer.valueOf(this.f20251g ? 1 : 0)));
        sb3.append(j1.T("\"is_close_friend\":%d,", Integer.valueOf(this.f20252h ? 1 : 0)));
        sb3.append(j1.T("\"is_facebook_friend\":%d,", 0));
        sb3.append(j1.T("\"num_pieces_of_info\":%d}", Integer.valueOf(this.f20253i)));
        return sb3.toString();
    }
}
