package df;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f54865a;

    /* renamed from: b, reason: collision with root package name */
    public u1 f54866b;

    /* renamed from: c, reason: collision with root package name */
    public u1 f54867c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1 f54869e;

    public u1(v1 this$0, Runnable callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f54869e = this$0;
        this.f54865a = callback;
    }

    public final u1 a(u1 u1Var, boolean z13) {
        gi2.b.O(this.f54866b == null);
        gi2.b.O(this.f54867c == null);
        if (u1Var == null) {
            this.f54867c = this;
            this.f54866b = this;
            u1Var = this;
        } else {
            this.f54866b = u1Var;
            u1 u1Var2 = u1Var.f54867c;
            this.f54867c = u1Var2;
            if (u1Var2 != null) {
                u1Var2.f54866b = this;
            }
            u1 u1Var3 = this.f54866b;
            if (u1Var3 != null) {
                u1Var3.f54867c = u1Var2 == null ? null : u1Var2.f54866b;
            }
        }
        return z13 ? this : u1Var;
    }

    public final u1 b(u1 u1Var) {
        gi2.b.O(this.f54866b != null);
        gi2.b.O(this.f54867c != null);
        if (u1Var == this && (u1Var = this.f54866b) == this) {
            u1Var = null;
        }
        u1 u1Var2 = this.f54866b;
        if (u1Var2 != null) {
            u1Var2.f54867c = this.f54867c;
        }
        u1 u1Var3 = this.f54867c;
        if (u1Var3 != null) {
            u1Var3.f54866b = u1Var2;
        }
        this.f54867c = null;
        this.f54866b = null;
        return u1Var;
    }
}
