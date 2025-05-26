package vl2;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f126159a = new c0();

    @Override // vl2.g
    public final List a() {
        return q0.f80391a;
    }

    @Override // vl2.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // vl2.g
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        return TYPE;
    }
}
