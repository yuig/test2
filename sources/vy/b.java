package vy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f126846b;

    public /* synthetic */ b(int i13, Function0 function0) {
        this.f126845a = i13;
        this.f126846b = function0;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f126845a;
        Function0 doAfterSend = this.f126846b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(doAfterSend, "$doAfterSend");
                doAfterSend.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(doAfterSend, "$tmp0");
                doAfterSend.invoke();
                break;
        }
    }
}
