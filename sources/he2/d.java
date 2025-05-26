package he2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f68968j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f68969k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f68970l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68971i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f68971i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f68971i) {
            case 0:
                m147invoke();
                break;
            case 1:
                m147invoke();
                break;
            default:
                m147invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m147invoke() {
        switch (this.f68971i) {
            case 0:
                GLES20.glPixelStorei(3333, 1);
                break;
            case 1:
                GLES20.glBindFramebuffer(yd2.b.DRAW.getGlValue(), 0);
                break;
            default:
                GLES20.glPixelStorei(3333, 1);
                break;
        }
    }
}
