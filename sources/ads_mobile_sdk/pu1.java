package ads_mobile_sdk;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class pu1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9816b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9817c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9818d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9819e;

    /* renamed from: f, reason: collision with root package name */
    public final yn0 f9820f;

    /* renamed from: g, reason: collision with root package name */
    public final xn0 f9821g;

    static {
        new UUID(0L, 0L).toString();
    }

    public pu1(Context context, String str, String str2, String str3) {
        this.f9820f = yn0.a(context);
        this.f9821g = xn0.a(context);
        this.f9815a = str;
        this.f9816b = str.concat("_3p");
        this.f9817c = str2;
        this.f9818d = str2.concat("_3p");
        this.f9819e = str3;
    }

    public final wn0 a(String str, boolean z13) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(a.a.p(new StringBuilder(), this.f9819e, ": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f9820f.a(Long.valueOf(currentTimeMillis), z13 ? this.f9818d : this.f9817c);
        this.f9820f.a(str, z13 ? this.f9816b : this.f9815a);
        return new wn0(currentTimeMillis, str);
    }

    public final wn0 a(long j13) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            yn0 yn0Var = this.f9820f;
            long j14 = yn0Var.f14342b.getLong(this.f9817c, -1L);
            if (j14 != -1) {
                if (currentTimeMillis < j14) {
                    this.f9820f.a(Long.valueOf(currentTimeMillis), this.f9817c);
                } else if (currentTimeMillis >= j14 + j13) {
                    return a(UUID.randomUUID().toString(), false);
                }
            }
            yn0 yn0Var2 = this.f9820f;
            String string = yn0Var2.f14342b.getString(this.f9815a, null);
            if (string == null) {
                return a(UUID.randomUUID().toString(), false);
            }
            yn0 yn0Var3 = this.f9820f;
            return new wn0(yn0Var3.f14342b.getLong(this.f9817c, -1L), string);
        }
        throw new IllegalStateException(a.a.p(new StringBuilder(), this.f9819e, ": Invalid negative current timestamp. Updating PAID failed"));
    }
}
