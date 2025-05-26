package cw;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f53317j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f53318k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f53319l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53320i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f53320i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f53320i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, e0.b(vn1.b.FORCE_RIGHT), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f53320i) {
        }
        return b((rn1.a) obj);
    }
}
