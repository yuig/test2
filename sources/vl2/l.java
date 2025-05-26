package vl2;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f126183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Field field, int i13) {
        super(field, true);
        this.f126183e = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(field, "field");
            super(field, true);
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(field, "field");
        } else {
            Intrinsics.checkNotNullParameter(field, "field");
            super(field, false);
        }
    }

    @Override // vl2.y
    public final void c(Object[] args) {
        switch (this.f126183e) {
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                d(kotlin.collections.c0.C(args));
                break;
            default:
                dl2.b.F(this, args);
                break;
        }
    }
}
