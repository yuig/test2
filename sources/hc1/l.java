package hc1;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f68729j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f68730k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Context context, n nVar, int i13) {
        super(0);
        this.f68728i = i13;
        this.f68729j = context;
        this.f68730k = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f68728i;
        n nVar = this.f68730k;
        Context context = this.f68729j;
        switch (i13) {
            case 0:
                return new lc1.i(context, new k(nVar, 0));
            case 1:
                jc1.g gVar = nVar.J0;
                if (gVar != null) {
                    return new lc1.m(context, gVar);
                }
                Intrinsics.r("viewListener");
                throw null;
            case 2:
                jc1.g gVar2 = nVar.J0;
                if (gVar2 != null) {
                    return new lc1.c(context, gVar2);
                }
                Intrinsics.r("viewListener");
                throw null;
            case 3:
                return new lc1.e(context, new k(nVar, 1));
            case 4:
                return new lc1.h(context, new m(0, this.f68730k, n.class, "handleUpdateProfilePicture", "handleUpdateProfilePicture()V", 0));
            default:
                return new lc1.l(context, nVar.I0);
        }
    }
}
