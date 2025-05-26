package qb;

import kb.b0;
import kb.c0;
import kotlin.jvm.internal.Intrinsics;
import pb.h;
import tb.s;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f103386b;

    static {
        Intrinsics.checkNotNullExpressionValue(b0.h("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rb.f tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f103386b = 7;
    }

    @Override // qb.e
    public final boolean a(s workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f117025j.f78989a == c0.METERED;
    }

    @Override // qb.c
    public final int d() {
        return this.f103386b;
    }

    @Override // qb.c
    public final boolean e(Object obj) {
        h value = (h) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.f99416a && value.f99418c) ? false : true;
    }
}
