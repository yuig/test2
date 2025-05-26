package pi0;

import android.view.View;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f100172j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f100173k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f100174l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f100175m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100176i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(2);
        this.f100176i = i13;
    }

    public final Integer b(View view, int i13) {
        switch (this.f100176i) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                break;
        }
        return 0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f100176i) {
            case 0:
                b((View) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((View) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((View) obj, ((Number) obj2).intValue());
                break;
            default:
                b((View) obj, ((Number) obj2).intValue());
                break;
        }
        return 0;
    }
}
