package mj0;

import android.content.Context;
import ao2.j0;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinGridFlipContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.f0;
import nx.d0;
import qa2.n;
import wa2.m;
import yq0.z;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f87272j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f87273k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d0 f87274l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f87275m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, z zVar, d0 d0Var, n nVar, int i13) {
        super(0);
        this.f87271i = i13;
        this.f87272j = context;
        this.f87273k = zVar;
        this.f87274l = d0Var;
        this.f87275m = nVar;
    }

    public final OneTapSavePinGridFlipContainer b() {
        int i13 = this.f87271i;
        n nVar = this.f87275m;
        z zVar = this.f87273k;
        switch (i13) {
            case 1:
                j0 j0Var = zVar.f139760f;
                m i03 = f0.i0(nVar.f103320a);
                return new OneTapSavePinGridFlipContainer(this.f87272j, false, j0Var, this.f87274l, i03);
            default:
                j0 j0Var2 = zVar.f139760f;
                m i04 = f0.i0(nVar.f103320a);
                return new OneTapSavePinGridFlipContainer(this.f87272j, true, j0Var2, this.f87274l, i04);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f87271i) {
            case 0:
                j0 j0Var = this.f87273k.f139760f;
                break;
        }
        return b();
    }
}
