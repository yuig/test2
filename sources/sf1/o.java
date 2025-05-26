package sf1;

import android.view.View;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112663i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f112664j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f112665k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f112666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f112667m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f112668n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bc2.q qVar, s sVar, String str, String str2, boolean z13) {
        super(1);
        this.f112667m = qVar;
        this.f112664j = sVar;
        this.f112665k = str;
        this.f112668n = str2;
        this.f112666l = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f112663i;
        Object obj2 = this.f112668n;
        s sVar = this.f112664j;
        Object obj3 = this.f112667m;
        switch (i13) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f112666l && ((Integer) obj3) != null) {
                    w0 w0Var = sVar.C;
                    if (w0Var != null) {
                        w0Var.c((qf1.x) obj2);
                    }
                    g70.h hVar = sVar.f112719z;
                    if (hVar == null) {
                        Intrinsics.r("boardNavigator");
                        throw null;
                    }
                    g70.h.g(hVar, this.f112665k, null, null, 6);
                }
                return Unit.f80348a;
            default:
                PinterestVideoView videoView = (PinterestVideoView) obj;
                Intrinsics.checkNotNullParameter(videoView, "videoView");
                bc2.q qVar = (bc2.q) obj3;
                r1 r1Var = sVar.B;
                m60.w s13 = sVar.s();
                String str = (String) obj2;
                nx.d0 d0Var = sVar.f112698e;
                nx.d1 d1Var = sVar.f112710q;
                if (d1Var == null) {
                    Intrinsics.r("trackingParamAttacher");
                    throw null;
                }
                lb0.q qVar2 = sVar.f112718y;
                if (qVar2 != null) {
                    return new u(videoView, qVar, r1Var, s13, this.f112665k, str, this.f112666l, d0Var, d1Var, qVar2);
                }
                Intrinsics.r("prefsManagerPersisted");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z13, Integer num, s sVar, qf1.x xVar, String str) {
        super(1);
        this.f112666l = z13;
        this.f112667m = num;
        this.f112664j = sVar;
        this.f112668n = xVar;
        this.f112665k = str;
    }
}
