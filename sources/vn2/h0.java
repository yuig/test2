package vn2;

import ao2.m0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h0 implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f126323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126324b;

    public h0(String str, Function1 function1) {
        this.f126323a = function1;
        this.f126324b = "must return ".concat(str);
    }

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.d(functionDescriptor.getReturnType(), this.f126323a.invoke(fn2.d.e(functionDescriptor)));
    }

    @Override // vn2.e
    public final String b(am2.x xVar) {
        return m0.Q(this, xVar);
    }

    @Override // vn2.e
    public final String getDescription() {
        return this.f126324b;
    }
}
