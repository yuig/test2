package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tu1 {

    /* renamed from: a, reason: collision with root package name */
    public final oh0 f11698a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11699b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.k f11700c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.k f11701d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f11702e;

    public tu1(Context context, oh0 flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11698a = flags;
        this.f11699b = context;
        this.f11700c = xk2.m.b(new ru1(this));
        this.f11701d = xk2.m.b(new su1(this));
        this.f11702e = xk2.m.b(new qu1(this));
    }

    public final void a() {
        try {
            vu1 vu1Var = (vu1) this.f11700c.getValue();
            vu1Var.getClass();
            synchronized (vu1.class) {
                vu1Var.f9820f.a(vu1Var.f9817c);
                vu1Var.f9820f.a(vu1Var.f9815a);
            }
        } catch (Exception e13) {
            Intrinsics.checkNotNullParameter("Exception while clearing PAIDV1", "message");
            cs2 a13 = qs2.a();
            a13.f().f6994p.add("Exception while clearing PAIDV1");
            a13.f().f6988j = false;
            a13.a(e13);
        }
    }

    public final void b() {
        try {
            wu1 wu1Var = (wu1) this.f11701d.getValue();
            wu1Var.getClass();
            synchronized (wu1.class) {
                try {
                    yn0 yn0Var = wu1Var.f9820f;
                    if (yn0Var.f14342b.contains(wu1Var.f9815a)) {
                        wu1Var.f9820f.a(wu1Var.f9817c);
                        wu1Var.f9820f.a(wu1Var.f9815a);
                    }
                } finally {
                }
            }
        } catch (Exception e13) {
            Intrinsics.checkNotNullParameter("Exception while clearing PAIDV2", "message");
            cs2 a13 = qs2.a();
            a13.f().f6994p.add("Exception while clearing PAIDV2");
            a13.f().f6988j = false;
            a13.a(e13);
        }
    }
}
