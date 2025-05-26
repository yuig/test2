package sf1;

import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bc2.q f112630i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f112631j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f112632k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f112633l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f112634m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ double f112635n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f112636o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(bc2.q qVar, s sVar, String str, String str2, double d2, double d13, boolean z13) {
        super(1);
        this.f112630i = qVar;
        this.f112631j = sVar;
        this.f112632k = str;
        this.f112633l = str2;
        this.f112634m = d2;
        this.f112635n = d13;
        this.f112636o = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PinterestVideoView videoView = (PinterestVideoView) obj;
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        s sVar = this.f112631j;
        r1 r1Var = sVar.B;
        m60.w s13 = sVar.s();
        nx.d0 d0Var = sVar.f112698e;
        nx.d1 d1Var = sVar.f112710q;
        if (d1Var == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        return new v(videoView, this.f112630i, r1Var, s13, this.f112632k, this.f112633l, this.f112634m, this.f112635n, this.f112636o, d0Var, d1Var);
    }
}
