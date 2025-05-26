package x72;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.f0;

/* loaded from: classes2.dex */
public final class c extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f134128j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f134129k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f134130l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(0);
        this.f134131i = i13;
    }

    public final b b() {
        switch (this.f134131i) {
            case 0:
                return new b(e.LEGACY, "Legacy", new f0(), new f0());
            case 1:
                return new b(e.XRENDERER_GLES, "XRenderer (GLES)", new ld2.i(), new vo.i(0));
            default:
                return new b(e.XRENDERER_VULKAN, "XRenderer (Vulkan)", new ld2.i(), new vo.i(1));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f134131i) {
        }
        return b();
    }
}
