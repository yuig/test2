package uq;

import android.text.Editable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Editable f123007j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, Editable editable) {
        super(1);
        this.f123006i = i13;
        this.f123007j = editable;
    }

    public final yl1.b b(yl1.b displayState) {
        int i13 = this.f123006i;
        Editable editable = this.f123007j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return yl1.b.f(displayState, null, editable.length() > 0, null, null, null, null, null, null, 0, null, 1021);
            case 2:
                Intrinsics.checkNotNullParameter(displayState, "state");
                return yl1.b.f(displayState, null, tr1.b.c(editable.toString()), null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(displayState, "state");
                return yl1.b.f(displayState, null, editable.length() > 0, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123006i) {
            case 0:
                wn1.d it = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((yl1.b) obj);
    }
}
