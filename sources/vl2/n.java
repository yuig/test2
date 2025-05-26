package vl2;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends q implements f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f126184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Field field, boolean z13, Object obj) {
        super(field, z13, false);
        Intrinsics.checkNotNullParameter(field, "field");
        this.f126184f = obj;
    }

    @Override // vl2.q, vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        c(args);
        ((Field) this.f126192a).set(this.f126184f, kotlin.collections.c0.B(args));
        return Unit.f80348a;
    }
}
