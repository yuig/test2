package db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f54279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54280b;

    /* renamed from: c, reason: collision with root package name */
    public final l f54281c;

    /* renamed from: d, reason: collision with root package name */
    public final i f54282d;

    public k(Object value, l verificationMode, i logger) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("h", "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f54279a = value;
        this.f54280b = "h";
        this.f54281c = verificationMode;
        this.f54282d = logger;
    }

    @Override // db.j
    public final Object a() {
        return this.f54279a;
    }

    @Override // db.j
    public final j c(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return ((Boolean) condition.invoke(this.f54279a)).booleanValue() ? this : new h(this.f54279a, this.f54280b, message, this.f54282d, this.f54281c);
    }
}
