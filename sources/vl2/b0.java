package vl2;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Method f126149a;

    /* renamed from: b, reason: collision with root package name */
    public final List f126150b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f126151c;

    public b0(Method method, List list) {
        this.f126149a = method;
        this.f126150b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.f126151c = returnType;
    }

    @Override // vl2.g
    public final List a() {
        return this.f126150b;
    }

    @Override // vl2.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // vl2.g
    public final Type getReturnType() {
        return this.f126151c;
    }
}
