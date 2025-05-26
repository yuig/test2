package pn1;

import android.content.res.TypedArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f100732j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f100733k = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100734i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f100734i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100734i) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                break;
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                um1.d bind = (um1.d) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122799d = i.tab_badge_number;
                break;
        }
        return Unit.f80348a;
    }
}
