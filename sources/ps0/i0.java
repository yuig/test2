package ps0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements ak2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f101272b;

    public i0(int i13, Function1 function) {
        this.f101271a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f101272b = function;
        } else {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f101272b = function;
        }
    }

    @Override // ak2.f
    public final /* synthetic */ Object apply(Object obj) {
        int i13 = this.f101271a;
        Function1 function1 = this.f101272b;
        switch (i13) {
        }
        return function1.invoke(obj);
    }
}
