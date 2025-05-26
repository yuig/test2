package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class u4 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11827a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f11828b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f11829c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f11830d;

    public u4(a.o8 o8Var, a.o8 o8Var2, xv0 xv0Var, a.o8 o8Var3) {
        this.f11827a = o8Var;
        this.f11828b = o8Var2;
        this.f11829c = xv0Var;
        this.f11830d = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        return new t4((Optional) this.f11827a.get(), (h92) this.f11828b.get(), (Context) this.f11829c.get(), (oh0) this.f11830d.get());
    }
}
