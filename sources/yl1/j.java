package yl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f139344b;

    public /* synthetic */ j(int i13, Function1 function1) {
        this.f139343a = i13;
        this.f139344b = function1;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f139343a;
        Function1 onClick = this.f139344b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    onClick.invoke(it);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof am1.g) {
                    onClick.invoke(it);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    onClick.invoke(it);
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(onClick, "$eventIntake");
                Intrinsics.checkNotNullParameter(it, "it");
                onClick.invoke(it);
                break;
            default:
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    onClick.invoke(it);
                    break;
                }
                break;
        }
    }
}
