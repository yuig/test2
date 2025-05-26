package ck2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk2.l;
import ps0.o0;
import uj2.o;

/* loaded from: classes2.dex */
public final class h implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27919a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27920b;

    public /* synthetic */ h(ak2.e eVar, int i13) {
        this.f27919a = i13;
        this.f27920b = eVar;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f27919a;
        Object obj2 = this.f27920b;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                i.b(th3, "error is null");
                ((ak2.e) obj2).accept(new o(l.error(th3)));
                break;
            case 1:
                i.b(obj, "value is null");
                ((ak2.e) obj2).accept(new o(obj));
                break;
            default:
                ((Function1) obj2).invoke(obj);
                break;
        }
    }

    public h(o0 function) {
        this.f27919a = 2;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f27920b = function;
    }
}
