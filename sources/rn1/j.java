package rn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f108883j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f108884k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f108885i = i13;
    }

    public final a b(a it) {
        switch (this.f108885i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.y(it, null, null, null, null, null, 0, fm1.c.INVISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a.y(it, null, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f108885i) {
        }
        return b((a) obj);
    }
}
