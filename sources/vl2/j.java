package vl2;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends m implements f {

    /* renamed from: e, reason: collision with root package name */
    public final Object f126182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Field field, Object obj) {
        super(field, false);
        Intrinsics.checkNotNullParameter(field, "field");
        this.f126182e = obj;
    }

    @Override // vl2.m, vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        return ((Field) this.f126192a).get(this.f126182e);
    }
}
