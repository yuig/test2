package sk0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final w f113084j = new w(0);

    /* renamed from: k, reason: collision with root package name */
    public static final w f113085k = new w(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113086i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13) {
        super(1);
        this.f113086i = i13;
    }

    public final d b(d it) {
        switch (this.f113086i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, true, 7);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, false, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f113086i) {
        }
        return b((d) obj);
    }
}
