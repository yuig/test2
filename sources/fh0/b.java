package fh0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import xk2.s;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f62152a = new b();

    public b() {
        super(1, gh0.b.class, "buttonFrom", "buttonFrom(Lcom/pinterest/customjson/PinterestJsonObject;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vd0.c p03 = (vd0.c) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new s(gh0.b.E(p03));
    }
}
