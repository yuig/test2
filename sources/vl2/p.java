package vl2;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Field field, boolean z13, int i13) {
        super(field, z13, true);
        this.f126185f = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(field, "field");
            super(field, z13, true);
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(field, "field");
        } else {
            Intrinsics.checkNotNullParameter(field, "field");
            super(field, z13, false);
        }
    }

    @Override // vl2.q, vl2.y
    public final void c(Object[] args) {
        switch (this.f126185f) {
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                super.c(args);
                d(kotlin.collections.c0.C(args));
                break;
            default:
                super.c(args);
                break;
        }
    }
}
