package rc0;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.badge.GestaltBadge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107267i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u50.i0 f107268j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ul1.l f107269k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f107270l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u50.i0 i0Var, ul1.l lVar, boolean z13, int i13) {
        super(1);
        this.f107267i = i13;
        this.f107268j = i0Var;
        this.f107269k = lVar;
        this.f107270l = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f107267i;
        boolean z13 = this.f107270l;
        ul1.l variant = this.f107269k;
        u50.i0 text = this.f107268j;
        switch (i13) {
            case 0:
                ul1.p bind = (ul1.p) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f122479a = text;
                Intrinsics.checkNotNullParameter(variant, "variant");
                bind.f122481c = variant;
                bind.f122484f = z13;
                return Unit.f80348a;
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                GestaltBadge gestaltBadge = new GestaltBadge(6, context, (AttributeSet) null);
                b init = new b(text, variant, z13, 0);
                Intrinsics.checkNotNullParameter(gestaltBadge, "<this>");
                Intrinsics.checkNotNullParameter(init, "init");
                ul1.p pVar = new ul1.p((ul1.c) ((u50.o) gestaltBadge.f49283a.f33803a));
                init.invoke(pVar);
                gestaltBadge.k(new ql1.k(pVar, 5));
                return gestaltBadge;
        }
    }
}
