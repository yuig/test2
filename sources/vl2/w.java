package vl2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends x {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i13, Method method) {
        super(method, true, 4);
        this.f126190f = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(method, "method");
        } else {
            Intrinsics.checkNotNullParameter(method, "method");
            super(method, false, 6);
        }
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        switch (this.f126190f) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                d(kotlin.collections.c0.C(args));
                return e(args.length <= 1 ? new Object[0] : kotlin.collections.z.n(1, args.length, args), null);
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                return e(args, null);
        }
    }
}
